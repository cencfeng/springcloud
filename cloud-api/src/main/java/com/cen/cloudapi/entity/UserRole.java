package com.cen.cloudapi.entity;

public class UserRole {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.id
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.user_id
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.role_id
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    private Integer roleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.id
     *
     * @return the value of sys_user_role.id
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.id
     *
     * @param id the value for sys_user_role.id
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.user_id
     *
     * @return the value of sys_user_role.user_id
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.user_id
     *
     * @param userId the value for sys_user_role.user_id
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.role_id
     *
     * @return the value of sys_user_role.role_id
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.role_id
     *
     * @param roleId the value for sys_user_role.role_id
     *
     * @mbg.generated Mon May 06 17:01:48 CST 2019
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}