package o;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class xHJ {
    public static /* synthetic */ java.lang.String convertDexAmount$default(boolean z, java.lang.String str, RoundingMode roundingMode, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return OLrzqt(z, str, roundingMode, z2);
    }

    public static final java.lang.String OLrzqt(boolean z, java.lang.String str, @NotNull RoundingMode roundingMode, boolean z2) {
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (str == null || str.length() == 0) {
            return "--";
        }
        if (z) {
            return KWHzl(str, roundingMode, z2);
        }
        return EZpvd(str, z2, roundingMode);
    }

    public static /* synthetic */ java.lang.String convertDexAmountWithoutNull$default(boolean z, java.lang.String str, RoundingMode roundingMode, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return copydefault(z, str, roundingMode, z2);
    }

    public static final java.lang.String copydefault(boolean z, @NotNull java.lang.String str, @NotNull RoundingMode roundingMode, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (z) {
            return KWHzl(str, roundingMode, z2);
        }
        return EZpvd(str, z2, roundingMode);
    }

    public static /* synthetic */ java.lang.String convertDexAmountWithSymbol$default(boolean z, java.lang.String str, RoundingMode roundingMode, boolean z2, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        return EZpvd(z, str, roundingMode, z2, str2);
    }

    public static final java.lang.String EZpvd(boolean z, java.lang.String str, @NotNull RoundingMode roundingMode, boolean z2, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (z) {
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            return AEQbTJ(str, roundingMode, z2, str2);
        }
        return EZpvd(str, str2, z2, roundingMode);
    }

    public static /* synthetic */ java.lang.String getBuyShowDataWithSymbol$default(java.lang.String str, RoundingMode roundingMode, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return AEQbTJ(str, roundingMode, z, str2);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull RoundingMode roundingMode, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return copydefault(str, roundingMode, z, str2);
    }

    public static /* synthetic */ java.lang.String getBuyShowDataWithoutSymbol$default(java.lang.String str, RoundingMode roundingMode, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return KWHzl(str, roundingMode, z);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull RoundingMode roundingMode, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return getBuyShowData$default(str, roundingMode, z, null, 8, null);
    }

    public static /* synthetic */ java.lang.String getBuyShowData$default(java.lang.String str, RoundingMode roundingMode, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return copydefault(str, roundingMode, z, str2);
    }

    public static final java.lang.String copydefault(java.lang.String str, RoundingMode roundingMode, boolean z, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String downToMax$default;
        if (str == null || str.length() == 0) {
            return "--";
        }
        if (str2 == null || str2.length() == 0) {
            str3 = "";
        } else {
            str3 = " " + str2;
        }
        if (xHM.KWHzl(xHN.EZpvd(str), 0)) {
            return pTB.formatLocalized$default("0.00", null, 1, null) + str3;
        }
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(xHN.EZpvd(str));
        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(str);
        if (xHM.EZpvd(bigDecimalEZpvd, 1000000000000000L)) {
            return xHM.AEQbTJ(bigDecimalEZpvd2, "0") ? ">999T" : "<-999T";
        }
        if (xHM.OLrzqt(bigDecimalEZpvd, "1000")) {
            int iEZpvd = EZpvd(str);
            C38307pTy c38307pTyAEQbTJ = C38307pTy.Companion.AEQbTJ(iEZpvd);
            if (z) {
                downToMax$default = pTB.formatICUCompact$default(bigDecimalEZpvd2, roundingMode, c38307pTyAEQbTJ, null, null, 12, null);
            } else {
                downToMax$default = pTB.formatDownToMax$default(bigDecimalEZpvd2, iEZpvd, null, 2, null);
            }
        } else {
            int iEZpvd2 = EZpvd(str);
            C38307pTy c38307pTyAEQbTJ2 = C38307pTy.Companion.AEQbTJ(iEZpvd2);
            if (z) {
                downToMax$default = pTB.formatICUCompact$default(bigDecimalEZpvd2, roundingMode, c38307pTyAEQbTJ2, null, null, 12, null);
            } else {
                downToMax$default = pTB.formatDownToMax$default(bigDecimalEZpvd2, iEZpvd2, null, 2, null);
            }
        }
        return downToMax$default + str3;
    }

    public static final int EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(xHN.EZpvd(str));
        if (xHM.OLrzqt(bigDecimalEZpvd, "1000")) {
            return xHM.OLrzqt(bigDecimalEZpvd, "1") ? 8 : 4;
        }
        return 2;
    }

    public static final C38307pTy copydefault(java.lang.String str) {
        if (C33129mqd.gEmmrt(str, "0.0001")) {
            return C38307pTy.Companion.copydefault(1, 5);
        }
        if (C33129mqd.gEmmrt(str, "1")) {
            return C38307pTy.Companion.copydefault(1, 5);
        }
        if (C33129mqd.gEmmrt(str, "10")) {
            return C38307pTy.Companion.KWHzl(0, 4);
        }
        if (C33129mqd.gEmmrt(str, "1000")) {
            return C38307pTy.Companion.AEQbTJ(4);
        }
        return C38307pTy.Companion.KWHzl(0, 2);
    }

    public static /* synthetic */ java.lang.String getSellShowDataWithoutSymbol$default(java.lang.String str, boolean z, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return EZpvd(str, z, roundingMode);
    }

    public static final java.lang.String EZpvd(java.lang.String str, boolean z, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return OLrzqt(str, z, roundingMode);
    }

    public static /* synthetic */ java.lang.String getSellShowDataWithSymbol$default(java.lang.String str, java.lang.String str2, boolean z, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return EZpvd(str, str2, z, roundingMode);
    }

    public static final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, boolean z, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(roundingMode, "");
        java.lang.String strOLrzqt = OLrzqt(str, z, roundingMode);
        if (str2 == null) {
            str2 = "";
        }
        return strOLrzqt + " " + str2;
    }

    public static /* synthetic */ java.lang.String handleSellAmount$default(java.lang.String str, boolean z, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return OLrzqt(str, z, roundingMode);
    }

    public static final java.lang.String OLrzqt(java.lang.String str, boolean z, RoundingMode roundingMode) {
        C38307pTy c38307pTyCopydefault = copydefault(str);
        if (C33129mqd.OLrzqt(str, "0")) {
            return xMR.copydefault.copydefault("0");
        }
        if (C33129mqd.gEmmrt(str, "0.0001")) {
            return pTB.formatSubscriptNumber$default(C33129mqd.EZpvd(C33129mqd.formatS$default(str, 16, null, null, 6, null)), roundingMode, c38307pTyCopydefault, null, null, 12, null);
        }
        if (C33129mqd.gEmmrt(str, "1")) {
            return pTB.formatICUNumber$default(C33129mqd.EZpvd(C33129mqd.formatS$default(str, 16, null, null, 6, null)), roundingMode, c38307pTyCopydefault, null, null, 12, null);
        }
        if (C33129mqd.gEmmrt(str, "10")) {
            return pTB.formatICUNumber$default(C33129mqd.EZpvd(str), roundingMode, c38307pTyCopydefault, null, null, 12, null);
        }
        if (C33129mqd.gEmmrt(str, "1000")) {
            return pTB.formatICUNumber$default(C33129mqd.EZpvd(str), roundingMode, c38307pTyCopydefault, null, null, 12, null);
        }
        if (z) {
            return pTB.formatICUCompact$default(C33129mqd.EZpvd(str), roundingMode, c38307pTyCopydefault, null, null, 12, null);
        }
        return pTB.formatICUNumber$default(C33129mqd.EZpvd(str), roundingMode, c38307pTyCopydefault, null, null, 12, null);
    }
}
