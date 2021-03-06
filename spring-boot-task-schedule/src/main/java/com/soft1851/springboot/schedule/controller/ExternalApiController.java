package com.soft1851.springboot.schedule.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xunmi
 * @ClassName ExternalApiController
 * @Description 外部接口的URL路径以 /external/作为前缀
 * @Date 2020/5/18
 * @Version 1.0
 **/
@Controller
public class ExternalApiController {
    @GetMapping("/external/data")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("外部资源");
    }
}
