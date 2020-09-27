package com.example.oauth2.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.example.oauth2.domain.TbUser;

public interface TbUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);

    TbUser selectAllByUsername(@Param("username")String username);



}
