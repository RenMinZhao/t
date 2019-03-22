package cn.bdqn.attend_manage.entity;
/*class 是关键字*/
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Clazz {
    private Integer classId;
    private String classNum;
    private Integer classType;
    private Integer classHeadteacherId;
    private Integer classTeacherId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;
    private Integer classStatus;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public Integer getClassType() {
        return classType;
    }

    public void setClassType(Integer classType) {
        this.classType = classType;
    }

    public Integer getClassHeadteacherId() {
        return classHeadteacherId;
    }

    public void setClassHeadteacherId(Integer classHeadteacherId) {
        this.classHeadteacherId = classHeadteacherId;
    }

    public Integer getClassTeacherId() {
        return classTeacherId;
    }

    public void setClassTeacherId(Integer classTeacherId) {
        this.classTeacherId = classTeacherId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(Integer classStatus) {
        this.classStatus = classStatus;
    }
}
