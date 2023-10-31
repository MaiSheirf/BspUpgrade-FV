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

    @SwitchDataSource("PROD10")
    public List<Object> getServiceNamesForProd10(String serviceName) {
        return repo.getServiceNames(serviceName);
    }

    @SwitchDataSource("DEV11")
    public List<Object> fullJourneyByGlobalTransactionIDForDev11(String globalTransactionId) {
        return repo.fullJourneyByGlobalTransactionID(globalTransactionId);

    }

    @SwitchDataSource("STAGE11")
    public  List<Object> fullJourneyByGlobalTransactionIDForStage11(String globalTransactionId) {
        return repo.fullJourneyByGlobalTransactionID(globalTransactionId);
    }

    @SwitchDataSource("PROD11")
    public  List<Object> fullJourneyByGlobalTransactionIDForProd11(String globalTransactionId) {
        return repo.fullJourneyByGlobalTransactionID(globalTransactionId);
    }

    @SwitchDataSource("DEV10")
    public List<Object> fullJourneyByGlobalTransactionIDForDev10(String globalTransactionId) {
        return repo.fullJourneyByGlobalTransactionID(globalTransactionId);
    }

    @SwitchDataSource("STAGE10")
    public  List<Object> fullJourneyByGlobalTransactionIDForStage10(String globalTransactionId) {
        return repo.fullJourneyByGlobalTransactionID(globalTransactionId);
    }

    @SwitchDataSource("PROD10")
    public  List<Object> fullJourneyByGlobalTransactionIDForProd10(String globalTransactionId) {
        return repo.fullJourneyByGlobalTransactionID(globalTransactionId);
    }

    @SwitchDataSource("DEV11")
    public List<Object> allGlobalTrxIdByDateAndServiceNameForDev11(String serviceName, String eventTime ,String key1 ,String key2 ,
                                                                   String key3 , String key4 , String key5 ) {
        return repo.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime , key1 ,key2 ,
                key3 ,  key4 ,  key5);
    }

    @SwitchDataSource("STAGE11")
    public List<Object> allGlobalTrxIdByDateAndServiceNameForStage11(String serviceName, String eventTime ,String key1 ,String key2 ,
                                                                     String key3 , String key4 , String key5 ) {
        return repo.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime , key1 ,key2 ,
                key3 ,  key4 ,  key5);
    }

    @SwitchDataSource("PROD11")
    public List<Object> allGlobalTrxIdByDateAndServiceNameForProd11(String serviceName, String eventTime ,String key1 ,String key2 ,
                                                                    String key3 , String key4 , String key5 ) {
        return repo.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime , key1 ,key2 ,
                key3 ,  key4 ,  key5);
    }

    @SwitchDataSource("DEV10")
    public List<Object> allGlobalTrxIdByDateAndServiceNameForDev10(String serviceName, String eventTime ,String key1 ,String key2 ,
                                                                   String key3 , String key4 , String key5 ) {
        return repo.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime , key1 ,key2 ,
                key3 ,  key4 ,  key5);
    }

    @SwitchDataSource("STAGE10")
    public List<Object> allGlobalTrxIdByDateAndServiceNameForStage10(String serviceName, String eventTime ,String key1 ,String key2 ,
                                                                     String key3 , String key4 , String key5 ) {
        return repo.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime , key1 ,key2 ,
                key3 ,  key4 ,  key5);
    }

    @SwitchDataSource("PROD10")
    public List<Object> allGlobalTrxIdByDateAndServiceNameForProd10(String serviceName, String eventTime ,String key1 ,String key2 ,
                                                                    String key3 , String key4 , String key5 ) {
        return repo.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime , key1 ,key2 ,
                key3 ,  key4 ,  key5);
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

    @SwitchDataSource("PROD10")
    public List<Object> allKeyPathsForProd10(String serviceName) {
        return repo.allKeyPaths(serviceName);
    }
}
