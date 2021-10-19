package com.lz.framework.test;

import com.lz.framework.beans.User;
import com.lz.framework.beans.factory.config.BeanDefinition;
import com.lz.framework.beans.factory.support.DefaultListableBeanFactory;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
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
        DefaultListableBeanFactory listableBeanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(User.class);

        listableBeanFactory.registerBeanDefinition("user", beanDefinition);

        User user = (User) listableBeanFactory.getBean("user");
        user.add();
    }

    @Test
    public void testCglib() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(User.class);
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        Object obj = enhancer.create(new Class[]{String.class}, new Object[]{"LZ"});
        System.out.println(obj);
    }
}
