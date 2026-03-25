package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.AbstractC5548Vy;
import o.InterfaceC5621Yt;
import o.VC;

/* JADX INFO: loaded from: classes17.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface VJ {
    java.lang.Class<? extends InterfaceC5621Yt> AEQbTJ() default InterfaceC5621Yt.StateListAnimator.class;

    java.lang.Class<?> AYXKKw() default java.lang.Void.class;

    java.lang.Class<? extends AbstractC5548Vy> AhwBna() default AbstractC5548Vy.Activity.class;

    java.lang.Class<?> EZpvd() default java.lang.Void.class;

    java.lang.Class<? extends AbstractC5548Vy> KWHzl() default AbstractC5548Vy.Activity.class;

    java.lang.Class<?> OLrzqt() default java.lang.Void.class;

    java.lang.Class<?> copydefault() default java.lang.Void.class;

    java.lang.Class<? extends InterfaceC5621Yt> gEmmrt() default InterfaceC5621Yt.StateListAnimator.class;

    java.lang.Class<? extends VC> valueOf() default VC.ActionBar.class;
}
