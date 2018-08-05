package org.threepig.framework.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiangyu.qi@hand-china.com on 2018/8/5.
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "hello world";
    }
}
