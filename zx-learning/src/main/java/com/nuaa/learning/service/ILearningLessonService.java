package com.nuaa.learning.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.common.domain.query.PageQuery;
import com.nuaa.learning.domain.po.LearningLesson;
import com.nuaa.learning.domain.vo.LearningLessonVO;
import com.nuaa.learning.domain.vo.LearningPlanPageVO;

import java.util.List;

/**
 * <p>
 * 学生课程表 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface ILearningLessonService extends IService<LearningLesson> {

    void addUserLessons(Long userId, List<Long> courseIds);

    PageDTO<LearningLessonVO> queryMyLessons(PageQuery query);

    LearningLessonVO queryMyCurrentLesson();

    LearningLessonVO queryLessonByCourseId(Long courseId);

    void deleteCourseFromLesson(Long userId, Long courseId);

    Integer countLearningLessonByCourse(Long courseId);

    Long isLessonValid(Long courseId);

    LearningLesson queryByUserAndCourseId(Long userId, Long courseId);

    void createLearningPlan(Long courseId, Integer freq);

    LearningPlanPageVO queryMyPlans(PageQuery query);
}
