package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.bean.CurrencyPrependSign;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC9737bbI;
import o.InterfaceC9857bdW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jxw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27586jxw {
    public static final C27586jxw OLrzqt = new C27586jxw();

    private C27586jxw() {
    }

    public final InterfaceC23916iOb KWHzl() {
        return (InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class);
    }

    public static /* synthetic */ java.lang.String localizeCryptoAmount$default(C27586jxw c27586jxw, BigDecimal bigDecimal, int i, int i2, java.lang.String str, DisplaySign displaySign, RoundingMode roundingMode, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            str = "";
        }
        java.lang.String str2 = str;
        if ((i3 & 16) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        DisplaySign displaySign2 = displaySign;
        if ((i3 & 32) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return c27586jxw.KWHzl(bigDecimal, i4, i2, str2, displaySign2, roundingMode);
    }

    public final java.lang.String KWHzl(@NotNull BigDecimal bigDecimal, int i, int i2, @NotNull java.lang.String str, @NotNull DisplaySign displaySign, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) InterfaceC9857bdW.TaskDescription.localizeCryptoAmount$default(KWHzl(), bigDecimal, i, i2, str, displaySign, roundingMode, null, false, 192, null)).toString();
    }

    public final java.lang.String KWHzl(@NotNull BigDecimal bigDecimal, int i, int i2, @NotNull DisplaySign displaySign, @NotNull CurrencyDisplayStyle currencyDisplayStyle, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(currencyDisplayStyle, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return KWHzl().EZpvd(bigDecimal, i, i2, displaySign, currencyDisplayStyle, roundingMode);
    }

    public static /* synthetic */ java.lang.String localizeCryptoPrice$default(C27586jxw c27586jxw, BigDecimal bigDecimal, boolean z, CurrencyPrependSign currencyPrependSign, CurrencyDisplayStyle currencyDisplayStyle, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            currencyPrependSign = CurrencyPrependSign.CURRENCY_SIGN_NONE;
        }
        if ((i & 8) != 0) {
            currencyDisplayStyle = CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY;
        }
        return c27586jxw.OLrzqt(bigDecimal, z, currencyPrependSign, currencyDisplayStyle);
    }

    public final java.lang.String OLrzqt(@NotNull BigDecimal bigDecimal, boolean z, @NotNull CurrencyPrependSign currencyPrependSign, @NotNull CurrencyDisplayStyle currencyDisplayStyle) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(currencyPrependSign, "");
        Intrinsics.checkNotNullParameter(currencyDisplayStyle, "");
        return KWHzl().OLrzqt(bigDecimal, z, currencyPrependSign, currencyDisplayStyle);
    }

    public final java.lang.String AEQbTJ(@NotNull BigDecimal bigDecimal, int i, int i2, boolean z, @NotNull DisplaySign displaySign, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return KWHzl().AEQbTJ(bigDecimal, i, i2, z, displaySign, roundingMode);
    }

    public static /* synthetic */ java.lang.String localizeLargeValueStrategy$default(C27586jxw c27586jxw, BigDecimal bigDecimal, CurrencyPrependSign currencyPrependSign, CurrencyDisplayStyle currencyDisplayStyle, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            currencyPrependSign = CurrencyPrependSign.CURRENCY_SIGN_NONE;
        }
        if ((i & 4) != 0) {
            currencyDisplayStyle = CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY;
        }
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return c27586jxw.copydefault(bigDecimal, currencyPrependSign, currencyDisplayStyle, roundingMode);
    }

    public final java.lang.String copydefault(@NotNull BigDecimal bigDecimal, @NotNull CurrencyPrependSign currencyPrependSign, @NotNull CurrencyDisplayStyle currencyDisplayStyle, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(currencyPrependSign, "");
        Intrinsics.checkNotNullParameter(currencyDisplayStyle, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return KWHzl().copydefault(bigDecimal, currencyPrependSign, currencyDisplayStyle, roundingMode);
    }

    public static /* synthetic */ java.lang.String localizeSpecificNumber$default(C27586jxw c27586jxw, BigDecimal bigDecimal, CurrencyPrependSign currencyPrependSign, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            currencyPrependSign = CurrencyPrependSign.CURRENCY_SIGN_NONE;
        }
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return c27586jxw.EZpvd(bigDecimal, currencyPrependSign, roundingMode);
    }

    public final java.lang.String EZpvd(@NotNull BigDecimal bigDecimal, @NotNull CurrencyPrependSign currencyPrependSign, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(currencyPrependSign, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return KWHzl().AEQbTJ(bigDecimal, currencyPrependSign, roundingMode);
    }

    public final int OLrzqt(java.lang.Long l, java.lang.String str) {
        if (l == null || str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return 6;
        }
        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(KWHzl().copydefault(), l.longValue(), false, 2, null);
        if (C59449zhJ.AEQbTJ((java.lang.CharSequence) str, (java.lang.CharSequence) (chainMetaWithRealChainId$default != null ? chainMetaWithRealChainId$default.OLrzqt() : null))) {
            if (chainMetaWithRealChainId$default != null) {
                return chainMetaWithRealChainId$default.AkhnZx();
            }
            return 6;
        }
        InterfaceC9731bbC tokenWithContractAddressAndChainId$default = InterfaceC9737bbI.Application.getTokenWithContractAddressAndChainId$default(KWHzl().copydefault(), str, l.longValue(), false, 4, null);
        if (tokenWithContractAddressAndChainId$default != null) {
            return tokenWithContractAddressAndChainId$default.AkhnZx();
        }
        return 6;
    }

    public final InterfaceC9731bbC KWHzl(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return InterfaceC9737bbI.Application.getTokenWithContractAddressAndChainId$default(KWHzl().copydefault(), str, j, false, 4, null);
    }
}
