package o;

import com.okinc.buysell.api.BSCBuySellBaseCurrencyInfo;
import com.okinc.buysell.api.BSCDexTokenParameters;
import com.okinc.buysell.api.BSCEntranceParameters;
import com.okinc.buysell.api.BSCProConvertEntranceParameters;
import com.okinc.buysell.api.BSCTargetTab;
import com.okinc.buysell.api.data.BSCFlowType;
import com.okinc.buysell.api.data.BSCOrderFrequency;
import com.okinc.buysell.api.data.BSCOrderType;
import com.okinc.buysell.api.data.OKPaymentSourceLegacy;
import com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency;
import com.okinc.okpaymentapi.data.remote.model.management.OrderType;
import com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.DexTokenParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.service.ProConvertEntranceParameters;
import com.okinc.okx.paymentapi.service.TargetTab;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lzI {
    public static final lzI EZpvd = new lzI();

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BSCTargetTab.values().length];
            try {
                iArr[BSCTargetTab.CONVERT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BSCTargetTab.BUY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[BSCTargetTab.SELL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[BSCOrderType.values().length];
            try {
                iArr2[BSCOrderType.ONE_TIME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[BSCOrderType.RECURRING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[BSCOrderType.OTHERS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[BSCOrderType.NONE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            copydefault = iArr2;
            int[] iArr3 = new int[BSCOrderFrequency.values().length];
            try {
                iArr3[BSCOrderFrequency.NO_FREQ.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[BSCOrderFrequency.DAILY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[BSCOrderFrequency.WEEKLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[BSCOrderFrequency.BI_WEEKLY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[BSCOrderFrequency.MONTHLY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            AEQbTJ = iArr3;
        }
    }

    private lzI() {
    }

    public final BuySellConvertParameters OLrzqt(@NotNull BSCEntranceParameters bSCEntranceParameters) {
        Intrinsics.checkNotNullParameter(bSCEntranceParameters, "");
        return new BuySellConvertParameters(KWHzl(bSCEntranceParameters.values()), KWHzl(bSCEntranceParameters.fetchVPNInfo()), bSCEntranceParameters.copydefault(), bSCEntranceParameters.isConnected(), EZpvd(bSCEntranceParameters.OLrzqt()), bSCEntranceParameters.AEQbTJ(), bSCEntranceParameters.AhwBna(), null, bSCEntranceParameters.fJNWhG(), KWHzl(bSCEntranceParameters.valueOf()), copydefault(bSCEntranceParameters.AYXKKw()), bSCEntranceParameters.KWHzl(), bSCEntranceParameters.AkhnZx(), EZpvd(bSCEntranceParameters.EZpvd()), KWHzl(bSCEntranceParameters.djBIcL()), bSCEntranceParameters.gEmmrt() == BSCFlowType.OFFSHORE, bSCEntranceParameters.DbNXlk(), 128, null);
    }

    public final BuySellBaseCurrencyInfo EZpvd(BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo) {
        java.lang.String strOLrzqt;
        java.lang.String strEZpvd;
        java.lang.String strAEQbTJ;
        java.lang.String strCopydefault;
        java.lang.String strKWHzl;
        return new BuySellBaseCurrencyInfo((bSCBuySellBaseCurrencyInfo == null || (strKWHzl = bSCBuySellBaseCurrencyInfo.KWHzl()) == null) ? "" : strKWHzl, (bSCBuySellBaseCurrencyInfo == null || (strCopydefault = bSCBuySellBaseCurrencyInfo.copydefault()) == null) ? "" : strCopydefault, (bSCBuySellBaseCurrencyInfo == null || (strAEQbTJ = bSCBuySellBaseCurrencyInfo.AEQbTJ()) == null) ? "" : strAEQbTJ, (bSCBuySellBaseCurrencyInfo == null || (strEZpvd = bSCBuySellBaseCurrencyInfo.EZpvd()) == null) ? "" : strEZpvd, (bSCBuySellBaseCurrencyInfo == null || (strOLrzqt = bSCBuySellBaseCurrencyInfo.OLrzqt()) == null) ? "" : strOLrzqt);
    }

    public final ProConvertEntranceParameters KWHzl(BSCProConvertEntranceParameters bSCProConvertEntranceParameters) {
        if (bSCProConvertEntranceParameters != null) {
            return new ProConvertEntranceParameters(bSCProConvertEntranceParameters.EZpvd(), bSCProConvertEntranceParameters.AhwBna(), bSCProConvertEntranceParameters.copydefault(), bSCProConvertEntranceParameters.OLrzqt(), bSCProConvertEntranceParameters.AEQbTJ(), bSCProConvertEntranceParameters.KWHzl(), bSCProConvertEntranceParameters.djBIcL());
        }
        return null;
    }

    public final TargetTab KWHzl(@NotNull BSCTargetTab bSCTargetTab) {
        Intrinsics.checkNotNullParameter(bSCTargetTab, "");
        int i = Activity.OLrzqt[bSCTargetTab.ordinal()];
        if (i == 1) {
            return TargetTab.CONVERT;
        }
        if (i == 2) {
            return TargetTab.BUY;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return TargetTab.SELL;
    }

    public final OrderType KWHzl(@NotNull BSCOrderType bSCOrderType) {
        Intrinsics.checkNotNullParameter(bSCOrderType, "");
        int i = Activity.copydefault[bSCOrderType.ordinal()];
        if (i == 1) {
            return OrderType.ONE_TIME;
        }
        if (i == 2) {
            return OrderType.RECURRING;
        }
        if (i == 3) {
            return OrderType.OTHERS;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return OrderType.NONE;
    }

    public final OrderFrequency copydefault(@NotNull BSCOrderFrequency bSCOrderFrequency) {
        Intrinsics.checkNotNullParameter(bSCOrderFrequency, "");
        int i = Activity.AEQbTJ[bSCOrderFrequency.ordinal()];
        if (i == 1) {
            return OrderFrequency.NO_FREQ;
        }
        if (i == 2) {
            return OrderFrequency.DAILY;
        }
        if (i == 3) {
            return OrderFrequency.WEEKLY;
        }
        if (i == 4) {
            return OrderFrequency.BI_WEEKLY;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return OrderFrequency.MONTHLY;
    }

    public final OKPaymentSource KWHzl(@NotNull OKPaymentSourceLegacy oKPaymentSourceLegacy) {
        Intrinsics.checkNotNullParameter(oKPaymentSourceLegacy, "");
        return OKPaymentSource.Companion.KWHzl(oKPaymentSourceLegacy.getTag());
    }

    public final DexTokenParameters EZpvd(BSCDexTokenParameters bSCDexTokenParameters) {
        if (bSCDexTokenParameters != null) {
            return new DexTokenParameters(bSCDexTokenParameters.OLrzqt(), bSCDexTokenParameters.KWHzl());
        }
        return null;
    }
}
