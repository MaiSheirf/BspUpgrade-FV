package com.bsp.upgrade.controller;

import com.bsp.upgrade.data.response.Response;
import com.bsp.upgrade.data.helpers.ResponseHandler;
import com.bsp.upgrade.service.ServiceRouting;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/AllTransactions")
@Slf4j
public class AllGTXController {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private ServiceRouting serviceRouter;

    @GetMapping("/{databaseName}/{serviceName}/{eventTime}/{key1}/{key2}/{key3}/{key4}/{key5}")
    public Response allGlobalTrxByDateAndServiceName(@PathVariable("databaseName") String databaseName, @PathVariable("serviceName") String serviceName, @PathVariable("eventTime") String eventTime , @PathVariable("key1") String key1 , @PathVariable("key2") String key2 ,
                                                     @PathVariable("key3") String key3 ,@PathVariable("key4") String key4 ,
                                                     @PathVariable("key5") String key5) {

        logger.trace("Controller will serve func [{}] through DB [{}] with variables sent [{}] , [{}] , [{}] , [{}] , [{}] , [{}] , [{}]",
                "allGlobalTrx", databaseName, serviceName, eventTime, key1, key2,
                key3, key4, key5);

        // eventTime = eventTime + "%" ;
        if (key1.equals("NA")){
            key1 = null;
        }
        if (key2.equals("NA")) {
            key2 = null;
        }
        if (key3.equals("NA")) {
            key3 = null;
        }
        if (key4.equals("NA")) {
            key4 = null;
        }
        if (key5.equals("NA")) {
            key5 = null;
        }

      /*  if ("NA".equals(key1)) {
            key1 = null;
        }
        if ("NA".equals(key2)) {
            key2 = null;
        }
        if ("NA".equals(key3)) {
            key3 = null;
        }
        if ("NA".equals(key4)) {
            key4 = null;
        }
        if ("NA".equals(key5)) {
            key5 = null;
        }*/


  /*      if (key1 == null && key2 == null && key3 == null && key4 == null && key5 == null) {
            List<Object> allTransactionList = serviceRouter.allGlobalTrxIdByDateAndServiceName(
                    serviceName, eventTime, key1, key2, key3, key4, key5, databaseName);

            return ResponseHandler.handleResponse(allTransactionList, "AllTransactions");
        } else {

            List<Object> allTransactionList = serviceRouter.allGlobalTrxIdByDateAndServiceName(
                    serviceName, eventTime, key1, key2, key3, key4, key5, databaseName);

            return ResponseHandler.handleResponse(allTransactionList, "AllTransactions");
        }*/


        List<Object> allTransactionList = serviceRouter.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime ,key1 , key2 ,
                key3 ,  key4 ,  key5 , databaseName);

        return ResponseHandler.handleResponse(allTransactionList, "AllTransactions");

    }
    }
