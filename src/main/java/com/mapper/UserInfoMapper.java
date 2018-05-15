package com.mapper;

import com.bean.UserInfo;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
@Repository
public interface UserInfoMapper extends Mapper<UserInfo> {
    @Override
    int insert(UserInfo record);
}