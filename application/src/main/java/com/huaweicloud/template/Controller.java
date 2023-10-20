package com.huaweicloud.template;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务端接口
 *
 * @author daizhenyu
 * @since 2023-10-19
 **/
@RestController
public class Controller {
    @RequestMapping("application")
    public void applicationDemo() {
        System.out.println("applicationDemo 启动了");
    }
}
