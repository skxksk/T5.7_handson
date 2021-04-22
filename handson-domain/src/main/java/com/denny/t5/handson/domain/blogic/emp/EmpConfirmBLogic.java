package com.denny.t5.handson.domain.blogic.emp;

import java.util.List;

import com.denny.t5.handson.domain.model.dto.EmpInfoDTO;

public interface EmpConfirmBLogic {
    List<EmpInfoDTO> getEmpList(String deptId);
}
