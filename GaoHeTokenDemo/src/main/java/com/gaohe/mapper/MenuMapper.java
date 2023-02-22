package com.gaohe.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gaohe.domain.Menu;

import java.util.List;

public interface MenuMapper extends BaseMapper<Menu> {

    List<String> selectPermsByUserId(Long userId);

}
