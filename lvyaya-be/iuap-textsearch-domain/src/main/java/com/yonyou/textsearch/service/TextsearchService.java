package com.yonyou.textsearch.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yonyou.iuap.baseservice.intg.support.ServiceFeature;
import static com.yonyou.iuap.baseservice.intg.support.ServiceFeature.*;

import com.yonyou.iuap.baseservice.service.GenericAssoService;
import com.yonyou.textsearch.dao.TextsearchMapper;
import com.yonyou.textsearch.po.Textsearch;

/**
 * 基础CRUD及主子表联合操作服务
 */
@Service("com.yonyou.textsearch.service.TextsearchService")
public class TextsearchService extends GenericAssoService<Textsearch,String>{

    private TextsearchMapper textsearchMapper;

    @Autowired
    public void setTextsearchMapper(TextsearchMapper textsearchMapper) {
        this.textsearchMapper = textsearchMapper;
        super.setGenericMapper(textsearchMapper);
    }



    /**
     * 可插拔设计
     * @return 向父类 提供可插拔的特性声明
     */
    @Override
    protected ServiceFeature[] getFeats() {
        return new ServiceFeature[]{ AUDIT,I18N_ENUM };
    }
}