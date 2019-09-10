package com.yonyou.positionsearch.dao;
import com.yonyou.iuap.persistence.mybatis.anotation.MyBatisRepository;
import com.yonyou.iuap.ucf.dao.BaseDAO;

import com.yonyou.positionsearch.po.Positionsearch;

@MyBatisRepository("com.yonyou.positionsearch.dao.PositionsearchMapper")
public interface PositionsearchMapper extends BaseDAO<Positionsearch,String> {

}
