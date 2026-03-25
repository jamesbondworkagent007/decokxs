package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: o.dbF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC13893dbF {
    boolean EZpvd() default false;

    int copydefault() default 1;
}
