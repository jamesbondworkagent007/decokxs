package com.okinc.business.dex.tee.swap.limit.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.api.bean.LimitParam;
import com.okinc.business.dex.tee.swap.limit.ui.viewmodel.SwapLimitHomeViewModel;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.main.swap.trade.bean.CurrentChain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.AbstractC58260yxt;
import o.C22380heK;
import o.C23314hvr;
import o.C31200lpY;
import o.C33129mqd;
import o.C56403yEb;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC9738bbJ;
import o.kUH;
import o.yBK;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SwapLimitHomeViewModel extends AbstractC33073mpa {
    public final C23314hvr<CurrentChain> AEQbTJ;
    public final String AhwBna;
    public final C23314hvr<List<DefiChainInfo>> EZpvd;
    public final SharedFlow<Boolean> KWHzl;
    public final MutableSharedFlow<Boolean> OLrzqt;
    public final kUH copydefault;
    public final LimitParam djBIcL;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<DefiChainInfo>> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<CurrentChain> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault() {
        this.valueOf = true;
    }

    @yCM
    public SwapLimitHomeViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull kUH kuh) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(kuh, "");
        this.copydefault = kuh;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.KWHzl = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.AEQbTJ = new C23314hvr<>();
        this.EZpvd = new C23314hvr<>();
        this.djBIcL = (LimitParam) savedStateHandle.get("data");
        this.AhwBna = C31200lpY.getSourceType$default(savedStateHandle, (String) null, 1, (Object) null);
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SwapLimitHomeViewModel$loadSupportListInfo$1(this, null), 3, null);
    }

    public final void copydefault(final List<DefiChainInfo> list) {
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = C22380heK.OLrzqt.copydefault(this.AhwBna).fARcdN().OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.gNH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapLimitHomeViewModel.EZpvd(this.copydefault, list, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gNJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                SwapLimitHomeViewModel.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gNP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapLimitHomeViewModel.EZpvd(this.OLrzqt, list, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gNN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                SwapLimitHomeViewModel.KWHzl(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, call());
    }

    public static final void EZpvd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(SwapLimitHomeViewModel swapLimitHomeViewModel, List list, InterfaceC9738bbJ interfaceC9738bbJ) {
        swapLimitHomeViewModel.KWHzl((List<DefiChainInfo>) list, interfaceC9738bbJ);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(SwapLimitHomeViewModel swapLimitHomeViewModel, List list, Throwable th) {
        swapLimitHomeViewModel.KWHzl((List<DefiChainInfo>) list, (InterfaceC9738bbJ) null);
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        if (this.valueOf) {
            this.valueOf = false;
            EZpvd();
        }
    }

    public final boolean KWHzl(List<DefiChainInfo> list, InterfaceC9738bbJ interfaceC9738bbJ) {
        String chainId;
        Object obj = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (DefiChainInfo defiChainInfo : list) {
                arrayList.add(new CurrentChain(defiChainInfo.getChainName(), defiChainInfo));
            }
            DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd = C22380heK.OLrzqt.copydefault(this.AhwBna).AYXKKw().EZpvd();
            LimitParam limitParam = this.djBIcL;
            if (limitParam == null || (chainId = limitParam.getFromChainId()) == null) {
                chainId = dexMultiTokenInfoBeanEZpvd != null ? dexMultiTokenInfoBeanEZpvd.getChainId() : null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                CurrentChain currentChain = (CurrentChain) obj2;
                if (interfaceC9738bbJ != null && interfaceC9738bbJ.KWHzl(Long.valueOf(C33129mqd.valueOf(currentChain.getData().getChainId())))) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.EZpvd((Object) ((CurrentChain) next).getData().getChainId(), (Object) chainId)) {
                    obj = next;
                    break;
                }
            }
            CurrentChain currentChain2 = (CurrentChain) obj;
            if (currentChain2 == null && (currentChain2 = (CurrentChain) CollectionsKt___CollectionsKt.firstOrNull(arrayList2)) == null) {
                currentChain2 = (CurrentChain) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList);
            }
            this.AEQbTJ.setValue(currentChain2);
        } else {
            list = null;
        }
        return C33129mqd.KWHzl((Collection) list);
    }
}
