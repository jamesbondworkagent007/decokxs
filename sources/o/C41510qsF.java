package o;

import com.okinc.market.quotation.domain.options.SubscribeOptionsTickersUseCase$getHttpTickersFlow$1;
import com.okinc.market.quotation.domain.options.SubscribeOptionsTickersUseCase$getHttpTickersFlow$4;
import com.okinc.market.quotation.domain.options.SubscribeOptionsTickersUseCase$getSubscribeWsTickersFlow$1;
import com.okinc.market.quotation.domain.options.SubscribeOptionsTickersUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.options.SubscribeOptionsTickersUseCase$onExecute$1;
import com.okinc.market.quotation.domain.options.SubscribeOptionsTickersUseCase$onExecute$2;
import com.okinc.market.quotation.domain.options.SubscribeOptionsTickersUseCase$onExecute$3;
import com.okinc.market.quotation.domain.options.SubscribeOptionsTickersUseCase$onExecute$5;
import com.okinc.market.ticker.repo.MarkPriceTickersRepository;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41510qsF implements InterfaceC49404uns<kotlin.Pair<? extends java.util.List<? extends InterfaceC41642quf>, ? extends java.lang.Boolean>, Flow<? extends java.util.Map<java.lang.String, ? extends TickersData>>> {
    private static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public static final long OLrzqt = C38364pWa.KWHzl.OLrzqt();
    public final CoroutineDispatcher AEQbTJ;
    public final MarkPriceTickersRepository EZpvd;
    public final C41553qsw copydefault;
    public final C41439qqo djBIcL;

    @yCM
    public C41510qsF(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41439qqo c41439qqo, @NotNull MarkPriceTickersRepository markPriceTickersRepository, @NotNull C41553qsw c41553qsw) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41439qqo, "");
        Intrinsics.checkNotNullParameter(markPriceTickersRepository, "");
        Intrinsics.checkNotNullParameter(c41553qsw, "");
        this.AEQbTJ = coroutineDispatcher;
        this.djBIcL = c41439qqo;
        this.EZpvd = markPriceTickersRepository;
        this.copydefault = c41553qsw;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41642quf>, java.lang.Boolean> pair, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, pair, continuation);
    }

    /* JADX INFO: renamed from: o.qsF$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41642quf>, java.lang.Boolean> pair, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) throws java.lang.Throwable {
        SubscribeOptionsTickersUseCase$onExecute$1 subscribeOptionsTickersUseCase$onExecute$1;
        java.util.List<? extends InterfaceC41642quf> listComponent1;
        boolean zBooleanValue;
        C41510qsF c41510qsF;
        Flow flow;
        Flow flowEmptyFlow;
        C41510qsF c41510qsF2;
        Flow flow2;
        if (continuation instanceof SubscribeOptionsTickersUseCase$onExecute$1) {
            subscribeOptionsTickersUseCase$onExecute$1 = (SubscribeOptionsTickersUseCase$onExecute$1) continuation;
            int i = subscribeOptionsTickersUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeOptionsTickersUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeOptionsTickersUseCase$onExecute$1 = new SubscribeOptionsTickersUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = subscribeOptionsTickersUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeOptionsTickersUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            listComponent1 = pair.component1();
            zBooleanValue = pair.component2().booleanValue();
            C41434qqj c41434qqj = C41434qqj.KWHzl;
            c41434qqj.KWHzl("SubscribeOptionsTickersUseCase", "ticker start process, size=" + listComponent1.size() + ", isEnableWsTickers=" + zBooleanValue);
            if (listComponent1.isEmpty()) {
                C41434qqj.w$default(c41434qqj, "SubscribeOptionsTickersUseCase", "ticker input is empty", null, 4, null);
                return FlowKt.emptyFlow();
            }
            subscribeOptionsTickersUseCase$onExecute$1.L$0 = this;
            subscribeOptionsTickersUseCase$onExecute$1.L$1 = listComponent1;
            subscribeOptionsTickersUseCase$onExecute$1.Z$0 = zBooleanValue;
            subscribeOptionsTickersUseCase$onExecute$1.label = 1;
            objEZpvd = EZpvd(listComponent1, subscribeOptionsTickersUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41510qsF = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flow2 = (Flow) subscribeOptionsTickersUseCase$onExecute$1.L$1;
                c41510qsF2 = (C41510qsF) subscribeOptionsTickersUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                Flow flow3 = (Flow) objEZpvd;
                c41510qsF = c41510qsF2;
                flow = flow2;
                flowEmptyFlow = flow3;
                return FlowKt.flowOn(FlowKt.onStart(new ActionBar(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flow, flowEmptyFlow), new SubscribeOptionsTickersUseCase$onExecute$2(c41510qsF.djBIcL)), new SubscribeOptionsTickersUseCase$onExecute$3(null)), OLrzqt), c41510qsF), new SubscribeOptionsTickersUseCase$onExecute$5(c41510qsF, null)), c41510qsF.AEQbTJ);
            }
            zBooleanValue = subscribeOptionsTickersUseCase$onExecute$1.Z$0;
            listComponent1 = (java.util.List) subscribeOptionsTickersUseCase$onExecute$1.L$1;
            c41510qsF = (C41510qsF) subscribeOptionsTickersUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        flow = (Flow) objEZpvd;
        if (zBooleanValue) {
            subscribeOptionsTickersUseCase$onExecute$1.L$0 = c41510qsF;
            subscribeOptionsTickersUseCase$onExecute$1.L$1 = flow;
            subscribeOptionsTickersUseCase$onExecute$1.label = 2;
            java.lang.Object objKWHzl = c41510qsF.KWHzl(listComponent1, (Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>>) subscribeOptionsTickersUseCase$onExecute$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c41510qsF2 = c41510qsF;
            objEZpvd = objKWHzl;
            flow2 = flow;
            Flow flow32 = (Flow) objEZpvd;
            c41510qsF = c41510qsF2;
            flow = flow2;
            flowEmptyFlow = flow32;
            return FlowKt.flowOn(FlowKt.onStart(new ActionBar(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flow, flowEmptyFlow), new SubscribeOptionsTickersUseCase$onExecute$2(c41510qsF.djBIcL)), new SubscribeOptionsTickersUseCase$onExecute$3(null)), OLrzqt), c41510qsF), new SubscribeOptionsTickersUseCase$onExecute$5(c41510qsF, null)), c41510qsF.AEQbTJ);
        }
        flowEmptyFlow = FlowKt.emptyFlow();
        return FlowKt.flowOn(FlowKt.onStart(new ActionBar(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flow, flowEmptyFlow), new SubscribeOptionsTickersUseCase$onExecute$2(c41510qsF.djBIcL)), new SubscribeOptionsTickersUseCase$onExecute$3(null)), OLrzqt), c41510qsF), new SubscribeOptionsTickersUseCase$onExecute$5(c41510qsF, null)), c41510qsF.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.qsF$ActionBar */
    public static final class ActionBar implements Flow<java.util.Map<java.lang.String, ? extends TickersData>> {
        public final /* synthetic */ C41510qsF AEQbTJ;
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.qsF$ActionBar$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ C41510qsF copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, C41510qsF c41510qsF) {
                this.EZpvd = flowCollector;
                this.copydefault = c41510qsF;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeOptionsTickersUseCase$onExecute$$inlined$map$1$2$1 subscribeOptionsTickersUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeOptionsTickersUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeOptionsTickersUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeOptionsTickersUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeOptionsTickersUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeOptionsTickersUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeOptionsTickersUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeOptionsTickersUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeOptionsTickersUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeOptionsTickersUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.util.Map<java.lang.String, TickersData> mapKWHzl = this.copydefault.djBIcL.KWHzl();
                    C41434qqj.KWHzl.AEQbTJ("SubscribeOptionsTickersUseCase", "ticker flow map [size: " + mapKWHzl.size() + "]");
                    subscribeOptionsTickersUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(mapKWHzl, subscribeOptionsTickersUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, C41510qsF c41510qsF) {
            this.EZpvd = flow;
            this.AEQbTJ = c41510qsF;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.Map<java.lang.String, ? extends TickersData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass3(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
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
    public final java.lang.Object EZpvd(java.util.List<? extends InterfaceC41642quf> list, Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) throws java.lang.Throwable {
        SubscribeOptionsTickersUseCase$getHttpTickersFlow$1 subscribeOptionsTickersUseCase$getHttpTickersFlow$1;
        C41510qsF c41510qsF;
        if (continuation instanceof SubscribeOptionsTickersUseCase$getHttpTickersFlow$1) {
            subscribeOptionsTickersUseCase$getHttpTickersFlow$1 = (SubscribeOptionsTickersUseCase$getHttpTickersFlow$1) continuation;
            int i = subscribeOptionsTickersUseCase$getHttpTickersFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeOptionsTickersUseCase$getHttpTickersFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeOptionsTickersUseCase$getHttpTickersFlow$1 = new SubscribeOptionsTickersUseCase$getHttpTickersFlow$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = subscribeOptionsTickersUseCase$getHttpTickersFlow$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = subscribeOptionsTickersUseCase$getHttpTickersFlow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, 10);
            if (!(listAhwBna instanceof java.util.Collection) || !listAhwBna.isEmpty()) {
                java.util.Iterator it = listAhwBna.iterator();
                while (it.hasNext()) {
                    if (this.djBIcL.OLrzqt(((InterfaceC41642quf) it.next()).OLrzqt().getInstId()) == null) {
                        C41434qqj.KWHzl.KWHzl("SubscribeOptionsTickersUseCase", "get http tickers flow, cache hit is false, request immediately");
                        C41553qsw c41553qsw = this.copydefault;
                        subscribeOptionsTickersUseCase$getHttpTickersFlow$1.L$0 = this;
                        subscribeOptionsTickersUseCase$getHttpTickersFlow$1.label = 1;
                        objCopydefault = c41553qsw.copydefault(list, subscribeOptionsTickersUseCase$getHttpTickersFlow$1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        c41510qsF = this;
                    }
                }
            }
            C41434qqj.KWHzl.KWHzl("SubscribeOptionsTickersUseCase", "get http tickers flow, cache hit is true, lazy request");
            return FlowKt.asFlow(new SubscribeOptionsTickersUseCase$getHttpTickersFlow$4(this, list, null));
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c41510qsF = (C41510qsF) subscribeOptionsTickersUseCase$getHttpTickersFlow$1.L$0;
        C56391yDq.AEQbTJ(objCopydefault);
        java.util.Map<java.lang.String, TickersData> map = (java.util.Map) objCopydefault;
        c41510qsF.djBIcL.OLrzqt(map);
        return FlowKt.flowOf(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.util.List<? extends InterfaceC41642quf> list, Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) throws java.lang.Throwable {
        SubscribeOptionsTickersUseCase$getSubscribeWsTickersFlow$1 subscribeOptionsTickersUseCase$getSubscribeWsTickersFlow$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof SubscribeOptionsTickersUseCase$getSubscribeWsTickersFlow$1) {
            subscribeOptionsTickersUseCase$getSubscribeWsTickersFlow$1 = (SubscribeOptionsTickersUseCase$getSubscribeWsTickersFlow$1) continuation;
            int i = subscribeOptionsTickersUseCase$getSubscribeWsTickersFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeOptionsTickersUseCase$getSubscribeWsTickersFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeOptionsTickersUseCase$getSubscribeWsTickersFlow$1 = new SubscribeOptionsTickersUseCase$getSubscribeWsTickersFlow$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = subscribeOptionsTickersUseCase$getSubscribeWsTickersFlow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeOptionsTickersUseCase$getSubscribeWsTickersFlow$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Result.Application application = Result.Companion;
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC41642quf) it.next()).OLrzqt().getInstId());
                }
                MarkPriceTickersRepository markPriceTickersRepository = this.EZpvd;
                subscribeOptionsTickersUseCase$getSubscribeWsTickersFlow$1.label = 1;
                objEZpvd = markPriceTickersRepository.EZpvd(arrayList, subscribeOptionsTickersUseCase$getSubscribeWsTickersFlow$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((Flow) objEZpvd);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C41434qqj.KWHzl.copydefault("SubscribeOptionsTickersUseCase", "get subscribe ws tickers flow error", thM7380exceptionOrNullimpl);
        }
        return Result.m7383isFailureimpl(objM7377constructorimpl) ? FlowKt.emptyFlow() : objM7377constructorimpl;
    }
}
