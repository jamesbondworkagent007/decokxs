package o;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xYi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54869xYi {
    public static /* synthetic */ java.lang.String weiToGwei$default(java.lang.String str, java.lang.Integer num, boolean z, java.lang.String str2, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        return AEQbTJ(str, num, z, str2, z2);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, java.lang.Integer num, boolean z, java.lang.String str2, boolean z2) {
        java.lang.String strConvertToString$default;
        Intrinsics.checkNotNullParameter(str, "");
        BigDecimal bigDecimalCopydefault = C54862xYb.copydefault(2);
        BigDecimal bigDecimalKWHzl = C54868xYh.KWHzl(str, (num != null ? num.intValue() : 18) / 2);
        if (z2 && C33129mqd.copydefault(bigDecimalKWHzl, C54862xYb.copydefault(2))) {
            strConvertToString$default = C54862xYb.KWHzl(bigDecimalKWHzl, false, (java.lang.Integer) 2, RoundingMode.DOWN);
        } else {
            strConvertToString$default = C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null);
        }
        if (z) {
            if (C33129mqd.gEmmrt(C33129mqd.EZpvd(strConvertToString$default), bigDecimalCopydefault)) {
                java.lang.String plainString = bigDecimalCopydefault.toPlainString();
                Intrinsics.checkNotNullExpressionValue(plainString, "");
                strConvertToString$default = "<" + pTB.formatLocalizedWithMinPrecision$default(plainString, 2, null, 2, null);
            } else {
                strConvertToString$default = pTB.formatLocalizedWithMinPrecision$default(strConvertToString$default, 2, null, 2, null);
            }
        }
        if (str2 == null) {
            return strConvertToString$default;
        }
        return strConvertToString$default + " " + str2;
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, java.lang.Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strKWHzl = C54862xYb.KWHzl(C54868xYh.EZpvd(str, (num != null ? num.intValue() : 18) / 2), false, (java.lang.Integer) 0, RoundingMode.UP);
        return z ? pTB.formatLocalized$default(strKWHzl, null, 1, null) : strKWHzl;
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54862xYb.KWHzl(pTB.OLrzqt((java.lang.Object) str), RoundingMode.UP, false, (java.lang.Integer) 0);
    }
}
