package o;

import com.okinc.market.quotation.domain.spot.GetAllSpotVosUseCase$getChargeGroupAndSpotVoList$$inlined$executeAsyncTasks$1;
import com.okinc.market.quotation.domain.spot.GetAllSpotVosUseCase$getChargeGroupAndSpotVoList$1;
import com.okinc.market.quotation.domain.spot.GetAllSpotVosUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.quotation.domain.spot.GetAllSpotVosUseCase$onExecute$1;
import com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.SpotInstrument;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41525qsU extends AbstractC49400uno<C41526qsV, Triple<? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<? extends CategoryGroupVo>, ? extends java.util.List<? extends ChargeGroupVo>>> {
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC54577xNn EZpvd;
    public final C41559qtB KWHzl;
    public final C41530qsZ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return copydefault((C41526qsV) obj, (Continuation<? super Triple<? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>>>) continuation);
    }

    @yCM
    public C41525qsU(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn, @NotNull C41530qsZ c41530qsZ, @NotNull C41559qtB c41559qtB) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41530qsZ, "");
        Intrinsics.checkNotNullParameter(c41559qtB, "");
        this.AEQbTJ = coroutineDispatcher;
        this.EZpvd = interfaceC54577xNn;
        this.copydefault = c41530qsZ;
        this.KWHzl = c41559qtB;
    }

    /* JADX INFO: renamed from: o.qsU$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsU.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull C41526qsV c41526qsV, @NotNull Continuation<? super Triple<? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>>> continuation) throws java.lang.Throwable {
        GetAllSpotVosUseCase$onExecute$1 getAllSpotVosUseCase$onExecute$1;
        C41525qsU c41525qsU;
        InterfaceC41651quo interfaceC41651quo;
        RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        InterfaceC41651quo interfaceC41651quo2;
        RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy2;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        kotlin.Pair pair;
        if (continuation instanceof GetAllSpotVosUseCase$onExecute$1) {
            getAllSpotVosUseCase$onExecute$1 = (GetAllSpotVosUseCase$onExecute$1) continuation;
            int i = getAllSpotVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllSpotVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllSpotVosUseCase$onExecute$1 = new GetAllSpotVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = getAllSpotVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAllSpotVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            C41434qqj c41434qqj = C41434qqj.KWHzl;
            c41434qqj.KWHzl("GetAllSpotVosUseCase", "Starting spot data loading with strategy: " + c41526qsV.KWHzl());
            InterfaceC41651quo interfaceC41651quoCopydefault = c41526qsV.copydefault();
            RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategyAEQbTJ = c41526qsV.AEQbTJ();
            c41434qqj.KWHzl("GetAllSpotVosUseCase", "Initializing trade manager and core");
            InterfaceC54577xNn interfaceC54577xNn2 = this.EZpvd;
            if (interfaceC54577xNn2 != null) {
                getAllSpotVosUseCase$onExecute$1.L$0 = this;
                getAllSpotVosUseCase$onExecute$1.L$1 = interfaceC41651quoCopydefault;
                getAllSpotVosUseCase$onExecute$1.L$2 = rawInstrumentIsolatedStrategyAEQbTJ;
                getAllSpotVosUseCase$onExecute$1.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn2, false, null, getAllSpotVosUseCase$onExecute$1, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                c41525qsU = this;
                interfaceC41651quo2 = interfaceC41651quoCopydefault;
                rawInstrumentIsolatedStrategy2 = rawInstrumentIsolatedStrategyAEQbTJ;
            } else {
                c41525qsU = this;
                interfaceC41651quo = interfaceC41651quoCopydefault;
                rawInstrumentIsolatedStrategy = rawInstrumentIsolatedStrategyAEQbTJ;
                interfaceC54577xNn = c41525qsU.EZpvd;
                if (interfaceC54577xNn != null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
                    java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("GetAllSpotVosUseCase error, tradeCore is null");
                    C41434qqj.e$default(C41434qqj.KWHzl, "GetAllSpotVosUseCase", "Trade core initialization failed - tradeManager returned null", null, 4, null);
                    throw runtimeException;
                }
                interfaceC54581xNrOLrzqt.AxsJAY();
                C41434qqj.KWHzl.KWHzl("GetAllSpotVosUseCase", "Trade core initialized successfully");
                GetAllSpotVosUseCase$onExecute$$inlined$executeAsyncTasks$1 getAllSpotVosUseCase$onExecute$$inlined$executeAsyncTasks$1 = new GetAllSpotVosUseCase$onExecute$$inlined$executeAsyncTasks$1(null, c41525qsU, c41525qsU, interfaceC54581xNrOLrzqt, interfaceC41651quo, rawInstrumentIsolatedStrategy);
                getAllSpotVosUseCase$onExecute$1.L$0 = null;
                getAllSpotVosUseCase$onExecute$1.L$1 = null;
                getAllSpotVosUseCase$onExecute$1.L$2 = null;
                getAllSpotVosUseCase$onExecute$1.label = 2;
                objCoroutineScope = CoroutineScopeKt.coroutineScope(getAllSpotVosUseCase$onExecute$$inlined$executeAsyncTasks$1, getAllSpotVosUseCase$onExecute$1);
                if (objCoroutineScope == objCopydefault) {
                    return objCopydefault;
                }
                kotlin.Pair pair2 = (kotlin.Pair) objCoroutineScope;
                java.util.List list = (java.util.List) pair2.component1();
                pair = (kotlin.Pair) pair2.component2();
                if (pair == null) {
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCoroutineScope);
                kotlin.Pair pair22 = (kotlin.Pair) objCoroutineScope;
                java.util.List list2 = (java.util.List) pair22.component1();
                pair = (kotlin.Pair) pair22.component2();
                if (pair == null) {
                    java.util.List list3 = (java.util.List) pair.component1();
                    java.util.List list4 = (java.util.List) pair.component2();
                    if (list2 == null || list4 == null || list3.isEmpty()) {
                        C41434qqj c41434qqj2 = C41434qqj.KWHzl;
                        java.lang.Integer numAEQbTJ = list2 != null ? C56443yFo.AEQbTJ(list2.size()) : null;
                        java.lang.Integer numAEQbTJ2 = list4 != null ? C56443yFo.AEQbTJ(list4.size()) : null;
                        C41434qqj.e$default(c41434qqj2, "GetAllSpotVosUseCase", "Data validation failed - categoryList: " + numAEQbTJ + ", chargeGroupList: " + numAEQbTJ2 + ", spotVoList: " + list3.size(), null, 4, null);
                        throw new java.lang.RuntimeException("GetAllSpotVosUseCase error, spotVoList is empty or null");
                    }
                    C41434qqj.KWHzl.KWHzl("GetAllSpotVosUseCase", "Spot data loading completed successfully spotVos: " + list3.size() + ", categories: " + list2.size() + ", chargeGroups: " + list4.size());
                    return new Triple(list3, list2, list4);
                }
                java.lang.RuntimeException runtimeException2 = new java.lang.RuntimeException("GetAllSpotVosUseCase error, spotVoList is empty or null");
                C41434qqj.e$default(C41434qqj.KWHzl, "GetAllSpotVosUseCase", "Failed to get spot VO list and charge group list", null, 4, null);
                throw runtimeException2;
            }
            rawInstrumentIsolatedStrategy2 = (RawInstrumentIsolatedStrategy) getAllSpotVosUseCase$onExecute$1.L$2;
            interfaceC41651quo2 = (InterfaceC41651quo) getAllSpotVosUseCase$onExecute$1.L$1;
            c41525qsU = (C41525qsU) getAllSpotVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objCoroutineScope);
            objM8790ensureInitialize0E7RQCE$default = ((Result) objCoroutineScope).m7386unboximpl();
        }
        Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default);
        rawInstrumentIsolatedStrategy = rawInstrumentIsolatedStrategy2;
        interfaceC41651quo = interfaceC41651quo2;
        interfaceC54577xNn = c41525qsU.EZpvd;
        if (interfaceC54577xNn != null) {
        }
        java.lang.RuntimeException runtimeException3 = new java.lang.RuntimeException("GetAllSpotVosUseCase error, tradeCore is null");
        C41434qqj.e$default(C41434qqj.KWHzl, "GetAllSpotVosUseCase", "Trade core initialization failed - tradeManager returned null", null, 4, null);
        throw runtimeException3;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(InterfaceC54581xNr interfaceC54581xNr, InterfaceC41651quo interfaceC41651quo, RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy, Continuation<? super kotlin.Pair<? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<ChargeGroupVo>>> continuation) throws java.lang.Throwable {
        GetAllSpotVosUseCase$getChargeGroupAndSpotVoList$1 getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1;
        InterfaceC41651quo interfaceC41651quo2;
        RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy2;
        java.lang.Object objEZpvd;
        C41525qsU c41525qsU;
        InterfaceC54581xNr interfaceC54581xNr2;
        InterfaceC41651quo interfaceC41651quo3;
        InterfaceC41651quo interfaceC41651quo4;
        InterfaceC54581xNr interfaceC54581xNr3;
        C41525qsU c41525qsU2;
        java.util.List list;
        InterfaceC54581xNr interfaceC54581xNr4 = interfaceC54581xNr;
        if (continuation instanceof GetAllSpotVosUseCase$getChargeGroupAndSpotVoList$1) {
            getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1 = (GetAllSpotVosUseCase$getChargeGroupAndSpotVoList$1) continuation;
            int i = getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1 = new GetAllSpotVosUseCase$getChargeGroupAndSpotVoList$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$0 = this;
            getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$1 = interfaceC54581xNr4;
            interfaceC41651quo2 = interfaceC41651quo;
            getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$2 = interfaceC41651quo2;
            rawInstrumentIsolatedStrategy2 = rawInstrumentIsolatedStrategy;
            getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$3 = rawInstrumentIsolatedStrategy2;
            getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.label = 1;
            objEZpvd = interfaceC54581xNr4.EZpvd("SPOT", getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1);
            if (objEZpvd == objCopydefault2) {
                return objCopydefault2;
            }
            c41525qsU = this;
        } else if (i2 == 1) {
            RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy3 = (RawInstrumentIsolatedStrategy) getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$3;
            InterfaceC41651quo interfaceC41651quo5 = (InterfaceC41651quo) getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$2;
            InterfaceC54581xNr interfaceC54581xNr5 = (InterfaceC54581xNr) getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$1;
            c41525qsU = (C41525qsU) getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            rawInstrumentIsolatedStrategy2 = rawInstrumentIsolatedStrategy3;
            interfaceC54581xNr4 = interfaceC54581xNr5;
            objEZpvd = objCopydefault;
            interfaceC41651quo2 = interfaceC41651quo5;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objCopydefault);
                    kotlin.Pair pair = (kotlin.Pair) objCopydefault;
                    return C56390yDp.OLrzqt((java.util.List) pair.component1(), (java.util.List) pair.component2());
                }
                InterfaceC41651quo interfaceC41651quo6 = (InterfaceC41651quo) getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$2;
                InterfaceC54581xNr interfaceC54581xNr6 = (InterfaceC54581xNr) getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$1;
                C41525qsU c41525qsU3 = (C41525qsU) getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                interfaceC41651quo4 = interfaceC41651quo6;
                interfaceC54581xNr3 = interfaceC54581xNr6;
                c41525qsU2 = c41525qsU3;
                list = (java.util.List) objCopydefault;
                if (list != null) {
                    return null;
                }
                GetAllSpotVosUseCase$getChargeGroupAndSpotVoList$$inlined$executeAsyncTasks$1 getAllSpotVosUseCase$getChargeGroupAndSpotVoList$$inlined$executeAsyncTasks$1 = new GetAllSpotVosUseCase$getChargeGroupAndSpotVoList$$inlined$executeAsyncTasks$1(null, c41525qsU2, list, interfaceC41651quo4, c41525qsU2, list, interfaceC54581xNr3);
                getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$0 = null;
                getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$1 = null;
                getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$2 = null;
                getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.label = 4;
                objCopydefault = CoroutineScopeKt.coroutineScope(getAllSpotVosUseCase$getChargeGroupAndSpotVoList$$inlined$executeAsyncTasks$1, getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                kotlin.Pair pair2 = (kotlin.Pair) objCopydefault;
                return C56390yDp.OLrzqt((java.util.List) pair2.component1(), (java.util.List) pair2.component2());
            }
            RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy4 = (RawInstrumentIsolatedStrategy) getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$3;
            InterfaceC41651quo interfaceC41651quo7 = (InterfaceC41651quo) getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$2;
            interfaceC54581xNr2 = (InterfaceC54581xNr) getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$1;
            C41525qsU c41525qsU4 = (C41525qsU) getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            c41525qsU = c41525qsU4;
            rawInstrumentIsolatedStrategy2 = rawInstrumentIsolatedStrategy4;
            interfaceC41651quo3 = interfaceC41651quo7;
            C41530qsZ c41530qsZ = c41525qsU.copydefault;
            getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$0 = c41525qsU;
            getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$1 = interfaceC54581xNr2;
            getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$2 = interfaceC41651quo3;
            getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$3 = null;
            getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.label = 3;
            objCopydefault = c41530qsZ.copydefault(rawInstrumentIsolatedStrategy2, getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1);
            if (objCopydefault != objCopydefault2) {
                return objCopydefault2;
            }
            interfaceC41651quo4 = interfaceC41651quo3;
            interfaceC54581xNr3 = interfaceC54581xNr2;
            c41525qsU2 = c41525qsU;
            list = (java.util.List) objCopydefault;
            if (list != null) {
            }
        }
        AbstractC54531xLw abstractC54531xLw = (AbstractC54531xLw) objEZpvd;
        if (abstractC54531xLw == null) {
            return null;
        }
        getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$0 = c41525qsU;
        getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$1 = interfaceC54581xNr4;
        getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$2 = interfaceC41651quo2;
        getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$3 = rawInstrumentIsolatedStrategy2;
        getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.label = 2;
        if (C55608xnE.copydefault(abstractC54531xLw, getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1) == objCopydefault2) {
            return objCopydefault2;
        }
        interfaceC54581xNr2 = interfaceC54581xNr4;
        interfaceC41651quo3 = interfaceC41651quo2;
        C41530qsZ c41530qsZ2 = c41525qsU.copydefault;
        getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$0 = c41525qsU;
        getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$1 = interfaceC54581xNr2;
        getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$2 = interfaceC41651quo3;
        getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.L$3 = null;
        getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1.label = 3;
        objCopydefault = c41530qsZ2.copydefault(rawInstrumentIsolatedStrategy2, getAllSpotVosUseCase$getChargeGroupAndSpotVoList$1);
        if (objCopydefault != objCopydefault2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object KWHzl(Continuation<? super java.util.List<CategoryGroupVo>> continuation) {
        return this.KWHzl.copydefault(Unit.INSTANCE, continuation);
    }

    public final java.util.List<InterfaceC41641que> KWHzl(java.util.List<SpotInstrument> list, final InterfaceC41651quo interfaceC41651quo) {
        return C41389qpr.EZpvd(list, new Function1() { // from class: o.qsX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41525qsU.AEQbTJ(interfaceC41651quo, (SpotInstrument) obj);
            }
        });
    }

    public static final InterfaceC41641que AEQbTJ(InterfaceC41651quo interfaceC41651quo, SpotInstrument spotInstrument) {
        Intrinsics.checkNotNullParameter(spotInstrument, "");
        return interfaceC41651quo.copydefault(spotInstrument);
    }

    public static final java.lang.String KWHzl(SpotInstrument spotInstrument) {
        Intrinsics.checkNotNullParameter(spotInstrument, "");
        return spotInstrument.getQuoteSymbol();
    }

    public final java.util.List<ChargeGroupVo> AEQbTJ(java.util.List<SpotInstrument> list, InterfaceC54581xNr interfaceC54581xNr) {
        final java.util.List listEZpvd = C41389qpr.EZpvd(list, new Function1() { // from class: o.qsS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41525qsU.KWHzl((SpotInstrument) obj);
            }
        });
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) interfaceC54581xNr.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.qsW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C41525qsU.copydefault(listEZpvd, (ChargeGroupData) obj));
            }
        };
        listFJNWhG.removeIf(new java.util.function.Predicate() { // from class: o.qta
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return C41525qsU.OLrzqt(function1, obj);
            }
        });
        if ((C33129mqd.KWHzl((java.util.Collection) listFJNWhG) ? listFJNWhG : null) == null) {
            return null;
        }
        ChargeGroupVo.Application application = ChargeGroupVo.Companion;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFJNWhG, 10));
        java.util.Iterator it = listFJNWhG.iterator();
        while (it.hasNext()) {
            arrayList.add(new ChargeGroupVo((ChargeGroupData) it.next()));
        }
        return application.EZpvd(arrayList);
    }

    public static final boolean OLrzqt(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean copydefault(java.util.List list, ChargeGroupData chargeGroupData) {
        boolean z;
        Intrinsics.checkNotNullParameter(chargeGroupData, "");
        java.util.ArrayList<java.lang.String> types = chargeGroupData.getTypes();
        if ((types instanceof java.util.Collection) && types.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = types.iterator();
            while (it.hasNext()) {
                if (list.contains((java.lang.String) it.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return !z;
    }
}
