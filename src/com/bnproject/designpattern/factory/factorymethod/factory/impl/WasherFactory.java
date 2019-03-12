package com.bnproject.designpattern.factory.factorymethod.factory.impl;

import com.bnproject.designpattern.factory.factorymethod.factory.interfaces.IAppliancesFactory;
import com.bnproject.designpattern.factory.factorymethod.impl.Washer;
import com.bnproject.designpattern.factory.factorymethod.interfaces.IAppliances;

/**
 * @author baining
 * @date 2019/3/11 17:58
 */
public class WasherFactory implements IAppliancesFactory {
    @Override
    public IAppliances createAppliances() {
        return new Washer();
    }
}
