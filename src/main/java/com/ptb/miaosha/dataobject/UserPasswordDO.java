package com.ptb.miaosha.dataobject;

public class UserPasswordDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_password.id
     *
     * @mbg.generated Mon Apr 01 21:13:33 CST 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_password.encrpt_password
     *
     * @mbg.generated Mon Apr 01 21:13:33 CST 2024
     */
    private String encrptPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_password.user_id
     *
     * @mbg.generated Mon Apr 01 21:13:33 CST 2024
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_password.id
     *
     * @return the value of user_password.id
     *
     * @mbg.generated Mon Apr 01 21:13:33 CST 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_password.id
     *
     * @param id the value for user_password.id
     *
     * @mbg.generated Mon Apr 01 21:13:33 CST 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_password.encrpt_password
     *
     * @return the value of user_password.encrpt_password
     *
     * @mbg.generated Mon Apr 01 21:13:33 CST 2024
     */
    public String getEncrptPassword() {
        return encrptPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_password.encrpt_password
     *
     * @param encrptPassword the value for user_password.encrpt_password
     *
     * @mbg.generated Mon Apr 01 21:13:33 CST 2024
     */
    public void setEncrptPassword(String encrptPassword) {
        this.encrptPassword = encrptPassword == null ? null : encrptPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_password.user_id
     *
     * @return the value of user_password.user_id
     *
     * @mbg.generated Mon Apr 01 21:13:33 CST 2024
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_password.user_id
     *
     * @param userId the value for user_password.user_id
     *
     * @mbg.generated Mon Apr 01 21:13:33 CST 2024
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}