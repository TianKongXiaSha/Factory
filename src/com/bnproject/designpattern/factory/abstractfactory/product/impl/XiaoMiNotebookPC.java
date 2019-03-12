package com.bnproject.designpattern.factory.abstractfactory.product.impl;

import com.bnproject.designpattern.factory.abstractfactory.product.interfaces.INotebookPCProduct;

/**
 * @author baining
 * @date 2019/3/11 18:36
 */
public class XiaoMiNotebookPC implements INotebookPCProduct {
    @Override
    public void create() {
        System.out.println("生产了一台小米笔记本电脑！");
    }
}
