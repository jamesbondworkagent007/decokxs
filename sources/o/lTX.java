package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class lTX {
    @yCM
    public lTX() {
    }

    public static /* synthetic */ java.lang.String prependFiatSymbol$default(lTX ltx, java.lang.String str, java.lang.String str2, java.lang.String str3, C38307pTy c38307pTy, RoundingMode roundingMode, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            c38307pTy = C38307pTy.Companion.AEQbTJ(2);
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i & 16) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 32) != 0) {
            z = false;
        }
        return ltx.OLrzqt(str, str2, str3, c38307pTy2, roundingMode2, z);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull C38307pTy c38307pTy, @NotNull RoundingMode roundingMode, boolean z) {
        java.lang.String localized$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (z) {
            localized$default = pTB.toLocalizationStringWithMaxPrecision$default(str, 2, roundingMode, null, 4, null);
        } else {
            localized$default = pTB.formatLocalized$default(str, null, 1, null);
        }
        java.lang.String str4 = localized$default;
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "AED")) {
            return "AED " + str4;
        }
        try {
            return C38305pTw.formatFiatSymbol$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), str2, roundingMode, c38307pTy, null, null, null, 56, null);
        } catch (java.lang.Exception unused) {
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "AUD") || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SGD")) {
                return str3 + str4;
            }
            return str3 + str4;
        }
    }

    public static /* synthetic */ java.lang.String getCryptoListPriceFormat$default(lTX ltx, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.String str3, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            i = 2;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = "0.01";
        }
        return ltx.KWHzl(str, str2, z2, i3, str3);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, int i, @NotNull java.lang.String str3) {
        kotlin.Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String str4 = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "AED") ? "%s %s" : "%s%s";
        if (z) {
            java.lang.String str5 = C33129mqd.copydefault(str, str3) ? str2 : null;
            if (str5 == null) {
                str5 = "< " + str2;
            }
            java.lang.String toMaxPrecision$default = C33129mqd.copydefault(str, str3) ? formatToMaxPrecision$default(this, str, i, null, 2, null) : null;
            if (toMaxPrecision$default == null) {
                toMaxPrecision$default = formatToMaxPrecision$default(this, str3, i, null, 2, null);
            }
            pairOLrzqt = C56390yDp.OLrzqt(str5, toMaxPrecision$default);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(str2, OLrzqt(str));
        }
        java.lang.String str6 = (java.lang.String) pairOLrzqt.component1();
        java.lang.String str7 = (java.lang.String) pairOLrzqt.component2();
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str8 = java.lang.String.format(str4, java.util.Arrays.copyOf(new java.lang.Object[]{str6, str7}, 2));
        Intrinsics.checkNotNullExpressionValue(str8, "");
        return str8;
    }

    public static /* synthetic */ java.lang.String appendCryptoSymbol$default(lTX ltx, java.lang.String str, java.lang.String str2, int i, C38307pTy c38307pTy, RoundingMode roundingMode, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 8;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            c38307pTy = C38307pTy.Companion.AEQbTJ(i3);
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i2 & 16) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return ltx.AEQbTJ(str, str2, i3, c38307pTy2, roundingMode);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull C38307pTy c38307pTy, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        try {
            return C38305pTw.formatCryptoCode$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), str2, roundingMode, c38307pTy, null, null, null, 56, null);
        } catch (java.lang.Exception unused) {
            return pTB.formatLocalized$default(C31661lzi.OLrzqt(str, i), null, 1, null) + " " + str2;
        }
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        return C54536xML.toSafeString$default(C54536xML.setNumber$default(new C54536xML(), str, C33129mqd.gEmmrt(java.lang.Integer.valueOf(C54573xNj.copydefault.AEQbTJ(C33129mqd.AEQbTJ(str)))), null, null, 12, null).djBIcL(), false, 1, null);
    }

    public static /* synthetic */ java.lang.String formatToMaxPrecision$default(lTX ltx, java.lang.String str, int i, RoundingMode roundingMode, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return ltx.KWHzl(str, i, roundingMode);
    }

    public final java.lang.String KWHzl(java.lang.String str, int i, RoundingMode roundingMode) {
        return pTB.toLocalizationStringWithMaxPrecision$default(str, i, roundingMode, null, 4, null);
    }
}
