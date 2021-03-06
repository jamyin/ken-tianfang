package com.tianfang.business.pojo;

import java.util.Date;

public class SportTeamType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sport_team_type.type_id
     *
     * @mbggenerated Tue Nov 17 15:40:03 CST 2015
     */
    private String typeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sport_team_type.type_name
     *
     * @mbggenerated Tue Nov 17 15:40:03 CST 2015
     */
    private String typeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sport_team_type.last_update_time
     *
     * @mbggenerated Tue Nov 17 15:40:03 CST 2015
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sport_team_type.create_time
     *
     * @mbggenerated Tue Nov 17 15:40:03 CST 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sport_team_type.stat
     *
     * @mbggenerated Tue Nov 17 15:40:03 CST 2015
     */
    private Integer stat;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sport_team_type.type_id
     *
     * @return the value of sport_team_type.type_id
     *
     * @mbggenerated Tue Nov 17 15:40:03 CST 2015
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sport_team_type.type_id
     *
     * @param typeId the value for sport_team_type.type_id
     *
     * @mbggenerated Tue Nov 17 15:40:03 CST 2015
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sport_team_type.type_name
     *
     * @return the value of sport_team_type.type_name
     *
     * @mbggenerated Tue Nov 17 15:40:03 CST 2015
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sport_team_type.type_name
     *
     * @param typeName the value for sport_team_type.type_name
     *
     * @mbggenerated Tue Nov 17 15:40:03 CST 2015
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sport_team_type.last_update_time
     *
     * @return the value of sport_team_type.last_update_time
     *
     * @mbggenerated Tue Nov 17 15:40:03 CST 2015
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sport_team_type.last_update_time
     *
     * @param lastUpdateTime the value for sport_team_type.last_update_time
     *
     * @mbggenerated Tue Nov 17 15:40:03 CST 2015
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sport_team_type.create_time
     *
     * @return the value of sport_team_type.create_time
     *
     * @mbggenerated Tue Nov 17 15:40:03 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sport_team_type.create_time
     *
     * @param createTime the value for sport_team_type.create_time
     *
     * @mbggenerated Tue Nov 17 15:40:03 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sport_team_type.stat
     *
     * @return the value of sport_team_type.stat
     *
     * @mbggenerated Tue Nov 17 15:40:03 CST 2015
     */
    public Integer getStat() {
        return stat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sport_team_type.stat
     *
     * @param stat the value for sport_team_type.stat
     *
     * @mbggenerated Tue Nov 17 15:40:03 CST 2015
     */
    public void setStat(Integer stat) {
        this.stat = stat;
    }
}