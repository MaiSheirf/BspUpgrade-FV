package com.bsp.upgrade.entity;

import org.hibernate.engine.jdbc.ClobProxy;

import java.io.InputStream;

public interface FullJourney {
    String getPayloadData() ;
    String getPayloadDataErr() ;
    String getPayloadId();
    String getServiceName();
    String getEventTime();
    String getEventKey1();
    String getEventKey2();
    String getEventKey3();
    String getEventKey4();
    String getEventKey5();
    String getEventStatus();
}
