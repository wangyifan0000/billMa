package com.kgc.tcmp077.wangyf.service.impl;

import com.kgc.tcmp077.wangyf.entity.Type;
import com.kgc.tcmp077.wangyf.mapper.TypeMapper;
import com.kgc.tcmp077.wangyf.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangyf
 * @create 2020-10-02 9:00
 */
@Service("typeservice")
public class TypeServiceImpl implements TypeService {
    @Resource
    TypeMapper typeMapper;

    @Override
    public Type selectById(int id) {
        Type type = typeMapper.selectByPrimaryKey(id);
        return type;
    }
}
