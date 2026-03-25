package o;

import com.okinc.business.dex.trade.swap.market.priorityfee.domain.model.MarketTransactionFeeCacheParams;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22307hcr implements InterfaceC22305hcp {
    public final C22302hcm EZpvd;
    public DefiChainInfo KWHzl;
    public final C22298hci copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC22305hcp EZpvd(boolean z) {
        return z ? this.copydefault : this.EZpvd;
    }

    @yCM
    public C22307hcr(@NotNull C22298hci c22298hci, @NotNull C22302hcm c22302hcm) {
        Intrinsics.checkNotNullParameter(c22298hci, "");
        Intrinsics.checkNotNullParameter(c22302hcm, "");
        this.copydefault = c22298hci;
        this.EZpvd = c22302hcm;
    }

    public final boolean KWHzl() {
        DefiChainInfo defiChainInfo = this.KWHzl;
        if (defiChainInfo != null) {
            return defiChainInfo.getSupportEip1559();
        }
        return false;
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String AEQbTJ(int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd(KWHzl()).AEQbTJ(i, z, swapPriorityFeeInfo, str);
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String OLrzqt(int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return EZpvd(KWHzl()).OLrzqt(i, z, swapPriorityFeeInfo, str, str2, str3, str4);
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String AEQbTJ(int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return EZpvd(KWHzl()).AEQbTJ(i, z, swapPriorityFeeInfo, str, str2, str3);
    }

    @Override // o.InterfaceC22305hcp
    public java.lang.String AEQbTJ(boolean z, SwapPriorityFeeInfo swapPriorityFeeInfo) {
        return EZpvd(KWHzl()).AEQbTJ(z, swapPriorityFeeInfo);
    }

    @Override // o.InterfaceC22305hcp
    public MarketTransactionFeeCacheParams AEQbTJ() {
        return EZpvd(KWHzl()).AEQbTJ();
    }

    @Override // o.InterfaceC22305hcp
    public void OLrzqt(MarketTransactionFeeCacheParams marketTransactionFeeCacheParams) {
        EZpvd(KWHzl()).OLrzqt(marketTransactionFeeCacheParams);
    }

    @Override // o.InterfaceC22305hcp
    public void KWHzl(@NotNull DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        this.KWHzl = defiChainInfo;
        EZpvd(defiChainInfo.getSupportEip1559()).KWHzl(defiChainInfo);
    }

    public final void copydefault() {
        this.copydefault.OLrzqt(null);
        this.EZpvd.OLrzqt(null);
    }
}
