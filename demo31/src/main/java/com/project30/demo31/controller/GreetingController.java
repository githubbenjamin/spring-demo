package com.project30.demo31.controller;

import com.project30.demo31.entity.LookupCodeEntity;
import com.project30.demo31.repository.LookupCodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("greeting")
@RequiredArgsConstructor
@RefreshScope
public class GreetingController {

    final LookupCodeRepository lookupCodeRepository;


    @Value("${order.k1:}")
    private String propertyK01;

    @GetMapping("hello")
    public String hello() {
        final List<LookupCodeEntity> all = lookupCodeRepository.findAll();
        System.out.println("::" + propertyK01);
        return "hello";
    }

    @PostMapping("lookup-code")
    public String addLookupCode(LookupCodeEntity param) {
        lookupCodeRepository.save(param);
        return "ok";
    }


}
