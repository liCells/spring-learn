package com.lz.framework.beans.factory.support;

import com.lz.framework.beans.BeanException;
import com.lz.framework.beans.factory.config.BeanDefinition;
import com.lz.framework.beans.factory.BeanFactory;
import lombok.NonNull;

/**
 * 抽象Bean工厂
 *
 * @Created: 21/10/14 13:29
 * @Author: LZ
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanFactory implements BeanFactory {
    @Override
    public Object getBean(@NonNull String beanName) {
        return doGetBean(beanName, null);
    }

    @Override
    public Object getBean(@NonNull String beanName, Object... args) {
        return doGetBean(beanName, args);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = get(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeanException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeanException;
}
