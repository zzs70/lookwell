package cn.bdqn.tangcco.user.services.impl;

import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.entity.TbuserExample;
import cn.bdqn.tangcco.user.dao.TbuserMapper;
import cn.bdqn.tangcco.user.services.TbuserServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/6/1.
 */
@Service
public class TbuserServicesImpl implements TbuserServices {
    @Resource
    private TbuserMapper tbuserMapper;
    public Tbuser login(Tbuser tbuser) {
        return tbuserMapper.login(tbuser);
    }
    public int addUser(Tbuser tbuser) {
        return tbuserMapper.insertSelective(tbuser);
    }
}
