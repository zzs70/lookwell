package baseTest.testprovince;

import baseTest.TestBase;
import cn.bdqn.tangcco.entity.Province;
import cn.bdqn.tangcco.entity.ProvinceExample;
import cn.bdqn.tangcco.province.services.ProvinceServices;
import org.junit.Test;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/6/1.
 */
public class Testprovince extends TestBase {
    @Inject
    private ProvinceServices provinceServices;
    @Test
    public void testList(){
        ProvinceExample example = new ProvinceExample();
        ProvinceExample.Criteria criteria = example.createCriteria();
        criteria.andProvidEqualTo(1);
        for (Province p:provinceServices.queryAllProvince(example)){
            System.out.println(p);
        }
    }
}
