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
        switch (dataBaseName.toLowerCase()) {
            case "dev11":
                serviceNames = ServiceRoutingStore.getServiceNamesForDev11(regex);
                break;
            case "stage11":
                serviceNames = ServiceRoutingStore.getServiceNamesForStage11(regex);
                break;
            case "prod11":
                serviceNames = ServiceRoutingStore.getServiceNamesForProd11(regex);
                break;
            default:
                throw new IllegalArgumentException("Invalid database name: " + dataBaseName);
        }
        return serviceNames;
    }

    @Override
    public  List<Object> fullJourneyByGlobalTransaction(String globalTransactionId, String databaseName) {
        List<Object> fullGourneyList = new ArrayList<>();
        switch (databaseName.toLowerCase()) {
            case "dev11":
                fullGourneyList = ServiceRoutingStore.fullJourneyByGlobalTransactionIDForDev11(globalTransactionId);
                break;
            case "stage11":
                fullGourneyList = ServiceRoutingStore.fullJourneyByGlobalTransactionIDForStage11(globalTransactionId);
                break;
            case "prod11":
                fullGourneyList = ServiceRoutingStore.fullJourneyByGlobalTransactionIDForProd11(globalTransactionId);
                break;
            default:
                throw new IllegalArgumentException("Invalid database name: " + databaseName);
        }
        return fullGourneyList;
    }

    @Override
    public List<Object> allGlobalTrxIdByDateAndServiceName(String serviceName, String eventTime, String databaseName) {
        List<Object> allGlobalTRX = new ArrayList<>();
        switch (databaseName.toLowerCase()) {
            case "dev11":
                allGlobalTRX = ServiceRoutingStore.allGlobalTrxIdByDateAndServiceNameForDev11(serviceName, eventTime);
                break;
            case "stage11":
                allGlobalTRX = ServiceRoutingStore.allGlobalTrxIdByDateAndServiceNameForStage11(serviceName, eventTime);
                break;
            case "prod11":
                allGlobalTRX = ServiceRoutingStore.allGlobalTrxIdByDateAndServiceNameForProd11(serviceName, eventTime);
                break;
            default:
                throw new IllegalArgumentException("Invalid database name: " + databaseName);
        }
        return allGlobalTRX;
    }

    @Override
    public List<Object> allKeyPaths(String serviceName, String datbaseName) {
        List<Object> allKeyPaths = new ArrayList<>();
        switch (datbaseName.toLowerCase()) {
            case "dev11":
                allKeyPaths = ServiceRoutingStore.allKeyPathsForDev11(serviceName);
                break;
            case "stage11":
                allKeyPaths = ServiceRoutingStore.allKeyPathsForStage11(serviceName);
                break;
            case "prod11":
                allKeyPaths = ServiceRoutingStore.allKeyPathsForProd11(serviceName);
                break;
            default:
                throw new IllegalArgumentException("Invalid database name: " + datbaseName);
        }
        return allKeyPaths;
    }


}



