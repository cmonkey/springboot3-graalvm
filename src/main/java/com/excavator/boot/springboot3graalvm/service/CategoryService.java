package com.excavator.boot.springboot3graalvm.service;


import cn.hutool.core.bean.BeanUtil;
import com.excavator.boot.springboot3graalvm.entity.ScenesCategory;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final JdbcTemplate jdbcTemplate;

    public CategoryService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Optional<List<ScenesCategory>> queryPrimaryCategorys(){
        var values = jdbcTemplate.queryForList("select * from t_scenes_category where categoryLevel = 1");
        if(CollectionUtils.isNotEmpty(values)){
            var categorys = values.parallelStream().map(value -> BeanUtil.toBean(value, ScenesCategory.class)).toList();
            return Optional.ofNullable(categorys);
        }else{
            return Optional.empty();
        }
    }
}
