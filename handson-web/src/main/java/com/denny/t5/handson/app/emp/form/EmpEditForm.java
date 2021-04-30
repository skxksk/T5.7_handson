package com.denny.t5.handson.app.emp.form;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmpEditForm implements Serializable {

    /** SerialVersion */
    private static final long serialVersionUID = 9002435830948172659L;

    private String empId;

    @NotNull
    @Size(min = 1, max = 20)
    private String ename;

    @NotBlank
    private String deptId;

    @NotBlank
    private String mgr;

    private String mgrName;

    @NotBlank
    private String jobId;

    @NotBlank
    @DateTimeFormat
    private String hiredDate;

    @NotNull
    @Min(1)
    private Integer sal;
}
