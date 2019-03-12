package com.bnproject.designpattern.factory.simplefactory.impl;

import com.bnproject.designpattern.factory.simplefactory.interfaces.ITransportation;

/**
 * @author baining
 * @date 2019/3/11 17:34
 */
public class BikeImpl implements ITransportation {
    @Override
    public void use() {
        System.out.println("今天骑自行车上班！");
    }
}
