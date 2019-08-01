package com.project.three.examonline.service;

import com.project.three.examonline.dao.CheckMapper;
import com.project.three.examonline.domain.Check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckServiceImp implements CheckService{
    @Autowired
    private CheckMapper checkMapper;

    @Override
    public void InsertCheck(Check check) {
        checkMapper.InsertCheck(check);
    }

    @Override
    public void updateCheck(Check check) {
        checkMapper.InsertCheck(check);
    }

    @Override
    public List<Check> queryCheck(Check check) {
        return checkMapper.queryCheck(check);
    }
}
