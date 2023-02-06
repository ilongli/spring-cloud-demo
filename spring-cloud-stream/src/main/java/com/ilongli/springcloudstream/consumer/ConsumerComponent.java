package com.ilongli.springcloudstream.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

/**
 * @author ilongli
 * @date 2023/2/6 15:39
 */
@Component
public class ConsumerComponent {

    /**
     * 注意这里需要填写我们前面交换机名称中"名称"，这样生产者发送的数据才会正确到达
     * @return
     */
    @Bean("test")
    public Consumer<String> consumer() {
        return System.out::println;
    }

}
