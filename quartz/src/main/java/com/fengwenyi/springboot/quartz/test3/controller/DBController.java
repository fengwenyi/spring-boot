package com.fengwenyi.springboot.quartz.test3.controller;

import com.fengwenyi.springboot.quartz.lib.ScheduleBean;
import com.fengwenyi.springboot.quartz.test3.time.job.DBJob;
import com.fengwenyi.springboot.quartz.test3.time.task.DBQuartzTask;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wenyi Feng
 */
@RestController
@RequestMapping("/db")
public class DBController {

    @Autowired
    private Scheduler scheduler;

    @Autowired
    private DBQuartzTask task;

    @RequestMapping("/get")
    public boolean get() {
        ScheduleBean scheduleBean = new ScheduleBean();
        scheduleBean.setClazz(DBJob.class);
        scheduleBean.setTime(1);
        scheduleBean.setJobName("JOB_NAME_DB");
        scheduleBean.setJobGroup("GROUP_1");
        scheduleBean.setTriggerName("TRIGGER_NAME_DB");
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
