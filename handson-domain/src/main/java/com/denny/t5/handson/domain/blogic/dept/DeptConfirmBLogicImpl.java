package com.denny.t5.handson.domain.blogic.dept;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.denny.t5.handson.domain.mapper.DeptMapper;
import com.denny.t5.handson.domain.model.entity.Dept;

@Service
@Transactional
public class DeptConfirmBLogicImpl implements DeptConfirmBLogic {

    @Inject
    private DeptMapper deptMapper;

    @Override
    public List<Dept> getDeptList() {

        return deptMapper.selectAll();
    }

}
