package com.okinc.find_ui.ranking.stock.viewmodel;

import com.okinc.find_ui.ranking.stock.viewmodel.MarketHomeStockContainerViewModel;
import com.okinc.market.quotation.data.model.stock.StockListPo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC35137npe;
import o.AbstractC49408unw;
import o.AbstractC49411unz;
import o.C35064noK;
import o.C35065noL;
import o.C35066noM;
import o.C35067noN;
import o.C35069noP;
import o.C40426qVk;
import o.C40427qVl;
import o.C40430qVo;
import o.C41608qty;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC40516qYt;
import o.InterfaceC49371unL;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.pUU;
import o.pWO;
import o.xNE;
import o.yCM;
import o.yDY;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeStockContainerViewModel extends AbstractC49411unz<StateListAnimator> {
    public final MutableStateFlow<StateListAnimator> AEQbTJ;
    public final C41608qty AYXKKw;
    public final InterfaceC54577xNn AhwBna;
    public final C35066noM EZpvd;
    public final C40430qVo KWHzl;
    public Job OLrzqt;
    public final C35064noK copydefault;
    public final C40427qVl djBIcL;
    public Job valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public MarketHomeStockContainerViewModel(@NotNull C35064noK c35064noK, @NotNull C41608qty c41608qty, @NotNull C35066noM c35066noM, @NotNull C40430qVo c40430qVo, @NotNull C40427qVl c40427qVl, InterfaceC54577xNn interfaceC54577xNn) {
        super(new StateListAnimator(null, null, null, null, null, null, null, 127, null));
        Intrinsics.checkNotNullParameter(c35064noK, "");
        Intrinsics.checkNotNullParameter(c41608qty, "");
        Intrinsics.checkNotNullParameter(c35066noM, "");
        Intrinsics.checkNotNullParameter(c40430qVo, "");
        Intrinsics.checkNotNullParameter(c40427qVl, "");
        this.copydefault = c35064noK;
        this.AYXKKw = c41608qty;
        this.EZpvd = c35066noM;
        this.KWHzl = c40430qVo;
        this.djBIcL = c40427qVl;
        this.AhwBna = interfaceC54577xNn;
        this.AEQbTJ = StateFlowKt.MutableStateFlow(new StateListAnimator(null, null, null, null, null, null, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0));
    }

    public static final class StateListAnimator extends AbstractC49408unw<StateListAnimator> {
        public final Map<String, TickersData> AEQbTJ;
        public final InterfaceC49371unL<List<InterfaceC40516qYt>> AYXKKw;
        public final StockListPo EZpvd;
        public final InterfaceC49371unL<AbstractC35137npe> KWHzl;
        public final InterfaceC49371unL<List<InterfaceC40516qYt>> OLrzqt;
        public final List<C35069noP> copydefault;
        public final List<C35069noP> gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.find_ui.ranking.stock.viewmodel.MarketHomeStockContainerViewModel$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, InterfaceC49371unL interfaceC49371unL3, Map map, List list, List list2, StockListPo stockListPo, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC49371unL = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                interfaceC49371unL2 = stateListAnimator.AYXKKw;
            }
            InterfaceC49371unL interfaceC49371unL4 = interfaceC49371unL2;
            if ((i & 4) != 0) {
                interfaceC49371unL3 = stateListAnimator.OLrzqt;
            }
            InterfaceC49371unL interfaceC49371unL5 = interfaceC49371unL3;
            if ((i & 8) != 0) {
                map = stateListAnimator.AEQbTJ;
            }
            Map map2 = map;
            if ((i & 16) != 0) {
                list = stateListAnimator.gEmmrt;
            }
            List list3 = list;
            if ((i & 32) != 0) {
                list2 = stateListAnimator.copydefault;
            }
            List list4 = list2;
            if ((i & 64) != 0) {
                stockListPo = stateListAnimator.EZpvd;
            }
            return stateListAnimator.OLrzqt(interfaceC49371unL, interfaceC49371unL4, interfaceC49371unL5, map2, list3, list4, stockListPo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StockListPo AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC49371unL<AbstractC35137npe> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, TickersData> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull InterfaceC49371unL<? extends AbstractC35137npe> interfaceC49371unL, @NotNull InterfaceC49371unL<? extends List<? extends InterfaceC40516qYt>> interfaceC49371unL2, @NotNull InterfaceC49371unL<? extends List<? extends InterfaceC40516qYt>> interfaceC49371unL3, Map<String, TickersData> map, List<C35069noP> list, List<C35069noP> list2, StockListPo stockListPo) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL3, "");
            return new StateListAnimator(interfaceC49371unL, interfaceC49371unL2, interfaceC49371unL3, map, list, list2, stockListPo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC49371unL<List<InterfaceC40516qYt>> OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<C35069noP> copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.AYXKKw, stateListAnimator.AYXKKw) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && Intrinsics.EZpvd(this.gEmmrt, stateListAnimator.gEmmrt) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<C35069noP> gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.AYXKKw.hashCode();
            int iHashCode3 = this.OLrzqt.hashCode();
            Map<String, TickersData> map = this.AEQbTJ;
            int iHashCode4 = map == null ? 0 : map.hashCode();
            List<C35069noP> list = this.gEmmrt;
            int iHashCode5 = list == null ? 0 : list.hashCode();
            List<C35069noP> list2 = this.copydefault;
            int iHashCode6 = list2 == null ? 0 : list2.hashCode();
            StockListPo stockListPo = this.EZpvd;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (stockListPo != null ? stockListPo.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ContainerUiState(displayMode=" + this.KWHzl + ", spotVoList=" + this.AYXKKw + ", futuresVoList=" + this.OLrzqt + ", cupTickerMap=" + this.AEQbTJ + ", spotRawVoList=" + this.gEmmrt + ", futuresRawVoList=" + this.copydefault + ", latestTickersPo=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC49371unL<List<InterfaceC40516qYt>> valueOf() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0042: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0008: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:92) call: o.unL.ActionBar.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r6v0 o.unL))
  (wrap:o.unL:0x0014: TERNARY null = ((wrap:int:0x000b: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0011: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:93) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 o.unL))
  (wrap:o.unL:0x001e: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x001b: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:94) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r8v0 o.unL))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x001f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r9v0 java.util.Map))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0026: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002d: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
  (wrap:com.okinc.market.quotation.data.model.stock.StockListPo:?: TERNARY null = ((wrap:int:0x0034: ARITH (r13v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r12v0 com.okinc.market.quotation.data.model.stock.StockListPo) : (null com.okinc.market.quotation.data.model.stock.StockListPo))
 A[MD:(o.unL<? extends o.npe>, o.unL<? extends java.util.List<? extends o.qYt>>, o.unL<? extends java.util.List<? extends o.qYt>>, java.util.Map<java.lang.String, com.okinc.unify_trade.biz.subscribe.TickersData>, java.util.List<o.noP>, java.util.List<o.noP>, com.okinc.market.quotation.data.model.stock.StockListPo):void (m)] (LINE:91) call: com.okinc.find_ui.ranking.stock.viewmodel.MarketHomeStockContainerViewModel.StateListAnimator.<init>(o.unL, o.unL, o.unL, java.util.Map, java.util.List, java.util.List, com.okinc.market.quotation.data.model.stock.StockListPo):void type: THIS */
        public /* synthetic */ StateListAnimator(InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, InterfaceC49371unL interfaceC49371unL3, Map map, List list, List list2, StockListPo stockListPo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new InterfaceC49371unL.ActionBar(null, 1, null) : interfaceC49371unL, (i & 2) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL2, (i & 4) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL3, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) == 0 ? stockListPo : null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.unL<? extends o.npe> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.unL<? extends java.util.List<? extends o.qYt>> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.unL<? extends java.util.List<? extends o.qYt>> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull InterfaceC49371unL<? extends AbstractC35137npe> interfaceC49371unL, @NotNull InterfaceC49371unL<? extends List<? extends InterfaceC40516qYt>> interfaceC49371unL2, @NotNull InterfaceC49371unL<? extends List<? extends InterfaceC40516qYt>> interfaceC49371unL3, Map<String, TickersData> map, List<C35069noP> list, List<C35069noP> list2, StockListPo stockListPo) {
            super(new Function1() { // from class: o.noY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketHomeStockContainerViewModel.StateListAnimator.EZpvd((MarketHomeStockContainerViewModel.StateListAnimator) obj);
                }
            });
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL3, "");
            this.KWHzl = interfaceC49371unL;
            this.AYXKKw = interfaceC49371unL2;
            this.OLrzqt = interfaceC49371unL3;
            this.AEQbTJ = map;
            this.gEmmrt = list;
            this.copydefault = list2;
            this.EZpvd = stockListPo;
        }

        public static final StateListAnimator EZpvd(StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            return copy$default(stateListAnimator, null, null, null, null, null, null, null, 127, null);
        }
    }

    public final StateFlow<StateListAnimator> AEQbTJ() {
        return FlowKt.asStateFlow(this.AEQbTJ);
    }

    public static /* synthetic */ Object loadAndSubscribeData$default(MarketHomeStockContainerViewModel marketHomeStockContainerViewModel, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 7;
        }
        return marketHomeStockContainerViewModel.AEQbTJ(i, (Continuation<? super Unit>) continuation);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x005b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x002a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v19, types: [com.okinc.find_ui.ranking.stock.viewmodel.MarketHomeStockContainerViewModel] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.okinc.find_ui.ranking.stock.viewmodel.MarketHomeStockContainerViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(int i, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        MarketHomeStockContainerViewModel$loadAndSubscribeData$1 marketHomeStockContainerViewModel$loadAndSubscribeData$1;
        ?? r10;
        Object objM7377constructorimpl;
        ?? r4;
        Throwable thM7380exceptionOrNullimpl;
        int i2;
        MarketHomeStockContainerViewModel marketHomeStockContainerViewModel;
        ?? r42;
        if (continuation instanceof MarketHomeStockContainerViewModel$loadAndSubscribeData$1) {
            marketHomeStockContainerViewModel$loadAndSubscribeData$1 = (MarketHomeStockContainerViewModel$loadAndSubscribeData$1) continuation;
            int i3 = marketHomeStockContainerViewModel$loadAndSubscribeData$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                marketHomeStockContainerViewModel$loadAndSubscribeData$1.label = i3 - Integer.MIN_VALUE;
            } else {
                marketHomeStockContainerViewModel$loadAndSubscribeData$1 = new MarketHomeStockContainerViewModel$loadAndSubscribeData$1(this, continuation);
            }
        }
        Object objCoroutineScope = marketHomeStockContainerViewModel$loadAndSubscribeData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r43 = marketHomeStockContainerViewModel$loadAndSubscribeData$1.label;
        try {
        } catch (Throwable th) {
            th = th;
            r10 = r43;
        }
        if (r43 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            pUU.KWHzl("MarketHomeStockContainerViewModel", "loadData start");
            copydefault();
            if (!(this.AEQbTJ.getValue().EZpvd() instanceof InterfaceC49371unL.Activity)) {
                MutableStateFlow<StateListAnimator> mutableStateFlow = this.AEQbTJ;
                mutableStateFlow.setValue(StateListAnimator.copy$default(mutableStateFlow.getValue(), new InterfaceC49371unL.ActionBar(null, 1, null), null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
            }
            try {
                Result.Application application = Result.Companion;
                marketHomeStockContainerViewModel$loadAndSubscribeData$1.L$0 = this;
                marketHomeStockContainerViewModel$loadAndSubscribeData$1.L$1 = this;
                i2 = i;
                marketHomeStockContainerViewModel$loadAndSubscribeData$1.I$0 = i2;
                marketHomeStockContainerViewModel$loadAndSubscribeData$1.label = 1;
            } catch (Throwable th2) {
                th = th2;
                r10 = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                r4 = r10;
            }
            if (OLrzqt(marketHomeStockContainerViewModel$loadAndSubscribeData$1) == objCopydefault) {
                return objCopydefault;
            }
            MarketHomeStockContainerViewModel marketHomeStockContainerViewModel2 = this;
            marketHomeStockContainerViewModel = marketHomeStockContainerViewModel2;
            r42 = marketHomeStockContainerViewModel2;
            MarketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$1 marketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$1 = new MarketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$1(null, marketHomeStockContainerViewModel, i2, marketHomeStockContainerViewModel);
            marketHomeStockContainerViewModel$loadAndSubscribeData$1.L$0 = r42;
            marketHomeStockContainerViewModel$loadAndSubscribeData$1.L$1 = null;
            marketHomeStockContainerViewModel$loadAndSubscribeData$1.label = 2;
            objCoroutineScope = CoroutineScopeKt.coroutineScope(marketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$1, marketHomeStockContainerViewModel$loadAndSubscribeData$1);
            r43 = r42;
            if (objCoroutineScope == objCopydefault) {
            }
            Pair pair = (Pair) objCoroutineScope;
            objM7377constructorimpl = Result.m7377constructorimpl(new Triple((Pair) pair.component1(), (Map) pair.component2(), new StockListPo(null, null, 3, null)));
            r4 = r43;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            }
        } else if (r43 == 1) {
            int i4 = marketHomeStockContainerViewModel$loadAndSubscribeData$1.I$0;
            MarketHomeStockContainerViewModel marketHomeStockContainerViewModel3 = (MarketHomeStockContainerViewModel) marketHomeStockContainerViewModel$loadAndSubscribeData$1.L$1;
            r10 = (MarketHomeStockContainerViewModel) marketHomeStockContainerViewModel$loadAndSubscribeData$1.L$0;
            try {
                C56391yDq.AEQbTJ(objCoroutineScope);
                i2 = i4;
                r42 = r10;
                marketHomeStockContainerViewModel = marketHomeStockContainerViewModel3;
                MarketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$1 marketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$12 = new MarketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$1(null, marketHomeStockContainerViewModel, i2, marketHomeStockContainerViewModel);
                marketHomeStockContainerViewModel$loadAndSubscribeData$1.L$0 = r42;
                marketHomeStockContainerViewModel$loadAndSubscribeData$1.L$1 = null;
                marketHomeStockContainerViewModel$loadAndSubscribeData$1.label = 2;
                objCoroutineScope = CoroutineScopeKt.coroutineScope(marketHomeStockContainerViewModel$loadAndSubscribeData$lambda$2$$inlined$executeAsyncTasks$12, marketHomeStockContainerViewModel$loadAndSubscribeData$1);
                r43 = r42;
                if (objCoroutineScope == objCopydefault) {
                    return objCopydefault;
                }
                Pair pair2 = (Pair) objCoroutineScope;
                objM7377constructorimpl = Result.m7377constructorimpl(new Triple((Pair) pair2.component1(), (Map) pair2.component2(), new StockListPo(null, null, 3, null)));
                r4 = r43;
            } catch (Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                r4 = r10;
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            }
        } else if (r43 == 2) {
            MarketHomeStockContainerViewModel marketHomeStockContainerViewModel4 = (MarketHomeStockContainerViewModel) marketHomeStockContainerViewModel$loadAndSubscribeData$1.L$0;
            C56391yDq.AEQbTJ(objCoroutineScope);
            r43 = marketHomeStockContainerViewModel4;
            Pair pair22 = (Pair) objCoroutineScope;
            objM7377constructorimpl = Result.m7377constructorimpl(new Triple((Pair) pair22.component1(), (Map) pair22.component2(), new StockListPo(null, null, 3, null)));
            r4 = r43;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("MarketHomeStockContainerViewModel", "loadData HTTP phase error", thM7380exceptionOrNullimpl);
                if (thM7380exceptionOrNullimpl instanceof CancellationException) {
                    return Unit.INSTANCE;
                }
                MutableStateFlow<StateListAnimator> mutableStateFlow2 = r4.AEQbTJ;
                mutableStateFlow2.setValue(StateListAnimator.copy$default(mutableStateFlow2.getValue(), new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null), new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null), new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null), null, null, null, null, 120, null));
            }
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                Triple triple = (Triple) objM7377constructorimpl;
                Pair pair3 = (Pair) triple.component1();
                Map map = (Map) triple.component2();
                List list = (List) pair3.component1();
                List list2 = (List) pair3.component2();
                pUU.KWHzl("MarketHomeStockContainerViewModel", "loadData HTTP success: spot=" + list.size() + ", futures=" + list2.size() + ", cupTicker=" + map.size());
                List<C35069noP> listKWHzl = r4.KWHzl(r4.KWHzl(list, new StockListPo(null, null, 3, null), "SPOT", map));
                List<C35069noP> listKWHzl2 = r4.KWHzl(r4.KWHzl(list2, new StockListPo(null, null, 3, null), "SWAP", map));
                MutableStateFlow<StateListAnimator> mutableStateFlow3 = r4.AEQbTJ;
                mutableStateFlow3.setValue(StateListAnimator.copy$default(mutableStateFlow3.getValue(), null, listKWHzl.isEmpty() ? new InterfaceC49371unL.TaskDescription(yDY.AhwBna()) : new InterfaceC49371unL.Activity(listKWHzl), listKWHzl2.isEmpty() ? new InterfaceC49371unL.TaskDescription(yDY.AhwBna()) : new InterfaceC49371unL.Activity(listKWHzl2), map, list, list2, new StockListPo(null, null, 3, null), 1, null));
                r4.OLrzqt();
                pUU.KWHzl("MarketHomeStockContainerViewModel", "loadData HTTP completed, starting WS subscriptions...");
                MarketHomeStockContainerViewModel$loadAndSubscribeData$4$1 marketHomeStockContainerViewModel$loadAndSubscribeData$4$1 = new MarketHomeStockContainerViewModel$loadAndSubscribeData$4$1(r4, null);
                marketHomeStockContainerViewModel$loadAndSubscribeData$1.L$0 = objM7377constructorimpl;
                marketHomeStockContainerViewModel$loadAndSubscribeData$1.L$1 = null;
                marketHomeStockContainerViewModel$loadAndSubscribeData$1.label = 3;
                if (SupervisorKt.supervisorScope(marketHomeStockContainerViewModel$loadAndSubscribeData$4$1, marketHomeStockContainerViewModel$loadAndSubscribeData$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (r43 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCoroutineScope);
        }
        pUU.KWHzl("MarketHomeStockContainerViewModel", "loadData end");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(int i, Continuation<? super Pair<? extends List<C35069noP>, ? extends List<C35069noP>>> continuation) throws Throwable {
        MarketHomeStockContainerViewModel$fetchStockRanking$1 marketHomeStockContainerViewModel$fetchStockRanking$1;
        MarketHomeStockContainerViewModel marketHomeStockContainerViewModel;
        int i2;
        List list;
        if (continuation instanceof MarketHomeStockContainerViewModel$fetchStockRanking$1) {
            marketHomeStockContainerViewModel$fetchStockRanking$1 = (MarketHomeStockContainerViewModel$fetchStockRanking$1) continuation;
            int i3 = marketHomeStockContainerViewModel$fetchStockRanking$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                marketHomeStockContainerViewModel$fetchStockRanking$1.label = i3 - Integer.MIN_VALUE;
            } else {
                marketHomeStockContainerViewModel$fetchStockRanking$1 = new MarketHomeStockContainerViewModel$fetchStockRanking$1(this, continuation);
            }
        }
        Object objAEQbTJ = marketHomeStockContainerViewModel$fetchStockRanking$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = marketHomeStockContainerViewModel$fetchStockRanking$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            pUU.KWHzl("MarketHomeStockContainerViewModel", "fetchStockRanking start");
            C35067noN c35067noN = new C35067noN("SPOT", C35069noP.Companion.EZpvd(), C56443yFo.AEQbTJ(i), false, null, 24, null);
            C35064noK c35064noK = this.copydefault;
            marketHomeStockContainerViewModel$fetchStockRanking$1.L$0 = this;
            marketHomeStockContainerViewModel$fetchStockRanking$1.I$0 = i;
            marketHomeStockContainerViewModel$fetchStockRanking$1.label = 1;
            objAEQbTJ = c35064noK.AEQbTJ(c35067noN, marketHomeStockContainerViewModel$fetchStockRanking$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            marketHomeStockContainerViewModel = this;
            i2 = i;
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) marketHomeStockContainerViewModel$fetchStockRanking$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                List list2 = (List) objAEQbTJ;
                pUU.KWHzl("MarketHomeStockContainerViewModel", "fetchStockRanking success: spot=" + list.size() + ", futures=" + list2.size());
                return C56390yDp.OLrzqt(list, list2);
            }
            i2 = marketHomeStockContainerViewModel$fetchStockRanking$1.I$0;
            marketHomeStockContainerViewModel = (MarketHomeStockContainerViewModel) marketHomeStockContainerViewModel$fetchStockRanking$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        List list3 = (List) objAEQbTJ;
        C35067noN c35067noN2 = new C35067noN("SWAP", C35069noP.Companion.EZpvd(), C56443yFo.AEQbTJ(i2), false, null, 24, null);
        C35064noK c35064noK2 = marketHomeStockContainerViewModel.copydefault;
        marketHomeStockContainerViewModel$fetchStockRanking$1.L$0 = list3;
        marketHomeStockContainerViewModel$fetchStockRanking$1.label = 2;
        Object objAEQbTJ2 = c35064noK2.AEQbTJ(c35067noN2, marketHomeStockContainerViewModel$fetchStockRanking$1);
        if (objAEQbTJ2 == objCopydefault) {
            return objCopydefault;
        }
        list = list3;
        objAEQbTJ = objAEQbTJ2;
        List list22 = (List) objAEQbTJ;
        pUU.KWHzl("MarketHomeStockContainerViewModel", "fetchStockRanking success: spot=" + list.size() + ", futures=" + list22.size());
        return C56390yDp.OLrzqt(list, list22);
    }

    public final List<C35069noP> KWHzl(List<C35069noP> list, StockListPo stockListPo, String str, Map<String, TickersData> map) {
        return list.isEmpty() ? yDY.AhwBna() : (List) this.EZpvd.OLrzqt((Object) new C35065noL(list, stockListPo, str, map));
    }

    public final List<C35069noP> KWHzl(List<C35069noP> list) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C35069noP c35069noP = (C35069noP) obj;
            if (interfaceC54581xNrOLrzqt.OLrzqt(c35069noP.AhwBna(), c35069noP.djBIcL())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Continuation<? super Unit> continuation) throws Throwable {
        MarketHomeStockContainerViewModel$subscribeStockTickersWs$1 marketHomeStockContainerViewModel$subscribeStockTickersWs$1;
        MarketHomeStockContainerViewModel marketHomeStockContainerViewModel;
        Object objM7377constructorimpl;
        if (continuation instanceof MarketHomeStockContainerViewModel$subscribeStockTickersWs$1) {
            marketHomeStockContainerViewModel$subscribeStockTickersWs$1 = (MarketHomeStockContainerViewModel$subscribeStockTickersWs$1) continuation;
            int i = marketHomeStockContainerViewModel$subscribeStockTickersWs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeStockContainerViewModel$subscribeStockTickersWs$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeStockContainerViewModel$subscribeStockTickersWs$1 = new MarketHomeStockContainerViewModel$subscribeStockTickersWs$1(this, continuation);
            }
        }
        Object objEZpvd = marketHomeStockContainerViewModel$subscribeStockTickersWs$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomeStockContainerViewModel$subscribeStockTickersWs$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            pUU.KWHzl("MarketHomeStockContainerViewModel", "subscribeStockTickersWs start");
            try {
                Result.Application application = Result.Companion;
                C41608qty c41608qty = this.AYXKKw;
                Unit unit = Unit.INSTANCE;
                marketHomeStockContainerViewModel$subscribeStockTickersWs$1.L$0 = this;
                marketHomeStockContainerViewModel$subscribeStockTickersWs$1.label = 1;
                objEZpvd = c41608qty.EZpvd(unit, marketHomeStockContainerViewModel$subscribeStockTickersWs$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                marketHomeStockContainerViewModel = this;
            } catch (Throwable th) {
                th = th;
                marketHomeStockContainerViewModel = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                return Unit.INSTANCE;
            }
            marketHomeStockContainerViewModel = (MarketHomeStockContainerViewModel) marketHomeStockContainerViewModel$subscribeStockTickersWs$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((Flow) objEZpvd);
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("MarketHomeStockContainerViewModel", "subscribeStockTickersWs error", thM7380exceptionOrNullimpl);
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            Flow flowM7441catch = FlowKt.m7441catch(FlowKt.onCompletion(FlowKt.conflate((Flow) objM7377constructorimpl), new MarketHomeStockContainerViewModel$subscribeStockTickersWs$4$1(null)), new MarketHomeStockContainerViewModel$subscribeStockTickersWs$4$2(null));
            MarketHomeStockContainerViewModel$subscribeStockTickersWs$4$3 marketHomeStockContainerViewModel$subscribeStockTickersWs$4$3 = new MarketHomeStockContainerViewModel$subscribeStockTickersWs$4$3(marketHomeStockContainerViewModel, null);
            marketHomeStockContainerViewModel$subscribeStockTickersWs$1.L$0 = objM7377constructorimpl;
            marketHomeStockContainerViewModel$subscribeStockTickersWs$1.label = 2;
            if (FlowKt.collectLatest(flowM7441catch, marketHomeStockContainerViewModel$subscribeStockTickersWs$4$3, marketHomeStockContainerViewModel$subscribeStockTickersWs$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(Continuation<? super Unit> continuation) throws Throwable {
        MarketHomeStockContainerViewModel$subscribeCupTickersWs$1 marketHomeStockContainerViewModel$subscribeCupTickersWs$1;
        MarketHomeStockContainerViewModel marketHomeStockContainerViewModel;
        Object objM7377constructorimpl;
        if (continuation instanceof MarketHomeStockContainerViewModel$subscribeCupTickersWs$1) {
            marketHomeStockContainerViewModel$subscribeCupTickersWs$1 = (MarketHomeStockContainerViewModel$subscribeCupTickersWs$1) continuation;
            int i = marketHomeStockContainerViewModel$subscribeCupTickersWs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeStockContainerViewModel$subscribeCupTickersWs$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeStockContainerViewModel$subscribeCupTickersWs$1 = new MarketHomeStockContainerViewModel$subscribeCupTickersWs$1(this, continuation);
            }
        }
        Object objEZpvd = marketHomeStockContainerViewModel$subscribeCupTickersWs$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomeStockContainerViewModel$subscribeCupTickersWs$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            pUU.KWHzl("MarketHomeStockContainerViewModel", "subscribeCupTickersWs start");
            try {
                Result.Application application = Result.Companion;
                C40427qVl c40427qVl = this.djBIcL;
                C40426qVk c40426qVk = new C40426qVk(null, C56402yEa.EZpvd("USDT"));
                marketHomeStockContainerViewModel$subscribeCupTickersWs$1.L$0 = this;
                marketHomeStockContainerViewModel$subscribeCupTickersWs$1.label = 1;
                objEZpvd = c40427qVl.EZpvd(c40426qVk, marketHomeStockContainerViewModel$subscribeCupTickersWs$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                marketHomeStockContainerViewModel = this;
            } catch (Throwable th) {
                th = th;
                marketHomeStockContainerViewModel = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                return Unit.INSTANCE;
            }
            marketHomeStockContainerViewModel = (MarketHomeStockContainerViewModel) marketHomeStockContainerViewModel$subscribeCupTickersWs$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl(FlowKt.conflate((Flow) objEZpvd));
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("MarketHomeStockContainerViewModel", "subscribeCupTickersWs error", thM7380exceptionOrNullimpl);
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            Flow flowM7441catch = FlowKt.m7441catch(FlowKt.onCompletion(FlowKt.conflate((Flow) objM7377constructorimpl), new MarketHomeStockContainerViewModel$subscribeCupTickersWs$4$1(null)), new MarketHomeStockContainerViewModel$subscribeCupTickersWs$4$2(null));
            MarketHomeStockContainerViewModel$subscribeCupTickersWs$4$3 marketHomeStockContainerViewModel$subscribeCupTickersWs$4$3 = new MarketHomeStockContainerViewModel$subscribeCupTickersWs$4$3(marketHomeStockContainerViewModel, null);
            marketHomeStockContainerViewModel$subscribeCupTickersWs$1.L$0 = objM7377constructorimpl;
            marketHomeStockContainerViewModel$subscribeCupTickersWs$1.label = 2;
            if (FlowKt.collectLatest(flowM7441catch, marketHomeStockContainerViewModel$subscribeCupTickersWs$4$3, marketHomeStockContainerViewModel$subscribeCupTickersWs$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        InterfaceC49371unL<List<InterfaceC40516qYt>> interfaceC49371unLValueOf;
        InterfaceC49371unL<List<InterfaceC40516qYt>> interfaceC49371unLOLrzqt;
        StateListAnimator value = this.AEQbTJ.getValue();
        Map<String, TickersData> mapKWHzl = value.KWHzl();
        if (mapKWHzl == null) {
            return;
        }
        StockListPo stockListPoAEQbTJ = value.AEQbTJ();
        if (stockListPoAEQbTJ == null) {
            stockListPoAEQbTJ = new StockListPo(null, null, 3, null);
        }
        List<C35069noP> listGEmmrt = value.gEmmrt();
        List<C35069noP> listKWHzl = listGEmmrt != null ? KWHzl(KWHzl(listGEmmrt, stockListPoAEQbTJ, "SPOT", mapKWHzl)) : null;
        List<C35069noP> listCopydefault = value.copydefault();
        List<C35069noP> listKWHzl2 = listCopydefault != null ? KWHzl(KWHzl(listCopydefault, stockListPoAEQbTJ, "SWAP", mapKWHzl)) : null;
        MutableStateFlow<StateListAnimator> mutableStateFlow = this.AEQbTJ;
        if (listKWHzl != null) {
            interfaceC49371unLValueOf = listKWHzl.isEmpty() ? new InterfaceC49371unL.TaskDescription<>(yDY.AhwBna()) : new InterfaceC49371unL.Activity<>(listKWHzl);
        } else {
            interfaceC49371unLValueOf = value.valueOf();
        }
        InterfaceC49371unL<List<InterfaceC40516qYt>> interfaceC49371unL = interfaceC49371unLValueOf;
        if (listKWHzl2 != null) {
            interfaceC49371unLOLrzqt = listKWHzl2.isEmpty() ? new InterfaceC49371unL.TaskDescription<>(yDY.AhwBna()) : new InterfaceC49371unL.Activity<>(listKWHzl2);
        } else {
            interfaceC49371unLOLrzqt = value.OLrzqt();
        }
        mutableStateFlow.setValue(StateListAnimator.copy$default(value, null, interfaceC49371unL, interfaceC49371unLOLrzqt, null, null, null, null, 121, null));
    }

    public final void OLrzqt() {
        InterfaceC49371unL<List<InterfaceC40516qYt>> interfaceC49371unLValueOf = this.AEQbTJ.getValue().valueOf();
        InterfaceC49371unL<List<InterfaceC40516qYt>> interfaceC49371unLOLrzqt = this.AEQbTJ.getValue().OLrzqt();
        boolean z = (interfaceC49371unLValueOf instanceof InterfaceC49371unL.Activity) || (interfaceC49371unLValueOf instanceof InterfaceC49371unL.TaskDescription) || (interfaceC49371unLValueOf instanceof InterfaceC49371unL.Application);
        boolean z2 = (interfaceC49371unLOLrzqt instanceof InterfaceC49371unL.Activity) || (interfaceC49371unLOLrzqt instanceof InterfaceC49371unL.TaskDescription) || (interfaceC49371unLOLrzqt instanceof InterfaceC49371unL.Application);
        if (z || z2) {
            AbstractC35137npe.TaskDescription taskDescription = AbstractC35137npe.TaskDescription.AEQbTJ;
            pUU.KWHzl("MarketHomeStockContainerViewModel", "Display mode updated: " + taskDescription);
            MutableStateFlow<StateListAnimator> mutableStateFlow = this.AEQbTJ;
            mutableStateFlow.setValue(StateListAnimator.copy$default(mutableStateFlow.getValue(), new InterfaceC49371unL.Activity(taskDescription), null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(Continuation<? super Unit> continuation) throws Throwable {
        MarketHomeStockContainerViewModel$ensureTradeManagerInitialized$1 marketHomeStockContainerViewModel$ensureTradeManagerInitialized$1;
        Result resultM7376boximpl;
        Object objAEQbTJ;
        if (continuation instanceof MarketHomeStockContainerViewModel$ensureTradeManagerInitialized$1) {
            marketHomeStockContainerViewModel$ensureTradeManagerInitialized$1 = (MarketHomeStockContainerViewModel$ensureTradeManagerInitialized$1) continuation;
            int i = marketHomeStockContainerViewModel$ensureTradeManagerInitialized$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeStockContainerViewModel$ensureTradeManagerInitialized$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeStockContainerViewModel$ensureTradeManagerInitialized$1 = new MarketHomeStockContainerViewModel$ensureTradeManagerInitialized$1(this, continuation);
            }
        }
        Object obj = marketHomeStockContainerViewModel$ensureTradeManagerInitialized$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomeStockContainerViewModel$ensureTradeManagerInitialized$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNn = this.AhwBna;
            if (interfaceC54577xNn != null) {
                xNE xne = new xNE();
                marketHomeStockContainerViewModel$ensureTradeManagerInitialized$1.label = 1;
                objAEQbTJ = interfaceC54577xNn.AEQbTJ(true, xne, marketHomeStockContainerViewModel$ensureTradeManagerInitialized$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                resultM7376boximpl = null;
                if (resultM7376boximpl == null && Result.m7384isSuccessimpl(resultM7376boximpl.m7386unboximpl())) {
                    pUU.KWHzl("MarketHomeStockContainerViewModel", "TradeManager initialization success");
                } else {
                    pUU.valueOf("MarketHomeStockContainerViewModel", "TradeManager initialization failed or skipped");
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        resultM7376boximpl = Result.m7376boximpl(objAEQbTJ);
        if (resultM7376boximpl == null) {
            pUU.valueOf("MarketHomeStockContainerViewModel", "TradeManager initialization failed or skipped");
        }
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        Job job = this.valueOf;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.OLrzqt;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.valueOf = null;
        this.OLrzqt = null;
    }

    @Override // o.AbstractC49411unz, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        copydefault();
    }
}
