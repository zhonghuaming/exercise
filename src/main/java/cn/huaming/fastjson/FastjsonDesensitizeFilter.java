package cn.huaming.fastjson;

import com.alibaba.fastjson.serializer.ValueFilter;
import java.lang.reflect.Field;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FastjsonDesensitizeFilter implements ValueFilter {
	@Override
	public Object process(Object object, String name, Object value) {
		if (null == value || !(value instanceof String) || ((String) value).length() == 0) {
			return value;
		}
		try {
			Field field = object.getClass().getDeclaredField(name);

			return value;

		} catch (Exception e) {
			log.warn("FastJsonDesensitizeFilter the class {} has no field {}", object.getClass(), name);
		}
		return value;
	}
}
