package com.bnproject.designpattern.factory.abstractfactory.factory.impl;

import com.bnproject.designpattern.factory.abstractfactory.factory.interfaces.IDigiProductFactory;
import com.bnproject.designpattern.factory.abstractfactory.product.impl.XiaoMiNotebookPC;
import com.bnproject.designpattern.factory.abstractfactory.product.impl.XiaoMiPhone;
import com.bnproject.designpattern.factory.abstractfactory.product.interfaces.IMobilePhoneProduct;
import com.bnproject.designpattern.factory.abstractfactory.product.interfaces.INotebookPCProduct;

/**
 * @author baining
 * @date 2019/3/11 18:21
 */
public class XiaoMiFacotry implements IDigiProductFactory {

    @Override
    public IMobilePhoneProduct createMobilePhone() {
        return new XiaoMiPhone();
    }

    @Override
    public INotebookPCProduct createNotebookPC() {
        return new XiaoMiNotebookPC();
    }
}
