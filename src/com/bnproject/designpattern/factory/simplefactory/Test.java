package com.bnproject.designpattern.factory.simplefactory;

import com.bnproject.designpattern.factory.simplefactory.factory.TransportationFactory;
import com.bnproject.designpattern.factory.simplefactory.interfaces.ITransportation;

/**
 * @author baining
 * @date 2019/3/11 17:39
 */
public class Test {
    public static void main(String[] args) {
        TransportationFactory transportationFactory = new TransportationFactory();
        ITransportation iTransportation =
                transportationFactory.changeTransportation("bike");
        iTransportation.use();
    }
}
