package o;

import com.okinc.market.quotation.domain.spot.SubscribeSpotTickersUseCase$getHttpTickersFlow$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotTickersUseCase$getHttpTickersFlow$4;
import com.okinc.market.quotation.domain.spot.SubscribeSpotTickersUseCase$getSubscribeWsTickersFlow$$inlined$executeAsyncTasks$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotTickersUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotTickersUseCase$onExecute$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotTickersUseCase$onExecute$2;
import com.okinc.market.quotation.domain.spot.SubscribeSpotTickersUseCase$onExecute$3;
import com.okinc.market.quotation.domain.spot.SubscribeSpotTickersUseCase$onExecute$5;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
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

/* JADX INFO: renamed from: o.qto, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41598qto implements InterfaceC49404uns<kotlin.Pair<? extends java.util.List<? extends InterfaceC41641que>, ? extends java.lang.Boolean>, Flow<? extends java.util.Map<java.lang.String, ? extends TickersData>>> {
    public final C40427qVl EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C41529qsY OLrzqt;
    public final C41439qqo valueOf;
    private static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public static final long copydefault = C38364pWa.KWHzl.OLrzqt();

    @yCM
    public C41598qto(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41439qqo c41439qqo, @NotNull C40427qVl c40427qVl, @NotNull C41529qsY c41529qsY) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41439qqo, "");
        Intrinsics.checkNotNullParameter(c40427qVl, "");
        Intrinsics.checkNotNullParameter(c41529qsY, "");
        this.KWHzl = coroutineDispatcher;
        this.valueOf = c41439qqo;
        this.EZpvd = c40427qVl;
        this.OLrzqt = c41529qsY;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41641que>, java.lang.Boolean> pair, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, pair, continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((kotlin.Pair<? extends java.util.List<? extends InterfaceC41641que>, java.lang.Boolean>) obj, (Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX INFO: renamed from: o.qto$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qto.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.qto$TaskDescription */
    public static final class TaskDescription implements Flow<java.util.Map<java.lang.String, ? extends TickersData>> {
        public final /* synthetic */ Flow OLrzqt;
        public final /* synthetic */ C41598qto copydefault;

        /* JADX INFO: renamed from: o.qto$TaskDescription$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ C41598qto OLrzqt;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, C41598qto c41598qto) {
                this.copydefault = flowCollector;
                this.OLrzqt = c41598qto;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeSpotTickersUseCase$onExecute$$inlined$map$1$2$1 subscribeSpotTickersUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeSpotTickersUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeSpotTickersUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeSpotTickersUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeSpotTickersUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeSpotTickersUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeSpotTickersUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeSpotTickersUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeSpotTickersUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeSpotTickersUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.util.Map<java.lang.String, TickersData> mapKWHzl = this.OLrzqt.valueOf.KWHzl();
                    C41434qqj.KWHzl.AEQbTJ("SubscribeSpotTickersUseCase", "ticker flow map [size: " + mapKWHzl.size() + "]");
                    subscribeSpotTickersUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(mapKWHzl, subscribeSpotTickersUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow, C41598qto c41598qto) {
            this.OLrzqt = flow;
            this.copydefault = c41598qto;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.Map<java.lang.String, ? extends TickersData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass1(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41641que>, java.lang.Boolean> pair, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) throws java.lang.Throwable {
        SubscribeSpotTickersUseCase$onExecute$1 subscribeSpotTickersUseCase$onExecute$1;
        java.util.List<? extends InterfaceC41641que> listComponent1;
        boolean zBooleanValue;
        C41598qto c41598qto;
        Flow flow;
        Flow flowEmptyFlow;
        C41598qto c41598qto2;
        Flow flow2;
        if (continuation instanceof SubscribeSpotTickersUseCase$onExecute$1) {
            subscribeSpotTickersUseCase$onExecute$1 = (SubscribeSpotTickersUseCase$onExecute$1) continuation;
            int i = subscribeSpotTickersUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeSpotTickersUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeSpotTickersUseCase$onExecute$1 = new SubscribeSpotTickersUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = subscribeSpotTickersUseCase$onExecute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = subscribeSpotTickersUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            listComponent1 = pair.component1();
            zBooleanValue = pair.component2().booleanValue();
            C41434qqj c41434qqj = C41434qqj.KWHzl;
            c41434qqj.KWHzl("SubscribeSpotTickersUseCase", "ticker start process, size=" + listComponent1.size() + ", isEnableWsTickers=" + zBooleanValue);
            if (listComponent1.isEmpty()) {
                C41434qqj.w$default(c41434qqj, "SubscribeSpotTickersUseCase", "ticker input is empty", null, 4, null);
                return FlowKt.emptyFlow();
            }
            subscribeSpotTickersUseCase$onExecute$1.L$0 = this;
            subscribeSpotTickersUseCase$onExecute$1.L$1 = listComponent1;
            subscribeSpotTickersUseCase$onExecute$1.Z$0 = zBooleanValue;
            subscribeSpotTickersUseCase$onExecute$1.label = 1;
            objCopydefault = copydefault(listComponent1, subscribeSpotTickersUseCase$onExecute$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c41598qto = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flow2 = (Flow) subscribeSpotTickersUseCase$onExecute$1.L$1;
                c41598qto2 = (C41598qto) subscribeSpotTickersUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                Flow flow3 = (Flow) objCopydefault;
                c41598qto = c41598qto2;
                flow = flow2;
                flowEmptyFlow = flow3;
                return FlowKt.flowOn(FlowKt.onStart(new TaskDescription(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flow, flowEmptyFlow), new SubscribeSpotTickersUseCase$onExecute$2(c41598qto.valueOf)), new SubscribeSpotTickersUseCase$onExecute$3(null)), copydefault), c41598qto), new SubscribeSpotTickersUseCase$onExecute$5(c41598qto, null)), c41598qto.KWHzl);
            }
            zBooleanValue = subscribeSpotTickersUseCase$onExecute$1.Z$0;
            listComponent1 = (java.util.List) subscribeSpotTickersUseCase$onExecute$1.L$1;
            c41598qto = (C41598qto) subscribeSpotTickersUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        flow = (Flow) objCopydefault;
        if (zBooleanValue) {
            subscribeSpotTickersUseCase$onExecute$1.L$0 = c41598qto;
            subscribeSpotTickersUseCase$onExecute$1.L$1 = flow;
            subscribeSpotTickersUseCase$onExecute$1.label = 2;
            java.lang.Object objEZpvd = c41598qto.EZpvd(listComponent1, subscribeSpotTickersUseCase$onExecute$1);
            if (objEZpvd == objCopydefault2) {
                return objCopydefault2;
            }
            c41598qto2 = c41598qto;
            objCopydefault = objEZpvd;
            flow2 = flow;
            Flow flow32 = (Flow) objCopydefault;
            c41598qto = c41598qto2;
            flow = flow2;
            flowEmptyFlow = flow32;
            return FlowKt.flowOn(FlowKt.onStart(new TaskDescription(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flow, flowEmptyFlow), new SubscribeSpotTickersUseCase$onExecute$2(c41598qto.valueOf)), new SubscribeSpotTickersUseCase$onExecute$3(null)), copydefault), c41598qto), new SubscribeSpotTickersUseCase$onExecute$5(c41598qto, null)), c41598qto.KWHzl);
        }
        flowEmptyFlow = FlowKt.emptyFlow();
        return FlowKt.flowOn(FlowKt.onStart(new TaskDescription(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flow, flowEmptyFlow), new SubscribeSpotTickersUseCase$onExecute$2(c41598qto.valueOf)), new SubscribeSpotTickersUseCase$onExecute$3(null)), copydefault), c41598qto), new SubscribeSpotTickersUseCase$onExecute$5(c41598qto, null)), c41598qto.KWHzl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ java.lang.Object copydefault(C41439qqo c41439qqo, java.util.Map map, Continuation continuation) {
        c41439qqo.OLrzqt((java.util.Map<java.lang.String, TickersData>) map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.util.List<? extends InterfaceC41641que> list, Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) throws java.lang.Throwable {
        SubscribeSpotTickersUseCase$getHttpTickersFlow$1 subscribeSpotTickersUseCase$getHttpTickersFlow$1;
        C41598qto c41598qto;
        if (continuation instanceof SubscribeSpotTickersUseCase$getHttpTickersFlow$1) {
            subscribeSpotTickersUseCase$getHttpTickersFlow$1 = (SubscribeSpotTickersUseCase$getHttpTickersFlow$1) continuation;
            int i = subscribeSpotTickersUseCase$getHttpTickersFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeSpotTickersUseCase$getHttpTickersFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeSpotTickersUseCase$getHttpTickersFlow$1 = new SubscribeSpotTickersUseCase$getHttpTickersFlow$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = subscribeSpotTickersUseCase$getHttpTickersFlow$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = subscribeSpotTickersUseCase$getHttpTickersFlow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, 10);
            if (!(listAhwBna instanceof java.util.Collection) || !listAhwBna.isEmpty()) {
                java.util.Iterator it = listAhwBna.iterator();
                while (it.hasNext()) {
                    SpotInstrument spotInstrumentValues = ((InterfaceC41641que) it.next()).values();
                    TickersData tickersDataOLrzqt = this.valueOf.OLrzqt(spotInstrumentValues.getInstId());
                    TickersData tickersDataOLrzqt2 = this.valueOf.OLrzqt(spotInstrumentValues.getQuoteSymbol());
                    if (tickersDataOLrzqt == null || tickersDataOLrzqt2 == null) {
                        C41434qqj.KWHzl.KWHzl("SubscribeSpotTickersUseCase", "get http tickers flow, cache hit is false, request immediately");
                        C41529qsY c41529qsY = this.OLrzqt;
                        subscribeSpotTickersUseCase$getHttpTickersFlow$1.L$0 = this;
                        subscribeSpotTickersUseCase$getHttpTickersFlow$1.label = 1;
                        objCopydefault = c41529qsY.copydefault((java.lang.Object) list, (Continuation) subscribeSpotTickersUseCase$getHttpTickersFlow$1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        c41598qto = this;
                    }
                }
            }
            C41434qqj.KWHzl.KWHzl("SubscribeSpotTickersUseCase", "get http tickers flow, cache hit is true, lazy request");
            return FlowKt.asFlow(new SubscribeSpotTickersUseCase$getHttpTickersFlow$4(this, list, null));
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c41598qto = (C41598qto) subscribeSpotTickersUseCase$getHttpTickersFlow$1.L$0;
        C56391yDq.AEQbTJ(objCopydefault);
        java.util.Map<java.lang.String, TickersData> map = (java.util.Map) objCopydefault;
        c41598qto.valueOf.OLrzqt(map);
        return FlowKt.flowOf(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.util.List<? extends InterfaceC41641que> list, Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) throws java.lang.Throwable {
        SubscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1 subscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        C41598qto c41598qto;
        if (continuation instanceof SubscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1) {
            subscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1 = (SubscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1) continuation;
            int i = subscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1 = new SubscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = subscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            SubscribeSpotTickersUseCase$getSubscribeWsTickersFlow$$inlined$executeAsyncTasks$1 subscribeSpotTickersUseCase$getSubscribeWsTickersFlow$$inlined$executeAsyncTasks$1 = new SubscribeSpotTickersUseCase$getSubscribeWsTickersFlow$$inlined$executeAsyncTasks$1(null, list, list);
            subscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1.L$0 = this;
            subscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1.label = 1;
            objCoroutineScope = CoroutineScopeKt.coroutineScope(subscribeSpotTickersUseCase$getSubscribeWsTickersFlow$$inlined$executeAsyncTasks$1, subscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1);
            if (objCoroutineScope == objCopydefault) {
                return objCopydefault;
            }
            c41598qto = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCoroutineScope);
                objM7377constructorimpl = Result.m7377constructorimpl((Flow) objCoroutineScope);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    C41434qqj.KWHzl.copydefault("SubscribeSpotTickersUseCase", "get subscribe ws tickers flow error", thM7380exceptionOrNullimpl);
                }
                return !Result.m7383isFailureimpl(objM7377constructorimpl) ? FlowKt.emptyFlow() : objM7377constructorimpl;
            }
            c41598qto = (C41598qto) subscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1.L$0;
            C56391yDq.AEQbTJ(objCoroutineScope);
        }
        kotlin.Pair pair = (kotlin.Pair) objCoroutineScope;
        java.util.List list2 = (java.util.List) pair.component1();
        java.util.List list3 = (java.util.List) pair.component2();
        Result.Application application2 = Result.Companion;
        C40426qVk c40426qVk = new C40426qVk(C56423yEv.EZpvd(C56390yDp.OLrzqt("SPOT", list2)), list3);
        C40427qVl c40427qVl = c41598qto.EZpvd;
        subscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1.L$0 = null;
        subscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1.label = 2;
        objCoroutineScope = c40427qVl.EZpvd(c40426qVk, subscribeSpotTickersUseCase$getSubscribeWsTickersFlow$1);
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

    /* JADX INFO: renamed from: o.qto$StateListAnimator */
    public static final class StateListAnimator implements Function1<InterfaceC41641que, java.lang.String> {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41641que interfaceC41641que) {
            Intrinsics.checkNotNullParameter(interfaceC41641que, "");
            return interfaceC41641que.values().getInstId();
        }
    }

    /* JADX INFO: renamed from: o.qto$ActionBar */
    public static final class ActionBar implements Function1<InterfaceC41641que, java.lang.String> {
        public static final ActionBar copydefault = new ActionBar();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41641que interfaceC41641que) {
            Intrinsics.checkNotNullParameter(interfaceC41641que, "");
            return interfaceC41641que.values().getQuoteSymbol();
        }
    }
}
