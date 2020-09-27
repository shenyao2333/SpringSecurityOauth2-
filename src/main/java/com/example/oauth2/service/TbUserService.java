package com.example.oauth2.service;

import com.example.oauth2.domain.TbUser;
public interface TbUserService{


    int deleteByPrimaryKey(Long id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);

    TbUser selectAllByUsername(String username);

}
