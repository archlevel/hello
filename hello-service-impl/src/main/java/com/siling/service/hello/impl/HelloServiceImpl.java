package com.siling.service.hello.impl;

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
		System.out.println(code+" "+(System.currentTimeMillis()-start)+" ms");
	}
}
