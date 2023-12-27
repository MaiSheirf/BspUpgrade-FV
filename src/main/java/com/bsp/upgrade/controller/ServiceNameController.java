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
@RequestMapping("/ServiceNames")
public class ServiceNameController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final ServiceRouting serviceRouter;

    public ServiceNameController(ServiceRouting serviceRouter) {
        this.serviceRouter = serviceRouter;
    }

    @GetMapping("/{databaseName}/{serviceName}")
    public Response getServiceName(@PathVariable("databaseName") String databaseName,
                                   @PathVariable("serviceName") String serviceName
    ) {
        logger.trace("Controller will serve func [{}] through DB [{}] with variables sent [{}]",
                "ServiceNames",databaseName,serviceName);
        serviceName = "%" + serviceName + "%";
        List<Object> serviceNames = serviceRouter.getServiceNames(serviceName, databaseName);
        return ResponseHandler.handleResponse(serviceNames, "ServiceNames");
    }


}


