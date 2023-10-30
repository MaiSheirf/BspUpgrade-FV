package com.bsp.upgrade.repository;

import com.bsp.upgrade.entity.EsbServiceInf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface EntityRepo extends JpaRepository<EsbServiceInf, String> {

    @Query(value = "select distinct  serviceName from EsbServiceInf where " +
            "UPPER(serviceName) like  UPPER(?1) and isReadable=1 order by 1 asc "
            )
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

    @Query(value = "SELECT DISTINCT\n" +
            "    tx.global_transaction_id   requestid,\n" +
            "    tx.start_time              reguesttime\n" +
            "FROM\n" +
            "    esb_service_trx tx,\n" +
            "    (\n" +
            "        SELECT DISTINCT\n" +
            "            sertrans.global_transaction_id globaltransaction\n" +
            "        FROM\n" +
            "            esb_service_evt   sereve\n" +
            "            INNER JOIN esb_service_inf   serinfo ON sereve.service_id = serinfo.service_id\n" +
            "            INNER JOIN esb_service_trx   sertrans ON sereve.transaction_id = sertrans.transaction_id\n" +
            "        WHERE\n" +
            "            1 = 1\n" +
            "            AND upper(serinfo.service_name) = upper(?1)\n" +
            "            AND sereve.event_time LIKE ?2 \n" +
            "            AND ( sereve.event_key1 = ?3\n" +
            "                  OR ?3 IS NULL )\n" +
            "            AND ( sereve.event_key2 = ?4\n" +
            "                  OR ?4 IS NULL )\n" +
            "            AND ( sereve.event_key3 = ?5\n" +
            "                  OR ?5 IS NULL )\n" +
            "            AND ( sereve.event_key4 = ?6\n" +
            "                  OR ?6 IS NULL )\n" +
            "            AND ( sereve.event_key5 = ?7\n" +
            "                  OR ?7 IS NULL )\n" +
            "    ) gtx\n" +
            "WHERE\n" +
            "    gtx.globaltransaction = tx.transaction_id\n" +
            "ORDER BY\n" +
            "    reguesttime DESC" , nativeQuery = true)
    List<Object> allGlobalTrxIdByDateAndServiceName(String serviceName, String eventTime ,String key1 ,String key2 ,
                                                    String key3 , String key4 , String key5);

    @Query(value = "SELECT inf.serviceName,inf.serviceOperation,inf.key1Path,inf.key2Path,inf.key3Path,inf.key4Path,\n" +
            "inf.key5Path FROM EsbServiceInf inf\n" +
            "WHERE  upper(inf.serviceName) = UPPER(?1)")
    List<Object> allKeyPaths(String serviceName);


}
