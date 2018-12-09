package com.sun.controller.base;

import java.util.HashMap;
import java.util.Map;
import com.sun.entity.PageInfo;

public class BaseController {

	protected Map<String, Object> getDataTable(PageInfo pageInfo) {
		Map<String, Object> rspData = new HashMap<String, Object>();
		rspData.put("rows", pageInfo.getList());
		rspData.put("total", pageInfo.getTotal());
		return rspData;
	}

	
}
