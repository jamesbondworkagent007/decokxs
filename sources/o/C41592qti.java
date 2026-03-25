package o;

import com.okinc.market.quotation.data.model.PeriodTickersPo;
import com.okinc.market.quotation.domain.spot.SubscribeSpotPeriodTickersUseCase$getHttpCupTickers$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotPeriodTickersUseCase$getHttpCupTickersFlow$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$$inlined$executeAsyncTasks$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotPeriodTickersUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotPeriodTickersUseCase$onExecute$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotPeriodTickersUseCase$onExecute$2;
import com.okinc.market.quotation.domain.spot.SubscribeSpotPeriodTickersUseCase$onExecute$3;
import com.okinc.market.quotation.domain.spot.SubscribeSpotPeriodTickersUseCase$onExecute$5;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41592qti implements InterfaceC49404uns<C41593qtj, Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> {
    public final CoroutineDispatcher AEQbTJ;
    public final C41403qqE AYXKKw;
    public final C40430qVo EZpvd;
    public final C41439qqo KWHzl;
    public final C41446qqv valueOf;
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public static final long OLrzqt = C38364pWa.KWHzl.OLrzqt();

    /* JADX INFO: renamed from: o.qti$Activity */
    public static final class Activity implements Flow<java.util.Map<java.lang.String, java.lang.Object>> {
        public final /* synthetic */ C41592qti EZpvd;
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.qti$Activity$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ C41592qti AEQbTJ;
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, C41592qti c41592qti) {
                this.EZpvd = flowCollector;
                this.AEQbTJ = c41592qti;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeSpotPeriodTickersUseCase$onExecute$$inlined$map$1$2$1 subscribeSpotPeriodTickersUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeSpotPeriodTickersUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeSpotPeriodTickersUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeSpotPeriodTickersUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeSpotPeriodTickersUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeSpotPeriodTickersUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeSpotPeriodTickersUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeSpotPeriodTickersUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeSpotPeriodTickersUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeSpotPeriodTickersUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(this.AEQbTJ.valueOf.KWHzl());
                    linkedHashMap.putAll(this.AEQbTJ.KWHzl.KWHzl());
                    C41434qqj.KWHzl.AEQbTJ("SubscribeSpotPeriodTickersUseCase", "period ticker flow map [periodSize: " + this.AEQbTJ.valueOf.KWHzl().size() + ", cupSize: " + this.AEQbTJ.KWHzl.KWHzl().size() + "]");
                    subscribeSpotPeriodTickersUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(linkedHashMap, subscribeSpotPeriodTickersUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow, C41592qti c41592qti) {
            this.KWHzl = flow;
            this.EZpvd = c41592qti;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.Map<java.lang.String, java.lang.Object>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass4(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public C41592qti(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41446qqv c41446qqv, @NotNull C41439qqo c41439qqo, @NotNull C41403qqE c41403qqE, @NotNull C40430qVo c40430qVo) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41446qqv, "");
        Intrinsics.checkNotNullParameter(c41439qqo, "");
        Intrinsics.checkNotNullParameter(c41403qqE, "");
        Intrinsics.checkNotNullParameter(c40430qVo, "");
        this.AEQbTJ = coroutineDispatcher;
        this.valueOf = c41446qqv;
        this.KWHzl = c41439qqo;
        this.AYXKKw = c41403qqE;
        this.EZpvd = c40430qVo;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    public java.lang.Object EZpvd(@NotNull C41593qtj c41593qtj, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, c41593qtj, continuation);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    public /* synthetic */ java.lang.Object OLrzqt(java.lang.Object obj, Continuation continuation) {
        return EZpvd((C41593qtj) obj, (Continuation<? super Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>>) continuation);
    }

    /* JADX INFO: renamed from: o.qti$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qti.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41593qtj c41593qtj, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> continuation) throws java.lang.Throwable {
        SubscribeSpotPeriodTickersUseCase$onExecute$1 subscribeSpotPeriodTickersUseCase$onExecute$1;
        java.util.List<InterfaceC41641que> listOLrzqt;
        PeriodEnum periodEnumEZpvd;
        boolean zKWHzl;
        C41592qti c41592qti;
        Flow<java.util.Map<java.lang.String, java.lang.Object>> flow;
        Flow flow2;
        Flow flowEmptyFlow;
        Flow flow3;
        Flow<java.util.Map<java.lang.String, java.lang.Object>> flow4;
        C41592qti c41592qti2;
        if (continuation instanceof SubscribeSpotPeriodTickersUseCase$onExecute$1) {
            subscribeSpotPeriodTickersUseCase$onExecute$1 = (SubscribeSpotPeriodTickersUseCase$onExecute$1) continuation;
            int i = subscribeSpotPeriodTickersUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeSpotPeriodTickersUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeSpotPeriodTickersUseCase$onExecute$1 = new SubscribeSpotPeriodTickersUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = subscribeSpotPeriodTickersUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeSpotPeriodTickersUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            listOLrzqt = c41593qtj.OLrzqt();
            periodEnumEZpvd = c41593qtj.EZpvd();
            zKWHzl = c41593qtj.KWHzl();
            C41434qqj c41434qqj = C41434qqj.KWHzl;
            c41434qqj.KWHzl("SubscribeSpotPeriodTickersUseCase", "period ticker start process, period=" + periodEnumEZpvd + ", size=" + listOLrzqt.size() + ", isEnableWsTickers=" + zKWHzl);
            if (listOLrzqt.isEmpty()) {
                C41434qqj.w$default(c41434qqj, "SubscribeSpotPeriodTickersUseCase", "period ticker input is empty", null, 4, null);
                return FlowKt.emptyFlow();
            }
            Flow<java.util.Map<java.lang.String, java.lang.Object>> flowCopydefault = copydefault();
            subscribeSpotPeriodTickersUseCase$onExecute$1.L$0 = this;
            subscribeSpotPeriodTickersUseCase$onExecute$1.L$1 = listOLrzqt;
            subscribeSpotPeriodTickersUseCase$onExecute$1.L$2 = periodEnumEZpvd;
            subscribeSpotPeriodTickersUseCase$onExecute$1.L$3 = flowCopydefault;
            subscribeSpotPeriodTickersUseCase$onExecute$1.Z$0 = zKWHzl;
            subscribeSpotPeriodTickersUseCase$onExecute$1.label = 1;
            java.lang.Object objOLrzqt = OLrzqt((java.util.List<? extends InterfaceC41641que>) listOLrzqt, (Continuation<? super Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>>) subscribeSpotPeriodTickersUseCase$onExecute$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c41592qti = this;
            flow = flowCopydefault;
            obj = objOLrzqt;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flow3 = (Flow) subscribeSpotPeriodTickersUseCase$onExecute$1.L$2;
                flow4 = (Flow) subscribeSpotPeriodTickersUseCase$onExecute$1.L$1;
                c41592qti2 = (C41592qti) subscribeSpotPeriodTickersUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                c41592qti = c41592qti2;
                flow = flow4;
                flowEmptyFlow = (Flow) obj;
                flow2 = flow3;
                return FlowKt.flowOn(FlowKt.onStart(new Activity(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flow, flow2, flowEmptyFlow), new SubscribeSpotPeriodTickersUseCase$onExecute$2(c41592qti, null)), new SubscribeSpotPeriodTickersUseCase$onExecute$3(null)), OLrzqt), c41592qti), new SubscribeSpotPeriodTickersUseCase$onExecute$5(c41592qti, null)), c41592qti.AEQbTJ);
            }
            zKWHzl = subscribeSpotPeriodTickersUseCase$onExecute$1.Z$0;
            flow = (Flow) subscribeSpotPeriodTickersUseCase$onExecute$1.L$3;
            periodEnumEZpvd = (PeriodEnum) subscribeSpotPeriodTickersUseCase$onExecute$1.L$2;
            listOLrzqt = (java.util.List) subscribeSpotPeriodTickersUseCase$onExecute$1.L$1;
            c41592qti = (C41592qti) subscribeSpotPeriodTickersUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        flow2 = (Flow) obj;
        if (zKWHzl) {
            subscribeSpotPeriodTickersUseCase$onExecute$1.L$0 = c41592qti;
            subscribeSpotPeriodTickersUseCase$onExecute$1.L$1 = flow;
            subscribeSpotPeriodTickersUseCase$onExecute$1.L$2 = flow2;
            subscribeSpotPeriodTickersUseCase$onExecute$1.L$3 = null;
            subscribeSpotPeriodTickersUseCase$onExecute$1.label = 2;
            java.lang.Object objCopydefault2 = c41592qti.copydefault(listOLrzqt, periodEnumEZpvd, subscribeSpotPeriodTickersUseCase$onExecute$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            flow3 = flow2;
            obj = objCopydefault2;
            flow4 = flow;
            c41592qti2 = c41592qti;
            c41592qti = c41592qti2;
            flow = flow4;
            flowEmptyFlow = (Flow) obj;
            flow2 = flow3;
            return FlowKt.flowOn(FlowKt.onStart(new Activity(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flow, flow2, flowEmptyFlow), new SubscribeSpotPeriodTickersUseCase$onExecute$2(c41592qti, null)), new SubscribeSpotPeriodTickersUseCase$onExecute$3(null)), OLrzqt), c41592qti), new SubscribeSpotPeriodTickersUseCase$onExecute$5(c41592qti, null)), c41592qti.AEQbTJ);
        }
        flowEmptyFlow = FlowKt.emptyFlow();
        return FlowKt.flowOn(FlowKt.onStart(new Activity(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flow, flow2, flowEmptyFlow), new SubscribeSpotPeriodTickersUseCase$onExecute$2(c41592qti, null)), new SubscribeSpotPeriodTickersUseCase$onExecute$3(null)), OLrzqt), c41592qti), new SubscribeSpotPeriodTickersUseCase$onExecute$5(c41592qti, null)), c41592qti.AEQbTJ);
    }

    private final Flow<java.util.Map<java.lang.String, java.lang.Object>> copydefault() {
        java.util.Map<java.lang.String, PeriodTickersPo> mapKWHzl = this.valueOf.KWHzl();
        Intrinsics.copydefault(mapKWHzl, "");
        Flow<java.util.Map<java.lang.String, java.lang.Object>> flowFlowOf = FlowKt.flowOf(mapKWHzl);
        C41434qqj.KWHzl.KWHzl("SubscribeSpotPeriodTickersUseCase", "get period cache flow, emit first frame [periodSize: " + this.valueOf.KWHzl().size() + "]");
        return flowFlowOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.util.List<? extends InterfaceC41641que> list, Continuation<? super Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> continuation) throws java.lang.Throwable {
        SubscribeSpotPeriodTickersUseCase$getHttpCupTickersFlow$1 subscribeSpotPeriodTickersUseCase$getHttpCupTickersFlow$1;
        boolean z;
        C41592qti c41592qti;
        if (continuation instanceof SubscribeSpotPeriodTickersUseCase$getHttpCupTickersFlow$1) {
            subscribeSpotPeriodTickersUseCase$getHttpCupTickersFlow$1 = (SubscribeSpotPeriodTickersUseCase$getHttpCupTickersFlow$1) continuation;
            int i = subscribeSpotPeriodTickersUseCase$getHttpCupTickersFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeSpotPeriodTickersUseCase$getHttpCupTickersFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeSpotPeriodTickersUseCase$getHttpCupTickersFlow$1 = new SubscribeSpotPeriodTickersUseCase$getHttpCupTickersFlow$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = subscribeSpotPeriodTickersUseCase$getHttpCupTickersFlow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeSpotPeriodTickersUseCase$getHttpCupTickersFlow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, 10);
            if ((listAhwBna instanceof java.util.Collection) && listAhwBna.isEmpty()) {
                z = true;
                java.util.List<java.lang.String> listQbewEr = CollectionsKt___CollectionsKt.QbewEr(C41389qpr.EZpvd(list, new Function1() { // from class: o.qtg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C41592qti.AEQbTJ((InterfaceC41641que) obj);
                    }
                }));
                if (!z) {
                }
            } else {
                java.util.Iterator it = listAhwBna.iterator();
                while (it.hasNext()) {
                    if (this.KWHzl.OLrzqt(((InterfaceC41641que) it.next()).values().getQuoteSymbol()) == null) {
                        z = false;
                        break;
                    }
                }
                z = true;
                java.util.List<java.lang.String> listQbewEr2 = CollectionsKt___CollectionsKt.QbewEr(C41389qpr.EZpvd(list, new Function1() { // from class: o.qtg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C41592qti.AEQbTJ((InterfaceC41641que) obj);
                    }
                }));
                if (!z) {
                    C41434qqj.KWHzl.KWHzl("SubscribeSpotPeriodTickersUseCase", "get http cup tickers flow, cache hit, return cache directly (no HTTP)");
                    java.util.Map<java.lang.String, TickersData> mapKWHzl = this.KWHzl.KWHzl();
                    Intrinsics.copydefault(mapKWHzl, "");
                    return FlowKt.flowOf(mapKWHzl);
                }
                C41434qqj.KWHzl.KWHzl("SubscribeSpotPeriodTickersUseCase", "get http cup tickers flow, cache miss, request HTTP immediately");
                subscribeSpotPeriodTickersUseCase$getHttpCupTickersFlow$1.L$0 = this;
                subscribeSpotPeriodTickersUseCase$getHttpCupTickersFlow$1.label = 1;
                objKWHzl = KWHzl(listQbewEr2, (Continuation<? super java.util.Map<java.lang.String, TickersData>>) subscribeSpotPeriodTickersUseCase$getHttpCupTickersFlow$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c41592qti = this;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41592qti = (C41592qti) subscribeSpotPeriodTickersUseCase$getHttpCupTickersFlow$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.util.Map<java.lang.String, TickersData> map = (java.util.Map) objKWHzl;
        c41592qti.KWHzl.OLrzqt(map);
        Intrinsics.copydefault(map, "");
        return FlowKt.flowOf(map);
    }

    public static final java.lang.String AEQbTJ(InterfaceC41641que interfaceC41641que) {
        Intrinsics.checkNotNullParameter(interfaceC41641que, "");
        return interfaceC41641que.values().getQuoteSymbol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.util.List<java.lang.String> list, Continuation<? super java.util.Map<java.lang.String, TickersData>> continuation) throws java.lang.Throwable {
        SubscribeSpotPeriodTickersUseCase$getHttpCupTickers$1 subscribeSpotPeriodTickersUseCase$getHttpCupTickers$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof SubscribeSpotPeriodTickersUseCase$getHttpCupTickers$1) {
            subscribeSpotPeriodTickersUseCase$getHttpCupTickers$1 = (SubscribeSpotPeriodTickersUseCase$getHttpCupTickers$1) continuation;
            int i = subscribeSpotPeriodTickersUseCase$getHttpCupTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeSpotPeriodTickersUseCase$getHttpCupTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeSpotPeriodTickersUseCase$getHttpCupTickers$1 = new SubscribeSpotPeriodTickersUseCase$getHttpCupTickers$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = subscribeSpotPeriodTickersUseCase$getHttpCupTickers$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeSpotPeriodTickersUseCase$getHttpCupTickers$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Result.Application application = Result.Companion;
                C40429qVn c40429qVn = new C40429qVn(null, list, false, 4, null);
                C40430qVo c40430qVo = this.EZpvd;
                subscribeSpotPeriodTickersUseCase$getHttpCupTickers$1.label = 1;
                objEZpvd = c40430qVo.EZpvd(c40429qVn, subscribeSpotPeriodTickersUseCase$getHttpCupTickers$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.Map) objEZpvd);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C41434qqj.KWHzl.copydefault("SubscribeSpotPeriodTickersUseCase", "get http cup tickers failed", thM7380exceptionOrNullimpl);
        }
        return Result.m7383isFailureimpl(objM7377constructorimpl) ? C56424yEw.KWHzl() : objM7377constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.util.List<? extends InterfaceC41641que> list, PeriodEnum periodEnum, Continuation<? super Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> continuation) throws java.lang.Throwable {
        SubscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1 subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        C41592qti c41592qti;
        if (continuation instanceof SubscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1) {
            subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1 = (SubscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1) continuation;
            int i = subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1 = new SubscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            SubscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$$inlined$executeAsyncTasks$1 subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$$inlined$executeAsyncTasks$1 = new SubscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$$inlined$executeAsyncTasks$1(null, list, list);
            subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.L$0 = this;
            subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.L$1 = periodEnum;
            subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.label = 1;
            objCoroutineScope = CoroutineScopeKt.coroutineScope(subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$$inlined$executeAsyncTasks$1, subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1);
            if (objCoroutineScope == objCopydefault) {
                return objCopydefault;
            }
            c41592qti = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCoroutineScope);
                objM7377constructorimpl = Result.m7377constructorimpl((Flow) objCoroutineScope);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    C41434qqj.KWHzl.copydefault("SubscribeSpotPeriodTickersUseCase", "get subscribe ws period tickers flow error", thM7380exceptionOrNullimpl);
                }
                return !Result.m7383isFailureimpl(objM7377constructorimpl) ? FlowKt.emptyFlow() : objM7377constructorimpl;
            }
            periodEnum = (PeriodEnum) subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.L$1;
            c41592qti = (C41592qti) subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.L$0;
            C56391yDq.AEQbTJ(objCoroutineScope);
        }
        kotlin.Pair pair = (kotlin.Pair) objCoroutineScope;
        java.util.List list2 = (java.util.List) pair.component1();
        java.util.List list3 = (java.util.List) pair.component2();
        Result.Application application2 = Result.Companion;
        C41401qqC c41401qqC = new C41401qqC(C56423yEv.EZpvd(C56390yDp.OLrzqt("SPOT", list2)), list3, periodEnum);
        C41403qqE c41403qqE = c41592qti.AYXKKw;
        subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.L$0 = null;
        subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.L$1 = null;
        subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.label = 2;
        objCoroutineScope = c41403qqE.EZpvd(c41401qqC, subscribeSpotPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1);
        if (objCoroutineScope == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((Flow) objCoroutineScope);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
    }

    /* JADX INFO: renamed from: o.qti$Application */
    public static final class Application implements Function1<InterfaceC41641que, java.lang.String> {
        public static final Application copydefault = new Application();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41641que interfaceC41641que) {
            Intrinsics.checkNotNullParameter(interfaceC41641que, "");
            return interfaceC41641que.values().getInstId();
        }
    }

    /* JADX INFO: renamed from: o.qti$TaskDescription */
    public static final class TaskDescription implements Function1<InterfaceC41641que, java.lang.String> {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41641que interfaceC41641que) {
            Intrinsics.checkNotNullParameter(interfaceC41641que, "");
            return interfaceC41641que.values().getQuoteSymbol();
        }
    }
}
