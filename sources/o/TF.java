package o;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes17.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface TF {
    java.lang.Class<?> AEQbTJ() default java.lang.Object.class;

    java.lang.Class<? extends ObjectIdGenerator<?>> EZpvd();

    java.lang.String KWHzl() default "@id";

    java.lang.Class<? extends InterfaceC5500Ud> OLrzqt() default C5499Uc.class;
}
