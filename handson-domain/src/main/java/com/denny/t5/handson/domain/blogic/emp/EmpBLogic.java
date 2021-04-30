package com.denny.t5.handson.domain.blogic.emp;

import java.util.List;

import com.denny.t5.handson.domain.model.dto.EmpInfoDTO;
import com.denny.t5.handson.domain.model.entity.Emp;

public interface EmpBLogic {

    List<EmpInfoDTO> getEmpList(String deptId);

    EmpInfoDTO getEmpDetailInfo(String empId);

    List<EmpInfoDTO> getMgrInfoList(String deptId, String jobId);

    /**
     * 社員情報を登録／更新
     *
     * @param emp 社員情報
     * @return 社員ID
     */
    String updateEmpInfo(Emp emp);
}
