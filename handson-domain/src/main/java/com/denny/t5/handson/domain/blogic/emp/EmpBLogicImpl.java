package com.denny.t5.handson.domain.blogic.emp;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.terasoluna.gfw.common.exception.BusinessException;

import com.denny.t5.handson.domain.mapper.EmpMapper;
import com.denny.t5.handson.domain.model.dto.EmpInfoDTO;

@Service
@Transactional
public class EmpBLogicImpl implements EmpBLogic {

    private static final Logger logger = LoggerFactory.getLogger(EmpBLogicImpl.class);

    @Inject
    private EmpMapper empMapper;

    @Override
    public List<EmpInfoDTO> getEmpList(String deptId) {

        List<EmpInfoDTO> empInfoList = empMapper.selectByDeptId(deptId);
        if (empInfoList.isEmpty()) {
            logger.warn("社員情報が存在しません。");
        }

        return empInfoList;
    }

    @Override
    public EmpInfoDTO getEmpDetailInfo(String empId) {

        EmpInfoDTO empInfo = empMapper.selectByEmpId(empId);

        if (empInfo == null) {
            throw new BusinessException("社員情報が存在しません。");
        }

        return empInfo;
    }
}
