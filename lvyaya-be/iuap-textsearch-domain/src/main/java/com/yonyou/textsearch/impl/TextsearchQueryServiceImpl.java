package com.yonyou.textsearch.impl;

import com.yonyou.textsearch.api.TextsearchQueryService;
import com.yonyou.textsearch.dto.TextsearchDTO;
import com.yonyou.textsearch.po.Textsearch;
import com.yonyou.textsearch.service.TextsearchService;
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
 * @date 2019-9-10 21:51:25
 */
@Service("com.yonyou.textsearch.impl.TextsearchQueryServiceImpl")
public class TextsearchQueryServiceImpl implements TextsearchQueryService {

    private TextsearchService textsearchService;

    @Autowired
    public void setTextsearchService(TextsearchService textsearchService) {
        this.textsearchService = textsearchService;
    }


    @Override
    public List<TextsearchDTO> listTextsearch(SearchParams searchParams) {
        List<Textsearch>  list = textsearchService.queryList(searchParams);
        List<TextsearchDTO> result = new ArrayList<>();
        if (list!=null){
            for (Textsearch model:list){
                TextsearchDTO dto = new TextsearchDTO();
                BeanUtils.copyProperties(model,dto);
                result.add(dto);
            }
        }
        return result;
    }


}
