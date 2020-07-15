package cn.huaming.fastjson;

import cn.huaming.entity.User;
import cn.huaming.service.impl.UserService;
import cn.huaming.service.impl.UserServiceB;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import java.util.HashSet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fastjson")
@Slf4j
public class TestFilterFieldController {

    @RequestMapping(value = "/test")
    @ResponseBody
    @ScProperty(include="name")
    public Result go(){
        User user = new User();
        user.setName("zhm");
        user.setPwd("xxxx");

        HashSet<String> keys = new HashSet<>();
        keys.add("name");
        ScPropertyContext.setIncludes(keys);
        return new Result("0000","success",user);
    }

}