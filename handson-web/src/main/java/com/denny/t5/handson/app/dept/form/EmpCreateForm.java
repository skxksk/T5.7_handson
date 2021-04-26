package com.denny.t5.handson.app.dept.form;

import java.io.Serializable;

public class EmpCreateForm implements Serializable {

    /** SerialVersion */
    private static final long serialVersionUID = 9002435830948172659L;

    private String empId;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

}
