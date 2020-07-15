package cn.huaming.fastjson;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyPreFilter;
import com.alibaba.fastjson.serializer.SerialContext;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * @author Jorvey
 * @date 2020年07月15日22:04:35
 */
public class SimplePropertyPreFilter implements PropertyPreFilter {

    public int getMaxLevel() {
        return 0;
    }

    public Class<?> getClazz() {
        return ScPropertyContext.getClazz();
    }

    public Set<String> getIncludes() {
        return ScPropertyContext.getIncludes();
    }

    public Set<String> getExcludes() {
        return ScPropertyContext.getExcludes();
    }

    @Override
    public boolean apply(JSONSerializer serializer, Object source, String name) {
        Set<String> includes = Optional.ofNullable(getIncludes()).orElse(new HashSet<>());
        includes.add("data");
        includes.add("errcode");
        includes.add("errmsg");
        Set<String> excludes = Optional.ofNullable(getExcludes()).orElse(new HashSet<>());

        if (source == null) {
            return true;
        }

        if (this.getClazz() != null && !this.getClazz().isInstance(source)) {
            return true;
        }

        if (excludes.contains(name)) {
            return false;
        }

        if (getMaxLevel() > 0) {
            int level = 0;
            SerialContext context = serializer.getContext();
            while (context != null) {
                level++;
                if (level > getMaxLevel()) {
                    return false;
                }
                context = context.parent;
            }
        }

        if (includes.size() == 0 || includes.contains(name)) {
            return true;
        }

        return false;
    }

}
