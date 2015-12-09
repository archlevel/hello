package com.siling.service.hello.job; 

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tower.service.annotation.SoaFwTest;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( locations = { "classpath*:/META-INF/config/spring/spring-job.xml"})
public class JobImplTest {
	@Test
	@SoaFwTest(id="f316f419c1ed0364312cd3ecd0900fde", method="batch", params={"batch"})
	public void batch() {

		throw new RuntimeException("batch test not implemented");
	}

	@Test
	@SoaFwTest(id="134b2c62f2a80705827ff8f3c800447b", method="onError", params={"onError","JobException"})
	public void onError() {
		//待测试方法参数类型定义参考： JobException	
		throw new RuntimeException("onError test not implemented");
	}

	@Test
	@SoaFwTest(id="139992e747900a2fe92825ed37ed1aea", method="onSuccessed", params={"onSuccessed"})
	public void onSuccessed() {

		throw new RuntimeException("onSuccessed test not implemented");
	}

	@Test
	@SoaFwTest(id="d3d2e70ea707833f01e6f32ae0081568", method="getPages", params={"getPages"})
	public void getPages() {

		throw new RuntimeException("getPages test not implemented");
	}

	@Test
	@SoaFwTest(id="52d7f5d1ade8fa298034680b617e6edd", method="pageLoad", params={"pageLoad"})
	public void pageLoad() {

		throw new RuntimeException("pageLoad test not implemented");
	}

	@Test
	@SoaFwTest(id="48b1885a50e5650cc6419eb28ea919a2", method="start", params={"start"})
	public void start() {

		throw new RuntimeException("start test not implemented");
	}

	@Test
	@SoaFwTest(id="97a13dc99de9127eebb317a39ce29054", method="getId", params={"getId"})
	public void getId() {

		throw new RuntimeException("getId test not implemented");
	}

	@Test
	@SoaFwTest(id="0a55fd2797b22ed6893ecdf6968a4f5a", method="after", params={"after"})
	public void after() {

		throw new RuntimeException("after test not implemented");
	}

	@Test
	@SoaFwTest(id="9d83a132bfab76113888da823da3e780", method="before", params={"before"})
	public void before() {

		throw new RuntimeException("before test not implemented");
	}

	@Test
	@SoaFwTest(id="3d0b8b48dc3c7e4d67a75291d89da055", method="doProcess", params={"doProcess","Object"})
	public void doProcess() {
		//待测试方法参数类型定义参考： Object	
		throw new RuntimeException("doProcess test not implemented");
	}

}