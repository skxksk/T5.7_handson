package com.denny.t5.handson.domain.mapper;

import com.denny.t5.handson.domain.model.entity.Emp;

public interface EmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    int deleteByPrimaryKey(Integer empId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    int insert(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    int insertSelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    Emp selectByPrimaryKey(Integer empId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    int updateByPrimaryKeySelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    int updateByPrimaryKey(Emp record);
}