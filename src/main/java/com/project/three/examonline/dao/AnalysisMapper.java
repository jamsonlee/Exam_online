package com.project.three.examonline.dao;

import java.util.List;

import com.project.three.examonline.domain.Analysis;

public interface AnalysisMapper {
	public void InsertAnalysis(Analysis analysis);
	public void deleteAnalysis(Analysis analysis);
	public void updateAnalysis(Analysis analysis);
	public List<Analysis> queryAnalysis(Analysis analysis);
	public List<Analysis> queryAnalysisByExam(Integer examId);
}
