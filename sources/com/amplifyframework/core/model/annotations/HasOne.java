package com.amplifyframework.core.model.annotations;

import com.amplifyframework.core.model.Model;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes17.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface HasOne {
    String associatedWith();

    String[] targetNames() default {};

    Class<? extends Model> type();
}
