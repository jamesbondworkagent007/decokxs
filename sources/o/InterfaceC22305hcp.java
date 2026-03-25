package o;

import com.okinc.business.dex.trade.swap.market.priorityfee.domain.model.MarketTransactionFeeCacheParams;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC22305hcp {
    MarketTransactionFeeCacheParams AEQbTJ();

    java.lang.String AEQbTJ(int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str);

    java.lang.String AEQbTJ(int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    java.lang.String AEQbTJ(boolean z, SwapPriorityFeeInfo swapPriorityFeeInfo);

    void KWHzl(@NotNull DefiChainInfo defiChainInfo);

    java.lang.String OLrzqt(int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    void OLrzqt(MarketTransactionFeeCacheParams marketTransactionFeeCacheParams);

    /* JADX INFO: renamed from: o.hcp$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ java.lang.String getPriorityFeeByPriorityType$default(InterfaceC22305hcp interfaceC22305hcp, int i, boolean z, SwapPriorityFeeInfo swapPriorityFeeInfo, java.lang.String str, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPriorityFeeByPriorityType");
            }
            if ((i2 & 8) != 0) {
                str = "";
            }
            return interfaceC22305hcp.AEQbTJ(i, z, swapPriorityFeeInfo, str);
        }

        public static /* synthetic */ java.lang.String getPriorityFeeUsd$default(InterfaceC22305hcp interfaceC22305hcp, int i, boolean z, SwapPriorityFeeInfo swapPriorityFeeInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC22305hcp.OLrzqt(i, z, swapPriorityFeeInfo, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPriorityFeeUsd");
        }
    }
}
