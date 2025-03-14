package org.example.cp.oms.infra.lock;

import java.util.concurrent.locks.Lock;

import org.example.cp.oms.domain.facade.cache.IRedisClient;
import org.example.cp.oms.domain.facade.lock.IRedisLockFactory;
import org.example.cp.oms.spec.model.vo.LockEntry;
import org.springframework.stereotype.Component;

@Component
public class RedisLockFactory implements IRedisLockFactory {
    @Override
    public Lock create(IRedisClient redisClient, LockEntry lockEntry) {
        return new RedisLock(redisClient, lockEntry);
    }
}
