package org.example.cp.oms.domain.facade.lock;

import java.util.concurrent.locks.Lock;

import org.example.cp.oms.domain.facade.cache.IRedisClient;
import org.example.cp.oms.spec.model.vo.LockEntry;

public interface IRedisLockFactory {
    /**
     * Create a mutex lock.
     */
    Lock create(IRedisClient redisClient, LockEntry lockEntry);
}
