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
@RequestMapping("/KeyPaths")
@Slf4j
public class KeyPathController {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private ServiceRouting serviceRouter;

    @GetMapping("/{databaseName}/{serviceName}")
    public Response allKeyPaths(@PathVariable("serviceName") String serviceName,
                                @PathVariable("databaseName") String databaseName

    ) {
        logger.trace("Controller will serve func [{}] through DB [{}] with variables sent [{}]",
                "allKeyPaths",databaseName,serviceName);
        List<Object> keyPaths = serviceRouter.allKeyPaths(serviceName, databaseName);
        return ResponseHandler.handleResponse(keyPaths, "KeyPaths");
    }
}
