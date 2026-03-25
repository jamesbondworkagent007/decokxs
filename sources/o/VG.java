package o;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes17.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface VG {

    public @interface ActionBar {
        java.lang.String AEQbTJ() default "";

        JsonInclude.Include EZpvd() default JsonInclude.Include.NON_NULL;

        java.lang.String KWHzl();

        boolean OLrzqt() default false;

        java.lang.String copydefault() default "";
    }

    public @interface Activity {
        java.lang.Class<?> AEQbTJ() default java.lang.Object.class;

        JsonInclude.Include EZpvd() default JsonInclude.Include.NON_NULL;

        boolean KWHzl() default false;

        java.lang.String OLrzqt() default "";

        java.lang.String copydefault() default "";

        java.lang.Class<? extends VirtualBeanPropertyWriter> gEmmrt();
    }

    boolean EZpvd() default false;

    Activity[] KWHzl() default {};

    ActionBar[] OLrzqt() default {};
}
