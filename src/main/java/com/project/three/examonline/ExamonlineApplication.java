package com.project.three.examonline;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.project.three.examonline.dao")
@SpringBootApplication
public class ExamonlineApplication {

  public static void main(String[] args) {
    SpringApplication.run(ExamonlineApplication.class, args);
  }

}
