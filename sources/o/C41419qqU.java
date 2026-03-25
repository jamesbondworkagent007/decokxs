package o;

import com.okinc.market.quotation.domain.coin.SubscribeCoinVosUseCase$invoke$1;
import com.okinc.market.quotation.domain.coin.SubscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.coin.SubscribeCoinVosUseCase$onExecute$1;
import com.okinc.market.quotation.domain.coin.SubscribeCoinVosUseCase$onExecute$combinedFlow$1;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
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

/* JADX INFO: renamed from: o.qqU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41419qqU extends AbstractC49400uno<C41418qqT, Flow<? extends java.util.List<? extends InterfaceC41583qtZ>>> {
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final C41411qqM AYXKKw;
    public final CoroutineDispatcher KWHzl;
    public final C41404qqF OLrzqt;
    public final C41400qqB copydefault;
    public final C41416qqR gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.qqU$ActionBar */
    public static final class ActionBar implements Flow<java.util.List<? extends InterfaceC41583qtZ>> {
        public final /* synthetic */ CategoryGroupVo AEQbTJ;
        public final /* synthetic */ SortOrder EZpvd;
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ SortBy OLrzqt;
        public final /* synthetic */ C41419qqU copydefault;

        /* JADX INFO: renamed from: o.qqU$ActionBar$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ SortBy AEQbTJ;
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ SortOrder KWHzl;
            public final /* synthetic */ CategoryGroupVo OLrzqt;
            public final /* synthetic */ C41419qqU copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, C41419qqU c41419qqU, CategoryGroupVo categoryGroupVo, SortBy sortBy, SortOrder sortOrder) {
                this.EZpvd = flowCollector;
                this.copydefault = c41419qqU;
                this.OLrzqt = categoryGroupVo;
                this.AEQbTJ = sortBy;
                this.KWHzl = sortOrder;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1 subscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                if (continuation instanceof SubscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.EZpvd;
                    C41411qqM c41411qqM = this.copydefault.AYXKKw;
                    Quartet quartet = new Quartet(this.OLrzqt, this.AEQbTJ, this.KWHzl, (java.util.List) obj);
                    subscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1.L$0 = flowCollector2;
                    subscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    java.lang.Object objEZpvd = c41411qqM.EZpvd(quartet, subscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1);
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
                    FlowCollector flowCollector3 = (FlowCollector) subscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = flowCollector3;
                }
                subscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1.L$0 = null;
                subscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(obj2, subscribeCoinVosUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow, C41419qqU c41419qqU, CategoryGroupVo categoryGroupVo, SortBy sortBy, SortOrder sortOrder) {
            this.KWHzl = flow;
            this.copydefault = c41419qqU;
            this.AEQbTJ = categoryGroupVo;
            this.OLrzqt = sortBy;
            this.EZpvd = sortOrder;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends InterfaceC41583qtZ>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass3(flowCollector, this.copydefault, this.AEQbTJ, this.OLrzqt, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public C41419qqU(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41400qqB c41400qqB, @NotNull C41416qqR c41416qqR, @NotNull C41404qqF c41404qqF, @NotNull C41411qqM c41411qqM) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41400qqB, "");
        Intrinsics.checkNotNullParameter(c41416qqR, "");
        Intrinsics.checkNotNullParameter(c41404qqF, "");
        Intrinsics.checkNotNullParameter(c41411qqM, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = c41400qqB;
        this.gEmmrt = c41416qqR;
        this.OLrzqt = c41404qqF;
        this.AYXKKw = c41411qqM;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.qqS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41419qqU.copydefault();
            }
        });
    }

    /* JADX INFO: renamed from: o.qqU$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qqU.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final Mutex copydefault() {
        return MutexKt.Mutex$default(false, 1, null);
    }

    public final Mutex KWHzl() {
        return (Mutex) this.AEQbTJ.getValue();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0023 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, o.qqT] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // o.AbstractC49400uno
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C41418qqT c41418qqT, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41583qtZ>>> continuation) throws java.lang.Throwable {
        SubscribeCoinVosUseCase$invoke$1 subscribeCoinVosUseCase$invoke$1;
        C41419qqU c41419qqU;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof SubscribeCoinVosUseCase$invoke$1) {
            subscribeCoinVosUseCase$invoke$1 = (SubscribeCoinVosUseCase$invoke$1) continuation;
            int i = subscribeCoinVosUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeCoinVosUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeCoinVosUseCase$invoke$1 = new SubscribeCoinVosUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = subscribeCoinVosUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeCoinVosUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutexKWHzl = KWHzl();
                subscribeCoinVosUseCase$invoke$1.L$0 = this;
                subscribeCoinVosUseCase$invoke$1.L$1 = c41418qqT;
                subscribeCoinVosUseCase$invoke$1.L$2 = mutexKWHzl;
                subscribeCoinVosUseCase$invoke$1.label = 1;
                if (mutexKWHzl.lock(null, subscribeCoinVosUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c41419qqU = this;
                r2 = c41418qqT;
                mutex = mutexKWHzl;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex2 = (Mutex) subscribeCoinVosUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c41418qqT = mutex2;
                    return (Flow) objEZpvd;
                }
                Mutex mutex3 = (Mutex) subscribeCoinVosUseCase$invoke$1.L$2;
                C41418qqT c41418qqT2 = (C41418qqT) subscribeCoinVosUseCase$invoke$1.L$1;
                c41419qqU = (C41419qqU) subscribeCoinVosUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = c41418qqT2;
                mutex = mutex3;
            }
            subscribeCoinVosUseCase$invoke$1.L$0 = mutex;
            subscribeCoinVosUseCase$invoke$1.L$1 = null;
            subscribeCoinVosUseCase$invoke$1.L$2 = null;
            subscribeCoinVosUseCase$invoke$1.label = 2;
            objEZpvd = super.EZpvd(r2, subscribeCoinVosUseCase$invoke$1);
            c41418qqT = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (Flow) objEZpvd;
        } finally {
            c41418qqT.unlock(null);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41418qqT c41418qqT, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41583qtZ>>> continuation) throws java.lang.Throwable {
        SubscribeCoinVosUseCase$onExecute$1 subscribeCoinVosUseCase$onExecute$1;
        CategoryGroupVo categoryGroupVo;
        SortOrder sortOrder;
        SortBy sortBy;
        boolean z;
        C41419qqU c41419qqU;
        java.util.List list;
        SortOrder sortOrder2;
        C41419qqU c41419qqU2;
        SortBy sortBy2;
        if (continuation instanceof SubscribeCoinVosUseCase$onExecute$1) {
            subscribeCoinVosUseCase$onExecute$1 = (SubscribeCoinVosUseCase$onExecute$1) continuation;
            int i = subscribeCoinVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeCoinVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeCoinVosUseCase$onExecute$1 = new SubscribeCoinVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = subscribeCoinVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeCoinVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            CategoryGroupVo categoryGroupVoAEQbTJ = c41418qqT.AEQbTJ();
            SortBy sortByKWHzl = c41418qqT.KWHzl();
            SortOrder sortOrderCopydefault = c41418qqT.copydefault();
            java.util.List<InterfaceC41583qtZ> listEZpvd = c41418qqT.EZpvd();
            boolean zOLrzqt = c41418qqT.OLrzqt();
            C41434qqj.KWHzl.KWHzl("SubscribeCoinVosUseCase", "start subscribe vos input = " + c41418qqT);
            C41400qqB c41400qqB = this.copydefault;
            kotlin.Pair pair = new kotlin.Pair(categoryGroupVoAEQbTJ, listEZpvd);
            subscribeCoinVosUseCase$onExecute$1.L$0 = this;
            subscribeCoinVosUseCase$onExecute$1.L$1 = categoryGroupVoAEQbTJ;
            subscribeCoinVosUseCase$onExecute$1.L$2 = sortByKWHzl;
            subscribeCoinVosUseCase$onExecute$1.L$3 = sortOrderCopydefault;
            subscribeCoinVosUseCase$onExecute$1.Z$0 = zOLrzqt;
            subscribeCoinVosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = c41400qqB.EZpvd(pair, subscribeCoinVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            categoryGroupVo = categoryGroupVoAEQbTJ;
            obj = objEZpvd;
            sortOrder = sortOrderCopydefault;
            sortBy = sortByKWHzl;
            z = zOLrzqt;
            c41419qqU = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (java.util.List) subscribeCoinVosUseCase$onExecute$1.L$4;
                SortOrder sortOrder3 = (SortOrder) subscribeCoinVosUseCase$onExecute$1.L$3;
                SortBy sortBy3 = (SortBy) subscribeCoinVosUseCase$onExecute$1.L$2;
                CategoryGroupVo categoryGroupVo2 = (CategoryGroupVo) subscribeCoinVosUseCase$onExecute$1.L$1;
                c41419qqU2 = (C41419qqU) subscribeCoinVosUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                sortOrder2 = sortOrder3;
                sortBy2 = sortBy3;
                categoryGroupVo = categoryGroupVo2;
                return FlowKt.flowOn(FlowKt.conflate(new ActionBar(FlowKt.flowCombine(FlowKt.flowOf(list), (Flow) obj, new SubscribeCoinVosUseCase$onExecute$combinedFlow$1(c41419qqU2, null)), c41419qqU2, categoryGroupVo, sortBy2, sortOrder2)), c41419qqU2.AEQbTJ());
            }
            z = subscribeCoinVosUseCase$onExecute$1.Z$0;
            sortOrder = (SortOrder) subscribeCoinVosUseCase$onExecute$1.L$3;
            sortBy = (SortBy) subscribeCoinVosUseCase$onExecute$1.L$2;
            categoryGroupVo = (CategoryGroupVo) subscribeCoinVosUseCase$onExecute$1.L$1;
            c41419qqU = (C41419qqU) subscribeCoinVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (!C33129mqd.KWHzl((java.util.Collection) obj)) {
            obj = null;
        }
        java.util.List list2 = (java.util.List) obj;
        if (list2 == null) {
            C41434qqj.w$default(C41434qqj.KWHzl, "SubscribeCoinVosUseCase", "filtered list is empty", null, 4, null);
            return FlowKt.flowOf(yDY.AhwBna());
        }
        kotlin.Pair pair2 = new kotlin.Pair(list2, C56443yFo.KWHzl(z));
        C41416qqR c41416qqR = c41419qqU.gEmmrt;
        subscribeCoinVosUseCase$onExecute$1.L$0 = c41419qqU;
        subscribeCoinVosUseCase$onExecute$1.L$1 = categoryGroupVo;
        subscribeCoinVosUseCase$onExecute$1.L$2 = sortBy;
        subscribeCoinVosUseCase$onExecute$1.L$3 = sortOrder;
        subscribeCoinVosUseCase$onExecute$1.L$4 = list2;
        subscribeCoinVosUseCase$onExecute$1.label = 2;
        java.lang.Object objEZpvd2 = c41416qqR.EZpvd((java.lang.Object) pair2, (Continuation) subscribeCoinVosUseCase$onExecute$1);
        if (objEZpvd2 == objCopydefault) {
            return objCopydefault;
        }
        list = list2;
        obj = objEZpvd2;
        sortOrder2 = sortOrder;
        c41419qqU2 = c41419qqU;
        sortBy2 = sortBy;
        return FlowKt.flowOn(FlowKt.conflate(new ActionBar(FlowKt.flowCombine(FlowKt.flowOf(list), (Flow) obj, new SubscribeCoinVosUseCase$onExecute$combinedFlow$1(c41419qqU2, null)), c41419qqU2, categoryGroupVo, sortBy2, sortOrder2)), c41419qqU2.AEQbTJ());
    }
}
