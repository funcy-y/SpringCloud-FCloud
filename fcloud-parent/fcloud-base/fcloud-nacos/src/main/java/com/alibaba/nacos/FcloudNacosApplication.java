package com.alibaba.nacos;

import com.alibaba.nacos.config.ConfigConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@SpringBootApplication(scanBasePackages = "com.alibaba.nacos")
@ServletComponentScan
@EnableScheduling
public class FcloudNacosApplication {

    public static void main(String[] args) {
        System.setProperty(ConfigConstants.STANDALONE_MODE, "true");
        System.setProperty(ConfigConstants.AUTH_ENABLED, "false");
        System.setProperty(ConfigConstants.LOG_BASEDIR, "logs");
        System.setProperty(ConfigConstants.LOG_ENABLED, "true");
        SpringApplication.run(FcloudNacosApplication.class, args);
    }

}
