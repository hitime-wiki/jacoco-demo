package wiki.hitime.jacocodemo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author zhangdaoping
 * @create 2018/12/1 下午7:03
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TimeServiceTests {

    @Resource
    private TimeService timeService;

    @Test
    public void getTimeTest() {
        timeService.getTime();
    }
}
