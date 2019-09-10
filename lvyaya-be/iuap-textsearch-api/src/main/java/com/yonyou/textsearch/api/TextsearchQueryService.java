package com.yonyou.textsearch.api;
import com.yonyou.textsearch.dto.TextsearchDTO;
import com.yonyou.iuap.ucf.common.rest.SearchParams;
import com.yonyou.cloud.middleware.rpc.RemoteCall;

import java.util.List;

/**
 * RPC 调用接口声明
 * @author  
 * @date 2019-9-10 21:51:26
 */
@RemoteCall("iuap-lvyaya-server")
public interface TextsearchQueryService {

    /**
     * 查询文字检索列表
     */
    List<TextsearchDTO> listTextsearch(SearchParams searchParams);

}
