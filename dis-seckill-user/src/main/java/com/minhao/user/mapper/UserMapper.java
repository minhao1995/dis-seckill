package com.minhao.user.mapper;

import com.minhao.user.domain.User;

public interface UserMapper {
    /**
     * 保存用户
     * @param user
     * @return
     */
    int saveUser(User user);
}
