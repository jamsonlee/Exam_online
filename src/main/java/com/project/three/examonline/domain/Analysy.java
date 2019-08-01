package com.project.three.examonline.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Analysy {
    private Integer zongrenshu;
    private Integer pass;
    private Integer notpass;
    private Double average;
    private Integer max;
    private Integer min;
    private Double zhongwei;
    private Integer examId;

    public Integer getZongrenshu() {
        return zongrenshu;
    }

    public void setZongrenshu(Integer zongrenshu) {
        this.zongrenshu = zongrenshu;
    }

    public Integer getPass() {
        return pass;
    }

    public void setPass(Integer pass) {
        this.pass = pass;
    }

    public Integer getNotpass() {
        return notpass;
    }

    public void setNotpass(Integer notpass) {
        this.notpass = notpass;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Double getZhongwei() {
        return zhongwei;
    }

    public void setZhongwei(Double zhongwei) {
        this.zhongwei = zhongwei;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    @Override
    public String toString() {
        return "Analysy{" +
                "zongrenshu=" + zongrenshu +
                ", pass=" + pass +
                ", notpass=" + notpass +
                ", average=" + average +
                ", max=" + max +
                ", min=" + min +
                ", zhongwei=" + zhongwei +
                ", examId=" + examId +
                '}';
    }

    public Analysy(int zongrenshu, int pass, int notpass, double average, int max, int min, double zhongwei, int examId) {
        this.zongrenshu = zongrenshu;
        this.pass = pass;
        this.notpass = notpass;
        this.average = average;
        this.max = max;
        this.min = min;
        this.zhongwei = zhongwei;
        this.examId = examId;
    }
}
