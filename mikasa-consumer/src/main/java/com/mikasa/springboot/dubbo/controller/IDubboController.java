package com.mikasa.springboot.dubbo.controller;

import com.alibaba.boot.dubbo.annotation.DubboConsumer;
import com.mikasa.springboot.dubbo.api.IDubboDemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangyu51 on 2017/3/24.
 */

@RestController
@RequestMapping("/")
public class IDubboController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IDubboController.class);

    // timeout表示dubbo超时时间，单位为ms
    @DubboConsumer(timeout = 1000)
    private IDubboDemoService iDubboDemoService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello() {
        LOGGER.info(".   ____          _            __ _ _\n" +
                " /\\\\ / ___'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\\n" +
                "( ( )\\___ | '_ | '_| | '_ \\/ _` | \\ \\ \\ \\\n" +
                " \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )\n" +
                "  '  |____| .__|_| |_|_| |_\\__, | / / / /\n" +
                " =========|_|==============|___/=/_/_/_/");

        LOGGER.info("dubbo服务调用测试开始...");

        String userName = "Mikasa";
        String dubboResult = iDubboDemoService.sayHello(userName);

        return dubboResult;
    }
}
