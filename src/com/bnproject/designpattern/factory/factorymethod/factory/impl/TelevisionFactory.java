package com.bnproject.designpattern.factory.factorymethod.factory.impl;

import com.bnproject.designpattern.factory.factorymethod.factory.interfaces.IAppliancesFactory;
import com.bnproject.designpattern.factory.factorymethod.impl.Television;
import com.bnproject.designpattern.factory.factorymethod.interfaces.IAppliances;

/**
 * @author baining
 * @date 2019/3/11 17:57
 */
public class TelevisionFactory implements IAppliancesFactory {
    @Override
    public IAppliances createAppliances() {
        return new Television();
    }
}
