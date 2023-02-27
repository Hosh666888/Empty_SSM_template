package pro.goforit.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/2/27 8:40
 * @desc:
 **/
@RestController
@Slf4j
public class TestController {

    @PostMapping("testPost")
    public String test(){
        log.info("adadadadadadadadaadadadada");
        return "test Post success!!";
    }

    @GetMapping("testGet")
    public String testGet(){
        return "test get success!";
    }
}
