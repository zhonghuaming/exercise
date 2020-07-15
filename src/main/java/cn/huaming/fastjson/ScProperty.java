package cn.huaming.fastjson;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * JSON返回
 *
 * @author Jorvey
 * @date 2020年07月15日22:34:41
 */
@Target(value = {ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface ScProperty {

    String include() default "";

    String excludes() default "";


}
