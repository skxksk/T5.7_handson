package com.denny.t5.handson.domain.model.entity;

import java.util.Date;

public class Dept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEPT.DEPT_ID
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    private String deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEPT.DNAME
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    private String dname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEPT.LOC
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    private String loc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEPT.CREATED_AT
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEPT.UPDATED_AT
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEPT.DEPT_ID
     *
     * @return the value of DEPT.DEPT_ID
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEPT.DEPT_ID
     *
     * @param deptId the value for DEPT.DEPT_ID
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEPT.DNAME
     *
     * @return the value of DEPT.DNAME
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    public String getDname() {
        return dname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEPT.DNAME
     *
     * @param dname the value for DEPT.DNAME
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    public void setDname(String dname) {
        this.dname = dname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEPT.LOC
     *
     * @return the value of DEPT.LOC
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    public String getLoc() {
        return loc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEPT.LOC
     *
     * @param loc the value for DEPT.LOC
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    public void setLoc(String loc) {
        this.loc = loc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEPT.CREATED_AT
     *
     * @return the value of DEPT.CREATED_AT
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEPT.CREATED_AT
     *
     * @param createdAt the value for DEPT.CREATED_AT
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEPT.UPDATED_AT
     *
     * @return the value of DEPT.UPDATED_AT
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEPT.UPDATED_AT
     *
     * @param updatedAt the value for DEPT.UPDATED_AT
     *
     * @mbg.generated Wed Apr 21 19:10:51 JST 2021
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}