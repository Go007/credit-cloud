/*
 * This file is generated by jOOQ.
 */
package com.csci.cloud.admin.jooq.tables;


import com.csci.cloud.admin.jooq.CreditCloudConsole;
import com.csci.cloud.admin.jooq.Indexes;
import com.csci.cloud.admin.jooq.Keys;
import com.csci.cloud.admin.jooq.tables.records.TUserCaptchaRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class TUserCaptcha extends TableImpl<TUserCaptchaRecord> {

    private static final long serialVersionUID = -585930542;

    /**
     * The reference instance of <code>credit_cloud_console.t_user_captcha</code>
     */
    public static final TUserCaptcha T_USER_CAPTCHA = new TUserCaptcha();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TUserCaptchaRecord> getRecordType() {
        return TUserCaptchaRecord.class;
    }

    /**
     * The column <code>credit_cloud_console.t_user_captcha.id</code>. id
     */
    public final TableField<TUserCaptchaRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "id");

    /**
     * The column <code>credit_cloud_console.t_user_captcha.login_name</code>. 登录名
     */
    public final TableField<TUserCaptchaRecord, String> LOGIN_NAME = createField("login_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "登录名");

    /**
     * The column <code>credit_cloud_console.t_user_captcha.times</code>. 登录失败的次数
     */
    public final TableField<TUserCaptchaRecord, Integer> TIMES = createField("times", org.jooq.impl.SQLDataType.INTEGER.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "登录失败的次数");

    /**
     * The column <code>credit_cloud_console.t_user_captcha.created_at</code>. 创建时间
     */
    public final TableField<TUserCaptchaRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>credit_cloud_console.t_user_captcha.updated_at</code>. 更新时间
     */
    public final TableField<TUserCaptchaRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>credit_cloud_console.t_user_captcha</code> table reference
     */
    public TUserCaptcha() {
        this(DSL.name("t_user_captcha"), null);
    }

    /**
     * Create an aliased <code>credit_cloud_console.t_user_captcha</code> table reference
     */
    public TUserCaptcha(String alias) {
        this(DSL.name(alias), T_USER_CAPTCHA);
    }

    /**
     * Create an aliased <code>credit_cloud_console.t_user_captcha</code> table reference
     */
    public TUserCaptcha(Name alias) {
        this(alias, T_USER_CAPTCHA);
    }

    private TUserCaptcha(Name alias, Table<TUserCaptchaRecord> aliased) {
        this(alias, aliased, null);
    }

    private TUserCaptcha(Name alias, Table<TUserCaptchaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TUserCaptcha(Table<O> child, ForeignKey<O, TUserCaptchaRecord> key) {
        super(child, key, T_USER_CAPTCHA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return CreditCloudConsole.CREDIT_CLOUD_CONSOLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.T_USER_CAPTCHA_PRIMARY, Indexes.T_USER_CAPTCHA_UNIQ_LOGIN_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TUserCaptchaRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_USER_CAPTCHA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TUserCaptchaRecord> getPrimaryKey() {
        return Keys.KEY_T_USER_CAPTCHA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TUserCaptchaRecord>> getKeys() {
        return Arrays.<UniqueKey<TUserCaptchaRecord>>asList(Keys.KEY_T_USER_CAPTCHA_PRIMARY, Keys.KEY_T_USER_CAPTCHA_UNIQ_LOGIN_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCaptcha as(String alias) {
        return new TUserCaptcha(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCaptcha as(Name alias) {
        return new TUserCaptcha(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TUserCaptcha rename(String name) {
        return new TUserCaptcha(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TUserCaptcha rename(Name name) {
        return new TUserCaptcha(name, null);
    }
}
