package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	/*
	 * 어플리케이션(소프트웨어 프로그램)을 만들 때 패키지가3개부터 시작
	 * com.example.demo
	 * 첫번째 패키지 이름 : .net, .com, .kr(닷컴)
	 * 두번째 패키지 이름 : 조직 이름(dw, naver, dnbcode ...)
	 * 세번째 패키지 이름 : 프로젝트 이름(admin, game, drone, app ...)
	 */

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
