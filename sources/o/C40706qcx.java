package o;

import com.okinc.market.discover.features.markets.sub.favorites.domain.DiscoverFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.discover.features.markets.sub.favorites.domain.DiscoverFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$2;
import com.okinc.market.discover.features.markets.sub.favorites.domain.DiscoverFavItemsAggregatedUseCase$onExecute$1;
import com.okinc.market.discover.features.markets.sub.favorites.domain.DiscoverFavItemsAggregatedUseCase$onExecute$6;
import com.okinc.market.discover.features.markets.sub.favorites.domain.DiscoverFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1;
import com.okinc.market.discover.features.markets.sub.favorites.domain.DiscoverFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1;
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

/* JADX INFO: renamed from: o.qcx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40706qcx extends AbstractC49400uno<Flow<? extends java.util.List<? extends qWH>>, Flow<? extends java.util.List<? extends qWH>>> {
    public final qWZ AEQbTJ;
    public final C40434qVs EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final qWR OLrzqt;
    public final C40470qXa copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C40706qcx(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40434qVs c40434qVs, @NotNull C40470qXa c40470qXa, @NotNull qWZ qwz, @NotNull qWR qwr) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40434qVs, "");
        Intrinsics.checkNotNullParameter(c40470qXa, "");
        Intrinsics.checkNotNullParameter(qwz, "");
        Intrinsics.checkNotNullParameter(qwr, "");
        this.KWHzl = coroutineDispatcher;
        this.EZpvd = c40434qVs;
        this.copydefault = c40470qXa;
        this.AEQbTJ = qwz;
        this.OLrzqt = qwr;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Flow<? extends java.util.List<? extends qWH>> flow, @NotNull Continuation<? super Flow<? extends java.util.List<? extends qWH>>> continuation) throws java.lang.Throwable {
        DiscoverFavItemsAggregatedUseCase$onExecute$1 discoverFavItemsAggregatedUseCase$onExecute$1;
        C40706qcx c40706qcx;
        Flow flow2;
        C40706qcx c40706qcx2;
        Flow flow3;
        if (continuation instanceof DiscoverFavItemsAggregatedUseCase$onExecute$1) {
            discoverFavItemsAggregatedUseCase$onExecute$1 = (DiscoverFavItemsAggregatedUseCase$onExecute$1) continuation;
            int i = discoverFavItemsAggregatedUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                discoverFavItemsAggregatedUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                discoverFavItemsAggregatedUseCase$onExecute$1 = new DiscoverFavItemsAggregatedUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = discoverFavItemsAggregatedUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = discoverFavItemsAggregatedUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(flow);
            DiscoverFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$1 discoverFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$1 = new DiscoverFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$1(null, flow, flow);
            discoverFavItemsAggregatedUseCase$onExecute$1.L$0 = this;
            discoverFavItemsAggregatedUseCase$onExecute$1.L$1 = flowDistinctUntilChanged;
            discoverFavItemsAggregatedUseCase$onExecute$1.label = 1;
            java.lang.Object objCoroutineScope2 = CoroutineScopeKt.coroutineScope(discoverFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$1, discoverFavItemsAggregatedUseCase$onExecute$1);
            if (objCoroutineScope2 == objCopydefault) {
                return objCopydefault;
            }
            c40706qcx = this;
            flow2 = flowDistinctUntilChanged;
            objCoroutineScope = objCoroutineScope2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flow3 = (Flow) discoverFavItemsAggregatedUseCase$onExecute$1.L$2;
                flow2 = (Flow) discoverFavItemsAggregatedUseCase$onExecute$1.L$1;
                c40706qcx2 = (C40706qcx) discoverFavItemsAggregatedUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objCoroutineScope);
                kotlin.Pair pair = (kotlin.Pair) objCoroutineScope;
                return FlowKt.conflate(FlowKt.combine(flow2, flow3, (Flow) pair.component1(), (Flow) pair.component2(), new DiscoverFavItemsAggregatedUseCase$onExecute$6(c40706qcx2, null)));
            }
            flow2 = (Flow) discoverFavItemsAggregatedUseCase$onExecute$1.L$1;
            c40706qcx = (C40706qcx) discoverFavItemsAggregatedUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objCoroutineScope);
        }
        kotlin.Pair pair2 = (kotlin.Pair) objCoroutineScope;
        Flow flow4 = (Flow) pair2.component1();
        DiscoverFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$2 discoverFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$2 = new DiscoverFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$2(null, c40706qcx, flow2, flow4, c40706qcx, (Flow) pair2.component2());
        discoverFavItemsAggregatedUseCase$onExecute$1.L$0 = c40706qcx;
        discoverFavItemsAggregatedUseCase$onExecute$1.L$1 = flow2;
        discoverFavItemsAggregatedUseCase$onExecute$1.L$2 = flow4;
        discoverFavItemsAggregatedUseCase$onExecute$1.label = 2;
        objCoroutineScope = CoroutineScopeKt.coroutineScope(discoverFavItemsAggregatedUseCase$onExecute$$inlined$executeAsyncTasks$2, discoverFavItemsAggregatedUseCase$onExecute$1);
        if (objCoroutineScope == objCopydefault) {
            return objCopydefault;
        }
        c40706qcx2 = c40706qcx;
        flow3 = flow4;
        kotlin.Pair pair3 = (kotlin.Pair) objCoroutineScope;
        return FlowKt.conflate(FlowKt.combine(flow2, flow3, (Flow) pair3.component1(), (Flow) pair3.component2(), new DiscoverFavItemsAggregatedUseCase$onExecute$6(c40706qcx2, null)));
    }

    /* JADX INFO: renamed from: o.qcx$Application */
    public static final class Application implements Flow<java.util.List<? extends qWG>> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.qcx$Application$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                DiscoverFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1 discoverFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1;
                if (continuation instanceof DiscoverFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1) {
                    discoverFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1 = (DiscoverFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1) continuation;
                    int i = discoverFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        discoverFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        discoverFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1 = new DiscoverFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = discoverFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = discoverFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (T t : (java.util.List) obj) {
                        if (t instanceof qWG) {
                            arrayList.add(t);
                        }
                    }
                    discoverFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, discoverFavItemsAggregatedUseCase$onExecute$lambda$4$$inlined$map$1$2$1) == objCopydefault) {
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
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends qWG>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qcx$TaskDescription */
    public static final class TaskDescription implements Flow<java.util.List<? extends BizInstrument>> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.qcx$TaskDescription$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                DiscoverFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1 discoverFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1;
                if (continuation instanceof DiscoverFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1) {
                    discoverFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1 = (DiscoverFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1) continuation;
                    int i = discoverFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        discoverFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        discoverFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1 = new DiscoverFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = discoverFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = discoverFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
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
                    discoverFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList2, discoverFavItemsAggregatedUseCase$onExecute$lambda$2$$inlined$map$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends BizInstrument>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String OLrzqt(qWH qwh) {
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
