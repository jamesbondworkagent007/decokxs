package o;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yFw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56451yFw extends C56449yFu {

    /* JADX INFO: renamed from: o.yFw$StateListAnimator */
    public static final class StateListAnimator {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();
        public static final java.lang.Integer EZpvd;

        private StateListAnimator() {
        }

        static {
            java.lang.Object obj;
            java.lang.Integer num = null;
            try {
                obj = java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (java.lang.Throwable unused) {
            }
            java.lang.Integer num2 = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            EZpvd = num;
        }
    }

    private final boolean KWHzl(int i) {
        java.lang.Integer num = StateListAnimator.EZpvd;
        return num == null || num.intValue() >= i;
    }

    @Override // o.C56449yFu
    public void EZpvd(@NotNull java.lang.Throwable th, @NotNull java.lang.Throwable th2) throws java.lang.IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (KWHzl(19)) {
            th.addSuppressed(th2);
        } else {
            super.EZpvd(th, th2);
        }
    }

    @Override // o.C56449yFu
    public java.util.List<java.lang.Throwable> copydefault(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (KWHzl(19)) {
            java.lang.Throwable[] suppressed = th.getSuppressed();
            Intrinsics.checkNotNullExpressionValue(suppressed, "");
            return yDT.fIwbmz(suppressed);
        }
        return super.copydefault(th);
    }
}
