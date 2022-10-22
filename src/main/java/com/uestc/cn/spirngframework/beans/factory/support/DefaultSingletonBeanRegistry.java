package com.uestc.cn.spirngframework.beans.factory.support;

import com.uestc.cn.spirngframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: DefaultSingletonBeanRegistry.java
 * @Description: TODO 类描述
 * @Author: linchen8@lenovo.com
 * @Date: 2022/10/22 15:42
 **/
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
