package org.threepig.framework.sys.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shawn777
 */
@RestController
public class UserController {

    @GetMapping("/test")
    public String test(){
        return "hello world";
    }
}
