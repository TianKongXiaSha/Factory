package com.bnproject.designpattern.factory.factorymethod.factory.impl;

import com.bnproject.designpattern.factory.factorymethod.factory.interfaces.IAppliancesFactory;
import com.bnproject.designpattern.factory.factorymethod.impl.Icebox;
import com.bnproject.designpattern.factory.factorymethod.interfaces.IAppliances;

/**
 * @author baining
 * @date 2019/3/11 17:56
 */
public class IceBaxFacotry implements IAppliancesFactory {
    @Override
    public IAppliances createAppliances() {
        return new Icebox();
    }
}
