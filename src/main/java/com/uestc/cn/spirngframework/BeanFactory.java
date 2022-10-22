package com.uestc.cn.spirngframework;

import com.uestc.cn.spirngframework.beans.factory.BeansException;

/**
 * @ClassName: BeanFactory.java
 * @Description:
 * @Author: linchen8@lenovo.com
 * @Date: 2022/10/22 15:17
 **/
public interface BeanFactory {
   Object getBean(String name) throws BeansException;
}
