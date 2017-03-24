package com.mikasa.springboot.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.mikasa.springboot.dubbo.api.IDubboDemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by zhangyu51 on 2017/3/24.
 */

@Component
@Service(interfaceClass = IDubboDemoService.class)
public class DubboDemoService implements IDubboDemoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DubboDemoService.class);

    @Override
    public String sayHello(String name) {
        LOGGER.info("dubbo服务[sayHello]##########");
        return "hello " + name;
    }
}
