package o;

import androidx.camera.video.AudioStats;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData;
import com.okinc.business.trade.features.home.ui.cefi.data.MevBasedFeeData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gLH implements gLN {
    public kotlin.Pair<? extends PriorityFeeType, java.lang.String> OLrzqt;
    public DefiChainInfo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.Pair<? extends com.okinc.business.dexlogic.bean.PriorityFeeType, java.lang.String>, kotlin.Pair<com.okinc.business.dexlogic.bean.PriorityFeeType, java.lang.String> */
    @Override // o.gLN
    public kotlin.Pair<PriorityFeeType, java.lang.String> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gLN
    public void EZpvd(@NotNull DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        this.copydefault = defiChainInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gLN
    public void EZpvd(kotlin.Pair<? extends PriorityFeeType, java.lang.String> pair) {
        this.OLrzqt = pair;
    }

    @yCM
    public gLH() {
    }

    @Override // o.gLN
    public java.lang.String EZpvd(boolean z, @NotNull LimitFeeData limitFeeData) {
        java.lang.String marketFee;
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        if (z) {
            MevBasedFeeData mevFeeData = limitFeeData.getMevFeeData();
            marketFee = mevFeeData != null ? mevFeeData.getMarketFee() : null;
            if (marketFee == null) {
                return "";
            }
        } else {
            MevBasedFeeData nonMevFeeData = limitFeeData.getNonMevFeeData();
            marketFee = nonMevFeeData != null ? nonMevFeeData.getMarketFee() : null;
            if (marketFee == null) {
                return "";
            }
        }
        return marketFee;
    }

    public java.lang.String copydefault(boolean z, @NotNull LimitFeeData limitFeeData) {
        java.lang.String fastFee;
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        if (z) {
            MevBasedFeeData mevFeeData = limitFeeData.getMevFeeData();
            fastFee = mevFeeData != null ? mevFeeData.getFastFee() : null;
            if (fastFee == null) {
                return "";
            }
        } else {
            MevBasedFeeData nonMevFeeData = limitFeeData.getNonMevFeeData();
            fastFee = nonMevFeeData != null ? nonMevFeeData.getFastFee() : null;
            if (fastFee == null) {
                return "";
            }
        }
        return fastFee;
    }

    public java.lang.String OLrzqt(boolean z, @NotNull LimitFeeData limitFeeData) {
        java.lang.String turboFee;
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        if (z) {
            MevBasedFeeData mevFeeData = limitFeeData.getMevFeeData();
            turboFee = mevFeeData != null ? mevFeeData.getTurboFee() : null;
            if (turboFee == null) {
                return "";
            }
        } else {
            MevBasedFeeData nonMevFeeData = limitFeeData.getNonMevFeeData();
            turboFee = nonMevFeeData != null ? nonMevFeeData.getTurboFee() : null;
            if (turboFee == null) {
                return "";
            }
        }
        return turboFee;
    }

    @Override // o.gLN
    public java.lang.String copydefault(int i, boolean z, @NotNull LimitFeeData limitFeeData, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return EZpvd(z, limitFeeData);
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return copydefault(z, limitFeeData);
        }
        return i == PriorityFeeType.PriorityTurbo.getValue() ? OLrzqt(z, limitFeeData) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[PHI: r8
  0x0055: PHI (r8v5 java.lang.String) = (r8v2 java.lang.String), (r8v6 java.lang.String) binds: [B:21:0x0052, B:16:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.gLN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String OLrzqt(int i, boolean z, @NotNull LimitFeeData limitFeeData, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        java.lang.String maxBaseFee;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return KWHzl(z, limitFeeData);
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return AEQbTJ(z, limitFeeData);
        }
        if (i == PriorityFeeType.PriorityTurbo.getValue()) {
            return AhwBna(z, limitFeeData);
        }
        if (z) {
            MevBasedFeeData mevFeeData = limitFeeData.getMevFeeData();
            maxBaseFee = mevFeeData != null ? mevFeeData.getMaxBaseFee() : null;
            if (maxBaseFee != null) {
                str5 = maxBaseFee;
            }
        } else {
            MevBasedFeeData nonMevFeeData = limitFeeData.getNonMevFeeData();
            maxBaseFee = nonMevFeeData != null ? nonMevFeeData.getMaxBaseFee() : null;
            if (maxBaseFee != null) {
            }
        }
        return KWHzl(str, str2, str3, str4, str5);
    }

    public java.lang.String KWHzl(boolean z, @NotNull LimitFeeData limitFeeData) {
        java.lang.String marketFeeUsd;
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        if (z) {
            MevBasedFeeData mevFeeData = limitFeeData.getMevFeeData();
            marketFeeUsd = mevFeeData != null ? mevFeeData.getMarketFeeUsd() : null;
            if (marketFeeUsd == null) {
                return "";
            }
        } else {
            MevBasedFeeData nonMevFeeData = limitFeeData.getNonMevFeeData();
            marketFeeUsd = nonMevFeeData != null ? nonMevFeeData.getMarketFeeUsd() : null;
            if (marketFeeUsd == null) {
                return "";
            }
        }
        return marketFeeUsd;
    }

    public java.lang.String AEQbTJ(boolean z, @NotNull LimitFeeData limitFeeData) {
        java.lang.String fastFeeUsd;
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        if (z) {
            MevBasedFeeData mevFeeData = limitFeeData.getMevFeeData();
            fastFeeUsd = mevFeeData != null ? mevFeeData.getFastFeeUsd() : null;
            if (fastFeeUsd == null) {
                return "";
            }
        } else {
            MevBasedFeeData nonMevFeeData = limitFeeData.getNonMevFeeData();
            fastFeeUsd = nonMevFeeData != null ? nonMevFeeData.getFastFeeUsd() : null;
            if (fastFeeUsd == null) {
                return "";
            }
        }
        return fastFeeUsd;
    }

    public java.lang.String AhwBna(boolean z, @NotNull LimitFeeData limitFeeData) {
        java.lang.String turboFeeUsd;
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        if (z) {
            MevBasedFeeData mevFeeData = limitFeeData.getMevFeeData();
            turboFeeUsd = mevFeeData != null ? mevFeeData.getTurboFeeUsd() : null;
            if (turboFeeUsd == null) {
                return "";
            }
        } else {
            MevBasedFeeData nonMevFeeData = limitFeeData.getNonMevFeeData();
            turboFeeUsd = nonMevFeeData != null ? nonMevFeeData.getTurboFeeUsd() : null;
            if (turboFeeUsd == null) {
                return "";
            }
        }
        return turboFeeUsd;
    }

    @Override // o.gLN
    public java.lang.String AEQbTJ(int i, boolean z, @NotNull LimitFeeData limitFeeData, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        DefiChainInfo defiChainInfo = this.copydefault;
        java.lang.String networkFeeDisplayDecimals = defiChainInfo != null ? defiChainInfo.getNetworkFeeDisplayDecimals() : null;
        return OLrzqt(i, z, limitFeeData, str, str2, networkFeeDisplayDecimals == null ? "" : networkFeeDisplayDecimals, str3);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
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
