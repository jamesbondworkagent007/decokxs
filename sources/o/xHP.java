package o;

import com.okinc.localization.util.currency.Notation;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class xHP {
    public static /* synthetic */ java.lang.String formatUsdValueToLocalValue$default(java.lang.String str, boolean z, DisplaySign displaySign, RoundingMode roundingMode, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i & 8) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        return EZpvd(str, z, displaySign, roundingMode, bool);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, boolean z, @NotNull DisplaySign displaySign, @NotNull RoundingMode roundingMode, java.lang.Boolean bool) {
        BigDecimal bigDecimalDivide;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (str.length() != 0) {
            int iAEQbTJ = AEQbTJ();
            java.lang.String strMulS$default = Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) ? C33129mqd.mulS$default(str, java.lang.Double.valueOf(xHR.EZpvd.EZpvd().getUsdToThisRate()), null, null, null, 14, null) : str;
            java.lang.String strEZpvd = xHN.EZpvd(strMulS$default);
            try {
                if (iAEQbTJ > 0 && iAEQbTJ <= 18) {
                    bigDecimalDivide = BigDecimal.ONE.divide(BigDecimal.TEN.pow(iAEQbTJ), iAEQbTJ, RoundingMode.HALF_UP);
                } else if (iAEQbTJ == 0) {
                    bigDecimalDivide = BigDecimal.ONE;
                } else {
                    bigDecimalDivide = BigDecimal.ZERO;
                }
                if (C33129mqd.gEmmrt(strEZpvd, bigDecimalDivide) && C33129mqd.AEQbTJ(strEZpvd, 0)) {
                    if (C33129mqd.gEmmrt(strMulS$default, 0)) {
                        strMulS$default = "-" + bigDecimalDivide;
                    } else {
                        java.lang.String string = bigDecimalDivide.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        strMulS$default = string;
                    }
                }
            } catch (java.lang.ArithmeticException | java.lang.Exception unused) {
            }
            return C38305pTw.formatFiatSymbol$default(C33129mqd.EZpvd(strMulS$default), xHR.EZpvd.EZpvd().getIsoCode(), roundingMode, C38307pTy.Companion.AEQbTJ(C33129mqd.AhwBna(java.lang.Integer.valueOf(iAEQbTJ))), displaySign, z ? Notation.COMPACT_SHORT : Notation.DEFAULT, null, 32, null);
        }
        return xHR.EZpvd.KWHzl(str, (245 & 1) != 0 ? false : false, (245 & 2) != 0 ? RoundingMode.HALF_UP : null, (245 & 4) != 0, (245 & 8) == 0 ? false : true, (245 & 16) != 0 ? false : false, (245 & 32) != 0 ? false : false, (245 & 64) != 0 ? DisplaySign.AUTO : null, (245 & 128) == 0 ? false : false);
    }

    public static final int AEQbTJ() {
        return ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).QfsBiF();
    }
}
