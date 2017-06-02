package cn.bdqn.tangcco.county.controller;

import cn.bdqn.tangcco.county.services.CountyServices;
import cn.bdqn.tangcco.entity.County;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/6/1.
 */
@Controller
public class CountyController {
    @Resource
    private CountyServices countyServices;
    @ResponseBody
    @RequestMapping(value = "countyfk",method = RequestMethod.POST)
    public List<County> ByFK(County county){
        return countyServices.queryCountyByFK(county);
    }
}
