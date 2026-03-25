package o;

import com.okinc.market.quotation.domain.spot.SubscribeSpotVosUseCase$invoke$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotVosUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotVosUseCase$onExecute$1;
import com.okinc.market.quotation.domain.spot.SubscribeSpotVosUseCase$onExecute$combinedFlow$1;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
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

/* JADX INFO: renamed from: o.qtm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41596qtm extends AbstractC49400uno<C41597qtn, Flow<? extends java.util.List<? extends InterfaceC41641que>>> {
    private static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final C41598qto AYXKKw;
    public final C41519qsO KWHzl;
    public final C41520qsP OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final C41594qtk gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.qtm$TaskDescription */
    public static final class TaskDescription implements Flow<java.util.List<? extends InterfaceC41641que>> {
        public final /* synthetic */ SortBy AEQbTJ;
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ C41596qtm KWHzl;
        public final /* synthetic */ CategoryGroupVo OLrzqt;
        public final /* synthetic */ SortOrder copydefault;

        /* JADX INFO: renamed from: o.qtm$TaskDescription$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ C41596qtm AEQbTJ;
            public final /* synthetic */ SortOrder EZpvd;
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ SortBy OLrzqt;
            public final /* synthetic */ CategoryGroupVo copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, C41596qtm c41596qtm, CategoryGroupVo categoryGroupVo, SortBy sortBy, SortOrder sortOrder) {
                this.KWHzl = flowCollector;
                this.AEQbTJ = c41596qtm;
                this.copydefault = categoryGroupVo;
                this.OLrzqt = sortBy;
                this.EZpvd = sortOrder;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeSpotVosUseCase$onExecute$$inlined$map$1$2$1 subscribeSpotVosUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeSpotVosUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeSpotVosUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeSpotVosUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeSpotVosUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeSpotVosUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeSpotVosUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeSpotVosUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeSpotVosUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeSpotVosUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.lang.Object objEZpvd = this.AEQbTJ.gEmmrt.EZpvd(new Quartet(this.copydefault, this.OLrzqt, this.EZpvd, (java.util.List) obj));
                    subscribeSpotVosUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(objEZpvd, subscribeSpotVosUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow, C41596qtm c41596qtm, CategoryGroupVo categoryGroupVo, SortBy sortBy, SortOrder sortOrder) {
            this.EZpvd = flow;
            this.KWHzl = c41596qtm;
            this.OLrzqt = categoryGroupVo;
            this.AEQbTJ = sortBy;
            this.copydefault = sortOrder;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends InterfaceC41641que>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass3(flowCollector, this.KWHzl, this.OLrzqt, this.AEQbTJ, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public C41596qtm(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41519qsO c41519qsO, @NotNull C41598qto c41598qto, @NotNull C41520qsP c41520qsP, @NotNull C41594qtk c41594qtk) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41519qsO, "");
        Intrinsics.checkNotNullParameter(c41598qto, "");
        Intrinsics.checkNotNullParameter(c41520qsP, "");
        Intrinsics.checkNotNullParameter(c41594qtk, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = c41519qsO;
        this.AYXKKw = c41598qto;
        this.OLrzqt = c41520qsP;
        this.gEmmrt = c41594qtk;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.qtp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41596qtm.copydefault();
            }
        });
    }

    /* JADX INFO: renamed from: o.qtm$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qtm.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final Mutex KWHzl() {
        return (Mutex) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mutex copydefault() {
        return MutexKt.Mutex$default(false, 1, null);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C41597qtn c41597qtn, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41641que>>> continuation) throws java.lang.Throwable {
        SubscribeSpotVosUseCase$invoke$1 subscribeSpotVosUseCase$invoke$1;
        C41596qtm c41596qtm;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof SubscribeSpotVosUseCase$invoke$1) {
            subscribeSpotVosUseCase$invoke$1 = (SubscribeSpotVosUseCase$invoke$1) continuation;
            int i = subscribeSpotVosUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeSpotVosUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeSpotVosUseCase$invoke$1 = new SubscribeSpotVosUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = subscribeSpotVosUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeSpotVosUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutexKWHzl = KWHzl();
                subscribeSpotVosUseCase$invoke$1.L$0 = this;
                subscribeSpotVosUseCase$invoke$1.L$1 = c41597qtn;
                subscribeSpotVosUseCase$invoke$1.L$2 = mutexKWHzl;
                subscribeSpotVosUseCase$invoke$1.label = 1;
                if (mutexKWHzl.lock(null, subscribeSpotVosUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c41596qtm = this;
                r2 = c41597qtn;
                mutex = mutexKWHzl;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex2 = (Mutex) subscribeSpotVosUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c41597qtn = mutex2;
                    return (Flow) objEZpvd;
                }
                Mutex mutex3 = (Mutex) subscribeSpotVosUseCase$invoke$1.L$2;
                C41597qtn c41597qtn2 = (C41597qtn) subscribeSpotVosUseCase$invoke$1.L$1;
                c41596qtm = (C41596qtm) subscribeSpotVosUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = c41597qtn2;
                mutex = mutex3;
            }
            subscribeSpotVosUseCase$invoke$1.L$0 = mutex;
            subscribeSpotVosUseCase$invoke$1.L$1 = null;
            subscribeSpotVosUseCase$invoke$1.L$2 = null;
            subscribeSpotVosUseCase$invoke$1.label = 2;
            objEZpvd = super.EZpvd(r2, subscribeSpotVosUseCase$invoke$1);
            c41597qtn = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (Flow) objEZpvd;
        } finally {
            c41597qtn.unlock(null);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41597qtn c41597qtn, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41641que>>> continuation) throws java.lang.Throwable {
        SubscribeSpotVosUseCase$onExecute$1 subscribeSpotVosUseCase$onExecute$1;
        CategoryGroupVo categoryGroupVoKWHzl;
        java.util.List list;
        Flow flowFlowOf;
        C41596qtm c41596qtm;
        SortBy sortBy;
        CategoryGroupVo categoryGroupVo;
        SortOrder sortOrder;
        java.util.List list2;
        SortBy sortBy2;
        SortOrder sortOrder2;
        C41596qtm c41596qtm2;
        if (continuation instanceof SubscribeSpotVosUseCase$onExecute$1) {
            subscribeSpotVosUseCase$onExecute$1 = (SubscribeSpotVosUseCase$onExecute$1) continuation;
            int i = subscribeSpotVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeSpotVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeSpotVosUseCase$onExecute$1 = new SubscribeSpotVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = subscribeSpotVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeSpotVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            categoryGroupVoKWHzl = c41597qtn.KWHzl();
            ChargeGroupVo chargeGroupVoAEQbTJ = c41597qtn.AEQbTJ();
            SortBy sortByOLrzqt = c41597qtn.OLrzqt();
            SortOrder sortOrderEZpvd = c41597qtn.EZpvd();
            java.util.List<InterfaceC41641que> listCopydefault = c41597qtn.copydefault();
            boolean zAYXKKw = c41597qtn.AYXKKw();
            boolean zValueOf = c41597qtn.valueOf();
            C41434qqj c41434qqj = C41434qqj.KWHzl;
            c41434qqj.KWHzl("SubscribeSpotVosUseCase", "start subscribe spot vos (legacy - fixed 1D) input = " + c41597qtn);
            list = (java.util.List) this.KWHzl.copydefault(new Triple(categoryGroupVoKWHzl, chargeGroupVoAEQbTJ, listCopydefault));
            if (list != null) {
                if (!C33129mqd.KWHzl((java.util.Collection) list)) {
                    list = null;
                }
                if (list != null) {
                    if (zValueOf) {
                        kotlin.Pair pair = new kotlin.Pair(list, C56443yFo.KWHzl(zAYXKKw));
                        C41598qto c41598qto = this.AYXKKw;
                        subscribeSpotVosUseCase$onExecute$1.L$0 = this;
                        subscribeSpotVosUseCase$onExecute$1.L$1 = categoryGroupVoKWHzl;
                        subscribeSpotVosUseCase$onExecute$1.L$2 = sortByOLrzqt;
                        subscribeSpotVosUseCase$onExecute$1.L$3 = sortOrderEZpvd;
                        subscribeSpotVosUseCase$onExecute$1.L$4 = list;
                        subscribeSpotVosUseCase$onExecute$1.label = 1;
                        java.lang.Object objOLrzqt = c41598qto.OLrzqt(pair, subscribeSpotVosUseCase$onExecute$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        list2 = list;
                        obj = objOLrzqt;
                        sortBy2 = sortByOLrzqt;
                        sortOrder2 = sortOrderEZpvd;
                        c41596qtm2 = this;
                    } else {
                        flowFlowOf = FlowKt.flowOf(C56424yEw.KWHzl());
                        c41596qtm = this;
                        sortBy = sortByOLrzqt;
                        categoryGroupVo = categoryGroupVoKWHzl;
                        sortOrder = sortOrderEZpvd;
                        return FlowKt.flowOn(FlowKt.conflate(new TaskDescription(FlowKt.flowCombine(FlowKt.flowOf(list), flowFlowOf, new SubscribeSpotVosUseCase$onExecute$combinedFlow$1(c41596qtm, null)), c41596qtm, categoryGroupVo, sortBy, sortOrder)), c41596qtm.AEQbTJ());
                    }
                }
            }
            C41434qqj.w$default(c41434qqj, "SubscribeSpotVosUseCase", "filtered spot list is empty", null, 4, null);
            return FlowKt.flowOf(yDY.AhwBna());
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list2 = (java.util.List) subscribeSpotVosUseCase$onExecute$1.L$4;
        sortOrder2 = (SortOrder) subscribeSpotVosUseCase$onExecute$1.L$3;
        sortBy2 = (SortBy) subscribeSpotVosUseCase$onExecute$1.L$2;
        categoryGroupVoKWHzl = (CategoryGroupVo) subscribeSpotVosUseCase$onExecute$1.L$1;
        c41596qtm2 = (C41596qtm) subscribeSpotVosUseCase$onExecute$1.L$0;
        C56391yDq.AEQbTJ(obj);
        sortOrder = sortOrder2;
        sortBy = sortBy2;
        categoryGroupVo = categoryGroupVoKWHzl;
        C41596qtm c41596qtm3 = c41596qtm2;
        flowFlowOf = (Flow) obj;
        list = list2;
        c41596qtm = c41596qtm3;
        return FlowKt.flowOn(FlowKt.conflate(new TaskDescription(FlowKt.flowCombine(FlowKt.flowOf(list), flowFlowOf, new SubscribeSpotVosUseCase$onExecute$combinedFlow$1(c41596qtm, null)), c41596qtm, categoryGroupVo, sortBy, sortOrder)), c41596qtm.AEQbTJ());
    }
}
