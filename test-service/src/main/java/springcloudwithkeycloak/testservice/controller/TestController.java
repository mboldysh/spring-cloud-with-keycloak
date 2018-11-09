package springcloudwithkeycloak.testservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @GetMapping("/tst")

    public String test() {
        log.info("Incoming request");
        return "test";
    }
}
