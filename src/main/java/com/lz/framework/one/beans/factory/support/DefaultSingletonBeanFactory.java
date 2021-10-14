package com.lz.framework.one.beans.factory.support;

import com.lz.framework.one.beans.factory.config.BeanRegistry;
import lombok.NonNull;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 默认的单例Bean工厂
 *
 * @Created: 21/10/14 12:57
 * @Author: LZ
 */
public class DefaultSingletonBeanFactory implements BeanRegistry {

    private final Map<String, Object> singletonObjects = new ConcurrentHashMap<>();

    @Override
    public Object get(@NonNull String beanName) {
        return singletonObjects.get(beanName);
    }

    public Object add(@NonNull String beanName, Object bean) {
        singletonObjects.put(beanName, bean);
        return bean;
    }

}
