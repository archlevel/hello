package com.siling.service.hello;

import com.tower.service.TowerServiceContainer;

public class Startup {
    public static void main(String[] args) {
    	TowerServiceContainer container = new TowerServiceContainer("hello-service","classpath*:META-INF/config/spring/spring-service.xml");
    	container.start();
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
