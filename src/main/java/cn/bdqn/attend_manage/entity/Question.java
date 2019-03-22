package cn.bdqn.attend_manage.entity;

public class Question {
    private Integer questionId;
    private Integer questionClassTypeId;
    private  String  questionName;
    private String questionOption1;
    private String questionOption2;
    private String questionOption3;
    private String questionOption4;
    private String questionOption5;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getQuestionClassTypeId() {
        return questionClassTypeId;
    }

    public void setQuestionClassTypeId(Integer questionClassTypeId) {
        this.questionClassTypeId = questionClassTypeId;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public String getQuestionOption1() {
        return questionOption1;
    }

    public void setQuestionOption1(String questionOption1) {
        this.questionOption1 = questionOption1;
    }

    public String getQuestionOption2() {
        return questionOption2;
    }

    public void setQuestionOption2(String questionOption2) {
        this.questionOption2 = questionOption2;
    }

    public String getQuestionOption3() {
        return questionOption3;
    }

    public void setQuestionOption3(String questionOption3) {
        this.questionOption3 = questionOption3;
    }

    public String getQuestionOption4() {
        return questionOption4;
    }

    public void setQuestionOption4(String questionOption4) {
        this.questionOption4 = questionOption4;
    }

    public String getQuestionOption5() {
        return questionOption5;
    }

    public void setQuestionOption5(String questionOption5) {
        this.questionOption5 = questionOption5;
    }
}
