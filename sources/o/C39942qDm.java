package o;

import com.okinc.market.search.features.main.recommend.hot.domain.GetHotTickerUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.search.features.main.recommend.hot.domain.GetHotTickerUseCase$onExecute$$inlined$map$2$2$1;
import com.okinc.market.search.features.main.recommend.hot.domain.GetHotTickerUseCase$onExecute$2;
import com.okinc.market.search.features.main.recommend.hot.domain.GetHotTickerUseCase$onExecute$5;
import com.okinc.market.search.features.main.recommend.hot.domain.GetHotTickerUseCase$onExecute$6;
import com.okinc.market.search.features.main.recommend.hot.domain.GetHotTickerUseCase$onExecute$7;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C59462zhW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qDm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39942qDm extends AbstractC49400uno<java.util.List<? extends C39994qFk>, Flow<? extends java.util.Map<java.lang.String, ? extends C41787qxR>>> {
    public final C40428qVm KWHzl;
    public final CoroutineDispatcher OLrzqt;
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public static final long copydefault = C38364pWa.KWHzl.OLrzqt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((java.util.List<C39994qFk>) obj, (Continuation<? super Flow<? extends java.util.Map<java.lang.String, C41787qxR>>>) continuation);
    }

    @yCM
    public C39942qDm(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40428qVm c40428qVm) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40428qVm, "");
        this.OLrzqt = coroutineDispatcher;
        this.KWHzl = c40428qVm;
    }

    /* JADX INFO: renamed from: o.qDm$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qDm.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.qDm$ActionBar */
    public static final class ActionBar implements Flow<java.util.Map<java.lang.String, ? extends C41787qxR>> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.qDm$ActionBar$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                GetHotTickerUseCase$onExecute$$inlined$map$2$2$1 getHotTickerUseCase$onExecute$$inlined$map$2$2$1;
                if (continuation instanceof GetHotTickerUseCase$onExecute$$inlined$map$2$2$1) {
                    getHotTickerUseCase$onExecute$$inlined$map$2$2$1 = (GetHotTickerUseCase$onExecute$$inlined$map$2$2$1) continuation;
                    int i = getHotTickerUseCase$onExecute$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        getHotTickerUseCase$onExecute$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        getHotTickerUseCase$onExecute$$inlined$map$2$2$1 = new GetHotTickerUseCase$onExecute$$inlined$map$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = getHotTickerUseCase$onExecute$$inlined$map$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = getHotTickerUseCase$onExecute$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.Map map = (java.util.Map) obj;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), C40378qTq.OLrzqt((TickersData) entry.getValue()));
                    }
                    getHotTickerUseCase$onExecute$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(linkedHashMap, getHotTickerUseCase$onExecute$$inlined$map$2$2$1) == objCopydefault) {
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
        public java.lang.Object collect(FlowCollector<? super java.util.Map<java.lang.String, ? extends C41787qxR>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qDm$Activity */
    public static final class Activity implements Flow<java.util.Map<java.lang.String, ? extends TickersData>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ LinkedList EZpvd;

        /* JADX INFO: renamed from: o.qDm$Activity$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ LinkedList KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, LinkedList linkedList) {
                this.EZpvd = flowCollector;
                this.KWHzl = linkedList;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                GetHotTickerUseCase$onExecute$$inlined$map$1$2$1 getHotTickerUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof GetHotTickerUseCase$onExecute$$inlined$map$1$2$1) {
                    getHotTickerUseCase$onExecute$$inlined$map$1$2$1 = (GetHotTickerUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = getHotTickerUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        getHotTickerUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        getHotTickerUseCase$onExecute$$inlined$map$1$2$1 = new GetHotTickerUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = getHotTickerUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = getHotTickerUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.util.List listQOLQEE = C56403yEb.QOLQEE(this.KWHzl);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listQOLQEE, 10)), 16));
                    for (T t : listQOLQEE) {
                        linkedHashMap.put(((TickersData) t).getInstId(), t);
                    }
                    getHotTickerUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(linkedHashMap, getHotTickerUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow, LinkedList linkedList) {
            this.AEQbTJ = flow;
            this.EZpvd = linkedList;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.Map<java.lang.String, ? extends TickersData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public java.lang.Object KWHzl(@NotNull java.util.List<C39994qFk> list, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, C41787qxR>>> continuation) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C39994qFk) it.next()).KWHzl().getInstId());
        }
        LinkedList linkedList = new LinkedList();
        Activity activity = new Activity(FlowKt.onEach((Flow) this.KWHzl.OLrzqt(arrayList), new GetHotTickerUseCase$onExecute$2(linkedList, null)), linkedList);
        C59462zhW.Activity activity2 = C59462zhW.OLrzqt;
        return FlowKt.flowOn(FlowKt.onCompletion(FlowKt.m7441catch(FlowKt.onEach(new ActionBar(FlowKt.m7443sampleHG0u8IE(activity, C59519zia.AEQbTJ(copydefault, DurationUnit.MILLISECONDS))), new GetHotTickerUseCase$onExecute$5(linkedList, null)), new GetHotTickerUseCase$onExecute$6(null)), new GetHotTickerUseCase$onExecute$7(null)), AEQbTJ());
    }
}
