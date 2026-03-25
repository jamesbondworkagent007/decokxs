package o;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27505jwU {
    public static final java.lang.String OLrzqt(@NotNull InvestGasPriceConfig investGasPriceConfig, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (OLrzqt(investGasPriceConfig)) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
                return investGasPriceConfig.getNetworkFee().getSlowGear().getGasPrice();
            }
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
                return investGasPriceConfig.getNetworkFee().getAverageGear().getGasPrice();
            }
            return investGasPriceConfig.getNetworkFee().getFastGear().getGasPrice();
        }
        return investGasPriceConfig.getNetworkFee().getAverageGear().getGasPrice();
    }

    public static final java.lang.String AEQbTJ(@NotNull InvestGasPriceConfig investGasPriceConfig, @NotNull java.lang.String str) {
        java.lang.String calculateGasPrice;
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (OLrzqt(investGasPriceConfig)) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
                calculateGasPrice = investGasPriceConfig.getNetworkFee().getSlowGear().getCalculateGasPrice();
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
                calculateGasPrice = investGasPriceConfig.getNetworkFee().getAverageGear().getCalculateGasPrice();
            } else {
                calculateGasPrice = investGasPriceConfig.getNetworkFee().getFastGear().getCalculateGasPrice();
            }
        } else {
            calculateGasPrice = investGasPriceConfig.getNetworkFee().getAverageGear().getCalculateGasPrice();
        }
        return C33129mqd.mulS$default(calculateGasPrice, investGasPriceConfig.getEstimateGasFee(), null, null, null, 14, null);
    }

    public static final java.lang.String copydefault(@NotNull InvestGasPriceConfig investGasPriceConfig, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.mulS$default(AEQbTJ(investGasPriceConfig, str), investGasPriceConfig.getNetworkFee().getCoinPrice(), null, null, null, 14, null);
    }

    public static final java.lang.String KWHzl(@NotNull InvestGasPriceConfig investGasPriceConfig, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (OLrzqt(investGasPriceConfig)) {
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0") ? investGasPriceConfig.getNetworkFee().getSlowGear().getPriorityFee() : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1") ? investGasPriceConfig.getNetworkFee().getAverageGear().getPriorityFee() : investGasPriceConfig.getNetworkFee().getFastGear().getPriorityFee();
        }
        return investGasPriceConfig.getNetworkFee().getAverageGear().getPriorityFee();
    }

    public static final boolean OLrzqt(@NotNull InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        return investGasPriceConfig.getNetworkFee().getSupportSwitchGear();
    }
}
