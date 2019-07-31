package com.project.three.examonline.service;

import com.project.three.examonline.domain.Paper;
import com.project.three.examonline.domain.PaperQuestion;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 这是试卷的service接口，包含增删改查试卷和更新试卷内的试题功能。
 */
@Service
public interface PaperService {
  void insertPaper(Paper paper);
  void deletePaper(Paper paper);
  void updatePaper(Paper paper);
  List<Paper> queryPaper(Paper paper);

  void updateQuestion(PaperQuestion paperquestion);
}
