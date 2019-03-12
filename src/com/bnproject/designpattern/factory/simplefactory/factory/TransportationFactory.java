package com.bnproject.designpattern.factory.simplefactory.factory;

import com.bnproject.designpattern.factory.simplefactory.impl.BikeImpl;
import com.bnproject.designpattern.factory.simplefactory.impl.BusImpl;
import com.bnproject.designpattern.factory.simplefactory.impl.TaxiImpl;
import com.bnproject.designpattern.factory.simplefactory.interfaces.ITransportation;

/**
 * @author baining
 * @date 2019/3/11 17:35
 */
public class TransportationFactory {

    public ITransportation changeTransportation(String type) {
        ITransportation iTransportation;
        if("taxi".equals(type)) {
            iTransportation = new TaxiImpl();
        } else if("bus".equals(type)) {
            iTransportation = new BusImpl();
        } else if("bike".equals(type)) {
            iTransportation = new BikeImpl();
        } else {
            iTransportation = new BikeImpl();
        }
        return iTransportation;
    }
}
