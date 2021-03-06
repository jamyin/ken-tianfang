package com.tianfang.company.mapper;

import com.tianfang.company.pojo.SportCompanyRelated;
import com.tianfang.company.pojo.SportCompanyRelatedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SportCompanyRelatedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_company_related
     *
     * @mbggenerated Fri Dec 04 16:59:27 CST 2015
     */
    int countByExample(SportCompanyRelatedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_company_related
     *
     * @mbggenerated Fri Dec 04 16:59:27 CST 2015
     */
    int deleteByExample(SportCompanyRelatedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_company_related
     *
     * @mbggenerated Fri Dec 04 16:59:27 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_company_related
     *
     * @mbggenerated Fri Dec 04 16:59:27 CST 2015
     */
    int insert(SportCompanyRelated record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_company_related
     *
     * @mbggenerated Fri Dec 04 16:59:27 CST 2015
     */
    int insertSelective(SportCompanyRelated record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_company_related
     *
     * @mbggenerated Fri Dec 04 16:59:27 CST 2015
     */
    List<SportCompanyRelated> selectByExample(SportCompanyRelatedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_company_related
     *
     * @mbggenerated Fri Dec 04 16:59:27 CST 2015
     */
    SportCompanyRelated selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_company_related
     *
     * @mbggenerated Fri Dec 04 16:59:27 CST 2015
     */
    int updateByExampleSelective(@Param("record") SportCompanyRelated record, @Param("example") SportCompanyRelatedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_company_related
     *
     * @mbggenerated Fri Dec 04 16:59:27 CST 2015
     */
    int updateByExample(@Param("record") SportCompanyRelated record, @Param("example") SportCompanyRelatedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_company_related
     *
     * @mbggenerated Fri Dec 04 16:59:27 CST 2015
     */
    int updateByPrimaryKeySelective(SportCompanyRelated record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_company_related
     *
     * @mbggenerated Fri Dec 04 16:59:27 CST 2015
     */
    int updateByPrimaryKey(SportCompanyRelated record);
}