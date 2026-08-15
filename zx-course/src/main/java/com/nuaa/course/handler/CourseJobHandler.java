package com.nuaa.course.handler;

import com.nuaa.course.service.ICourseService;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName CourseJobHandler
 * @Author 开源社区
 * @Date 2026-06-30
 * @Version
 **/
@Component
@Slf4j
public class CourseJobHandler {

    @Autowired
    private ICourseService courseService;

    @XxlJob("courseFinished")
    public void courseFinished(){
        courseService.courseFinished();
    }
}
