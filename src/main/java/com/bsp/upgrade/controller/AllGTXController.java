package com.bsp.upgrade.controller;

import com.bsp.upgrade.data.response.Response;
import com.bsp.upgrade.data.helpers.ResponseHandler;
import com.bsp.upgrade.service.ServiceRouting;
import lombok.extern.slf4j.Slf4j;
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

    @Autowired
    private ServiceRouting serviceRouter;

    @GetMapping("/{databaseName}/{serviceName}/{eventTime}")
    public Response allGlobalTrxByDateAndServiceName(@PathVariable("databaseName") String databaseName, @PathVariable("serviceName") String serviceName, @PathVariable("eventTime") String eventTime) {
        List<Object> allTransactionList = serviceRouter.allGlobalTrxIdByDateAndServiceName(serviceName, eventTime, databaseName);
        return ResponseHandler.handleResponse(allTransactionList, "AllTransactions");


    }
}
