package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes17.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonTypeInfo {

    /* JADX INFO: loaded from: classes21.dex */
    @Deprecated
    public static abstract class ActionBar {
    }

    /* JADX INFO: loaded from: classes21.dex */
    public enum As {
        PROPERTY,
        WRAPPER_OBJECT,
        WRAPPER_ARRAY,
        EXTERNAL_PROPERTY,
        EXISTING_PROPERTY
    }

    boolean AEQbTJ() default false;

    String EZpvd() default "";

    Class<?> KWHzl() default JsonTypeInfo.class;

    As OLrzqt() default As.PROPERTY;

    Id copydefault();

    /* JADX INFO: loaded from: classes21.dex */
    public enum Id {
        NONE(null),
        CLASS("@class"),
        MINIMAL_CLASS("@c"),
        NAME("@type"),
        DEDUCTION(null),
        CUSTOM(null);

        private final String _defaultPropertyName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getDefaultPropertyName() {
            return this._defaultPropertyName;
        }

        Id(String str) {
            this._defaultPropertyName = str;
        }
    }
}
