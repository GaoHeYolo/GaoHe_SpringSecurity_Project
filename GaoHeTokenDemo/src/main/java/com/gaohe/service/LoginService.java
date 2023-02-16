package com.gaohe.service;

import com.gaohe.domain.ResponseResult;
import com.gaohe.domain.User;

public interface LoginService {
    ResponseResult login(User user);
}
