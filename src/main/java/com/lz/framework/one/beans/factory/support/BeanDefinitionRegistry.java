package com.lz.framework.one.beans.factory.support;

import com.lz.framework.one.beans.factory.config.BeanDefinition;

/**
 * @Created: 21/10/14 13:51
 * @Author: LZ
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
