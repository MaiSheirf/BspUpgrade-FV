package com.bsp.upgrade.repository;

import com.bsp.upgrade.entity.EsbServiceInf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface EntityRepo extends JpaRepository<EsbServiceInf, String> {

    @Query(value = "select distinct service_name serviceName from ESB_SERVICE_INF where UPPER(service_name) like  UPPER(?1) and isReadable=1 order by 1 asc ",
            nativeQuery = true)
    List<Object> getServiceNames(String serviceName);

    @Query(value = "select std.payload , err.payload , serEve.payloadId ," +
            " serEve.serviceId  , serEve.eventTIme , serEve.eventKey1 ," +
            " serEve.eventKey2 , serEve.eventKey3 , serEve.eventKey4 , " +
            "serEve.eventKey5 , serEve.eventStatus   " +
            "from  EsbServiceEvt serEve inner join EsbServiceTrx trans on " +
            "trans.trancactionId = serEve.transactionId left outer JOIN " +
            "EsbPayloadStd std ON serEve.payloadId = std.payloadId left outer join " +
            "EsbPaylodErr err on serEve.payloadId = err.payloadId where " +
            "trans.globalTransactionId = ?1 order by serEve.eventTIme asc ")
    List<Object> fullJourneyByGlobalTransactionID(String globalTransactionId);

    @Query(value = "select distinct tx.GLOBAL_TRANSACTION_ID RequestId , tx.START_TIME ReguestTime from " +
            "ESB_SERVICE_TRX tx ,(select distinct serTrans.GLOBAL_TRANSACTION_ID globalTransaction from " +
            " ESB_SERVICE_EVT serEve inner join ESB_SERVICE_INF serInfo on " +
            "serEve.SERVICE_ID = serInfo.SERVICE_ID  inner join ESB_SERVICE_TRX serTrans on " +
            "serEve.TRANSACTION_ID = serTrans.TRANSACTION_ID  where 1=1 and Upper(serInfo.SERVICE_NAME) =Upper(?1)" +
            " and serEve.EVENT_TIME like ?2 ||'%')GTX where  GTX.globalTransaction = tx.TRANSACTION_ID " +
            "order by ReguestTime desc", nativeQuery = true)
    List<Object> allGlobalTrxIdByDateAndServiceName(String serviceName, String eventTime);

    @Query(value = "SELECT inf.service_name,inf.service_operation,inf.service_key1_path,inf.service_key2_path,inf.service_key3_path,inf.service_key4_path,\n" +
            "inf.service_key5_path FROM esb_service_inf inf\n" +
            "WHERE  upper(inf.service_name) = UPPER(?1)", nativeQuery = true)
    List<Object> allKeyPaths(String serviceName);


}
