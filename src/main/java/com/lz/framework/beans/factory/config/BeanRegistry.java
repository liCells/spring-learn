package com.lz.framework.beans.factory.config;

/**
 * Bean定义接口
 *
 * @Created: 21/10/14 12:56
 * @Author: LZ
 */
public interface BeanRegistry {
    Object get(String beanName);
}
