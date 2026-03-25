package o;

import androidx.camera.video.AudioStats;
import com.okinc.business.dex.trade.swap.market.priorityfee.domain.model.MarketTransactionFeeCacheParams;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22302hcm implements InterfaceC22305hcp {
    public MarketTransactionFeeCacheParams KWHzl;
    public DefiChainInfo OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22305hcp
    public MarketTransactionFeeCacheParams AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22305hcp
    public void KWHzl(@NotNull DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        this.OLrzqt = defiChainInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22305hcp
    public void OLrzqt(MarketTransactionFeeCacheParams marketTransactionFeeCacheParams) {
        this.KWHzl = marketTransactionFeeCacheParams;
    }

    @yCM
    public C22302hcm() {
    }

    public java.lang.String KWHzl(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
        MevInfoBean mevInfoBeanKWHzl;
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                marketGasPrice = mevInfoBeanKWHzl.getMarketGasPrice();
            }
            if (marketGasPrice == null) {
                return "";
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            marketGasPrice = normal != null ? normal.getMarketGasPrice() : null;
            if (marketGasPrice == null) {
                return "";
            }
        }
        return marketGasPrice;
    }

    public java.lang.String EZpvd(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
        MevInfoBean mevInfoBeanKWHzl;
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                fastGasPrice = mevInfoBeanKWHzl.getFastGasPrice();
            }
            if (fastGasPrice == null) {
                return "";
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            fastGasPrice = normal != null ? normal.getFastGasPrice() : null;
            if (fastGasPrice == null) {
                return "";
            }
        }
        return fastGasPrice;
    }

    public java.lang.String djBIcL(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
        MevInfoBean mevInfoBeanKWHzl;
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                turboGasPrice = mevInfoBeanKWHzl.getTurboGasPrice();
            }
            if (turboGasPrice == null) {
                return "";
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            turboGasPrice = normal != null ? normal.getTurboGasPrice() : null;
            if (turboGasPrice == null) {
                return "";
            }
        }
        return turboGasPrice;
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String AEQbTJ(int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return KWHzl(z, swapPriorityFeeInfo);
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return EZpvd(z, swapPriorityFeeInfo);
        }
        return i == PriorityFeeType.PriorityTurbo.getValue() ? djBIcL(z, swapPriorityFeeInfo) : str;
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String OLrzqt(int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return OLrzqt(z, swapPriorityFeeInfo);
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return copydefault(z, swapPriorityFeeInfo);
        }
        if (i == PriorityFeeType.PriorityTurbo.getValue()) {
            return gEmmrt(z, swapPriorityFeeInfo);
        }
        return OLrzqt(str, str2, str3, str4);
    }

    public java.lang.String OLrzqt(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
        MevInfoBean mevInfoBeanKWHzl;
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                marketMaxFeeUsd = mevInfoBeanKWHzl.getMarketMaxFeeUsd();
            }
            if (marketMaxFeeUsd == null) {
                return "";
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            marketMaxFeeUsd = normal != null ? normal.getMarketMaxFeeUsd() : null;
            if (marketMaxFeeUsd == null) {
                return "";
            }
        }
        return marketMaxFeeUsd;
    }

    public java.lang.String copydefault(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
        MevInfoBean mevInfoBeanKWHzl;
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                fastMaxFeeUsd = mevInfoBeanKWHzl.getFastMaxFeeUsd();
            }
            if (fastMaxFeeUsd == null) {
                return "";
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            fastMaxFeeUsd = normal != null ? normal.getFastMaxFeeUsd() : null;
            if (fastMaxFeeUsd == null) {
                return "";
            }
        }
        return fastMaxFeeUsd;
    }

    public java.lang.String gEmmrt(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
        MevInfoBean mevInfoBeanKWHzl;
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                turboMaxFeeUsd = mevInfoBeanKWHzl.getTurboMaxFeeUsd();
            }
            if (turboMaxFeeUsd == null) {
                return "";
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            turboMaxFeeUsd = normal != null ? normal.getTurboMaxFeeUsd() : null;
            if (turboMaxFeeUsd == null) {
                return "";
            }
        }
        return turboMaxFeeUsd;
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String AEQbTJ(int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        DefiChainInfo defiChainInfo = this.OLrzqt;
        java.lang.String networkFeeDisplayDecimals = defiChainInfo != null ? defiChainInfo.getNetworkFeeDisplayDecimals() : null;
        return OLrzqt(i, z, swapPriorityFeeInfo, str, str2, networkFeeDisplayDecimals == null ? "" : networkFeeDisplayDecimals, str3);
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String AEQbTJ(boolean z, SwapPriorityFeeInfo swapPriorityFeeInfo) {
        java.lang.String strEZpvd;
        MarketTransactionFeeCacheParams marketTransactionFeeCacheParams = this.KWHzl;
        if (marketTransactionFeeCacheParams != null && (strEZpvd = marketTransactionFeeCacheParams.EZpvd()) != null) {
            return strEZpvd;
        }
        if (swapPriorityFeeInfo == null) {
            swapPriorityFeeInfo = new SwapPriorityFeeInfo((java.util.List) null, (NonMevPriorityFeeInfo) null, (java.lang.String) null, (java.lang.String) null, 15, (DefaultConstructorMarker) null);
        }
        return KWHzl(z, swapPriorityFeeInfo);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        java.lang.String strMulCheckS$default = C23313hvq.mulCheckS$default(str, str2, null, null, null, 14, null);
        java.lang.Double dAuCTel = C59443zhD.AuCTel(str3);
        return C23313hvq.mulCheckS$default(C23313hvq.divCheckS$default(strMulCheckS$default, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, dAuCTel != null ? dAuCTel.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE)), null, null, null, 14, null), str4, null, null, null, 14, null);
    }
}
