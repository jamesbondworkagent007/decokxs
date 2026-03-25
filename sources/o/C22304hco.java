package o;

import androidx.camera.video.AudioStats;
import com.okinc.business.dex.trade.swap.market.priorityfee.domain.model.MarketTransactionFeeCacheParams;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C6777aVl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hco, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22304hco implements InterfaceC22305hcp {
    public DefiChainInfo KWHzl;
    public MarketTransactionFeeCacheParams OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22305hcp
    public MarketTransactionFeeCacheParams AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22305hcp
    public void KWHzl(@NotNull DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        this.KWHzl = defiChainInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22305hcp
    public void OLrzqt(MarketTransactionFeeCacheParams marketTransactionFeeCacheParams) {
        this.OLrzqt = marketTransactionFeeCacheParams;
    }

    @yCM
    public C22304hco() {
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String AEQbTJ(int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd(z, swapPriorityFeeInfo);
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String OLrzqt(int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return AEQbTJ(z, swapPriorityFeeInfo, str2, str4, false);
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String AEQbTJ(int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return AEQbTJ(z, swapPriorityFeeInfo, str2, str3, false);
    }

    public final java.lang.String AEQbTJ(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (z2) {
            return "0";
        }
        java.lang.String strKWHzl = KWHzl(z, swapPriorityFeeInfo);
        if (strKWHzl.length() != 0) {
            return strKWHzl;
        }
        java.lang.String strEZpvd = EZpvd(z, swapPriorityFeeInfo);
        DefiChainInfo defiChainInfo = this.KWHzl;
        java.lang.String networkFeeDisplayDecimals = defiChainInfo != null ? defiChainInfo.getNetworkFeeDisplayDecimals() : null;
        java.lang.String str3 = networkFeeDisplayDecimals != null ? networkFeeDisplayDecimals : "";
        C6777aVl.TaskDescription taskDescription = C6777aVl.Companion;
        java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("getBaseFeeUsd() is empty");
        kotlin.Pair[] pairArr = new kotlin.Pair[8];
        pairArr[0] = C56390yDp.OLrzqt("isOpenMev", java.lang.String.valueOf(z));
        pairArr[1] = C56390yDp.OLrzqt("priorityFeeInfo", swapPriorityFeeInfo.toString());
        pairArr[2] = C56390yDp.OLrzqt("estimateGas", str);
        pairArr[3] = C56390yDp.OLrzqt("nativeTokenUnitUsd", str2);
        pairArr[4] = C56390yDp.OLrzqt("isFreeGas", "false");
        pairArr[5] = C56390yDp.OLrzqt("baseFee", strEZpvd);
        pairArr[6] = C56390yDp.OLrzqt("currentChainInfo", this.KWHzl != null ? "not null" : AbstractJsonLexerKt.NULL);
        pairArr[7] = C56390yDp.OLrzqt("gasPriceUnitDecimal", str3);
        taskDescription.OLrzqt(illegalStateException, C56424yEw.gEmmrt(pairArr), java.lang.Boolean.TRUE);
        return copydefault(strEZpvd, str, str3, str2);
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String AEQbTJ(boolean z, SwapPriorityFeeInfo swapPriorityFeeInfo) {
        NonMevPriorityFeeInfo normal;
        java.util.List<MevInfoBean> mev;
        MevInfoBean mevInfoBeanKWHzl;
        if (z) {
            if (swapPriorityFeeInfo != null && (mev = swapPriorityFeeInfo.getMev()) != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                return mevInfoBeanKWHzl.getBaseFee();
            }
        } else if (swapPriorityFeeInfo != null && (normal = swapPriorityFeeInfo.getNormal()) != null) {
            return normal.getBaseFee();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r0 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(boolean z, SwapPriorityFeeInfo swapPriorityFeeInfo) {
        MevInfoBean mevInfoBeanKWHzl;
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                baseFee = mevInfoBeanKWHzl.getBaseFee();
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            baseFee = normal != null ? normal.getBaseFee() : null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r0 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(boolean z, SwapPriorityFeeInfo swapPriorityFeeInfo) {
        MevInfoBean mevInfoBeanKWHzl;
        if (z) {
            java.util.List<MevInfoBean> mev = swapPriorityFeeInfo.getMev();
            if (mev != null && (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) != null) {
                baseFeeUsd = mevInfoBeanKWHzl.getBaseFeeUsd();
            }
        } else {
            NonMevPriorityFeeInfo normal = swapPriorityFeeInfo.getNormal();
            baseFeeUsd = normal != null ? normal.getBaseFeeUsd() : null;
        }
    }

    private final java.lang.String copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String strMulCheckS$default = C23313hvq.mulCheckS$default(str, str2, null, null, null, 14, null);
        java.lang.Double dAuCTel = C59443zhD.AuCTel(str3);
        return C23313hvq.mulCheckS$default(C23313hvq.divCheckS$default(strMulCheckS$default, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, dAuCTel != null ? dAuCTel.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE)), null, null, null, 14, null), str4, null, null, null, 14, null);
    }
}
