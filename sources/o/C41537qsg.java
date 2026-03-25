package o;

import com.okinc.market.quotation.data.model.PeriodTickersPo;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesPeriodTickersUseCase$getHttpCupTickers$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesPeriodTickersUseCase$getHttpCupTickersFlow$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$$inlined$executeAsyncTasks$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesPeriodTickersUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesPeriodTickersUseCase$onExecute$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesPeriodTickersUseCase$onExecute$2;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesPeriodTickersUseCase$onExecute$3;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesPeriodTickersUseCase$onExecute$5;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.unify_trade.biz.BizInstrument;
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

/* JADX INFO: renamed from: o.qsg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41537qsg implements InterfaceC49404uns<C41536qsf, Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> {
    public final C41403qqE AYXKKw;
    public final C41446qqv AhwBna;
    public final C41439qqo EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C40430qVo copydefault;
    private static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public static final long OLrzqt = C38364pWa.KWHzl.OLrzqt();

    /* JADX INFO: renamed from: o.qsg$Application */
    public static final class Application implements Flow<java.util.Map<java.lang.String, java.lang.Object>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C41537qsg KWHzl;

        /* JADX INFO: renamed from: o.qsg$Application$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ C41537qsg AEQbTJ;
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C41537qsg c41537qsg) {
                this.KWHzl = flowCollector;
                this.AEQbTJ = c41537qsg;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeFuturesPeriodTickersUseCase$onExecute$$inlined$map$1$2$1 subscribeFuturesPeriodTickersUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeFuturesPeriodTickersUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeFuturesPeriodTickersUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeFuturesPeriodTickersUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeFuturesPeriodTickersUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeFuturesPeriodTickersUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeFuturesPeriodTickersUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeFuturesPeriodTickersUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeFuturesPeriodTickersUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeFuturesPeriodTickersUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(this.AEQbTJ.AhwBna.KWHzl());
                    linkedHashMap.putAll(this.AEQbTJ.EZpvd.KWHzl());
                    C41434qqj.KWHzl.AEQbTJ("SubscribeFuturesPeriodTickersUseCase", "period ticker flow map [periodSize: " + this.AEQbTJ.AhwBna.KWHzl().size() + ", cupSize: " + this.AEQbTJ.EZpvd.KWHzl().size() + "]");
                    subscribeFuturesPeriodTickersUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(linkedHashMap, subscribeFuturesPeriodTickersUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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

        public Application(Flow flow, C41537qsg c41537qsg) {
            this.AEQbTJ = flow;
            this.KWHzl = c41537qsg;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.Map<java.lang.String, java.lang.Object>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public C41537qsg(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41446qqv c41446qqv, @NotNull C41439qqo c41439qqo, @NotNull C41403qqE c41403qqE, @NotNull C40430qVo c40430qVo) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41446qqv, "");
        Intrinsics.checkNotNullParameter(c41439qqo, "");
        Intrinsics.checkNotNullParameter(c41403qqE, "");
        Intrinsics.checkNotNullParameter(c40430qVo, "");
        this.KWHzl = coroutineDispatcher;
        this.AhwBna = c41446qqv;
        this.EZpvd = c41439qqo;
        this.AYXKKw = c41403qqE;
        this.copydefault = c40430qVo;
    }

    public /* bridge */ /* synthetic */ java.lang.Object AEQbTJ(java.lang.Object obj, Continuation continuation) {
        return AEQbTJ((C41536qsf) obj, (Continuation<? super Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>>) continuation);
    }

    public java.lang.Object AEQbTJ(@NotNull C41536qsf c41536qsf, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, c41536qsf, continuation);
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
        return EZpvd((C41536qsf) obj, (Continuation<? super Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX INFO: renamed from: o.qsg$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C41536qsf c41536qsf, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> continuation) throws java.lang.Throwable {
        SubscribeFuturesPeriodTickersUseCase$onExecute$1 subscribeFuturesPeriodTickersUseCase$onExecute$1;
        java.util.List<InterfaceC41638qub> listAEQbTJ;
        PeriodEnum periodEnumKWHzl;
        boolean zEZpvd;
        C41537qsg c41537qsg;
        Flow<java.util.Map<java.lang.String, java.lang.Object>> flow;
        Flow flow2;
        Flow flowEmptyFlow;
        Flow flow3;
        Flow<java.util.Map<java.lang.String, java.lang.Object>> flow4;
        C41537qsg c41537qsg2;
        if (continuation instanceof SubscribeFuturesPeriodTickersUseCase$onExecute$1) {
            subscribeFuturesPeriodTickersUseCase$onExecute$1 = (SubscribeFuturesPeriodTickersUseCase$onExecute$1) continuation;
            int i = subscribeFuturesPeriodTickersUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeFuturesPeriodTickersUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeFuturesPeriodTickersUseCase$onExecute$1 = new SubscribeFuturesPeriodTickersUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = subscribeFuturesPeriodTickersUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeFuturesPeriodTickersUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            listAEQbTJ = c41536qsf.AEQbTJ();
            periodEnumKWHzl = c41536qsf.KWHzl();
            zEZpvd = c41536qsf.EZpvd();
            C41434qqj c41434qqj = C41434qqj.KWHzl;
            c41434qqj.KWHzl("SubscribeFuturesPeriodTickersUseCase", "period ticker start process, period=" + periodEnumKWHzl + ", size=" + listAEQbTJ.size() + ", isEnableWsTickers=" + zEZpvd);
            if (listAEQbTJ.isEmpty()) {
                C41434qqj.w$default(c41434qqj, "SubscribeFuturesPeriodTickersUseCase", "period ticker input is empty", null, 4, null);
                return FlowKt.emptyFlow();
            }
            Flow<java.util.Map<java.lang.String, java.lang.Object>> flowAEQbTJ = AEQbTJ();
            subscribeFuturesPeriodTickersUseCase$onExecute$1.L$0 = this;
            subscribeFuturesPeriodTickersUseCase$onExecute$1.L$1 = listAEQbTJ;
            subscribeFuturesPeriodTickersUseCase$onExecute$1.L$2 = periodEnumKWHzl;
            subscribeFuturesPeriodTickersUseCase$onExecute$1.L$3 = flowAEQbTJ;
            subscribeFuturesPeriodTickersUseCase$onExecute$1.Z$0 = zEZpvd;
            subscribeFuturesPeriodTickersUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = EZpvd(listAEQbTJ, subscribeFuturesPeriodTickersUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41537qsg = this;
            flow = flowAEQbTJ;
            obj = objEZpvd;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flow3 = (Flow) subscribeFuturesPeriodTickersUseCase$onExecute$1.L$2;
                flow4 = (Flow) subscribeFuturesPeriodTickersUseCase$onExecute$1.L$1;
                c41537qsg2 = (C41537qsg) subscribeFuturesPeriodTickersUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                c41537qsg = c41537qsg2;
                flow = flow4;
                flowEmptyFlow = (Flow) obj;
                flow2 = flow3;
                return FlowKt.flowOn(FlowKt.onStart(new Application(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flow, flow2, flowEmptyFlow), new SubscribeFuturesPeriodTickersUseCase$onExecute$2(c41537qsg, null)), new SubscribeFuturesPeriodTickersUseCase$onExecute$3(null)), OLrzqt), c41537qsg), new SubscribeFuturesPeriodTickersUseCase$onExecute$5(c41537qsg, null)), c41537qsg.KWHzl);
            }
            zEZpvd = subscribeFuturesPeriodTickersUseCase$onExecute$1.Z$0;
            flow = (Flow) subscribeFuturesPeriodTickersUseCase$onExecute$1.L$3;
            periodEnumKWHzl = (PeriodEnum) subscribeFuturesPeriodTickersUseCase$onExecute$1.L$2;
            listAEQbTJ = (java.util.List) subscribeFuturesPeriodTickersUseCase$onExecute$1.L$1;
            c41537qsg = (C41537qsg) subscribeFuturesPeriodTickersUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        flow2 = (Flow) obj;
        if (zEZpvd) {
            subscribeFuturesPeriodTickersUseCase$onExecute$1.L$0 = c41537qsg;
            subscribeFuturesPeriodTickersUseCase$onExecute$1.L$1 = flow;
            subscribeFuturesPeriodTickersUseCase$onExecute$1.L$2 = flow2;
            subscribeFuturesPeriodTickersUseCase$onExecute$1.L$3 = null;
            subscribeFuturesPeriodTickersUseCase$onExecute$1.label = 2;
            java.lang.Object objKWHzl = c41537qsg.KWHzl(listAEQbTJ, periodEnumKWHzl, subscribeFuturesPeriodTickersUseCase$onExecute$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            flow3 = flow2;
            obj = objKWHzl;
            flow4 = flow;
            c41537qsg2 = c41537qsg;
            c41537qsg = c41537qsg2;
            flow = flow4;
            flowEmptyFlow = (Flow) obj;
            flow2 = flow3;
            return FlowKt.flowOn(FlowKt.onStart(new Application(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flow, flow2, flowEmptyFlow), new SubscribeFuturesPeriodTickersUseCase$onExecute$2(c41537qsg, null)), new SubscribeFuturesPeriodTickersUseCase$onExecute$3(null)), OLrzqt), c41537qsg), new SubscribeFuturesPeriodTickersUseCase$onExecute$5(c41537qsg, null)), c41537qsg.KWHzl);
        }
        flowEmptyFlow = FlowKt.emptyFlow();
        return FlowKt.flowOn(FlowKt.onStart(new Application(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach(FlowKt.merge(flow, flow2, flowEmptyFlow), new SubscribeFuturesPeriodTickersUseCase$onExecute$2(c41537qsg, null)), new SubscribeFuturesPeriodTickersUseCase$onExecute$3(null)), OLrzqt), c41537qsg), new SubscribeFuturesPeriodTickersUseCase$onExecute$5(c41537qsg, null)), c41537qsg.KWHzl);
    }

    public final Flow<java.util.Map<java.lang.String, java.lang.Object>> AEQbTJ() {
        java.util.Map<java.lang.String, PeriodTickersPo> mapKWHzl = this.AhwBna.KWHzl();
        Intrinsics.copydefault(mapKWHzl, "");
        Flow<java.util.Map<java.lang.String, java.lang.Object>> flowFlowOf = FlowKt.flowOf(mapKWHzl);
        C41434qqj.KWHzl.KWHzl("SubscribeFuturesPeriodTickersUseCase", "get period cache flow, emit first frame [periodSize: " + this.AhwBna.KWHzl().size() + "]");
        return flowFlowOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.util.List<? extends InterfaceC41638qub> list, Continuation<? super Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> continuation) throws java.lang.Throwable {
        SubscribeFuturesPeriodTickersUseCase$getHttpCupTickersFlow$1 subscribeFuturesPeriodTickersUseCase$getHttpCupTickersFlow$1;
        boolean z;
        C41537qsg c41537qsg;
        if (continuation instanceof SubscribeFuturesPeriodTickersUseCase$getHttpCupTickersFlow$1) {
            subscribeFuturesPeriodTickersUseCase$getHttpCupTickersFlow$1 = (SubscribeFuturesPeriodTickersUseCase$getHttpCupTickersFlow$1) continuation;
            int i = subscribeFuturesPeriodTickersUseCase$getHttpCupTickersFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeFuturesPeriodTickersUseCase$getHttpCupTickersFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeFuturesPeriodTickersUseCase$getHttpCupTickersFlow$1 = new SubscribeFuturesPeriodTickersUseCase$getHttpCupTickersFlow$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = subscribeFuturesPeriodTickersUseCase$getHttpCupTickersFlow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeFuturesPeriodTickersUseCase$getHttpCupTickersFlow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, 10);
            if ((listAhwBna instanceof java.util.Collection) && listAhwBna.isEmpty()) {
                z = true;
                java.util.List<java.lang.String> listQbewEr = CollectionsKt___CollectionsKt.QbewEr(C41389qpr.EZpvd(list, new Function1() { // from class: o.qsd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C41537qsg.EZpvd((InterfaceC41638qub) obj);
                    }
                }));
                if (!z) {
                }
            } else {
                java.util.Iterator it = listAhwBna.iterator();
                while (it.hasNext()) {
                    if (this.EZpvd.OLrzqt(((InterfaceC41638qub) it.next()).values().getQuoteSymbol()) == null) {
                        z = false;
                        break;
                    }
                }
                z = true;
                java.util.List<java.lang.String> listQbewEr2 = CollectionsKt___CollectionsKt.QbewEr(C41389qpr.EZpvd(list, new Function1() { // from class: o.qsd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C41537qsg.EZpvd((InterfaceC41638qub) obj);
                    }
                }));
                if (!z) {
                    C41434qqj.KWHzl.KWHzl("SubscribeFuturesPeriodTickersUseCase", "get http cup tickers flow, cache hit, return cache directly (no HTTP)");
                    java.util.Map<java.lang.String, TickersData> mapKWHzl = this.EZpvd.KWHzl();
                    Intrinsics.copydefault(mapKWHzl, "");
                    return FlowKt.flowOf(mapKWHzl);
                }
                C41434qqj.KWHzl.KWHzl("SubscribeFuturesPeriodTickersUseCase", "get http cup tickers flow, cache miss, request HTTP immediately");
                subscribeFuturesPeriodTickersUseCase$getHttpCupTickersFlow$1.L$0 = this;
                subscribeFuturesPeriodTickersUseCase$getHttpCupTickersFlow$1.label = 1;
                objOLrzqt = OLrzqt(listQbewEr2, subscribeFuturesPeriodTickersUseCase$getHttpCupTickersFlow$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                c41537qsg = this;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41537qsg = (C41537qsg) subscribeFuturesPeriodTickersUseCase$getHttpCupTickersFlow$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        java.util.Map<java.lang.String, TickersData> map = (java.util.Map) objOLrzqt;
        c41537qsg.EZpvd.OLrzqt(map);
        Intrinsics.copydefault(map, "");
        return FlowKt.flowOf(map);
    }

    public static final java.lang.String EZpvd(InterfaceC41638qub interfaceC41638qub) {
        Intrinsics.checkNotNullParameter(interfaceC41638qub, "");
        return interfaceC41638qub.values().getQuoteSymbol();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.util.List<java.lang.String> list, Continuation<? super java.util.Map<java.lang.String, TickersData>> continuation) throws java.lang.Throwable {
        SubscribeFuturesPeriodTickersUseCase$getHttpCupTickers$1 subscribeFuturesPeriodTickersUseCase$getHttpCupTickers$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof SubscribeFuturesPeriodTickersUseCase$getHttpCupTickers$1) {
            subscribeFuturesPeriodTickersUseCase$getHttpCupTickers$1 = (SubscribeFuturesPeriodTickersUseCase$getHttpCupTickers$1) continuation;
            int i = subscribeFuturesPeriodTickersUseCase$getHttpCupTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeFuturesPeriodTickersUseCase$getHttpCupTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeFuturesPeriodTickersUseCase$getHttpCupTickers$1 = new SubscribeFuturesPeriodTickersUseCase$getHttpCupTickers$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = subscribeFuturesPeriodTickersUseCase$getHttpCupTickers$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeFuturesPeriodTickersUseCase$getHttpCupTickers$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Result.Application application = Result.Companion;
                C40429qVn c40429qVn = new C40429qVn(null, list, false, 4, null);
                C40430qVo c40430qVo = this.copydefault;
                subscribeFuturesPeriodTickersUseCase$getHttpCupTickers$1.label = 1;
                objEZpvd = c40430qVo.EZpvd(c40429qVn, subscribeFuturesPeriodTickersUseCase$getHttpCupTickers$1);
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
            C41434qqj.KWHzl.copydefault("SubscribeFuturesPeriodTickersUseCase", "get http cup tickers failed", thM7380exceptionOrNullimpl);
        }
        return Result.m7383isFailureimpl(objM7377constructorimpl) ? C56424yEw.KWHzl() : objM7377constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.util.List<? extends InterfaceC41638qub> list, PeriodEnum periodEnum, Continuation<? super Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> continuation) throws java.lang.Throwable {
        SubscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1 subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        C41537qsg c41537qsg;
        java.lang.String instType;
        BizInstrument bizInstrumentValues;
        if (continuation instanceof SubscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1) {
            subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1 = (SubscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1) continuation;
            int i = subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1 = new SubscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            SubscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$$inlined$executeAsyncTasks$1 subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$$inlined$executeAsyncTasks$1 = new SubscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$$inlined$executeAsyncTasks$1(null, list, list);
            subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.L$0 = this;
            subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.L$1 = list;
            subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.L$2 = periodEnum;
            subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.label = 1;
            objCoroutineScope = CoroutineScopeKt.coroutineScope(subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$$inlined$executeAsyncTasks$1, subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1);
            if (objCoroutineScope == objCopydefault) {
                return objCopydefault;
            }
            c41537qsg = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCoroutineScope);
                objM7377constructorimpl = Result.m7377constructorimpl((Flow) objCoroutineScope);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    C41434qqj.KWHzl.copydefault("SubscribeFuturesPeriodTickersUseCase", "get subscribe ws period tickers flow error", thM7380exceptionOrNullimpl);
                }
                return !Result.m7383isFailureimpl(objM7377constructorimpl) ? FlowKt.emptyFlow() : objM7377constructorimpl;
            }
            periodEnum = (PeriodEnum) subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.L$2;
            list = (java.util.List) subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.L$1;
            c41537qsg = (C41537qsg) subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.L$0;
            C56391yDq.AEQbTJ(objCoroutineScope);
        }
        kotlin.Pair pair = (kotlin.Pair) objCoroutineScope;
        java.util.List list2 = (java.util.List) pair.component1();
        java.util.List list3 = (java.util.List) pair.component2();
        InterfaceC41638qub interfaceC41638qub = (InterfaceC41638qub) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (interfaceC41638qub == null || (bizInstrumentValues = interfaceC41638qub.values()) == null || (instType = bizInstrumentValues.getInstType()) == null) {
            instType = "";
        }
        Result.Application application2 = Result.Companion;
        C41401qqC c41401qqC = new C41401qqC(C56423yEv.EZpvd(C56390yDp.OLrzqt(instType, list2)), list3, periodEnum);
        C41403qqE c41403qqE = c41537qsg.AYXKKw;
        subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.L$0 = null;
        subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.L$1 = null;
        subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.L$2 = null;
        subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1.label = 2;
        objCoroutineScope = c41403qqE.EZpvd(c41401qqC, subscribeFuturesPeriodTickersUseCase$getSubscribeWsPeriodTickersFlow$1);
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

    /* JADX INFO: renamed from: o.qsg$Activity */
    public static final class Activity implements Function1<InterfaceC41638qub, java.lang.String> {
        public static final Activity copydefault = new Activity();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41638qub interfaceC41638qub) {
            Intrinsics.checkNotNullParameter(interfaceC41638qub, "");
            return interfaceC41638qub.values().getInstId();
        }
    }

    /* JADX INFO: renamed from: o.qsg$TaskDescription */
    public static final class TaskDescription implements Function1<InterfaceC41638qub, java.lang.String> {
        public static final TaskDescription OLrzqt = new TaskDescription();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(InterfaceC41638qub interfaceC41638qub) {
            Intrinsics.checkNotNullParameter(interfaceC41638qub, "");
            return interfaceC41638qub.values().getQuoteSymbol();
        }
    }
}
