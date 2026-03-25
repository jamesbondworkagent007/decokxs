package o;

import com.okinc.business.dex.trade.swap.market.priorityfee.domain.model.MarketTransactionFeeCacheParams;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC22305hcp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22306hcq implements InterfaceC22305hcp {
    public DefiChainInfo EZpvd;
    public MarketTransactionFeeCacheParams OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22305hcp
    public MarketTransactionFeeCacheParams AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String AEQbTJ(boolean z, SwapPriorityFeeInfo swapPriorityFeeInfo) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22305hcp
    public void KWHzl(@NotNull DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        this.EZpvd = defiChainInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22305hcp
    public void OLrzqt(MarketTransactionFeeCacheParams marketTransactionFeeCacheParams) {
        this.OLrzqt = marketTransactionFeeCacheParams;
    }

    @yCM
    public C22306hcq() {
    }

    public java.lang.String EZpvd(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
        MevInfoBean mevInfoBeanKWHzl;
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                marketFee = mevInfoBeanKWHzl.getMarketFee();
            }
            if (marketFee == null) {
                return "";
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            marketFee = normal != null ? normal.getMarketFee() : null;
            if (marketFee == null) {
                return "";
            }
        }
        return marketFee;
    }

    public java.lang.String OLrzqt(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
        MevInfoBean mevInfoBeanKWHzl;
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                fastFee = mevInfoBeanKWHzl.getFastFee();
            }
            if (fastFee == null) {
                return "";
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            fastFee = normal != null ? normal.getFastFee() : null;
            if (fastFee == null) {
                return "";
            }
        }
        return fastFee;
    }

    public java.lang.String AhwBna(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
        MevInfoBean mevInfoBeanKWHzl;
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                turboFee = mevInfoBeanKWHzl.getTurboFee();
            }
            if (turboFee == null) {
                return "";
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            turboFee = normal != null ? normal.getTurboFee() : null;
            if (turboFee == null) {
                return "";
            }
        }
        return turboFee;
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String AEQbTJ(int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return EZpvd(z, swapPriorityFeeInfo);
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return OLrzqt(z, swapPriorityFeeInfo);
        }
        return i == PriorityFeeType.PriorityTurbo.getValue() ? AhwBna(z, swapPriorityFeeInfo) : str;
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String OLrzqt(int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return KWHzl(z, swapPriorityFeeInfo);
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return copydefault(z, swapPriorityFeeInfo);
        }
        if (i == PriorityFeeType.PriorityTurbo.getValue()) {
            return gEmmrt(z, swapPriorityFeeInfo);
        }
        return C23313hvq.mulCheckS$default(str, str4, null, null, null, 14, null);
    }

    public java.lang.String KWHzl(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
        MevInfoBean mevInfoBeanKWHzl;
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                marketFeeUsd = mevInfoBeanKWHzl.getMarketFeeUsd();
            }
            if (marketFeeUsd == null) {
                return "";
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            marketFeeUsd = normal != null ? normal.getMarketFeeUsd() : null;
            if (marketFeeUsd == null) {
                return "";
            }
        }
        return marketFeeUsd;
    }

    public java.lang.String copydefault(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
        MevInfoBean mevInfoBeanKWHzl;
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                fastFeeUsd = mevInfoBeanKWHzl.getFastFeeUsd();
            }
            if (fastFeeUsd == null) {
                return "";
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            fastFeeUsd = normal != null ? normal.getFastFeeUsd() : null;
            if (fastFeeUsd == null) {
                return "";
            }
        }
        return fastFeeUsd;
    }

    public java.lang.String gEmmrt(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
        MevInfoBean mevInfoBeanKWHzl;
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                turboFeeUsd = mevInfoBeanKWHzl.getTurboFeeUsd();
            }
            if (turboFeeUsd == null) {
                return "";
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            turboFeeUsd = normal != null ? normal.getTurboFeeUsd() : null;
            if (turboFeeUsd == null) {
                return "";
            }
        }
        return turboFeeUsd;
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String AEQbTJ(int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C23313hvq.addCheckS$default(InterfaceC22305hcp.TaskDescription.getPriorityFeeUsd$default(this, i, z, swapPriorityFeeInfo, str, null, null, str3, 48, null), OLrzqt(swapPriorityFeeInfo), null, null, null, 14, null);
    }

    public final java.lang.String OLrzqt(SwapPriorityFeeInfo swapPriorityFeeInfo) {
        NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
        java.lang.String baseFeeUsd = normal != null ? normal.getBaseFeeUsd() : null;
        return baseFeeUsd == null ? "" : baseFeeUsd;
    }
}
