package cn.bdqn.tangcco.user.services;

import cn.bdqn.tangcco.entity.Tbuser;

/**
 * Created by Administrator on 2017/6/1.
 */
public interface TbuserServices {
    Tbuser login(Tbuser tbuser);
    int addUser(Tbuser tbuser);
}
