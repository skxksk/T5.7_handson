package com.denny.t5.handson.domain.blogic.emp;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.denny.t5.handson.domain.mapper.EmpMapper;
import com.denny.t5.handson.domain.model.dto.EmpInfoDTO;

@Service
@Transactional
public class EmpConfirmBLogicImpl implements EmpConfirmBLogic {

    @Inject
    private EmpMapper empMapper;

    @Override
    public List<EmpInfoDTO> getEmpList(String deptId) {
        return empMapper.selectByDeptId(deptId);
    }
}
