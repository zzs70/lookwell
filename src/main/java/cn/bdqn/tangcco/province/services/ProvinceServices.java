package cn.bdqn.tangcco.province.services;

import cn.bdqn.tangcco.entity.Province;
import cn.bdqn.tangcco.entity.ProvinceExample;

import java.util.List;

/**
 * Created by Administrator on 2017/6/1.
 */
public interface ProvinceServices {
    List<Province> queryAllProvince(ProvinceExample example);
}
