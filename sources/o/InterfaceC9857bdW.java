package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.bean.CurrencyPrependSign;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bdW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9857bdW extends InterfaceC43217rlC {
    java.lang.String AEQbTJ(@NotNull BigDecimal bigDecimal, int i, int i2, boolean z, @NotNull DisplaySign displaySign, @NotNull RoundingMode roundingMode);

    java.lang.String AEQbTJ(@NotNull BigDecimal bigDecimal, @NotNull CurrencyPrependSign currencyPrependSign, @NotNull RoundingMode roundingMode);

    java.lang.String EZpvd(@NotNull BigDecimal bigDecimal, int i, int i2, @NotNull DisplaySign displaySign, @NotNull CurrencyDisplayStyle currencyDisplayStyle, @NotNull RoundingMode roundingMode);

    java.lang.String EZpvd(@NotNull BigDecimal bigDecimal, int i, int i2, @NotNull java.lang.String str, @NotNull DisplaySign displaySign, @NotNull RoundingMode roundingMode, java.lang.Boolean bool, boolean z);

    java.lang.String OLrzqt(@NotNull BigDecimal bigDecimal, boolean z, @NotNull CurrencyPrependSign currencyPrependSign, @NotNull CurrencyDisplayStyle currencyDisplayStyle);

    java.lang.String copydefault(@NotNull BigDecimal bigDecimal, @NotNull CurrencyPrependSign currencyPrependSign, @NotNull CurrencyDisplayStyle currencyDisplayStyle, @NotNull RoundingMode roundingMode);

    /* JADX INFO: renamed from: o.bdW$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ java.lang.String localizeCryptoAmount$default(InterfaceC9857bdW interfaceC9857bdW, BigDecimal bigDecimal, int i, int i2, java.lang.String str, DisplaySign displaySign, RoundingMode roundingMode, java.lang.Boolean bool, boolean z, int i3, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC9857bdW.EZpvd(bigDecimal, (i3 & 2) != 0 ? 0 : i, i2, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? DisplaySign.AUTO : displaySign, (i3 & 32) != 0 ? RoundingMode.DOWN : roundingMode, (i3 & 64) != 0 ? null : bool, (i3 & 128) != 0 ? false : z);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localizeCryptoAmount");
        }

        public static /* synthetic */ java.lang.String localizeFiatAmount$default(InterfaceC9857bdW interfaceC9857bdW, BigDecimal bigDecimal, int i, int i2, DisplaySign displaySign, CurrencyDisplayStyle currencyDisplayStyle, RoundingMode roundingMode, int i3, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC9857bdW.EZpvd(bigDecimal, (i3 & 2) != 0 ? 2 : i, (i3 & 4) == 0 ? i2 : 2, (i3 & 8) != 0 ? DisplaySign.AUTO : displaySign, (i3 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : currencyDisplayStyle, (i3 & 32) != 0 ? RoundingMode.DOWN : roundingMode);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localizeFiatAmount");
        }

        public static /* synthetic */ java.lang.String localizeCryptoPrice$default(InterfaceC9857bdW interfaceC9857bdW, BigDecimal bigDecimal, boolean z, CurrencyPrependSign currencyPrependSign, CurrencyDisplayStyle currencyDisplayStyle, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localizeCryptoPrice");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                currencyPrependSign = CurrencyPrependSign.CURRENCY_SIGN_NONE;
            }
            if ((i & 8) != 0) {
                currencyDisplayStyle = CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY;
            }
            return interfaceC9857bdW.OLrzqt(bigDecimal, z, currencyPrependSign, currencyDisplayStyle);
        }

        public static /* synthetic */ java.lang.String localizePriceChangePercentage$default(InterfaceC9857bdW interfaceC9857bdW, BigDecimal bigDecimal, int i, int i2, boolean z, DisplaySign displaySign, RoundingMode roundingMode, int i3, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC9857bdW.AEQbTJ(bigDecimal, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 2 : i2, (i3 & 8) == 0 ? z : false, (i3 & 16) != 0 ? DisplaySign.EXCEPT_ZERO : displaySign, (i3 & 32) != 0 ? RoundingMode.DOWN : roundingMode);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localizePriceChangePercentage");
        }

        public static /* synthetic */ java.lang.String localizeLargeValueStrategy$default(InterfaceC9857bdW interfaceC9857bdW, BigDecimal bigDecimal, CurrencyPrependSign currencyPrependSign, CurrencyDisplayStyle currencyDisplayStyle, RoundingMode roundingMode, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localizeLargeValueStrategy");
            }
            if ((i & 2) != 0) {
                currencyPrependSign = CurrencyPrependSign.CURRENCY_SIGN_NONE;
            }
            if ((i & 4) != 0) {
                currencyDisplayStyle = CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY;
            }
            if ((i & 8) != 0) {
                roundingMode = RoundingMode.DOWN;
            }
            return interfaceC9857bdW.copydefault(bigDecimal, currencyPrependSign, currencyDisplayStyle, roundingMode);
        }

        public static /* synthetic */ java.lang.String localizeSpecificNumber$default(InterfaceC9857bdW interfaceC9857bdW, BigDecimal bigDecimal, CurrencyPrependSign currencyPrependSign, RoundingMode roundingMode, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localizeSpecificNumber");
            }
            if ((i & 2) != 0) {
                currencyPrependSign = CurrencyPrependSign.CURRENCY_SIGN_NONE;
            }
            if ((i & 4) != 0) {
                roundingMode = RoundingMode.DOWN;
            }
            return interfaceC9857bdW.AEQbTJ(bigDecimal, currencyPrependSign, roundingMode);
        }
    }
}
