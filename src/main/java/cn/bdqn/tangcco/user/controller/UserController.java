package cn.bdqn.tangcco.user.controller;

import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.user.services.TbuserServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/6/1.
 */
@Controller
public class UserController {
    @Resource
    private TbuserServices tbuserServices;
    @ResponseBody
    @RequestMapping(value = "login.controller",method = RequestMethod.POST)
    public String login(Tbuser tbuser, HttpServletRequest request){
        tbuser = tbuserServices.login(tbuser);
        if (tbuser != null){
            request.getSession().setAttribute("user",tbuser);
            return "100";
        }
        return "200";
    }
}
