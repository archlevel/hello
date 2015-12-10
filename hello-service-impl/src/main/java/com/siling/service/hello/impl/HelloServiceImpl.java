package com.siling.service.hello.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.siling.service.hello.IHelloService;
import com.siling.service.hello.dao.ICodeDAO;
import com.siling.service.hello.dao.model.Code;
import com.tower.service.impl.AbsServiceImpl;

public class HelloServiceImpl extends AbsServiceImpl implements IHelloService {
	
	@Resource(name="Code")
	private  ICodeDAO<Code> codeDAO;
	@Override
	@Transactional
	public void sayHello() {
		long start = System.currentTimeMillis();
		Code code = codeDAO.queryById(6, null);
		List<Code> codes = codeDAO.queryByFK("no", "pay_status", null);
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("no", "pay_status");
		params.put("itemKey", "0");
		codes = codeDAO.queryByMap(params, null);
		System.out.println(codes+" "+(System.currentTimeMillis()-start)+" ms");
		
	}
}
