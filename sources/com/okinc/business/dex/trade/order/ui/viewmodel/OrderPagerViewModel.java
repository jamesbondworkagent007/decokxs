package com.okinc.business.dex.trade.order.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.WsMarketOrderInfo;
import com.okinc.business.dex.trade.component.orderandposition.openorder.domain.model.ReminderType;
import com.okinc.business.dex.trade.order.domain.model.OrderFilterStrategyType;
import com.okinc.business.dex.trade.order.domain.model.OrderStatus;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dex.trade.order.ui.viewmodel.OrderPagerViewModel;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import o.C19818gQl;
import o.C20004gXi;
import o.C20064gZo;
import o.C20069gZt;
import o.C20075gZz;
import o.C25389ivm;
import o.C32866mlf;
import o.C56424yEw;
import o.InterfaceC19701gMc;
import o.InterfaceC20068gZs;
import o.gZA;
import o.gZB;
import o.gZH;
import o.kUH;
import o.yCM;
import o.yDV;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderPagerViewModel extends AbstractC33073mpa {
    public final C20004gXi AYXKKw;
    public final gZA AhwBna;
    public final gZB AkhnZx;
    public OrderStatus AuCTel;
    public final C19702gMd AuCTelauCTel;
    public C19818gQl AubY;
    public final kUH DbNXlk;
    public final MutableSharedFlow<Pair<Boolean, List<String>>> EZpvd;
    public final MutableStateFlow<InterfaceC20068gZs> KWHzl;
    public final MutableStateFlow<Boolean> OLrzqt;
    public final MutableSharedFlow<Pair<Boolean, List<String>>> copydefault;
    public String djBIcL;
    public final StateFlow<InterfaceC20068gZs> ejfBZ;
    public InterfaceC19701gMc fARcdN;
    public OrderSubStatus fIwbmz;
    public OrderFilterStrategyType fJNWhG;
    public final C20075gZz fetchVPNInfo;
    public boolean gEmmrt;
    public final SharedFlow<Pair<Boolean, List<String>>> getFieldNames;
    public List<DexMultiTokenInfoBean> getNewProxyInstance;
    public final gZH hDKMBd;
    public InterfaceC19701gMc isConnected;
    public DefiChainInfo iwGUEr;
    public final C19700gMb uzCIH;
    public final SharedFlow<Pair<Boolean, List<String>>> valueOf;
    public boolean values;
    public final StateFlow<Boolean> zsXlph;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderFilterStrategyType.values().length];
            try {
                iArr[OrderFilterStrategyType.Market.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderFilterStrategyType.CoptTrading.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderFilterStrategyType.Limit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[OrderStatus.values().length];
            try {
                iArr2[OrderStatus.OpenOrders.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OrderStatus.History.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(DefiChainInfo defiChainInfo) {
        this.iwGUEr = defiChainInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderSubStatus AYXKKw() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<InterfaceC20068gZs> DbNXlk() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderFilterStrategyType EZpvd() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Pair<Boolean, List<String>>> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC20068gZs> OLrzqt() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderStatus copydefault() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull OrderStatus orderStatus, boolean z, C19818gQl c19818gQl) {
        Intrinsics.checkNotNullParameter(orderStatus, "");
        this.AuCTel = orderStatus;
        this.gEmmrt = z;
        this.AubY = c19818gQl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiChainInfo gEmmrt() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return (this.fJNWhG == null && this.fIwbmz == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Pair<Boolean, List<String>>> valueOf() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> values() {
        return this.zsXlph;
    }

    @yCM
    public OrderPagerViewModel(@NotNull kUH kuh, @NotNull C19700gMb c19700gMb, @NotNull C20075gZz c20075gZz, @NotNull gZB gzb, @NotNull gZA gza, @NotNull gZH gzh, @NotNull C19702gMd c19702gMd, @NotNull C20004gXi c20004gXi) {
        Intrinsics.checkNotNullParameter(kuh, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c20075gZz, "");
        Intrinsics.checkNotNullParameter(gzb, "");
        Intrinsics.checkNotNullParameter(gza, "");
        Intrinsics.checkNotNullParameter(gzh, "");
        Intrinsics.checkNotNullParameter(c19702gMd, "");
        Intrinsics.checkNotNullParameter(c20004gXi, "");
        this.DbNXlk = kuh;
        this.uzCIH = c19700gMb;
        this.fetchVPNInfo = c20075gZz;
        this.AkhnZx = gzb;
        this.AhwBna = gza;
        this.hDKMBd = gzh;
        this.AuCTelauCTel = c19702gMd;
        this.AYXKKw = c20004gXi;
        this.gEmmrt = true;
        this.AuCTel = OrderStatus.OpenOrders;
        MutableStateFlow<InterfaceC20068gZs> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC20068gZs.TaskDescription.OLrzqt);
        this.KWHzl = MutableStateFlow;
        this.ejfBZ = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.OLrzqt = MutableStateFlow2;
        this.zsXlph = FlowKt.asStateFlow(MutableStateFlow2);
        MutableSharedFlow<Pair<Boolean, List<String>>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Pair<Boolean, List<String>>> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default2;
        this.getFieldNames = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        this.djBIcL = "";
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.ui.viewmodel.OrderPagerViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC20068gZs.StateListAnimator uzCIH() {
        InterfaceC20068gZs value = this.KWHzl.getValue();
        if (value instanceof InterfaceC20068gZs.StateListAnimator) {
            return (InterfaceC20068gZs.StateListAnimator) value;
        }
        return null;
    }

    public static /* synthetic */ void init$default(OrderPagerViewModel orderPagerViewModel, OrderStatus orderStatus, boolean z, C19818gQl c19818gQl, int i, Object obj) {
        if ((i & 4) != 0) {
            c19818gQl = null;
        }
        orderPagerViewModel.copydefault(orderStatus, z, c19818gQl);
    }

    public final void AuCTel() {
        this.isConnected = this.AuCTelauCTel.EZpvd(new Function1() { // from class: o.hbz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OrderPagerViewModel.EZpvd(this.KWHzl, (TeeWsOriginData) obj);
            }
        });
        this.fARcdN = this.AuCTelauCTel.copydefault(new Function1() { // from class: o.hbG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OrderPagerViewModel.KWHzl(this.copydefault, (WsMarketOrderInfo) obj);
            }
        });
    }

    public static final Unit EZpvd(OrderPagerViewModel orderPagerViewModel, TeeWsOriginData teeWsOriginData) {
        Intrinsics.checkNotNullParameter(teeWsOriginData, "");
        orderPagerViewModel.EZpvd(false);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(OrderPagerViewModel orderPagerViewModel, WsMarketOrderInfo wsMarketOrderInfo) {
        Intrinsics.checkNotNullParameter(wsMarketOrderInfo, "");
        orderPagerViewModel.EZpvd(false);
        return Unit.INSTANCE;
    }

    public final void iwGUEr() {
        InterfaceC19701gMc interfaceC19701gMc = this.isConnected;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
        this.isConnected = null;
        InterfaceC19701gMc interfaceC19701gMc2 = this.fARcdN;
        if (interfaceC19701gMc2 != null) {
            interfaceC19701gMc2.KWHzl();
        }
        this.fARcdN = null;
    }

    public final void EZpvd(List<DexMultiTokenInfoBean> list) {
        if (Intrinsics.EZpvd(this.getNewProxyInstance, list)) {
            return;
        }
        this.getNewProxyInstance = list != null ? CollectionsKt___CollectionsKt.QfsBiF(list) : null;
        loadOrderList$default(this, false, 1, null);
    }

    public final void KWHzl(String str) {
        DefiChainInfo defiChainInfo = this.iwGUEr;
        if (Intrinsics.EZpvd((Object) (defiChainInfo != null ? defiChainInfo.getChainId() : null), (Object) str)) {
            return;
        }
        this.OLrzqt.setValue(Boolean.FALSE);
        if (str == null || str.length() == 0 || Intrinsics.EZpvd((Object) str, (Object) MultiTransferSignData.DEFAULT_INTERVAL) || Intrinsics.EZpvd((Object) str, (Object) "-9223372036854775808")) {
            this.iwGUEr = null;
            loadOrderList$default(this, false, 1, null);
        } else {
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new OrderPagerViewModel$updateSelectedChain$1(this, str, null), 3, null);
        }
    }

    public final void OLrzqt(@NotNull OrderStatus orderStatus) {
        Intrinsics.checkNotNullParameter(orderStatus, "");
        this.AuCTel = orderStatus;
        this.values = false;
        if (!CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends OrderSubStatus>) ((Iterable<? extends Object>) djBIcL()), this.fIwbmz)) {
            this.fIwbmz = null;
        }
        loadOrderList$default(this, false, 1, null);
    }

    public final void copydefault(OrderFilterStrategyType orderFilterStrategyType) {
        this.fJNWhG = orderFilterStrategyType;
        if (!CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends OrderSubStatus>) ((Iterable<? extends Object>) djBIcL()), this.fIwbmz)) {
            this.fIwbmz = null;
        }
        loadOrderList$default(this, false, 1, null);
    }

    public final void OLrzqt(OrderSubStatus orderSubStatus) {
        this.fIwbmz = orderSubStatus;
        loadOrderList$default(this, false, 1, null);
    }

    public final List<OrderSubStatus> djBIcL() {
        int i = StateListAnimator.OLrzqt[this.AuCTel.ordinal()];
        if (i == 1) {
            OrderFilterStrategyType orderFilterStrategyType = this.fJNWhG;
            int i2 = orderFilterStrategyType == null ? -1 : StateListAnimator.KWHzl[orderFilterStrategyType.ordinal()];
            if (i2 == -1) {
                return AEQbTJ();
            }
            if (i2 == 1 || i2 == 2) {
                return yDY.gEmmrt(OrderSubStatus.Pending, OrderSubStatus.Cancelling, OrderSubStatus.Suspended);
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return yDY.gEmmrt(OrderSubStatus.Creating, OrderSubStatus.Open, OrderSubStatus.Pending, OrderSubStatus.Cancelling, OrderSubStatus.Suspended);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        OrderFilterStrategyType orderFilterStrategyType2 = this.fJNWhG;
        int i3 = orderFilterStrategyType2 == null ? -1 : StateListAnimator.KWHzl[orderFilterStrategyType2.ordinal()];
        if (i3 == -1) {
            return AEQbTJ();
        }
        if (i3 == 1 || i3 == 2) {
            return yDY.gEmmrt(OrderSubStatus.Completed, OrderSubStatus.Cancelled, OrderSubStatus.Failed);
        }
        if (i3 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return yDY.gEmmrt(OrderSubStatus.Completed, OrderSubStatus.Cancelled, OrderSubStatus.Failed, OrderSubStatus.Expired);
    }

    public final List<OrderSubStatus> AEQbTJ() {
        int i = StateListAnimator.OLrzqt[this.AuCTel.ordinal()];
        if (i == 1) {
            return yDY.gEmmrt(OrderSubStatus.Creating, OrderSubStatus.Open, OrderSubStatus.Pending, OrderSubStatus.Cancelling, OrderSubStatus.Suspended);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return yDY.gEmmrt(OrderSubStatus.Completed, OrderSubStatus.Cancelled, OrderSubStatus.Failed, OrderSubStatus.Expired);
    }

    public static /* synthetic */ void loadOrderList$default(OrderPagerViewModel orderPagerViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        orderPagerViewModel.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        InterfaceC20068gZs interfaceC20068gZs;
        MutableStateFlow<InterfaceC20068gZs> mutableStateFlow = this.KWHzl;
        if (z) {
            interfaceC20068gZs = InterfaceC20068gZs.Activity.OLrzqt;
        } else {
            interfaceC20068gZs = InterfaceC20068gZs.TaskDescription.OLrzqt;
        }
        mutableStateFlow.setValue(interfaceC20068gZs);
        this.djBIcL = "";
        if (this.AuCTel == OrderStatus.History) {
            getNewProxyInstance();
            fetchVPNInfo();
        } else {
            getNewProxyInstance();
            fJNWhG();
        }
    }

    public final void fARcdN() {
        if (this.AuCTel == OrderStatus.History) {
            AkhnZx();
        } else {
            fIwbmz();
        }
    }

    public final void AkhnZx() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OrderPagerViewModel$loadMoreHistoryOrderList$1(this, null), 3, null);
    }

    public final void fIwbmz() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OrderPagerViewModel$loadMoreOpenOrderList$1(this, null), 3, null);
    }

    public final void fJNWhG() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OrderPagerViewModel$loadOpenOrderList$1(this, null), 3, null);
    }

    public final void fetchVPNInfo() {
        if (!this.OLrzqt.getValue().booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OrderPagerViewModel$loadHistoryOrderList$1(this, null), 3, null);
        } else {
            this.KWHzl.setValue(new InterfaceC20068gZs.ActionBar(false));
        }
    }

    public final void OLrzqt(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OrderPagerViewModel$cancelOrders$1(this, list, null), 3, null);
    }

    public final void copydefault(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OrderPagerViewModel$reactivateOrders$1(this, list, null), 3, null);
    }

    public final void EZpvd(List<? extends Object> list, boolean z) {
        this.KWHzl.setValue(new InterfaceC20068gZs.StateListAnimator(list, z, C20069gZt.Companion.AEQbTJ(this.uzCIH.AYXKKw(), list, this.gEmmrt, this.AubY)));
    }

    public final String EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.uzCIH.KWHzl(str);
    }

    public final void getNewProxyInstance() {
        if (this.values) {
            return;
        }
        this.values = true;
        ejfBZ();
    }

    public final void hDKMBd() {
        if (this.values) {
            ejfBZ();
        }
    }

    public final void ejfBZ() {
        if (this.gEmmrt) {
            return;
        }
        if (this.AuCTel == OrderStatus.OpenOrders) {
            OLrzqt("orders_open");
        } else {
            OLrzqt("orders_history");
        }
    }

    public final void OLrzqt(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("DEXTrade_Txhistory_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.hbD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OrderPagerViewModel.EZpvd(this.EZpvd, str, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit EZpvd(OrderPagerViewModel orderPagerViewModel, String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", orderPagerViewModel.uzCIH.AYXKKw() ? "yes" : "no", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", str, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.trade.order.ui.viewmodel.OrderPagerViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackClick$default(OrderPagerViewModel orderPagerViewModel, String str, String str2, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            map = C56424yEw.KWHzl();
        }
        orderPagerViewModel.KWHzl(str, str2, map);
    }

    public final void KWHzl(@NotNull final String str, @NotNull final String str2, @NotNull final Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (this.gEmmrt) {
            return;
        }
        C32866mlf.onEvent$default("DEXTrade_Txhistory_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.hbA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OrderPagerViewModel.KWHzl(this.copydefault, str, str2, map, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit KWHzl(OrderPagerViewModel orderPagerViewModel, String str, String str2, Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", orderPagerViewModel.uzCIH.AYXKKw() ? "yes" : "no", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        if (str2.length() == 0) {
            EventParamsList.put$default(eventParamsList, "page_name", orderPagerViewModel.AuCTel == OrderStatus.OpenOrders ? "orders_open" : "orders_history", false, 4, null);
        } else {
            EventParamsList.put$default(eventParamsList, "page_name", str2, false, 4, null);
        }
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final ReminderType AhwBna() {
        List<Object> listEZpvd;
        Long lOLrzqt;
        if (this.AuCTel == OrderStatus.History) {
            return ReminderType.None;
        }
        if (yDV.valueOf(new InterfaceC20068gZs[]{InterfaceC20068gZs.TaskDescription.OLrzqt, InterfaceC20068gZs.Activity.OLrzqt, InterfaceC20068gZs.Fragment.KWHzl}, this.KWHzl.getValue())) {
            return ReminderType.Keep;
        }
        if (uzCIH() == null) {
            return ReminderType.None;
        }
        if (!this.uzCIH.copydefault()) {
            return ReminderType.NeedUpgradeSaVersion;
        }
        if (!this.uzCIH.gEmmrt()) {
            InterfaceC20068gZs.StateListAnimator stateListAnimatorUzCIH = uzCIH();
            long jLongValue = 0;
            if (stateListAnimatorUzCIH != null && (listEZpvd = stateListAnimatorUzCIH.EZpvd()) != null) {
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
            if (jLongValue > this.uzCIH.EZpvd()) {
                return ReminderType.NeedRenewal;
            }
        }
        return ReminderType.None;
    }

    public final void OLrzqt(OrderFilterStrategyType orderFilterStrategyType, OrderSubStatus orderSubStatus) {
        this.fJNWhG = orderFilterStrategyType;
        this.fIwbmz = orderSubStatus;
        loadOrderList$default(this, false, 1, null);
    }
}
