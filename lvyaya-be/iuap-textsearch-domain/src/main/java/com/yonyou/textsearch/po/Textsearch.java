package com.yonyou.textsearch.po;
import cn.hutool.core.date.DateUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.textsearch.constant.TextsearchConstant;
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
 * 文字检索
 * @since v5.0.0
 * @date 2019-9-10 21:51:25
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "search")

public class Textsearch extends BasePO implements AuditTrail{

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

    @Condition(match=Match.LIKE)
    @Column(name="rubbish_name")
    private String rubbish_name;        //垃圾名称

    public void setRubbish_name(String rubbish_name){
        this.rubbish_name = rubbish_name;
    }
    public String getRubbish_name(){
        return this.rubbish_name;
    }


    @Condition
    @Column(name="rubbish_kind")
    private String rubbish_kind;        //垃圾种类

    public void setRubbish_kind(String rubbish_kind){
        this.rubbish_kind = rubbish_kind;
    }
    public String getRubbish_kind(){
        return this.rubbish_kind;
    }


}



