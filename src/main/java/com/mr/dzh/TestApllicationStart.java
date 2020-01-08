package com.mr.dzh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName TestApllicationStart
 * @Description: TODO
 * @Author douzhihong
 * @Date 2020/1/4
 * @Version v1.0
 */
@SpringBootApplication

@MapperScan(value = "com.mr.dzh.mapper")
public class TestApllicationStart {
    public static void main(String[] args) {
        SpringApplication.run(TestApllicationStart.class);
        System.out.println("ok");
    }
}
 
