package com.denny.t5.handson.app.dept.form;

import java.io.Serializable;

public class EmpSearchForm implements Serializable {

    /** SerialVersion */
    private static final long serialVersionUID = 771427700203092525L;

    private String empId;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

}
