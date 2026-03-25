package o;

import com.okinc.unify_trade.dex.util.OKTDexCalculatorError;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xHM {
    public static final boolean OLrzqt() {
        return false;
    }

    public static final void copydefault(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        AEQbTJ(obj.toString());
    }

    public static final void AEQbTJ(java.lang.String str) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            try {
                new BigDecimal(str);
            } catch (java.lang.Exception e) {
                C6777aVl.Companion.EZpvd(new OKTDexCalculatorError(KWHzl(str) + "->" + C56379yDe.AEQbTJ(e)));
                if (OLrzqt()) {
                    throw new java.lang.IllegalArgumentException(KWHzl(str));
                }
            }
        }
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "not a number string:" + str + ":";
    }

    public static final boolean KWHzl(java.lang.Object obj, java.lang.Object obj2) {
        copydefault(obj, obj2);
        return C33129mqd.OLrzqt(obj, obj2);
    }

    public static final void copydefault(java.lang.Object obj, java.lang.Object obj2) {
        copydefault(obj);
        copydefault(obj2);
    }

    public static final boolean AEQbTJ(java.lang.Object obj, java.lang.Object obj2) {
        copydefault(obj, obj2);
        return C33129mqd.AEQbTJ(obj, obj2);
    }

    public static final boolean OLrzqt(java.lang.Object obj, java.lang.Object obj2) {
        copydefault(obj, obj2);
        return C33129mqd.gEmmrt(obj, obj2);
    }

    public static final boolean EZpvd(java.lang.Object obj, java.lang.Object obj2) {
        copydefault(obj, obj2);
        return C33129mqd.copydefault(obj, obj2);
    }

    public static /* synthetic */ java.lang.String divCheckS$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 16;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = C33129mqd.KWHzl();
        }
        return copydefault(obj, obj2, num, bool, roundingMode);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(obj, "");
        copydefault(obj, obj2);
        return C33129mqd.OLrzqt(obj, obj2, num, bool, roundingMode);
    }

    public static final java.lang.String gEmmrt(java.lang.Object obj, java.lang.Object obj2) {
        copydefault(obj, obj2);
        return C33129mqd.KWHzl(obj, obj2);
    }

    public static /* synthetic */ java.lang.String mulCheckS$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 16;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = C33129mqd.KWHzl();
        }
        return KWHzl(obj, obj2, num, bool, roundingMode);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(obj, "");
        copydefault(obj, obj2);
        return C33129mqd.gEmmrt(obj, obj2, num, bool, roundingMode);
    }
}
