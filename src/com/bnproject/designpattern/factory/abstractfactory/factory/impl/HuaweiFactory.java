package com.bnproject.designpattern.factory.abstractfactory.factory.impl;

import com.bnproject.designpattern.factory.abstractfactory.factory.interfaces.IDigiProductFactory;
import com.bnproject.designpattern.factory.abstractfactory.product.impl.HuaweiNotebookPC;
import com.bnproject.designpattern.factory.abstractfactory.product.impl.HuaweiPhone;
import com.bnproject.designpattern.factory.abstractfactory.product.interfaces.IMobilePhoneProduct;
import com.bnproject.designpattern.factory.abstractfactory.product.interfaces.INotebookPCProduct;

/**
 * @author baining
 * @date 2019/3/11 18:39
 */
public class HuaweiFactory implements IDigiProductFactory {
    @Override
    public IMobilePhoneProduct createMobilePhone() {
        return new HuaweiPhone();
    }

    @Override
    public INotebookPCProduct createNotebookPC() {
        return new HuaweiNotebookPC();
    }
}
