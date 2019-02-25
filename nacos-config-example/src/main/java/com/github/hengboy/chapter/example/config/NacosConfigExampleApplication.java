package com.github.hengboy.chapter.example.config;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * nacos config example main class
 *
 * @author：恒宇少年 - 于起宇
 * <p>
 * DateTime：2019-02-25 15:38
 * Blog：http://blog.yuqiyu.com
 * WebSite：http://www.jianshu.com/u/092df3f77bca
 * Gitee：https://gitee.com/hengboy
 * GitHub：https://github.com/hengyuboy
 */
@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class NacosConfigExampleApplication {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(NacosConfigExampleApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigExampleApplication.class);
        logger.info("「「「「「nacos config example start successfully.」」」」」");
    }
}
