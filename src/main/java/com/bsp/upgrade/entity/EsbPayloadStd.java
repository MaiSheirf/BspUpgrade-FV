package com.bsp.upgrade.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ESB_PAYLOAD_STD")
public class EsbPayloadStd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PAYLOAD_ID")
    @Lob
    private String payloadId;

    @Column(name = "PAYLOAD")
    private String payload;

    public EsbPayloadStd(String payload) {
        this.payload = payload;
    }

    public String getPayloadId() {
        return payloadId;
    }

    public void setPayloadId(String payloadId) {
        this.payloadId = payloadId;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "EsbPayloadStd{" +
                "payloadId='" + payloadId + '\'' +
                ", payload='" + payload + '\'' +
                '}';
    }
}

