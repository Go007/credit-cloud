/*
 * This file is generated by jOOQ.
 */
package com.csci.cloud.admin.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class TTenant implements Serializable {

    private static final long serialVersionUID = 1609187381;

    private Integer   id;
    private String    name;
    private String    code;
    private Integer   type;
    private Integer   status;
    private Timestamp createdAt;
    private Timestamp updateAt;

    public TTenant() {}

    public TTenant(TTenant value) {
        this.id = value.id;
        this.name = value.name;
        this.code = value.code;
        this.type = value.type;
        this.status = value.status;
        this.createdAt = value.createdAt;
        this.updateAt = value.updateAt;
    }

    public TTenant(
        Integer   id,
        String    name,
        String    code,
        Integer   type,
        Integer   status,
        Timestamp createdAt,
        Timestamp updateAt
    ) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.type = type;
        this.status = status;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public Integer getId() {
        return this.id;
    }

    public TTenant setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public TTenant setName(String name) {
        this.name = name;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public TTenant setCode(String code) {
        this.code = code;
        return this;
    }

    public Integer getType() {
        return this.type;
    }

    public TTenant setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public TTenant setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public TTenant setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Timestamp getUpdateAt() {
        return this.updateAt;
    }

    public TTenant setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TTenant (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updateAt);

        sb.append(")");
        return sb.toString();
    }
}
