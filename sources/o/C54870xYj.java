package o;

import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xYj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54870xYj {
    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, int i, int i2, java.lang.String str2, @NotNull DisplaySign displaySign, boolean z, java.lang.Boolean bool, boolean z2, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        boolean z3 = false;
        return AEQbTJ(str, i, i2, roundingMode, str2, displaySign, z, bool, z2, new InterfaceC54865xYe[]{new C54879xYs(null, str2, java.lang.Boolean.FALSE, z3, 9, null), new C54878xYr(i2, null, str2, z3, displaySign, 10, null)});
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, int i, int i2, java.lang.String str2, @NotNull DisplaySign displaySign, boolean z, java.lang.Boolean bool, boolean z2, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        boolean z3 = false;
        return KWHzl(str, i, i2, roundingMode, str2, displaySign, z, bool, z2, new InterfaceC54865xYe[]{new C54879xYs(null, str2, java.lang.Boolean.FALSE, z3, 9, null), new C54878xYr(i2, null, str2, z3, displaySign, 10, null)});
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, int i, int i2, java.lang.String str2, @NotNull DisplaySign displaySign, boolean z, java.lang.Boolean bool, boolean z2, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        boolean z3 = false;
        return KWHzl(str, i, i2, roundingMode, str2, displaySign, z, bool, z2, new InterfaceC54865xYe[]{new C54879xYs(null, str2, java.lang.Boolean.FALSE, z3, 9, null), new C54878xYr(i2, null, str2, z3, displaySign, 10, null)});
    }

    public static /* synthetic */ java.lang.String formatCoinFromFee$default(java.lang.String str, int i, java.lang.String str2, DisplaySign displaySign, boolean z, java.lang.Boolean bool, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        DisplaySign displaySign2 = displaySign;
        boolean z3 = (i2 & 8) != 0 ? false : z;
        if ((i2 & 16) != 0) {
            bool = null;
        }
        return copydefault(str, i, str2, displaySign2, z3, bool, (i2 & 32) != 0 ? false : z2);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, int i, java.lang.String str2, @NotNull DisplaySign displaySign, boolean z, java.lang.Boolean bool, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        boolean z3 = false;
        return formatCoinLocalized$default(str, 0, i, RoundingMode.DOWN, str2, displaySign, z, bool, z2, new InterfaceC54865xYe[]{new C54879xYs(null, str2, java.lang.Boolean.FALSE, z3, 9, null), new C54878xYr(i, null, str2, z3, displaySign, 10, null)}, 1, null);
    }

    public static final <T extends InterfaceC54865xYe> java.lang.String KWHzl(java.lang.String str, int i, int i2, RoundingMode roundingMode, java.lang.String str2, DisplaySign displaySign, boolean z, java.lang.Boolean bool, boolean z2, T[] tArr) {
        return formatCoinLocalized$default(AEQbTJ(str, i), 0, i2, roundingMode, str2, displaySign, z, bool, z2, tArr, 1, null);
    }

    public static /* synthetic */ java.lang.String formatCoinLocalized$default(java.lang.String str, int i, int i2, RoundingMode roundingMode, java.lang.String str2, DisplaySign displaySign, boolean z, java.lang.Boolean bool, boolean z2, InterfaceC54865xYe[] interfaceC54865xYeArr, int i3, java.lang.Object obj) {
        return AEQbTJ(str, (i3 & 1) != 0 ? 0 : i, i2, roundingMode, str2, displaySign, z, bool, z2, interfaceC54865xYeArr);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, int i, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        java.lang.String strKWHzl = C54862xYb.KWHzl(pTB.OLrzqt((java.lang.Object) str), false, java.lang.Integer.valueOf(i), roundingMode);
        return C33129mqd.OLrzqt(strKWHzl, "0") ? "0.00" : strKWHzl;
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54862xYb.convertToString$default(C54868xYh.KWHzl(str, i), false, null, null, 7, null);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54862xYb.convertToString$default(C54868xYh.EZpvd(str, i), false, null, null, 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends InterfaceC54865xYe> java.lang.String AEQbTJ(java.lang.String str, int i, int i2, RoundingMode roundingMode, java.lang.String str2, DisplaySign displaySign, boolean z, java.lang.Boolean bool, boolean z2, T[] tArr) {
        BigDecimal bigDecimalOLrzqt;
        java.lang.String strEZpvd = null;
        int i3 = 0;
        for (T t : tArr) {
            strEZpvd = t.EZpvd(str);
            if (strEZpvd != null) {
                break;
            }
        }
        if (strEZpvd != null) {
            return strEZpvd;
        }
        if (!z2) {
            i3 = i2;
        } else if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            if (C33129mqd.valueOf(str, "1000000000") || !C33129mqd.AEQbTJ(str, "1000000000")) {
            }
        } else if (Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE) && !C33129mqd.valueOf(str, "10000")) {
            if (C33129mqd.AEQbTJ(str, "10000") && C33129mqd.valueOf(str, "1000000000")) {
                i3 = 2;
            } else if (!C33129mqd.AEQbTJ(str, "1000000000")) {
            }
        }
        if (z && i3 > 4) {
            bigDecimalOLrzqt = C54862xYb.KWHzl(pTB.OLrzqt((java.lang.Object) str), 4, roundingMode);
        } else {
            bigDecimalOLrzqt = pTB.OLrzqt((java.lang.Object) str);
        }
        BigDecimal bigDecimal = bigDecimalOLrzqt;
        if (str2 != null) {
            return C54863xYc.formatCryptoCodeSafe$default(bigDecimal, str2, roundingMode, C38307pTy.Companion.KWHzl(i, i3), displaySign, null, null, 48, null);
        }
        return pTB.formatICUNumber$default(bigDecimal, roundingMode, C38307pTy.Companion.KWHzl(i, i3), displaySign, null, 8, null);
    }
}
