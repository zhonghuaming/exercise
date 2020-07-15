package cn.huaming.fastjson;

import java.util.Set;

public class ScPropertyContext {

    private static final ThreadLocal<Set<String>> includesContextHolder = new ThreadLocal<>();
    private static final ThreadLocal<Set<String>> excludesContextHolder = new ThreadLocal<>();
    private static final ThreadLocal<Class<?>> classContextHolder = new ThreadLocal<>();

    public static void setIncludes(Set<String> includes) {
        includesContextHolder.set(includes);
    }

    public static Set<String> getIncludes() {
        return includesContextHolder.get();
    }

    public static void clearInclude() {
        includesContextHolder.remove();
    }

    public static void setExcludes(Set<String> excludes) {
        excludesContextHolder.set(excludes);
    }

    public static Set<String> getExcludes() {
        return excludesContextHolder.get();
    }

    public static void clearExcludes() {
        excludesContextHolder.remove();
    }

    public static void setClazz(Class<?> clazz) {
        classContextHolder.set(clazz);
    }

    public static Class<?> getClazz() {
        return classContextHolder.get();
    }

    public static void clearClazz() {
        classContextHolder.remove();
    }
}
