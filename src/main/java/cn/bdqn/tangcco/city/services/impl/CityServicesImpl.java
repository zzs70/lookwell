package cn.bdqn.tangcco.city.services.impl;

import cn.bdqn.tangcco.city.dao.CityMapper;
import cn.bdqn.tangcco.city.services.CityServices;
import cn.bdqn.tangcco.entity.City;
import cn.bdqn.tangcco.entity.CityExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/6/1.
 */
@Service
public class CityServicesImpl implements CityServices {
    @Resource
    private CityMapper cityMapper;
    @Override
    public List<City> queryCityByFk(City city) {
        CityExample example = new CityExample();
        CityExample.Criteria criteria = example.createCriteria();
        criteria.andProvidEqualTo(city.getProvid());
        return cityMapper.selectByExample(example);
    }
}
