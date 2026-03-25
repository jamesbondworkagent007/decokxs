package com.okinc.unify_find.viewmodel;

import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.market.ranking.core.model.po.RankingFuturesType;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.unify_find.data.RankListRequest;
import com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC49408unw;
import o.AbstractC49411unz;
import o.C33129mqd;
import o.C35037nnk;
import o.C35038nnl;
import o.C40426qVk;
import o.C40427qVl;
import o.C40430qVo;
import o.C41614quD;
import o.C41615quE;
import o.C55611xnH;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.InterfaceC54577xNn;
import o.pUU;
import o.xNE;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class MarketHomeFuturesRankingViewModel extends AbstractC49411unz<Activity> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final C35037nnk AEQbTJ;
    public final InterfaceC54577xNn AhwBna;
    public final C40430qVo EZpvd;
    public final C41614quD KWHzl;
    public final C35038nnl OLrzqt;
    public final C40427qVl valueOf;

    public static final class ActionBar implements Flow<List<? extends Object>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ MarketHomeFuturesRankingViewModel copydefault;

        /* JADX INFO: renamed from: com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel$ActionBar$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ MarketHomeFuturesRankingViewModel copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel) {
                this.AEQbTJ = flowCollector;
                this.copydefault = marketHomeFuturesRankingViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x00a1 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                MarketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1 marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1;
                List list;
                Object objOLrzqt;
                C35037nnk c35037nnk;
                FlowCollector flowCollector;
                FlowCollector flowCollector2;
                if (continuation instanceof MarketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1) {
                    marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1 = (MarketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1) continuation;
                    int i = marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1 = new MarketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object objEZpvd = marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objEZpvd);
                    FlowCollector flowCollector3 = this.AEQbTJ;
                    list = (List) obj;
                    C35037nnk c35037nnk2 = this.copydefault.AEQbTJ;
                    MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel = this.copydefault;
                    marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.L$0 = flowCollector3;
                    marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.L$1 = list;
                    marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.L$2 = c35037nnk2;
                    marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.label = 1;
                    objOLrzqt = marketHomeFuturesRankingViewModel.OLrzqt(marketHomeFuturesRankingViewModel, marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    c35037nnk = c35037nnk2;
                    flowCollector = flowCollector3;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C56391yDq.AEQbTJ(objEZpvd);
                            return Unit.INSTANCE;
                        }
                        FlowCollector flowCollector4 = (FlowCollector) marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.L$0;
                        C56391yDq.AEQbTJ(objEZpvd);
                        flowCollector2 = flowCollector4;
                        marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.L$0 = null;
                        marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.label = 3;
                        if (flowCollector2.emit(objEZpvd, marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    C35037nnk c35037nnk3 = (C35037nnk) marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.L$2;
                    list = (List) marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.L$1;
                    FlowCollector flowCollector5 = (FlowCollector) marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c35037nnk = c35037nnk3;
                    flowCollector = flowCollector5;
                    objOLrzqt = objEZpvd;
                }
                Map<String, TickersData> mapEZpvd = ((Activity) objOLrzqt).EZpvd();
                if (mapEZpvd == null) {
                    mapEZpvd = C56424yEw.KWHzl();
                }
                Pair pair = new Pair(list, mapEZpvd);
                marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.L$0 = flowCollector;
                marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.L$1 = null;
                marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.L$2 = null;
                marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.label = 2;
                objEZpvd = c35037nnk.EZpvd(pair, marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1);
                flowCollector2 = flowCollector;
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.L$0 = null;
                marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1.label = 3;
                if (flowCollector2.emit(objEZpvd, marketHomeFuturesRankingViewModel$subscribeRankingWs$lambda$6$$inlined$map$1$2$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow, MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel) {
            this.AEQbTJ = flow;
            this.copydefault = marketHomeFuturesRankingViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends Object>> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public MarketHomeFuturesRankingViewModel(InterfaceC54577xNn interfaceC54577xNn, @NotNull C41614quD c41614quD, @NotNull C35038nnl c35038nnl, @NotNull C40430qVo c40430qVo, @NotNull C40427qVl c40427qVl, @NotNull C35037nnk c35037nnk) {
        super(new Activity(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(c41614quD, "");
        Intrinsics.checkNotNullParameter(c35038nnl, "");
        Intrinsics.checkNotNullParameter(c40430qVo, "");
        Intrinsics.checkNotNullParameter(c40427qVl, "");
        Intrinsics.checkNotNullParameter(c35037nnk, "");
        this.AhwBna = interfaceC54577xNn;
        this.KWHzl = c41614quD;
        this.OLrzqt = c35038nnl;
        this.EZpvd = c40430qVo;
        this.valueOf = c40427qVl;
        this.AEQbTJ = c35037nnk;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final class Activity extends AbstractC49408unw<Activity> {
        public Map<String, TickersData> AEQbTJ;
        public InterfaceC49371unL<? extends List<? extends Object>> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, InterfaceC49371unL interfaceC49371unL, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC49371unL = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                map = activity.AEQbTJ;
            }
            return activity.copydefault(interfaceC49371unL, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, TickersData> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(Map<String, TickersData> map) {
            this.AEQbTJ = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(@NotNull InterfaceC49371unL<? extends List<? extends Object>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.OLrzqt = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull InterfaceC49371unL<? extends List<? extends Object>> interfaceC49371unL, Map<String, TickersData> map) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            return new Activity(interfaceC49371unL, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends java.util.List<? extends java.lang.Object>>, o.unL<java.util.List<java.lang.Object>> */
        public final InterfaceC49371unL<List<Object>> copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            Map<String, TickersData> map = this.AEQbTJ;
            return (iHashCode * 31) + (map == null ? 0 : map.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FuturesRankingUiState(voList=" + this.OLrzqt + ", cupTickerMap=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0008: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:67) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r2v0 o.unL))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r3v0 java.util.Map))
 A[MD:(o.unL<? extends java.util.List<? extends java.lang.Object>>, java.util.Map<java.lang.String, com.okinc.unify_trade.biz.subscribe.TickersData>):void (m)] (LINE:66) call: com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel.Activity.<init>(o.unL, java.util.Map):void type: THIS */
        public /* synthetic */ Activity(InterfaceC49371unL interfaceC49371unL, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL, (i & 2) != 0 ? null : map);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull InterfaceC49371unL<? extends List<? extends Object>> interfaceC49371unL, Map<String, TickersData> map) {
            super(new Function1() { // from class: o.xnm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketHomeFuturesRankingViewModel.Activity.EZpvd((MarketHomeFuturesRankingViewModel.Activity) obj);
                }
            });
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.OLrzqt = interfaceC49371unL;
            this.AEQbTJ = map;
        }

        public static final Activity EZpvd(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            return copy$default(activity, null, null, 3, null);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x00f6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x018e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x0034 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0231 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0251 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, o.unz] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.okinc.market.ranking.core.model.po.RankingFuturesType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.okinc.market.ranking.core.model.po.RankingFuturesType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [com.okinc.market.ranking.core.model.po.RankingFuturesType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, o.unz] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, o.unz] */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull String str, @NotNull RankingFuturesType rankingFuturesType, @NotNull PeriodEnum periodEnum, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        MarketHomeFuturesRankingViewModel$loadData$1 marketHomeFuturesRankingViewModel$loadData$1;
        ?? r14;
        Object objM7377constructorimpl;
        ?? r142;
        ?? r7;
        ?? r4;
        ?? r3;
        Object obj;
        Throwable thM7380exceptionOrNullimpl;
        ?? r8;
        ?? r72;
        ?? r42;
        ?? r32;
        Map map;
        ?? r82;
        ?? r0;
        ?? r73;
        ?? r43;
        MarketHomeFuturesRankingViewModel$loadData$4$2 marketHomeFuturesRankingViewModel$loadData$4$2;
        ?? r33;
        ?? r44;
        Object obj2;
        ?? r2;
        ?? r83;
        MarketHomeFuturesRankingViewModel$loadData$4$3 marketHomeFuturesRankingViewModel$loadData$4$3;
        ?? r84;
        ?? r74;
        ?? r45;
        ?? r46;
        ?? r34;
        ?? r22;
        ?? r02;
        Object objEZpvd;
        ?? r23;
        String str2;
        ?? r47;
        ?? r35;
        ?? r143;
        Object objEZpvd2;
        Map map2;
        String str3 = str;
        ?? r36 = rankingFuturesType;
        ?? r48 = periodEnum;
        if (continuation instanceof MarketHomeFuturesRankingViewModel$loadData$1) {
            marketHomeFuturesRankingViewModel$loadData$1 = (MarketHomeFuturesRankingViewModel$loadData$1) continuation;
            int i = marketHomeFuturesRankingViewModel$loadData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeFuturesRankingViewModel$loadData$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeFuturesRankingViewModel$loadData$1 = new MarketHomeFuturesRankingViewModel$loadData$1(this, continuation);
            }
        }
        Object obj3 = marketHomeFuturesRankingViewModel$loadData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r75 = marketHomeFuturesRankingViewModel$loadData$1.label;
        try {
        } catch (Throwable th) {
            th = th;
        }
        switch (r75) {
            case 0:
                C56391yDq.AEQbTJ(obj3);
                pUU.KWHzl("MarketHomeFuturesRankingViewModel", "loadData start: [callSite: " + str3 + ", rankType: " + r36 + ", period: " + r48 + "]");
                try {
                    Result.Application application = Result.Companion;
                    marketHomeFuturesRankingViewModel$loadData$1.L$0 = this;
                    marketHomeFuturesRankingViewModel$loadData$1.L$1 = str3;
                    marketHomeFuturesRankingViewModel$loadData$1.L$2 = r36;
                    marketHomeFuturesRankingViewModel$loadData$1.L$3 = r48;
                    marketHomeFuturesRankingViewModel$loadData$1.L$4 = this;
                    marketHomeFuturesRankingViewModel$loadData$1.label = 1;
                    break;
                } catch (Throwable th2) {
                    th = th2;
                    r14 = this;
                    r75 = str3;
                    ?? r16 = r48;
                    r48 = r36;
                    r36 = r16;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    r3 = r36;
                    r4 = r48;
                    r7 = r75;
                    r142 = r14;
                    obj = objM7377constructorimpl;
                    ?? r85 = r142;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                    r32 = r3;
                    r42 = r4;
                    r72 = r7;
                    r8 = r85;
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    ?? r03 = r8;
                    ?? r86 = r72;
                    ?? r76 = r42;
                    ?? r49 = r32;
                    r45 = r49;
                    r74 = r76;
                    r84 = r86;
                    if (Result.m7384isSuccessimpl(obj)) {
                    }
                    pUU.KWHzl("MarketHomeFuturesRankingViewModel", "loadData end: [callSite: " + r84 + ", rankType: " + r74 + ", period: " + r45 + "]");
                    return Unit.INSTANCE;
                }
                if (OLrzqt(str3, r36, marketHomeFuturesRankingViewModel$loadData$1) == objCopydefault) {
                    return objCopydefault;
                }
                ?? r04 = this;
                r14 = r04;
                r02 = r04;
                r36 = r36;
                r48 = r48;
                try {
                    marketHomeFuturesRankingViewModel$loadData$1.L$0 = r14;
                    marketHomeFuturesRankingViewModel$loadData$1.L$1 = str3;
                    marketHomeFuturesRankingViewModel$loadData$1.L$2 = r36;
                    marketHomeFuturesRankingViewModel$loadData$1.L$3 = r48;
                    marketHomeFuturesRankingViewModel$loadData$1.L$4 = r02;
                    marketHomeFuturesRankingViewModel$loadData$1.label = 2;
                    objEZpvd = r02.EZpvd(r36, marketHomeFuturesRankingViewModel$loadData$1);
                    break;
                } catch (Throwable th3) {
                    th = th3;
                    r75 = str3;
                    ?? r162 = r48;
                    r48 = r36;
                    r36 = r162;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    r3 = r36;
                    r4 = r48;
                    r7 = r75;
                    r142 = r14;
                }
                if (objEZpvd != objCopydefault) {
                    return objCopydefault;
                }
                String str4 = str3;
                r23 = r02;
                obj3 = objEZpvd;
                str2 = str4;
                ?? r17 = r48;
                r47 = r36;
                r35 = r17;
                r143 = r14;
                Pair pair = (Pair) obj3;
                List list = (List) pair.component1();
                Map map3 = (Map) pair.component2();
                C35037nnk c35037nnk = r23.AEQbTJ;
                Pair pair2 = new Pair(list, map3);
                marketHomeFuturesRankingViewModel$loadData$1.L$0 = r143;
                marketHomeFuturesRankingViewModel$loadData$1.L$1 = str2;
                marketHomeFuturesRankingViewModel$loadData$1.L$2 = r47;
                marketHomeFuturesRankingViewModel$loadData$1.L$3 = r35;
                marketHomeFuturesRankingViewModel$loadData$1.L$4 = map3;
                marketHomeFuturesRankingViewModel$loadData$1.label = 3;
                objEZpvd2 = c35037nnk.EZpvd(pair2, marketHomeFuturesRankingViewModel$loadData$1);
                if (objEZpvd2 != objCopydefault) {
                    return objCopydefault;
                }
                map2 = map3;
                obj3 = objEZpvd2;
                r36 = r35;
                r48 = r47;
                r75 = str2;
                r14 = r143;
                objM7377constructorimpl = Result.m7377constructorimpl(C56390yDp.OLrzqt((List) obj3, map2));
                r3 = r36;
                r4 = r48;
                r7 = r75;
                r142 = r14;
                obj = objM7377constructorimpl;
                ?? r852 = r142;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                r32 = r3;
                r42 = r4;
                r72 = r7;
                r8 = r852;
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("MarketHomeFuturesRankingViewModel", "load futures ranking list error [callSite: " + r7 + ", period: " + r3 + "]", thM7380exceptionOrNullimpl);
                    MarketHomeFuturesRankingViewModel$loadData$3$1 marketHomeFuturesRankingViewModel$loadData$3$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel$loadData$3$1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj4) {
                            return ((MarketHomeFuturesRankingViewModel.Activity) obj4).copydefault();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj4, Object obj5) {
                            ((MarketHomeFuturesRankingViewModel.Activity) obj4).KWHzl((InterfaceC49371unL<? extends List<? extends Object>>) obj5);
                        }
                    };
                    InterfaceC49371unL.Application application3 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                    marketHomeFuturesRankingViewModel$loadData$1.L$0 = r852;
                    marketHomeFuturesRankingViewModel$loadData$1.L$1 = r7;
                    marketHomeFuturesRankingViewModel$loadData$1.L$2 = r4;
                    marketHomeFuturesRankingViewModel$loadData$1.L$3 = r3;
                    marketHomeFuturesRankingViewModel$loadData$1.L$4 = obj;
                    marketHomeFuturesRankingViewModel$loadData$1.label = 4;
                    Object objKWHzl = r852.KWHzl(marketHomeFuturesRankingViewModel$loadData$3$1, application3, marketHomeFuturesRankingViewModel$loadData$1);
                    r32 = r3;
                    r42 = r4;
                    r72 = r7;
                    r8 = r852;
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                }
                ?? r032 = r8;
                ?? r862 = r72;
                ?? r762 = r42;
                ?? r492 = r32;
                r45 = r492;
                r74 = r762;
                r84 = r862;
                if (Result.m7384isSuccessimpl(obj)) {
                    Pair pair3 = (Pair) obj;
                    List list2 = (List) pair3.component1();
                    map = (Map) pair3.component2();
                    MarketHomeFuturesRankingViewModel$loadData$4$1 marketHomeFuturesRankingViewModel$loadData$4$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel$loadData$4$1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj4) {
                            return ((MarketHomeFuturesRankingViewModel.Activity) obj4).copydefault();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj4, Object obj5) {
                            ((MarketHomeFuturesRankingViewModel.Activity) obj4).KWHzl((InterfaceC49371unL<? extends List<? extends Object>>) obj5);
                        }
                    };
                    InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(list2);
                    marketHomeFuturesRankingViewModel$loadData$1.L$0 = r032;
                    marketHomeFuturesRankingViewModel$loadData$1.L$1 = r862;
                    marketHomeFuturesRankingViewModel$loadData$1.L$2 = r762;
                    marketHomeFuturesRankingViewModel$loadData$1.L$3 = r492;
                    marketHomeFuturesRankingViewModel$loadData$1.L$4 = obj;
                    marketHomeFuturesRankingViewModel$loadData$1.L$5 = map;
                    marketHomeFuturesRankingViewModel$loadData$1.label = 5;
                    if (r032.KWHzl(marketHomeFuturesRankingViewModel$loadData$4$1, activity, marketHomeFuturesRankingViewModel$loadData$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    r82 = r032;
                    r0 = r862;
                    r43 = r492;
                    r73 = r762;
                    marketHomeFuturesRankingViewModel$loadData$4$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel$loadData$4$2
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj4) {
                            return ((MarketHomeFuturesRankingViewModel.Activity) obj4).EZpvd();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj4, Object obj5) {
                            ((MarketHomeFuturesRankingViewModel.Activity) obj4).EZpvd((Map<String, TickersData>) obj5);
                        }
                    };
                    marketHomeFuturesRankingViewModel$loadData$1.L$0 = r82;
                    marketHomeFuturesRankingViewModel$loadData$1.L$1 = r0;
                    marketHomeFuturesRankingViewModel$loadData$1.L$2 = r73;
                    marketHomeFuturesRankingViewModel$loadData$1.L$3 = r43;
                    marketHomeFuturesRankingViewModel$loadData$1.L$4 = obj;
                    marketHomeFuturesRankingViewModel$loadData$1.L$5 = null;
                    marketHomeFuturesRankingViewModel$loadData$1.label = 6;
                    if (r82.KWHzl(marketHomeFuturesRankingViewModel$loadData$4$2, map, marketHomeFuturesRankingViewModel$loadData$1) != objCopydefault) {
                        return objCopydefault;
                    }
                    r33 = r73;
                    ?? r163 = r43;
                    r44 = r0;
                    obj2 = obj;
                    r2 = r163;
                    r83 = r82;
                    marketHomeFuturesRankingViewModel$loadData$4$3 = new MarketHomeFuturesRankingViewModel$loadData$4$3(r83, r44, r33, null);
                    marketHomeFuturesRankingViewModel$loadData$1.L$0 = r44;
                    marketHomeFuturesRankingViewModel$loadData$1.L$1 = r33;
                    marketHomeFuturesRankingViewModel$loadData$1.L$2 = r2;
                    marketHomeFuturesRankingViewModel$loadData$1.L$3 = obj2;
                    marketHomeFuturesRankingViewModel$loadData$1.L$4 = null;
                    marketHomeFuturesRankingViewModel$loadData$1.label = 7;
                    r22 = r2;
                    r34 = r33;
                    r46 = r44;
                    if (SupervisorKt.supervisorScope(marketHomeFuturesRankingViewModel$loadData$4$3, marketHomeFuturesRankingViewModel$loadData$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    r74 = r34;
                    r84 = r46;
                    r45 = r22;
                }
                pUU.KWHzl("MarketHomeFuturesRankingViewModel", "loadData end: [callSite: " + r84 + ", rankType: " + r74 + ", period: " + r45 + "]");
                return Unit.INSTANCE;
            case 1:
                MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel = (MarketHomeFuturesRankingViewModel) marketHomeFuturesRankingViewModel$loadData$1.L$4;
                PeriodEnum periodEnum2 = (PeriodEnum) marketHomeFuturesRankingViewModel$loadData$1.L$3;
                RankingFuturesType rankingFuturesType2 = (RankingFuturesType) marketHomeFuturesRankingViewModel$loadData$1.L$2;
                String str5 = (String) marketHomeFuturesRankingViewModel$loadData$1.L$1;
                MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel2 = (MarketHomeFuturesRankingViewModel) marketHomeFuturesRankingViewModel$loadData$1.L$0;
                C56391yDq.AEQbTJ(obj3);
                r02 = marketHomeFuturesRankingViewModel;
                str3 = str5;
                r48 = periodEnum2;
                r36 = rankingFuturesType2;
                r14 = marketHomeFuturesRankingViewModel2;
                marketHomeFuturesRankingViewModel$loadData$1.L$0 = r14;
                marketHomeFuturesRankingViewModel$loadData$1.L$1 = str3;
                marketHomeFuturesRankingViewModel$loadData$1.L$2 = r36;
                marketHomeFuturesRankingViewModel$loadData$1.L$3 = r48;
                marketHomeFuturesRankingViewModel$loadData$1.L$4 = r02;
                marketHomeFuturesRankingViewModel$loadData$1.label = 2;
                objEZpvd = r02.EZpvd(r36, marketHomeFuturesRankingViewModel$loadData$1);
                if (objEZpvd != objCopydefault) {
                }
                break;
            case 2:
                MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel3 = (MarketHomeFuturesRankingViewModel) marketHomeFuturesRankingViewModel$loadData$1.L$4;
                PeriodEnum periodEnum3 = (PeriodEnum) marketHomeFuturesRankingViewModel$loadData$1.L$3;
                RankingFuturesType rankingFuturesType3 = (RankingFuturesType) marketHomeFuturesRankingViewModel$loadData$1.L$2;
                String str6 = (String) marketHomeFuturesRankingViewModel$loadData$1.L$1;
                MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel4 = (MarketHomeFuturesRankingViewModel) marketHomeFuturesRankingViewModel$loadData$1.L$0;
                C56391yDq.AEQbTJ(obj3);
                r23 = marketHomeFuturesRankingViewModel3;
                r35 = periodEnum3;
                r47 = rankingFuturesType3;
                str2 = str6;
                r143 = marketHomeFuturesRankingViewModel4;
                Pair pair4 = (Pair) obj3;
                List list3 = (List) pair4.component1();
                Map map32 = (Map) pair4.component2();
                C35037nnk c35037nnk2 = r23.AEQbTJ;
                Pair pair22 = new Pair(list3, map32);
                marketHomeFuturesRankingViewModel$loadData$1.L$0 = r143;
                marketHomeFuturesRankingViewModel$loadData$1.L$1 = str2;
                marketHomeFuturesRankingViewModel$loadData$1.L$2 = r47;
                marketHomeFuturesRankingViewModel$loadData$1.L$3 = r35;
                marketHomeFuturesRankingViewModel$loadData$1.L$4 = map32;
                marketHomeFuturesRankingViewModel$loadData$1.label = 3;
                objEZpvd2 = c35037nnk2.EZpvd(pair22, marketHomeFuturesRankingViewModel$loadData$1);
                if (objEZpvd2 != objCopydefault) {
                }
                break;
            case 3:
                map2 = (Map) marketHomeFuturesRankingViewModel$loadData$1.L$4;
                PeriodEnum periodEnum4 = (PeriodEnum) marketHomeFuturesRankingViewModel$loadData$1.L$3;
                RankingFuturesType rankingFuturesType4 = (RankingFuturesType) marketHomeFuturesRankingViewModel$loadData$1.L$2;
                String str7 = (String) marketHomeFuturesRankingViewModel$loadData$1.L$1;
                MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel5 = (MarketHomeFuturesRankingViewModel) marketHomeFuturesRankingViewModel$loadData$1.L$0;
                C56391yDq.AEQbTJ(obj3);
                r36 = periodEnum4;
                r48 = rankingFuturesType4;
                r75 = str7;
                r14 = marketHomeFuturesRankingViewModel5;
                objM7377constructorimpl = Result.m7377constructorimpl(C56390yDp.OLrzqt((List) obj3, map2));
                r3 = r36;
                r4 = r48;
                r7 = r75;
                r142 = r14;
                obj = objM7377constructorimpl;
                ?? r8522 = r142;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                r32 = r3;
                r42 = r4;
                r72 = r7;
                r8 = r8522;
                if (thM7380exceptionOrNullimpl != null) {
                }
                ?? r0322 = r8;
                ?? r8622 = r72;
                ?? r7622 = r42;
                ?? r4922 = r32;
                r45 = r4922;
                r74 = r7622;
                r84 = r8622;
                if (Result.m7384isSuccessimpl(obj)) {
                }
                pUU.KWHzl("MarketHomeFuturesRankingViewModel", "loadData end: [callSite: " + r84 + ", rankType: " + r74 + ", period: " + r45 + "]");
                return Unit.INSTANCE;
            case 4:
                obj = marketHomeFuturesRankingViewModel$loadData$1.L$4;
                PeriodEnum periodEnum5 = (PeriodEnum) marketHomeFuturesRankingViewModel$loadData$1.L$3;
                RankingFuturesType rankingFuturesType5 = (RankingFuturesType) marketHomeFuturesRankingViewModel$loadData$1.L$2;
                String str8 = (String) marketHomeFuturesRankingViewModel$loadData$1.L$1;
                MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel6 = (MarketHomeFuturesRankingViewModel) marketHomeFuturesRankingViewModel$loadData$1.L$0;
                C56391yDq.AEQbTJ(obj3);
                r32 = periodEnum5;
                r42 = rankingFuturesType5;
                r72 = str8;
                r8 = marketHomeFuturesRankingViewModel6;
                ?? r03222 = r8;
                ?? r86222 = r72;
                ?? r76222 = r42;
                ?? r49222 = r32;
                r45 = r49222;
                r74 = r76222;
                r84 = r86222;
                if (Result.m7384isSuccessimpl(obj)) {
                }
                pUU.KWHzl("MarketHomeFuturesRankingViewModel", "loadData end: [callSite: " + r84 + ", rankType: " + r74 + ", period: " + r45 + "]");
                return Unit.INSTANCE;
            case 5:
                Map map4 = (Map) marketHomeFuturesRankingViewModel$loadData$1.L$5;
                Object obj4 = marketHomeFuturesRankingViewModel$loadData$1.L$4;
                PeriodEnum periodEnum6 = (PeriodEnum) marketHomeFuturesRankingViewModel$loadData$1.L$3;
                RankingFuturesType rankingFuturesType6 = (RankingFuturesType) marketHomeFuturesRankingViewModel$loadData$1.L$2;
                String str9 = (String) marketHomeFuturesRankingViewModel$loadData$1.L$1;
                MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel7 = (MarketHomeFuturesRankingViewModel) marketHomeFuturesRankingViewModel$loadData$1.L$0;
                C56391yDq.AEQbTJ(obj3);
                map = map4;
                obj = obj4;
                r0 = str9;
                r82 = marketHomeFuturesRankingViewModel7;
                r43 = periodEnum6;
                r73 = rankingFuturesType6;
                marketHomeFuturesRankingViewModel$loadData$4$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel$loadData$4$2
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj42) {
                        return ((MarketHomeFuturesRankingViewModel.Activity) obj42).EZpvd();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj42, Object obj5) {
                        ((MarketHomeFuturesRankingViewModel.Activity) obj42).EZpvd((Map<String, TickersData>) obj5);
                    }
                };
                marketHomeFuturesRankingViewModel$loadData$1.L$0 = r82;
                marketHomeFuturesRankingViewModel$loadData$1.L$1 = r0;
                marketHomeFuturesRankingViewModel$loadData$1.L$2 = r73;
                marketHomeFuturesRankingViewModel$loadData$1.L$3 = r43;
                marketHomeFuturesRankingViewModel$loadData$1.L$4 = obj;
                marketHomeFuturesRankingViewModel$loadData$1.L$5 = null;
                marketHomeFuturesRankingViewModel$loadData$1.label = 6;
                if (r82.KWHzl(marketHomeFuturesRankingViewModel$loadData$4$2, map, marketHomeFuturesRankingViewModel$loadData$1) != objCopydefault) {
                }
                break;
            case 6:
                Object obj5 = marketHomeFuturesRankingViewModel$loadData$1.L$4;
                PeriodEnum periodEnum7 = (PeriodEnum) marketHomeFuturesRankingViewModel$loadData$1.L$3;
                RankingFuturesType rankingFuturesType7 = (RankingFuturesType) marketHomeFuturesRankingViewModel$loadData$1.L$2;
                String str10 = (String) marketHomeFuturesRankingViewModel$loadData$1.L$1;
                MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel8 = (MarketHomeFuturesRankingViewModel) marketHomeFuturesRankingViewModel$loadData$1.L$0;
                C56391yDq.AEQbTJ(obj3);
                obj2 = obj5;
                r2 = periodEnum7;
                r33 = rankingFuturesType7;
                r44 = str10;
                r83 = marketHomeFuturesRankingViewModel8;
                marketHomeFuturesRankingViewModel$loadData$4$3 = new MarketHomeFuturesRankingViewModel$loadData$4$3(r83, r44, r33, null);
                marketHomeFuturesRankingViewModel$loadData$1.L$0 = r44;
                marketHomeFuturesRankingViewModel$loadData$1.L$1 = r33;
                marketHomeFuturesRankingViewModel$loadData$1.L$2 = r2;
                marketHomeFuturesRankingViewModel$loadData$1.L$3 = obj2;
                marketHomeFuturesRankingViewModel$loadData$1.L$4 = null;
                marketHomeFuturesRankingViewModel$loadData$1.label = 7;
                r22 = r2;
                r34 = r33;
                r46 = r44;
                if (SupervisorKt.supervisorScope(marketHomeFuturesRankingViewModel$loadData$4$3, marketHomeFuturesRankingViewModel$loadData$1) == objCopydefault) {
                }
                r74 = r34;
                r84 = r46;
                r45 = r22;
                pUU.KWHzl("MarketHomeFuturesRankingViewModel", "loadData end: [callSite: " + r84 + ", rankType: " + r74 + ", period: " + r45 + "]");
                return Unit.INSTANCE;
            case 7:
                PeriodEnum periodEnum8 = (PeriodEnum) marketHomeFuturesRankingViewModel$loadData$1.L$2;
                RankingFuturesType rankingFuturesType8 = (RankingFuturesType) marketHomeFuturesRankingViewModel$loadData$1.L$1;
                String str11 = (String) marketHomeFuturesRankingViewModel$loadData$1.L$0;
                C56391yDq.AEQbTJ(obj3);
                r22 = periodEnum8;
                r34 = rankingFuturesType8;
                r46 = str11;
                r74 = r34;
                r84 = r46;
                r45 = r22;
                pUU.KWHzl("MarketHomeFuturesRankingViewModel", "loadData end: [callSite: " + r84 + ", rankType: " + r74 + ", period: " + r45 + "]");
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(String str, RankingFuturesType rankingFuturesType, Continuation<? super Unit> continuation) throws Throwable {
        MarketHomeFuturesRankingViewModel$ensureTradeManagerInitialized$1 marketHomeFuturesRankingViewModel$ensureTradeManagerInitialized$1;
        Result resultM7376boximpl;
        Object objAEQbTJ;
        Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof MarketHomeFuturesRankingViewModel$ensureTradeManagerInitialized$1) {
            marketHomeFuturesRankingViewModel$ensureTradeManagerInitialized$1 = (MarketHomeFuturesRankingViewModel$ensureTradeManagerInitialized$1) continuation;
            int i = marketHomeFuturesRankingViewModel$ensureTradeManagerInitialized$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeFuturesRankingViewModel$ensureTradeManagerInitialized$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeFuturesRankingViewModel$ensureTradeManagerInitialized$1 = new MarketHomeFuturesRankingViewModel$ensureTradeManagerInitialized$1(this, continuation);
            }
        }
        Object obj = marketHomeFuturesRankingViewModel$ensureTradeManagerInitialized$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomeFuturesRankingViewModel$ensureTradeManagerInitialized$1.label;
        String message = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNn = this.AhwBna;
            if (interfaceC54577xNn != null) {
                xNE xne = new xNE();
                marketHomeFuturesRankingViewModel$ensureTradeManagerInitialized$1.L$0 = str;
                marketHomeFuturesRankingViewModel$ensureTradeManagerInitialized$1.L$1 = rankingFuturesType;
                marketHomeFuturesRankingViewModel$ensureTradeManagerInitialized$1.label = 1;
                objAEQbTJ = interfaceC54577xNn.AEQbTJ(false, xne, marketHomeFuturesRankingViewModel$ensureTradeManagerInitialized$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                resultM7376boximpl = null;
                if (resultM7376boximpl == null && Result.m7384isSuccessimpl(resultM7376boximpl.m7386unboximpl())) {
                    pUU.KWHzl("MarketHomeFuturesRankingViewModel", "TradeManager initialization success [callSite: " + str + ", rankType: " + rankingFuturesType + "]");
                    return Unit.INSTANCE;
                }
                if (resultM7376boximpl != null && (thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(resultM7376boximpl.m7386unboximpl())) != null) {
                    message = thM7380exceptionOrNullimpl.getMessage();
                }
                pUU.copydefault("MarketHomeFuturesRankingViewModel", "TradeManager initialization failed [callSite: " + str + ", rankType: " + rankingFuturesType + "]: " + message);
                throw new RuntimeException("TradeManager initialization failed");
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rankingFuturesType = (RankingFuturesType) marketHomeFuturesRankingViewModel$ensureTradeManagerInitialized$1.L$1;
            str = (String) marketHomeFuturesRankingViewModel$ensureTradeManagerInitialized$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        resultM7376boximpl = Result.m7376boximpl(objAEQbTJ);
        if (resultM7376boximpl == null) {
        }
        if (resultM7376boximpl != null) {
            message = thM7380exceptionOrNullimpl.getMessage();
        }
        pUU.copydefault("MarketHomeFuturesRankingViewModel", "TradeManager initialization failed [callSite: " + str + ", rankType: " + rankingFuturesType + "]: " + message);
        throw new RuntimeException("TradeManager initialization failed");
    }

    public final Object EZpvd(RankingFuturesType rankingFuturesType, Continuation<? super Pair<? extends List<RankingHotCryptoVo>, ? extends Map<String, TickersData>>> continuation) {
        return CoroutineScopeKt.coroutineScope(new MarketHomeFuturesRankingViewModel$fetchRankingAndTickers$$inlined$executeAsyncTasks$1(null, this, new C41615quE(rankingFuturesType, PeriodEnum.RANKING_PERIOD_1D, C56443yFo.AEQbTJ(7), C56443yFo.AEQbTJ(0), "USDT"), this), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(String str, RankingFuturesType rankingFuturesType, Continuation<? super Unit> continuation) throws Throwable {
        MarketHomeFuturesRankingViewModel$subscribeRankingWs$1 marketHomeFuturesRankingViewModel$subscribeRankingWs$1;
        MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel;
        MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel2;
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        String str2 = str;
        RankingFuturesType rankingFuturesType2 = rankingFuturesType;
        if (continuation instanceof MarketHomeFuturesRankingViewModel$subscribeRankingWs$1) {
            marketHomeFuturesRankingViewModel$subscribeRankingWs$1 = (MarketHomeFuturesRankingViewModel$subscribeRankingWs$1) continuation;
            int i = marketHomeFuturesRankingViewModel$subscribeRankingWs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeFuturesRankingViewModel$subscribeRankingWs$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeFuturesRankingViewModel$subscribeRankingWs$1 = new MarketHomeFuturesRankingViewModel$subscribeRankingWs$1(this, continuation);
            }
        }
        Object objEZpvd = marketHomeFuturesRankingViewModel$subscribeRankingWs$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomeFuturesRankingViewModel$subscribeRankingWs$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            pUU.KWHzl("MarketHomeFuturesRankingViewModel", "subscribeRankingWs start flow data: [callSite: " + str2 + ", rankType: " + rankingFuturesType2 + "]");
            try {
                Result.Application application = Result.Companion;
                RankListRequest rankListRequest = new RankListRequest((String) null, (String) null, C33129mqd.gEmmrt(C56443yFo.AEQbTJ(7)), (String) null, (String) null, C55611xnH.EZpvd("24h", "utc0", "utc8"), "USDT", 27, (DefaultConstructorMarker) null);
                C35038nnl c35038nnl = this.OLrzqt;
                Pair pair = new Pair(rankListRequest, rankingFuturesType2);
                marketHomeFuturesRankingViewModel$subscribeRankingWs$1.L$0 = this;
                marketHomeFuturesRankingViewModel$subscribeRankingWs$1.L$1 = str2;
                marketHomeFuturesRankingViewModel$subscribeRankingWs$1.L$2 = rankingFuturesType2;
                marketHomeFuturesRankingViewModel$subscribeRankingWs$1.L$3 = this;
                marketHomeFuturesRankingViewModel$subscribeRankingWs$1.label = 1;
                objEZpvd = c35038nnl.EZpvd(pair, marketHomeFuturesRankingViewModel$subscribeRankingWs$1);
            } catch (Throwable th) {
                th = th;
                marketHomeFuturesRankingViewModel = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                return Unit.INSTANCE;
            }
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            marketHomeFuturesRankingViewModel2 = this;
            marketHomeFuturesRankingViewModel = marketHomeFuturesRankingViewModel2;
            objM7377constructorimpl = Result.m7377constructorimpl(new ActionBar(FlowKt.conflate((Flow) objEZpvd), marketHomeFuturesRankingViewModel2));
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            }
        } else if (i2 == 1) {
            MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel3 = (MarketHomeFuturesRankingViewModel) marketHomeFuturesRankingViewModel$subscribeRankingWs$1.L$3;
            rankingFuturesType2 = (RankingFuturesType) marketHomeFuturesRankingViewModel$subscribeRankingWs$1.L$2;
            String str3 = (String) marketHomeFuturesRankingViewModel$subscribeRankingWs$1.L$1;
            marketHomeFuturesRankingViewModel = (MarketHomeFuturesRankingViewModel) marketHomeFuturesRankingViewModel$subscribeRankingWs$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                marketHomeFuturesRankingViewModel2 = marketHomeFuturesRankingViewModel3;
                str2 = str3;
            } catch (Throwable th2) {
                th = th2;
                str2 = str3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                return Unit.INSTANCE;
            }
            try {
                objM7377constructorimpl = Result.m7377constructorimpl(new ActionBar(FlowKt.conflate((Flow) objEZpvd), marketHomeFuturesRankingViewModel2));
            } catch (Throwable th3) {
                th = th3;
                Result.Application application222 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("MarketHomeFuturesRankingViewModel", "subscribeRankingWs error [callSite: " + str2 + ", rankType: " + rankingFuturesType2 + "]", thM7380exceptionOrNullimpl);
            }
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                Flow flowM7441catch = FlowKt.m7441catch(FlowKt.onCompletion(FlowKt.conflate((Flow) objM7377constructorimpl), new MarketHomeFuturesRankingViewModel$subscribeRankingWs$4$1(str2, rankingFuturesType2, null)), new MarketHomeFuturesRankingViewModel$subscribeRankingWs$4$2(rankingFuturesType2, null));
                MarketHomeFuturesRankingViewModel$subscribeRankingWs$4$3 marketHomeFuturesRankingViewModel$subscribeRankingWs$4$3 = new MarketHomeFuturesRankingViewModel$subscribeRankingWs$4$3(marketHomeFuturesRankingViewModel, null);
                marketHomeFuturesRankingViewModel$subscribeRankingWs$1.L$0 = objM7377constructorimpl;
                marketHomeFuturesRankingViewModel$subscribeRankingWs$1.L$1 = null;
                marketHomeFuturesRankingViewModel$subscribeRankingWs$1.L$2 = null;
                marketHomeFuturesRankingViewModel$subscribeRankingWs$1.L$3 = null;
                marketHomeFuturesRankingViewModel$subscribeRankingWs$1.label = 2;
                if (FlowKt.collectLatest(flowM7441catch, marketHomeFuturesRankingViewModel$subscribeRankingWs$4$3, marketHomeFuturesRankingViewModel$subscribeRankingWs$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(String str, RankingFuturesType rankingFuturesType, Continuation<? super Unit> continuation) throws Throwable {
        MarketHomeFuturesRankingViewModel$subscribeCupTickersWs$1 marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1;
        MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel;
        Object objM7377constructorimpl;
        if (continuation instanceof MarketHomeFuturesRankingViewModel$subscribeCupTickersWs$1) {
            marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1 = (MarketHomeFuturesRankingViewModel$subscribeCupTickersWs$1) continuation;
            int i = marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1 = new MarketHomeFuturesRankingViewModel$subscribeCupTickersWs$1(this, continuation);
            }
        }
        Object objEZpvd = marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            pUU.KWHzl("MarketHomeFuturesRankingViewModel", "subscribeCupTickersWs start flow data: [callSite: " + str + ", rankType: " + rankingFuturesType + "]");
            try {
                Result.Application application = Result.Companion;
                C40427qVl c40427qVl = this.valueOf;
                C40426qVk c40426qVk = new C40426qVk(null, C56402yEa.EZpvd("USDT"));
                marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1.L$0 = this;
                marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1.L$1 = str;
                marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1.L$2 = rankingFuturesType;
                marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1.label = 1;
                objEZpvd = c40427qVl.EZpvd(c40426qVk, marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                marketHomeFuturesRankingViewModel = this;
            } catch (Throwable th) {
                th = th;
                marketHomeFuturesRankingViewModel = this;
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
            rankingFuturesType = (RankingFuturesType) marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1.L$2;
            str = (String) marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1.L$1;
            marketHomeFuturesRankingViewModel = (MarketHomeFuturesRankingViewModel) marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1.L$0;
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
            pUU.AEQbTJ("MarketHomeFuturesRankingViewModel", "subscribeCupTickersWs load futures ranking list error [callSite: " + str + ", rankType: " + rankingFuturesType + "]", thM7380exceptionOrNullimpl);
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            Flow flowM7441catch = FlowKt.m7441catch(FlowKt.onCompletion(FlowKt.conflate((Flow) objM7377constructorimpl), new MarketHomeFuturesRankingViewModel$subscribeCupTickersWs$4$1(str, rankingFuturesType, null)), new MarketHomeFuturesRankingViewModel$subscribeCupTickersWs$4$2(str, rankingFuturesType, null));
            MarketHomeFuturesRankingViewModel$subscribeCupTickersWs$4$3 marketHomeFuturesRankingViewModel$subscribeCupTickersWs$4$3 = new MarketHomeFuturesRankingViewModel$subscribeCupTickersWs$4$3(marketHomeFuturesRankingViewModel, null);
            marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1.L$0 = objM7377constructorimpl;
            marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1.L$1 = null;
            marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1.L$2 = null;
            marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1.label = 2;
            if (FlowKt.collectLatest(flowM7441catch, marketHomeFuturesRankingViewModel$subscribeCupTickersWs$4$3, marketHomeFuturesRankingViewModel$subscribeCupTickersWs$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
