package o;

import com.okinc.market.quotation.domain.futures.SubscribeFuturesVosWithPeriodUseCase$invoke$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesVosWithPeriodUseCase$onExecute$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesVosWithPeriodUseCase$onExecute$combinedFlow$1;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.trade.arch.util.Quartet;
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

/* JADX INFO: renamed from: o.qsk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41541qsk extends AbstractC49400uno<C41540qsj, Flow<? extends java.util.List<? extends InterfaceC41638qub>>> {
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final C41463qrL AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C41456qrE copydefault;
    public final C41537qsg gEmmrt;
    public final C41476qrY valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C41541qsk(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41463qrL c41463qrL, @NotNull C41537qsg c41537qsg, @NotNull C41456qrE c41456qrE, @NotNull C41476qrY c41476qrY) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41463qrL, "");
        Intrinsics.checkNotNullParameter(c41537qsg, "");
        Intrinsics.checkNotNullParameter(c41456qrE, "");
        Intrinsics.checkNotNullParameter(c41476qrY, "");
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = c41463qrL;
        this.gEmmrt = c41537qsg;
        this.copydefault = c41456qrE;
        this.valueOf = c41476qrY;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qsi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41541qsk.OLrzqt();
            }
        });
    }

    /* JADX INFO: renamed from: o.qsk$Activity */
    public static final class Activity implements Flow<java.util.List<? extends InterfaceC41638qub>> {
        public final /* synthetic */ C41541qsk AEQbTJ;
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ SortOrder KWHzl;
        public final /* synthetic */ SortBy OLrzqt;
        public final /* synthetic */ CategoryGroupVo copydefault;

        /* JADX INFO: renamed from: o.qsk$Activity$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ C41541qsk AEQbTJ;
            public final /* synthetic */ CategoryGroupVo EZpvd;
            public final /* synthetic */ SortBy KWHzl;
            public final /* synthetic */ SortOrder OLrzqt;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, C41541qsk c41541qsk, CategoryGroupVo categoryGroupVo, SortBy sortBy, SortOrder sortOrder) {
                this.copydefault = flowCollector;
                this.AEQbTJ = c41541qsk;
                this.EZpvd = categoryGroupVo;
                this.KWHzl = sortBy;
                this.OLrzqt = sortOrder;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1 subscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                if (continuation instanceof SubscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.copydefault;
                    C41476qrY c41476qrY = this.AEQbTJ.valueOf;
                    Quartet quartet = new Quartet(this.EZpvd, this.KWHzl, this.OLrzqt, (java.util.List) obj);
                    subscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1.L$0 = flowCollector2;
                    subscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    java.lang.Object objEZpvd = c41476qrY.EZpvd(quartet, subscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objEZpvd;
                    flowCollector = flowCollector2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) subscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = flowCollector3;
                }
                subscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1.L$0 = null;
                subscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(obj2, subscribeFuturesVosWithPeriodUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow, C41541qsk c41541qsk, CategoryGroupVo categoryGroupVo, SortBy sortBy, SortOrder sortOrder) {
            this.EZpvd = flow;
            this.AEQbTJ = c41541qsk;
            this.copydefault = categoryGroupVo;
            this.OLrzqt = sortBy;
            this.KWHzl = sortOrder;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends InterfaceC41638qub>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass1(flowCollector, this.AEQbTJ, this.copydefault, this.OLrzqt, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qsk$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsk.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
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
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, o.qsj] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // o.AbstractC49400uno
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C41540qsj c41540qsj, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41638qub>>> continuation) throws java.lang.Throwable {
        SubscribeFuturesVosWithPeriodUseCase$invoke$1 subscribeFuturesVosWithPeriodUseCase$invoke$1;
        C41541qsk c41541qsk;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof SubscribeFuturesVosWithPeriodUseCase$invoke$1) {
            subscribeFuturesVosWithPeriodUseCase$invoke$1 = (SubscribeFuturesVosWithPeriodUseCase$invoke$1) continuation;
            int i = subscribeFuturesVosWithPeriodUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeFuturesVosWithPeriodUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeFuturesVosWithPeriodUseCase$invoke$1 = new SubscribeFuturesVosWithPeriodUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = subscribeFuturesVosWithPeriodUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeFuturesVosWithPeriodUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutexCopydefault = copydefault();
                subscribeFuturesVosWithPeriodUseCase$invoke$1.L$0 = this;
                subscribeFuturesVosWithPeriodUseCase$invoke$1.L$1 = c41540qsj;
                subscribeFuturesVosWithPeriodUseCase$invoke$1.L$2 = mutexCopydefault;
                subscribeFuturesVosWithPeriodUseCase$invoke$1.label = 1;
                if (mutexCopydefault.lock(null, subscribeFuturesVosWithPeriodUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c41541qsk = this;
                r2 = c41540qsj;
                mutex = mutexCopydefault;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex2 = (Mutex) subscribeFuturesVosWithPeriodUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c41540qsj = mutex2;
                    return (Flow) objEZpvd;
                }
                Mutex mutex3 = (Mutex) subscribeFuturesVosWithPeriodUseCase$invoke$1.L$2;
                C41540qsj c41540qsj2 = (C41540qsj) subscribeFuturesVosWithPeriodUseCase$invoke$1.L$1;
                c41541qsk = (C41541qsk) subscribeFuturesVosWithPeriodUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = c41540qsj2;
                mutex = mutex3;
            }
            subscribeFuturesVosWithPeriodUseCase$invoke$1.L$0 = mutex;
            subscribeFuturesVosWithPeriodUseCase$invoke$1.L$1 = null;
            subscribeFuturesVosWithPeriodUseCase$invoke$1.L$2 = null;
            subscribeFuturesVosWithPeriodUseCase$invoke$1.label = 2;
            objEZpvd = super.EZpvd(r2, subscribeFuturesVosWithPeriodUseCase$invoke$1);
            c41540qsj = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (Flow) objEZpvd;
        } finally {
            c41540qsj.unlock(null);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41540qsj c41540qsj, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41638qub>>> continuation) throws java.lang.Throwable {
        SubscribeFuturesVosWithPeriodUseCase$onExecute$1 subscribeFuturesVosWithPeriodUseCase$onExecute$1;
        boolean zAhwBna;
        CategoryGroupVo categoryGroupVo;
        SortBy sortBy;
        SortOrder sortOrder;
        boolean z;
        PeriodEnum periodEnum;
        C41541qsk c41541qsk;
        java.util.List list;
        Flow flowFlowOf;
        SortOrder sortOrder2;
        SortBy sortBy2;
        CategoryGroupVo categoryGroupVo2;
        java.util.List list2;
        C41541qsk c41541qsk2;
        if (continuation instanceof SubscribeFuturesVosWithPeriodUseCase$onExecute$1) {
            subscribeFuturesVosWithPeriodUseCase$onExecute$1 = (SubscribeFuturesVosWithPeriodUseCase$onExecute$1) continuation;
            int i = subscribeFuturesVosWithPeriodUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeFuturesVosWithPeriodUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeFuturesVosWithPeriodUseCase$onExecute$1 = new SubscribeFuturesVosWithPeriodUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = subscribeFuturesVosWithPeriodUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeFuturesVosWithPeriodUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            CategoryGroupVo categoryGroupVoOLrzqt = c41540qsj.OLrzqt();
            FuturesTypeEnum futuresTypeEnumKWHzl = c41540qsj.KWHzl();
            FuturesUnitVo futuresUnitVoEZpvd = c41540qsj.EZpvd();
            SortBy sortByCopydefault = c41540qsj.copydefault();
            SortOrder sortOrderAEQbTJ = c41540qsj.AEQbTJ();
            C41467qrP c41467qrPAYXKKw = c41540qsj.AYXKKw();
            boolean zDjBIcL = c41540qsj.djBIcL();
            zAhwBna = c41540qsj.AhwBna();
            PeriodEnum periodEnumGEmmrt = c41540qsj.gEmmrt();
            C41434qqj.KWHzl.KWHzl("SubscribeFuturesVosWithPeriodUseCase", "start subscribe futures vos input = " + c41540qsj);
            C41463qrL c41463qrL = this.AEQbTJ;
            Quartet quartet = new Quartet(categoryGroupVoOLrzqt, futuresTypeEnumKWHzl, futuresUnitVoEZpvd, c41467qrPAYXKKw);
            subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$0 = this;
            subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$1 = categoryGroupVoOLrzqt;
            subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$2 = sortByCopydefault;
            subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$3 = sortOrderAEQbTJ;
            subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$4 = periodEnumGEmmrt;
            subscribeFuturesVosWithPeriodUseCase$onExecute$1.Z$0 = zDjBIcL;
            subscribeFuturesVosWithPeriodUseCase$onExecute$1.Z$1 = zAhwBna;
            subscribeFuturesVosWithPeriodUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = c41463qrL.EZpvd(quartet, subscribeFuturesVosWithPeriodUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            categoryGroupVo = categoryGroupVoOLrzqt;
            obj = objEZpvd;
            sortBy = sortByCopydefault;
            sortOrder = sortOrderAEQbTJ;
            z = zDjBIcL;
            periodEnum = periodEnumGEmmrt;
            c41541qsk = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (java.util.List) subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$5;
                periodEnum = (PeriodEnum) subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$4;
                sortOrder = (SortOrder) subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$3;
                sortBy = (SortBy) subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$2;
                categoryGroupVo2 = (CategoryGroupVo) subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$1;
                c41541qsk2 = (C41541qsk) subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                c41541qsk = c41541qsk2;
                sortOrder2 = sortOrder;
                sortBy2 = sortBy;
                flowFlowOf = (Flow) obj;
                list = list2;
                return FlowKt.flowOn(FlowKt.conflate(new Activity(FlowKt.flowCombine(FlowKt.flowOf(list), flowFlowOf, new SubscribeFuturesVosWithPeriodUseCase$onExecute$combinedFlow$1(c41541qsk, periodEnum, null)), c41541qsk, categoryGroupVo2, sortBy2, sortOrder2)), c41541qsk.AEQbTJ());
            }
            boolean z2 = subscribeFuturesVosWithPeriodUseCase$onExecute$1.Z$1;
            boolean z3 = subscribeFuturesVosWithPeriodUseCase$onExecute$1.Z$0;
            PeriodEnum periodEnum2 = (PeriodEnum) subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$4;
            SortOrder sortOrder3 = (SortOrder) subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$3;
            SortBy sortBy3 = (SortBy) subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$2;
            categoryGroupVo = (CategoryGroupVo) subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$1;
            c41541qsk = (C41541qsk) subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            zAhwBna = z2;
            z = z3;
            periodEnum = periodEnum2;
            sortOrder = sortOrder3;
            sortBy = sortBy3;
        }
        list = (java.util.List) obj;
        if (list != null) {
            if (!C33129mqd.KWHzl((java.util.Collection) list)) {
                list = null;
            }
            if (list != null) {
                C41434qqj.KWHzl.KWHzl("SubscribeFuturesVosWithPeriodUseCase", "use price-change-turnover channel for period=" + periodEnum);
                if (zAhwBna) {
                    C41536qsf c41536qsf = new C41536qsf(list, periodEnum, z);
                    C41537qsg c41537qsg = c41541qsk.gEmmrt;
                    subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$0 = c41541qsk;
                    subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$1 = categoryGroupVo;
                    subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$2 = sortBy;
                    subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$3 = sortOrder;
                    subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$4 = periodEnum;
                    subscribeFuturesVosWithPeriodUseCase$onExecute$1.L$5 = list;
                    subscribeFuturesVosWithPeriodUseCase$onExecute$1.label = 2;
                    java.lang.Object objAEQbTJ = c41537qsg.AEQbTJ((java.lang.Object) c41536qsf, (Continuation) subscribeFuturesVosWithPeriodUseCase$onExecute$1);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    list2 = list;
                    obj = objAEQbTJ;
                    categoryGroupVo2 = categoryGroupVo;
                    c41541qsk2 = c41541qsk;
                    c41541qsk = c41541qsk2;
                    sortOrder2 = sortOrder;
                    sortBy2 = sortBy;
                    flowFlowOf = (Flow) obj;
                    list = list2;
                    return FlowKt.flowOn(FlowKt.conflate(new Activity(FlowKt.flowCombine(FlowKt.flowOf(list), flowFlowOf, new SubscribeFuturesVosWithPeriodUseCase$onExecute$combinedFlow$1(c41541qsk, periodEnum, null)), c41541qsk, categoryGroupVo2, sortBy2, sortOrder2)), c41541qsk.AEQbTJ());
                }
                flowFlowOf = FlowKt.flowOf(C56424yEw.KWHzl());
                sortOrder2 = sortOrder;
                sortBy2 = sortBy;
                categoryGroupVo2 = categoryGroupVo;
                return FlowKt.flowOn(FlowKt.conflate(new Activity(FlowKt.flowCombine(FlowKt.flowOf(list), flowFlowOf, new SubscribeFuturesVosWithPeriodUseCase$onExecute$combinedFlow$1(c41541qsk, periodEnum, null)), c41541qsk, categoryGroupVo2, sortBy2, sortOrder2)), c41541qsk.AEQbTJ());
            }
        }
        C41434qqj.w$default(C41434qqj.KWHzl, "SubscribeFuturesVosWithPeriodUseCase", "filtered futures list is empty", null, 4, null);
        return FlowKt.flowOf(yDY.AhwBna());
    }
}
