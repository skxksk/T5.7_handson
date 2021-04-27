package com.denny.t5.handson.app.emp.form;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmpEditForm implements Serializable {

    /** SerialVersion */
    private static final long serialVersionUID = 9002435830948172659L;

    private String empId;

    @NotNull
    @Size(min = 1, max = 20)
    private String ename;

    @NotNull
    @Size(min = 1, max = 4)
    private String deptId;

    @NotNull
    @Size(min = 1, max = 8)
    private String mgr;

    private String mgrName;

    @NotNull
    @Size(min = 1, max = 3)
    private String jobId;

    @NotNull
    private Date hiredDate;

    @NotNull
    @Min(1)
    private Integer sal;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getMgr() {
        return mgr;
    }

    public void setMgr(String mgr) {
        this.mgr = mgr;
    }

    public String getMgrName() {
        return mgrName;
    }

    public void setMgrName(String mgrName) {
        this.mgrName = mgrName;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

}
