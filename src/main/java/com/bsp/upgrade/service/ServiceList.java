package com.bsp.upgrade.service;


import java.util.List;

public interface ServiceList {

    List<Object> getServiceNames(String regex, String databaseName);

   List<Object> fullJourneyByGlobalTransaction(String globalTransactionId , String databaseName);

    List<Object> allGlobalTrxIdByDateAndServiceName(String serviceName, String eventTime ,String key1 ,String key2 ,
                                                    String key3 , String key4 , String key5 ,String databaseName);
    List<Object> allKeyPaths(String serviceName ,String databaseName);


}
