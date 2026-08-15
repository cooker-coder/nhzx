package com.nuaa.exam.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuaa.api.dto.exam.QuestionDTO;
import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.exam.domain.dto.QuestionFormDTO;
import com.nuaa.exam.domain.po.Question;
import com.nuaa.exam.domain.query.QuestionPageQuery;
import com.nuaa.exam.domain.vo.QuestionDetailVO;
import com.nuaa.exam.domain.vo.QuestionPageVO;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 题目 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface IQuestionService extends IService<Question> {

    void addQuestion(QuestionFormDTO questionFormDTO);

    void updateQuestion(QuestionFormDTO questionDTO);

    void deleteQuestionById(Long id);

    PageDTO<QuestionPageVO> queryQuestionByPage(QuestionPageQuery query);

    QuestionDetailVO queryQuestionDetailById(Long id);

    List<QuestionDTO> queryQuestionByIds(List<Long> ids);

    Map<Long, Integer> countQuestionNumOfCreater(List<Long> createrIds);

    List<QuestionDTO> queryQuestionByBizId(Long bizId);

    Boolean checkNameValid(String name);

    Map<Long, Integer> queryQuestionScores(List<Long> ids);
}
