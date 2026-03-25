package o;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.tradingbot.impl.strategy.fragment.arbitrage.search.view.SpreadArbitrageSearchFragment$loadBiz$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.subscribe.SpreadArbitrageData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wxB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54053wxB extends AbstractC54084wxg {
    public final java.util.ArrayList<java.lang.String> iwGUEr = yDY.copydefault(C33070mpX.AYXKKw(C55688xof.Application.QUSxYX), C33070mpX.AYXKKw(C55688xof.Application.RcXXUw));

    /* JADX INFO: renamed from: o.wxB$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54084wxg
    public int gEmmrt() {
        return C55688xof.Application.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54084wxg
    public java.lang.String valueOf() {
        return "spreadArbitrage";
    }

    @Override // o.AbstractC54084wxg
    public java.util.List<FutureGroupInfo> AYXKKw() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            return interfaceC54581xNrCopydefault.DbNXlk();
        }
        return null;
    }

    @Override // o.AbstractC54084wxg
    public void DbNXlk() {
        AbstractC48365uOu abstractC48365uOuDjBIcL = djBIcL();
        if (abstractC48365uOuDjBIcL != null) {
            C52708wVk c52708wVk = abstractC48365uOuDjBIcL.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c52708wVk, "");
            c52708wVk.setVisibility(0);
            C48157uHb c48157uHb = abstractC48365uOuDjBIcL.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c48157uHb, "");
            c48157uHb.setVisibility(0);
        }
    }

    @Override // o.AbstractC54084wxg
    public void values() {
        super.values();
        AbstractC48365uOu abstractC48365uOuDjBIcL = djBIcL();
        if (abstractC48365uOuDjBIcL != null) {
            C48157uHb c48157uHb = abstractC48365uOuDjBIcL.KWHzl;
            java.util.ArrayList<java.lang.String> arrayList = this.iwGUEr;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new FutureGroupInfo((java.lang.String) it.next(), "", "", (java.lang.String) null, 8, (DefaultConstructorMarker) null));
            }
            c48157uHb.setShowList(arrayList2, getChildFragmentManager());
            abstractC48365uOuDjBIcL.KWHzl.setOnItemSelectCallback(new Function1() { // from class: o.wxD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54053wxB.EZpvd(this.KWHzl, (FutureGroupInfo) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(C54053wxB c54053wxB, FutureGroupInfo futureGroupInfo) {
        if (Intrinsics.EZpvd((java.lang.Object) (futureGroupInfo != null ? futureGroupInfo.getText() : null), (java.lang.Object) C33070mpX.AYXKKw(C55688xof.Application.QUSxYX))) {
            c54053wxB.EZpvd("futures_spot");
        } else {
            c54053wxB.EZpvd("futures_futures");
        }
        c54053wxB.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC54084wxg
    public void isConnected() {
        if (KWHzl() == null || copydefault() == null) {
            return;
        }
        java.util.ArrayList<java.lang.Object> arrayListCopydefault = copydefault();
        Intrinsics.copydefault(arrayListCopydefault);
        KWHzl(arrayListCopydefault);
        dismissLoading();
    }

    @Override // o.AbstractC54084wxg
    public void fetchVPNInfo() {
        showLoading();
        AEQbTJ().removeObservers(this);
        OLrzqt("FUTURES", new Function1() { // from class: o.wxF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54053wxB.AEQbTJ(this.copydefault, (AbstractC54531xLw) obj);
            }
        });
    }

    public static final Unit AEQbTJ(final C54053wxB c54053wxB, AbstractC54531xLw abstractC54531xLw) {
        if (abstractC54531xLw != null) {
            c54053wxB.AEQbTJ().observe(c54053wxB, new Activity(new Function1() { // from class: o.wxG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54053wxB.EZpvd(this.AEQbTJ, (SourceResp) obj);
                }
            }));
            C55886xsR.OLrzqt.KWHzl(c54053wxB.AEQbTJ(), true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C54053wxB c54053wxB, SourceResp sourceResp) {
        java.util.ArrayList<java.lang.Object> arrayListCopydefault;
        java.util.ArrayList<SpreadArbitrageData> arrayListEZpvd;
        Intrinsics.checkNotNullParameter(sourceResp, "");
        c54053wxB.OLrzqt(new java.util.ArrayList<>());
        C55879xsK c55879xsK = (C55879xsK) sourceResp.getData();
        java.util.ArrayList arrayList = null;
        if (c55879xsK != null && (arrayListEZpvd = c55879xsK.EZpvd()) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayListEZpvd) {
                SpreadArbitrageData spreadArbitrageData = (SpreadArbitrageData) obj;
                spreadArbitrageData.setShow(c54053wxB.copydefault(spreadArbitrageData.getBuyInstId(), spreadArbitrageData.getBuyInstType()) && c54053wxB.copydefault(spreadArbitrageData.getSellInstId(), spreadArbitrageData.getSellInstType()));
                if (Intrinsics.EZpvd((java.lang.Object) spreadArbitrageData.getState(), (java.lang.Object) "live")) {
                    java.lang.String ctType = spreadArbitrageData.getCtType();
                    FutureGroupInfo futureGroupInfoEZpvd = c54053wxB.EZpvd();
                    if (Intrinsics.EZpvd((java.lang.Object) ctType, (java.lang.Object) (futureGroupInfoEZpvd != null ? futureGroupInfoEZpvd.getCtType() : null)) && Intrinsics.EZpvd((java.lang.Object) spreadArbitrageData.getArbitrageType(), (java.lang.Object) c54053wxB.OLrzqt())) {
                        java.lang.String ccyType = spreadArbitrageData.getCcyType();
                        FutureGroupInfo futureGroupInfoEZpvd2 = c54053wxB.EZpvd();
                        if (Intrinsics.EZpvd((java.lang.Object) ccyType, (java.lang.Object) (futureGroupInfoEZpvd2 != null ? futureGroupInfoEZpvd2.getCcyType() : null))) {
                            arrayList2.add(obj);
                        }
                    }
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null && (arrayListCopydefault = c54053wxB.copydefault()) != null) {
            arrayListCopydefault.addAll(arrayList);
        }
        c54053wxB.isConnected();
        return Unit.INSTANCE;
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

    public final void OLrzqt(java.lang.String str, Function1<? super AbstractC54531xLw, Unit> function1) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SpreadArbitrageSearchFragment$loadBiz$1(str, function1, null), 3, null);
    }
}
