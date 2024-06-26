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
    private List<Object>ServiceHitsPerDay;



    public List<Object> getServiceHitsPerDay() {
        return ServiceHitsPerDay;
    }
    public void setServiceHitsPerDay(List<Object> serviceHitsPerDay) {
        ServiceHitsPerDay = serviceHitsPerDay;
    }

    public List<Object> getAllTransactionsData() {
        return AllTransactionsData;
    }
    public void setAllTransactionsData(List<Object> allTransactionsData) {
        AllTransactionsData = allTransactionsData;
    }
    public List<Object> getFullJourneyData() {
        return FullJourneyData;
    }
    public void setFullJourneyData(List<Object> fullJourneyData) {
        FullJourneyData = fullJourneyData;
    }
    public List<Object> getServiceNamesData() {
        return ServiceNamesData;
    }
    public void setServiceNamesData(List<Object> serviceNamesData) {
        ServiceNamesData = serviceNamesData;
    }
    public List<Object> getKeyPathsData() {
        return KeyPathsData;
    }
    public void setKeyPathsData(List<Object> keyPathsData) {
        KeyPathsData = keyPathsData;
    }
    public String getLoginData() {
        return LoginData;
    }
    public void setLoginData(String loginData) {
        LoginData = loginData;
    }


}
