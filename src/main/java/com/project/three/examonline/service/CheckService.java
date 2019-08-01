package com.project.three.examonline.service;

import com.project.three.examonline.domain.Check;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CheckService {
    public void InsertCheck(Check check);
    public void updateCheck(Check check);
    public List<Check> queryCheck(Check check);
}
