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

/* JADX INFO: renamed from: o.xYl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54872xYl {
    public static final BigDecimal AEQbTJ = BigDecimal.ZERO;
    public static final BigDecimal copydefault = BigDecimal.ONE;
    public static final BigDecimal OLrzqt = BigDecimal.TEN;
    public static final BigDecimal EZpvd = new BigDecimal("0.0001");

    /* JADX INFO: renamed from: o.xYl$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CurrencyDisplayStyle.values().length];
            try {
                iArr[CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    public static /* synthetic */ java.lang.String formatCoinPrice$default(BigDecimal bigDecimal, CurrencyPrependSign currencyPrependSign, boolean z, WalletCurrencyBean walletCurrencyBean, CurrencyDisplayStyle currencyDisplayStyle, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            currencyPrependSign = CurrencyPrependSign.CURRENCY_SIGN_NONE;
        }
        CurrencyPrependSign currencyPrependSign2 = currencyPrependSign;
        if ((i & 4) != 0) {
            walletCurrencyBean = C54864xYd.AEQbTJ.copydefault();
        }
        WalletCurrencyBean walletCurrencyBean2 = walletCurrencyBean;
        if ((i & 16) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return EZpvd(bigDecimal, currencyPrependSign2, z, walletCurrencyBean2, currencyDisplayStyle, roundingMode);
    }

    public static final java.lang.String EZpvd(@NotNull BigDecimal bigDecimal, @NotNull CurrencyPrependSign currencyPrependSign, boolean z, @NotNull WalletCurrencyBean walletCurrencyBean, @NotNull CurrencyDisplayStyle currencyDisplayStyle, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(currencyPrependSign, "");
        Intrinsics.checkNotNullParameter(walletCurrencyBean, "");
        Intrinsics.checkNotNullParameter(currencyDisplayStyle, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return KWHzl(new C54874xYn(KWHzl(bigDecimal, z, walletCurrencyBean, roundingMode), walletCurrencyBean.getSign(), walletCurrencyBean.getIsoCode(), currencyPrependSign, currencyDisplayStyle));
    }

    public static final java.lang.String KWHzl(BigDecimal bigDecimal, boolean z, WalletCurrencyBean walletCurrencyBean, RoundingMode roundingMode) {
        BigDecimal bigDecimalOLrzqt = C54862xYb.OLrzqt(bigDecimal, java.lang.Double.valueOf(walletCurrencyBean.getUsdToThisRate()));
        if (z) {
            return OLrzqt(bigDecimalOLrzqt, roundingMode);
        }
        return KWHzl(bigDecimalOLrzqt, roundingMode);
    }

    public static final java.lang.String OLrzqt(BigDecimal bigDecimal, RoundingMode roundingMode) {
        BigDecimal bigDecimalMovePointLeft = copydefault.movePointLeft(2);
        if (C33129mqd.OLrzqt(bigDecimal, AEQbTJ)) {
            return pTB.formatICUNumber$default(bigDecimal, roundingMode, C38307pTy.Companion.EZpvd(2), null, null, 12, null);
        }
        if (C33129mqd.gEmmrt(bigDecimal, bigDecimalMovePointLeft)) {
            Intrinsics.copydefault(bigDecimalMovePointLeft);
            return "<" + pTB.formatDownToMax$default(bigDecimalMovePointLeft, 2, null, 2, null);
        }
        return pTB.formatICUNumber$default(bigDecimal, roundingMode, C38307pTy.Companion.EZpvd(2), null, null, 12, null);
    }

    public static final java.lang.String KWHzl(BigDecimal bigDecimal, RoundingMode roundingMode) {
        if (C33129mqd.OLrzqt(bigDecimal, AEQbTJ)) {
            return pTB.formatICUNumber$default(bigDecimal, roundingMode, C38307pTy.Companion.EZpvd(2), null, null, 12, null);
        }
        BigDecimal bigDecimal2 = OLrzqt;
        if (C33129mqd.copydefault(bigDecimal, bigDecimal2)) {
            return pTB.formatICUNumber$default(bigDecimal, roundingMode, C38307pTy.Companion.AEQbTJ(2), null, null, 12, null);
        }
        BigDecimal bigDecimal3 = copydefault;
        Intrinsics.checkNotNullExpressionValue(bigDecimal3, "");
        Intrinsics.checkNotNullExpressionValue(bigDecimal2, "");
        if (C54862xYb.KWHzl(bigDecimal, bigDecimal3, bigDecimal2)) {
            return pTB.formatICUNumber$default(bigDecimal, roundingMode, C38307pTy.Companion.AEQbTJ(4), null, null, 12, null);
        }
        BigDecimal bigDecimal4 = EZpvd;
        Intrinsics.checkNotNullExpressionValue(bigDecimal3, "");
        if (C54862xYb.KWHzl(bigDecimal, bigDecimal4, bigDecimal3)) {
            return C54862xYb.KWHzl(C54862xYb.KWHzl(bigDecimal, 5, roundingMode), roundingMode, false, (java.lang.Integer) null);
        }
        return pTB.formatSubscriptNumber$default(C54862xYb.KWHzl(bigDecimal, 5, roundingMode), roundingMode, C38307pTy.Companion.copydefault(1, 5), DisplaySign.AUTO, null, 8, null);
    }

    public static final java.lang.String KWHzl(C54874xYn c54874xYn) {
        java.lang.String strEZpvd;
        CurrencyPrependSign currencyPrependSignAEQbTJ = c54874xYn.AEQbTJ();
        java.lang.String strOLrzqt = c54874xYn.OLrzqt();
        int i = Application.OLrzqt[c54874xYn.copydefault().ordinal()];
        if (i == 1) {
            strEZpvd = "";
        } else if (i == 2) {
            strEZpvd = c54874xYn.EZpvd();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            strEZpvd = c54874xYn.KWHzl();
        }
        return C54862xYb.AEQbTJ(currencyPrependSignAEQbTJ, strOLrzqt, strEZpvd, c54874xYn.copydefault());
    }
}
