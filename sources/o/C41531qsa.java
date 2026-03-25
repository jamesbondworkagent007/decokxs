package o;

import com.okinc.market.quotation.domain.futures.GetRawFuturesInstrumentsUseCase$loadFuturesInstrument$1;
import com.okinc.market.quotation.domain.futures.GetRawFuturesInstrumentsUseCase$loadRebaseInstrument$1;
import com.okinc.market.quotation.domain.futures.GetRawFuturesInstrumentsUseCase$loadSwapInstrument$1;
import com.okinc.market.quotation.domain.futures.GetRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1;
import com.okinc.market.quotation.domain.futures.GetRawFuturesInstrumentsUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.quotation.domain.futures.GetRawFuturesInstrumentsUseCase$onExecute$1;
import com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import o.InterfaceC49404uns;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41531qsa implements InterfaceC49404uns<RawInstrumentIsolatedStrategy, Triple<? extends java.util.List<? extends SwapInstrument>, ? extends java.util.List<? extends FutureInstrument>, ? extends java.util.List<? extends BizInstrument>>> {
    private static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final InterfaceC54577xNn AEQbTJ;
    public final C41566qtI KWHzl;
    public final C41561qtD OLrzqt;

    @yCM
    public C41531qsa(InterfaceC54577xNn interfaceC54577xNn, @NotNull C41561qtD c41561qtD, @NotNull C41566qtI c41566qtI) {
        Intrinsics.checkNotNullParameter(c41561qtD, "");
        Intrinsics.checkNotNullParameter(c41566qtI, "");
        this.AEQbTJ = interfaceC54577xNn;
        this.OLrzqt = c41561qtD;
        this.KWHzl = c41566qtI;
    }

    public java.lang.Object EZpvd(@NotNull RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy, @NotNull Continuation<? super Triple<? extends java.util.List<SwapInstrument>, ? extends java.util.List<FutureInstrument>, ? extends java.util.List<? extends BizInstrument>>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, rawInstrumentIsolatedStrategy, continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    public /* synthetic */ java.lang.Object OLrzqt(java.lang.Object obj, Continuation continuation) {
        return EZpvd((RawInstrumentIsolatedStrategy) obj, (Continuation<? super Triple<? extends java.util.List<SwapInstrument>, ? extends java.util.List<FutureInstrument>, ? extends java.util.List<? extends BizInstrument>>>) continuation);
    }

    /* JADX INFO: renamed from: o.qsa$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsa.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy, @NotNull Continuation<? super Triple<? extends java.util.List<SwapInstrument>, ? extends java.util.List<FutureInstrument>, ? extends java.util.List<? extends BizInstrument>>> continuation) throws java.lang.Throwable {
        GetRawFuturesInstrumentsUseCase$onExecute$1 getRawFuturesInstrumentsUseCase$onExecute$1;
        RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy2;
        C41531qsa c41531qsa;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        C41531qsa c41531qsa2;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.List list;
        kotlin.Pair pair;
        java.util.List listAhwBna;
        java.util.List listAhwBna2;
        java.util.List listAhwBna3;
        kotlin.Pair pairOLrzqt;
        RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy3 = rawInstrumentIsolatedStrategy;
        if (continuation instanceof GetRawFuturesInstrumentsUseCase$onExecute$1) {
            getRawFuturesInstrumentsUseCase$onExecute$1 = (GetRawFuturesInstrumentsUseCase$onExecute$1) continuation;
            int i = getRawFuturesInstrumentsUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRawFuturesInstrumentsUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getRawFuturesInstrumentsUseCase$onExecute$1 = new GetRawFuturesInstrumentsUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = getRawFuturesInstrumentsUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getRawFuturesInstrumentsUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            C41434qqj.KWHzl.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw futures instruments, strategy=" + rawInstrumentIsolatedStrategy3);
            InterfaceC54577xNn interfaceC54577xNn2 = this.AEQbTJ;
            if (interfaceC54577xNn2 != null) {
                getRawFuturesInstrumentsUseCase$onExecute$1.L$0 = this;
                getRawFuturesInstrumentsUseCase$onExecute$1.L$1 = rawInstrumentIsolatedStrategy3;
                getRawFuturesInstrumentsUseCase$onExecute$1.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn2, false, null, getRawFuturesInstrumentsUseCase$onExecute$1, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                c41531qsa2 = this;
            } else {
                rawInstrumentIsolatedStrategy2 = rawInstrumentIsolatedStrategy3;
                c41531qsa = this;
                interfaceC54577xNn = c41531qsa.AEQbTJ;
                if (interfaceC54577xNn != null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
                    C41434qqj.w$default(C41434qqj.KWHzl, "GetRawFuturesInstrumentsUseCase", "get raw futures instruments, trade core is null", null, 4, null);
                    return null;
                }
                interfaceC54581xNrOLrzqt.AxsJAY();
                GetRawFuturesInstrumentsUseCase$onExecute$$inlined$executeAsyncTasks$1 getRawFuturesInstrumentsUseCase$onExecute$$inlined$executeAsyncTasks$1 = new GetRawFuturesInstrumentsUseCase$onExecute$$inlined$executeAsyncTasks$1(null, c41531qsa, interfaceC54581xNrOLrzqt, rawInstrumentIsolatedStrategy2, c41531qsa, interfaceC54581xNrOLrzqt, rawInstrumentIsolatedStrategy2, c41531qsa, interfaceC54581xNrOLrzqt, rawInstrumentIsolatedStrategy2, c41531qsa, interfaceC54581xNrOLrzqt, rawInstrumentIsolatedStrategy2);
                getRawFuturesInstrumentsUseCase$onExecute$1.L$0 = c41531qsa;
                getRawFuturesInstrumentsUseCase$onExecute$1.L$1 = null;
                getRawFuturesInstrumentsUseCase$onExecute$1.label = 2;
                objCoroutineScope = CoroutineScopeKt.coroutineScope(getRawFuturesInstrumentsUseCase$onExecute$$inlined$executeAsyncTasks$1, getRawFuturesInstrumentsUseCase$onExecute$1);
                if (objCoroutineScope == objCopydefault) {
                    return objCopydefault;
                }
                Quartet quartet = (Quartet) objCoroutineScope;
                list = (java.util.List) quartet.component1();
                pair = (kotlin.Pair) quartet.component2();
                listAhwBna = (java.util.List) quartet.component3();
                listAhwBna2 = (java.util.List) quartet.component4();
                if (pair == null) {
                }
                java.util.List list2 = (java.util.List) pair.component1();
                listAhwBna3 = (java.util.List) pair.component2();
                if (list != null) {
                    pairOLrzqt = C56390yDp.OLrzqt(yDY.AhwBna(), yDY.AhwBna());
                }
                java.util.List list3 = (java.util.List) pairOLrzqt.component1();
                java.util.List list4 = (java.util.List) pairOLrzqt.component2();
                if (listAhwBna == null) {
                }
                java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list3, (java.lang.Iterable) listAhwBna);
                if (listAhwBna3 == null) {
                }
                java.util.List listDjBIcL2 = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listDjBIcL, (java.lang.Iterable) listAhwBna3);
                if (listAhwBna2 == null) {
                }
                java.util.List listDjBIcL3 = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listDjBIcL2, (java.lang.Iterable) listAhwBna2);
                Triple triple = new Triple(list4, list2, listDjBIcL3);
                C41434qqj c41434qqj = C41434qqj.KWHzl;
                if (list == null) {
                }
                if (list2 != null) {
                }
                c41434qqj.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw futures instruments result: swapInstruments=" + numAEQbTJ + ", futuresInstruments=" + numAEQbTJ + ", premarketInstruments=" + listDjBIcL3.size());
                return triple;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c41531qsa = (C41531qsa) getRawFuturesInstrumentsUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objCoroutineScope);
                Quartet quartet2 = (Quartet) objCoroutineScope;
                list = (java.util.List) quartet2.component1();
                pair = (kotlin.Pair) quartet2.component2();
                listAhwBna = (java.util.List) quartet2.component3();
                listAhwBna2 = (java.util.List) quartet2.component4();
                if (pair == null) {
                    pair = new kotlin.Pair(null, null);
                }
                java.util.List list22 = (java.util.List) pair.component1();
                listAhwBna3 = (java.util.List) pair.component2();
                if (list != null || (pairOLrzqt = (kotlin.Pair) c41531qsa.KWHzl.KWHzl(list)) == null) {
                    pairOLrzqt = C56390yDp.OLrzqt(yDY.AhwBna(), yDY.AhwBna());
                }
                java.util.List list32 = (java.util.List) pairOLrzqt.component1();
                java.util.List list42 = (java.util.List) pairOLrzqt.component2();
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                java.util.List listDjBIcL4 = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list32, (java.lang.Iterable) listAhwBna);
                if (listAhwBna3 == null) {
                    listAhwBna3 = yDY.AhwBna();
                }
                java.util.List listDjBIcL22 = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listDjBIcL4, (java.lang.Iterable) listAhwBna3);
                if (listAhwBna2 == null) {
                    listAhwBna2 = yDY.AhwBna();
                }
                java.util.List listDjBIcL32 = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listDjBIcL22, (java.lang.Iterable) listAhwBna2);
                Triple triple2 = new Triple(list42, list22, listDjBIcL32);
                C41434qqj c41434qqj2 = C41434qqj.KWHzl;
                java.lang.Integer numAEQbTJ = list == null ? C56443yFo.AEQbTJ(list.size()) : null;
                java.lang.Integer numAEQbTJ2 = list22 != null ? C56443yFo.AEQbTJ(list22.size()) : null;
                c41434qqj2.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw futures instruments result: swapInstruments=" + numAEQbTJ + ", futuresInstruments=" + numAEQbTJ2 + ", premarketInstruments=" + listDjBIcL32.size());
                return triple2;
            }
            rawInstrumentIsolatedStrategy3 = (RawInstrumentIsolatedStrategy) getRawFuturesInstrumentsUseCase$onExecute$1.L$1;
            c41531qsa2 = (C41531qsa) getRawFuturesInstrumentsUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objCoroutineScope);
            objM8790ensureInitialize0E7RQCE$default = ((Result) objCoroutineScope).m7386unboximpl();
        }
        Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default);
        rawInstrumentIsolatedStrategy2 = rawInstrumentIsolatedStrategy3;
        c41531qsa = c41531qsa2;
        interfaceC54577xNn = c41531qsa.AEQbTJ;
        if (interfaceC54577xNn != null) {
        }
        C41434qqj.w$default(C41434qqj.KWHzl, "GetRawFuturesInstrumentsUseCase", "get raw futures instruments, trade core is null", null, 4, null);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(InterfaceC54581xNr interfaceC54581xNr, RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy, Continuation<? super java.util.List<SwapInstrument>> continuation) throws java.lang.Throwable {
        GetRawFuturesInstrumentsUseCase$loadSwapInstrument$1 getRawFuturesInstrumentsUseCase$loadSwapInstrument$1;
        AbstractC54531xLw abstractC54531xLw;
        if (continuation instanceof GetRawFuturesInstrumentsUseCase$loadSwapInstrument$1) {
            getRawFuturesInstrumentsUseCase$loadSwapInstrument$1 = (GetRawFuturesInstrumentsUseCase$loadSwapInstrument$1) continuation;
            int i = getRawFuturesInstrumentsUseCase$loadSwapInstrument$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRawFuturesInstrumentsUseCase$loadSwapInstrument$1.label = i - Integer.MIN_VALUE;
            } else {
                getRawFuturesInstrumentsUseCase$loadSwapInstrument$1 = new GetRawFuturesInstrumentsUseCase$loadSwapInstrument$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getRawFuturesInstrumentsUseCase$loadSwapInstrument$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getRawFuturesInstrumentsUseCase$loadSwapInstrument$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (!((java.lang.Boolean) this.OLrzqt.OLrzqt("SWAP")).booleanValue()) {
                return null;
            }
            getRawFuturesInstrumentsUseCase$loadSwapInstrument$1.L$0 = rawInstrumentIsolatedStrategy;
            getRawFuturesInstrumentsUseCase$loadSwapInstrument$1.label = 1;
            objEZpvd = interfaceC54581xNr.EZpvd("SWAP", getRawFuturesInstrumentsUseCase$loadSwapInstrument$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC54531xLw = (AbstractC54531xLw) getRawFuturesInstrumentsUseCase$loadSwapInstrument$1.L$1;
                rawInstrumentIsolatedStrategy = (RawInstrumentIsolatedStrategy) getRawFuturesInstrumentsUseCase$loadSwapInstrument$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                java.util.List listQueryBizList$default = C55608xnE.queryBizList$default(abstractC54531xLw, false, 1, null);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listQueryBizList$default) {
                    if (obj instanceof SwapInstrument) {
                        arrayList.add(obj);
                    }
                }
                return RawInstrumentIsolatedStrategy.Companion.EZpvd(arrayList, rawInstrumentIsolatedStrategy);
            }
            rawInstrumentIsolatedStrategy = (RawInstrumentIsolatedStrategy) getRawFuturesInstrumentsUseCase$loadSwapInstrument$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        abstractC54531xLw = (AbstractC54531xLw) objEZpvd;
        if (abstractC54531xLw == null) {
            return null;
        }
        getRawFuturesInstrumentsUseCase$loadSwapInstrument$1.L$0 = rawInstrumentIsolatedStrategy;
        getRawFuturesInstrumentsUseCase$loadSwapInstrument$1.L$1 = abstractC54531xLw;
        getRawFuturesInstrumentsUseCase$loadSwapInstrument$1.label = 2;
        if (C55608xnE.copydefault(abstractC54531xLw, getRawFuturesInstrumentsUseCase$loadSwapInstrument$1) == objCopydefault) {
            return objCopydefault;
        }
        java.util.List listQueryBizList$default2 = C55608xnE.queryBizList$default(abstractC54531xLw, false, 1, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (r7.hasNext()) {
        }
        return RawInstrumentIsolatedStrategy.Companion.EZpvd(arrayList2, rawInstrumentIsolatedStrategy);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(InterfaceC54581xNr interfaceC54581xNr, RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy, Continuation<? super java.util.List<SwapInstrument>> continuation) throws java.lang.Throwable {
        GetRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1 getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1;
        C41531qsa c41531qsa;
        C41531qsa c41531qsa2;
        AbstractC54531xLw abstractC54531xLw;
        java.util.ArrayList arrayList;
        if (continuation instanceof GetRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1) {
            getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1 = (GetRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1) continuation;
            int i = getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1.label = i - Integer.MIN_VALUE;
            } else {
                getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1 = new GetRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (!((java.lang.Boolean) this.OLrzqt.OLrzqt("SWAP")).booleanValue()) {
                C41434qqj.KWHzl.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw swap pre instrument, no swap restriction");
                return null;
            }
            getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1.L$0 = this;
            getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1.L$1 = rawInstrumentIsolatedStrategy;
            getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1.label = 1;
            objEZpvd = interfaceC54581xNr.EZpvd("SWAP", getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41531qsa = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC54531xLw = (AbstractC54531xLw) getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1.L$2;
                rawInstrumentIsolatedStrategy = (RawInstrumentIsolatedStrategy) getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1.L$1;
                c41531qsa2 = (C41531qsa) getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                if (((java.lang.Boolean) c41531qsa2.OLrzqt.OLrzqt("PREMARKET")).booleanValue()) {
                    arrayList = null;
                } else {
                    java.util.List<BizInstrument> listUzCIH = abstractC54531xLw.uzCIH();
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : listUzCIH) {
                        if (obj instanceof SwapInstrument) {
                            arrayList.add(obj);
                        }
                    }
                }
                C41434qqj c41434qqj = C41434qqj.KWHzl;
                c41434qqj.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw swap pre instrument, rawPremarketInstrumentListSize=" + (arrayList == null ? C56443yFo.AEQbTJ(arrayList.size()) : null));
                java.util.List listEZpvd = arrayList == null ? RawInstrumentIsolatedStrategy.Companion.EZpvd(arrayList, rawInstrumentIsolatedStrategy) : null;
                c41434qqj.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw swap pre instrument, isolatedPremarketInstrumentListSize=" + (listEZpvd != null ? C56443yFo.AEQbTJ(listEZpvd.size()) : null));
                return listEZpvd;
            }
            rawInstrumentIsolatedStrategy = (RawInstrumentIsolatedStrategy) getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1.L$1;
            c41531qsa = (C41531qsa) getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        AbstractC54531xLw abstractC54531xLw2 = (AbstractC54531xLw) objEZpvd;
        if (abstractC54531xLw2 == null) {
            return null;
        }
        getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1.L$0 = c41531qsa;
        getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1.L$1 = rawInstrumentIsolatedStrategy;
        getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1.L$2 = abstractC54531xLw2;
        getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1.label = 2;
        if (C55608xnE.copydefault(abstractC54531xLw2, getRawFuturesInstrumentsUseCase$loadSwapPreInstrument$1) == objCopydefault) {
            return objCopydefault;
        }
        c41531qsa2 = c41531qsa;
        abstractC54531xLw = abstractC54531xLw2;
        if (((java.lang.Boolean) c41531qsa2.OLrzqt.OLrzqt("PREMARKET")).booleanValue()) {
        }
        C41434qqj c41434qqj2 = C41434qqj.KWHzl;
        if (arrayList == null) {
        }
        c41434qqj2.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw swap pre instrument, rawPremarketInstrumentListSize=" + (arrayList == null ? C56443yFo.AEQbTJ(arrayList.size()) : null));
        if (arrayList == null) {
        }
        if (listEZpvd != null) {
        }
        c41434qqj2.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw swap pre instrument, isolatedPremarketInstrumentListSize=" + (listEZpvd != null ? C56443yFo.AEQbTJ(listEZpvd.size()) : null));
        return listEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(InterfaceC54581xNr interfaceC54581xNr, RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy, Continuation<? super java.util.List<SwapInstrument>> continuation) throws java.lang.Throwable {
        GetRawFuturesInstrumentsUseCase$loadRebaseInstrument$1 getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1;
        C41531qsa c41531qsa;
        C41531qsa c41531qsa2;
        AbstractC54531xLw abstractC54531xLw;
        java.util.ArrayList arrayList;
        if (continuation instanceof GetRawFuturesInstrumentsUseCase$loadRebaseInstrument$1) {
            getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1 = (GetRawFuturesInstrumentsUseCase$loadRebaseInstrument$1) continuation;
            int i = getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1.label = i - Integer.MIN_VALUE;
            } else {
                getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1 = new GetRawFuturesInstrumentsUseCase$loadRebaseInstrument$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (!((java.lang.Boolean) this.OLrzqt.OLrzqt("SWAP")).booleanValue()) {
                C41434qqj.KWHzl.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw swap pre instrument, no swap restriction");
                return null;
            }
            getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1.L$0 = this;
            getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1.L$1 = rawInstrumentIsolatedStrategy;
            getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1.label = 1;
            objEZpvd = interfaceC54581xNr.EZpvd("SWAP", getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41531qsa = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC54531xLw = (AbstractC54531xLw) getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1.L$2;
                rawInstrumentIsolatedStrategy = (RawInstrumentIsolatedStrategy) getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1.L$1;
                c41531qsa2 = (C41531qsa) getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                if (((java.lang.Boolean) c41531qsa2.OLrzqt.OLrzqt("PREMARKET")).booleanValue()) {
                    arrayList = null;
                } else {
                    java.util.List<BizInstrument> listHDKMBd = abstractC54531xLw.hDKMBd();
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : listHDKMBd) {
                        if (obj instanceof SwapInstrument) {
                            arrayList.add(obj);
                        }
                    }
                }
                C41434qqj c41434qqj = C41434qqj.KWHzl;
                c41434qqj.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw swap pre instrument, rawRebaseInstrumentListSize=" + (arrayList == null ? C56443yFo.AEQbTJ(arrayList.size()) : null));
                java.util.List listEZpvd = arrayList == null ? RawInstrumentIsolatedStrategy.Companion.EZpvd(arrayList, rawInstrumentIsolatedStrategy) : null;
                c41434qqj.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw swap pre instrument, isolatedRebaseInstrumentListSize=" + (listEZpvd != null ? C56443yFo.AEQbTJ(listEZpvd.size()) : null));
                return listEZpvd;
            }
            rawInstrumentIsolatedStrategy = (RawInstrumentIsolatedStrategy) getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1.L$1;
            c41531qsa = (C41531qsa) getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        AbstractC54531xLw abstractC54531xLw2 = (AbstractC54531xLw) objEZpvd;
        if (abstractC54531xLw2 == null) {
            return null;
        }
        getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1.L$0 = c41531qsa;
        getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1.L$1 = rawInstrumentIsolatedStrategy;
        getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1.L$2 = abstractC54531xLw2;
        getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1.label = 2;
        if (C55608xnE.copydefault(abstractC54531xLw2, getRawFuturesInstrumentsUseCase$loadRebaseInstrument$1) == objCopydefault) {
            return objCopydefault;
        }
        c41531qsa2 = c41531qsa;
        abstractC54531xLw = abstractC54531xLw2;
        if (((java.lang.Boolean) c41531qsa2.OLrzqt.OLrzqt("PREMARKET")).booleanValue()) {
        }
        C41434qqj c41434qqj2 = C41434qqj.KWHzl;
        if (arrayList == null) {
        }
        c41434qqj2.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw swap pre instrument, rawRebaseInstrumentListSize=" + (arrayList == null ? C56443yFo.AEQbTJ(arrayList.size()) : null));
        if (arrayList == null) {
        }
        if (listEZpvd != null) {
        }
        c41434qqj2.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw swap pre instrument, isolatedRebaseInstrumentListSize=" + (listEZpvd != null ? C56443yFo.AEQbTJ(listEZpvd.size()) : null));
        return listEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(InterfaceC54581xNr interfaceC54581xNr, RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy, Continuation<? super kotlin.Pair<? extends java.util.List<FutureInstrument>, ? extends java.util.List<FutureInstrument>>> continuation) throws java.lang.Throwable {
        GetRawFuturesInstrumentsUseCase$loadFuturesInstrument$1 getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1;
        C41531qsa c41531qsa;
        C41531qsa c41531qsa2;
        AbstractC54531xLw abstractC54531xLw;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        C41434qqj c41434qqj;
        java.util.List listEZpvd;
        java.util.List listEZpvd2;
        if (continuation instanceof GetRawFuturesInstrumentsUseCase$loadFuturesInstrument$1) {
            getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1 = (GetRawFuturesInstrumentsUseCase$loadFuturesInstrument$1) continuation;
            int i = getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1.label = i - Integer.MIN_VALUE;
            } else {
                getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1 = new GetRawFuturesInstrumentsUseCase$loadFuturesInstrument$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1.L$0 = this;
            getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1.L$1 = rawInstrumentIsolatedStrategy;
            getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1.label = 1;
            objEZpvd = interfaceC54581xNr.EZpvd("FUTURES", getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41531qsa = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC54531xLw = (AbstractC54531xLw) getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1.L$2;
                rawInstrumentIsolatedStrategy = (RawInstrumentIsolatedStrategy) getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1.L$1;
                c41531qsa2 = (C41531qsa) getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                if (((java.lang.Boolean) c41531qsa2.OLrzqt.OLrzqt("FUTURES")).booleanValue()) {
                    arrayList = null;
                } else {
                    java.util.List listQueryBizList$default = C55608xnE.queryBizList$default(abstractC54531xLw, false, 1, null);
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : listQueryBizList$default) {
                        if (obj instanceof FutureInstrument) {
                            arrayList.add(obj);
                        }
                    }
                }
                C41434qqj.KWHzl.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw futures instrument, rawFuturesInstrumentListSize=" + (arrayList == null ? C56443yFo.AEQbTJ(arrayList.size()) : null));
                if (((java.lang.Boolean) c41531qsa2.OLrzqt.OLrzqt("PREMARKET")).booleanValue()) {
                    arrayList2 = null;
                } else {
                    java.util.List<BizInstrument> listUzCIH = abstractC54531xLw.uzCIH();
                    arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : listUzCIH) {
                        if (obj2 instanceof FutureInstrument) {
                            arrayList2.add(obj2);
                        }
                    }
                }
                c41434qqj = C41434qqj.KWHzl;
                c41434qqj.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw futures instrument, rawPremarketInstrumentListSize=" + (arrayList2 == null ? C56443yFo.AEQbTJ(arrayList2.size()) : null));
                listEZpvd = arrayList == null ? RawInstrumentIsolatedStrategy.Companion.EZpvd(arrayList, rawInstrumentIsolatedStrategy) : null;
                listEZpvd2 = arrayList2 == null ? RawInstrumentIsolatedStrategy.Companion.EZpvd(arrayList2, rawInstrumentIsolatedStrategy) : null;
                if ((listEZpvd != null || listEZpvd.isEmpty()) && (listEZpvd2 == null || listEZpvd2.isEmpty())) {
                    c41434qqj.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw futures instrument, isolatedFuturesInstrumentListSize=" + (listEZpvd != null ? C56443yFo.AEQbTJ(listEZpvd.size()) : null) + ", isolatedPremarketInstrumentListSize=" + (listEZpvd2 != null ? C56443yFo.AEQbTJ(listEZpvd2.size()) : null));
                    return null;
                }
                c41434qqj.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw futures instrument, isolatedFuturesInstrumentListSize=" + (listEZpvd == null ? C56443yFo.AEQbTJ(listEZpvd.size()) : null) + ", isolatedPremarketInstrumentListSize=" + (listEZpvd2 != null ? C56443yFo.AEQbTJ(listEZpvd2.size()) : null));
                if (listEZpvd == null) {
                    listEZpvd = yDY.AhwBna();
                }
                if (listEZpvd2 == null) {
                    listEZpvd2 = yDY.AhwBna();
                }
                return C56390yDp.OLrzqt(listEZpvd, listEZpvd2);
            }
            rawInstrumentIsolatedStrategy = (RawInstrumentIsolatedStrategy) getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1.L$1;
            c41531qsa = (C41531qsa) getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        AbstractC54531xLw abstractC54531xLw2 = (AbstractC54531xLw) objEZpvd;
        if (abstractC54531xLw2 == null) {
            return null;
        }
        getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1.L$0 = c41531qsa;
        getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1.L$1 = rawInstrumentIsolatedStrategy;
        getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1.L$2 = abstractC54531xLw2;
        getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1.label = 2;
        if (C55608xnE.copydefault(abstractC54531xLw2, getRawFuturesInstrumentsUseCase$loadFuturesInstrument$1) == objCopydefault) {
            return objCopydefault;
        }
        c41531qsa2 = c41531qsa;
        abstractC54531xLw = abstractC54531xLw2;
        if (((java.lang.Boolean) c41531qsa2.OLrzqt.OLrzqt("FUTURES")).booleanValue()) {
        }
        if (arrayList == null) {
        }
        C41434qqj.KWHzl.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw futures instrument, rawFuturesInstrumentListSize=" + (arrayList == null ? C56443yFo.AEQbTJ(arrayList.size()) : null));
        if (((java.lang.Boolean) c41531qsa2.OLrzqt.OLrzqt("PREMARKET")).booleanValue()) {
        }
        c41434qqj = C41434qqj.KWHzl;
        if (arrayList2 == null) {
        }
        c41434qqj.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw futures instrument, rawPremarketInstrumentListSize=" + (arrayList2 == null ? C56443yFo.AEQbTJ(arrayList2.size()) : null));
        if (arrayList == null) {
        }
        if (arrayList2 == null) {
        }
        if (listEZpvd != null) {
            if (listEZpvd != null) {
            }
            if (listEZpvd2 != null) {
            }
            c41434qqj.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw futures instrument, isolatedFuturesInstrumentListSize=" + (listEZpvd != null ? C56443yFo.AEQbTJ(listEZpvd.size()) : null) + ", isolatedPremarketInstrumentListSize=" + (listEZpvd2 != null ? C56443yFo.AEQbTJ(listEZpvd2.size()) : null));
            return null;
        }
        if (listEZpvd != null) {
        }
        if (listEZpvd2 != null) {
        }
        c41434qqj.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw futures instrument, isolatedFuturesInstrumentListSize=" + (listEZpvd != null ? C56443yFo.AEQbTJ(listEZpvd.size()) : null) + ", isolatedPremarketInstrumentListSize=" + (listEZpvd2 != null ? C56443yFo.AEQbTJ(listEZpvd2.size()) : null));
        return null;
        if (listEZpvd == null) {
        }
        if (listEZpvd2 != null) {
        }
        c41434qqj.KWHzl("GetRawFuturesInstrumentsUseCase", "get raw futures instrument, isolatedFuturesInstrumentListSize=" + (listEZpvd == null ? C56443yFo.AEQbTJ(listEZpvd.size()) : null) + ", isolatedPremarketInstrumentListSize=" + (listEZpvd2 != null ? C56443yFo.AEQbTJ(listEZpvd2.size()) : null));
        if (listEZpvd == null) {
        }
        if (listEZpvd2 == null) {
        }
        return C56390yDp.OLrzqt(listEZpvd, listEZpvd2);
    }
}
