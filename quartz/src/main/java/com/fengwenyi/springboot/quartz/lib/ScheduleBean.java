package com.fengwenyi.springboot.quartz.lib;

import lombok.Data;
import org.quartz.Scheduler;

/**
 * ScheduleBean
 * @author Wenyi Feng
 */
@Data
public class ScheduleBean {

    /** quartz scheduler obj */
    private Scheduler scheduler;

    /** 编号 */
    private Long id;

    /** task name */
    private String name;

    /** task description */
    private String description;

    /** 类clazz */
    private Class clazz;

    /** cron */
    private String cron;

    /** time, simple */
    private int time;

    /** job name */
    private String jobName;

    /** job group name */
    private String jobGroup;

    /** trigger name */
    private String triggerName;

    /** trigger group name */
    private String triggerGroup;

}
