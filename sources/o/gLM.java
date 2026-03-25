package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData;
import com.okinc.business.trade.features.home.ui.cefi.data.MevBasedFeeData;
import kotlin.jvm.internal.Intrinsics;
import o.gLN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gLM implements gLN {
    public DefiChainInfo AEQbTJ;
    public kotlin.Pair<? extends PriorityFeeType, java.lang.String> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.Pair<? extends com.okinc.business.dexlogic.bean.PriorityFeeType, java.lang.String>, kotlin.Pair<com.okinc.business.dexlogic.bean.PriorityFeeType, java.lang.String> */
    @Override // o.gLN
    public kotlin.Pair<PriorityFeeType, java.lang.String> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gLN
    public void EZpvd(@NotNull DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        this.AEQbTJ = defiChainInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gLN
    public void EZpvd(kotlin.Pair<? extends PriorityFeeType, java.lang.String> pair) {
        this.EZpvd = pair;
    }

    @yCM
    public gLM() {
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

    public java.lang.String AEQbTJ(boolean z, @NotNull LimitFeeData limitFeeData) {
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

    public java.lang.String KWHzl(boolean z, @NotNull LimitFeeData limitFeeData) {
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
            return AEQbTJ(z, limitFeeData);
        }
        return i == PriorityFeeType.PriorityTurbo.getValue() ? KWHzl(z, limitFeeData) : str;
    }

    @Override // o.gLN
    public java.lang.String OLrzqt(int i, boolean z, @NotNull LimitFeeData limitFeeData, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return copydefault(z, limitFeeData);
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return OLrzqt(z, limitFeeData);
        }
        if (i == PriorityFeeType.PriorityTurbo.getValue()) {
            return valueOf(z, limitFeeData);
        }
        return C23313hvq.mulCheckS$default(str, str4, null, null, null, 14, null);
    }

    public java.lang.String copydefault(boolean z, @NotNull LimitFeeData limitFeeData) {
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

    public java.lang.String OLrzqt(boolean z, @NotNull LimitFeeData limitFeeData) {
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

    public java.lang.String valueOf(boolean z, @NotNull LimitFeeData limitFeeData) {
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
        return C23313hvq.addCheckS$default(gLN.TaskDescription.getPriorityFeeUsd$default(this, i, z, limitFeeData, str, null, null, str3, 48, null), copydefault(limitFeeData), null, null, null, 14, null);
    }

    public final java.lang.String copydefault(LimitFeeData limitFeeData) {
        MevBasedFeeData nonMevFeeData = limitFeeData.getNonMevFeeData();
        java.lang.String baseFeeUsd = nonMevFeeData != null ? nonMevFeeData.getBaseFeeUsd() : null;
        return baseFeeUsd == null ? "" : baseFeeUsd;
    }
}
