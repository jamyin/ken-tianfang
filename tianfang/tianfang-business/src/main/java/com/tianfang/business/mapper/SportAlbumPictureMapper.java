package com.tianfang.business.mapper;

import com.tianfang.business.pojo.SportAlbumPicture;
import com.tianfang.business.pojo.SportAlbumPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SportAlbumPictureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_album_picture
     *
     * @mbggenerated Wed Dec 23 17:14:41 CST 2015
     */
    int countByExample(SportAlbumPictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_album_picture
     *
     * @mbggenerated Wed Dec 23 17:14:41 CST 2015
     */
    int deleteByExample(SportAlbumPictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_album_picture
     *
     * @mbggenerated Wed Dec 23 17:14:41 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_album_picture
     *
     * @mbggenerated Wed Dec 23 17:14:41 CST 2015
     */
    int insert(SportAlbumPicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_album_picture
     *
     * @mbggenerated Wed Dec 23 17:14:41 CST 2015
     */
    int insertSelective(SportAlbumPicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_album_picture
     *
     * @mbggenerated Wed Dec 23 17:14:41 CST 2015
     */
    List<SportAlbumPicture> selectByExample(SportAlbumPictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_album_picture
     *
     * @mbggenerated Wed Dec 23 17:14:41 CST 2015
     */
    SportAlbumPicture selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_album_picture
     *
     * @mbggenerated Wed Dec 23 17:14:41 CST 2015
     */
    int updateByExampleSelective(@Param("record") SportAlbumPicture record, @Param("example") SportAlbumPictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_album_picture
     *
     * @mbggenerated Wed Dec 23 17:14:41 CST 2015
     */
    int updateByExample(@Param("record") SportAlbumPicture record, @Param("example") SportAlbumPictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_album_picture
     *
     * @mbggenerated Wed Dec 23 17:14:41 CST 2015
     */
    int updateByPrimaryKeySelective(SportAlbumPicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sport_album_picture
     *
     * @mbggenerated Wed Dec 23 17:14:41 CST 2015
     */
    int updateByPrimaryKey(SportAlbumPicture record);
}