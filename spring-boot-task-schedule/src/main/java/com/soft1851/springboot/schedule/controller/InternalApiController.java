package com.soft1851.springboot.schedule.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xunmi
 * @ClassName InternalApiController
 * @Description 内部接口的URL路径以 /internal/作为前置
 * @Date 2020/5/18
 * @Version 1.0
 **/
@Controller
public class InternalApiController {
    @GetMapping("/internal/data")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("内部资源");
    }
}
