package o;

import com.okinc.market.quotation.domain.futures.SubscribeFuturesVosUseCase$invoke$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesVosUseCase$onExecute$1;
import com.okinc.market.quotation.domain.futures.SubscribeFuturesVosUseCase$onExecute$combinedFlow$1;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
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

/* JADX INFO: renamed from: o.qsl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41542qsl extends AbstractC49400uno<C41540qsj, Flow<? extends java.util.List<? extends InterfaceC41638qub>>> {
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final C41535qse AYXKKw;
    public final C41464qrM EZpvd;
    public final C41463qrL KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final C41476qrY valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd2((C41540qsj) obj, (Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41638qub>>>) continuation);
    }

    /* JADX INFO: renamed from: o.qsl$Activity */
    public static final class Activity implements Flow<java.util.List<? extends InterfaceC41638qub>> {
        public final /* synthetic */ CategoryGroupVo AEQbTJ;
        public final /* synthetic */ SortOrder EZpvd;
        public final /* synthetic */ C41542qsl KWHzl;
        public final /* synthetic */ Flow OLrzqt;
        public final /* synthetic */ SortBy copydefault;

        /* JADX INFO: renamed from: o.qsl$Activity$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ CategoryGroupVo AEQbTJ;
            public final /* synthetic */ SortOrder EZpvd;
            public final /* synthetic */ C41542qsl KWHzl;
            public final /* synthetic */ SortBy OLrzqt;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C41542qsl c41542qsl, CategoryGroupVo categoryGroupVo, SortBy sortBy, SortOrder sortOrder) {
                this.copydefault = flowCollector;
                this.KWHzl = c41542qsl;
                this.AEQbTJ = categoryGroupVo;
                this.OLrzqt = sortBy;
                this.EZpvd = sortOrder;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1 subscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                if (continuation instanceof SubscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.copydefault;
                    C41476qrY c41476qrY = this.KWHzl.valueOf;
                    Quartet quartet = new Quartet(this.AEQbTJ, this.OLrzqt, this.EZpvd, (java.util.List) obj);
                    subscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1.L$0 = flowCollector2;
                    subscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    java.lang.Object objEZpvd = c41476qrY.EZpvd(quartet, subscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1);
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
                    FlowCollector flowCollector3 = (FlowCollector) subscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = flowCollector3;
                }
                subscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1.L$0 = null;
                subscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(obj2, subscribeFuturesVosUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow, C41542qsl c41542qsl, CategoryGroupVo categoryGroupVo, SortBy sortBy, SortOrder sortOrder) {
            this.OLrzqt = flow;
            this.KWHzl = c41542qsl;
            this.AEQbTJ = categoryGroupVo;
            this.copydefault = sortBy;
            this.EZpvd = sortOrder;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends InterfaceC41638qub>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass5(flowCollector, this.KWHzl, this.AEQbTJ, this.copydefault, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public C41542qsl(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41463qrL c41463qrL, @NotNull C41535qse c41535qse, @NotNull C41464qrM c41464qrM, @NotNull C41476qrY c41476qrY) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41463qrL, "");
        Intrinsics.checkNotNullParameter(c41535qse, "");
        Intrinsics.checkNotNullParameter(c41464qrM, "");
        Intrinsics.checkNotNullParameter(c41476qrY, "");
        this.OLrzqt = coroutineDispatcher;
        this.KWHzl = c41463qrL;
        this.AYXKKw = c41535qse;
        this.EZpvd = c41464qrM;
        this.valueOf = c41476qrY;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.qsm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41542qsl.KWHzl();
            }
        });
    }

    /* JADX INFO: renamed from: o.qsl$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsl.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mutex KWHzl() {
        return MutexKt.Mutex$default(false, 1, null);
    }

    private final Mutex OLrzqt() {
        return (Mutex) this.AEQbTJ.getValue();
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
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C41540qsj c41540qsj, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41638qub>>> continuation) throws java.lang.Throwable {
        SubscribeFuturesVosUseCase$invoke$1 subscribeFuturesVosUseCase$invoke$1;
        C41542qsl c41542qsl;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof SubscribeFuturesVosUseCase$invoke$1) {
            subscribeFuturesVosUseCase$invoke$1 = (SubscribeFuturesVosUseCase$invoke$1) continuation;
            int i = subscribeFuturesVosUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeFuturesVosUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeFuturesVosUseCase$invoke$1 = new SubscribeFuturesVosUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = subscribeFuturesVosUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeFuturesVosUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutexOLrzqt = OLrzqt();
                subscribeFuturesVosUseCase$invoke$1.L$0 = this;
                subscribeFuturesVosUseCase$invoke$1.L$1 = c41540qsj;
                subscribeFuturesVosUseCase$invoke$1.L$2 = mutexOLrzqt;
                subscribeFuturesVosUseCase$invoke$1.label = 1;
                if (mutexOLrzqt.lock(null, subscribeFuturesVosUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c41542qsl = this;
                r2 = c41540qsj;
                mutex = mutexOLrzqt;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex2 = (Mutex) subscribeFuturesVosUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c41540qsj = mutex2;
                    return (Flow) objEZpvd;
                }
                Mutex mutex3 = (Mutex) subscribeFuturesVosUseCase$invoke$1.L$2;
                C41540qsj c41540qsj2 = (C41540qsj) subscribeFuturesVosUseCase$invoke$1.L$1;
                c41542qsl = (C41542qsl) subscribeFuturesVosUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = c41540qsj2;
                mutex = mutex3;
            }
            subscribeFuturesVosUseCase$invoke$1.L$0 = mutex;
            subscribeFuturesVosUseCase$invoke$1.L$1 = null;
            subscribeFuturesVosUseCase$invoke$1.L$2 = null;
            subscribeFuturesVosUseCase$invoke$1.label = 2;
            objEZpvd = super.EZpvd(r2, subscribeFuturesVosUseCase$invoke$1);
            c41540qsj = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (Flow) objEZpvd;
        } finally {
            c41540qsj.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd2(@NotNull C41540qsj c41540qsj, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41638qub>>> continuation) throws java.lang.Throwable {
        SubscribeFuturesVosUseCase$onExecute$1 subscribeFuturesVosUseCase$onExecute$1;
        SortBy sortByCopydefault;
        boolean zDjBIcL;
        C41542qsl c41542qsl;
        CategoryGroupVo categoryGroupVo;
        SortOrder sortOrder;
        boolean z;
        java.util.List list;
        Flow flowFlowOf;
        CategoryGroupVo categoryGroupVo2;
        SortBy sortBy;
        java.util.List list2;
        SortOrder sortOrder2;
        SortBy sortBy2;
        C41542qsl c41542qsl2;
        if (continuation instanceof SubscribeFuturesVosUseCase$onExecute$1) {
            subscribeFuturesVosUseCase$onExecute$1 = (SubscribeFuturesVosUseCase$onExecute$1) continuation;
            int i = subscribeFuturesVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeFuturesVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeFuturesVosUseCase$onExecute$1 = new SubscribeFuturesVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = subscribeFuturesVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeFuturesVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            CategoryGroupVo categoryGroupVoOLrzqt = c41540qsj.OLrzqt();
            FuturesTypeEnum futuresTypeEnumKWHzl = c41540qsj.KWHzl();
            FuturesUnitVo futuresUnitVoEZpvd = c41540qsj.EZpvd();
            sortByCopydefault = c41540qsj.copydefault();
            SortOrder sortOrderAEQbTJ = c41540qsj.AEQbTJ();
            C41467qrP c41467qrPAYXKKw = c41540qsj.AYXKKw();
            zDjBIcL = c41540qsj.djBIcL();
            boolean zAhwBna = c41540qsj.AhwBna();
            C41434qqj.KWHzl.KWHzl("SubscribeFuturesVosUseCase", "start subscribe futures vos (legacy - fixed 1D) input = " + c41540qsj);
            C41463qrL c41463qrL = this.KWHzl;
            Quartet quartet = new Quartet(categoryGroupVoOLrzqt, futuresTypeEnumKWHzl, futuresUnitVoEZpvd, c41467qrPAYXKKw);
            subscribeFuturesVosUseCase$onExecute$1.L$0 = this;
            subscribeFuturesVosUseCase$onExecute$1.L$1 = categoryGroupVoOLrzqt;
            subscribeFuturesVosUseCase$onExecute$1.L$2 = sortByCopydefault;
            subscribeFuturesVosUseCase$onExecute$1.L$3 = sortOrderAEQbTJ;
            subscribeFuturesVosUseCase$onExecute$1.Z$0 = zDjBIcL;
            subscribeFuturesVosUseCase$onExecute$1.Z$1 = zAhwBna;
            subscribeFuturesVosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = c41463qrL.EZpvd(quartet, subscribeFuturesVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41542qsl = this;
            categoryGroupVo = categoryGroupVoOLrzqt;
            obj = objEZpvd;
            sortOrder = sortOrderAEQbTJ;
            z = zAhwBna;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (java.util.List) subscribeFuturesVosUseCase$onExecute$1.L$4;
                sortOrder2 = (SortOrder) subscribeFuturesVosUseCase$onExecute$1.L$3;
                sortBy2 = (SortBy) subscribeFuturesVosUseCase$onExecute$1.L$2;
                categoryGroupVo = (CategoryGroupVo) subscribeFuturesVosUseCase$onExecute$1.L$1;
                c41542qsl2 = (C41542qsl) subscribeFuturesVosUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                c41542qsl = c41542qsl2;
                sortOrder = sortOrder2;
                flowFlowOf = (Flow) obj;
                list = list2;
                CategoryGroupVo categoryGroupVo3 = categoryGroupVo;
                sortBy = sortBy2;
                categoryGroupVo2 = categoryGroupVo3;
                return FlowKt.flowOn(FlowKt.conflate(new Activity(FlowKt.flowCombine(FlowKt.flowOf(list), flowFlowOf, new SubscribeFuturesVosUseCase$onExecute$combinedFlow$1(c41542qsl, null)), c41542qsl, categoryGroupVo2, sortBy, sortOrder)), c41542qsl.AEQbTJ());
            }
            z = subscribeFuturesVosUseCase$onExecute$1.Z$1;
            boolean z2 = subscribeFuturesVosUseCase$onExecute$1.Z$0;
            sortOrder = (SortOrder) subscribeFuturesVosUseCase$onExecute$1.L$3;
            sortByCopydefault = (SortBy) subscribeFuturesVosUseCase$onExecute$1.L$2;
            CategoryGroupVo categoryGroupVo4 = (CategoryGroupVo) subscribeFuturesVosUseCase$onExecute$1.L$1;
            c41542qsl = (C41542qsl) subscribeFuturesVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            zDjBIcL = z2;
            categoryGroupVo = categoryGroupVo4;
        }
        list = (java.util.List) obj;
        if (list != null) {
            if (!C33129mqd.KWHzl((java.util.Collection) list)) {
                list = null;
            }
            if (list != null) {
                if (z) {
                    kotlin.Pair pair = new kotlin.Pair(list, C56443yFo.KWHzl(zDjBIcL));
                    C41535qse c41535qse = c41542qsl.AYXKKw;
                    subscribeFuturesVosUseCase$onExecute$1.L$0 = c41542qsl;
                    subscribeFuturesVosUseCase$onExecute$1.L$1 = categoryGroupVo;
                    subscribeFuturesVosUseCase$onExecute$1.L$2 = sortByCopydefault;
                    subscribeFuturesVosUseCase$onExecute$1.L$3 = sortOrder;
                    subscribeFuturesVosUseCase$onExecute$1.L$4 = list;
                    subscribeFuturesVosUseCase$onExecute$1.label = 2;
                    java.lang.Object objEZpvd2 = c41535qse.EZpvd(pair, subscribeFuturesVosUseCase$onExecute$1);
                    if (objEZpvd2 == objCopydefault) {
                        return objCopydefault;
                    }
                    list2 = list;
                    obj = objEZpvd2;
                    sortOrder2 = sortOrder;
                    sortBy2 = sortByCopydefault;
                    c41542qsl2 = c41542qsl;
                    c41542qsl = c41542qsl2;
                    sortOrder = sortOrder2;
                    flowFlowOf = (Flow) obj;
                    list = list2;
                    CategoryGroupVo categoryGroupVo32 = categoryGroupVo;
                    sortBy = sortBy2;
                    categoryGroupVo2 = categoryGroupVo32;
                    return FlowKt.flowOn(FlowKt.conflate(new Activity(FlowKt.flowCombine(FlowKt.flowOf(list), flowFlowOf, new SubscribeFuturesVosUseCase$onExecute$combinedFlow$1(c41542qsl, null)), c41542qsl, categoryGroupVo2, sortBy, sortOrder)), c41542qsl.AEQbTJ());
                }
                flowFlowOf = FlowKt.flowOf(C56424yEw.KWHzl());
                categoryGroupVo2 = categoryGroupVo;
                sortBy = sortByCopydefault;
                return FlowKt.flowOn(FlowKt.conflate(new Activity(FlowKt.flowCombine(FlowKt.flowOf(list), flowFlowOf, new SubscribeFuturesVosUseCase$onExecute$combinedFlow$1(c41542qsl, null)), c41542qsl, categoryGroupVo2, sortBy, sortOrder)), c41542qsl.AEQbTJ());
            }
        }
        C41434qqj.w$default(C41434qqj.KWHzl, "SubscribeFuturesVosUseCase", "filtered futures list is empty", null, 4, null);
        return FlowKt.flowOf(yDY.AhwBna());
    }
}
