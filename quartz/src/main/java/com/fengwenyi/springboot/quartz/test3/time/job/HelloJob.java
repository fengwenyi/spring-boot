package com.fengwenyi.springboot.quartz.test3.time.job;

import com.fengwenyi.springboot.quartz.test3.service.HelloService;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author Wenyi Feng
 */
public class HelloJob extends QuartzJobBean {

    @Autowired
    private HelloService helloService;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) {
        helloService.sayHello();
    }
}
