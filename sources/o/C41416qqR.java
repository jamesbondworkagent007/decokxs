package o;

import com.okinc.market.quotation.domain.coin.SubscribeCoinTickersUseCase$getSubscribeWsTickersFlow$1;
import com.okinc.market.quotation.domain.coin.SubscribeCoinTickersUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.coin.SubscribeCoinTickersUseCase$onExecute$1;
import com.okinc.market.quotation.domain.coin.SubscribeCoinTickersUseCase$onExecute$2;
import com.okinc.market.quotation.domain.coin.SubscribeCoinTickersUseCase$onExecute$3;
import com.okinc.market.quotation.domain.coin.SubscribeCoinTickersUseCase$onExecute$5;
import com.okinc.market.quotation.domain.coin.SubscribeCoinTickersUseCase$onExecute$httpTickersFlow$3;
import com.okinc.unify_trade.biz.TradeCoinInfo;
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

/* JADX INFO: renamed from: o.qqR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41416qqR implements InterfaceC49404uns<kotlin.Pair<? extends java.util.List<? extends InterfaceC41583qtZ>, ? extends java.lang.Boolean>, Flow<? extends java.util.Map<java.lang.String, ? extends TickersData>>> {
    public final C40427qVl EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final C41409qqK copydefault;
    public final C41439qqo gEmmrt;
    private static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public static final long AEQbTJ = C38364pWa.KWHzl.OLrzqt();

    @yCM
    public C41416qqR(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41439qqo c41439qqo, @NotNull C40427qVl c40427qVl, @NotNull C41409qqK c41409qqK) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41439qqo, "");
        Intrinsics.checkNotNullParameter(c40427qVl, "");
        Intrinsics.checkNotNullParameter(c41409qqK, "");
        this.OLrzqt = coroutineDispatcher;
        this.gEmmrt = c41439qqo;
        this.EZpvd = c40427qVl;
        this.copydefault = c41409qqK;
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
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((kotlin.Pair<? extends java.util.List<? extends InterfaceC41583qtZ>, java.lang.Boolean>) obj, (Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object EZpvd(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41583qtZ>, java.lang.Boolean> pair, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, pair, continuation);
    }

    /* JADX INFO: renamed from: o.qqR$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qqR.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41583qtZ>, java.lang.Boolean> pair, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) throws java.lang.Throwable {
        SubscribeCoinTickersUseCase$onExecute$1 subscribeCoinTickersUseCase$onExecute$1;
        java.util.List<? extends InterfaceC41583qtZ> listComponent1;
        boolean zBooleanValue;
        C41416qqR c41416qqR;
        Flow flowAsFlow;
        TradeCoinInfo tradeCoinInfoDjBIcL;
        java.lang.String symbol;
        Flow flowEmptyFlow;
        C41416qqR c41416qqR2;
        Flow flow;
        if (continuation instanceof SubscribeCoinTickersUseCase$onExecute$1) {
            subscribeCoinTickersUseCase$onExecute$1 = (SubscribeCoinTickersUseCase$onExecute$1) continuation;
            int i = subscribeCoinTickersUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeCoinTickersUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeCoinTickersUseCase$onExecute$1 = new SubscribeCoinTickersUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = subscribeCoinTickersUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeCoinTickersUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            listComponent1 = pair.component1();
            zBooleanValue = pair.component2().booleanValue();
            C41434qqj c41434qqj = C41434qqj.KWHzl;
            c41434qqj.KWHzl("SubscribeCoinTickersUseCase", "ticker start process, [coinVoList: " + listComponent1.size() + ", isEnableWsTickers: " + zBooleanValue + "]");
            if (listComponent1.isEmpty()) {
                C41434qqj.w$default(c41434qqj, "SubscribeCoinTickersUseCase", "ticker input is empty", null, 4, null);
                return FlowKt.emptyFlow();
            }
            InterfaceC41583qtZ interfaceC41583qtZ = (InterfaceC41583qtZ) CollectionsKt___CollectionsKt.EZpvd(listComponent1, kotlin.random.Random.Default);
            if (((interfaceC41583qtZ == null || (tradeCoinInfoDjBIcL = interfaceC41583qtZ.djBIcL()) == null || (symbol = tradeCoinInfoDjBIcL.getSymbol()) == null) ? null : this.gEmmrt.OLrzqt(symbol)) == null) {
                c41434qqj.KWHzl("SubscribeCoinTickersUseCase", "ticker cache is empty, request http tickers");
                C41409qqK c41409qqK = this.copydefault;
                subscribeCoinTickersUseCase$onExecute$1.L$0 = this;
                subscribeCoinTickersUseCase$onExecute$1.L$1 = listComponent1;
                subscribeCoinTickersUseCase$onExecute$1.Z$0 = zBooleanValue;
                subscribeCoinTickersUseCase$onExecute$1.label = 1;
                objAEQbTJ = c41409qqK.AEQbTJ(listComponent1, subscribeCoinTickersUseCase$onExecute$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                c41416qqR = this;
            } else {
                c41434qqj.KWHzl("SubscribeCoinTickersUseCase", "ticker cache is not empty, request http tickers by flow");
                flowAsFlow = FlowKt.asFlow(new SubscribeCoinTickersUseCase$onExecute$httpTickersFlow$3(this, listComponent1, null));
                c41416qqR = this;
                if (!zBooleanValue) {
                    subscribeCoinTickersUseCase$onExecute$1.L$0 = c41416qqR;
                    subscribeCoinTickersUseCase$onExecute$1.L$1 = flowAsFlow;
                    subscribeCoinTickersUseCase$onExecute$1.label = 2;
                    java.lang.Object objAEQbTJ2 = c41416qqR.AEQbTJ(listComponent1, subscribeCoinTickersUseCase$onExecute$1);
                    if (objAEQbTJ2 == objCopydefault) {
                        return objCopydefault;
                    }
                    c41416qqR2 = c41416qqR;
                    Flow flow2 = flowAsFlow;
                    objAEQbTJ = objAEQbTJ2;
                    flow = flow2;
                    Flow flow3 = (Flow) objAEQbTJ;
                    c41416qqR = c41416qqR2;
                    flowAsFlow = flow;
                    flowEmptyFlow = flow3;
                    return FlowKt.flowOn(FlowKt.onStart(new Activity(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flowAsFlow, flowEmptyFlow), new SubscribeCoinTickersUseCase$onExecute$2(c41416qqR.gEmmrt)), new SubscribeCoinTickersUseCase$onExecute$3(null)), AEQbTJ), c41416qqR), new SubscribeCoinTickersUseCase$onExecute$5(c41416qqR, null)), c41416qqR.OLrzqt);
                }
                flowEmptyFlow = FlowKt.emptyFlow();
                return FlowKt.flowOn(FlowKt.onStart(new Activity(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flowAsFlow, flowEmptyFlow), new SubscribeCoinTickersUseCase$onExecute$2(c41416qqR.gEmmrt)), new SubscribeCoinTickersUseCase$onExecute$3(null)), AEQbTJ), c41416qqR), new SubscribeCoinTickersUseCase$onExecute$5(c41416qqR, null)), c41416qqR.OLrzqt);
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flow = (Flow) subscribeCoinTickersUseCase$onExecute$1.L$1;
                c41416qqR2 = (C41416qqR) subscribeCoinTickersUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                Flow flow32 = (Flow) objAEQbTJ;
                c41416qqR = c41416qqR2;
                flowAsFlow = flow;
                flowEmptyFlow = flow32;
                return FlowKt.flowOn(FlowKt.onStart(new Activity(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flowAsFlow, flowEmptyFlow), new SubscribeCoinTickersUseCase$onExecute$2(c41416qqR.gEmmrt)), new SubscribeCoinTickersUseCase$onExecute$3(null)), AEQbTJ), c41416qqR), new SubscribeCoinTickersUseCase$onExecute$5(c41416qqR, null)), c41416qqR.OLrzqt);
            }
            zBooleanValue = subscribeCoinTickersUseCase$onExecute$1.Z$0;
            listComponent1 = (java.util.List) subscribeCoinTickersUseCase$onExecute$1.L$1;
            c41416qqR = (C41416qqR) subscribeCoinTickersUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        java.util.Map<java.lang.String, TickersData> map = (java.util.Map) objAEQbTJ;
        c41416qqR.gEmmrt.OLrzqt(map);
        flowAsFlow = FlowKt.flowOf(map);
        if (!zBooleanValue) {
        }
    }

    /* JADX INFO: renamed from: o.qqR$Activity */
    public static final class Activity implements Flow<java.util.Map<java.lang.String, ? extends TickersData>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C41416qqR copydefault;

        /* JADX INFO: renamed from: o.qqR$Activity$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ C41416qqR EZpvd;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C41416qqR c41416qqR) {
                this.OLrzqt = flowCollector;
                this.EZpvd = c41416qqR;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeCoinTickersUseCase$onExecute$$inlined$map$1$2$1 subscribeCoinTickersUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeCoinTickersUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeCoinTickersUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeCoinTickersUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeCoinTickersUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeCoinTickersUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeCoinTickersUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeCoinTickersUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeCoinTickersUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeCoinTickersUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.util.Map<java.lang.String, TickersData> mapKWHzl = this.EZpvd.gEmmrt.KWHzl();
                    C41434qqj.KWHzl.AEQbTJ("SubscribeCoinTickersUseCase", "ticker flow map [size: " + mapKWHzl.size() + "]");
                    subscribeCoinTickersUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(mapKWHzl, subscribeCoinTickersUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow, C41416qqR c41416qqR) {
            this.AEQbTJ = flow;
            this.copydefault = c41416qqR;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.Map<java.lang.String, ? extends TickersData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ java.lang.Object EZpvd(C41439qqo c41439qqo, java.util.Map map, Continuation continuation) {
        c41439qqo.OLrzqt((java.util.Map<java.lang.String, TickersData>) map);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.util.List<? extends InterfaceC41583qtZ> list, Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) throws java.lang.Throwable {
        SubscribeCoinTickersUseCase$getSubscribeWsTickersFlow$1 subscribeCoinTickersUseCase$getSubscribeWsTickersFlow$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof SubscribeCoinTickersUseCase$getSubscribeWsTickersFlow$1) {
            subscribeCoinTickersUseCase$getSubscribeWsTickersFlow$1 = (SubscribeCoinTickersUseCase$getSubscribeWsTickersFlow$1) continuation;
            int i = subscribeCoinTickersUseCase$getSubscribeWsTickersFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeCoinTickersUseCase$getSubscribeWsTickersFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeCoinTickersUseCase$getSubscribeWsTickersFlow$1 = new SubscribeCoinTickersUseCase$getSubscribeWsTickersFlow$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = subscribeCoinTickersUseCase$getSubscribeWsTickersFlow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeCoinTickersUseCase$getSubscribeWsTickersFlow$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                java.util.List listEZpvd = C41389qpr.EZpvd(list, new Function1() { // from class: o.qqQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C41416qqR.EZpvd((InterfaceC41583qtZ) obj);
                    }
                });
                Result.Application application = Result.Companion;
                C40426qVk c40426qVk = new C40426qVk(null, listEZpvd);
                C40427qVl c40427qVl = this.EZpvd;
                subscribeCoinTickersUseCase$getSubscribeWsTickersFlow$1.label = 1;
                objEZpvd = c40427qVl.EZpvd(c40426qVk, subscribeCoinTickersUseCase$getSubscribeWsTickersFlow$1);
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
            C41434qqj.KWHzl.copydefault("SubscribeCoinTickersUseCase", "subscribe ws tickers flow error", thM7380exceptionOrNullimpl);
        }
        return Result.m7383isFailureimpl(objM7377constructorimpl) ? FlowKt.emptyFlow() : objM7377constructorimpl;
    }

    public static final java.lang.String EZpvd(InterfaceC41583qtZ interfaceC41583qtZ) {
        Intrinsics.checkNotNullParameter(interfaceC41583qtZ, "");
        return interfaceC41583qtZ.djBIcL().getSymbol();
    }
}
