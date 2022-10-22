package com.uestc.cn.spirngframework.beans.factory.config;

/**
 * @ClassName: SingletonBeanRegistry.java
 * @Description:
 * @Author: linchen8@lenovo.com
 * @Date: 2022/10/22 15:36
 **/
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
