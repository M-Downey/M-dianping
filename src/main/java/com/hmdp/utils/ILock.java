package com.hmdp.utils;

public interface ILock {

    /**
     * 获取锁，在 timeoutSeconds 后释放
     * @param timeoutSeconds
     * @return
     */
    boolean tryLock(long timeoutSeconds);

    /**
     * 释放锁
     */
    void unlock();
}
