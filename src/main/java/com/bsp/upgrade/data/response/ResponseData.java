package com.bsp.upgrade.data.response;

import lombok.Data;

import java.util.List;

@Data
public class ResponseData {
    private List<Object> AllTransactionsData;
    private List<Object> FullJourneyData;
    private List<Object>ServiceNamesData;
    private List<Object>KeyPathsData;
    private String LoginData;



}
