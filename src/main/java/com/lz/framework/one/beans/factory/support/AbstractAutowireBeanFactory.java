package com.lz.framework.one.beans.factory.support;

import com.lz.framework.one.beans.BeanException;
import com.lz.framework.one.beans.factory.config.BeanDefinition;

/**
 * 自动注入
 *
 * @Created: 21/10/14 13:26
 * @Author: LZ
 */
public abstract class AbstractAutowireBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeanException {
        Object bean = null;
        try {
            bean = beanDefinition.getBean().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        add(beanName, bean);
        return bean;
    }
}
