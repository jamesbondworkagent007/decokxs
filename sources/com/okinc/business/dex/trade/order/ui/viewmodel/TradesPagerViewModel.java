package com.okinc.business.dex.trade.order.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.WsMarketOrderInfo;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dex.trade.order.ui.viewmodel.TradesPagerViewModel;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState;
import com.okinc.business.trade.features.home.domain.model.ChainBizType;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19702gMd;
import o.C20004gXi;
import o.C33129mqd;
import o.InterfaceC19701gMc;
import o.InterfaceC20068gZs;
import o.gZE;
import o.kUH;
import o.yCM;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class TradesPagerViewModel extends AbstractC33073mpa {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final kUH AEQbTJ;
    public final StateFlow<InterfaceC20068gZs> AYXKKw;
    public InterfaceC19701gMc AhwBna;
    public DefiChainInfo AkhnZx;
    public final C19702gMd DbNXlk;
    public String EZpvd;
    public final MutableStateFlow<InterfaceC20068gZs> OLrzqt;
    public final C20004gXi copydefault;
    public InterfaceC19701gMc djBIcL;
    public final gZE gEmmrt;
    public OrderSubStatus valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC20068gZs> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiChainInfo EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderSubStatus copydefault() {
        return this.valueOf;
    }

    @yCM
    public TradesPagerViewModel(@NotNull kUH kuh, @NotNull gZE gze, @NotNull C19702gMd c19702gMd, @NotNull C20004gXi c20004gXi) {
        Intrinsics.checkNotNullParameter(kuh, "");
        Intrinsics.checkNotNullParameter(gze, "");
        Intrinsics.checkNotNullParameter(c19702gMd, "");
        Intrinsics.checkNotNullParameter(c20004gXi, "");
        this.AEQbTJ = kuh;
        this.gEmmrt = gze;
        this.DbNXlk = c19702gMd;
        this.copydefault = c20004gXi;
        MutableStateFlow<InterfaceC20068gZs> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC20068gZs.TaskDescription.OLrzqt);
        this.OLrzqt = MutableStateFlow;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow);
        this.EZpvd = "";
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.ui.viewmodel.TradesPagerViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void djBIcL() {
        this.AhwBna = this.DbNXlk.EZpvd(new Function1() { // from class: o.hbF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TradesPagerViewModel.copydefault(this.AEQbTJ, (TeeWsOriginData) obj);
            }
        });
        this.djBIcL = this.DbNXlk.copydefault(new Function1() { // from class: o.hbE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TradesPagerViewModel.OLrzqt(this.copydefault, (WsMarketOrderInfo) obj);
            }
        });
    }

    public static final Unit copydefault(TradesPagerViewModel tradesPagerViewModel, TeeWsOriginData teeWsOriginData) {
        Intrinsics.checkNotNullParameter(teeWsOriginData, "");
        if (teeWsOriginData.getType() == TeeWsOriginData.EventType.OpenOrderStatusChanged) {
            OrderSubStatus[] orderSubStatusArr = {OrderSubStatus.Completed, OrderSubStatus.Failed};
            OrderSubStatus.Activity activity = OrderSubStatus.Companion;
            TeeWsData teeWsData = teeWsOriginData.getTeeWsData();
            if (yDV.valueOf(orderSubStatusArr, activity.KWHzl(C33129mqd.AhwBna(teeWsData != null ? Integer.valueOf(teeWsData.getStatus()) : null)))) {
                tradesPagerViewModel.KWHzl(false);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(TradesPagerViewModel tradesPagerViewModel, WsMarketOrderInfo wsMarketOrderInfo) {
        String status;
        Intrinsics.checkNotNullParameter(wsMarketOrderInfo, "");
        TradeState tradeState = wsMarketOrderInfo.getTradeState();
        if (tradeState == null || (status = tradeState.getStatus()) == null) {
            return Unit.INSTANCE;
        }
        if (yDV.valueOf(new OrderSubStatus[]{OrderSubStatus.Completed, OrderSubStatus.Failed}, OrderSubStatus.Companion.KWHzl(Integer.parseInt(status)))) {
            tradesPagerViewModel.KWHzl(false);
        }
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        InterfaceC19701gMc interfaceC19701gMc = this.AhwBna;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
        this.AhwBna = null;
        InterfaceC19701gMc interfaceC19701gMc2 = this.djBIcL;
        if (interfaceC19701gMc2 != null) {
            interfaceC19701gMc2.KWHzl();
        }
        this.djBIcL = null;
    }

    public final void copydefault(String str) {
        Object next;
        DefiChainInfo defiChainInfo = this.AkhnZx;
        if (Intrinsics.EZpvd((Object) (defiChainInfo != null ? defiChainInfo.getChainId() : null), (Object) str)) {
            return;
        }
        Iterator<T> it = this.AEQbTJ.AEQbTJ(ChainBizType.Single).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((DefiChainInfo) next).getChainId(), (Object) str)) {
                    break;
                }
            }
        }
        this.AkhnZx = (DefiChainInfo) next;
        loadOrderList$default(this, false, 1, null);
    }

    public final void OLrzqt(OrderSubStatus orderSubStatus) {
        this.valueOf = orderSubStatus;
        loadOrderList$default(this, false, 1, null);
    }

    public static /* synthetic */ void loadOrderList$default(TradesPagerViewModel tradesPagerViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        tradesPagerViewModel.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        InterfaceC20068gZs interfaceC20068gZs;
        MutableStateFlow<InterfaceC20068gZs> mutableStateFlow = this.OLrzqt;
        if (z) {
            interfaceC20068gZs = InterfaceC20068gZs.Activity.OLrzqt;
        } else {
            interfaceC20068gZs = InterfaceC20068gZs.TaskDescription.OLrzqt;
        }
        mutableStateFlow.setValue(interfaceC20068gZs);
        this.EZpvd = "";
        KWHzl();
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TradesPagerViewModel$loadList$1(this, null), 3, null);
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TradesPagerViewModel$loadMoreList$1(this, null), 3, null);
    }
}
