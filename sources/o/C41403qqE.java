package o;

import com.okinc.market.quotation.data.repository.PeriodTickersRepository;
import com.okinc.market.quotation.domain.SubscribeWsPeriodTickersUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.quotation.domain.SubscribeWsPeriodTickersUseCase$onExecute$1;
import com.okinc.market.quotation.domain.SubscribeWsPeriodTickersUseCase$subscribeCupTickers$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.SubscribeWsPeriodTickersUseCase$subscribeCupTickers$1;
import com.okinc.market.quotation.domain.SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$1;
import com.okinc.market.quotation.domain.SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$lambda$7$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$tasks$1$1;
import com.okinc.market.quotation.domain.SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$tasks$1$2;
import com.okinc.market.quotation.domain.SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$tasks$1$3;
import com.okinc.market.ticker.repo.CupTickersRepository;
import com.okinc.market.time.filter.PeriodEnum;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41403qqE extends AbstractC49400uno<C41401qqC, Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> {
    public final CoroutineDispatcher KWHzl;
    public final PeriodTickersRepository OLrzqt;
    public final CupTickersRepository copydefault;
    private static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.qqE$Application */
    public static final class Application implements Flow<java.util.Map<java.lang.String, ? extends java.lang.Object>> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.qqE$Application$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeWsPeriodTickersUseCase$subscribeCupTickers$$inlined$map$1$2$1 subscribeWsPeriodTickersUseCase$subscribeCupTickers$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeWsPeriodTickersUseCase$subscribeCupTickers$$inlined$map$1$2$1) {
                    subscribeWsPeriodTickersUseCase$subscribeCupTickers$$inlined$map$1$2$1 = (SubscribeWsPeriodTickersUseCase$subscribeCupTickers$$inlined$map$1$2$1) continuation;
                    int i = subscribeWsPeriodTickersUseCase$subscribeCupTickers$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeWsPeriodTickersUseCase$subscribeCupTickers$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeWsPeriodTickersUseCase$subscribeCupTickers$$inlined$map$1$2$1 = new SubscribeWsPeriodTickersUseCase$subscribeCupTickers$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeWsPeriodTickersUseCase$subscribeCupTickers$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeWsPeriodTickersUseCase$subscribeCupTickers$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.util.Map map = (java.util.Map) obj;
                    Intrinsics.copydefault(map, "");
                    subscribeWsPeriodTickersUseCase$subscribeCupTickers$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(map, subscribeWsPeriodTickersUseCase$subscribeCupTickers$$inlined$map$1$2$1) == objCopydefault) {
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
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qqE$StateListAnimator */
    public static final class StateListAnimator implements Flow<java.util.Map<java.lang.String, ? extends java.lang.Object>> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.qqE$StateListAnimator$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$lambda$7$$inlined$map$1$2$1 subscribeWsPeriodTickersUseCase$subscribePeriodTickers$lambda$7$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$lambda$7$$inlined$map$1$2$1) {
                    subscribeWsPeriodTickersUseCase$subscribePeriodTickers$lambda$7$$inlined$map$1$2$1 = (SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$lambda$7$$inlined$map$1$2$1) continuation;
                    int i = subscribeWsPeriodTickersUseCase$subscribePeriodTickers$lambda$7$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeWsPeriodTickersUseCase$subscribePeriodTickers$lambda$7$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeWsPeriodTickersUseCase$subscribePeriodTickers$lambda$7$$inlined$map$1$2$1 = new SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$lambda$7$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeWsPeriodTickersUseCase$subscribePeriodTickers$lambda$7$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeWsPeriodTickersUseCase$subscribePeriodTickers$lambda$7$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.util.Map map = (java.util.Map) obj;
                    Intrinsics.copydefault(map, "");
                    subscribeWsPeriodTickersUseCase$subscribePeriodTickers$lambda$7$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(map, subscribeWsPeriodTickersUseCase$subscribePeriodTickers$lambda$7$$inlined$map$1$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qqE$TaskDescription */
    public static final class TaskDescription implements Flow<java.util.Map<java.lang.String, ? extends java.lang.Object>> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.qqE$TaskDescription$4, reason: invalid class name */
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
                SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$$inlined$map$1$2$1 subscribeWsPeriodTickersUseCase$subscribePeriodTickers$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$$inlined$map$1$2$1) {
                    subscribeWsPeriodTickersUseCase$subscribePeriodTickers$$inlined$map$1$2$1 = (SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$$inlined$map$1$2$1) continuation;
                    int i = subscribeWsPeriodTickersUseCase$subscribePeriodTickers$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeWsPeriodTickersUseCase$subscribePeriodTickers$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeWsPeriodTickersUseCase$subscribePeriodTickers$$inlined$map$1$2$1 = new SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeWsPeriodTickersUseCase$subscribePeriodTickers$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeWsPeriodTickersUseCase$subscribePeriodTickers$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.util.Map map = (java.util.Map) obj;
                    Intrinsics.copydefault(map, "");
                    subscribeWsPeriodTickersUseCase$subscribePeriodTickers$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(map, subscribeWsPeriodTickersUseCase$subscribePeriodTickers$$inlined$map$1$2$1) == objCopydefault) {
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
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public C41403qqE(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PeriodTickersRepository periodTickersRepository, @NotNull CupTickersRepository cupTickersRepository) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(periodTickersRepository, "");
        Intrinsics.checkNotNullParameter(cupTickersRepository, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = periodTickersRepository;
        this.copydefault = cupTickersRepository;
    }

    /* JADX INFO: renamed from: o.qqE$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qqE.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41401qqC c41401qqC, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> continuation) throws java.lang.Throwable {
        SubscribeWsPeriodTickersUseCase$onExecute$1 subscribeWsPeriodTickersUseCase$onExecute$1;
        if (continuation instanceof SubscribeWsPeriodTickersUseCase$onExecute$1) {
            subscribeWsPeriodTickersUseCase$onExecute$1 = (SubscribeWsPeriodTickersUseCase$onExecute$1) continuation;
            int i = subscribeWsPeriodTickersUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeWsPeriodTickersUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeWsPeriodTickersUseCase$onExecute$1 = new SubscribeWsPeriodTickersUseCase$onExecute$1(this, continuation);
            }
        }
        SubscribeWsPeriodTickersUseCase$onExecute$1 subscribeWsPeriodTickersUseCase$onExecute$12 = subscribeWsPeriodTickersUseCase$onExecute$1;
        java.lang.Object objEZpvd = subscribeWsPeriodTickersUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeWsPeriodTickersUseCase$onExecute$12.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objEZpvd);
                kotlin.Pair pair = (kotlin.Pair) objEZpvd;
                return FlowKt.merge((Flow) pair.component1(), (Flow) pair.component2());
            }
            if (i2 == 2) {
                C56391yDq.AEQbTJ(objEZpvd);
            }
            if (i2 == 3) {
                C56391yDq.AEQbTJ(objEZpvd);
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objEZpvd);
        java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> mapEZpvd = c41401qqC.EZpvd();
        java.util.List<java.lang.String> listKWHzl = c41401qqC.KWHzl();
        PeriodEnum periodEnumCopydefault = c41401qqC.copydefault();
        C41434qqj c41434qqj = C41434qqj.KWHzl;
        c41434qqj.KWHzl("SubscribeWsPeriodTickersUseCase", "start subscribe [period=" + periodEnumCopydefault + ", instIdMap=" + (mapEZpvd != null ? C56443yFo.AEQbTJ(mapEZpvd.size()) : null) + ", ccyList=" + (listKWHzl != null ? C56443yFo.AEQbTJ(listKWHzl.size()) : null) + "]");
        if (mapEZpvd == null && listKWHzl == null) {
            C41434qqj.w$default(c41434qqj, "SubscribeWsPeriodTickersUseCase", "both instIdMap and ccyList are null, return emptyFlow", null, 4, null);
            return FlowKt.emptyFlow();
        }
        if (mapEZpvd == null || mapEZpvd.isEmpty() || listKWHzl == null || listKWHzl.isEmpty()) {
            if (mapEZpvd != null && !mapEZpvd.isEmpty()) {
                subscribeWsPeriodTickersUseCase$onExecute$12.label = 2;
                objEZpvd = AEQbTJ(mapEZpvd, periodEnumCopydefault, subscribeWsPeriodTickersUseCase$onExecute$12);
                return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
            }
            if (listKWHzl != null && !listKWHzl.isEmpty()) {
                subscribeWsPeriodTickersUseCase$onExecute$12.label = 3;
                objEZpvd = EZpvd(listKWHzl, (Continuation<? super Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>>) subscribeWsPeriodTickersUseCase$onExecute$12);
                return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
            }
            return FlowKt.emptyFlow();
        }
        SubscribeWsPeriodTickersUseCase$onExecute$$inlined$executeAsyncTasks$1 subscribeWsPeriodTickersUseCase$onExecute$$inlined$executeAsyncTasks$1 = new SubscribeWsPeriodTickersUseCase$onExecute$$inlined$executeAsyncTasks$1(null, this, mapEZpvd, periodEnumCopydefault, this, listKWHzl);
        subscribeWsPeriodTickersUseCase$onExecute$12.label = 1;
        objEZpvd = CoroutineScopeKt.coroutineScope(subscribeWsPeriodTickersUseCase$onExecute$$inlined$executeAsyncTasks$1, subscribeWsPeriodTickersUseCase$onExecute$12);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        kotlin.Pair pair2 = (kotlin.Pair) objEZpvd;
        return FlowKt.merge((Flow) pair2.component1(), (Flow) pair2.component2());
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0122 A[LOOP:0: B:48:0x011c->B:50:0x0122, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, PeriodEnum periodEnum, Continuation<? super Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> continuation) throws java.lang.Throwable {
        SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$1 subscribeWsPeriodTickersUseCase$subscribePeriodTickers$1;
        ContinuationImpl subscribeWsPeriodTickersUseCase$subscribePeriodTickers$tasks$1$3;
        java.util.Iterator it;
        Flow[] flowArr;
        if (continuation instanceof SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$1) {
            subscribeWsPeriodTickersUseCase$subscribePeriodTickers$1 = (SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$1) continuation;
            int i = subscribeWsPeriodTickersUseCase$subscribePeriodTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeWsPeriodTickersUseCase$subscribePeriodTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeWsPeriodTickersUseCase$subscribePeriodTickers$1 = new SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = subscribeWsPeriodTickersUseCase$subscribePeriodTickers$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeWsPeriodTickersUseCase$subscribePeriodTickers$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                return new TaskDescription((Flow) objAEQbTJ);
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
            java.lang.Iterable iterable = (java.lang.Iterable) objAEQbTJ;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
            it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(new StateListAnimator((Flow) it.next()));
            }
            flowArr = (Flow[]) arrayList.toArray(new Flow[0]);
            if (flowArr.length != 0) {
                return FlowKt.flowOf(C56424yEw.KWHzl());
            }
            return FlowKt.merge((Flow[]) java.util.Arrays.copyOf(flowArr, flowArr.length));
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        C41434qqj c41434qqj = C41434qqj.KWHzl;
        c41434qqj.KWHzl("SubscribeWsPeriodTickersUseCase", "subscribePeriodTickers: period=" + periodEnum + ", instTypes=" + map.size());
        if ((map.isEmpty() ^ true ? map : null) == null) {
            return FlowKt.flowOf(C56424yEw.KWHzl());
        }
        java.util.List<java.lang.String> listQOLQEE = C56403yEb.QOLQEE(map.values());
        if (listQOLQEE.isEmpty()) {
            C41434qqj.w$default(c41434qqj, "SubscribeWsPeriodTickersUseCase", "subscribePeriodTickers: allInstIdList is empty", null, 4, null);
            return FlowKt.flowOf(C56424yEw.KWHzl());
        }
        if (listQOLQEE.size() < 50) {
            PeriodTickersRepository periodTickersRepository = this.OLrzqt;
            subscribeWsPeriodTickersUseCase$subscribePeriodTickers$1.label = 1;
            objAEQbTJ = periodTickersRepository.AEQbTJ(listQOLQEE, periodEnum, subscribeWsPeriodTickersUseCase$subscribePeriodTickers$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            return new TaskDescription((Flow) objAEQbTJ);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(map.size());
        for (Map.Entry<java.lang.String, ? extends java.util.List<java.lang.String>> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.List<java.lang.String> value = entry.getValue();
            if (value.isEmpty()) {
                subscribeWsPeriodTickersUseCase$subscribePeriodTickers$tasks$1$3 = new SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$tasks$1$1(this, key, periodEnum, null);
            } else if (value.size() < 50) {
                subscribeWsPeriodTickersUseCase$subscribePeriodTickers$tasks$1$3 = new SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$tasks$1$2(this, value, periodEnum, null);
            } else {
                subscribeWsPeriodTickersUseCase$subscribePeriodTickers$tasks$1$3 = new SubscribeWsPeriodTickersUseCase$subscribePeriodTickers$tasks$1$3(this, key, periodEnum, null);
            }
            arrayList2.add(subscribeWsPeriodTickersUseCase$subscribePeriodTickers$tasks$1$3);
        }
        subscribeWsPeriodTickersUseCase$subscribePeriodTickers$1.label = 2;
        objAEQbTJ = C41347qpB.AEQbTJ(arrayList2, subscribeWsPeriodTickersUseCase$subscribePeriodTickers$1);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        java.lang.Iterable iterable2 = (java.lang.Iterable) objAEQbTJ;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        flowArr = (Flow[]) arrayList3.toArray(new Flow[0]);
        if (flowArr.length != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.util.List<java.lang.String> list, Continuation<? super Flow<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> continuation) throws java.lang.Throwable {
        SubscribeWsPeriodTickersUseCase$subscribeCupTickers$1 subscribeWsPeriodTickersUseCase$subscribeCupTickers$1;
        if (continuation instanceof SubscribeWsPeriodTickersUseCase$subscribeCupTickers$1) {
            subscribeWsPeriodTickersUseCase$subscribeCupTickers$1 = (SubscribeWsPeriodTickersUseCase$subscribeCupTickers$1) continuation;
            int i = subscribeWsPeriodTickersUseCase$subscribeCupTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeWsPeriodTickersUseCase$subscribeCupTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeWsPeriodTickersUseCase$subscribeCupTickers$1 = new SubscribeWsPeriodTickersUseCase$subscribeCupTickers$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = subscribeWsPeriodTickersUseCase$subscribeCupTickers$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeWsPeriodTickersUseCase$subscribeCupTickers$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            C41434qqj.KWHzl.KWHzl("SubscribeWsPeriodTickersUseCase", "subscribeCupTickers: " + list.size());
            if ((list.isEmpty() ^ true ? list : null) == null) {
                return FlowKt.flowOf(C56424yEw.KWHzl());
            }
            CupTickersRepository cupTickersRepository = this.copydefault;
            subscribeWsPeriodTickersUseCase$subscribeCupTickers$1.label = 1;
            objAEQbTJ = cupTickersRepository.AEQbTJ(list, subscribeWsPeriodTickersUseCase$subscribeCupTickers$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return new Application((Flow) objAEQbTJ);
    }
}
