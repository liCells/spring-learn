package com.lz.framework.one.beans.factory;

import lombok.NonNull;

/**
 * 默认BeanFactory
 *
 * @Created: 21/10/14 13:37
 * @Author: LZ
 */
public interface BeanFactory {
    Object getBean(@NonNull String beanName);
}
