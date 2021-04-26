package com.denny.t5.handson.domain.model.dto;

import com.denny.t5.handson.domain.model.entity.Emp;

public class EmpInfoDTO extends Emp {

    private String mgrName;
    private String dname;
    private String jname;

    public String getMgrName() {
        return mgrName;
    }

    public void setMgrName(String mgrName) {
        this.mgrName = mgrName;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }
}
