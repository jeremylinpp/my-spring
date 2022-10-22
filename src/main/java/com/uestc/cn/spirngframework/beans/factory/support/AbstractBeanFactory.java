package com.uestc.cn.spirngframework.beans.factory.support;

import com.uestc.cn.spirngframework.BeanFactory;
import com.uestc.cn.spirngframework.beans.factory.BeansException;
import com.uestc.cn.spirngframework.beans.factory.config.BeanDefinition;

import java.util.Objects;

/**
 * @ClassName: AbstractBeanFactory.java
 * @Description: 抽象bean工厂
 * @Author: linchen8@lenovo.com
 * @Date: 2022/10/22 15:41
 **/
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (Objects.isNull(bean)) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return creatBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object creatBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
