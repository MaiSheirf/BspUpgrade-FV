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
@RequestMapping("/KeyPaths")
@Slf4j
public class KeyPathController {

    @Autowired
    private ServiceRouting serviceRouter;

    @GetMapping("/{databaseName}/{serviceName}")
    public Response allKeyPaths(@PathVariable("serviceName") String serviceName,
                                @PathVariable("databaseName") String databaseName

    ) {
        List<Object> keyPaths = serviceRouter.allKeyPaths(serviceName, databaseName);
        return ResponseHandler.handleResponse(keyPaths, "KeyPaths");
    }
}
