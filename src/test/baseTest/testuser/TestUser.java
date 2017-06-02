package baseTest.testuser;

import baseTest.TestBase;
import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.user.services.TbuserServices;
import org.junit.Test;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/6/1.
 */
public class TestUser extends TestBase{
    @Inject
    private TbuserServices tbuserServices;
    @Test
    public void testLogin(){
        System.out.println(tbuserServices.login(new Tbuser("123","15110026692")));
        System.out.println("测试成功");
    }
}
