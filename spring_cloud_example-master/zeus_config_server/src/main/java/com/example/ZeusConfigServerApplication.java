package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 配置中心config 的 server 端
 * @Author jiangcaijun
 */

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ZeusConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeusConfigServerApplication.class, args);
	}
}