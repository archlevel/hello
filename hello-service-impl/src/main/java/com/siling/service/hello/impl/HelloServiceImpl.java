package com.siling.service.hello.impl;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.siling.service.hello.IHelloService;
import com.siling.service.hello.dao.ICodeDAO;
import com.siling.service.hello.dao.model.Code;
import com.tower.service.impl.AbsServiceImpl;

public class HelloServiceImpl extends AbsServiceImpl implements IHelloService {
	@Resource(name="Code")
	private ICodeDAO<Code> codeDAOImpl;
	@Override
	@Transactional
	public void sayHello() {
		long start = System.currentTimeMillis();
		Code code = codeDAOImpl.queryById(15, null);
		System.out.println((System.currentTimeMillis()-start));
		int cnt = 0;
		while(true){
			cnt++;
			start = System.currentTimeMillis();
			code = codeDAOImpl.queryById(15, null);
			System.out.println((System.currentTimeMillis()-start));
			if(cnt>=100){
				break;
			}
		}
	}
}
