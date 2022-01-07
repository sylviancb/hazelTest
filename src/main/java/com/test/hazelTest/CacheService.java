package com.test.hazelTest;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Cacheable("str")
    public String getCachedString(){
        return simulateLoadAndReturnString();
    }

    private String simulateLoadAndReturnString() {
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "cache test";
    }

}
