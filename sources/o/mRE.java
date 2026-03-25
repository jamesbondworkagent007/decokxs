package o;

import com.okinc.dexkline.dexlogic.error.CalculatorError;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mRE {
    public static final RoundingMode OLrzqt = RoundingMode.DOWN;

    public static final boolean KWHzl() {
        return false;
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "not a number string:" + str + ":";
    }

    public static final void KWHzl(java.lang.String str) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            try {
                new BigDecimal(str);
            } catch (java.lang.Exception e) {
                C6777aVl.Companion.EZpvd(new CalculatorError(AEQbTJ(str) + "->" + C56379yDe.AEQbTJ(e)));
                if (KWHzl()) {
                    throw new java.lang.IllegalArgumentException(AEQbTJ(str));
                }
            }
        }
    }

    public static final void AEQbTJ(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        KWHzl(obj.toString());
    }

    public static final void OLrzqt(java.lang.Object obj, java.lang.Object obj2) {
        AEQbTJ(obj);
        AEQbTJ(obj2);
    }

    public static /* synthetic */ java.lang.String addCheckS$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 18;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return OLrzqt(obj, obj2, num, bool, roundingMode);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(obj, "");
        OLrzqt(obj, obj2);
        return C33129mqd.copydefault(obj, obj2, num, bool, roundingMode);
    }

    public static /* synthetic */ java.lang.String subCheckS$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 18;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return gEmmrt(obj, obj2, num, bool, roundingMode);
    }

    public static final java.lang.String gEmmrt(@NotNull java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(obj, "");
        OLrzqt(obj, obj2);
        return C33129mqd.AhwBna(obj, obj2, num, bool, roundingMode);
    }

    public static /* synthetic */ java.lang.String mulCheckS$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 18;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return AhwBna(obj, obj2, num, bool, roundingMode);
    }

    public static final java.lang.String AhwBna(@NotNull java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(obj, "");
        OLrzqt(obj, obj2);
        return C33129mqd.gEmmrt(obj, obj2, num, bool, roundingMode);
    }

    public static /* synthetic */ java.lang.String divCheckS$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 18;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return KWHzl(obj, obj2, num, bool, roundingMode);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(obj, "");
        OLrzqt(obj, obj2);
        return C33129mqd.OLrzqt(obj, obj2, num, bool, roundingMode);
    }

    public static /* synthetic */ java.lang.String remCheckS$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 18;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return valueOf(obj, obj2, num, bool, roundingMode);
    }

    public static final java.lang.String valueOf(@NotNull java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(obj, "");
        OLrzqt(obj, obj2);
        return C33129mqd.djBIcL(obj, obj2, num, bool, roundingMode);
    }

    public static /* synthetic */ double addCheckD$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 18;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return EZpvd(obj, obj2, num, bool, roundingMode);
    }

    public static final double EZpvd(@NotNull java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(obj, "");
        return C33129mqd.AEQbTJ(OLrzqt(obj, obj2, num, bool, roundingMode));
    }

    public static /* synthetic */ double subCheckD$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 18;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return AYXKKw(obj, obj2, num, bool, roundingMode);
    }

    public static final double AYXKKw(@NotNull java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(obj, "");
        return C33129mqd.AEQbTJ(gEmmrt(obj, obj2, num, bool, roundingMode));
    }

    public static /* synthetic */ double mulCheckD$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 18;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return AEQbTJ(obj, obj2, num, bool, roundingMode);
    }

    public static final double AEQbTJ(@NotNull java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(obj, "");
        return C33129mqd.AEQbTJ(AhwBna(obj, obj2, num, bool, roundingMode));
    }

    public static /* synthetic */ double divCheckD$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 18;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return copydefault(obj, obj2, num, bool, roundingMode);
    }

    public static final double copydefault(@NotNull java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(obj, "");
        return C33129mqd.AEQbTJ(KWHzl(obj, obj2, num, bool, roundingMode));
    }

    public static /* synthetic */ double remCheckD$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 18;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return djBIcL(obj, obj2, num, bool, roundingMode);
    }

    public static final double djBIcL(@NotNull java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(obj, "");
        return C33129mqd.AEQbTJ(valueOf(obj, obj2, num, bool, roundingMode));
    }

    public static /* synthetic */ java.lang.String formatCheckS$default(java.lang.Object obj, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            num = 18;
        }
        if ((i & 2) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 4) != 0) {
            roundingMode = OLrzqt;
        }
        return AEQbTJ(obj, num, bool, roundingMode);
    }

    public static final java.lang.String AEQbTJ(java.lang.Object obj, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        AEQbTJ(obj);
        return C33129mqd.AEQbTJ(obj, num, bool, roundingMode);
    }

    public static final boolean AEQbTJ(java.lang.Object obj, java.lang.Object obj2) {
        OLrzqt(obj, obj2);
        return C33129mqd.AEQbTJ(obj, obj2);
    }

    public static final boolean EZpvd(java.lang.Object obj, java.lang.Object obj2) {
        OLrzqt(obj, obj2);
        return C33129mqd.gEmmrt(obj, obj2);
    }

    public static final boolean KWHzl(java.lang.Object obj, java.lang.Object obj2) {
        OLrzqt(obj, obj2);
        return C33129mqd.copydefault(obj, obj2);
    }

    public static final boolean AYXKKw(java.lang.Object obj, java.lang.Object obj2) {
        OLrzqt(obj, obj2);
        return C33129mqd.valueOf(obj, obj2);
    }

    public static final boolean copydefault(java.lang.Object obj, java.lang.Object obj2) {
        OLrzqt(obj, obj2);
        return C33129mqd.OLrzqt(obj, obj2);
    }

    public static final boolean valueOf(java.lang.Object obj, java.lang.Object obj2) {
        OLrzqt(obj, obj2);
        return C33129mqd.AhwBna(obj, obj2);
    }

    public static final java.lang.String djBIcL(java.lang.Object obj, java.lang.Object obj2) {
        OLrzqt(obj, obj2);
        return C33129mqd.KWHzl(obj, obj2);
    }
}
