package com.nuaa.learning.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuaa.api.dto.leanring.LearningLessonDTO;
import com.nuaa.learning.domain.dto.LearningRecordFormDTO;
import com.nuaa.learning.domain.po.LearningRecord;

/**
 * <p>
 * 学习记录表 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface ILearningRecordService extends IService<LearningRecord> {

    LearningLessonDTO queryLearningRecordByCourse(Long courseId);

    void addLearningRecord(LearningRecordFormDTO formDTO);
}
