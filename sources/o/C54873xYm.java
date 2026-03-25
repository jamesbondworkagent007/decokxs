package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.bean.CurrencyPrependSign;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xYm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54873xYm {
    public static final BigDecimal AEQbTJ = BigDecimal.ZERO;
    public static final BigDecimal copydefault = BigDecimal.ONE;
    public static final BigDecimal KWHzl = new BigDecimal("99999");
    public static final double OLrzqt = C33129mqd.AEQbTJ(java.lang.Float.valueOf(100.0f));
    public static final BigDecimal EZpvd = new BigDecimal("1000");

    /* JADX INFO: renamed from: o.xYm$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CurrencyDisplayStyle.values().length];
            try {
                iArr[CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    public static /* synthetic */ java.lang.String formatPriceChangePercentage$default(BigDecimal bigDecimal, int i, int i2, boolean z, DisplaySign displaySign, RoundingMode roundingMode, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 2;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            displaySign = DisplaySign.EXCEPT_ZERO;
        }
        if ((i3 & 16) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return OLrzqt(bigDecimal, i, i2, z, displaySign, roundingMode);
    }

    public static final java.lang.String OLrzqt(@NotNull BigDecimal bigDecimal, int i, int i2, boolean z, @NotNull DisplaySign displaySign, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        java.lang.Double dValueOf = z ? java.lang.Double.valueOf(OLrzqt) : null;
        BigDecimal bigDecimalMovePointLeft = copydefault.movePointLeft(z ? 4 : 2);
        BigDecimal bigDecimalMovePointLeft2 = KWHzl.movePointLeft(z ? 2 : 0);
        java.lang.String strCopydefault = C54862xYb.copydefault(C33129mqd.gEmmrt(bigDecimal), displaySign);
        if (C33129mqd.OLrzqt(bigDecimal, AEQbTJ)) {
            return pTB.formatICUPercent$default(bigDecimal, roundingMode, C38307pTy.Companion.EZpvd(i2), displaySign, dValueOf, null, 16, null);
        }
        if (C33129mqd.gEmmrt(bigDecimal.abs(), bigDecimalMovePointLeft)) {
            Intrinsics.copydefault(bigDecimalMovePointLeft);
            return strCopydefault + "<" + pTB.formatICUPercent$default(bigDecimalMovePointLeft, roundingMode, C38307pTy.Companion.EZpvd(i2), DisplaySign.AUTO, dValueOf, null, 16, null);
        }
        if (C33129mqd.copydefault(bigDecimal.abs(), bigDecimalMovePointLeft2)) {
            Intrinsics.copydefault(bigDecimalMovePointLeft2);
            return strCopydefault + ">" + pTB.formatICUPercent$default(bigDecimalMovePointLeft2, roundingMode, C38307pTy.Companion.EZpvd(0), DisplaySign.AUTO, dValueOf, null, 16, null);
        }
        return pTB.formatICUPercent$default(bigDecimal, roundingMode, C38307pTy.Companion.KWHzl(i, i2), displaySign, dValueOf, null, 16, null);
    }

    public static /* synthetic */ java.lang.String formatLargeValue$default(BigDecimal bigDecimal, CurrencyPrependSign currencyPrependSign, WalletCurrencyBean walletCurrencyBean, CurrencyDisplayStyle currencyDisplayStyle, RoundingMode roundingMode, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            currencyPrependSign = CurrencyPrependSign.CURRENCY_SIGN_NONE;
        }
        CurrencyPrependSign currencyPrependSign2 = currencyPrependSign;
        if ((i & 2) != 0) {
            walletCurrencyBean = C54864xYd.AEQbTJ.copydefault();
        }
        WalletCurrencyBean walletCurrencyBean2 = walletCurrencyBean;
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 16) != 0) {
            z = false;
        }
        return OLrzqt(bigDecimal, currencyPrependSign2, walletCurrencyBean2, currencyDisplayStyle, roundingMode2, z);
    }

    public static final java.lang.String OLrzqt(@NotNull BigDecimal bigDecimal, @NotNull CurrencyPrependSign currencyPrependSign, WalletCurrencyBean walletCurrencyBean, @NotNull CurrencyDisplayStyle currencyDisplayStyle, @NotNull RoundingMode roundingMode, boolean z) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(currencyPrependSign, "");
        Intrinsics.checkNotNullParameter(currencyDisplayStyle, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return EZpvd(new C54875xYo(OLrzqt(bigDecimal, walletCurrencyBean, roundingMode, z), walletCurrencyBean, currencyPrependSign, currencyDisplayStyle));
    }

    public static /* synthetic */ java.lang.String formatSpecificNum$default(BigDecimal bigDecimal, CurrencyPrependSign currencyPrependSign, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return EZpvd(bigDecimal, currencyPrependSign, roundingMode);
    }

    public static final java.lang.String EZpvd(@NotNull BigDecimal bigDecimal, @NotNull CurrencyPrependSign currencyPrependSign, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(currencyPrependSign, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return copydefault(new C54876xYp(KWHzl(bigDecimal, roundingMode), currencyPrependSign));
    }

    public static final java.lang.String KWHzl(BigDecimal bigDecimal, RoundingMode roundingMode) {
        return C33129mqd.gEmmrt(bigDecimal, EZpvd) ? pTB.formatDownToMax$default(bigDecimal, 0, null, 2, null) : convertLargeValueToDisplay$default(bigDecimal, null, roundingMode, false, 4, null);
    }

    public static /* synthetic */ java.lang.String convertLargeValueToDisplay$default(BigDecimal bigDecimal, WalletCurrencyBean walletCurrencyBean, RoundingMode roundingMode, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return OLrzqt(bigDecimal, walletCurrencyBean, roundingMode, z);
    }

    public static final java.lang.String OLrzqt(BigDecimal bigDecimal, WalletCurrencyBean walletCurrencyBean, RoundingMode roundingMode, boolean z) {
        if (walletCurrencyBean != null) {
            bigDecimal = C54862xYb.OLrzqt(bigDecimal, java.lang.Double.valueOf(walletCurrencyBean.getUsdToThisRate()));
        }
        BigDecimal bigDecimal2 = bigDecimal;
        BigDecimal bigDecimalMovePointLeft = copydefault.movePointLeft(2);
        int maxPrecision = (!z || walletCurrencyBean == null) ? 2 : walletCurrencyBean.getMaxPrecision();
        if (C33129mqd.OLrzqt(bigDecimal2, AEQbTJ)) {
            return "0";
        }
        if (!C33129mqd.gEmmrt(bigDecimal2, bigDecimalMovePointLeft)) {
            return C33129mqd.gEmmrt(bigDecimal2, EZpvd) ? pTB.formatDownToMax$default(bigDecimal2, maxPrecision, null, 2, null) : pTB.formatICUCompact$default(bigDecimal2, roundingMode, C38307pTy.Companion.AEQbTJ(2), null, null, 12, null);
        }
        Intrinsics.copydefault(bigDecimalMovePointLeft);
        return "<" + pTB.formatDownToMax$default(bigDecimalMovePointLeft, maxPrecision, null, 2, null);
    }

    public static final java.lang.String EZpvd(C54875xYo c54875xYo) {
        java.lang.String isoCode;
        CurrencyPrependSign currencyPrependSignCopydefault = c54875xYo.copydefault();
        java.lang.String strAEQbTJ = c54875xYo.AEQbTJ();
        int i = Activity.OLrzqt[c54875xYo.OLrzqt().ordinal()];
        if (i == 1) {
            WalletCurrencyBean walletCurrencyBeanEZpvd = c54875xYo.EZpvd();
            if (walletCurrencyBeanEZpvd == null || (isoCode = walletCurrencyBeanEZpvd.getIsoCode()) == null) {
                isoCode = "";
            }
        } else {
            if (i == 2) {
                WalletCurrencyBean walletCurrencyBeanEZpvd2 = c54875xYo.EZpvd();
                if (walletCurrencyBeanEZpvd2 == null || (isoCode = walletCurrencyBeanEZpvd2.getSign()) == null) {
                }
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            isoCode = "";
        }
        return C54862xYb.AEQbTJ(currencyPrependSignCopydefault, strAEQbTJ, isoCode, c54875xYo.OLrzqt());
    }

    public static final java.lang.String copydefault(C54876xYp c54876xYp) {
        return C54862xYb.AEQbTJ(c54876xYp.EZpvd(), c54876xYp.copydefault(), "", CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY);
    }
}
