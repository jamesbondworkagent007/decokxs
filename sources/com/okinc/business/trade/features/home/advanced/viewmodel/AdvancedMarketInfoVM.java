package com.okinc.business.trade.features.home.advanced.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.common.OrderFilter;
import com.okinc.business.trade.features.home.ui.cefi.data.FilterValue;
import com.okinc.business.trade.features.home.ui.cefi.data.OrderBookInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C22416heu;
import o.C25389ivm;
import o.C28179kRv;
import o.C28222kTk;
import o.C28230kTs;
import o.C30565ldZ;
import o.C55276xgr;
import o.InterfaceC28226kTo;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketInfoVM extends AbstractC33073mpa {
    public final MutableStateFlow<C28222kTk> AEQbTJ;
    public DexMultiTokenInfoBean AYXKKw;
    public Job AhwBna;
    public AdvancedTradeType AkhnZx;
    public final C28179kRv AuCTel;
    public final StateFlow<C28222kTk> DbNXlk;
    public Job EZpvd;
    public final MutableStateFlow<List<C55276xgr>> KWHzl;
    public final MutableStateFlow<InterfaceC28226kTo> OLrzqt;
    public final MutableStateFlow<List<C55276xgr>> copydefault;
    public final StateFlow<List<C55276xgr>> djBIcL;
    public final StateFlow<InterfaceC28226kTo> fARcdN;
    public final StateFlow<C28222kTk> fIwbmz;
    public final StateFlow<List<C55276xgr>> fetchVPNInfo;
    public final MutableStateFlow<C28222kTk> gEmmrt;
    public DexMultiTokenInfoBean isConnected;
    public Job valueOf;
    public final MutableStateFlow<FilterValue> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C55276xgr>> AEQbTJ() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<FilterValue> EZpvd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C55276xgr>> KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull AdvancedTradeType advancedTradeType) {
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        this.AkhnZx = advancedTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28222kTk> djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28222kTk> gEmmrt() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28226kTo> valueOf() {
        return this.fARcdN;
    }

    @yCM
    public AdvancedMarketInfoVM(@NotNull C28179kRv c28179kRv) {
        Intrinsics.checkNotNullParameter(c28179kRv, "");
        this.AuCTel = c28179kRv;
        MutableStateFlow<C28222kTk> MutableStateFlow = StateFlowKt.MutableStateFlow(new C28222kTk(null, null, null, null, null, null, 63, null));
        this.AEQbTJ = MutableStateFlow;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C28222kTk> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C28222kTk(null, null, null, null, null, null, 63, null));
        this.gEmmrt = MutableStateFlow2;
        this.fIwbmz = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<InterfaceC28226kTo> MutableStateFlow3 = StateFlowKt.MutableStateFlow(InterfaceC28226kTo.Activity.AEQbTJ);
        this.OLrzqt = MutableStateFlow3;
        this.fARcdN = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<List<C55276xgr>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.copydefault = MutableStateFlow4;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow4);
        this.values = StateFlowKt.MutableStateFlow(new FilterValue(null, null, null, null, 15, null));
        MutableStateFlow<List<C55276xgr>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.KWHzl = MutableStateFlow5;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow5);
        this.AkhnZx = AdvancedTradeType.BUY;
    }

    public final void OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Job job;
        if (dexMultiTokenInfoBean != null) {
            if (C30565ldZ.OLrzqt(dexMultiTokenInfoBean, this.AYXKKw) && (job = this.EZpvd) != null && job.isActive()) {
                return;
            }
            isConnected();
            this.AYXKKw = dexMultiTokenInfoBean;
            AhwBna();
            copydefault(dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress());
            AEQbTJ(dexMultiTokenInfoBean.isMemeToken() ? OrderFilter.Amount : OrderFilter.Volume);
            EZpvd(new FilterValue(dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress(), null, null, 12, null));
        }
    }

    public final void KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (dexMultiTokenInfoBean == null || C30565ldZ.OLrzqt(dexMultiTokenInfoBean, this.isConnected)) {
            return;
        }
        if (this.AkhnZx == AdvancedTradeType.SELL) {
            this.isConnected = null;
            this.gEmmrt.setValue(this.AEQbTJ.getValue());
        } else {
            this.isConnected = dexMultiTokenInfoBean;
            AEQbTJ(dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress());
        }
    }

    public final void EZpvd(@NotNull FilterValue filterValue) {
        Intrinsics.checkNotNullParameter(filterValue, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMarketInfoVM$updateFilterValue$1(this, filterValue, null), 3, null);
    }

    public final void AYXKKw() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMarketInfoVM$getOrderFilters$1(this, null), 3, null);
    }

    public final void OLrzqt() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMarketInfoVM$getFilterSwitches$1(this, null), 3, null);
    }

    public final void AEQbTJ(@NotNull OrderFilter orderFilter) {
        Object next;
        Intrinsics.checkNotNullParameter(orderFilter, "");
        Iterator<T> it = this.KWHzl.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((C55276xgr) next).AEQbTJ()) {
                    break;
                }
            }
        }
        Object obj = (C55276xgr) next;
        if (obj == null) {
            obj = OrderFilter.Volume;
        }
        if (obj != OrderFilter.Volume) {
            EZpvd(new FilterValue(null, null, null, null, 15, null));
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMarketInfoVM$updateFilterSwitch$1(this, orderFilter, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMarketInfoVM$fetchQuotePrice$1(this, str, str2, null), 3, null);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMarketInfoVM$subscribeMarketInfo$1(this, str, str2, null), 3, null);
    }

    public final void AEQbTJ(@NotNull FilterValue filterValue) {
        Intrinsics.checkNotNullParameter(filterValue, "");
        this.AuCTel.copydefault();
        this.OLrzqt.setValue(InterfaceC28226kTo.Activity.AEQbTJ);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMarketInfoVM$subscribeOrderBook$1(this, new OrderBookInfo(filterValue.OLrzqt(), filterValue.KWHzl(), (String) null, filterValue.EZpvd(), filterValue.copydefault(), (List) null, false, 100, (DefaultConstructorMarker) null), null), 3, null);
    }

    public final void values() {
        if (C22416heu.ejfBZ()) {
            return;
        }
        this.AhwBna = C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMarketInfoVM$observeWS$1(this, null), 3, null);
        this.valueOf = C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMarketInfoVM$observeWS$2(this, null), 3, null);
    }

    public final void AhwBna() {
        values();
        this.EZpvd = C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMarketInfoVM$observeOrderBookFlow$1(this, null), 3, null);
    }

    public final boolean KWHzl(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof ArrayList) {
            Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List) obj);
            C28230kTs c28230kTs = objFirstOrNull instanceof C28230kTs ? (C28230kTs) objFirstOrNull : null;
            String strEZpvd = c28230kTs != null ? c28230kTs.EZpvd() : null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean = this.AYXKKw;
            if (!Intrinsics.EZpvd((Object) strEZpvd, (Object) (dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenContractAddress() : null))) {
                DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.AYXKKw;
                if (!Intrinsics.EZpvd((Object) strEZpvd, (Object) (dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getWTokenAddress() : null))) {
                    return false;
                }
            }
            return true;
        }
        boolean z = obj instanceof C28222kTk;
        if (!z) {
            return false;
        }
        C28222kTk c28222kTk = z ? (C28222kTk) obj : null;
        String strDjBIcL = c28222kTk != null ? c28222kTk.djBIcL() : null;
        DexMultiTokenInfoBean dexMultiTokenInfoBean3 = this.AYXKKw;
        if (!Intrinsics.EZpvd((Object) strDjBIcL, (Object) (dexMultiTokenInfoBean3 != null ? dexMultiTokenInfoBean3.getTokenContractAddress() : null))) {
            DexMultiTokenInfoBean dexMultiTokenInfoBean4 = this.AYXKKw;
            if (!Intrinsics.EZpvd((Object) strDjBIcL, (Object) (dexMultiTokenInfoBean4 != null ? dexMultiTokenInfoBean4.getWTokenAddress() : null))) {
                return false;
            }
        }
        return true;
    }

    public final void isConnected() {
        Job job = this.EZpvd;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.AhwBna;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        Job job3 = this.valueOf;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
        }
        this.AYXKKw = null;
        this.AEQbTJ.setValue(new C28222kTk(null, null, null, null, null, null, 63, null));
        this.AuCTel.copydefault();
        this.AuCTel.AEQbTJ();
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        isConnected();
        super.onCleared();
    }
}
