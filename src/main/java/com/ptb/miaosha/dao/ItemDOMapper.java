package com.ptb.miaosha.dao;

import com.ptb.miaosha.dataobject.ItemDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ItemDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Apr 09 18:27:26 CST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Apr 09 18:27:26 CST 2024
     */
    int insert(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Apr 09 18:27:26 CST 2024
     */
    int insertSelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Apr 09 18:27:26 CST 2024
     */
    List<ItemDO> listItem();

    ItemDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Apr 09 18:27:26 CST 2024
     */
    int updateByPrimaryKeySelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Apr 09 18:27:26 CST 2024
     */
    int updateByPrimaryKey(ItemDO record);

    int increaseSales(@Param("id") Integer id,@Param("amount") Integer amount);
}