package com.siling.service.hello.impl; 

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.siling.service.hello.IHelloService;
import com.tower.service.annotation.SoaFwTest;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( locations = { "classpath*:/META-INF/config/spring/spring-service.xml"})
public class HelloServiceImplTest {
	
	@Resource(name = "helloService")
	private IHelloService hello;

	@Test
	@SoaFwTest(id="1a207b9f23579e35d1dfdd4e555ba9fa", method="sayHello", params={"sayHello"})
	public void sayHello() {
		int i=0;
		while(true){
			i++;
			hello.sayHello();
			if(i==3){
				break;
			}
		}
	}

}