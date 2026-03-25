package o;

import androidx.lifecycle.SavedStateHandle;
import com.okinc.business.dex.trade.swap.market.priorityfee.domain.model.MarketTransactionFeeCacheParams;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C6777aVl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22301hcl {
    public final C22307hcr AEQbTJ;
    public final C19700gMb EZpvd;
    public final C22306hcq KWHzl;
    public final java.lang.String OLrzqt;
    public final C22304hco copydefault;

    @yCM
    public C22301hcl(@NotNull SavedStateHandle savedStateHandle, @NotNull C22307hcr c22307hcr, @NotNull C22306hcq c22306hcq, @NotNull C22304hco c22304hco, @NotNull C19700gMb c19700gMb) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c22307hcr, "");
        Intrinsics.checkNotNullParameter(c22306hcq, "");
        Intrinsics.checkNotNullParameter(c22304hco, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.AEQbTJ = c22307hcr;
        this.KWHzl = c22306hcq;
        this.copydefault = c22304hco;
        this.EZpvd = c19700gMb;
        this.OLrzqt = C31200lpY.getSourceType$default(savedStateHandle, (java.lang.String) null, 1, (java.lang.Object) null);
    }

    public final InterfaceC22305hcp copydefault(java.lang.String str) {
        java.lang.Object next;
        java.util.ArrayList<DefiChainInfo> arrayListEZpvd = C22380heK.OLrzqt.copydefault(this.OLrzqt).AkhnZx().EZpvd();
        java.util.Iterator<T> it = arrayListEZpvd.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next).getChainId(), (java.lang.Object) str)) {
                break;
            }
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) next;
        if (defiChainInfo == null) {
            C6777aVl.TaskDescription taskDescription = C6777aVl.Companion;
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("currentChainInfo is null, chainId=" + str);
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = C56390yDp.OLrzqt("chainId", str);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListEZpvd, 10));
            java.util.Iterator<T> it2 = arrayListEZpvd.iterator();
            while (it2.hasNext()) {
                arrayList.add(((DefiChainInfo) it2.next()).getChainId());
            }
            pairArr[1] = C56390yDp.OLrzqt("supportedSingleChainList", arrayList.toString());
            taskDescription.OLrzqt(nullPointerException, C56424yEw.gEmmrt(pairArr), java.lang.Boolean.TRUE);
        }
        java.lang.String networkFeeType = defiChainInfo != null ? defiChainInfo.getNetworkFeeType() : null;
        if (Intrinsics.EZpvd((java.lang.Object) networkFeeType, (java.lang.Object) MemeChainType.MemeChainTypeSol.getValue())) {
            this.KWHzl.KWHzl(defiChainInfo);
            return this.KWHzl;
        }
        if (Intrinsics.EZpvd((java.lang.Object) networkFeeType, (java.lang.Object) MemeChainType.MemeChainTypeEVM.getValue())) {
            this.AEQbTJ.KWHzl(defiChainInfo);
            return this.AEQbTJ;
        }
        if (defiChainInfo != null) {
            this.copydefault.KWHzl(defiChainInfo);
        }
        return this.copydefault;
    }

    public final MarketTransactionFeeCacheParams OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(str).AEQbTJ();
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull MarketTransactionFeeCacheParams marketTransactionFeeCacheParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(marketTransactionFeeCacheParams, "");
        copydefault(str).OLrzqt(marketTransactionFeeCacheParams);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return copydefault(str).AEQbTJ(i, z, swapPriorityFeeInfo, str2);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, int i, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return copydefault(str).AEQbTJ(i, z, swapPriorityFeeInfo, str2, str3, str4);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, boolean z, SwapPriorityFeeInfo swapPriorityFeeInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(str).AEQbTJ(z, swapPriorityFeeInfo);
    }

    public final void AEQbTJ() {
        this.KWHzl.OLrzqt((MarketTransactionFeeCacheParams) null);
        this.AEQbTJ.copydefault();
    }
}
