package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient  //向注册中中心注册服务
@EnableFeignClients	//扫描@FeignClient  与此来调用其他的服务
public class ZeusServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeusServiceFeignApplication.class, args);
	}
}
