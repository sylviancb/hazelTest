package com.test.hazelTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cache")
public class CacheController {

    @Autowired
    CacheService cacheService;

    @GetMapping("/test")
    public String getCacheTest() {
        return cacheService.getCachedString();
    }

}
