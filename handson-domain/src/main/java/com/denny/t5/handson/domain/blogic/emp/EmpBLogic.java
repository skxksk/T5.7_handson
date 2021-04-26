package com.denny.t5.handson.domain.blogic.emp;

import java.util.List;

import com.denny.t5.handson.domain.model.dto.EmpInfoDTO;

public interface EmpBLogic {
    List<EmpInfoDTO> getEmpList(String deptId);

    EmpInfoDTO getEmpDetailInfo(String empId);
}
