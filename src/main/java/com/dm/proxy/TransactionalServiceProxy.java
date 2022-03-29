package com.dm.proxy;

import com.dm.interfaces.Transactional;
import com.dm.target.TransactionalService;

public class TransactionalServiceProxy extends TransactionalService implements Transactional {

    public TransactionalServiceProxy() {
    }

    @Override
    public void process(){
        beginTransaction();
        super.process();
        commit();
    }
}
