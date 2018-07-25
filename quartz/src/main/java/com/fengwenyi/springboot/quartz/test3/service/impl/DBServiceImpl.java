package com.fengwenyi.springboot.quartz.test3.service.impl;

import com.fengwenyi.javalib.util.ToastUtil;
import com.fengwenyi.springboot.quartz.test3.service.DBService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Wenyi Feng
 */
@Service
public class DBServiceImpl implements DBService {

    @Override
    public void getData() {
        ToastUtil.show("读取数据库：" + new Date());
    }
}
