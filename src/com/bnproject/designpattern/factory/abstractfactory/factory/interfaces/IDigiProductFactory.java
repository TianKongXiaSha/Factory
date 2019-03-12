package com.bnproject.designpattern.factory.abstractfactory.factory.interfaces;

import com.bnproject.designpattern.factory.abstractfactory.product.interfaces.IMobilePhoneProduct;
import com.bnproject.designpattern.factory.abstractfactory.product.interfaces.INotebookPCProduct;

/**
 * @author baining
 * @date 2019/3/11 18:09
 */
public interface IDigiProductFactory {

    public IMobilePhoneProduct createMobilePhone();

    public INotebookPCProduct createNotebookPC();
}
