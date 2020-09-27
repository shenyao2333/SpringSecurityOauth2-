package com.example.oauth2.service.impi;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.oauth2.mapper.TbUserMapper;
import com.example.oauth2.domain.TbUser;
import com.example.oauth2.service.TbUserService;
@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbUser record) {
        return tbUserMapper.insert(record);
    }

    @Override
    public int insertSelective(TbUser record) {
        return tbUserMapper.insertSelective(record);
    }

    @Override
    public TbUser selectByPrimaryKey(Long id) {
        return tbUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TbUser record) {
        return tbUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbUser record) {
        return tbUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public TbUser selectAllByUsername(String username) {
        return tbUserMapper.selectAllByUsername(username);
    }

}
