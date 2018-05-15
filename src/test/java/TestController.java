import com.bean.UserInfo;
import com.mapper.UserInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by lmandy on 2018/5/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestController {

    @Autowired
    private UserInfoMapper mapper;

    @Test
    public void testMapper(){
        UserInfo info = new UserInfo();
        info.setId(1);
        List<UserInfo> select = mapper.select(info);
        System.out.println(select);
    }
}
