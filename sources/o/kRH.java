package o;

import androidx.camera.video.AudioStats;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kRH {
    public final C28183kRz KWHzl;

    @yCM
    public kRH(@NotNull C28183kRz c28183kRz) {
        Intrinsics.checkNotNullParameter(c28183kRz, "");
        this.KWHzl = c28183kRz;
    }

    public final java.lang.String copydefault(AdvancedQuoteUiData advancedQuoteUiData) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        NonMevPriorityFeeInfo newProxyInstance;
        java.lang.String baseFee = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null || (newProxyInstance = advancedQuoteAndCallDataKWHzl.getNewProxyInstance()) == null) ? null : newProxyInstance.getBaseFee();
        return baseFee == null ? "" : baseFee;
    }

    public final java.lang.String AEQbTJ(AdvancedQuoteUiData advancedQuoteUiData) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        NonMevPriorityFeeInfo newProxyInstance;
        java.lang.String baseFeeUsd = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null || (newProxyInstance = advancedQuoteAndCallDataKWHzl.getNewProxyInstance()) == null) ? null : newProxyInstance.getBaseFeeUsd();
        return baseFeeUsd == null ? "" : baseFeeUsd;
    }

    public final java.lang.String copydefault(AdvancedQuoteUiData advancedQuoteUiData, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        NonMevPriorityFeeInfo newProxyInstance;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (z) {
            return "0";
        }
        java.lang.String baseFeeUsd = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null || (newProxyInstance = advancedQuoteAndCallDataKWHzl.getNewProxyInstance()) == null) ? null : newProxyInstance.getBaseFeeUsd();
        java.lang.String str4 = baseFeeUsd != null ? baseFeeUsd : "";
        return str4.length() == 0 ? KWHzl(copydefault(advancedQuoteUiData), str, str2, str3) : str4;
    }

    public final boolean OLrzqt() {
        return this.KWHzl.OLrzqt();
    }

    public final java.lang.String KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String strMulCheckS$default = C23313hvq.mulCheckS$default(str, str2, null, null, null, 14, null);
        java.lang.Double dAuCTel = C59443zhD.AuCTel(str3);
        return C23313hvq.mulCheckS$default(C23313hvq.divCheckS$default(strMulCheckS$default, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, dAuCTel != null ? dAuCTel.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE)), null, null, null, 14, null), str4, null, null, null, 14, null);
    }
}
