package com.yonyou.positionsearch.po;
import cn.hutool.core.date.DateUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.positionsearch.constant.PositionsearchConstant;
import com.yonyou.iuap.baseservice.entity.AuditTrail;
import com.yonyou.iuap.baseservice.entity.annotation.*;
import com.yonyou.iuap.baseservice.support.condition.Condition;
import com.yonyou.iuap.baseservice.support.condition.Match;
import com.yonyou.iuap.ucf.dao.BasePO;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;
/**
 * 垃圾站位置查询
 * @since v5.0.0
 * @date 2019-9-11 13:58:44
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "position")

public class Positionsearch extends BasePO implements AuditTrail{

    @Column(name="create_time")
    private String createTime;

    @Column(name="create_user")
    @Condition
    private String createUser;

    @Column(name="last_modified")
    private String lastModified;

    @Column(name="last_modify_user")
    @Condition
    private String lastModifyUser;

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

    @Condition
    @Column(name="address")
    private String address;        //地址

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }


    @Condition(match=Match.LIKE)
    @Column(name="kind")
    private String kind;        //垃圾种类

    public void setKind(String kind){
        this.kind = kind;
    }
    public String getKind(){
        return this.kind;
    }


    @Condition(match=Match.LIKE)
    @Column(name="city")
    private String city;        //城市

    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return this.city;
    }


    @Condition
    @Column(name="street")
    private String street;        //街道

    public void setStreet(String street){
        this.street = street;
    }
    public String getStreet(){
        return this.street;
    }


}



