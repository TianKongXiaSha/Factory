package com.bnproject.designpattern.factory.abstractfactory;

import com.bnproject.designpattern.factory.abstractfactory.factory.impl.HuaweiFactory;
import com.bnproject.designpattern.factory.abstractfactory.factory.impl.XiaoMiFacotry;
import com.bnproject.designpattern.factory.abstractfactory.factory.interfaces.IDigiProductFactory;
import com.bnproject.designpattern.factory.abstractfactory.product.interfaces.IMobilePhoneProduct;
import com.bnproject.designpattern.factory.abstractfactory.product.interfaces.INotebookPCProduct;

/**
 * @author baining
 * @date 2019/3/11 18:02
 */
public class Test {
    public static void main(String[] args) {
        IDigiProductFactory iDigiProductFactory = new HuaweiFactory();
        IMobilePhoneProduct mobilePhone = iDigiProductFactory.createMobilePhone();
        INotebookPCProduct notebookPC = iDigiProductFactory.createNotebookPC();
        mobilePhone.produce();
        notebookPC.create();

        iDigiProductFactory = new XiaoMiFacotry();
        mobilePhone = iDigiProductFactory.createMobilePhone();
        notebookPC = iDigiProductFactory.createNotebookPC();
        mobilePhone.produce();
        notebookPC.create();
    }
}
