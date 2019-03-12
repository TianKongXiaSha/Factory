package com.bnproject.designpattern.factory.factorymethod.impl;

import com.bnproject.designpattern.factory.factorymethod.interfaces.IAppliances;

/**
 * @author baining
 * @date 2019/3/11 17:52
 */
public class Icebox implements IAppliances {
    @Override
    public void create() {
        System.out.println("生产了一台冰箱！");
    }
}
