package com.fengwenyi.springboot.quartz.test3.controller;

import com.fengwenyi.springboot.quartz.lib.ScheduleBean;
import com.fengwenyi.springboot.quartz.test3.time.job.HelloJob;
import com.fengwenyi.springboot.quartz.test3.time.task.HelloQuartzTask;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wenyi Feng
 */
@RestController
public class HelloJobController {

    @Autowired
    private Scheduler scheduler;

    @Autowired
    private HelloQuartzTask task;

    @RequestMapping("/hello")
    public boolean hello() {
        ScheduleBean scheduleBean = new ScheduleBean();
        scheduleBean.setClazz(HelloJob.class);
        scheduleBean.setTime(3);
        scheduleBean.setJobName("JOB_NAME");
        scheduleBean.setJobGroup("GROUP_1");
        scheduleBean.setTriggerName("TRIGGER_NAME");
        scheduleBean.setTriggerGroup("GROUP_1");
        scheduleBean.setScheduler(scheduler);

        try {
            boolean rs = task.start(scheduleBean, null);
            return rs;
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return false;
    }

}
