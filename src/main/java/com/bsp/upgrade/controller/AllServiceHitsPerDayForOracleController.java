package com.bsp.upgrade.controller;

import com.bsp.upgrade.data.helpers.ResponseHandler;
import com.bsp.upgrade.data.response.Response;
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
@Slf4j
@RequestMapping("/allHitsPerDayOracle")
public class AllServiceHitsPerDayForOracleController {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final ServiceRouting serviceRouter;

    public AllServiceHitsPerDayForOracleController(ServiceRouting serviceRouter) {
        this.serviceRouter = serviceRouter;
    }

    @GetMapping("/{databaseName}/{fromDate}/{toDate}")
    public Response AllServiceHitsPerDayForOracle(@PathVariable("databaseName") String databaseName,
                                                  @PathVariable("fromDate") String fromDate ,
                                                  @PathVariable("toDate") String toDate
    ) {
        logger.trace("Controller will serve func [{}] through DB [{}] with variables sent [{}]",
                "AllServiceHitsPerDayForOracle",databaseName,fromDate,toDate);
        List<Object> serviceNames = serviceRouter.allServiceHitsPerDayForOracle(fromDate,toDate, databaseName);
        return ResponseHandler.handleResponse(serviceNames, "ServiceHitsPerDayForOracle");
    }

}
