/*
 * This file is generated by jOOQ.
 */
package com.csci.cloud.admin.jooq.tables.records;


import com.csci.cloud.admin.jooq.tables.TApplicationKey;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TApplicationKeyRecord extends UpdatableRecordImpl<TApplicationKeyRecord> implements Record6<String, String, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 559609218;

    /**
     * Setter for <code>credit_cloud_console.t_application_key.app_key</code>.
     */
    public TApplicationKeyRecord setAppKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>credit_cloud_console.t_application_key.app_key</code>.
     */
    public String getAppKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>credit_cloud_console.t_application_key.app_secret</code>.
     */
    public TApplicationKeyRecord setAppSecret(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>credit_cloud_console.t_application_key.app_secret</code>.
     */
    public String getAppSecret() {
        return (String) get(1);
    }

    /**
     * Setter for <code>credit_cloud_console.t_application_key.app_id</code>. 应用id
     */
    public TApplicationKeyRecord setAppId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>credit_cloud_console.t_application_key.app_id</code>. 应用id
     */
    public Integer getAppId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>credit_cloud_console.t_application_key.status</code>. Key的状态：0-正常，9-删除
     */
    public TApplicationKeyRecord setStatus(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>credit_cloud_console.t_application_key.status</code>. Key的状态：0-正常，9-删除
     */
    public Integer getStatus() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>credit_cloud_console.t_application_key.create_at</code>.
     */
    public TApplicationKeyRecord setCreateAt(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>credit_cloud_console.t_application_key.create_at</code>.
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>credit_cloud_console.t_application_key.update_at</code>.
     */
    public TApplicationKeyRecord setUpdateAt(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>credit_cloud_console.t_application_key.update_at</code>.
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TApplicationKey.T_APPLICATION_KEY.APP_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TApplicationKey.T_APPLICATION_KEY.APP_SECRET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TApplicationKey.T_APPLICATION_KEY.APP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TApplicationKey.T_APPLICATION_KEY.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TApplicationKey.T_APPLICATION_KEY.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TApplicationKey.T_APPLICATION_KEY.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getAppKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAppSecret();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getAppKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAppSecret();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TApplicationKeyRecord value1(String value) {
        setAppKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TApplicationKeyRecord value2(String value) {
        setAppSecret(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TApplicationKeyRecord value3(Integer value) {
        setAppId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TApplicationKeyRecord value4(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TApplicationKeyRecord value5(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TApplicationKeyRecord value6(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TApplicationKeyRecord values(String value1, String value2, Integer value3, Integer value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TApplicationKeyRecord
     */
    public TApplicationKeyRecord() {
        super(TApplicationKey.T_APPLICATION_KEY);
    }

    /**
     * Create a detached, initialised TApplicationKeyRecord
     */
    public TApplicationKeyRecord(String appKey, String appSecret, Integer appId, Integer status, Timestamp createAt, Timestamp updateAt) {
        super(TApplicationKey.T_APPLICATION_KEY);

        set(0, appKey);
        set(1, appSecret);
        set(2, appId);
        set(3, status);
        set(4, createAt);
        set(5, updateAt);
    }
}
