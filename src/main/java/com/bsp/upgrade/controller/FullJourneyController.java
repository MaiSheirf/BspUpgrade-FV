package com.bsp.upgrade.controller;

import java.util.List;
import com.bsp.upgrade.data.response.Response;
import com.bsp.upgrade.data.helpers.ResponseHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bsp.upgrade.service.ServiceRouting;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/FullJourney")
@Slf4j
public class FullJourneyController {

    @Autowired
    private ServiceRouting serviceRouter;

    @GetMapping("/{databaseName}/{gtx}")
    @JsonProperty

    public Response fullJourneyByGlobalTransactionId(@PathVariable("databaseName") String databaseName,
                                                     @PathVariable("gtx") String globalTransactionId) {
        List<Object> fullJourneyList = serviceRouter.fullJourneyByGlobalTransaction(globalTransactionId, databaseName);
        return ResponseHandler.handleResponse(fullJourneyList, "FullJourney");
    }
}

