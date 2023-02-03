package com.ilongli.rs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 仅测试使用，0.3.1之后的版本基于java11构建
 * @author ilongli
 * @date 2023/2/2 15:34
 * http://localhost:7003/oauth2/authorize?client_id=web&response_type=code&scope=user&redirect_uri=http://127.0.0.1:7004/authorized
 */
@SpringBootApplication
public class SpringResourceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringResourceServerApplication.class, args);
    }

}
