package com.fasterxml.jackson.databind.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.InterfaceC5621Yt;
import o.VD;

/* JADX INFO: loaded from: classes17.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonSerialize {

    /* JADX INFO: loaded from: classes21.dex */
    @Deprecated
    public enum Inclusion {
        ALWAYS,
        NON_NULL,
        NON_DEFAULT,
        NON_EMPTY,
        DEFAULT_INCLUSION
    }

    /* JADX INFO: loaded from: classes21.dex */
    public enum Typing {
        DYNAMIC,
        STATIC,
        DEFAULT_TYPING
    }

    Class<? extends InterfaceC5621Yt> AEQbTJ() default InterfaceC5621Yt.StateListAnimator.class;

    Class<? extends VD> AYXKKw() default VD.ActionBar.class;

    Typing AhwBna() default Typing.DEFAULT_TYPING;

    Class<? extends VD> DbNXlk() default VD.ActionBar.class;

    Class<?> EZpvd() default Void.class;

    Class<?> KWHzl() default Void.class;

    Class<? extends InterfaceC5621Yt> OLrzqt() default InterfaceC5621Yt.StateListAnimator.class;

    Class<? extends VD> copydefault() default VD.ActionBar.class;

    @Deprecated
    Inclusion djBIcL() default Inclusion.DEFAULT_INCLUSION;

    Class<? extends VD> gEmmrt() default VD.ActionBar.class;

    Class<?> valueOf() default Void.class;
}
