package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes17.dex */
@Target({ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
public @interface mHZ {
    public static final Activity Companion = Activity.AEQbTJ;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        public static final /* synthetic */ Activity AEQbTJ = new Activity();

        public final boolean EZpvd(int i, int i2) {
            return (i & i2) == i2;
        }

        private Activity() {
        }

        public final boolean AEQbTJ(int i) {
            return EZpvd(i, 1) || EZpvd(i, 2);
        }
    }
}
