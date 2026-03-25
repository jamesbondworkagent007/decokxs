package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.bean.CurrencyPrependSign;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13884dax extends AbstractC43215rlA implements InterfaceC9857bdW {
    @Override // o.InterfaceC9857bdW
    public java.lang.String EZpvd(@NotNull BigDecimal bigDecimal, int i, int i2, @NotNull java.lang.String str, @NotNull DisplaySign displaySign, @NotNull RoundingMode roundingMode, java.lang.Boolean bool, boolean z) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        java.lang.String plainString = bigDecimal.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        return C54870xYj.OLrzqt(plainString, (249 & 1) != 0 ? 0 : i, i2, str, (249 & 8) != 0 ? DisplaySign.AUTO : displaySign, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : bool, (249 & 64) != 0 ? false : z, (249 & 128) != 0 ? RoundingMode.DOWN : roundingMode);
    }

    @Override // o.InterfaceC9857bdW
    public java.lang.String EZpvd(@NotNull BigDecimal bigDecimal, int i, int i2, @NotNull DisplaySign displaySign, @NotNull CurrencyDisplayStyle currencyDisplayStyle, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(currencyDisplayStyle, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return C54880xYt.formatValuation$default(bigDecimal, i, i2, displaySign, currencyDisplayStyle, null, roundingMode, false, 80, null);
    }

    @Override // o.InterfaceC9857bdW
    public java.lang.String OLrzqt(@NotNull BigDecimal bigDecimal, boolean z, @NotNull CurrencyPrependSign currencyPrependSign, @NotNull CurrencyDisplayStyle currencyDisplayStyle) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(currencyPrependSign, "");
        Intrinsics.checkNotNullParameter(currencyDisplayStyle, "");
        return C54872xYl.formatCoinPrice$default(bigDecimal, currencyPrependSign, z, null, currencyDisplayStyle, null, 20, null);
    }

    @Override // o.InterfaceC9857bdW
    public java.lang.String AEQbTJ(@NotNull BigDecimal bigDecimal, int i, int i2, boolean z, @NotNull DisplaySign displaySign, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return C54873xYm.OLrzqt(bigDecimal, i, i2, z, displaySign, roundingMode);
    }

    @Override // o.InterfaceC9857bdW
    public java.lang.String copydefault(@NotNull BigDecimal bigDecimal, @NotNull CurrencyPrependSign currencyPrependSign, @NotNull CurrencyDisplayStyle currencyDisplayStyle, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(currencyPrependSign, "");
        Intrinsics.checkNotNullParameter(currencyDisplayStyle, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return C54873xYm.formatLargeValue$default(bigDecimal, currencyPrependSign, null, currencyDisplayStyle, roundingMode, false, 18, null);
    }

    @Override // o.InterfaceC9857bdW
    public java.lang.String AEQbTJ(@NotNull BigDecimal bigDecimal, @NotNull CurrencyPrependSign currencyPrependSign, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(currencyPrependSign, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return C54873xYm.EZpvd(bigDecimal, currencyPrependSign, roundingMode);
    }
}
