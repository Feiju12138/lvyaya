package com.yonyou.positionsearch.impl;

import com.yonyou.positionsearch.api.PositionsearchQueryService;
import com.yonyou.positionsearch.dto.PositionsearchDTO;
import com.yonyou.positionsearch.po.Positionsearch;
import com.yonyou.positionsearch.service.PositionsearchService;
import com.yonyou.iuap.ucf.common.rest.SearchParams;
import com.yonyou.iuap.ucf.dao.support.SqlParam;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RPC provider端
 * @author  
 * @date 2019-9-10 21:49:48
 */
@Service("com.yonyou.positionsearch.impl.PositionsearchQueryServiceImpl")
public class PositionsearchQueryServiceImpl implements PositionsearchQueryService {

    private PositionsearchService positionsearchService;

    @Autowired
    public void setPositionsearchService(PositionsearchService positionsearchService) {
        this.positionsearchService = positionsearchService;
    }


    @Override
    public List<PositionsearchDTO> listPositionsearch(SearchParams searchParams) {
        List<Positionsearch>  list = positionsearchService.queryList(searchParams);
        List<PositionsearchDTO> result = new ArrayList<>();
        if (list!=null){
            for (Positionsearch model:list){
                PositionsearchDTO dto = new PositionsearchDTO();
                BeanUtils.copyProperties(model,dto);
                result.add(dto);
            }
        }
        return result;
    }


}
