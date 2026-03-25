package o;

import java.math.BigDecimal;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface kVO {
    java.lang.String AEQbTJ();

    boolean AhwBna();

    boolean EZpvd();

    java.lang.String KWHzl();

    java.lang.String OLrzqt();

    java.lang.String copydefault();

    public static final class Activity {
        public static boolean AEQbTJ(@NotNull kVO kvo) {
            return Intrinsics.EZpvd((java.lang.Object) kvo.AEQbTJ(), (java.lang.Object) "1");
        }

        public static boolean OLrzqt(@NotNull kVO kvo) {
            java.lang.Object objM7377constructorimpl;
            java.lang.String strKWHzl = kvo.KWHzl();
            java.lang.String strOLrzqt = kvo.OLrzqt();
            boolean z = false;
            if (strKWHzl.length() == 0) {
                return false;
            }
            try {
                Result.Application application = Result.Companion;
                BigDecimal bigDecimal = new BigDecimal(strKWHzl);
                BigDecimal bigDecimal2 = new BigDecimal(strOLrzqt);
                if (bigDecimal.compareTo(BigDecimal.ZERO) >= 0 && bigDecimal.compareTo(bigDecimal2) != 0) {
                    z = true;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(z));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = bool;
            }
            return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
        }
    }
}
