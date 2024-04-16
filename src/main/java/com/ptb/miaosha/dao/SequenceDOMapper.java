package com.ptb.miaosha.dao;

import com.ptb.miaosha.dataobject.SequenceDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SequenceDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Thu Apr 11 19:17:49 CST 2024
     */
    int deleteByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Thu Apr 11 19:17:49 CST 2024
     */
    int insert(SequenceDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Thu Apr 11 19:17:49 CST 2024
     */
    int insertSelective(SequenceDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Thu Apr 11 19:17:49 CST 2024
     */
    SequenceDO selectByPrimaryKey(String name);

    SequenceDO getSequenceByName(String name);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Thu Apr 11 19:17:49 CST 2024
     */
    int updateByPrimaryKeySelective(SequenceDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Thu Apr 11 19:17:49 CST 2024
     */
    int updateByPrimaryKey(SequenceDO record);
}