package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xYt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54880xYt {

    /* JADX INFO: renamed from: o.xYt$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CurrencyDisplayStyle.values().length];
            try {
                iArr[CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    public static /* synthetic */ java.lang.String formatValuation$default(BigDecimal bigDecimal, int i, int i2, DisplaySign displaySign, CurrencyDisplayStyle currencyDisplayStyle, WalletCurrencyBean walletCurrencyBean, RoundingMode roundingMode, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 2;
        }
        if ((i3 & 2) != 0) {
            i2 = 2;
        }
        if ((i3 & 4) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        if ((i3 & 8) != 0) {
            currencyDisplayStyle = CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY;
        }
        if ((i3 & 16) != 0) {
            walletCurrencyBean = C54864xYd.AEQbTJ.copydefault();
        }
        if ((i3 & 32) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i3 & 64) != 0) {
            z = true;
        }
        return AEQbTJ(bigDecimal, i, i2, displaySign, currencyDisplayStyle, walletCurrencyBean, roundingMode, z);
    }

    public static final java.lang.String AEQbTJ(@NotNull BigDecimal bigDecimal, int i, int i2, @NotNull DisplaySign displaySign, @NotNull CurrencyDisplayStyle currencyDisplayStyle, @NotNull WalletCurrencyBean walletCurrencyBean, @NotNull RoundingMode roundingMode, boolean z) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(currencyDisplayStyle, "");
        Intrinsics.checkNotNullParameter(walletCurrencyBean, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        java.lang.String strConvertToString$default = C54862xYb.convertToString$default(bigDecimal, false, null, null, 7, null);
        InterfaceC54865xYe[] interfaceC54865xYeArr = new InterfaceC54865xYe[2];
        interfaceC54865xYeArr[0] = new C54879xYs(KWHzl(currencyDisplayStyle) ? walletCurrencyBean.getIsoCode() : null, OLrzqt(currencyDisplayStyle) ? walletCurrencyBean.getIsoCode() : null, java.lang.Boolean.valueOf(i == i2 && i == 2), true);
        interfaceC54865xYeArr[1] = new C54878xYr(i2, KWHzl(currencyDisplayStyle) ? walletCurrencyBean.getIsoCode() : null, OLrzqt(currencyDisplayStyle) ? walletCurrencyBean.getIsoCode() : null, true, displaySign);
        return EZpvd(strConvertToString$default, i, i2, displaySign, roundingMode, interfaceC54865xYeArr, walletCurrencyBean, currencyDisplayStyle, z);
    }

    public static /* synthetic */ java.lang.String formatValuationFromAsset$default(java.lang.String str, WalletCurrencyBean walletCurrencyBean, boolean z, int i, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            walletCurrencyBean = C54864xYd.AEQbTJ.copydefault();
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        return AEQbTJ(str, walletCurrencyBean, z, i, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull WalletCurrencyBean walletCurrencyBean, boolean z, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(walletCurrencyBean, "");
        if (i != 0) {
            if (i == 1) {
                return "--.--";
            }
            if (i == 2 || i != 3) {
                return "--";
            }
        }
        RoundingMode roundingMode = RoundingMode.DOWN;
        InterfaceC54865xYe[] interfaceC54865xYeArr = new InterfaceC54865xYe[2];
        boolean z3 = true;
        interfaceC54865xYeArr[0] = new C54879xYs(z ? walletCurrencyBean.getIsoCode() : null, null, null, z3, 6, null);
        interfaceC54865xYeArr[1] = new C54878xYr(2, walletCurrencyBean.getIsoCode(), 0 == true ? 1 : 0, z3, null, 20, null);
        return formatValuationFromUsd$default(str, 2, 2, null, roundingMode, interfaceC54865xYeArr, walletCurrencyBean, z ? CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX : CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY, z2, 4, null);
    }

    public static /* synthetic */ java.lang.String formatValuationFromFee$default(java.lang.String str, WalletCurrencyBean walletCurrencyBean, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            walletCurrencyBean = C54864xYd.AEQbTJ.copydefault();
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return EZpvd(str, walletCurrencyBean, z, z2);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull WalletCurrencyBean walletCurrencyBean, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(walletCurrencyBean, "");
        RoundingMode roundingMode = RoundingMode.DOWN;
        InterfaceC54865xYe[] interfaceC54865xYeArr = new InterfaceC54865xYe[2];
        interfaceC54865xYeArr[0] = new C54879xYs(z ? walletCurrencyBean.getIsoCode() : null, null, null, true, 6, null);
        interfaceC54865xYeArr[1] = new C54878xYr(2, z ? walletCurrencyBean.getIsoCode() : null, null, true, null, 20, null);
        return formatValuationFromUsd$default(str, 2, 2, null, roundingMode, interfaceC54865xYeArr, walletCurrencyBean, z ? CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX : CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY, z2, 4, null);
    }

    public static /* synthetic */ java.lang.String formatValuationFromUsd$default(java.lang.String str, int i, int i2, DisplaySign displaySign, RoundingMode roundingMode, InterfaceC54865xYe[] interfaceC54865xYeArr, WalletCurrencyBean walletCurrencyBean, CurrencyDisplayStyle currencyDisplayStyle, boolean z, int i3, java.lang.Object obj) {
        return EZpvd(str, i, i2, (i3 & 4) != 0 ? DisplaySign.AUTO : displaySign, roundingMode, interfaceC54865xYeArr, (i3 & 32) != 0 ? C54864xYd.AEQbTJ.copydefault() : walletCurrencyBean, currencyDisplayStyle, z);
    }

    public static final <T extends InterfaceC54865xYe> java.lang.String EZpvd(java.lang.String str, int i, int i2, DisplaySign displaySign, RoundingMode roundingMode, T[] tArr, WalletCurrencyBean walletCurrencyBean, CurrencyDisplayStyle currencyDisplayStyle, boolean z) {
        return AEQbTJ(z ? C54862xYb.convertToString$default(C54862xYb.OLrzqt(str, java.lang.Double.valueOf(walletCurrencyBean.getUsdToThisRate())), false, null, null, 7, null) : str, i, i2, displaySign, walletCurrencyBean, currencyDisplayStyle, roundingMode, tArr);
    }

    public static final boolean KWHzl(@NotNull CurrencyDisplayStyle currencyDisplayStyle) {
        Intrinsics.checkNotNullParameter(currencyDisplayStyle, "");
        return currencyDisplayStyle == CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX;
    }

    public static final boolean OLrzqt(@NotNull CurrencyDisplayStyle currencyDisplayStyle) {
        Intrinsics.checkNotNullParameter(currencyDisplayStyle, "");
        return currencyDisplayStyle == CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX;
    }

    public static final <T extends InterfaceC54865xYe> java.lang.String AEQbTJ(java.lang.String str, int i, int i2, DisplaySign displaySign, WalletCurrencyBean walletCurrencyBean, CurrencyDisplayStyle currencyDisplayStyle, RoundingMode roundingMode, T[] tArr) {
        C38307pTy c38307pTyKWHzl;
        java.lang.String strEZpvd = null;
        for (T t : tArr) {
            strEZpvd = t.EZpvd(str);
            if (strEZpvd != null) {
                break;
            }
        }
        if (strEZpvd != null) {
            return strEZpvd;
        }
        BigDecimal bigDecimalOLrzqt = pTB.OLrzqt((java.lang.Object) str);
        if (i == i2) {
            c38307pTyKWHzl = C38307pTy.Companion.EZpvd(i2);
        } else {
            c38307pTyKWHzl = C38307pTy.Companion.KWHzl(i, i2);
        }
        C38307pTy c38307pTy = c38307pTyKWHzl;
        int i3 = ActionBar.KWHzl[currencyDisplayStyle.ordinal()];
        if (i3 == 1) {
            return C54863xYc.formatFiatSymbolSafe$default(bigDecimalOLrzqt, walletCurrencyBean.getIsoCode(), roundingMode, c38307pTy, displaySign, null, null, 48, null);
        }
        if (i3 == 2) {
            return C54863xYc.formatFiatCodeSafe$default(bigDecimalOLrzqt, walletCurrencyBean.getIsoCode(), roundingMode, c38307pTy, displaySign, null, null, 48, null);
        }
        if (i3 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return pTB.formatICUNumber$default(bigDecimalOLrzqt, roundingMode, c38307pTy, displaySign, null, 8, null);
    }
}
