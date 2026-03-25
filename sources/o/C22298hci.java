package o;

import androidx.camera.video.AudioStats;
import com.okinc.business.dex.trade.swap.market.priorityfee.domain.model.MarketTransactionFeeCacheParams;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22298hci implements InterfaceC22305hcp {
    public MarketTransactionFeeCacheParams OLrzqt;
    public DefiChainInfo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22305hcp
    public MarketTransactionFeeCacheParams AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22305hcp
    public void KWHzl(@NotNull DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        this.copydefault = defiChainInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22305hcp
    public void OLrzqt(MarketTransactionFeeCacheParams marketTransactionFeeCacheParams) {
        this.OLrzqt = marketTransactionFeeCacheParams;
    }

    @yCM
    public C22298hci() {
    }

    public java.lang.String EZpvd(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
        MevInfoBean mevInfoBeanKWHzl;
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                marketPriority = mevInfoBeanKWHzl.getMarketPriority();
            }
            if (marketPriority == null) {
                return "";
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            marketPriority = normal != null ? normal.getMarketPriority() : null;
            if (marketPriority == null) {
                return "";
            }
        }
        return marketPriority;
    }

    public java.lang.String copydefault(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
        MevInfoBean mevInfoBeanKWHzl;
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                fastPriority = mevInfoBeanKWHzl.getFastPriority();
            }
            if (fastPriority == null) {
                return "";
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            fastPriority = normal != null ? normal.getFastPriority() : null;
            if (fastPriority == null) {
                return "";
            }
        }
        return fastPriority;
    }

    public java.lang.String AYXKKw(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
        MevInfoBean mevInfoBeanKWHzl;
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                turboPriority = mevInfoBeanKWHzl.getTurboPriority();
            }
            if (turboPriority == null) {
                return "";
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            turboPriority = normal != null ? normal.getTurboPriority() : null;
            if (turboPriority == null) {
                return "";
            }
        }
        return turboPriority;
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String AEQbTJ(int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return EZpvd(z, swapPriorityFeeInfo);
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return copydefault(z, swapPriorityFeeInfo);
        }
        return i == PriorityFeeType.PriorityTurbo.getValue() ? AYXKKw(z, swapPriorityFeeInfo) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[PHI: r8
  0x005b: PHI (r8v5 java.lang.String) = (r8v2 java.lang.String), (r8v6 java.lang.String) binds: [B:23:0x0058, B:18:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.InterfaceC22305hcp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String OLrzqt(int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        MevInfoBean mevInfoBeanKWHzl;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return OLrzqt(z, swapPriorityFeeInfo);
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return KWHzl(z, swapPriorityFeeInfo);
        }
        if (i == PriorityFeeType.PriorityTurbo.getValue()) {
            return gEmmrt(z, swapPriorityFeeInfo);
        }
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                maxBaseFee = mevInfoBeanKWHzl.getMaxBaseFee();
            }
            if (maxBaseFee != null) {
                str5 = maxBaseFee;
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            maxBaseFee = normal != null ? normal.getMaxBaseFee() : null;
            if (maxBaseFee != null) {
            }
        }
        return EZpvd(str, str2, str3, str4, str5);
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

    public java.lang.String KWHzl(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
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
        DefiChainInfo defiChainInfo = this.copydefault;
        java.lang.String networkFeeDisplayDecimals = defiChainInfo != null ? defiChainInfo.getNetworkFeeDisplayDecimals() : null;
        return OLrzqt(i, z, swapPriorityFeeInfo, str, str2, networkFeeDisplayDecimals == null ? "" : networkFeeDisplayDecimals, str3);
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String AEQbTJ(boolean z, SwapPriorityFeeInfo swapPriorityFeeInfo) {
        NonMevPriorityFeeInfo normal;
        java.util.List<MevInfoBean> mev;
        MevInfoBean mevInfoBeanKWHzl;
        if (z) {
            if (swapPriorityFeeInfo != null && (mev = swapPriorityFeeInfo.getMev()) != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                return mevInfoBeanKWHzl.getMaxBaseFee();
            }
        } else if (swapPriorityFeeInfo != null && (normal = swapPriorityFeeInfo.getNormal()) != null) {
            return normal.getMaxBaseFee();
        }
        return null;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        java.lang.String strMulCheckS$default = C23313hvq.mulCheckS$default(C23313hvq.addCheckS$default(str, str5, null, null, null, 14, null), str2, null, null, null, 14, null);
        java.lang.Double dAuCTel = C59443zhD.AuCTel(str3);
        return C23313hvq.mulCheckS$default(C23313hvq.divCheckS$default(strMulCheckS$default, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, dAuCTel != null ? dAuCTel.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE)), null, null, null, 14, null), str4, null, null, null, 14, null);
    }
}
