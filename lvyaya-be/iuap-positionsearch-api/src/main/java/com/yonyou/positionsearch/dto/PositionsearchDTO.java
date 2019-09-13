package com.yonyou.positionsearch.dto;
import cn.hutool.core.date.DateUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.baseservice.entity.AuditTrail;
import com.yonyou.iuap.baseservice.entity.annotation.*;
import com.yonyou.iuap.baseservice.support.condition.Condition;


import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

/**
 * 垃圾站位置查询
 * @since v5.0.0
 * @date 2019-9-13 20:31:07
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class PositionsearchDTO  implements AuditTrail{

    private String id;
    private String tenantId;
    private Date ts;
    private Integer dr;
    private String createTime;
    private String createUser;
    private String lastModified;
    private String lastModifyUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }
    @Override
    public String getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String getCreateUser() {
        return createUser;
    }

    @Override
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Override
    public String getLastModified() {
        return lastModified;
    }

    @Override
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public String getLastModifyUser() {
        return lastModifyUser;
    }

    @Override
    public void setLastModifyUser(String lastModifyUser) {
        this.lastModifyUser = lastModifyUser;
    }


    private String address;        //地址

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }



    private String kind;        //垃圾种类

    public void setKind(String kind){
        this.kind = kind;
    }
    public String getKind(){
        return this.kind;
    }



    private String city;        //城市

    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return this.city;
    }



    private String street;        //街道

    public void setStreet(String street){
        this.street = street;
    }
    public String getStreet(){
        return this.street;
    }


}



