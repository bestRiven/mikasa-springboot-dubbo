package com.mikasa.springboot.dubbo;

/**
 * Created by zhangyu51 on 2017/3/24.
 */

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Provider启动类 <br />
 *
 * 如果没有web容器，需要hold住服务,否则进程会退出,参考以下代码:
 *
 * <pre>
 * synchronized (DubboProviderLauncher.class) {
 *   while (true) {
 *     try {
 *       DubboProviderLauncher.class.wait();
 *     } catch (InterruptedException e) {
 *       // swallow it
 *     }
 *   }
 * }
 * </pre>
 */
@SpringBootApplication
@EnableDubboConfiguration
public class DubboProviderLauncher {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderLauncher.class, args);
    }
}
