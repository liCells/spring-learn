package com.lz.framework.beans.factory.support;

import com.lz.framework.beans.BeanException;
import com.lz.framework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeanException;
}