package com.okinc.okex.lite_market_api;

import com.okinc.localization.util.currency.CurrencyProxy;
import com.okinc.localization.util.currency.Notation;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33129mqd;
import o.C38305pTw;
import o.C38307pTy;
import o.C54589xNz;
import o.C56390yDp;
import o.C56444yFp;
import o.C59449zhJ;
import o.InterfaceC54581xNr;
import o.InterfaceC56445yFq;
import o.pTB;
import o.xHM;
import o.xHR;
import o.xMW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class DexUtils {
    public static final DexUtils EZpvd = new DexUtils();

    private DexUtils() {
    }

    public final String EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull RoundingMode roundingMode, boolean z, double d) {
        BigDecimal bigDecimalEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (EZpvd(str)) {
            return "--";
        }
        if (z) {
            bigDecimalEZpvd = C33129mqd.EZpvd(KWHzl(str));
        } else {
            bigDecimalEZpvd = C33129mqd.EZpvd(C33129mqd.mulS$default(str, Double.valueOf(d), null, null, null, 14, null));
        }
        BigDecimal bigDecimal = new BigDecimal("0.000000000000001");
        BigDecimal bigDecimal2 = BigDecimal.ONE;
        if (bigDecimalEZpvd.remainder(bigDecimal2).abs().compareTo(bigDecimal) < 0 || bigDecimalEZpvd.compareTo(bigDecimal2) >= 0) {
            if (z) {
                return getScientificallyFormattedValue$default(this, null, str, roundingMode, false, 1, null);
            }
            try {
                Function1<String, String> currencySymbolCallback = CurrencyProxy.INSTANCE.getCurrencySymbolCallback();
                str3 = currencySymbolCallback != null ? currencySymbolCallback.invoke(str2) : null;
            } catch (Exception unused) {
            }
            return copydefault(str3, C33129mqd.gEmmrt(bigDecimalEZpvd), roundingMode, false);
        }
        try {
            C38307pTy c38307pTyCopydefault = C38307pTy.Companion.copydefault(1, 5);
            DisplaySign displaySign = DisplaySign.AUTO;
            Notation notation = Notation.DEFAULT;
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            return C38305pTw.EZpvd(bigDecimalEZpvd, str2, roundingMode, c38307pTyCopydefault, displaySign, notation, locale);
        } catch (Exception unused2) {
            String iCUNumber$default = pTB.formatICUNumber$default(bigDecimalEZpvd, roundingMode, C38307pTy.Companion.copydefault(1, 5), DisplaySign.AUTO, null, 8, null);
            if (Intrinsics.EZpvd((Object) str2, (Object) "AUD") || Intrinsics.EZpvd((Object) str2, (Object) "SGD")) {
                return str3 + iCUNumber$default;
            }
            return str3 + " " + iCUNumber$default;
        }
    }

    public final String KWHzl(String str) {
        String strAhwBna;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        xMW xmwKWHzl = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.KWHzl() : null;
        return (xmwKWHzl == null || (strAhwBna = xmwKWHzl.AhwBna(str)) == null) ? "" : strAhwBna;
    }

    public static /* synthetic */ String getFormattedLiquidity$default(DexUtils dexUtils, String str, RoundingMode roundingMode, int i, Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        return dexUtils.OLrzqt(str, roundingMode);
    }

    public final String OLrzqt(@NotNull String str, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return getScientificallyFormattedValue$default(this, null, str, roundingMode, false, 9, null);
    }

    public static /* synthetic */ String getFormattedTurnOver$default(DexUtils dexUtils, String str, RoundingMode roundingMode, int i, Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        return dexUtils.EZpvd(str, roundingMode);
    }

    public final String EZpvd(@NotNull String str, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return getScientificallyFormattedValue$default(this, null, str, roundingMode, false, 9, null);
    }

    public static /* synthetic */ String getFormattedMarketCap$default(DexUtils dexUtils, String str, RoundingMode roundingMode, int i, Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        return dexUtils.copydefault(str, roundingMode);
    }

    public final String copydefault(@NotNull String str, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return getScientificallyFormattedValue$default(this, null, str, roundingMode, false, 9, null);
    }

    public final Pair<String, Trend> EZpvd(@NotNull String str, int i, int i2, @NotNull RoundingMode roundingMode, @NotNull Locale locale, double d) {
        Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(locale, "");
        if (EZpvd(str)) {
            return C56390yDp.OLrzqt("--", Trend.FLAT);
        }
        BigDecimal bigDecimalMultiply = C33129mqd.EZpvd(StringsKt__StringsKt.hDKMBd((CharSequence) C59449zhJ.replace$default(str, "%", "", false, 4, (Object) null)).toString()).multiply(BigDecimal.valueOf(d));
        BigDecimal bigDecimal = new BigDecimal("99999");
        BigDecimal bigDecimal2 = new BigDecimal("-99.99");
        if (bigDecimalMultiply.compareTo(bigDecimal) > 0) {
            pairOLrzqt = C56390yDp.OLrzqt(bigDecimal, ">");
        } else if (bigDecimalMultiply.compareTo(bigDecimal2) < 0) {
            pairOLrzqt = C56390yDp.OLrzqt(bigDecimal2, "<");
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(bigDecimalMultiply, "");
        }
        BigDecimal bigDecimal3 = (BigDecimal) pairOLrzqt.component1();
        String str2 = (String) pairOLrzqt.component2();
        String iCUPercent$default = pTB.formatICUPercent$default(bigDecimal3, roundingMode, C38307pTy.Companion.KWHzl(i, i2), DisplaySign.ALWAYS, null, locale, 8, null);
        BigDecimal bigDecimal4 = BigDecimal.ZERO;
        if (bigDecimalMultiply.compareTo(bigDecimal4) > 0) {
            return C56390yDp.OLrzqt(str2 + iCUPercent$default, Trend.UP);
        }
        if (bigDecimalMultiply.compareTo(bigDecimal4) >= 0) {
            return C56390yDp.OLrzqt("0.00%", Trend.FLAT);
        }
        return C56390yDp.OLrzqt(str2 + iCUPercent$default, Trend.DOWN);
    }

    public static /* synthetic */ String getFormattedAlertPrice$default(DexUtils dexUtils, String str, int i, RoundingMode roundingMode, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        return dexUtils.EZpvd(str, i, roundingMode);
    }

    public final String EZpvd(@NotNull String str, int i, @NotNull RoundingMode roundingMode) {
        C38307pTy c38307pTyKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (EZpvd(str)) {
            return "--";
        }
        BigDecimal bigDecimalStripTrailingZeros = C33129mqd.EZpvd(str).setScale(i, roundingMode).stripTrailingZeros();
        if (xHM.OLrzqt(bigDecimalStripTrailingZeros, "10")) {
            if (xHM.OLrzqt(bigDecimalStripTrailingZeros, "1")) {
                c38307pTyKWHzl = C38307pTy.Companion.copydefault(1, 5);
            } else {
                c38307pTyKWHzl = C38307pTy.Companion.KWHzl(0, 4);
            }
        } else {
            c38307pTyKWHzl = C38307pTy.Companion.KWHzl(0, 2);
        }
        return pTB.formatICUNumber$default(C33129mqd.EZpvd(bigDecimalStripTrailingZeros), roundingMode, c38307pTyKWHzl, null, null, 12, null);
    }

    public static /* synthetic */ String getScientificallyFormattedValue$default(DexUtils dexUtils, String str, String str2, RoundingMode roundingMode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return dexUtils.copydefault(str, str2, roundingMode, z);
    }

    public final String copydefault(String str, String str2, RoundingMode roundingMode, boolean z) {
        if (EZpvd(str2)) {
            return "--";
        }
        if (str == null) {
            return xHR.EZpvd.KWHzl(C33129mqd.gEmmrt(str2), z, roundingMode, true, true, false, false, DisplaySign.AUTO, false);
        }
        return str + xHR.EZpvd.KWHzl(C33129mqd.gEmmrt(str2), z, roundingMode, false, true, false, true, DisplaySign.AUTO, true);
    }

    public final boolean EZpvd(String str) {
        return Intrinsics.EZpvd((Object) str, (Object) "--") || !C33129mqd.OLrzqt((CharSequence) str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Trend {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Trend[] $VALUES;
        public static final Trend UP = new Trend("UP", 0);
        public static final Trend DOWN = new Trend("DOWN", 1);
        public static final Trend FLAT = new Trend("FLAT", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Trend[] $values() {
            return new Trend[]{UP, DOWN, FLAT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Trend> getEntries() {
            return $ENTRIES;
        }

        private Trend(String str, int i) {
        }

        static {
            Trend[] trendArr$values = $values();
            $VALUES = trendArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(trendArr$values);
        }

        public static Trend valueOf(String str) {
            return (Trend) Enum.valueOf(Trend.class, str);
        }

        public static Trend[] values() {
            return (Trend[]) $VALUES.clone();
        }
    }
}
