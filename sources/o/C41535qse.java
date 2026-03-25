package o;

import com.okinc.market.quotation.domain.futures.SubscribeFuturesTickersUseCase$getHttpTickersFlow$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesTickersUseCase$getHttpTickersFlow$4;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$$inlined$executeAsyncTasks$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesTickersUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesTickersUseCase$onExecute$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesTickersUseCase$onExecute$2;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesTickersUseCase$onExecute$3;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesTickersUseCase$onExecute$5;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
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

/* JADX INFO: renamed from: o.qse, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41535qse implements InterfaceC49404uns<kotlin.Pair<? extends java.util.List<? extends InterfaceC41638qub>, ? extends java.lang.Boolean>, Flow<? extends java.util.Map<java.lang.String, ? extends TickersData>>> {
    public final C41439qqo AhwBna;
    public final C41475qrX EZpvd;
    public final C40427qVl OLrzqt;
    public final CoroutineDispatcher copydefault;
    private static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public static final long AEQbTJ = C38364pWa.KWHzl.OLrzqt();

    @yCM
    public C41535qse(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41439qqo c41439qqo, @NotNull C40427qVl c40427qVl, @NotNull C41475qrX c41475qrX) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41439qqo, "");
        Intrinsics.checkNotNullParameter(c40427qVl, "");
        Intrinsics.checkNotNullParameter(c41475qrX, "");
        this.copydefault = coroutineDispatcher;
        this.AhwBna = c41439qqo;
        this.OLrzqt = c40427qVl;
        this.EZpvd = c41475qrX;
    }

    public java.lang.Object AEQbTJ(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41638qub>, java.lang.Boolean> pair, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, pair, continuation);
    }

    public /* synthetic */ java.lang.Object EZpvd(java.lang.Object obj, Continuation continuation) {
        return AEQbTJ((kotlin.Pair<? extends java.util.List<? extends InterfaceC41638qub>, java.lang.Boolean>) obj, (Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>>) continuation);
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
        return KWHzl((kotlin.Pair<? extends java.util.List<? extends InterfaceC41638qub>, java.lang.Boolean>) obj, (Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX INFO: renamed from: o.qse$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qse.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.qse$Dialog */
    public static final class Dialog implements Flow<java.util.Map<java.lang.String, ? extends TickersData>> {
        public final /* synthetic */ C41535qse KWHzl;
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.qse$Dialog$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ C41535qse OLrzqt;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, C41535qse c41535qse) {
                this.copydefault = flowCollector;
                this.OLrzqt = c41535qse;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeFuturesTickersUseCase$onExecute$$inlined$map$1$2$1 subscribeFuturesTickersUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeFuturesTickersUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeFuturesTickersUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeFuturesTickersUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeFuturesTickersUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeFuturesTickersUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeFuturesTickersUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeFuturesTickersUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeFuturesTickersUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeFuturesTickersUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.util.Map<java.lang.String, TickersData> mapKWHzl = this.OLrzqt.AhwBna.KWHzl();
                    C41434qqj.KWHzl.AEQbTJ("SubscribeFuturesTickersUseCase", "ticker flow map [size: " + mapKWHzl.size() + "]");
                    subscribeFuturesTickersUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(mapKWHzl, subscribeFuturesTickersUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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

        public Dialog(Flow flow, C41535qse c41535qse) {
            this.OLrzqt = flow;
            this.KWHzl = c41535qse;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.Map<java.lang.String, ? extends TickersData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass4(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41638qub>, java.lang.Boolean> pair, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) throws java.lang.Throwable {
        SubscribeFuturesTickersUseCase$onExecute$1 subscribeFuturesTickersUseCase$onExecute$1;
        java.util.List<? extends InterfaceC41638qub> listComponent1;
        boolean zBooleanValue;
        C41535qse c41535qse;
        Flow flow;
        Flow flowEmptyFlow;
        C41535qse c41535qse2;
        Flow flow2;
        if (continuation instanceof SubscribeFuturesTickersUseCase$onExecute$1) {
            subscribeFuturesTickersUseCase$onExecute$1 = (SubscribeFuturesTickersUseCase$onExecute$1) continuation;
            int i = subscribeFuturesTickersUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeFuturesTickersUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeFuturesTickersUseCase$onExecute$1 = new SubscribeFuturesTickersUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = subscribeFuturesTickersUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeFuturesTickersUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            listComponent1 = pair.component1();
            zBooleanValue = pair.component2().booleanValue();
            C41434qqj c41434qqj = C41434qqj.KWHzl;
            c41434qqj.KWHzl("SubscribeFuturesTickersUseCase", "ticker start process, size=" + listComponent1.size() + ", isEnableWsTickers=" + zBooleanValue);
            if (listComponent1.isEmpty()) {
                C41434qqj.w$default(c41434qqj, "SubscribeFuturesTickersUseCase", "ticker input is empty", null, 4, null);
                return FlowKt.emptyFlow();
            }
            subscribeFuturesTickersUseCase$onExecute$1.L$0 = this;
            subscribeFuturesTickersUseCase$onExecute$1.L$1 = listComponent1;
            subscribeFuturesTickersUseCase$onExecute$1.Z$0 = zBooleanValue;
            subscribeFuturesTickersUseCase$onExecute$1.label = 1;
            objAEQbTJ = AEQbTJ(listComponent1, subscribeFuturesTickersUseCase$onExecute$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c41535qse = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flow2 = (Flow) subscribeFuturesTickersUseCase$onExecute$1.L$1;
                c41535qse2 = (C41535qse) subscribeFuturesTickersUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                Flow flow3 = (Flow) objAEQbTJ;
                c41535qse = c41535qse2;
                flow = flow2;
                flowEmptyFlow = flow3;
                return FlowKt.flowOn(FlowKt.onStart(new Dialog(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flow, flowEmptyFlow), new SubscribeFuturesTickersUseCase$onExecute$2(c41535qse.AhwBna)), new SubscribeFuturesTickersUseCase$onExecute$3(null)), AEQbTJ), c41535qse), new SubscribeFuturesTickersUseCase$onExecute$5(c41535qse, null)), c41535qse.copydefault);
            }
            zBooleanValue = subscribeFuturesTickersUseCase$onExecute$1.Z$0;
            listComponent1 = (java.util.List) subscribeFuturesTickersUseCase$onExecute$1.L$1;
            c41535qse = (C41535qse) subscribeFuturesTickersUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        flow = (Flow) objAEQbTJ;
        if (zBooleanValue) {
            subscribeFuturesTickersUseCase$onExecute$1.L$0 = c41535qse;
            subscribeFuturesTickersUseCase$onExecute$1.L$1 = flow;
            subscribeFuturesTickersUseCase$onExecute$1.label = 2;
            java.lang.Object objOLrzqt = c41535qse.OLrzqt(listComponent1, subscribeFuturesTickersUseCase$onExecute$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c41535qse2 = c41535qse;
            objAEQbTJ = objOLrzqt;
            flow2 = flow;
            Flow flow32 = (Flow) objAEQbTJ;
            c41535qse = c41535qse2;
            flow = flow2;
            flowEmptyFlow = flow32;
            return FlowKt.flowOn(FlowKt.onStart(new Dialog(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flow, flowEmptyFlow), new SubscribeFuturesTickersUseCase$onExecute$2(c41535qse.AhwBna)), new SubscribeFuturesTickersUseCase$onExecute$3(null)), AEQbTJ), c41535qse), new SubscribeFuturesTickersUseCase$onExecute$5(c41535qse, null)), c41535qse.copydefault);
        }
        flowEmptyFlow = FlowKt.emptyFlow();
        return FlowKt.flowOn(FlowKt.onStart(new Dialog(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flow, flowEmptyFlow), new SubscribeFuturesTickersUseCase$onExecute$2(c41535qse.AhwBna)), new SubscribeFuturesTickersUseCase$onExecute$3(null)), AEQbTJ), c41535qse), new SubscribeFuturesTickersUseCase$onExecute$5(c41535qse, null)), c41535qse.copydefault);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ java.lang.Object AEQbTJ(C41439qqo c41439qqo, java.util.Map map, Continuation continuation) {
        c41439qqo.OLrzqt((java.util.Map<java.lang.String, TickersData>) map);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.util.List<? extends InterfaceC41638qub> list, Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) throws java.lang.Throwable {
        SubscribeFuturesTickersUseCase$getHttpTickersFlow$1 subscribeFuturesTickersUseCase$getHttpTickersFlow$1;
        C41535qse c41535qse;
        if (continuation instanceof SubscribeFuturesTickersUseCase$getHttpTickersFlow$1) {
            subscribeFuturesTickersUseCase$getHttpTickersFlow$1 = (SubscribeFuturesTickersUseCase$getHttpTickersFlow$1) continuation;
            int i = subscribeFuturesTickersUseCase$getHttpTickersFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeFuturesTickersUseCase$getHttpTickersFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeFuturesTickersUseCase$getHttpTickersFlow$1 = new SubscribeFuturesTickersUseCase$getHttpTickersFlow$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = subscribeFuturesTickersUseCase$getHttpTickersFlow$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = subscribeFuturesTickersUseCase$getHttpTickersFlow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            java.util.List<InterfaceC41638qub> listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, 10);
            if (!(listAhwBna instanceof java.util.Collection) || !listAhwBna.isEmpty()) {
                for (InterfaceC41638qub interfaceC41638qub : listAhwBna) {
                    TickersData tickersDataOLrzqt = this.AhwBna.OLrzqt(interfaceC41638qub.values().getInstId());
                    TickersData tickersDataOLrzqt2 = this.AhwBna.OLrzqt(interfaceC41638qub.ejfBZ());
                    TickersData tickersDataOLrzqt3 = this.AhwBna.OLrzqt(interfaceC41638qub.isConnected());
                    if (tickersDataOLrzqt == null || tickersDataOLrzqt2 == null || tickersDataOLrzqt3 == null) {
                        C41434qqj.KWHzl.KWHzl("SubscribeFuturesTickersUseCase", "get http tickers flow, cache hit is false, request immediately");
                        C41475qrX c41475qrX = this.EZpvd;
                        subscribeFuturesTickersUseCase$getHttpTickersFlow$1.L$0 = this;
                        subscribeFuturesTickersUseCase$getHttpTickersFlow$1.label = 1;
                        objCopydefault = c41475qrX.copydefault(list, subscribeFuturesTickersUseCase$getHttpTickersFlow$1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        c41535qse = this;
                    }
                }
            }
            C41434qqj.KWHzl.KWHzl("SubscribeFuturesTickersUseCase", "get http tickers flow, cache hit is true, lazy request");
            return FlowKt.asFlow(new SubscribeFuturesTickersUseCase$getHttpTickersFlow$4(this, list, null));
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c41535qse = (C41535qse) subscribeFuturesTickersUseCase$getHttpTickersFlow$1.L$0;
        C56391yDq.AEQbTJ(objCopydefault);
        java.util.Map<java.lang.String, TickersData> map = (java.util.Map) objCopydefault;
        c41535qse.AhwBna.OLrzqt(map);
        return FlowKt.flowOf(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.util.List<? extends InterfaceC41638qub> list, Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) throws java.lang.Throwable {
        SubscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1 subscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        C41535qse c41535qse;
        if (continuation instanceof SubscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1) {
            subscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1 = (SubscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1) continuation;
            int i = subscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1 = new SubscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = subscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj : list) {
                InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(((InterfaceC41638qub) obj).values().getClass());
                java.lang.Object arrayList = linkedHashMap.get(interfaceC56551yJoAEQbTJ);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    linkedHashMap.put(interfaceC56551yJoAEQbTJ, arrayList);
                }
                ((java.util.List) arrayList).add(obj);
            }
            SubscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$$inlined$executeAsyncTasks$1 subscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$$inlined$executeAsyncTasks$1 = new SubscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$$inlined$executeAsyncTasks$1(null, (java.util.List) linkedHashMap.get(C56524yIo.AEQbTJ(SwapInstrument.class)), (java.util.List) linkedHashMap.get(C56524yIo.AEQbTJ(FutureInstrument.class)), list, list);
            subscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1.L$0 = this;
            subscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1.label = 1;
            objCoroutineScope = CoroutineScopeKt.coroutineScope(subscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$$inlined$executeAsyncTasks$1, subscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1);
            if (objCoroutineScope == objCopydefault) {
                return objCopydefault;
            }
            c41535qse = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCoroutineScope);
                objM7377constructorimpl = Result.m7377constructorimpl((Flow) objCoroutineScope);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    C41434qqj.KWHzl.copydefault("SubscribeFuturesTickersUseCase", "get subscribe ws tickers flow error", thM7380exceptionOrNullimpl);
                }
                return !Result.m7383isFailureimpl(objM7377constructorimpl) ? FlowKt.emptyFlow() : objM7377constructorimpl;
            }
            c41535qse = (C41535qse) subscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1.L$0;
            C56391yDq.AEQbTJ(objCoroutineScope);
        }
        Quartet quartet = (Quartet) objCoroutineScope;
        java.util.List list2 = (java.util.List) quartet.component1();
        java.util.List list3 = (java.util.List) quartet.component2();
        java.util.List list4 = (java.util.List) quartet.component3();
        java.util.List list5 = (java.util.List) quartet.component4();
        Result.Application application2 = Result.Companion;
        C40426qVk c40426qVk = new C40426qVk(C56424yEw.gEmmrt(C56390yDp.OLrzqt("SWAP", list2), C56390yDp.OLrzqt("FUTURES", list3)), CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list4, (java.lang.Iterable) list5));
        C40427qVl c40427qVl = c41535qse.OLrzqt;
        subscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1.L$0 = null;
        subscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1.label = 2;
        objCoroutineScope = c40427qVl.EZpvd(c40426qVk, subscribeFuturesTickersUseCase$getSubscribeWsTickersFlow$1);
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

    /* JADX INFO: renamed from: o.qse$ActionBar */
    public static final class ActionBar implements Function1<InterfaceC41638qub, java.lang.String> {
        public static final ActionBar AEQbTJ = new ActionBar();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41638qub interfaceC41638qub) {
            Intrinsics.checkNotNullParameter(interfaceC41638qub, "");
            return interfaceC41638qub.values().getInstId();
        }
    }

    /* JADX INFO: renamed from: o.qse$StateListAnimator */
    public static final class StateListAnimator implements Function1<InterfaceC41638qub, java.lang.String> {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41638qub interfaceC41638qub) {
            Intrinsics.checkNotNullParameter(interfaceC41638qub, "");
            return interfaceC41638qub.values().getInstId();
        }
    }

    /* JADX INFO: renamed from: o.qse$Activity */
    public static final class Activity implements Function1<InterfaceC41638qub, java.lang.String> {
        public static final Activity copydefault = new Activity();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41638qub interfaceC41638qub) {
            Intrinsics.checkNotNullParameter(interfaceC41638qub, "");
            return interfaceC41638qub.ejfBZ();
        }
    }

    /* JADX INFO: renamed from: o.qse$TaskDescription */
    public static final class TaskDescription implements Function1<InterfaceC41638qub, java.lang.String> {
        public static final TaskDescription EZpvd = new TaskDescription();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41638qub interfaceC41638qub) {
            Intrinsics.checkNotNullParameter(interfaceC41638qub, "");
            return interfaceC41638qub.isConnected();
        }
    }
}
