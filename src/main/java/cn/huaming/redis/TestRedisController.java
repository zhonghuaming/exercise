package cn.huaming.redis;

import cn.huaming.service.impl.UserService;
import cn.huaming.service.impl.UserServiceB;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
@Slf4j
public class TestRedisController {
    @Autowired
    private RedisUtils redisUtils;


    @RequestMapping(value = "/test")
    @ResponseBody
    public String go(){
        boolean set = redisUtils.set("ilhStubbornDonkeyToken", "dfsdfs");
        return set+"";
    }

}