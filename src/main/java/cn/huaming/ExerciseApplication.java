package cn.huaming;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@ConfigurationPropertiesScan
public class ExerciseApplication {

    public static void main(String[] args) {
        //再启动之前添加属性不会触发重新加载，等同于在application-dev.properties添加spring.devtools.restart.enabled=false
//        System.setProperty("spring.devtools.restart.enabled", "false");
//        SpringApplication.run(ExerciseApplication.class, args);

        System.setProperty("server.port","8084");
        SpringApplication springApplication = new SpringApplication(ExerciseApplication.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("server.port","8083");
        springApplication.setDefaultProperties(map);
        springApplication.setBannerMode(Banner.Mode.OFF);
        String[] strings = {"debug"};
        springApplication.run(strings);
//        new SpringApplicationBuilder()
//            .sources(ExerciseApplication.class)
//            .child(ExerciseApplication.class)
//            .bannerMode(Banner.Mode.OFF)
//            .run(args);


    }
}
