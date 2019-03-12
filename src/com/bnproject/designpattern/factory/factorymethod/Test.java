package com.bnproject.designpattern.factory.factorymethod;

import com.bnproject.designpattern.factory.factorymethod.factory.impl.IceBaxFacotry;
import com.bnproject.designpattern.factory.factorymethod.factory.impl.TelevisionFactory;
import com.bnproject.designpattern.factory.factorymethod.factory.impl.WasherFactory;
import com.bnproject.designpattern.factory.factorymethod.factory.interfaces.IAppliancesFactory;
import com.bnproject.designpattern.factory.factorymethod.interfaces.IAppliances;

/**
 * @author baining
 * @date 2019/3/11 17:58
 */
public class Test {
    public static void main(String[] args) {
        IAppliancesFactory iAppliancesFactory = new IceBaxFacotry();
        IAppliances appliances = iAppliancesFactory.createAppliances();
        appliances.create();

        iAppliancesFactory = new WasherFactory();
        appliances = iAppliancesFactory.createAppliances();
        appliances.create();

        iAppliancesFactory = new TelevisionFactory();
        appliances = iAppliancesFactory.createAppliances();
        appliances.create();

    }
}
