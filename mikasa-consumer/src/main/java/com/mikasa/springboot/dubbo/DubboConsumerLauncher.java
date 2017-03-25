package com.mikasa.springboot.dubbo;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by zhangyu51 on 2017/3/24.
 */

@SpringBootApplication
@EnableDubboConfiguration
public class DubboConsumerLauncher extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerLauncher.class, args);
    }

    /**
     * 如果要发布到自己的Tomcat中的时候，需要继承SpringBootServletInitializer类，并且增加如下的configure方法。
     * 如果不发布到自己的Tomcat中的时候，就无需上述的步骤
     */
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(DubboConsumerLauncher.class);
    }
}
