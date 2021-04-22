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

        List<Dept> resultList = deptMapper.selectAll();

//        Dept dept = new Dept();
//        dept.setDeptId("123");
//        dept.setDname("人事部");
//        dept.setLoc("豊洲");
//        dept.setCreatedAt(new Date());
//        dept.setCreatedAt(new Date());
//        resultList.add(dept);

        return resultList;
    }

}
