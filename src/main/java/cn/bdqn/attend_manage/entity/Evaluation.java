package cn.bdqn.attend_manage.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Evaluation {
    private Integer evaluationId;
    private Integer evaluationClassId;
    private Integer evaluationStatus;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date evaluationCreateTime;
    private String evaluationNum;

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Integer getEvaluationClassId() {
        return evaluationClassId;
    }

    public void setEvaluationClassId(Integer evaluationClassId) {
        this.evaluationClassId = evaluationClassId;
    }

    public Integer getEvaluationStatus() {
        return evaluationStatus;
    }

    public void setEvaluationStatus(Integer evaluationStatus) {
        this.evaluationStatus = evaluationStatus;
    }

    public Date getEvaluationCreateTime() {
        return evaluationCreateTime;
    }

    public void setEvaluationCreateTime(Date evaluationCreateTime) {
        this.evaluationCreateTime = evaluationCreateTime;
    }

    public String getEvaluationNum() {
        return evaluationNum;
    }

    public void setEvaluationNum(String evaluationNum) {
        this.evaluationNum = evaluationNum;
    }
}
