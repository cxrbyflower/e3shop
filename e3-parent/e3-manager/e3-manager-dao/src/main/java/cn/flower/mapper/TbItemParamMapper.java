package cn.flower.mapper;

import cn.flower.pojo.TbItemParam;
import cn.flower.pojo.TbItemParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemParamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Tue Sep 24 08:35:07 CST 2019
     */
    int countByExample(TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Tue Sep 24 08:35:07 CST 2019
     */
    int deleteByExample(TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Tue Sep 24 08:35:07 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Tue Sep 24 08:35:07 CST 2019
     */
    int insert(TbItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Tue Sep 24 08:35:07 CST 2019
     */
    int insertSelective(TbItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Tue Sep 24 08:35:07 CST 2019
     */
    List<TbItemParam> selectByExampleWithBLOBs(TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Tue Sep 24 08:35:07 CST 2019
     */
    List<TbItemParam> selectByExample(TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Tue Sep 24 08:35:07 CST 2019
     */
    TbItemParam selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Tue Sep 24 08:35:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Tue Sep 24 08:35:07 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Tue Sep 24 08:35:07 CST 2019
     */
    int updateByExample(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Tue Sep 24 08:35:07 CST 2019
     */
    int updateByPrimaryKeySelective(TbItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Tue Sep 24 08:35:07 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(TbItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Tue Sep 24 08:35:07 CST 2019
     */
    int updateByPrimaryKey(TbItemParam record);
}