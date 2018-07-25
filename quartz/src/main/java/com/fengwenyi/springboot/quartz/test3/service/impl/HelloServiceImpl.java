package com.fengwenyi.springboot.quartz.test3.service.impl;

import com.fengwenyi.javalib.util.ToastUtil;
import com.fengwenyi.springboot.quartz.test3.service.HelloService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Wenyi Feng
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello() {
        ToastUtil.show("Hello : " + new Date());
    }
}
