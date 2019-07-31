package com.project.three.examonline.dao;

import java.util.List;

import com.project.three.examonline.domain.PaperQuestion;
import org.apache.ibatis.annotations.Mapper;

import com.project.three.examonline.domain.Paper;

@Mapper
public interface PaperMapper {
	public void insertPaper(Paper paper);
	public void deletePaper(Paper paper);
	public void updatePaper(Paper paper);
	public List<Paper> queryPaper(Paper paper);

	public void insertQuestion(PaperQuestion paperquestion);
	public void deleteQuestion(Integer paperId);
	public void updateQuestion(PaperQuestion paperquestion);
	public String queryQuestion(Integer paperId);
}
