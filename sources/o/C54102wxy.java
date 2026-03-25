package o;

import androidx.lifecycle.Observer;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData;
import com.okinc.unify_trade.biz.subscribe.SpreadArbitrageData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wxy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54102wxy extends AbstractC54084wxg {
    public final java.util.ArrayList<java.lang.Object> getNewProxyInstance = new java.util.ArrayList<>();
    public final java.util.ArrayList<InterfaceC58217yxC> hDKMBd = new java.util.ArrayList<>();
    public int iwGUEr;

    /* JADX INFO: renamed from: o.wxy$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54084wxg
    public int gEmmrt() {
        return C55688xof.Application.prepareFromSearch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54084wxg
    public java.lang.String valueOf() {
        return "Watchlist";
    }

    @Override // o.AbstractC54084wxg
    public java.util.List<FutureGroupInfo> AYXKKw() {
        return yDY.AhwBna();
    }

    @Override // o.AbstractC54084wxg
    public void DbNXlk() {
        AbstractC48365uOu abstractC48365uOuDjBIcL = djBIcL();
        if (abstractC48365uOuDjBIcL != null) {
            C52708wVk c52708wVk = abstractC48365uOuDjBIcL.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c52708wVk, "");
            c52708wVk.setVisibility(8);
            C48157uHb c48157uHb = abstractC48365uOuDjBIcL.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c48157uHb, "");
            c48157uHb.setVisibility(8);
        }
    }

    @Override // o.AbstractC54084wxg
    public void fetchVPNInfo() {
        AuCTel();
        showLoading();
        AEQbTJ().removeObservers(this);
        AEQbTJ().observe(this, new Activity(new Function1() { // from class: o.wxC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54102wxy.KWHzl(this.OLrzqt, (SourceResp) obj);
            }
        }));
        C55886xsR.OLrzqt.KWHzl(AEQbTJ(), true);
    }

    public static final Unit KWHzl(C54102wxy c54102wxy, SourceResp sourceResp) {
        java.util.ArrayList<SpreadArbitrageData> arrayListEZpvd;
        java.util.ArrayList<FundingRateArbitrageData> arrayListKWHzl;
        Intrinsics.checkNotNullParameter(sourceResp, "");
        c54102wxy.getNewProxyInstance.clear();
        C55879xsK c55879xsK = (C55879xsK) sourceResp.getData();
        if (c55879xsK != null && (arrayListKWHzl = c55879xsK.KWHzl()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : arrayListKWHzl) {
                if (Intrinsics.EZpvd((java.lang.Object) ((FundingRateArbitrageData) obj).getState(), (java.lang.Object) "live")) {
                    arrayList.add(obj);
                }
            }
            c54102wxy.getNewProxyInstance.addAll(arrayList);
        }
        C55879xsK c55879xsK2 = (C55879xsK) sourceResp.getData();
        if (c55879xsK2 != null && (arrayListEZpvd = c55879xsK2.EZpvd()) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayListEZpvd) {
                if (Intrinsics.EZpvd((java.lang.Object) ((SpreadArbitrageData) obj2).getState(), (java.lang.Object) "live")) {
                    arrayList2.add(obj2);
                }
            }
            c54102wxy.getNewProxyInstance.addAll(arrayList2);
        }
        c54102wxy.isConnected();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC54084wxg
    public void isConnected() {
        java.util.ArrayList<java.lang.String> arrayListKWHzl;
        java.util.ArrayList<java.lang.String> arrayListKWHzl2;
        if (KWHzl() != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : this.getNewProxyInstance) {
                if ((obj instanceof FundingRateArbitrageData) && (arrayListKWHzl2 = KWHzl()) != null) {
                    FundingRateArbitrageData fundingRateArbitrageData = (FundingRateArbitrageData) obj;
                    java.lang.String arbitrageId = fundingRateArbitrageData.getArbitrageId();
                    if (arbitrageId == null) {
                        arbitrageId = "";
                    }
                    if (arrayListKWHzl2.contains(arbitrageId)) {
                        fundingRateArbitrageData.setShow(true);
                        arrayList.add(obj);
                    }
                }
                if ((obj instanceof SpreadArbitrageData) && (arrayListKWHzl = KWHzl()) != null) {
                    SpreadArbitrageData spreadArbitrageData = (SpreadArbitrageData) obj;
                    java.lang.String arbitrageId2 = spreadArbitrageData.getArbitrageId();
                    if (arrayListKWHzl.contains(arbitrageId2 != null ? arbitrageId2 : "")) {
                        spreadArbitrageData.setShow(true);
                        arrayList.add(obj);
                    }
                }
            }
            this.getNewProxyInstance.clear();
            this.getNewProxyInstance.addAll(arrayList);
            KWHzl(this.getNewProxyInstance);
            dismissLoading();
        }
    }

    @Override // o.AbstractC54084wxg
    public java.lang.String gEmmrt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String instFamily;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        BizInstrument bizInstrumentCopydefault = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.copydefault(str, str2, "", "") : null;
        FutureInstrument futureInstrument = bizInstrumentCopydefault instanceof FutureInstrument ? (FutureInstrument) bizInstrumentCopydefault : null;
        return (futureInstrument == null || (instFamily = futureInstrument.getInstFamily()) == null) ? "" : instFamily;
    }

    @Override // o.AbstractC54084wxg
    public java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String alias;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        BizInstrument bizInstrumentCopydefault = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.copydefault(str, str2, "", "") : null;
        FutureInstrument futureInstrument = bizInstrumentCopydefault instanceof FutureInstrument ? (FutureInstrument) bizInstrumentCopydefault : null;
        return (futureInstrument == null || (alias = futureInstrument.getAlias()) == null) ? "" : alias;
    }

    private final void AuCTel() {
        this.getNewProxyInstance.clear();
        this.iwGUEr = 0;
        java.util.Iterator<T> it = this.hDKMBd.iterator();
        while (it.hasNext()) {
            ((InterfaceC58217yxC) it.next()).dispose();
        }
        this.hDKMBd.clear();
    }
}
