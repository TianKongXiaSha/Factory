package com.bnproject.designpattern.factory.simplefactory.impl;

import com.bnproject.designpattern.factory.simplefactory.interfaces.ITransportation;

/**
 * @author baining
 * @date 2019/3/11 17:32
 */
public class TaxiImpl implements ITransportation {


    @Override
    public void use() {
        System.out.println("今天乘坐出租车上班！");
    }
}
