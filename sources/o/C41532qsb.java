package o;

import com.okinc.market.quotation.domain.futures.SearchFuturesVosUseCase$getAllVos$1;
import com.okinc.market.quotation.domain.futures.SearchFuturesVosUseCase$invoke$1;
import com.okinc.market.quotation.domain.futures.SearchFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.quotation.domain.futures.SearchFuturesVosUseCase$onExecute$1;
import com.okinc.market.quotation.domain.futures.SearchFuturesVosUseCase$toSearchableTask$1;
import com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41532qsb extends AbstractC49400uno<Triple<? extends java.lang.String, ? extends InterfaceC41640qud, ? extends Function1<? super InterfaceC41638qub, ? extends java.lang.Boolean>>, kotlin.Pair<? extends java.lang.String, ? extends C41467qrP>> {
    private static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public java.util.Map<RawInstrumentIsolatedStrategy, SoftReference<C41467qrP>> AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C41466qrO OLrzqt;
    public final C41575qtR<InterfaceC41638qub> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd2((Triple<java.lang.String, ? extends InterfaceC41640qud, ? extends Function1<? super InterfaceC41638qub, java.lang.Boolean>>) obj, (Continuation<? super kotlin.Pair<java.lang.String, C41467qrP>>) continuation);
    }

    @yCM
    public C41532qsb(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41466qrO c41466qrO, @NotNull C41575qtR<InterfaceC41638qub> c41575qtR) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41466qrO, "");
        Intrinsics.checkNotNullParameter(c41575qtR, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = c41466qrO;
        this.gEmmrt = c41575qtR;
        this.AEQbTJ = new LinkedHashMap();
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qsc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41532qsb.OLrzqt();
            }
        });
    }

    /* JADX INFO: renamed from: o.qsb$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsb.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
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
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Triple<java.lang.String, ? extends o.qud, ? extends kotlin.jvm.functions.Function1<? super o.qub, java.lang.Boolean>>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // o.AbstractC49400uno
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Triple<java.lang.String, ? extends InterfaceC41640qud, ? extends Function1<? super InterfaceC41638qub, java.lang.Boolean>> triple, @NotNull Continuation<? super kotlin.Pair<java.lang.String, C41467qrP>> continuation) throws java.lang.Throwable {
        SearchFuturesVosUseCase$invoke$1 searchFuturesVosUseCase$invoke$1;
        C41532qsb c41532qsb;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof SearchFuturesVosUseCase$invoke$1) {
            searchFuturesVosUseCase$invoke$1 = (SearchFuturesVosUseCase$invoke$1) continuation;
            int i = searchFuturesVosUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchFuturesVosUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                searchFuturesVosUseCase$invoke$1 = new SearchFuturesVosUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = searchFuturesVosUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchFuturesVosUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutexCopydefault = copydefault();
                searchFuturesVosUseCase$invoke$1.L$0 = this;
                searchFuturesVosUseCase$invoke$1.L$1 = triple;
                searchFuturesVosUseCase$invoke$1.L$2 = mutexCopydefault;
                searchFuturesVosUseCase$invoke$1.label = 1;
                if (mutexCopydefault.lock(null, searchFuturesVosUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c41532qsb = this;
                r2 = triple;
                mutex = mutexCopydefault;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex2 = (Mutex) searchFuturesVosUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    triple = mutex2;
                    return (kotlin.Pair) objEZpvd;
                }
                Mutex mutex3 = (Mutex) searchFuturesVosUseCase$invoke$1.L$2;
                Triple triple2 = (Triple) searchFuturesVosUseCase$invoke$1.L$1;
                c41532qsb = (C41532qsb) searchFuturesVosUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = triple2;
                mutex = mutex3;
            }
            searchFuturesVosUseCase$invoke$1.L$0 = mutex;
            searchFuturesVosUseCase$invoke$1.L$1 = null;
            searchFuturesVosUseCase$invoke$1.L$2 = null;
            searchFuturesVosUseCase$invoke$1.label = 2;
            objEZpvd = super.EZpvd(r2, searchFuturesVosUseCase$invoke$1);
            triple = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (kotlin.Pair) objEZpvd;
        } finally {
            triple.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd2(@NotNull Triple<java.lang.String, ? extends InterfaceC41640qud, ? extends Function1<? super InterfaceC41638qub, java.lang.Boolean>> triple, @NotNull Continuation<? super kotlin.Pair<java.lang.String, C41467qrP>> continuation) throws java.lang.Throwable {
        SearchFuturesVosUseCase$onExecute$1 searchFuturesVosUseCase$onExecute$1;
        java.lang.String strComponent1;
        Function1<? super InterfaceC41638qub, java.lang.Boolean> function1Component3;
        C41532qsb c41532qsb;
        Function1<? super InterfaceC41638qub, java.lang.Boolean> function1;
        C41532qsb c41532qsb2;
        java.lang.String string;
        java.lang.Object objCoroutineScope;
        C41467qrP c41467qrP;
        java.lang.String str;
        if (continuation instanceof SearchFuturesVosUseCase$onExecute$1) {
            searchFuturesVosUseCase$onExecute$1 = (SearchFuturesVosUseCase$onExecute$1) continuation;
            int i = searchFuturesVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchFuturesVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                searchFuturesVosUseCase$onExecute$1 = new SearchFuturesVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = searchFuturesVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchFuturesVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            strComponent1 = triple.component1();
            InterfaceC41640qud interfaceC41640qudComponent2 = triple.component2();
            function1Component3 = triple.component3();
            C41434qqj.KWHzl.KWHzl("SearchFuturesVosUseCase", "search futures vos, [keyword=" + strComponent1 + ", filterCallback=" + function1Component3 + "]");
            if (C41388qpq.KWHzl((strComponent1 == null || (string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strComponent1).toString()) == null) ? null : C56443yFo.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) string)))) {
                RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy = RawInstrumentIsolatedStrategy.SEARCHING;
                searchFuturesVosUseCase$onExecute$1.L$0 = this;
                searchFuturesVosUseCase$onExecute$1.L$1 = strComponent1;
                searchFuturesVosUseCase$onExecute$1.L$2 = function1Component3;
                searchFuturesVosUseCase$onExecute$1.label = 1;
                objOLrzqt = OLrzqt(false, interfaceC41640qudComponent2, rawInstrumentIsolatedStrategy, searchFuturesVosUseCase$onExecute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                c41532qsb2 = this;
                C41467qrP c41467qrP2 = (C41467qrP) objOLrzqt;
                SearchFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$1 searchFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$1 = new SearchFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$1(c41532qsb2.AEQbTJ(c41467qrP2.copydefault(), strComponent1, function1Component3), c41532qsb2.AEQbTJ(c41467qrP2.AEQbTJ(), strComponent1, function1Component3), c41532qsb2.AEQbTJ(c41467qrP2.KWHzl(), strComponent1, function1Component3), null);
                searchFuturesVosUseCase$onExecute$1.L$0 = strComponent1;
                searchFuturesVosUseCase$onExecute$1.L$1 = c41467qrP2;
                searchFuturesVosUseCase$onExecute$1.L$2 = null;
                searchFuturesVosUseCase$onExecute$1.label = 2;
                objCoroutineScope = CoroutineScopeKt.coroutineScope(searchFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$1, searchFuturesVosUseCase$onExecute$1);
                if (objCoroutineScope != objCopydefault) {
                }
            } else {
                RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy2 = RawInstrumentIsolatedStrategy.DEFAULT_DISPLAYING;
                searchFuturesVosUseCase$onExecute$1.L$0 = this;
                searchFuturesVosUseCase$onExecute$1.L$1 = strComponent1;
                searchFuturesVosUseCase$onExecute$1.L$2 = function1Component3;
                searchFuturesVosUseCase$onExecute$1.label = 3;
                objOLrzqt = OLrzqt(true, interfaceC41640qudComponent2, rawInstrumentIsolatedStrategy2, searchFuturesVosUseCase$onExecute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                c41532qsb = this;
                function1 = function1Component3;
                C41467qrP c41467qrP3 = (C41467qrP) objOLrzqt;
                java.util.List<InterfaceC41638qub> listCopydefault = c41467qrP3.copydefault();
                java.util.List<InterfaceC41638qub> listAEQbTJ = c41467qrP3.AEQbTJ();
                java.util.List<InterfaceC41638qub> listKWHzl = c41467qrP3.KWHzl();
                C41467qrP c41467qrPCopy$default = C41467qrP.copy$default(c41467qrP3, listCopydefault == null ? c41532qsb.copydefault(listCopydefault, function1) : null, listAEQbTJ == null ? c41532qsb.copydefault(listAEQbTJ, function1) : null, listKWHzl != null ? c41532qsb.copydefault(listKWHzl, function1) : null, null, null, 0L, 56, null);
                C41434qqj.KWHzl.KWHzl("SearchFuturesVosUseCase", "get all futures vos result: " + c41467qrPCopy$default);
                return new kotlin.Pair(strComponent1, c41467qrPCopy$default);
            }
        } else if (i2 == 1) {
            Function1<? super InterfaceC41638qub, java.lang.Boolean> function12 = (Function1) searchFuturesVosUseCase$onExecute$1.L$2;
            java.lang.String str2 = (java.lang.String) searchFuturesVosUseCase$onExecute$1.L$1;
            c41532qsb2 = (C41532qsb) searchFuturesVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            function1Component3 = function12;
            strComponent1 = str2;
            C41467qrP c41467qrP22 = (C41467qrP) objOLrzqt;
            SearchFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$1 searchFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$12 = new SearchFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$1(c41532qsb2.AEQbTJ(c41467qrP22.copydefault(), strComponent1, function1Component3), c41532qsb2.AEQbTJ(c41467qrP22.AEQbTJ(), strComponent1, function1Component3), c41532qsb2.AEQbTJ(c41467qrP22.KWHzl(), strComponent1, function1Component3), null);
            searchFuturesVosUseCase$onExecute$1.L$0 = strComponent1;
            searchFuturesVosUseCase$onExecute$1.L$1 = c41467qrP22;
            searchFuturesVosUseCase$onExecute$1.L$2 = null;
            searchFuturesVosUseCase$onExecute$1.label = 2;
            objCoroutineScope = CoroutineScopeKt.coroutineScope(searchFuturesVosUseCase$onExecute$$inlined$executeAsyncTasks$12, searchFuturesVosUseCase$onExecute$1);
            if (objCoroutineScope != objCopydefault) {
                return objCopydefault;
            }
            c41467qrP = c41467qrP22;
            objOLrzqt = objCoroutineScope;
            str = strComponent1;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) searchFuturesVosUseCase$onExecute$1.L$2;
                strComponent1 = (java.lang.String) searchFuturesVosUseCase$onExecute$1.L$1;
                c41532qsb = (C41532qsb) searchFuturesVosUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                C41467qrP c41467qrP32 = (C41467qrP) objOLrzqt;
                java.util.List<InterfaceC41638qub> listCopydefault2 = c41467qrP32.copydefault();
                java.util.List<InterfaceC41638qub> listAEQbTJ2 = c41467qrP32.AEQbTJ();
                java.util.List<InterfaceC41638qub> listKWHzl2 = c41467qrP32.KWHzl();
                C41467qrP c41467qrPCopy$default2 = C41467qrP.copy$default(c41467qrP32, listCopydefault2 == null ? c41532qsb.copydefault(listCopydefault2, function1) : null, listAEQbTJ2 == null ? c41532qsb.copydefault(listAEQbTJ2, function1) : null, listKWHzl2 != null ? c41532qsb.copydefault(listKWHzl2, function1) : null, null, null, 0L, 56, null);
                C41434qqj.KWHzl.KWHzl("SearchFuturesVosUseCase", "get all futures vos result: " + c41467qrPCopy$default2);
                return new kotlin.Pair(strComponent1, c41467qrPCopy$default2);
            }
            C41467qrP c41467qrP4 = (C41467qrP) searchFuturesVosUseCase$onExecute$1.L$1;
            str = (java.lang.String) searchFuturesVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            c41467qrP = c41467qrP4;
        }
        Triple triple2 = (Triple) objOLrzqt;
        kotlin.Pair pair = new kotlin.Pair(str, C41467qrP.copy$default(c41467qrP, (java.util.List) triple2.component1(), (java.util.List) triple2.component2(), (java.util.List) triple2.component3(), null, null, 0L, 56, null));
        C41434qqj.KWHzl.KWHzl("SearchFuturesVosUseCase", "search futures vos result: " + pair);
        return pair;
    }

    public final Function1<Continuation<? super java.util.List<? extends InterfaceC41638qub>>, java.lang.Object> AEQbTJ(java.util.List<? extends InterfaceC41638qub> list, java.lang.String str, Function1<? super InterfaceC41638qub, java.lang.Boolean> function1) {
        return new SearchFuturesVosUseCase$toSearchableTask$1(list, this, str, function1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(boolean z, InterfaceC41640qud interfaceC41640qud, RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy, Continuation<? super C41467qrP> continuation) throws java.lang.Throwable {
        SearchFuturesVosUseCase$getAllVos$1 searchFuturesVosUseCase$getAllVos$1;
        java.lang.Object objM7377constructorimpl;
        C41532qsb c41532qsb;
        if (continuation instanceof SearchFuturesVosUseCase$getAllVos$1) {
            searchFuturesVosUseCase$getAllVos$1 = (SearchFuturesVosUseCase$getAllVos$1) continuation;
            int i = searchFuturesVosUseCase$getAllVos$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchFuturesVosUseCase$getAllVos$1.label = i - Integer.MIN_VALUE;
            } else {
                searchFuturesVosUseCase$getAllVos$1 = new SearchFuturesVosUseCase$getAllVos$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd2 = searchFuturesVosUseCase$getAllVos$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchFuturesVosUseCase$getAllVos$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd2);
            C41468qrQ c41468qrQ = new C41468qrQ(interfaceC41640qud, false, rawInstrumentIsolatedStrategy);
            Result.Application application2 = Result.Companion;
            SoftReference<C41467qrP> softReference = this.AEQbTJ.get(rawInstrumentIsolatedStrategy);
            if (softReference == null || (c41467qrP = softReference.get()) == null) {
                C41466qrO c41466qrO = this.OLrzqt;
                searchFuturesVosUseCase$getAllVos$1.L$0 = rawInstrumentIsolatedStrategy;
                searchFuturesVosUseCase$getAllVos$1.L$1 = this;
                searchFuturesVosUseCase$getAllVos$1.Z$0 = z;
                searchFuturesVosUseCase$getAllVos$1.label = 1;
                objEZpvd2 = c41466qrO.EZpvd(c41468qrQ, (Continuation<? super C41467qrP>) searchFuturesVosUseCase$getAllVos$1);
                if (objEZpvd2 == objCopydefault) {
                    return objCopydefault;
                }
                c41532qsb = this;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(c41467qrP);
            if (!z) {
                C41434qqj.KWHzl.copydefault("SearchFuturesVosUseCase", "getAllVos failed", Result.m7380exceptionOrNullimpl(objM7377constructorimpl));
                C56391yDq.AEQbTJ(objM7377constructorimpl);
                return (C41467qrP) objM7377constructorimpl;
            }
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                objM7377constructorimpl = new C41467qrP(null, null, null, yDY.AhwBna(), yDY.AhwBna(), java.lang.System.currentTimeMillis());
            }
            return (C41467qrP) objM7377constructorimpl;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z = searchFuturesVosUseCase$getAllVos$1.Z$0;
        c41532qsb = (C41532qsb) searchFuturesVosUseCase$getAllVos$1.L$1;
        rawInstrumentIsolatedStrategy = (RawInstrumentIsolatedStrategy) searchFuturesVosUseCase$getAllVos$1.L$0;
        C56391yDq.AEQbTJ(objEZpvd2);
        c41532qsb.AEQbTJ.put(rawInstrumentIsolatedStrategy, new SoftReference<>((C41467qrP) objEZpvd2));
        C41467qrP c41467qrP = (C41467qrP) objEZpvd2;
        objM7377constructorimpl = Result.m7377constructorimpl(c41467qrP);
        if (!z) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends o.qub> */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<InterfaceC41638qub> copydefault(java.util.List<? extends InterfaceC41638qub> list, Function1<? super InterfaceC41638qub, java.lang.Boolean> function1) {
        if (function1 == null) {
            return list;
        }
        if (list == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (function1.invoke((InterfaceC41638qub) obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
