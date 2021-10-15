package com.lz.framework.one.beans.factory.support;

import com.lz.framework.one.beans.BeanException;
import com.lz.framework.one.beans.factory.BeanFactory;
import com.lz.framework.one.beans.factory.config.BeanDefinition;
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
        Object bean = get(beanName);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeanException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeanException;
}
