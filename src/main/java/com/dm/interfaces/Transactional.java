package com.dm.interfaces;

public interface Transactional {
    default public void beginTransaction(){
        System.out.println("***** Begin Transaction *****");
    }
    default public void commit() {
        System.out.println("***** Commit Transaction *****");
    }
    default public void rollback(){
        System.out.println("***** Rollback Transaction *****");
    }
}
