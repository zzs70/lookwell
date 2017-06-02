package cn.bdqn.tangcco.city.services;

import cn.bdqn.tangcco.entity.City;

import java.util.List;

/**
 * Created by Administrator on 2017/6/1.
 */
public interface CityServices {
    List<City> queryCityByFk(City city);
}
