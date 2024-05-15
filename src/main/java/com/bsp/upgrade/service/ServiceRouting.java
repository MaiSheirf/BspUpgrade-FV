package com.bsp.upgrade.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Slf4j
@Configuration
@ComponentScan
public class ServiceRouting implements ServiceList {
    @Autowired
    private ServiceRoutingStore ServiceRoutingStore;

    @Override
    public List<Object> getServiceNames(String regex, String dataBaseName) {
        List<Object> serviceNames = new ArrayList<>();
        switch (dataBaseName.toUpperCase()) {
            case "DEV11":
                serviceNames = ServiceRoutingStore.getServiceNamesForDev11(regex);
                break;
            case "STAGE11":
                serviceNames = ServiceRoutingStore.getServiceNamesForStage11(regex);
                break;
            case "PROD11":
                serviceNames = ServiceRoutingStore.getServiceNamesForProd11(regex);
                break;
            case "DEV10":
                serviceNames = ServiceRoutingStore.getServiceNamesForDev10(regex);
                break;
            case "STAGE10":
                serviceNames = ServiceRoutingStore.getServiceNamesForStage10(regex);
                break;
            case "TEST10":
                serviceNames = ServiceRoutingStore.getServiceNamesForTest10(regex);
                break;
            case "PROD10":
                serviceNames = ServiceRoutingStore.getServiceNamesForProd10(regex);
                break;
            case "OLDPROD10":
                serviceNames = ServiceRoutingStore.getServiceNamesForOldProd10(regex);
                break;
            case "DEV12":
                serviceNames = ServiceRoutingStore.getServiceNamesForDev12(regex);
                break;
            case "STAGE12":
                serviceNames = ServiceRoutingStore.getServiceNamesForStage12(regex);
                break;
            case "PROD12":
                serviceNames = ServiceRoutingStore.getServiceNamesForProd12(regex);
                break;
            default:
                throw new IllegalArgumentException("Invalid database name: " + dataBaseName);
        }
        return serviceNames;
    }

    @Override
    public List<Object> fullJourneyByGlobalTransaction(String globalTransactionId, String databaseName) {
        List<Object> fullGourneyList = new ArrayList<>();
        switch (databaseName.toUpperCase()) {
            case "DEV11":
                fullGourneyList = ServiceRoutingStore.fullJourneyByGlobalTransactionIDForDev11(globalTransactionId);
                break;
            case "STAGE11":
                fullGourneyList = ServiceRoutingStore.fullJourneyByGlobalTransactionIDForStage11(globalTransactionId);
                break;
            case "PROD11":
                fullGourneyList = ServiceRoutingStore.fullJourneyByGlobalTransactionIDForProd11(globalTransactionId);
                break;
            case "DEV10":
                fullGourneyList = ServiceRoutingStore.fullJourneyByGlobalTransactionIDForDev10(globalTransactionId);
                break;
            case "STAGE10":
                fullGourneyList = ServiceRoutingStore.fullJourneyByGlobalTransactionIDForStage10(globalTransactionId);
                break;
            case "TEST10":
                fullGourneyList = ServiceRoutingStore.fullJourneyByGlobalTransactionIDForTest10(globalTransactionId);
                break;
            case "PROD10":
                fullGourneyList = ServiceRoutingStore.fullJourneyByGlobalTransactionIDForProd10(globalTransactionId);
                break;
            case "OLDPROD10":
                fullGourneyList = ServiceRoutingStore.fullJourneyByGlobalTransactionIDForOldProd10(globalTransactionId);
                break;
            case "DEV12":
                fullGourneyList = ServiceRoutingStore.fullJourneyByGlobalTransactionIDForDev12(globalTransactionId);
                break;
            case "STAGE12":
                fullGourneyList = ServiceRoutingStore.fullJourneyByGlobalTransactionIDForStage12(globalTransactionId);
                break;
            case "PROD12":
                fullGourneyList = ServiceRoutingStore.fullJourneyByGlobalTransactionIDForProd12(globalTransactionId);
                break;
            default:
                throw new IllegalArgumentException("Invalid database name: " + databaseName);
        }
        return fullGourneyList;
    }

    @Override
    public List<Object> allGlobalTrxIdByDateAndServiceName(String serviceName, String eventTime, String key1, String key2,
                                                           String key3, String key4, String key5, String databaseName) {
        List<Object> allGlobalTRX = new ArrayList<>();
        switch (databaseName.toUpperCase()) {
            case "DEV11":
                allGlobalTRX = ServiceRoutingStore.allGlobalTrxIdByDateAndServiceNameForDev11(serviceName, eventTime, key1, key2,
                        key3, key4, key5);
                break;
            case "STAGE11":
                allGlobalTRX = ServiceRoutingStore.allGlobalTrxIdByDateAndServiceNameForStage11(serviceName, eventTime, key1, key2,
                        key3, key4, key5);
                break;
            case "PROD11":
                allGlobalTRX = ServiceRoutingStore.allGlobalTrxIdByDateAndServiceNameForProd11(serviceName, eventTime, key1, key2,
                        key3, key4, key5);
                break;
            case "DEV10":
                allGlobalTRX = ServiceRoutingStore.allGlobalTrxIdByDateAndServiceNameForDev10(serviceName, eventTime, key1, key2,
                        key3, key4, key5);
                break;
            case "STAGE10":
                allGlobalTRX = ServiceRoutingStore.allGlobalTrxIdByDateAndServiceNameForStage10(serviceName, eventTime, key1, key2,
                        key3, key4, key5);
                break;
            case "TEST10":
                allGlobalTRX = ServiceRoutingStore.allGlobalTrxIdByDateAndServiceNameForTest10(serviceName, eventTime, key1, key2,
                        key3, key4, key5);
                break;
            case "PROD10":
                allGlobalTRX = ServiceRoutingStore.allGlobalTrxIdByDateAndServiceNameForProd10(serviceName, eventTime, key1, key2,
                        key3, key4, key5);
                break;
            case "OLDPROD10":
                allGlobalTRX = ServiceRoutingStore.allGlobalTrxIdByDateAndServiceNameForOldProd10(serviceName, eventTime, key1, key2,
                        key3, key4, key5);
                break;
            case "DEV12":
                allGlobalTRX = ServiceRoutingStore.allGlobalTrxIdByDateAndServiceNameForDev12(serviceName, eventTime, key1, key2,
                        key3, key4, key5);
                break;
            case "STAGE12":
                allGlobalTRX = ServiceRoutingStore.allGlobalTrxIdByDateAndServiceNameForStage12(serviceName, eventTime, key1, key2,
                        key3, key4, key5);
                break;
            case "PROD12":
                allGlobalTRX = ServiceRoutingStore.allGlobalTrxIdByDateAndServiceNameForProd12(serviceName, eventTime, key1, key2,
                        key3, key4, key5);
                break;
            default:
                throw new IllegalArgumentException("Invalid database name: " + databaseName);
        }
        return allGlobalTRX;
    }

