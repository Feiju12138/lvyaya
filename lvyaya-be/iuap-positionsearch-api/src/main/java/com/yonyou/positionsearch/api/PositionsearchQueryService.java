package com.yonyou.positionsearch.api;
import com.yonyou.positionsearch.dto.PositionsearchDTO;
import com.yonyou.iuap.ucf.common.rest.SearchParams;
import com.yonyou.cloud.middleware.rpc.RemoteCall;

import java.util.List;

/**
 * RPC 调用接口声明
 * @author  
 * @date 2019-9-10 21:49:47
 */
@RemoteCall("iuap-lvyaya-server")
public interface PositionsearchQueryService {

    /**
     * 查询垃圾站位置查询列表
     */
    List<PositionsearchDTO> listPositionsearch(SearchParams searchParams);

}
