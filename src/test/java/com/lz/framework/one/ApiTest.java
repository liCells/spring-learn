package com.lz.framework.one;

import com.lz.framework.one.beans.User;
import com.lz.framework.one.beans.factory.config.BeanDefinition;
import com.lz.framework.one.beans.factory.support.DefaultSingletonBeanFactory;
import org.junit.Test;

/**
 * 单例模式注册测试
 *
 * @Created: 21/10/14 13:12
 * @Author: LZ
 */
public class ApiTest {

    @Test
    public void testBeanFactory() {
        // 初始化对应工厂
        DefaultSingletonBeanFactory singletonBeanFactory = new DefaultSingletonBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(User.class);

        singletonBeanFactory.add("user", beanDefinition);

        User user = (User) singletonBeanFactory.get("user");
        user.add();
    }

}
