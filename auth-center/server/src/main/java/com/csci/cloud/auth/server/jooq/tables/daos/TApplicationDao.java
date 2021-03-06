/*
 * This file is generated by jOOQ.
 */
package com.csci.cloud.auth.server.jooq.tables.daos;


import com.csci.cloud.auth.server.jooq.tables.TApplication;
import com.csci.cloud.auth.server.jooq.tables.records.TApplicationRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TApplicationDao extends DAOImpl<TApplicationRecord, com.csci.cloud.auth.server.jooq.tables.pojos.TApplication, Integer> {

    /**
     * Create a new TApplicationDao without any configuration
     */
    public TApplicationDao() {
        super(TApplication.T_APPLICATION, com.csci.cloud.auth.server.jooq.tables.pojos.TApplication.class);
    }

    /**
     * Create a new TApplicationDao with an attached configuration
     */
    public TApplicationDao(Configuration configuration) {
        super(TApplication.T_APPLICATION, com.csci.cloud.auth.server.jooq.tables.pojos.TApplication.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.csci.cloud.auth.server.jooq.tables.pojos.TApplication object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.csci.cloud.auth.server.jooq.tables.pojos.TApplication> fetchById(Integer... values) {
        return fetch(TApplication.T_APPLICATION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.csci.cloud.auth.server.jooq.tables.pojos.TApplication fetchOneById(Integer value) {
        return fetchOne(TApplication.T_APPLICATION.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.csci.cloud.auth.server.jooq.tables.pojos.TApplication> fetchByName(String... values) {
        return fetch(TApplication.T_APPLICATION.NAME, values);
    }

    /**
     * Fetch records that have <code>tenant_id IN (values)</code>
     */
    public List<com.csci.cloud.auth.server.jooq.tables.pojos.TApplication> fetchByTenantId(Integer... values) {
        return fetch(TApplication.T_APPLICATION.TENANT_ID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.csci.cloud.auth.server.jooq.tables.pojos.TApplication> fetchByStatus(Integer... values) {
        return fetch(TApplication.T_APPLICATION.STATUS, values);
    }

    /**
     * Fetch records that have <code>create_at IN (values)</code>
     */
    public List<com.csci.cloud.auth.server.jooq.tables.pojos.TApplication> fetchByCreateAt(Timestamp... values) {
        return fetch(TApplication.T_APPLICATION.CREATE_AT, values);
    }

    /**
     * Fetch records that have <code>update_at IN (values)</code>
     */
    public List<com.csci.cloud.auth.server.jooq.tables.pojos.TApplication> fetchByUpdateAt(Timestamp... values) {
        return fetch(TApplication.T_APPLICATION.UPDATE_AT, values);
    }
}
