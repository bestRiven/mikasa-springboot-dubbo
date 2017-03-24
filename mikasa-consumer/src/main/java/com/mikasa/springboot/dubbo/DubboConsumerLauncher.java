package com.mikasa.springboot.dubbo;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zhangyu51 on 2017/3/24.
 */

@SpringBootApplication
@EnableDubboConfiguration
public class DubboConsumerLauncher {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerLauncher.class, args);
    }
}
