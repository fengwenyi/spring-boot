package com.fengwenyi.springboot.quartz.test3.time.job;

import com.fengwenyi.springboot.quartz.test3.service.DBService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author Wenyi Feng
 */
public class DBJob extends QuartzJobBean {

    @Autowired
    private DBService dbService;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        dbService.getData();
    }
}
