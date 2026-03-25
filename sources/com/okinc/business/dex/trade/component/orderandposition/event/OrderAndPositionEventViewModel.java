package com.okinc.business.dex.trade.component.orderandposition.event;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.trade.order.domain.model.OrderStatus;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19816gQj;
import o.C30765lhN;
import o.InterfaceC19815gQi;
import o.kUP;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderAndPositionEventViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<OrderStatus> AEQbTJ;
    public final SharedFlow<C19816gQj> AYXKKw;
    public final MutableStateFlow<InterfaceC19815gQi> AhwBna;
    public final StateFlow<OrderStatus> AkhnZx;
    public final SharedFlow<Boolean> DbNXlk;
    public final MutableSharedFlow<Unit> EZpvd;
    public final MutableSharedFlow<C19816gQj> KWHzl;
    public final MutableSharedFlow<Boolean> OLrzqt;
    public final MutableStateFlow<List<DexMultiTokenInfoBean>> copydefault;
    public final MutableSharedFlow<Unit> djBIcL;
    public final SharedFlow<Unit> ejfBZ;
    public final kUP fARcdN;
    public final StateFlow<InterfaceC19815gQi> fIwbmz;
    public final SharedFlow<Unit> fJNWhG;
    public final SharedFlow<Unit> fetchVPNInfo;
    public final MutableSharedFlow<Unit> gEmmrt;
    public final SharedFlow<Unit> isConnected;
    public final MutableSharedFlow<Unit> valueOf;
    public final StateFlow<List<DexMultiTokenInfoBean>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AYXKKw() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> AhwBna() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC19815gQi> AkhnZx() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<C19816gQj> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<DexMultiTokenInfoBean>> OLrzqt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<OrderStatus> copydefault() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> gEmmrt() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> valueOf() {
        return this.isConnected;
    }

    @yCM
    public OrderAndPositionEventViewModel(@NotNull kUP kup) {
        Intrinsics.checkNotNullParameter(kup, "");
        this.fARcdN = kup;
        MutableStateFlow<List<DexMultiTokenInfoBean>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.copydefault = MutableStateFlow;
        this.values = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default;
        this.fJNWhG = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default2;
        this.fetchVPNInfo = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<C19816gQj> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default3;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default4;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableStateFlow<InterfaceC19815gQi> MutableStateFlow2 = StateFlowKt.MutableStateFlow(InterfaceC19815gQi.ActionBar.copydefault);
        this.AhwBna = MutableStateFlow2;
        this.fIwbmz = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<OrderStatus> MutableStateFlow3 = StateFlowKt.MutableStateFlow(OrderStatus.OpenOrders);
        this.AEQbTJ = MutableStateFlow3;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow3);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default5;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = mutableSharedFlowMutableSharedFlow$default6;
        this.ejfBZ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
    }

    public final DefiChainInfo DbNXlk() {
        InterfaceC19815gQi value = this.fIwbmz.getValue();
        InterfaceC19815gQi.Application application = value instanceof InterfaceC19815gQi.Application ? (InterfaceC19815gQi.Application) value : null;
        if (application != null) {
            return application.KWHzl();
        }
        return null;
    }

    public final void fetchVPNInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OrderAndPositionEventViewModel$refresh$1(this, null), 3, null);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OrderAndPositionEventViewModel$finishRefresh$1(this, null), 3, null);
    }

    public final void values() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OrderAndPositionEventViewModel$scrollToTop$1(this, null), 3, null);
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OrderAndPositionEventViewModel$filter$1(this, null), 3, null);
    }

    public final void AEQbTJ(@NotNull List<DexMultiTokenInfoBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault.setValue(list);
    }

    public final void OLrzqt(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OrderAndPositionEventViewModel$setFiltered$1(this, z, null), 3, null);
    }

    public final void OLrzqt(@NotNull OrderStatus orderStatus) {
        Intrinsics.checkNotNullParameter(orderStatus, "");
        this.AEQbTJ.setValue(orderStatus);
    }

    public final void OLrzqt(@NotNull C30765lhN c30765lhN) {
        Intrinsics.checkNotNullParameter(c30765lhN, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OrderAndPositionEventViewModel$assetClick$1(this, c30765lhN, null), 3, null);
    }

    public final void copydefault(String str) {
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OrderAndPositionEventViewModel$updateSelectedChain$1(this, str, null), 3, null);
        } else {
            this.AhwBna.setValue(InterfaceC19815gQi.ActionBar.copydefault);
        }
    }
}
