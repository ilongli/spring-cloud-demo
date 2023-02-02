package com.ilongli.bookservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ilongli
 * @date 2023/2/2 16:16
 */
@RestController
public class BookRestController {

    @GetMapping("")
    public String index() {
        return "book-service is running...";
    }

}
