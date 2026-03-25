package com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData;
import com.okinc.business.dex.trade.component.orderandposition.openorder.domain.model.ReminderType;
import com.okinc.business.dex.trade.copytrading.home.data.CTOpenOrderResponse;
import com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel.StrategyOpenOrderViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
import o.C19700gMb;
import o.C19702gMd;
import o.C20004gXi;
import o.C20010gXo;
import o.C20064gZo;
import o.InterfaceC19701gMc;
import o.InterfaceC20068gZs;
import o.gZA;
import o.gZH;
import o.yCM;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyOpenOrderViewModel extends AbstractC33073mpa {
    public final MutableSharedFlow<Pair<Boolean, List<String>>> AEQbTJ;
    public boolean AYXKKw;
    public final StateFlow<InterfaceC20068gZs> AhwBna;
    public String AkhnZx;
    public InterfaceC19701gMc AuCTel;
    public final C19700gMb DbNXlk;
    public final MutableSharedFlow<Pair<Boolean, List<String>>> EZpvd;
    public final gZA KWHzl;
    public final C20004gXi OLrzqt;
    public final MutableStateFlow<InterfaceC20068gZs> copydefault;
    public final C20010gXo djBIcL;
    public final C19702gMd fARcdN;
    public final SharedFlow<Pair<Boolean, List<String>>> fetchVPNInfo;
    public String gEmmrt;
    public final HashMap<String, CTOpenOrderResponse> isConnected;
    public final SharedFlow<Pair<Boolean, List<String>>> valueOf;
    public final gZH values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Pair<Boolean, List<String>>> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Pair<Boolean, List<String>>> EZpvd() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx = str;
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC20068gZs> copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<InterfaceC20068gZs> valueOf() {
        return this.copydefault;
    }

    @yCM
    public StrategyOpenOrderViewModel(@NotNull C20010gXo c20010gXo, @NotNull gZA gza, @NotNull gZH gzh, @NotNull C19700gMb c19700gMb, @NotNull C20004gXi c20004gXi, @NotNull C19702gMd c19702gMd) {
        Intrinsics.checkNotNullParameter(c20010gXo, "");
        Intrinsics.checkNotNullParameter(gza, "");
        Intrinsics.checkNotNullParameter(gzh, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c20004gXi, "");
        Intrinsics.checkNotNullParameter(c19702gMd, "");
        this.djBIcL = c20010gXo;
        this.KWHzl = gza;
        this.values = gzh;
        this.DbNXlk = c19700gMb;
        this.OLrzqt = c20004gXi;
        this.fARcdN = c19702gMd;
        this.gEmmrt = "";
        this.AkhnZx = "";
        this.isConnected = new HashMap<>();
        MutableStateFlow<InterfaceC20068gZs> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC20068gZs.TaskDescription.OLrzqt);
        this.copydefault = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Pair<Boolean, List<String>>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Pair<Boolean, List<String>>> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default2;
        this.fetchVPNInfo = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
    }

    public final InterfaceC20068gZs.StateListAnimator OLrzqt() {
        InterfaceC20068gZs value = this.copydefault.getValue();
        if (value instanceof InterfaceC20068gZs.StateListAnimator) {
            return (InterfaceC20068gZs.StateListAnimator) value;
        }
        return null;
    }

    public static /* synthetic */ void loadOpenOrders$default(StrategyOpenOrderViewModel strategyOpenOrderViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        strategyOpenOrderViewModel.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        InterfaceC20068gZs interfaceC20068gZs;
        MutableStateFlow<InterfaceC20068gZs> mutableStateFlow = this.copydefault;
        if (z) {
            interfaceC20068gZs = InterfaceC20068gZs.Activity.OLrzqt;
        } else {
            interfaceC20068gZs = InterfaceC20068gZs.TaskDescription.OLrzqt;
        }
        mutableStateFlow.setValue(interfaceC20068gZs);
        this.gEmmrt = "";
        this.isConnected.clear();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyOpenOrderViewModel$loadOpenOrders$1(this, null), 3, null);
    }

    public final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyOpenOrderViewModel$loadMoreOpenOrders$1(this, null), 3, null);
    }

    public final void gEmmrt() {
        InterfaceC19701gMc interfaceC19701gMc = this.AuCTel;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
        this.AuCTel = this.fARcdN.EZpvd(new Function1() { // from class: o.gYB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return StrategyOpenOrderViewModel.copydefault(this.KWHzl, (TeeWsOriginData) obj);
            }
        });
    }

    public static final Unit copydefault(StrategyOpenOrderViewModel strategyOpenOrderViewModel, TeeWsOriginData teeWsOriginData) {
        Intrinsics.checkNotNullParameter(teeWsOriginData, "");
        if (yDV.valueOf(new TeeWsOriginData.EventType[]{TeeWsOriginData.EventType.OpenOrderCreated, TeeWsOriginData.EventType.OpenOrderStatusChanged}, teeWsOriginData.getType())) {
            TeeWsData teeWsData = teeWsOriginData.getTeeWsData();
            if (Intrinsics.EZpvd((Object) (teeWsData != null ? teeWsData.getStrategyId() : null), (Object) strategyOpenOrderViewModel.AkhnZx)) {
                strategyOpenOrderViewModel.EZpvd(false);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        InterfaceC19701gMc interfaceC19701gMc = this.AuCTel;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
    }

    public final void KWHzl(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyOpenOrderViewModel$cancelOrders$1(this, list, null), 3, null);
    }

    public final ReminderType KWHzl() {
        List<Object> listEZpvd;
        Long lOLrzqt;
        if (this.AYXKKw) {
            return ReminderType.None;
        }
        if (yDV.valueOf(new InterfaceC20068gZs[]{InterfaceC20068gZs.TaskDescription.OLrzqt, InterfaceC20068gZs.Fragment.KWHzl, InterfaceC20068gZs.Activity.OLrzqt}, this.copydefault.getValue())) {
            return ReminderType.Keep;
        }
        if (OLrzqt() == null) {
            return ReminderType.None;
        }
        if (!this.DbNXlk.copydefault()) {
            return ReminderType.NeedUpgradeSaVersion;
        }
        if (!this.DbNXlk.gEmmrt()) {
            InterfaceC20068gZs.StateListAnimator stateListAnimatorOLrzqt = OLrzqt();
            long jLongValue = 0;
            if (stateListAnimatorOLrzqt != null && (listEZpvd = stateListAnimatorOLrzqt.EZpvd()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listEZpvd) {
                    if (obj instanceof C20064gZo) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object next = it.next();
                if (it.hasNext()) {
                    Long lOLrzqt2 = ((C20064gZo) next).OLrzqt();
                    long jLongValue2 = lOLrzqt2 != null ? lOLrzqt2.longValue() : 0L;
                    do {
                        Object next2 = it.next();
                        Long lOLrzqt3 = ((C20064gZo) next2).OLrzqt();
                        long jLongValue3 = lOLrzqt3 != null ? lOLrzqt3.longValue() : 0L;
                        if (jLongValue2 < jLongValue3) {
                            next = next2;
                            jLongValue2 = jLongValue3;
                        }
                    } while (it.hasNext());
                }
                C20064gZo c20064gZo = (C20064gZo) next;
                if (c20064gZo != null && (lOLrzqt = c20064gZo.OLrzqt()) != null) {
                    jLongValue = lOLrzqt.longValue();
                }
            }
            if (jLongValue > this.DbNXlk.EZpvd()) {
                return ReminderType.NeedRenewal;
            }
        }
        return ReminderType.None;
    }

    public final void copydefault(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyOpenOrderViewModel$reactivateOrders$1(this, list, null), 3, null);
    }
}
