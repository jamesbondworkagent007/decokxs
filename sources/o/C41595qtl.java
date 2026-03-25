package o;

import com.okinc.market.quotation.domain.spot.SubscribeSpotVosWithPeriodUseCase$invoke$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotVosWithPeriodUseCase$onExecute$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotVosWithPeriodUseCase$onExecute$combinedFlow$1;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.trade.arch.util.Quartet;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41595qtl extends AbstractC49400uno<C41597qtn, Flow<? extends java.util.List<? extends InterfaceC41641que>>> {
    private static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final C41594qtk AYXKKw;
    public final InterfaceC56387yDm EZpvd;
    public final C41513qsI KWHzl;
    public final C41519qsO copydefault;
    public final C41592qti djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((C41597qtn) obj, (Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41641que>>>) continuation);
    }

    @yCM
    public C41595qtl(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41519qsO c41519qsO, @NotNull C41592qti c41592qti, @NotNull C41513qsI c41513qsI, @NotNull C41594qtk c41594qtk) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41519qsO, "");
        Intrinsics.checkNotNullParameter(c41592qti, "");
        Intrinsics.checkNotNullParameter(c41513qsI, "");
        Intrinsics.checkNotNullParameter(c41594qtk, "");
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = c41519qsO;
        this.djBIcL = c41592qti;
        this.KWHzl = c41513qsI;
        this.AYXKKw = c41594qtk;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qtr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41595qtl.OLrzqt();
            }
        });
    }

    /* JADX INFO: renamed from: o.qtl$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qtl.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.qtl$StateListAnimator */
    public static final class StateListAnimator implements Flow<java.util.List<? extends InterfaceC41641que>> {
        public final /* synthetic */ CategoryGroupVo AEQbTJ;
        public final /* synthetic */ SortOrder EZpvd;
        public final /* synthetic */ SortBy KWHzl;
        public final /* synthetic */ Flow OLrzqt;
        public final /* synthetic */ C41595qtl copydefault;

        /* JADX INFO: renamed from: o.qtl$StateListAnimator$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ C41595qtl EZpvd;
            public final /* synthetic */ SortOrder KWHzl;
            public final /* synthetic */ CategoryGroupVo OLrzqt;
            public final /* synthetic */ SortBy copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, C41595qtl c41595qtl, CategoryGroupVo categoryGroupVo, SortBy sortBy, SortOrder sortOrder) {
                this.AEQbTJ = flowCollector;
                this.EZpvd = c41595qtl;
                this.OLrzqt = categoryGroupVo;
                this.copydefault = sortBy;
                this.KWHzl = sortOrder;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeSpotVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1 subscribeSpotVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeSpotVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeSpotVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeSpotVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeSpotVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeSpotVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeSpotVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeSpotVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeSpotVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeSpotVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.lang.Object objEZpvd = this.EZpvd.AYXKKw.EZpvd(new Quartet(this.OLrzqt, this.copydefault, this.KWHzl, (java.util.List) obj));
                    subscribeSpotVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(objEZpvd, subscribeSpotVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow, C41595qtl c41595qtl, CategoryGroupVo categoryGroupVo, SortBy sortBy, SortOrder sortOrder) {
            this.OLrzqt = flow;
            this.copydefault = c41595qtl;
            this.AEQbTJ = categoryGroupVo;
            this.KWHzl = sortBy;
            this.EZpvd = sortOrder;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends InterfaceC41641que>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass4(flowCollector, this.copydefault, this.AEQbTJ, this.KWHzl, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mutex OLrzqt() {
        return MutexKt.Mutex$default(false, 1, null);
    }

    private final Mutex copydefault() {
        return (Mutex) this.EZpvd.getValue();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0023 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, o.qtn] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // o.AbstractC49400uno
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C41597qtn c41597qtn, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41641que>>> continuation) throws java.lang.Throwable {
        SubscribeSpotVosWithPeriodUseCase$invoke$1 subscribeSpotVosWithPeriodUseCase$invoke$1;
        C41595qtl c41595qtl;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof SubscribeSpotVosWithPeriodUseCase$invoke$1) {
            subscribeSpotVosWithPeriodUseCase$invoke$1 = (SubscribeSpotVosWithPeriodUseCase$invoke$1) continuation;
            int i = subscribeSpotVosWithPeriodUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeSpotVosWithPeriodUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeSpotVosWithPeriodUseCase$invoke$1 = new SubscribeSpotVosWithPeriodUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = subscribeSpotVosWithPeriodUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeSpotVosWithPeriodUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutexCopydefault = copydefault();
                subscribeSpotVosWithPeriodUseCase$invoke$1.L$0 = this;
                subscribeSpotVosWithPeriodUseCase$invoke$1.L$1 = c41597qtn;
                subscribeSpotVosWithPeriodUseCase$invoke$1.L$2 = mutexCopydefault;
                subscribeSpotVosWithPeriodUseCase$invoke$1.label = 1;
                if (mutexCopydefault.lock(null, subscribeSpotVosWithPeriodUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c41595qtl = this;
                r2 = c41597qtn;
                mutex = mutexCopydefault;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex2 = (Mutex) subscribeSpotVosWithPeriodUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c41597qtn = mutex2;
                    return (Flow) objEZpvd;
                }
                Mutex mutex3 = (Mutex) subscribeSpotVosWithPeriodUseCase$invoke$1.L$2;
                C41597qtn c41597qtn2 = (C41597qtn) subscribeSpotVosWithPeriodUseCase$invoke$1.L$1;
                c41595qtl = (C41595qtl) subscribeSpotVosWithPeriodUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = c41597qtn2;
                mutex = mutex3;
            }
            subscribeSpotVosWithPeriodUseCase$invoke$1.L$0 = mutex;
            subscribeSpotVosWithPeriodUseCase$invoke$1.L$1 = null;
            subscribeSpotVosWithPeriodUseCase$invoke$1.L$2 = null;
            subscribeSpotVosWithPeriodUseCase$invoke$1.label = 2;
            objEZpvd = super.EZpvd(r2, subscribeSpotVosWithPeriodUseCase$invoke$1);
            c41597qtn = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (Flow) objEZpvd;
        } finally {
            c41597qtn.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41597qtn c41597qtn, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41641que>>> continuation) throws java.lang.Throwable {
        SubscribeSpotVosWithPeriodUseCase$onExecute$1 subscribeSpotVosWithPeriodUseCase$onExecute$1;
        CategoryGroupVo categoryGroupVoKWHzl;
        SortBy sortByOLrzqt;
        PeriodEnum periodEnumGEmmrt;
        java.util.List list;
        Flow flowFlowOf;
        C41595qtl c41595qtl;
        CategoryGroupVo categoryGroupVo;
        SortOrder sortOrder;
        java.util.List list2;
        SortOrder sortOrder2;
        PeriodEnum periodEnum;
        C41595qtl c41595qtl2;
        if (continuation instanceof SubscribeSpotVosWithPeriodUseCase$onExecute$1) {
            subscribeSpotVosWithPeriodUseCase$onExecute$1 = (SubscribeSpotVosWithPeriodUseCase$onExecute$1) continuation;
            int i = subscribeSpotVosWithPeriodUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeSpotVosWithPeriodUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeSpotVosWithPeriodUseCase$onExecute$1 = new SubscribeSpotVosWithPeriodUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = subscribeSpotVosWithPeriodUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeSpotVosWithPeriodUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            categoryGroupVoKWHzl = c41597qtn.KWHzl();
            ChargeGroupVo chargeGroupVoAEQbTJ = c41597qtn.AEQbTJ();
            sortByOLrzqt = c41597qtn.OLrzqt();
            SortOrder sortOrderEZpvd = c41597qtn.EZpvd();
            java.util.List<InterfaceC41641que> listCopydefault = c41597qtn.copydefault();
            boolean zAYXKKw = c41597qtn.AYXKKw();
            boolean zValueOf = c41597qtn.valueOf();
            periodEnumGEmmrt = c41597qtn.gEmmrt();
            C41434qqj c41434qqj = C41434qqj.KWHzl;
            c41434qqj.KWHzl("SubscribeSpotVosWithPeriodUseCase", "start subscribe spot vos input = " + c41597qtn);
            list = (java.util.List) this.copydefault.copydefault(new Triple(categoryGroupVoKWHzl, chargeGroupVoAEQbTJ, listCopydefault));
            if (list != null) {
                if (!C33129mqd.KWHzl((java.util.Collection) list)) {
                    list = null;
                }
                if (list != null) {
                    c41434qqj.KWHzl("SubscribeSpotVosWithPeriodUseCase", "use price-change-turnover channel for period=" + periodEnumGEmmrt);
                    if (zValueOf) {
                        C41593qtj c41593qtj = new C41593qtj(list, periodEnumGEmmrt, zAYXKKw);
                        C41592qti c41592qti = this.djBIcL;
                        subscribeSpotVosWithPeriodUseCase$onExecute$1.L$0 = this;
                        subscribeSpotVosWithPeriodUseCase$onExecute$1.L$1 = categoryGroupVoKWHzl;
                        subscribeSpotVosWithPeriodUseCase$onExecute$1.L$2 = sortByOLrzqt;
                        subscribeSpotVosWithPeriodUseCase$onExecute$1.L$3 = sortOrderEZpvd;
                        subscribeSpotVosWithPeriodUseCase$onExecute$1.L$4 = periodEnumGEmmrt;
                        subscribeSpotVosWithPeriodUseCase$onExecute$1.L$5 = list;
                        subscribeSpotVosWithPeriodUseCase$onExecute$1.label = 1;
                        java.lang.Object objOLrzqt = c41592qti.OLrzqt(c41593qtj, subscribeSpotVosWithPeriodUseCase$onExecute$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        list2 = list;
                        obj = objOLrzqt;
                        sortOrder2 = sortOrderEZpvd;
                        periodEnum = periodEnumGEmmrt;
                        c41595qtl2 = this;
                    } else {
                        flowFlowOf = FlowKt.flowOf(C56424yEw.KWHzl());
                        c41595qtl = this;
                        categoryGroupVo = categoryGroupVoKWHzl;
                        sortOrder = sortOrderEZpvd;
                        return FlowKt.flowOn(FlowKt.conflate(new StateListAnimator(FlowKt.flowCombine(FlowKt.flowOf(list), flowFlowOf, new SubscribeSpotVosWithPeriodUseCase$onExecute$combinedFlow$1(c41595qtl, periodEnumGEmmrt, null)), c41595qtl, categoryGroupVo, sortByOLrzqt, sortOrder)), c41595qtl.AEQbTJ());
                    }
                }
            }
            C41434qqj.w$default(c41434qqj, "SubscribeSpotVosWithPeriodUseCase", "filtered spot list is empty", null, 4, null);
            return FlowKt.flowOf(yDY.AhwBna());
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list2 = (java.util.List) subscribeSpotVosWithPeriodUseCase$onExecute$1.L$5;
        periodEnum = (PeriodEnum) subscribeSpotVosWithPeriodUseCase$onExecute$1.L$4;
        sortOrder2 = (SortOrder) subscribeSpotVosWithPeriodUseCase$onExecute$1.L$3;
        sortByOLrzqt = (SortBy) subscribeSpotVosWithPeriodUseCase$onExecute$1.L$2;
        categoryGroupVoKWHzl = (CategoryGroupVo) subscribeSpotVosWithPeriodUseCase$onExecute$1.L$1;
        c41595qtl2 = (C41595qtl) subscribeSpotVosWithPeriodUseCase$onExecute$1.L$0;
        C56391yDq.AEQbTJ(obj);
        c41595qtl = c41595qtl2;
        periodEnumGEmmrt = periodEnum;
        flowFlowOf = (Flow) obj;
        list = list2;
        CategoryGroupVo categoryGroupVo2 = categoryGroupVoKWHzl;
        sortOrder = sortOrder2;
        categoryGroupVo = categoryGroupVo2;
        return FlowKt.flowOn(FlowKt.conflate(new StateListAnimator(FlowKt.flowCombine(FlowKt.flowOf(list), flowFlowOf, new SubscribeSpotVosWithPeriodUseCase$onExecute$combinedFlow$1(c41595qtl, periodEnumGEmmrt, null)), c41595qtl, categoryGroupVo, sortByOLrzqt, sortOrder)), c41595qtl.AEQbTJ());
    }
}
