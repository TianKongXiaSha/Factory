package com.bnproject.designpattern.factory.abstractfactory.product.impl;

import com.bnproject.designpattern.factory.abstractfactory.product.interfaces.IMobilePhoneProduct;

/**
 * @author baining
 * @date 2019/3/11 18:32
 */
public class HuaweiPhone implements IMobilePhoneProduct {
    @Override
    public void produce() {
        System.out.println("制造了一台华为手机！");
    }
}
