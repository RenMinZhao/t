package cn.bdqn.attend_manage.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Students {
    private Integer stuId;
    private String stuName;
    private Integer stuClassType;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stuAdmissionTime;
    private Integer stuStatus;
    private String stuEmail;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuClassType() {
        return stuClassType;
    }

    public void setStuClassType(Integer stuClassType) {
        this.stuClassType = stuClassType;
    }

    public Date getStuAdmissionTime() {
        return stuAdmissionTime;
    }

    public void setStuAdmissionTime(Date stuAdmissionTime) {
        this.stuAdmissionTime = stuAdmissionTime;
    }

    public Integer getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(Integer stuStatus) {
        this.stuStatus = stuStatus;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail;
    }
}
