package com.project.three.examonline.dao;

import java.util.List;

import com.project.three.examonline.domain.Check;

public interface CheckMapper {
	public void InsertCheck(Check check);
	public void updateCheck(Check check);
	public List<Check> queryCheck(Check check);
}
