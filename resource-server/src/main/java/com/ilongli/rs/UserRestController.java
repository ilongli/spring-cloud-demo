package com.ilongli.rs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ilongli
 * @date 2023/2/3 11:08
 */
@RestController
@RequestMapping("user")
public class UserRestController {

    @GetMapping("")
    public String get() {
        return "jack";
    }

}
