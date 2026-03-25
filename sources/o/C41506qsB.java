package o;

import com.okinc.market.quotation.domain.options.SearchOptionsVosUseCase$doSearch$1;
import com.okinc.market.quotation.domain.options.SearchOptionsVosUseCase$getAllOptionsVos$1;
import com.okinc.market.quotation.domain.options.SearchOptionsVosUseCase$invoke$1;
import com.okinc.market.quotation.domain.options.SearchOptionsVosUseCase$onExecute$1;
import com.okinc.market.quotation.domain.options.SearchOptionsVosUseCase$onExecute$searchedOptionsVos$1$tasks$1$1;
import com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;
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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41506qsB extends AbstractC49400uno<kotlin.Pair<? extends java.lang.String, ? extends InterfaceC41647quk>, Triple<? extends java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, ? extends java.lang.Integer>> {
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public SoftReference<java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>>> AEQbTJ;
    public final C41551qsu EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final C41575qtR<InterfaceC41642quf> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd2((kotlin.Pair<java.lang.String, ? extends InterfaceC41647quk>) obj, (Continuation<? super Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer>>) continuation);
    }

    @yCM
    public C41506qsB(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41551qsu c41551qsu, @NotNull C41575qtR<InterfaceC41642quf> c41575qtR) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41551qsu, "");
        Intrinsics.checkNotNullParameter(c41575qtR, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = c41551qsu;
        this.gEmmrt = c41575qtR;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qsA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41506qsB.copydefault();
            }
        });
    }

    /* JADX INFO: renamed from: o.qsB$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final Mutex OLrzqt() {
        return (Mutex) this.KWHzl.getValue();
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
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Pair<java.lang.String, ? extends o.quk>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // o.AbstractC49400uno
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull kotlin.Pair<java.lang.String, ? extends InterfaceC41647quk> pair, @NotNull Continuation<? super Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer>> continuation) throws java.lang.Throwable {
        SearchOptionsVosUseCase$invoke$1 searchOptionsVosUseCase$invoke$1;
        C41506qsB c41506qsB;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof SearchOptionsVosUseCase$invoke$1) {
            searchOptionsVosUseCase$invoke$1 = (SearchOptionsVosUseCase$invoke$1) continuation;
            int i = searchOptionsVosUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchOptionsVosUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                searchOptionsVosUseCase$invoke$1 = new SearchOptionsVosUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = searchOptionsVosUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchOptionsVosUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutexOLrzqt = OLrzqt();
                searchOptionsVosUseCase$invoke$1.L$0 = this;
                searchOptionsVosUseCase$invoke$1.L$1 = pair;
                searchOptionsVosUseCase$invoke$1.L$2 = mutexOLrzqt;
                searchOptionsVosUseCase$invoke$1.label = 1;
                if (mutexOLrzqt.lock(null, searchOptionsVosUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c41506qsB = this;
                r2 = pair;
                mutex = mutexOLrzqt;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex2 = (Mutex) searchOptionsVosUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    pair = mutex2;
                    return (Triple) objEZpvd;
                }
                Mutex mutex3 = (Mutex) searchOptionsVosUseCase$invoke$1.L$2;
                kotlin.Pair pair2 = (kotlin.Pair) searchOptionsVosUseCase$invoke$1.L$1;
                c41506qsB = (C41506qsB) searchOptionsVosUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = pair2;
                mutex = mutex3;
            }
            searchOptionsVosUseCase$invoke$1.L$0 = mutex;
            searchOptionsVosUseCase$invoke$1.L$1 = null;
            searchOptionsVosUseCase$invoke$1.L$2 = null;
            searchOptionsVosUseCase$invoke$1.label = 2;
            objEZpvd = super.EZpvd(r2, searchOptionsVosUseCase$invoke$1);
            pair = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (Triple) objEZpvd;
        } finally {
            pair.unlock(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [45=4] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x016c -> B:52:0x016d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd2(@NotNull kotlin.Pair<java.lang.String, ? extends InterfaceC41647quk> pair, @NotNull Continuation<? super Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer>> continuation) throws java.lang.Throwable {
        SearchOptionsVosUseCase$onExecute$1 searchOptionsVosUseCase$onExecute$1;
        java.lang.String str;
        java.lang.String str2;
        C41506qsB c41506qsB;
        java.lang.String str3;
        java.lang.String string;
        java.lang.String str4;
        C41506qsB c41506qsB2;
        java.util.Map linkedHashMap;
        java.util.Iterator it;
        java.lang.Object key;
        java.util.Map map;
        if (continuation instanceof SearchOptionsVosUseCase$onExecute$1) {
            searchOptionsVosUseCase$onExecute$1 = (SearchOptionsVosUseCase$onExecute$1) continuation;
            int i = searchOptionsVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchOptionsVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                searchOptionsVosUseCase$onExecute$1 = new SearchOptionsVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = searchOptionsVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchOptionsVosUseCase$onExecute$1.label;
        Continuation continuation2 = null;
        int size = 0;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.lang.String strComponent1 = pair.component1();
            InterfaceC41647quk interfaceC41647qukComponent2 = pair.component2();
            if (strComponent1 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strComponent1)) {
                str = AbstractJsonLexerKt.NULL;
            } else {
                str = C59454zhO.AkhnZx(strComponent1, 10) + (strComponent1.length() > 10 ? "..." : "");
            }
            C41434qqj.KWHzl.KWHzl("SearchOptionsVosUseCase", "search options vos, keyword=" + str);
            if (!C41388qpq.KWHzl((strComponent1 == null || (string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strComponent1).toString()) == null) ? null : C56443yFo.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) string)))) {
                searchOptionsVosUseCase$onExecute$1.L$0 = strComponent1;
                searchOptionsVosUseCase$onExecute$1.label = 3;
                java.lang.Object objEZpvd2 = EZpvd(true, interfaceC41647qukComponent2, searchOptionsVosUseCase$onExecute$1);
                if (objEZpvd2 == objCopydefault) {
                    return objCopydefault;
                }
                str2 = strComponent1;
                objEZpvd = objEZpvd2;
                return new Triple(str2, (java.util.Map) objEZpvd, C56443yFo.AEQbTJ(0));
            }
            searchOptionsVosUseCase$onExecute$1.L$0 = this;
            searchOptionsVosUseCase$onExecute$1.L$1 = strComponent1;
            searchOptionsVosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd3 = EZpvd(false, interfaceC41647qukComponent2, searchOptionsVosUseCase$onExecute$1);
            if (objEZpvd3 == objCopydefault) {
                return objCopydefault;
            }
            c41506qsB = this;
            str3 = strComponent1;
            objEZpvd = objEZpvd3;
            java.util.Map map2 = (java.util.Map) objEZpvd;
            str4 = str3;
            c41506qsB2 = c41506qsB;
            linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map2.size()));
            it = map2.entrySet().iterator();
        } else if (i2 == 1) {
            str3 = (java.lang.String) searchOptionsVosUseCase$onExecute$1.L$1;
            c41506qsB = (C41506qsB) searchOptionsVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            java.util.Map map22 = (java.util.Map) objEZpvd;
            str4 = str3;
            c41506qsB2 = c41506qsB;
            linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map22.size()));
            it = map22.entrySet().iterator();
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (java.lang.String) searchOptionsVosUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                return new Triple(str2, (java.util.Map) objEZpvd, C56443yFo.AEQbTJ(0));
            }
            key = searchOptionsVosUseCase$onExecute$1.L$5;
            java.util.Map map3 = (java.util.Map) searchOptionsVosUseCase$onExecute$1.L$4;
            it = (java.util.Iterator) searchOptionsVosUseCase$onExecute$1.L$3;
            java.util.Map map4 = (java.util.Map) searchOptionsVosUseCase$onExecute$1.L$2;
            str4 = (java.lang.String) searchOptionsVosUseCase$onExecute$1.L$1;
            c41506qsB2 = (C41506qsB) searchOptionsVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            map = map3;
            linkedHashMap = map4;
            java.util.Map mapCopydefault = C56424yEw.copydefault((java.util.List) objEZpvd);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : mapCopydefault.entrySet()) {
                if (C33129mqd.KWHzl((java.util.Collection) entry.getValue())) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            map.put(key, linkedHashMap2);
            continuation2 = null;
        }
        if (!it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            key = entry2.getKey();
            java.util.Map map5 = (java.util.Map) entry2.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList(map5.size());
            java.util.Iterator it2 = map5.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add(new SearchOptionsVosUseCase$onExecute$searchedOptionsVos$1$tasks$1$1((Map.Entry) it2.next(), c41506qsB2, str4, continuation2));
            }
            Function1[] function1Arr = (Function1[]) arrayList.toArray(new Function1[0]);
            Function1[] function1Arr2 = (Function1[]) java.util.Arrays.copyOf(function1Arr, function1Arr.length);
            searchOptionsVosUseCase$onExecute$1.L$0 = c41506qsB2;
            searchOptionsVosUseCase$onExecute$1.L$1 = str4;
            searchOptionsVosUseCase$onExecute$1.L$2 = linkedHashMap;
            searchOptionsVosUseCase$onExecute$1.L$3 = it;
            searchOptionsVosUseCase$onExecute$1.L$4 = linkedHashMap;
            searchOptionsVosUseCase$onExecute$1.L$5 = key;
            searchOptionsVosUseCase$onExecute$1.label = 2;
            objEZpvd = C41347qpB.EZpvd(function1Arr2, searchOptionsVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            map = linkedHashMap;
            java.util.Map mapCopydefault2 = C56424yEw.copydefault((java.util.List) objEZpvd);
            LinkedHashMap linkedHashMap22 = new LinkedHashMap();
            while (r1.hasNext()) {
            }
            map.put(key, linkedHashMap22);
            continuation2 = null;
            if (!it.hasNext()) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                    if (!((java.util.Map) entry3.getValue()).isEmpty()) {
                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                    }
                }
                java.util.Iterator it3 = linkedHashMap3.entrySet().iterator();
                while (it3.hasNext()) {
                    java.util.Iterator it4 = ((java.util.Map) ((Map.Entry) it3.next()).getValue()).entrySet().iterator();
                    while (it4.hasNext()) {
                        size += ((java.util.List) ((Map.Entry) it4.next()).getValue()).size();
                    }
                }
                C41434qqj.KWHzl.KWHzl("SearchOptionsVosUseCase", "search options vos result: " + size + " options found");
                return new Triple(str4, linkedHashMap3, C56443yFo.AEQbTJ(size));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.util.List<? extends InterfaceC41642quf> list, java.lang.String str, Continuation<? super java.util.List<? extends InterfaceC41642quf>> continuation) throws java.lang.Throwable {
        SearchOptionsVosUseCase$doSearch$1 searchOptionsVosUseCase$doSearch$1;
        if (continuation instanceof SearchOptionsVosUseCase$doSearch$1) {
            searchOptionsVosUseCase$doSearch$1 = (SearchOptionsVosUseCase$doSearch$1) continuation;
            int i = searchOptionsVosUseCase$doSearch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchOptionsVosUseCase$doSearch$1.label = i - Integer.MIN_VALUE;
            } else {
                searchOptionsVosUseCase$doSearch$1 = new SearchOptionsVosUseCase$doSearch$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = searchOptionsVosUseCase$doSearch$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchOptionsVosUseCase$doSearch$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            kotlin.Pair pair = new kotlin.Pair(list, str);
            C41575qtR<InterfaceC41642quf> c41575qtR = this.gEmmrt;
            searchOptionsVosUseCase$doSearch$1.label = 1;
            objEZpvd = c41575qtR.EZpvd(pair, (Continuation) searchOptionsVosUseCase$doSearch$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return (java.util.List) objEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(boolean z, InterfaceC41647quk interfaceC41647quk, Continuation<? super java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>> continuation) throws java.lang.Throwable {
        SearchOptionsVosUseCase$getAllOptionsVos$1 searchOptionsVosUseCase$getAllOptionsVos$1;
        java.lang.Object objM7377constructorimpl;
        C41506qsB c41506qsB;
        if (continuation instanceof SearchOptionsVosUseCase$getAllOptionsVos$1) {
            searchOptionsVosUseCase$getAllOptionsVos$1 = (SearchOptionsVosUseCase$getAllOptionsVos$1) continuation;
            int i = searchOptionsVosUseCase$getAllOptionsVos$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchOptionsVosUseCase$getAllOptionsVos$1.label = i - Integer.MIN_VALUE;
            } else {
                searchOptionsVosUseCase$getAllOptionsVos$1 = new SearchOptionsVosUseCase$getAllOptionsVos$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = searchOptionsVosUseCase$getAllOptionsVos$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchOptionsVosUseCase$getAllOptionsVos$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            Result.Application application2 = Result.Companion;
            SoftReference<java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>>> softReference = this.AEQbTJ;
            if (softReference == null || (map = softReference.get()) == null) {
                C41551qsu c41551qsu = this.EZpvd;
                searchOptionsVosUseCase$getAllOptionsVos$1.L$0 = this;
                searchOptionsVosUseCase$getAllOptionsVos$1.Z$0 = z;
                searchOptionsVosUseCase$getAllOptionsVos$1.label = 1;
                objEZpvd = c41551qsu.EZpvd(interfaceC41647quk, searchOptionsVosUseCase$getAllOptionsVos$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c41506qsB = this;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(map);
            if (!z) {
                C56391yDq.AEQbTJ(objM7377constructorimpl);
                return (java.util.Map) objM7377constructorimpl;
            }
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                objM7377constructorimpl = C56424yEw.KWHzl();
            }
            return (java.util.Map) objM7377constructorimpl;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z = searchOptionsVosUseCase$getAllOptionsVos$1.Z$0;
        c41506qsB = (C41506qsB) searchOptionsVosUseCase$getAllOptionsVos$1.L$0;
        C56391yDq.AEQbTJ(objEZpvd);
        c41506qsB.AEQbTJ = new SoftReference<>((java.util.Map) objEZpvd);
        java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>> map = (java.util.Map) objEZpvd;
        objM7377constructorimpl = Result.m7377constructorimpl(map);
        if (!z) {
        }
    }
}
