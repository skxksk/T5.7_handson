package com.denny.t5.handson.app.emp.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmpSearchForm implements Serializable {

    /** SerialVersion */
    private static final long serialVersionUID = 771427700203092525L;

    private String empId;

}
