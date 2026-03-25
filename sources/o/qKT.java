package o;

import com.okinc.market.search.features.navigation.favorites.domain.NavFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.search.features.navigation.favorites.domain.NavFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$2;
import com.okinc.market.search.features.navigation.favorites.domain.NavFavItemsAggregatedUseCase$onExecute$1;
import com.okinc.market.search.features.navigation.favorites.domain.NavFavItemsAggregatedUseCase$onExecute$6;
import com.okinc.market.search.features.navigation.favorites.domain.NavFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1;
import com.okinc.market.search.features.navigation.favorites.domain.NavFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qKT extends AbstractC49400uno<Flow<? extends java.util.List<? extends qWH>>, Flow<? extends java.util.List<? extends qWH>>> {
    public final C40470qXa AEQbTJ;
    public final qWZ EZpvd;
    public final qWR KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final C40434qVs copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((Flow<? extends java.util.List<? extends qWH>>) obj, (Continuation<? super Flow<? extends java.util.List<? extends qWH>>>) continuation);
    }

    @yCM
    public qKT(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40434qVs c40434qVs, @NotNull C40470qXa c40470qXa, @NotNull qWZ qwz, @NotNull qWR qwr) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40434qVs, "");
        Intrinsics.checkNotNullParameter(c40470qXa, "");
        Intrinsics.checkNotNullParameter(qwz, "");
        Intrinsics.checkNotNullParameter(qwr, "");
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = c40434qVs;
        this.AEQbTJ = c40470qXa;
        this.EZpvd = qwz;
        this.KWHzl = qwr;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Flow<? extends java.util.List<? extends qWH>> flow, @NotNull Continuation<? super Flow<? extends java.util.List<? extends qWH>>> continuation) throws java.lang.Throwable {
        NavFavItemsAggregatedUseCase$onExecute$1 navFavItemsAggregatedUseCase$onExecute$1;
        qKT qkt;
        Flow flow2;
        qKT qkt2;
        Flow flow3;
        if (continuation instanceof NavFavItemsAggregatedUseCase$onExecute$1) {
            navFavItemsAggregatedUseCase$onExecute$1 = (NavFavItemsAggregatedUseCase$onExecute$1) continuation;
            int i = navFavItemsAggregatedUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                navFavItemsAggregatedUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                navFavItemsAggregatedUseCase$onExecute$1 = new NavFavItemsAggregatedUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = navFavItemsAggregatedUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = navFavItemsAggregatedUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(flow);
            NavFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$1 navFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$1 = new NavFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$1(null, flow, flow);
            navFavItemsAggregatedUseCase$onExecute$1.L$0 = this;
            navFavItemsAggregatedUseCase$onExecute$1.L$1 = flowDistinctUntilChanged;
            navFavItemsAggregatedUseCase$onExecute$1.label = 1;
            java.lang.Object objCoroutineScope2 = CoroutineScopeKt.coroutineScope(navFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$1, navFavItemsAggregatedUseCase$onExecute$1);
            if (objCoroutineScope2 == objCopydefault) {
                return objCopydefault;
            }
            qkt = this;
            flow2 = flowDistinctUntilChanged;
            objCoroutineScope = objCoroutineScope2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flow3 = (Flow) navFavItemsAggregatedUseCase$onExecute$1.L$2;
                flow2 = (Flow) navFavItemsAggregatedUseCase$onExecute$1.L$1;
                qkt2 = (qKT) navFavItemsAggregatedUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objCoroutineScope);
                kotlin.Pair pair = (kotlin.Pair) objCoroutineScope;
                return FlowKt.conflate(FlowKt.combine(flow2, flow3, (Flow) pair.component1(), (Flow) pair.component2(), new NavFavItemsAggregatedUseCase$onExecute$6(qkt2, null)));
            }
            flow2 = (Flow) navFavItemsAggregatedUseCase$onExecute$1.L$1;
            qkt = (qKT) navFavItemsAggregatedUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objCoroutineScope);
        }
        kotlin.Pair pair2 = (kotlin.Pair) objCoroutineScope;
        Flow flow4 = (Flow) pair2.component1();
        NavFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$2 navFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$2 = new NavFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$2(null, qkt, flow2, flow4, qkt, (Flow) pair2.component2());
        navFavItemsAggregatedUseCase$onExecute$1.L$0 = qkt;
        navFavItemsAggregatedUseCase$onExecute$1.L$1 = flow2;
        navFavItemsAggregatedUseCase$onExecute$1.L$2 = flow4;
        navFavItemsAggregatedUseCase$onExecute$1.label = 2;
        objCoroutineScope = CoroutineScopeKt.coroutineScope(navFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$2, navFavItemsAggregatedUseCase$onExecute$1);
        if (objCoroutineScope == objCopydefault) {
            return objCopydefault;
        }
        qkt2 = qkt;
        flow3 = flow4;
        kotlin.Pair pair3 = (kotlin.Pair) objCoroutineScope;
        return FlowKt.conflate(FlowKt.combine(flow2, flow3, (Flow) pair3.component1(), (Flow) pair3.component2(), new NavFavItemsAggregatedUseCase$onExecute$6(qkt2, null)));
    }

    public static final class ActionBar implements Flow<java.util.List<? extends BizInstrument>> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.qKT$ActionBar$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                NavFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1 navFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1;
                if (continuation instanceof NavFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1) {
                    navFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1 = (NavFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1) continuation;
                    int i = navFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        navFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        navFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1 = new NavFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = navFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = navFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (T t : (java.util.List) obj) {
                        if (t instanceof qWC) {
                            arrayList.add(t);
                        }
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    java.util.Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((qWC) it.next()).copydefault());
                    }
                    navFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList2, navFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends BizInstrument>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Application implements Flow<java.util.List<? extends qWG>> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.qKT$Application$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                NavFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1 navFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1;
                if (continuation instanceof NavFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1) {
                    navFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1 = (NavFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1) continuation;
                    int i = navFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        navFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        navFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1 = new NavFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = navFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = navFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (T t : (java.util.List) obj) {
                        if (t instanceof qWG) {
                            arrayList.add(t);
                        }
                    }
                    navFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, navFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1) == objCopydefault) {
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

        public Application(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends qWG>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AEQbTJ(qWH qwh) {
        if (qwh instanceof qWC) {
            qWC qwc = (qWC) qwh;
            return qwc.KWHzl().getInstId() + qwc.AhwBna();
        }
        if (qwh instanceof qWG) {
            qWG qwg = (qWG) qwh;
            return qwg.KWHzl().getChainId() + qwg.KWHzl().getTokenContractAddress();
        }
        return qwh.AhwBna() + qwh.hashCode();
    }
}
