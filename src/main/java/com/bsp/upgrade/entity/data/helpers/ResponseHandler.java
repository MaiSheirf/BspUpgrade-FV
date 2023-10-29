package com.bsp.upgrade.entity.data.helpers;

import com.bsp.upgrade.entity.data.Response;
import com.bsp.upgrade.entity.data.ResponseData;
import com.bsp.upgrade.entity.data.ResponseStatus;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j

public class ResponseHandler {

    public static Response handleResponse(List<Object> data, String serviceName) {
        Response response = new Response();
        ResponseData responseData = generateServiceResponseData(data, serviceName);
        ResponseStatus status = new ResponseStatus("100", "Success");

        System.out.println(" data is  >>>>>>>>>>>>>>>>>>>>>>>>>>> " + data.size() );
        System.out.println(" data is  >>>>>>>>>>>>>>>>>>>>>>>>>>> " +data.isEmpty());
        if (data.isEmpty() || data.size() == 0) {
            // set empty error code Status
            status.setCode("101");
            status.setMsg("NO Data Found");
        }
        response.setResponseStatus(status);
        response.setResponseData(responseData);
        return response;
    }

    private static ResponseData generateServiceResponseData(List<Object> data, String serviceName) {
        ResponseData responseData = new ResponseData();
        if (serviceName.equals("ServiceNames")) {
            responseData.setServiceNamesData(data);
        }
        if (serviceName.equals("KeyPaths")) {
            responseData.setKeyPathsData(data);
        }
        if (serviceName.equals("AllTransactions")) {
            responseData.setAllTransactionsData(data);
        }
        if (serviceName.equals("FullJourney")) {
            responseData.setFullJourneyData(data);
        }

        return responseData;
    }
}
