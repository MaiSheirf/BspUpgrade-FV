package com.bsp.upgrade.controller;

import com.bsp.upgrade.data.helpers.ResponseHandler;
import com.bsp.upgrade.data.response.Response;
import com.bsp.upgrade.service.ServiceRouting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/MobileServiceNames")
public class MobileServiceNameController {

    private final ServiceRouting serviceRouting;

    public MobileServiceNameController(ServiceRouting serviceRouting) {
        this.serviceRouting = serviceRouting;
    }

    @GetMapping("/{databaseName}/{serviceName}")
    public ResponseEntity<Response> getServiceName(@PathVariable("databaseName") String databaseName,
                                                   @PathVariable("serviceName") String serviceName) {
        List<Object> serviceNames = serviceRouting.getAllMobileServices(serviceName, databaseName);
        return ResponseEntity.ok(ResponseHandler.handleResponse(serviceNames, "ServiceNames"));
    }
}
