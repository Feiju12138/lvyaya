package com.yonyou.textsearch.dao;
import com.yonyou.iuap.persistence.mybatis.anotation.MyBatisRepository;
import com.yonyou.iuap.ucf.dao.BaseDAO;

import com.yonyou.textsearch.po.Textsearch;

@MyBatisRepository("com.yonyou.textsearch.dao.TextsearchMapper")
public interface TextsearchMapper extends BaseDAO<Textsearch,String> {

}
