package com.bsp.upgrade.service;

import com.bsp.upgrade.config.SwitchDataSource;
import com.bsp.upgrade.repository.EntityRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ServiceRoutingStore {

    @Autowired
    private EntityRepo repo;

    @SwitchDataSource("DEV11")
    public List<Object> getServiceNamesForDev11(String serviceName) {
        return repo.getServiceNames(serviceName);
    }

    @SwitchDataSource("STAGE11")
    public List<Object> getServiceNamesForStage11(String serviceName) {
        return repo.getServiceNames(serviceName);
    }

    @SwitchDataSource("PROD11")
    public List<Object> getServiceNamesForProd11(String serviceName) {
        return repo.getServiceNames(serviceName);
    }

    @SwitchDataSource("DEV10")
    public List<Object> getServiceNamesForDev10(String serviceName) {
        return repo.getServiceNames(serviceName);
    }

    @SwitchDataSource("STAGE10")
    public List<Object> getServiceNamesForStage10(String serviceName) {
        return repo.getServiceNames(serviceName);
    }

    @SwitchDataSource("TEST10")
    public List<Object> getServiceNamesForTest10(String serviceName) {
        return repo.getServiceNames(serviceName);
    }

    @SwitchDataSource("PROD10")
    public List<Object> getServiceNamesForProd10(String serviceName) {
        return repo.getServiceNames(serviceName);
    }
    @SwitchDataSource("OLDPROD10")
    public List<Object> getServiceNamesForOldProd10(String serviceName) {
        return repo.getServiceNames(serviceName);
    }
    @SwitchDataSource("DEV12")
    public List<Object> getServiceNamesForDev12(String serviceName) {
        return repo.getServiceNames(serviceName);
    }

    @SwitchDataSource("STAGE12")
    public List<Object> getServiceNamesForStage12(String serviceName) {
        return repo.getServiceNames(serviceName);
    }

    @SwitchDataSource("PROD12")
    public List<Object> getServiceNamesForProd12(String serviceName) {
        return repo.getServiceNames(serviceName);
    }

    @SwitchDataSource("DEV11")
    public List<Object> fullJourneyByGlobalTransactionIDForDev11(String globalTransactionId) {
        return repo.fullJourneyByGlobalTransactionID(globalTransactionId);

    }

    @SwitchDataSource("STAGE11")
    public List<Object> fullJourneyByGlobalTransactionIDForStage11(String globalTransactionId) {
        return repo.fullJourneyByGlobalTransactionID(globalTransactionId);
    }

    @SwitchDataSource("PROD11")
    public List<Object> fullJourneyByGlobalTransactionIDForProd11(String globalTransactionId) {
        return repo.fullJourneyByGlobalTransactionID(globalTransactionId);
    }

    @SwitchDataSource("DEV10")
    public List<Object> fullJourneyByGlobalTransactionIDForDev10(String globalTransactionId) {
        return repo.fullJourneyByGlobalTransactionID(globalTransactionId);
    }

    @SwitchDataSource("STAGE10")
    public List<Object> fullJourneyByGlobalTransactionIDForStage10(String globalTransactionId) {
        return repo.fullJourneyByGlobalTransactionID(globalTransactionId);
    }

    @SwitchDataSource("TEST10")
    public List<Object> fullJourneyByGlobalTransactionIDForTest10(String globalTransactionId) {
        return repo.fullJourneyByGlobalTransactionID(globalTransactionId);
    }

    @SwitchDataSource("PROD10")
    public List<Object> fullJourneyByGlobalTransactionIDForProd10(String globalTransactionId) {
        return repo.fullJourneyByGlobalTransactionID(globalTransactionId);
    }
    @SwitchDataSource("OLDPROD10")
    public List<Object> fullJourneyByGlobalTransactionIDForOldProd10(String globalTransactionId) {
        return repo.fullJourneyByGlobalTransactionID(globalTransactionId);
    }

    @SwitchDataSource("DEV12")
    public List<Object> fullJourneyByGlobalTransactionIDForDev12(String globalTransactionId) {
        return repo.fullJourneyByGlobalTransactionID(globalTransactionId);

    }

    @SwitchDataSource("STAGE12")
    public List<Object> fullJourneyByGlobalTransactionIDForStage12(String globalTransactionId) {
        return repo.fullJourneyByGlobalTransactionID(globalTransactionId);
    }

    @SwitchDataSource("PROD12")
    public List<Object> fullJourneyByGlobalTransactionIDForProd12(String globalTransactionId) {
        return repo.fullJourneyByGlobalTransactionID(globalTransactionId);
    }

    @SwitchDataSource("DEV11")
    public List<Object> allGlobalTrxIdByDateAndServiceNameForDev11(String serviceName, String eventTime, String key1, String key2,
                                                                   String key3, String key4, String key5) {
        return repo.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime, key1, key2,
                key3, key4, key5);
    }

    @SwitchDataSource("STAGE11")
    public List<Object> allGlobalTrxIdByDateAndServiceNameForStage11(String serviceName, String eventTime, String key1, String key2,
                                                                     String key3, String key4, String key5) {
        return repo.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime, key1, key2,
                key3, key4, key5);
    }

    @SwitchDataSource("PROD11")
    public List<Object> allGlobalTrxIdByDateAndServiceNameForProd11(String serviceName, String eventTime, String key1, String key2,
                                                                    String key3, String key4, String key5) {
        return repo.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime, key1, key2,
                key3, key4, key5);
    }

    @SwitchDataSource("DEV10")
    public List<Object> allGlobalTrxIdByDateAndServiceNameForDev10(String serviceName, String eventTime, String key1, String key2,
                                                                   String key3, String key4, String key5) {
        return repo.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime, key1, key2,
                key3, key4, key5);
    }

    @SwitchDataSource("STAGE10")
    public List<Object> allGlobalTrxIdByDateAndServiceNameForStage10(String serviceName, String eventTime, String key1, String key2,
                                                                     String key3, String key4, String key5) {
        return repo.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime, key1, key2,
                key3, key4, key5);
    }

    @SwitchDataSource("TEST10")
    public List<Object> allGlobalTrxIdByDateAndServiceNameForTest10(String serviceName, String eventTime, String key1, String key2,
                                                                    String key3, String key4, String key5) {
        return repo.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime, key1, key2,
                key3, key4, key5);
    }

    @SwitchDataSource("PROD10")
    public List<Object> allGlobalTrxIdByDateAndServiceNameForProd10(String serviceName, String eventTime, String key1, String key2,
                                                                    String key3, String key4, String key5) {
        return repo.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime, key1, key2,
                key3, key4, key5);
    }
    @SwitchDataSource("OLDPROD10")
    public List<Object> allGlobalTrxIdByDateAndServiceNameForOldProd10(String serviceName, String eventTime, String key1, String key2,
                                                                       String key3, String key4, String key5) {
        return repo.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime, key1, key2,
                key3, key4, key5);
    }

    @SwitchDataSource("DEV12")
    public List<Object> allGlobalTrxIdByDateAndServiceNameForDev12(String serviceName, String eventTime, String key1, String key2,
                                                                   String key3, String key4, String key5) {
        return repo.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime, key1, key2,
                key3, key4, key5);
    }

    @SwitchDataSource("STAGE12")
    public List<Object> allGlobalTrxIdByDateAndServiceNameForStage12(String serviceName, String eventTime, String key1, String key2,
                                                                     String key3, String key4, String key5) {
        return repo.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime, key1, key2,
                key3, key4, key5);
    }

    @SwitchDataSource("PROD12")
    public List<Object> allGlobalTrxIdByDateAndServiceNameForProd12(String serviceName, String eventTime, String key1, String key2,
                                                                    String key3, String key4, String key5) {
        return repo.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime, key1, key2,
                key3, key4, key5);
    }

    @SwitchDataSource("DEV11")
    public List<Object> allKeyPathsForDev11(String serviceName) {
        return repo.allKeyPaths(serviceName);
    }

    @SwitchDataSource("STAGE11")
    public List<Object> allKeyPathsForStage11(String serviceName) {
        return repo.allKeyPaths(serviceName);
    }

    @SwitchDataSource("PROD11")
    public List<Object> allKeyPathsForProd11(String serviceName) {
        return repo.allKeyPaths(serviceName);
    }

    @SwitchDataSource("DEV10")
    public List<Object> allKeyPathsForDev10(String serviceName) {
        return repo.allKeyPaths(serviceName);
    }

    @SwitchDataSource("STAGE10")
    public List<Object> allKeyPathsForStage10(String serviceName) {
        return repo.allKeyPaths(serviceName);
    }

    @SwitchDataSource("TEST10")
    public List<Object> allKeyPathsForTest10(String serviceName) {
        return repo.allKeyPaths(serviceName);
    }

    @SwitchDataSource("PROD10")
    public List<Object> allKeyPathsForProd10(String serviceName) {
        return repo.allKeyPaths(serviceName);
    }

    @SwitchDataSource("OLDPROD10")
    public List<Object> allKeyPathsForOldProd10(String serviceName) {
        return repo.allKeyPaths(serviceName);
    }

    @SwitchDataSource("DEV12")
    public List<Object> allKeyPathsForDev12(String serviceName) {
        return repo.allKeyPaths(serviceName);
    }

    @SwitchDataSource("STAGE12")
    public List<Object> allKeyPathsForStage12(String serviceName) {
        return repo.allKeyPaths(serviceName);
    }

    @SwitchDataSource("PROD12")
    public List<Object> allKeyPathsForProd12(String serviceName) {
        return repo.allKeyPaths(serviceName);
    }

    @SwitchDataSource("DEV11")
    public List<Object> allServiceHitsPerDayForOracleForDev11(String fromDate , String toDate) {
        return repo.allServiceHitsPerDayForOracle(fromDate , toDate);
    }

    @SwitchDataSource("STAGE11")
    public List<Object> allServiceHitsPerDayForOracleForStage11(String fromDate , String toDate) {
        return repo.allServiceHitsPerDayForOracle(fromDate , toDate);
    }

    @SwitchDataSource("PROD11")
    public List<Object> allServiceHitsPerDayForOracleForProd11(String fromDate , String toDate) {
        return repo.allServiceHitsPerDayForOracle(fromDate , toDate);
    }

    @SwitchDataSource("DEV12")
    public List<Object> allServiceHitsPerDayForOracleForDev12(String fromDate , String toDate) {
        return repo.allServiceHitsPerDayForOracle(fromDate , toDate);
    }

    @SwitchDataSource("STAGE12")
    public List<Object> allServiceHitsPerDayForOracleForStage12(String fromDate , String toDate) {
        return repo.allServiceHitsPerDayForOracle(fromDate , toDate);
    }

    @SwitchDataSource("PROD12")
    public List<Object> allServiceHitsPerDayForOracleForProd12(String fromDate , String toDate) {
        return repo.allServiceHitsPerDayForOracle(fromDate , toDate);
    }


    @SwitchDataSource("DEV10")
    public List<Object> allServiceHitsPerDayForSqlForDev10(String fromDate , String toDate) {
        return repo.allServiceHitsPerDayForSql(fromDate , toDate);
    }

    @SwitchDataSource("STAGE10")
    public List<Object> allServiceHitsPerDayForSqlForStage10(String fromDate , String toDate) {
        return repo.allServiceHitsPerDayForSql(fromDate , toDate);
    }

    @SwitchDataSource("TEST10")
    public List<Object> allServiceHitsPerDayForSqlForTest10(String fromDate , String toDate) {
        return repo.allServiceHitsPerDayForSql(fromDate , toDate);
    }

    @SwitchDataSource("PROD10")
    public List<Object> allServiceHitsPerDayForSqlForProd10(String fromDate , String toDate) {
        return repo.allServiceHitsPerDayForSql(fromDate , toDate);
    }
    @SwitchDataSource("OLDPROD10")
    public List<Object> allServiceHitsPerDayForSqlForOldProd10(String fromDate , String toDate) {
        return repo.allServiceHitsPerDayForSql(fromDate , toDate);
    }


}
