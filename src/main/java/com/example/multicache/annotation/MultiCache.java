package com.example.multicache.annotation;

import com.example.multicache.constants.CacheType;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MultiCache {
    String cacheName();
    String key();
    long l2TimeOut() default 120;
    CacheType type() default CacheType.FULL;
}