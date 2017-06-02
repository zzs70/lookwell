package cn.bdqn.tangcco.province.controller;

import cn.bdqn.tangcco.entity.Province;
import cn.bdqn.tangcco.province.services.ProvinceServices;
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
public class ProvinceController {
    @Resource
    private ProvinceServices provinceServices;
    @ResponseBody
    @RequestMapping(value = "province",method = RequestMethod.GET)
    public List<Province> list(){
        return provinceServices.queryAllProvince(null);
    }
}
