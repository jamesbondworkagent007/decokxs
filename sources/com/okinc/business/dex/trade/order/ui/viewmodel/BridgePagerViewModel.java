package com.okinc.business.dex.trade.order.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.tee.common.ws.data.domain.model.WsMarketOrderInfo;
import com.okinc.business.dex.trade.order.domain.model.BridgeOrderSubStatus;
import com.okinc.business.dex.trade.order.ui.viewmodel.BridgePagerViewModel;
import com.okinc.business.dexlogic.bean.DefiBridgeOrderInfo;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState;
import com.okinc.business.trade.features.home.domain.model.ChainBizType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19702gMd;
import o.C33129mqd;
import o.InterfaceC19701gMc;
import o.InterfaceC20068gZs;
import o.gZC;
import o.kUH;
import o.pTA;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class BridgePagerViewModel extends AbstractC33073mpa {
    public final StateFlow<InterfaceC20068gZs> AEQbTJ;
    public DefiChainInfo AYXKKw;
    public InterfaceC19701gMc AhwBna;
    public String EZpvd;
    public final gZC KWHzl;
    public final kUH OLrzqt;
    public final MutableStateFlow<InterfaceC20068gZs> copydefault;
    public BridgeOrderSubStatus djBIcL;
    public final C19702gMd valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC20068gZs> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BridgeOrderSubStatus OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiChainInfo copydefault() {
        return this.AYXKKw;
    }

    @yCM
    public BridgePagerViewModel(@NotNull kUH kuh, @NotNull gZC gzc, @NotNull C19702gMd c19702gMd) {
        Intrinsics.checkNotNullParameter(kuh, "");
        Intrinsics.checkNotNullParameter(gzc, "");
        Intrinsics.checkNotNullParameter(c19702gMd, "");
        this.OLrzqt = kuh;
        this.KWHzl = gzc;
        this.valueOf = c19702gMd;
        this.EZpvd = "";
        MutableStateFlow<InterfaceC20068gZs> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC20068gZs.TaskDescription.OLrzqt);
        this.copydefault = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void valueOf() {
        this.AhwBna = this.valueOf.copydefault(new Function1() { // from class: o.hbu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BridgePagerViewModel.AEQbTJ(this.EZpvd, (WsMarketOrderInfo) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(BridgePagerViewModel bridgePagerViewModel, WsMarketOrderInfo wsMarketOrderInfo) {
        Intrinsics.checkNotNullParameter(wsMarketOrderInfo, "");
        TradeState tradeState = wsMarketOrderInfo.getTradeState();
        if (Intrinsics.EZpvd((Object) (tradeState != null ? tradeState.getSwapTradeType() : null), (Object) "2")) {
            bridgePagerViewModel.KWHzl(false);
        } else {
            TradeState tradeState2 = wsMarketOrderInfo.getTradeState();
            if (Intrinsics.EZpvd((Object) (tradeState2 != null ? tradeState2.getSwapTradeType() : null), (Object) "3")) {
            }
        }
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        InterfaceC19701gMc interfaceC19701gMc = this.AhwBna;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
        this.AhwBna = null;
    }

    public final void OLrzqt(String str) {
        Object next;
        DefiChainInfo defiChainInfo = this.AYXKKw;
        if (Intrinsics.EZpvd((Object) (defiChainInfo != null ? defiChainInfo.getChainId() : null), (Object) str)) {
            return;
        }
        Iterator<T> it = this.OLrzqt.AEQbTJ(ChainBizType.Bridge).iterator();
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
        this.AYXKKw = (DefiChainInfo) next;
        loadOrderList$default(this, false, 1, null);
    }

    public final void OLrzqt(BridgeOrderSubStatus bridgeOrderSubStatus) {
        this.djBIcL = bridgeOrderSubStatus;
        loadOrderList$default(this, false, 1, null);
    }

    public static /* synthetic */ void loadOrderList$default(BridgePagerViewModel bridgePagerViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        bridgePagerViewModel.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        InterfaceC20068gZs interfaceC20068gZs;
        MutableStateFlow<InterfaceC20068gZs> mutableStateFlow = this.copydefault;
        if (z) {
            interfaceC20068gZs = InterfaceC20068gZs.Activity.OLrzqt;
        } else {
            interfaceC20068gZs = InterfaceC20068gZs.TaskDescription.OLrzqt;
        }
        mutableStateFlow.setValue(interfaceC20068gZs);
        EZpvd();
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BridgePagerViewModel$loadList$1(this, null), 3, null);
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BridgePagerViewModel$loadMoreList$1(this, null), 3, null);
    }

    public final List<DefiBridgeOrderInfo> OLrzqt(@NotNull List<DefiBridgeOrderInfo> list) {
        int i;
        Intrinsics.checkNotNullParameter(list, "");
        List<DefiBridgeOrderInfo> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String strEZpvd = EZpvd(((DefiBridgeOrderInfo) obj).getTime());
            Object arrayList = linkedHashMap.get(strEZpvd);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strEZpvd, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            if (!linkedHashSet.contains(str)) {
                linkedHashSet.add(str);
                Iterator<DefiBridgeOrderInfo> it = listFJNWhG.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (Intrinsics.EZpvd((Object) it.next().getOrderId(), (Object) ((DefiBridgeOrderInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)).getOrderId())) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                if (i != -1) {
                    listFJNWhG.set(i, DefiBridgeOrderInfo.copy$default((DefiBridgeOrderInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(list2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, false, null, null, null, 0L, null, false, false, false, null, null, null, -2097153, 3, null));
                }
            }
        }
        return listFJNWhG;
    }

    public final String EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(str)), null, 1, null);
    }
}
