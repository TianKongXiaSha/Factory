package com.bnproject.designpattern.factory.abstractfactory.product.impl;

import com.bnproject.designpattern.factory.abstractfactory.product.interfaces.IMobilePhoneProduct;

/**
 * @author baining
 * @date 2019/3/11 18:34
 */
public class XiaoMiPhone implements IMobilePhoneProduct {

    @Override
    public void produce() {
        System.out.println("制造了一台小米手机！");
    }
}
