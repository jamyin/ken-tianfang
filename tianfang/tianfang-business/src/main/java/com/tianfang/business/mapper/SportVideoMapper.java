package com.tianfang.business.mapper;

import com.tianfang.business.pojo.SportVideo;
import com.tianfang.business.pojo.SportVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SportVideoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_video
     *
     * @mbggenerated Thu Dec 03 14:33:21 CST 2015
     */
    int countByExample(SportVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_video
     *
     * @mbggenerated Thu Dec 03 14:33:21 CST 2015
     */
    int deleteByExample(SportVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_video
     *
     * @mbggenerated Thu Dec 03 14:33:21 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_video
     *
     * @mbggenerated Thu Dec 03 14:33:21 CST 2015
     */
    int insert(SportVideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_video
     *
     * @mbggenerated Thu Dec 03 14:33:21 CST 2015
     */
    int insertSelective(SportVideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_video
     *
     * @mbggenerated Thu Dec 03 14:33:21 CST 2015
     */
    List<SportVideo> selectByExample(SportVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_video
     *
     * @mbggenerated Thu Dec 03 14:33:21 CST 2015
     */
    SportVideo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_video
     *
     * @mbggenerated Thu Dec 03 14:33:21 CST 2015
     */
    int updateByExampleSelective(@Param("record") SportVideo record, @Param("example") SportVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_video
     *
     * @mbggenerated Thu Dec 03 14:33:21 CST 2015
     */
    int updateByExample(@Param("record") SportVideo record, @Param("example") SportVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_video
     *
     * @mbggenerated Thu Dec 03 14:33:21 CST 2015
     */
    int updateByPrimaryKeySelective(SportVideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_video
     *
     * @mbggenerated Thu Dec 03 14:33:21 CST 2015
     */
    int updateByPrimaryKey(SportVideo record);
}