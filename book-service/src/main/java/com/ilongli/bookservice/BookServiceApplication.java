package com.ilongli.bookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author ilongli
 * @date 2023/2/2 15:34
 */
@SpringBootApplication
//@EnableOAuth2Sso
@EnableResourceServer
public class BookServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookServiceApplication.class, args);
    }

}
