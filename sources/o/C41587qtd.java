package o;

import com.okinc.market.quotation.domain.spot.SearchSpotVosUseCase$getAllVos$1;
import com.okinc.market.quotation.domain.spot.SearchSpotVosUseCase$invoke$1;
import com.okinc.market.quotation.domain.spot.SearchSpotVosUseCase$onExecute$1;
import com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.trade.arch.util.Quartet;
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
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41587qtd extends AbstractC49400uno<Triple<? extends java.lang.String, ? extends InterfaceC41651quo, ? extends Function1<? super InterfaceC41641que, ? extends java.lang.Boolean>>, Quartet<? extends java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<? extends CategoryGroupVo>, ? extends java.util.List<? extends ChargeGroupVo>>> {
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final C41525qsU AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public java.util.Map<RawInstrumentIsolatedStrategy, SoftReference<Triple<java.util.List<InterfaceC41641que>, java.util.List<CategoryGroupVo>, java.util.List<ChargeGroupVo>>>> OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final C41575qtR<InterfaceC41641que> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd2((Triple<java.lang.String, ? extends InterfaceC41651quo, ? extends Function1<? super InterfaceC41641que, java.lang.Boolean>>) obj, (Continuation<? super Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>>>) continuation);
    }

    @yCM
    public C41587qtd(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41525qsU c41525qsU, @NotNull C41575qtR<InterfaceC41641que> c41575qtR) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41525qsU, "");
        Intrinsics.checkNotNullParameter(c41575qtR, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = c41525qsU;
        this.djBIcL = c41575qtR;
        this.OLrzqt = new LinkedHashMap();
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qtb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41587qtd.OLrzqt();
            }
        });
    }

    /* JADX INFO: renamed from: o.qtd$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qtd.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final Mutex KWHzl() {
        return (Mutex) this.KWHzl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mutex OLrzqt() {
        return MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0023 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Triple<java.lang.String, ? extends o.quo, ? extends kotlin.jvm.functions.Function1<? super o.que, java.lang.Boolean>>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // o.AbstractC49400uno
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Triple<java.lang.String, ? extends InterfaceC41651quo, ? extends Function1<? super InterfaceC41641que, java.lang.Boolean>> triple, @NotNull Continuation<? super Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>>> continuation) throws java.lang.Throwable {
        SearchSpotVosUseCase$invoke$1 searchSpotVosUseCase$invoke$1;
        C41587qtd c41587qtd;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof SearchSpotVosUseCase$invoke$1) {
            searchSpotVosUseCase$invoke$1 = (SearchSpotVosUseCase$invoke$1) continuation;
            int i = searchSpotVosUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchSpotVosUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                searchSpotVosUseCase$invoke$1 = new SearchSpotVosUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = searchSpotVosUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchSpotVosUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutexKWHzl = KWHzl();
                searchSpotVosUseCase$invoke$1.L$0 = this;
                searchSpotVosUseCase$invoke$1.L$1 = triple;
                searchSpotVosUseCase$invoke$1.L$2 = mutexKWHzl;
                searchSpotVosUseCase$invoke$1.label = 1;
                if (mutexKWHzl.lock(null, searchSpotVosUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c41587qtd = this;
                r2 = triple;
                mutex = mutexKWHzl;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex2 = (Mutex) searchSpotVosUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    triple = mutex2;
                    return (Quartet) objEZpvd;
                }
                Mutex mutex3 = (Mutex) searchSpotVosUseCase$invoke$1.L$2;
                Triple triple2 = (Triple) searchSpotVosUseCase$invoke$1.L$1;
                c41587qtd = (C41587qtd) searchSpotVosUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = triple2;
                mutex = mutex3;
            }
            searchSpotVosUseCase$invoke$1.L$0 = mutex;
            searchSpotVosUseCase$invoke$1.L$1 = null;
            searchSpotVosUseCase$invoke$1.L$2 = null;
            searchSpotVosUseCase$invoke$1.label = 2;
            objEZpvd = super.EZpvd(r2, searchSpotVosUseCase$invoke$1);
            triple = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (Quartet) objEZpvd;
        } finally {
            triple.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd2(@NotNull Triple<java.lang.String, ? extends InterfaceC41651quo, ? extends Function1<? super InterfaceC41641que, java.lang.Boolean>> triple, @NotNull Continuation<? super Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>>> continuation) throws java.lang.Throwable {
        SearchSpotVosUseCase$onExecute$1 searchSpotVosUseCase$onExecute$1;
        Function1<? super InterfaceC41641que, java.lang.Boolean> function1Component3;
        java.lang.String str;
        C41587qtd c41587qtd;
        java.lang.String str2;
        java.lang.String string;
        java.lang.Object objEZpvd;
        java.util.List list;
        Function1<? super InterfaceC41641que, java.lang.Boolean> function1;
        java.util.List list2;
        java.lang.String str3;
        if (continuation instanceof SearchSpotVosUseCase$onExecute$1) {
            searchSpotVosUseCase$onExecute$1 = (SearchSpotVosUseCase$onExecute$1) continuation;
            int i = searchSpotVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchSpotVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                searchSpotVosUseCase$onExecute$1 = new SearchSpotVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = searchSpotVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchSpotVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String strComponent1 = triple.component1();
            InterfaceC41651quo interfaceC41651quoComponent2 = triple.component2();
            function1Component3 = triple.component3();
            C41434qqj.KWHzl.KWHzl("SearchSpotVosUseCase", "search spot vos, keyword=" + strComponent1 + ", filterCallback=" + function1Component3);
            if (C41388qpq.KWHzl((strComponent1 == null || (string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strComponent1).toString()) == null) ? null : C56443yFo.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) string)))) {
                RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy = RawInstrumentIsolatedStrategy.SEARCHING;
                searchSpotVosUseCase$onExecute$1.L$0 = this;
                searchSpotVosUseCase$onExecute$1.L$1 = strComponent1;
                searchSpotVosUseCase$onExecute$1.L$2 = function1Component3;
                searchSpotVosUseCase$onExecute$1.label = 1;
                java.lang.Object objOLrzqt = OLrzqt(false, interfaceC41651quoComponent2, rawInstrumentIsolatedStrategy, searchSpotVosUseCase$onExecute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                c41587qtd = this;
                str2 = strComponent1;
                obj = objOLrzqt;
                Triple triple2 = (Triple) obj;
                java.util.List list3 = (java.util.List) triple2.component1();
                java.util.List list4 = (java.util.List) triple2.component2();
                java.util.List list5 = (java.util.List) triple2.component3();
                kotlin.Pair pair = new kotlin.Pair(list3, str2);
                C41575qtR<InterfaceC41641que> c41575qtR = c41587qtd.djBIcL;
                searchSpotVosUseCase$onExecute$1.L$0 = str2;
                searchSpotVosUseCase$onExecute$1.L$1 = function1Component3;
                searchSpotVosUseCase$onExecute$1.L$2 = list4;
                searchSpotVosUseCase$onExecute$1.L$3 = list5;
                searchSpotVosUseCase$onExecute$1.label = 2;
                objEZpvd = c41575qtR.EZpvd(pair, (Continuation) searchSpotVosUseCase$onExecute$1);
                if (objEZpvd != objCopydefault) {
                }
            } else {
                RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy2 = RawInstrumentIsolatedStrategy.DEFAULT_DISPLAYING;
                searchSpotVosUseCase$onExecute$1.L$0 = strComponent1;
                searchSpotVosUseCase$onExecute$1.L$1 = function1Component3;
                searchSpotVosUseCase$onExecute$1.label = 3;
                java.lang.Object objOLrzqt2 = OLrzqt(true, interfaceC41651quoComponent2, rawInstrumentIsolatedStrategy2, searchSpotVosUseCase$onExecute$1);
                if (objOLrzqt2 == objCopydefault) {
                    return objCopydefault;
                }
                str = strComponent1;
                obj = objOLrzqt2;
                Triple triple3 = (Triple) obj;
                java.util.List list6 = (java.util.List) triple3.component1();
                java.util.List list7 = (java.util.List) triple3.component2();
                java.util.List list8 = (java.util.List) triple3.component3();
                C41434qqj.KWHzl.KWHzl("SearchSpotVosUseCase", "get all spot vos result, size=" + list6.size());
                return new Quartet(str, copydefault(list6, function1Component3), list7, list8);
            }
        } else if (i2 == 1) {
            function1Component3 = (Function1) searchSpotVosUseCase$onExecute$1.L$2;
            str2 = (java.lang.String) searchSpotVosUseCase$onExecute$1.L$1;
            c41587qtd = (C41587qtd) searchSpotVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            Triple triple22 = (Triple) obj;
            java.util.List list32 = (java.util.List) triple22.component1();
            java.util.List list42 = (java.util.List) triple22.component2();
            java.util.List list52 = (java.util.List) triple22.component3();
            kotlin.Pair pair2 = new kotlin.Pair(list32, str2);
            C41575qtR<InterfaceC41641que> c41575qtR2 = c41587qtd.djBIcL;
            searchSpotVosUseCase$onExecute$1.L$0 = str2;
            searchSpotVosUseCase$onExecute$1.L$1 = function1Component3;
            searchSpotVosUseCase$onExecute$1.L$2 = list42;
            searchSpotVosUseCase$onExecute$1.L$3 = list52;
            searchSpotVosUseCase$onExecute$1.label = 2;
            objEZpvd = c41575qtR2.EZpvd(pair2, (Continuation) searchSpotVosUseCase$onExecute$1);
            if (objEZpvd != objCopydefault) {
                return objCopydefault;
            }
            list = list42;
            java.lang.String str4 = str2;
            function1 = function1Component3;
            list2 = list52;
            obj = objEZpvd;
            str3 = str4;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1Component3 = (Function1) searchSpotVosUseCase$onExecute$1.L$1;
                str = (java.lang.String) searchSpotVosUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                Triple triple32 = (Triple) obj;
                java.util.List list62 = (java.util.List) triple32.component1();
                java.util.List list72 = (java.util.List) triple32.component2();
                java.util.List list82 = (java.util.List) triple32.component3();
                C41434qqj.KWHzl.KWHzl("SearchSpotVosUseCase", "get all spot vos result, size=" + list62.size());
                return new Quartet(str, copydefault(list62, function1Component3), list72, list82);
            }
            list2 = (java.util.List) searchSpotVosUseCase$onExecute$1.L$3;
            list = (java.util.List) searchSpotVosUseCase$onExecute$1.L$2;
            function1 = (Function1) searchSpotVosUseCase$onExecute$1.L$1;
            str3 = (java.lang.String) searchSpotVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        java.util.List<InterfaceC41641que> listCopydefault = copydefault((java.util.List) obj, function1);
        C41434qqj.KWHzl.KWHzl("SearchSpotVosUseCase", "search spot vos result, size=" + listCopydefault.size());
        return new Quartet(str3, listCopydefault, list, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(boolean z, InterfaceC41651quo interfaceC41651quo, RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy, Continuation<? super Triple<? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>>> continuation) throws java.lang.Throwable {
        SearchSpotVosUseCase$getAllVos$1 searchSpotVosUseCase$getAllVos$1;
        java.lang.Object objM7377constructorimpl;
        Triple triple;
        C41587qtd c41587qtd;
        if (continuation instanceof SearchSpotVosUseCase$getAllVos$1) {
            searchSpotVosUseCase$getAllVos$1 = (SearchSpotVosUseCase$getAllVos$1) continuation;
            int i = searchSpotVosUseCase$getAllVos$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchSpotVosUseCase$getAllVos$1.label = i - Integer.MIN_VALUE;
            } else {
                searchSpotVosUseCase$getAllVos$1 = new SearchSpotVosUseCase$getAllVos$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = searchSpotVosUseCase$getAllVos$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchSpotVosUseCase$getAllVos$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C41526qsV c41526qsV = new C41526qsV(interfaceC41651quo, rawInstrumentIsolatedStrategy);
            Result.Application application2 = Result.Companion;
            SoftReference<Triple<java.util.List<InterfaceC41641que>, java.util.List<CategoryGroupVo>, java.util.List<ChargeGroupVo>>> softReference = this.OLrzqt.get(rawInstrumentIsolatedStrategy);
            if (softReference == null || (triple = softReference.get()) == null) {
                C41525qsU c41525qsU = this.AEQbTJ;
                searchSpotVosUseCase$getAllVos$1.L$0 = rawInstrumentIsolatedStrategy;
                searchSpotVosUseCase$getAllVos$1.L$1 = this;
                searchSpotVosUseCase$getAllVos$1.Z$0 = z;
                searchSpotVosUseCase$getAllVos$1.label = 1;
                objEZpvd = c41525qsU.EZpvd(c41526qsV, searchSpotVosUseCase$getAllVos$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c41587qtd = this;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(triple);
            if (!z) {
                C56391yDq.AEQbTJ(objM7377constructorimpl);
                triple = (Triple) objM7377constructorimpl;
            } else {
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    objM7377constructorimpl = new Triple(yDY.AhwBna(), yDY.AhwBna(), yDY.AhwBna());
                }
                triple = (Triple) objM7377constructorimpl;
            }
            C41434qqj.KWHzl.KWHzl("SearchSpotVosUseCase", "getAllVos [isolatedStrategy: " + rawInstrumentIsolatedStrategy + ", spot: " + ((java.util.List) triple.getFirst()).size() + "]");
            return triple;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z = searchSpotVosUseCase$getAllVos$1.Z$0;
        c41587qtd = (C41587qtd) searchSpotVosUseCase$getAllVos$1.L$1;
        rawInstrumentIsolatedStrategy = (RawInstrumentIsolatedStrategy) searchSpotVosUseCase$getAllVos$1.L$0;
        C56391yDq.AEQbTJ(objEZpvd);
        c41587qtd.OLrzqt.put(rawInstrumentIsolatedStrategy, new SoftReference<>((Triple) objEZpvd));
        Triple<java.util.List<InterfaceC41641que>, java.util.List<CategoryGroupVo>, java.util.List<ChargeGroupVo>> triple2 = (Triple) objEZpvd;
        objM7377constructorimpl = Result.m7377constructorimpl(triple2);
        if (!z) {
        }
        C41434qqj.KWHzl.KWHzl("SearchSpotVosUseCase", "getAllVos [isolatedStrategy: " + rawInstrumentIsolatedStrategy + ", spot: " + ((java.util.List) triple.getFirst()).size() + "]");
        return triple;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends o.que> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.util.List<InterfaceC41641que> copydefault(java.util.List<? extends InterfaceC41641que> list, Function1<? super InterfaceC41641que, java.lang.Boolean> function1) {
        if (function1 == null) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (function1.invoke((InterfaceC41641que) obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
