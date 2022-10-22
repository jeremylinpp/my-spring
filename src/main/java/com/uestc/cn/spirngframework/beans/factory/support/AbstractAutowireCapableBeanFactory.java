package com.uestc.cn.spirngframework.beans.factory.support;

import com.uestc.cn.spirngframework.beans.factory.BeansException;
import com.uestc.cn.spirngframework.beans.factory.config.BeanDefinition;

/**
 * @ClassName: AbstractAutowireCapableBeanFactory.java
 * @Description: TODO 类描述
 * @Author: linchen8@lenovo.com
 * @Date: 2022/10/22 15:40
 **/
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object creatBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException  | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
