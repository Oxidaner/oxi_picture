package com.zzb.oxi_picture_backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.zzb.oxi_picture_backend.mapper")
//@EnableAspectJAutoProxy(exposeProxy = true) // 允许AOP代理暴露给其他类
public class OxiPictureBackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(OxiPictureBackendApplication.class, args);
		System.out.println("==run==");

	}

}
