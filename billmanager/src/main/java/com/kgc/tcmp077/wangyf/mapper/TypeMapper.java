package com.kgc.tcmp077.wangyf.mapper;

import com.kgc.tcmp077.wangyf.entity.Type;
import com.kgc.tcmp077.wangyf.entity.TypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TypeMapper {
    int countByExample(TypeExample example);

    int deleteByExample(TypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Type record);

    int insertSelective(Type record);

    List<Type> selectByExample(TypeExample example);

    Type selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Type record, @Param("example") TypeExample example);

    int updateByExample(@Param("record") Type record, @Param("example") TypeExample example);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
}