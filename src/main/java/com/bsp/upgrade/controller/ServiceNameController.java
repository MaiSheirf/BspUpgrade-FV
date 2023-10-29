package com.bsp.upgrade.controller;

import com.bsp.upgrade.entity.data.Response;
import com.bsp.upgrade.entity.data.helpers.ResponseHandler;
import com.bsp.upgrade.service.ServiceRouting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ServiceNames")
@Slf4j
public class ServiceNameController {

    @Autowired
    private ServiceRouting serviceRouter;

    @GetMapping("/{databaseName}/{serviceName}")
    public Response getServiceName(@PathVariable("databaseName") String databaseName,
                                   @PathVariable("serviceName") String serviceName
    ) {


        serviceName = "%" + serviceName + "%";
        List<Object> serviceNames = serviceRouter.getServiceNames(serviceName, databaseName);
        return ResponseHandler.handleResponse(serviceNames, "ServiceNames");
    }


}


