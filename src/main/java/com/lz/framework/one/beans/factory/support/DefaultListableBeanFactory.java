package com.lz.framework.one.beans.factory.support;

import com.lz.framework.one.beans.BeanException;
import com.lz.framework.one.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @Created: 21/10/14 13:43
 * @Author: LZ
 */
public class DefaultListableBeanFactory extends AbstractAutowireBeanFactory implements BeanDefinitionRegistry {

    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeanException {
        return null;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {

    }
}
