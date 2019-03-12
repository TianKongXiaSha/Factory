package com.bnproject.designpattern.factory.simplefactory.impl;

import com.bnproject.designpattern.factory.simplefactory.interfaces.ITransportation;

/**
 * @author baining
 * @date 2019/3/11 17:33
 */
public class BusImpl implements ITransportation{
    @Override
    public void use() {
        System.out.println("今天乘坐公交车去上班！");
    }
}
