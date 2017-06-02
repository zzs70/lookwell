package cn.bdqn.tangcco.province.services.impl;

import cn.bdqn.tangcco.entity.Province;
import cn.bdqn.tangcco.entity.ProvinceExample;
import cn.bdqn.tangcco.province.dao.ProvinceMapper;
import cn.bdqn.tangcco.province.services.ProvinceServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/6/1.
 */
@Service
public class ProvinceServicesImpl implements ProvinceServices {
    @Resource
    private ProvinceMapper provinceMapper;
    @Override
    public List<Province> queryAllProvince(ProvinceExample example) {
        return provinceMapper.selectByExample(example);
    }
}
