package o;

import androidx.lifecycle.Observer;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;

/* JADX INFO: renamed from: o.wxz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54103wxz extends AbstractC54084wxg {

    /* JADX INFO: renamed from: o.wxz$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54084wxg
    public int gEmmrt() {
        return C55688xof.Application.saveState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54084wxg
    public java.lang.String valueOf() {
        return "fundingRateArbitrage";
    }

    @Override // o.AbstractC54084wxg
    public java.util.List<FutureGroupInfo> AYXKKw() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            return interfaceC54581xNrCopydefault.fARcdN();
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
            c48157uHb.setVisibility(8);
        }
    }

    @Override // o.AbstractC54084wxg
    public void fetchVPNInfo() {
        showLoading();
        AEQbTJ().removeObservers(this);
        AEQbTJ().observe(this, new StateListAnimator(new Function1() { // from class: o.wxA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54103wxz.EZpvd(this.AEQbTJ, (SourceResp) obj);
            }
        }));
        C55886xsR.OLrzqt.KWHzl(AEQbTJ(), true);
    }

    public static final Unit EZpvd(C54103wxz c54103wxz, SourceResp sourceResp) {
        java.util.ArrayList<java.lang.Object> arrayListCopydefault;
        java.util.ArrayList<FundingRateArbitrageData> arrayListKWHzl;
        Intrinsics.checkNotNullParameter(sourceResp, "");
        c54103wxz.OLrzqt(new java.util.ArrayList<>());
        C55879xsK c55879xsK = (C55879xsK) sourceResp.getData();
        java.util.ArrayList arrayList = null;
        if (c55879xsK != null && (arrayListKWHzl = c55879xsK.KWHzl()) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayListKWHzl) {
                FundingRateArbitrageData fundingRateArbitrageData = (FundingRateArbitrageData) obj;
                fundingRateArbitrageData.setShow(c54103wxz.copydefault(fundingRateArbitrageData.getBuyInstId(), fundingRateArbitrageData.getBuyInstType()) && c54103wxz.copydefault(fundingRateArbitrageData.getSellInstId(), fundingRateArbitrageData.getSellInstType()));
                if (Intrinsics.EZpvd((java.lang.Object) fundingRateArbitrageData.getState(), (java.lang.Object) "live")) {
                    java.lang.String ctType = fundingRateArbitrageData.getCtType();
                    FutureGroupInfo futureGroupInfoEZpvd = c54103wxz.EZpvd();
                    if (Intrinsics.EZpvd((java.lang.Object) ctType, (java.lang.Object) (futureGroupInfoEZpvd != null ? futureGroupInfoEZpvd.getCtType() : null))) {
                        java.lang.String ccyType = fundingRateArbitrageData.getCcyType();
                        FutureGroupInfo futureGroupInfoEZpvd2 = c54103wxz.EZpvd();
                        if (Intrinsics.EZpvd((java.lang.Object) ccyType, (java.lang.Object) (futureGroupInfoEZpvd2 != null ? futureGroupInfoEZpvd2.getCcyType() : null))) {
                            arrayList2.add(obj);
                        }
                    }
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null && (arrayListCopydefault = c54103wxz.copydefault()) != null) {
            arrayListCopydefault.addAll(arrayList);
        }
        c54103wxz.isConnected();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC54084wxg
    public void isConnected() {
        if (KWHzl() == null || copydefault() == null) {
            return;
        }
        java.util.ArrayList<java.lang.Object> arrayListCopydefault = copydefault();
        if (arrayListCopydefault != null) {
            KWHzl(arrayListCopydefault);
        }
        dismissLoading();
    }
}
