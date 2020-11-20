package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    /**
     * 保存
     */
    void save(User user);

    /**
     * 查询
     * @param id
     * @return
     */
    User get(Long id);
}
