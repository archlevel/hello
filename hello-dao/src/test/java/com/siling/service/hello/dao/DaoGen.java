package com.siling.service.hello.dao;

import com.tower.service.dao.generate.tool.DaoGenFromDB;

public class DaoGen {


    public static void main(String[] args) {
        try {
        	/**
        	 * sql server 数据访问层代码生成器
        	 */
        	//DaoGenFromDB.generateSQLSvrDAO("hello_db", "表名", "classpath*:/META-INF/config/spring/spring-dao.xml", "com.siling.service.hello", "src/main/java/", "src/main/resources/");
        	/**
        	 * my sql 数据访问层代码生成器
        	 */
            DaoGenFromDB.generateDAO("hello_db", "Code", "classpath*:/META-INF/config/spring/spring-dao.xml","com.siling.service.hello", "src/main/java/", "src/main/resources/");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
