package wiki.hitime.jacocodemo.service;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author zhangdaoping
 * @create 2018/12/1 下午7:02
 */
@Service
public class TimeService {

    /**
     * 获取时间
     *
     * @return
     */
    public Date getTime() {
        return new Date();
    }
}
