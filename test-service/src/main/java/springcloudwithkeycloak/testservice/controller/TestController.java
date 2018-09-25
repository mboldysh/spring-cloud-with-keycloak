package springcloudwithkeycloak.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/tst")
    public String test() {
        return "test";
    }
}
