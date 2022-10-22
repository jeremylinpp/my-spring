package com.uestc.cn.spirngframework.beans.factory.support;

import com.uestc.cn.spirngframework.beans.factory.config.BeanDefinition;

/**
 * @ClassName: BeanDefinitionRegistry.java
 * @Description: TODO 类描述
 * @Author: linchen8@lenovo.com
 * @Date: 2022/10/22 15:56
 **/
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
