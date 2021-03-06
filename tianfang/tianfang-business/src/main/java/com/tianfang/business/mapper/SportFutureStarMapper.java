package com.tianfang.business.mapper;

import com.tianfang.business.pojo.SportFutureStar;
import com.tianfang.business.pojo.SportFutureStarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SportFutureStarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_future_star
     *
     * @mbggenerated Thu Nov 26 13:51:22 CST 2015
     */
    int countByExample(SportFutureStarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_future_star
     *
     * @mbggenerated Thu Nov 26 13:51:22 CST 2015
     */
    int deleteByExample(SportFutureStarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_future_star
     *
     * @mbggenerated Thu Nov 26 13:51:22 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_future_star
     *
     * @mbggenerated Thu Nov 26 13:51:22 CST 2015
     */
    int insert(SportFutureStar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_future_star
     *
     * @mbggenerated Thu Nov 26 13:51:22 CST 2015
     */
    int insertSelective(SportFutureStar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_future_star
     *
     * @mbggenerated Thu Nov 26 13:51:22 CST 2015
     */
    List<SportFutureStar> selectByExample(SportFutureStarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_future_star
     *
     * @mbggenerated Thu Nov 26 13:51:22 CST 2015
     */
    SportFutureStar selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_future_star
     *
     * @mbggenerated Thu Nov 26 13:51:22 CST 2015
     */
    int updateByExampleSelective(@Param("record") SportFutureStar record, @Param("example") SportFutureStarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_future_star
     *
     * @mbggenerated Thu Nov 26 13:51:22 CST 2015
     */
    int updateByExample(@Param("record") SportFutureStar record, @Param("example") SportFutureStarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_future_star
     *
     * @mbggenerated Thu Nov 26 13:51:22 CST 2015
     */
    int updateByPrimaryKeySelective(SportFutureStar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_future_star
     *
     * @mbggenerated Thu Nov 26 13:51:22 CST 2015
     */
    int updateByPrimaryKey(SportFutureStar record);
}