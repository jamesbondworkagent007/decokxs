package com.immomo.mls.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes14.dex */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LuaBridge {
    String alias() default "";

    String getterIs() default "";

    String setterIs() default "";

    BridgeType type() default BridgeType.NORMAL;
}
