package com.meijie.progress;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ProgressApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgressApplication.class, args);
		log.info("梅杰的个人项目启动成功");
	}

}
