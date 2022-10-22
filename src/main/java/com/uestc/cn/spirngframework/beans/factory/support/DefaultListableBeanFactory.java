package com.uestc.cn.spirngframework.beans.factory.support;

import com.uestc.cn.spirngframework.beans.factory.BeansException;
import com.uestc.cn.spirngframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassName: DefaultListableBeanFactory.java
 * @Description: TODO 类描述
 * @Author: linchen8@lenovo.com
 * @Date: 2022/10/22 15:37
 **/
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (Objects.isNull(beanDefinition)) {
            throw new BeansException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }
}
