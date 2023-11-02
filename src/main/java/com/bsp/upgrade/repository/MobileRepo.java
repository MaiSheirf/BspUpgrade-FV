package com.bsp.upgrade.repository;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MobileRepo {
    private static final String GET_ALL_SERVICES =
            "SELECT service_name AS serviceName FROM iib1.ESB_SERVICES WHERE BACKEND_SYSTEM_ID='ESB' " +
                    "AND UPPER(service_name) LIKE UPPER(CONCAT('%', :serviceName, '%'))";

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public MobileRepo(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Object> getAllMobileServices(String serviceName) {
        MapSqlParameterSource params = new MapSqlParameterSource("serviceName", serviceName);

        return jdbcTemplate.query(
                GET_ALL_SERVICES,
                params,
                (rs, rowNum) -> rs.getString("serviceName")
        );
    }
}