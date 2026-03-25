package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes17.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface VO {
    java.lang.String AEQbTJ() default "build";

    java.lang.String copydefault() default "with";

    /* JADX INFO: loaded from: classes21.dex */
    public static class StateListAnimator {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;

        public StateListAnimator(VO vo) {
            this(vo.AEQbTJ(), vo.copydefault());
        }

        public StateListAnimator(java.lang.String str, java.lang.String str2) {
            this.EZpvd = str;
            this.AEQbTJ = str2;
        }
    }
}
