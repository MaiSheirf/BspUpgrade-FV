package com.bsp.upgrade.controller;

import com.bsp.upgrade.entity.FullJourney;
import com.bsp.upgrade.entity.data.Response;
import com.bsp.upgrade.entity.data.helpers.ResponseHandler;
import com.bsp.upgrade.service.ServiceRouting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/FullJourney")
@Slf4j
public class FullJourneyController {

    @Autowired
    private ServiceRouting serviceRouter;

    @GetMapping("/{databaseName}/{gtx}")
    public  Object fullJourneyByGlobalTransactionId(@PathVariable("databaseName") String databaseName, @PathVariable("gtx") String globalTransactionId) {
        Object fullJourneyList = serviceRouter.fullJourneyByGlobalTransaction(globalTransactionId, databaseName);
      //  List<Object> testData = Collections.singletonList(fullJourneyList);
        return fullJourneyList; //ResponseHandler.handleResponse(testData, "FullJourney");
    }
}
