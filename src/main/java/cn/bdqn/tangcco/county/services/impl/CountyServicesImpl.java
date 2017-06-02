package cn.bdqn.tangcco.county.services.impl;

import cn.bdqn.tangcco.county.dao.CountyMapper;
import cn.bdqn.tangcco.county.services.CountyServices;
import cn.bdqn.tangcco.entity.County;
import cn.bdqn.tangcco.entity.CountyExample;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/6/1.
 */
@Service
public class CountyServicesImpl implements CountyServices{
    private CountyMapper countyMapper;
    @Override
    public List<County> queryCountyByFK(County county) {
        CountyExample example = new CountyExample();
        CountyExample.Criteria criteria = example.createCriteria();
        criteria.andCityidNotEqualTo(county.getCityid());
        return countyMapper.selectByExample(example);
    }
}
