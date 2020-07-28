package com.example.mapper;

import com.example.entity.Blog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2020-06-15
 */
public interface BlogMapper extends BaseMapper<Blog> {

    //测试自定义 SQL
    public void deletetest();

}
