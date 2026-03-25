package o;

import com.okinc.market.quotation.domain.futures.GetAllFuturesVosUseCase$getCategoryGroup$1;
import com.okinc.market.quotation.domain.futures.GetAllFuturesVosUseCase$invoke$1;
import com.okinc.market.quotation.domain.futures.GetAllFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.quotation.domain.futures.GetAllFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$2;
import com.okinc.market.quotation.domain.futures.GetAllFuturesVosUseCase$onExecute$1;
import com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41466qrO extends AbstractC49400uno<C41468qrQ, C41467qrP> {
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final C41559qtB AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final C41531qsa KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC54577xNn gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return AEQbTJ((C41468qrQ) obj, (Continuation<? super C41467qrP>) continuation);
    }

    @yCM
    public C41466qrO(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn, @NotNull C41531qsa c41531qsa, @NotNull C41559qtB c41559qtB) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41531qsa, "");
        Intrinsics.checkNotNullParameter(c41559qtB, "");
        this.EZpvd = coroutineDispatcher;
        this.gEmmrt = interfaceC54577xNn;
        this.KWHzl = c41531qsa;
        this.AEQbTJ = c41559qtB;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qrW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41466qrO.copydefault();
            }
        });
    }

    /* JADX INFO: renamed from: o.qrO$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qrO.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final Mutex KWHzl() {
        return (Mutex) this.OLrzqt.getValue();
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
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, o.qrQ] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // o.AbstractC49400uno
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C41468qrQ c41468qrQ, @NotNull Continuation<? super C41467qrP> continuation) {
        GetAllFuturesVosUseCase$invoke$1 getAllFuturesVosUseCase$invoke$1;
        C41466qrO c41466qrO;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof GetAllFuturesVosUseCase$invoke$1) {
            getAllFuturesVosUseCase$invoke$1 = (GetAllFuturesVosUseCase$invoke$1) continuation;
            int i = getAllFuturesVosUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllFuturesVosUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllFuturesVosUseCase$invoke$1 = new GetAllFuturesVosUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getAllFuturesVosUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAllFuturesVosUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutexKWHzl = KWHzl();
                getAllFuturesVosUseCase$invoke$1.L$0 = this;
                getAllFuturesVosUseCase$invoke$1.L$1 = c41468qrQ;
                getAllFuturesVosUseCase$invoke$1.L$2 = mutexKWHzl;
                getAllFuturesVosUseCase$invoke$1.label = 1;
                if (mutexKWHzl.lock(null, getAllFuturesVosUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c41466qrO = this;
                r2 = c41468qrQ;
                mutex = mutexKWHzl;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex2 = (Mutex) getAllFuturesVosUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c41468qrQ = mutex2;
                    return (C41467qrP) objEZpvd;
                }
                Mutex mutex3 = (Mutex) getAllFuturesVosUseCase$invoke$1.L$2;
                C41468qrQ c41468qrQ2 = (C41468qrQ) getAllFuturesVosUseCase$invoke$1.L$1;
                c41466qrO = (C41466qrO) getAllFuturesVosUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = c41468qrQ2;
                mutex = mutex3;
            }
            getAllFuturesVosUseCase$invoke$1.L$0 = mutex;
            getAllFuturesVosUseCase$invoke$1.L$1 = null;
            getAllFuturesVosUseCase$invoke$1.L$2 = null;
            getAllFuturesVosUseCase$invoke$1.label = 2;
            objEZpvd = super.EZpvd(r2, getAllFuturesVosUseCase$invoke$1);
            c41468qrQ = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (C41467qrP) objEZpvd;
        } finally {
            c41468qrQ.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull C41468qrQ c41468qrQ, @NotNull Continuation<? super C41467qrP> continuation) throws java.lang.Throwable {
        GetAllFuturesVosUseCase$onExecute$1 getAllFuturesVosUseCase$onExecute$1;
        C41466qrO c41466qrO;
        InterfaceC41640qud interfaceC41640qud;
        boolean z;
        RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy;
        InterfaceC41640qud interfaceC41640qud2;
        java.lang.Object objM7386unboximpl;
        RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy2;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC41640qud interfaceC41640qud3;
        C41466qrO c41466qrO2;
        Triple triple;
        java.util.List list;
        C41466qrO c41466qrO3;
        java.util.List<CategoryGroupVo> list2;
        java.util.List list3;
        java.util.List list4;
        java.util.List list5;
        if (continuation instanceof GetAllFuturesVosUseCase$onExecute$1) {
            getAllFuturesVosUseCase$onExecute$1 = (GetAllFuturesVosUseCase$onExecute$1) continuation;
            int i = getAllFuturesVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllFuturesVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllFuturesVosUseCase$onExecute$1 = new GetAllFuturesVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = getAllFuturesVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAllFuturesVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            InterfaceC41640qud interfaceC41640qudAEQbTJ = c41468qrQ.AEQbTJ();
            boolean zKWHzl = c41468qrQ.KWHzl();
            RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategyEZpvd = c41468qrQ.EZpvd();
            C41434qqj.KWHzl.KWHzl("GetAllFuturesVosUseCase", "get all futures vos, input = " + c41468qrQ);
            InterfaceC54577xNn interfaceC54577xNn2 = this.gEmmrt;
            if (interfaceC54577xNn2 != null) {
                getAllFuturesVosUseCase$onExecute$1.L$0 = this;
                getAllFuturesVosUseCase$onExecute$1.L$1 = interfaceC41640qudAEQbTJ;
                getAllFuturesVosUseCase$onExecute$1.L$2 = rawInstrumentIsolatedStrategyEZpvd;
                getAllFuturesVosUseCase$onExecute$1.Z$0 = zKWHzl;
                getAllFuturesVosUseCase$onExecute$1.label = 1;
                java.lang.Object objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn2, false, null, getAllFuturesVosUseCase$onExecute$1, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                c41466qrO = this;
                interfaceC41640qud2 = interfaceC41640qudAEQbTJ;
                objM7386unboximpl = objM8790ensureInitialize0E7RQCE$default;
                z = zKWHzl;
                rawInstrumentIsolatedStrategy2 = rawInstrumentIsolatedStrategyEZpvd;
            } else {
                c41466qrO = this;
                interfaceC41640qud = interfaceC41640qudAEQbTJ;
                z = zKWHzl;
                rawInstrumentIsolatedStrategy = rawInstrumentIsolatedStrategyEZpvd;
                interfaceC54577xNn = c41466qrO.gEmmrt;
                if (interfaceC54577xNn != null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
                    throw new java.lang.RuntimeException("GetAllFuturesVosResult error, tradeCore is null");
                }
                interfaceC54581xNrOLrzqt.AxsJAY();
                GetAllFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$1 getAllFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$1 = new GetAllFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$1(null, c41466qrO, rawInstrumentIsolatedStrategy, c41466qrO, c41466qrO, interfaceC54581xNrOLrzqt);
                getAllFuturesVosUseCase$onExecute$1.L$0 = c41466qrO;
                getAllFuturesVosUseCase$onExecute$1.L$1 = interfaceC41640qud;
                getAllFuturesVosUseCase$onExecute$1.L$2 = null;
                getAllFuturesVosUseCase$onExecute$1.Z$0 = z;
                getAllFuturesVosUseCase$onExecute$1.label = 2;
                objCoroutineScope = CoroutineScopeKt.coroutineScope(getAllFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$1, getAllFuturesVosUseCase$onExecute$1);
                if (objCoroutineScope == objCopydefault) {
                    return objCopydefault;
                }
                interfaceC41640qud3 = interfaceC41640qud;
                c41466qrO2 = c41466qrO;
                Triple triple2 = (Triple) objCoroutineScope;
                triple = (Triple) triple2.component1();
                java.util.List<CategoryGroupVo> list6 = (java.util.List) triple2.component2();
                java.util.List list7 = (java.util.List) triple2.component3();
                if (triple != null) {
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = getAllFuturesVosUseCase$onExecute$1.Z$0;
                    java.util.List list8 = (java.util.List) getAllFuturesVosUseCase$onExecute$1.L$2;
                    list2 = (java.util.List) getAllFuturesVosUseCase$onExecute$1.L$1;
                    c41466qrO3 = (C41466qrO) getAllFuturesVosUseCase$onExecute$1.L$0;
                    C56391yDq.AEQbTJ(objCoroutineScope);
                    list = list8;
                    Triple triple3 = (Triple) objCoroutineScope;
                    list3 = (java.util.List) triple3.component1();
                    list4 = (java.util.List) triple3.component2();
                    list5 = (java.util.List) triple3.component3();
                    if ((list3 != null || list3.isEmpty()) && ((list4 == null || list4.isEmpty()) && (list5 == null || list5.isEmpty()))) {
                        throw new java.lang.IllegalStateException("GetAllFuturesVosResult error, swapVoList/futuresVoList/premarketVoList all is empty");
                    }
                    C41467qrP c41467qrP = new C41467qrP(list3, list4, list5, c41466qrO3.copydefault(list2, z), list, java.lang.System.currentTimeMillis());
                    C41434qqj.KWHzl.KWHzl("GetAllFuturesVosUseCase", "get all futures vos result: " + c41467qrP);
                    return c41467qrP;
                }
                z = getAllFuturesVosUseCase$onExecute$1.Z$0;
                InterfaceC41640qud interfaceC41640qud4 = (InterfaceC41640qud) getAllFuturesVosUseCase$onExecute$1.L$1;
                c41466qrO2 = (C41466qrO) getAllFuturesVosUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objCoroutineScope);
                interfaceC41640qud3 = interfaceC41640qud4;
                Triple triple22 = (Triple) objCoroutineScope;
                triple = (Triple) triple22.component1();
                java.util.List<CategoryGroupVo> list62 = (java.util.List) triple22.component2();
                java.util.List list72 = (java.util.List) triple22.component3();
                if (triple != null) {
                    throw new java.lang.IllegalStateException("GetAllFuturesVosResult error, GetRawFuturesInstrumentsResult is null");
                }
                GetAllFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$2 getAllFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$2 = new GetAllFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$2(null, (java.util.List) triple.component1(), c41466qrO2, interfaceC41640qud3, (java.util.List) triple.component2(), c41466qrO2, interfaceC41640qud3, (java.util.List) triple.component3(), c41466qrO2, interfaceC41640qud3);
                getAllFuturesVosUseCase$onExecute$1.L$0 = c41466qrO2;
                getAllFuturesVosUseCase$onExecute$1.L$1 = list62;
                getAllFuturesVosUseCase$onExecute$1.L$2 = list72;
                getAllFuturesVosUseCase$onExecute$1.Z$0 = z;
                getAllFuturesVosUseCase$onExecute$1.label = 3;
                java.lang.Object objCoroutineScope2 = CoroutineScopeKt.coroutineScope(getAllFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$2, getAllFuturesVosUseCase$onExecute$1);
                if (objCoroutineScope2 == objCopydefault) {
                    return objCopydefault;
                }
                list = list72;
                objCoroutineScope = objCoroutineScope2;
                c41466qrO3 = c41466qrO2;
                list2 = list62;
                Triple triple32 = (Triple) objCoroutineScope;
                list3 = (java.util.List) triple32.component1();
                list4 = (java.util.List) triple32.component2();
                list5 = (java.util.List) triple32.component3();
                if (list3 != null) {
                    throw new java.lang.IllegalStateException("GetAllFuturesVosResult error, swapVoList/futuresVoList/premarketVoList all is empty");
                }
                throw new java.lang.IllegalStateException("GetAllFuturesVosResult error, swapVoList/futuresVoList/premarketVoList all is empty");
                C41467qrP c41467qrP2 = new C41467qrP(list3, list4, list5, c41466qrO3.copydefault(list2, z), list, java.lang.System.currentTimeMillis());
                C41434qqj.KWHzl.KWHzl("GetAllFuturesVosUseCase", "get all futures vos result: " + c41467qrP2);
                return c41467qrP2;
            }
            z = getAllFuturesVosUseCase$onExecute$1.Z$0;
            rawInstrumentIsolatedStrategy2 = (RawInstrumentIsolatedStrategy) getAllFuturesVosUseCase$onExecute$1.L$2;
            interfaceC41640qud2 = (InterfaceC41640qud) getAllFuturesVosUseCase$onExecute$1.L$1;
            c41466qrO = (C41466qrO) getAllFuturesVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objCoroutineScope);
            objM7386unboximpl = ((Result) objCoroutineScope).m7386unboximpl();
        }
        Result.m7376boximpl(objM7386unboximpl);
        rawInstrumentIsolatedStrategy = rawInstrumentIsolatedStrategy2;
        interfaceC41640qud = interfaceC41640qud2;
        interfaceC54577xNn = c41466qrO.gEmmrt;
        if (interfaceC54577xNn != null) {
        }
        throw new java.lang.RuntimeException("GetAllFuturesVosResult error, tradeCore is null");
    }

    public final java.util.List<InterfaceC41638qub> EZpvd(java.util.List<SwapInstrument> list, final InterfaceC41640qud interfaceC41640qud) {
        return C41389qpr.EZpvd(list, new Function1() { // from class: o.qrR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41466qrO.OLrzqt(interfaceC41640qud, (SwapInstrument) obj);
            }
        });
    }

    public static final InterfaceC41638qub OLrzqt(InterfaceC41640qud interfaceC41640qud, SwapInstrument swapInstrument) {
        Intrinsics.checkNotNullParameter(swapInstrument, "");
        return interfaceC41640qud.KWHzl(swapInstrument);
    }

    public final java.util.List<InterfaceC41638qub> AEQbTJ(java.util.List<FutureInstrument> list, final InterfaceC41640qud interfaceC41640qud) {
        return C41389qpr.EZpvd(list, new Function1() { // from class: o.qrS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41466qrO.EZpvd(interfaceC41640qud, (FutureInstrument) obj);
            }
        });
    }

    public static final InterfaceC41638qub EZpvd(InterfaceC41640qud interfaceC41640qud, FutureInstrument futureInstrument) {
        Intrinsics.checkNotNullParameter(futureInstrument, "");
        return interfaceC41640qud.KWHzl(futureInstrument);
    }

    public final java.util.List<InterfaceC41638qub> KWHzl(java.util.List<? extends BizInstrument> list, final InterfaceC41640qud interfaceC41640qud) {
        return C41389qpr.EZpvd(list, new Function1() { // from class: o.qrU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41466qrO.KWHzl(interfaceC41640qud, (BizInstrument) obj);
            }
        });
    }

    public static final InterfaceC41638qub KWHzl(InterfaceC41640qud interfaceC41640qud, BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        return interfaceC41640qud.KWHzl(bizInstrument);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Continuation<? super java.util.List<CategoryGroupVo>> continuation) throws java.lang.Throwable {
        GetAllFuturesVosUseCase$getCategoryGroup$1 getAllFuturesVosUseCase$getCategoryGroup$1;
        if (continuation instanceof GetAllFuturesVosUseCase$getCategoryGroup$1) {
            getAllFuturesVosUseCase$getCategoryGroup$1 = (GetAllFuturesVosUseCase$getCategoryGroup$1) continuation;
            int i = getAllFuturesVosUseCase$getCategoryGroup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllFuturesVosUseCase$getCategoryGroup$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllFuturesVosUseCase$getCategoryGroup$1 = new GetAllFuturesVosUseCase$getCategoryGroup$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getAllFuturesVosUseCase$getCategoryGroup$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getAllFuturesVosUseCase$getCategoryGroup$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C41559qtB c41559qtB = this.AEQbTJ;
            Unit unit = Unit.INSTANCE;
            getAllFuturesVosUseCase$getCategoryGroup$1.label = 1;
            objCopydefault = c41559qtB.copydefault(unit, getAllFuturesVosUseCase$getCategoryGroup$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        java.util.List list = (java.util.List) objCopydefault;
        if (list != null) {
            return list;
        }
        throw new java.lang.RuntimeException("GetAllFuturesVosResult error, rawCategoryList is null");
    }

    public final java.util.List<FuturesUnitVo> AEQbTJ(InterfaceC54581xNr interfaceC54581xNr) {
        java.util.List<FutureGroupInfo> listFARcdN = interfaceC54581xNr.fARcdN();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFARcdN, 10));
        for (FutureGroupInfo futureGroupInfo : listFARcdN) {
            arrayList.add(new FuturesUnitVo(futureGroupInfo.getText(), futureGroupInfo.getCcyType(), futureGroupInfo.getCtType(), futureGroupInfo.getSort(), false, 16, null));
        }
        return arrayList;
    }

    public final java.util.List<CategoryGroupVo> copydefault(java.util.List<CategoryGroupVo> list, boolean z) {
        return z ? CategoryGroupVo.Companion.copydefault(list, true) : list;
    }
}
