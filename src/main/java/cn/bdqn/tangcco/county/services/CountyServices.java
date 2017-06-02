package cn.bdqn.tangcco.county.services;

import cn.bdqn.tangcco.entity.County;

import java.util.List;

/**
 * Created by Administrator on 2017/6/1.
 */
public interface CountyServices {
    List<County> queryCountyByFK(County county);
}
