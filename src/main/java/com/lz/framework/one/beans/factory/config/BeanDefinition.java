package com.lz.framework.one.beans.factory.config;

/**
 * Bean的定义
 *
 * @Created: 21/10/14 12:54
 * @Author: LZ
 */
public class BeanDefinition {

    private Class<?> bean;

    public BeanDefinition(Class<?> bean) {
        this.bean = bean;
    }

    public Class<?> getBean() {
        return bean;
    }

    public void setBean(Class<?> bean) {
        this.bean = bean;
    }
}
