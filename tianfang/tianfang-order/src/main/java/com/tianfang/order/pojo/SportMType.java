package com.tianfang.order.pojo;

import java.io.Serializable;
import java.util.Date;

public class SportMType implements Serializable  {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sport_m_type.id
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sport_m_type.type_name
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    private String typeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sport_m_type.type_order
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    private Integer typeOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sport_m_type.create_time
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sport_m_type.last_update_time
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sport_m_type.stat
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    private Integer stat;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sport_m_type.id
     *
     * @return the value of sport_m_type.id
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sport_m_type.id
     *
     * @param id the value for sport_m_type.id
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sport_m_type.type_name
     *
     * @return the value of sport_m_type.type_name
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sport_m_type.type_name
     *
     * @param typeName the value for sport_m_type.type_name
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sport_m_type.type_order
     *
     * @return the value of sport_m_type.type_order
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    public Integer getTypeOrder() {
        return typeOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sport_m_type.type_order
     *
     * @param typeOrder the value for sport_m_type.type_order
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    public void setTypeOrder(Integer typeOrder) {
        this.typeOrder = typeOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sport_m_type.create_time
     *
     * @return the value of sport_m_type.create_time
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sport_m_type.create_time
     *
     * @param createTime the value for sport_m_type.create_time
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sport_m_type.last_update_time
     *
     * @return the value of sport_m_type.last_update_time
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sport_m_type.last_update_time
     *
     * @param lastUpdateTime the value for sport_m_type.last_update_time
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sport_m_type.stat
     *
     * @return the value of sport_m_type.stat
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    public Integer getStat() {
        return stat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sport_m_type.stat
     *
     * @param stat the value for sport_m_type.stat
     *
     * @mbggenerated Wed Jan 06 10:00:40 CST 2016
     */
    public void setStat(Integer stat) {
        this.stat = stat;
    }
}