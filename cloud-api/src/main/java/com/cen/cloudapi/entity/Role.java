package com.cen.cloudapi.entity;

public class Role {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.id
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.rolename
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    private String rolename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.remark
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.flag
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    private String flag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.id
     *
     * @return the value of sys_role.id
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.id
     *
     * @param id the value for sys_role.id
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.rolename
     *
     * @return the value of sys_role.rolename
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.rolename
     *
     * @param rolename the value for sys_role.rolename
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.remark
     *
     * @return the value of sys_role.remark
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.remark
     *
     * @param remark the value for sys_role.remark
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.flag
     *
     * @return the value of sys_role.flag
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    public String getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.flag
     *
     * @param flag the value for sys_role.flag
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
}