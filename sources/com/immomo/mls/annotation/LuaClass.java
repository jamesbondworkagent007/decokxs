package com.immomo.mls.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes14.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface LuaClass {
    boolean abstractClass() default false;

    boolean gcByLua() default true;

    boolean isStatic() default false;
}
