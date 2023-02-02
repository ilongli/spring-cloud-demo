package com.ilongli.authservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ilongli
 * @date 2023/2/2 15:35
 *
 * http://localhost:7001/auth-service/oauth/authorize?client_id=web&response_type=token
 * http://localhost:7001/auth-service/oauth/authorize?client_id=web&response_type=code
 */
@RestController
public class IndexRestController {

    @GetMapping("")
    public String index() {
        return "auth-service is running";
    }

}
