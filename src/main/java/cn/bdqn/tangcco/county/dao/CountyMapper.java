package cn.bdqn.tangcco.county.dao;

import cn.bdqn.tangcco.entity.County;
import cn.bdqn.tangcco.entity.CountyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountyMapper {
    long countByExample(CountyExample example);

    int deleteByExample(CountyExample example);

    int deleteByPrimaryKey(Integer countyid);

    int insert(County record);

    int insertSelective(County record);

    List<County> selectByExample(CountyExample example);

    County selectByPrimaryKey(Integer countyid);

    int updateByExampleSelective(@Param("record") County record, @Param("example") CountyExample example);

    int updateByExample(@Param("record") County record, @Param("example") CountyExample example);

    int updateByPrimaryKeySelective(County record);

    int updateByPrimaryKey(County record);
}