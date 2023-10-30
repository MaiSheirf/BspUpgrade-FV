package com.bsp.upgrade.controller;

import com.bsp.upgrade.data.response.Response;
import com.bsp.upgrade.data.response.ResponseData;
import com.bsp.upgrade.data.response.ResponseStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@Slf4j
public class LoginController {

    @GetMapping("/{username}/{password}")
    public Response doLogin(@PathVariable("username") String username, @PathVariable("password") String password) {
        Response response = new Response();
        ResponseData responseData = new ResponseData();
        ResponseStatus status = new ResponseStatus("100", "Success");
        if (username.equals("admin") && password.equals("admin")) {
            responseData.setLoginData("Success");
        } else {
            status.setCode("102");
            status.setMsg("Invalid Username or Password");
            responseData.setLoginData("Fail");
        }
        response.setResponseStatus(status);
        response.setResponseData(responseData);

        return response;
    }
}