    @Override
    public List<Object> allKeyPaths(String serviceName, String datbaseName) {
        List<Object> allKeyPaths = new ArrayList<>();
        switch (datbaseName.toUpperCase()) {
            case "DEV11":
                allKeyPaths = ServiceRoutingStore.allKeyPathsForDev11(serviceName);
                break;
            case "STAGE11":
                allKeyPaths = ServiceRoutingStore.allKeyPathsForStage11(serviceName);
                break;
            case "PROD11":
                allKeyPaths = ServiceRoutingStore.allKeyPathsForProd11(serviceName);
                break;
            case "DEV10":
                allKeyPaths = ServiceRoutingStore.allKeyPathsForDev10(serviceName);
                break;
            case "STAGE10":
                allKeyPaths = ServiceRoutingStore.allKeyPathsForStage10(serviceName);
                break;
            case "TEST10":
                allKeyPaths = ServiceRoutingStore.allKeyPathsForTest10(serviceName);
                break;
            case "PROD10":
                allKeyPaths = ServiceRoutingStore.allKeyPathsForProd10(serviceName);
                break;
            case "OLDPROD10":
                allKeyPaths = ServiceRoutingStore.allKeyPathsForOldProd10(serviceName);
                break;
            case "DEV12":
                allKeyPaths = ServiceRoutingStore.allKeyPathsForDev12(serviceName);
                break;
            case "STAGE12":
                allKeyPaths = ServiceRoutingStore.allKeyPathsForStage12(serviceName);
                break;
            case "PROD12":
                allKeyPaths = ServiceRoutingStore.allKeyPathsForProd12(serviceName);
                break;
            default:
                throw new IllegalArgumentException("Invalid database name: " + datbaseName);
        }
        return allKeyPaths;
    }
    @Override
    public List<Object> allServiceHitsPerDayForOracle(String fromDate, String toDate, String databaseName) {
        List<Object> allServiceHitsPerDayForOracle = new ArrayList<>();
        switch (databaseName.toUpperCase()) {
            case "DEV11":
                allServiceHitsPerDayForOracle = ServiceRoutingStore.allServiceHitsPerDayForOracleForDev11(fromDate , toDate);
                break;
            case "STAGE11":
                allServiceHitsPerDayForOracle = ServiceRoutingStore.allServiceHitsPerDayForOracleForStage11(fromDate , toDate);
                break;
            case "PROD11":
                allServiceHitsPerDayForOracle = ServiceRoutingStore.allServiceHitsPerDayForOracleForProd11(fromDate , toDate);
                break;

            case "DEV12":
                allServiceHitsPerDayForOracle = ServiceRoutingStore.allServiceHitsPerDayForOracleForDev12(fromDate , toDate);
                break;
            case "STAGE12":
                allServiceHitsPerDayForOracle = ServiceRoutingStore.allServiceHitsPerDayForOracleForStage12(fromDate , toDate);
                break;
            case "PROD12":
                allServiceHitsPerDayForOracle = ServiceRoutingStore.allServiceHitsPerDayForOracleForProd12(fromDate , toDate);
                break;
            default:
                throw new IllegalArgumentException("Invalid database name: " + databaseName);
        }
        return allServiceHitsPerDayForOracle;
    }

    @Override
    public List<Object> allServiceHitsPerDayForSql(String fromDate, String toDate, String databaseName) {
        List<Object> allServiceHitsPerDayForSql = new ArrayList<>();
        switch (databaseName.toUpperCase()) {

            case "DEV10":
                allServiceHitsPerDayForSql = ServiceRoutingStore.allServiceHitsPerDayForSqlForDev10(fromDate , toDate);
                break;
            case "STAGE10":
                allServiceHitsPerDayForSql = ServiceRoutingStore.allServiceHitsPerDayForSqlForStage10(fromDate , toDate);
                break;
            case "TEST10":
                allServiceHitsPerDayForSql = ServiceRoutingStore.allServiceHitsPerDayForSqlForTest10(fromDate , toDate);
                break;
            case "PROD10":
                allServiceHitsPerDayForSql = ServiceRoutingStore.allServiceHitsPerDayForSqlForProd10(fromDate , toDate);
                break;
            case "OLDPROD10":
                allServiceHitsPerDayForSql = ServiceRoutingStore.allServiceHitsPerDayForSqlForOldProd10(fromDate , toDate);
                break;

            default:
                throw new IllegalArgumentException("Invalid database name: " + databaseName);
        }
        return allServiceHitsPerDayForSql;
    }



}



