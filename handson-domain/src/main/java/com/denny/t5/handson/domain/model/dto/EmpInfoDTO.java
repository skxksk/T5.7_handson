package com.denny.t5.handson.domain.model.dto;

import com.denny.t5.handson.domain.model.entity.Emp;

public class EmpInfoDTO extends Emp {

    private String mgrName;

    public String getMgrName() {
        return mgrName;
    }

    public void setMgrName(String mgrName) {
        this.mgrName = mgrName;
    }
}
