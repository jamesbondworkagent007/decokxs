package o;

import com.okinc.market.search.features.main.recommend.hot.data.po.SearchHotPo;
import com.okinc.market.search.features.main.recommend.hot.domain.GetSearchHotUseCase$onExecute$1;
import com.okinc.market.search.features.main.recommend.hot.domain.GetSearchHotUseCase$onExecute$4$1;
import com.okinc.market.search.features.main.recommend.hot.domain.GetSearchHotUseCase$updatePriceAndIndex$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qDl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39941qDl extends AbstractC49400uno<Unit, java.util.List<? extends C39994qFk>> {
    private static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final C40489qXt AEQbTJ;
    public final C39937qDh KWHzl;
    public final qGQ OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final C39947qDr djBIcL;
    public final InterfaceC54577xNn gEmmrt;
    public final C39936qDg valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((Unit) obj, (Continuation<? super java.util.List<C39994qFk>>) continuation);
    }

    @yCM
    public C39941qDl(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn, @NotNull qGQ qgq, @NotNull C40489qXt c40489qXt, @NotNull C39947qDr c39947qDr, @NotNull C39937qDh c39937qDh, @NotNull C39936qDg c39936qDg) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(qgq, "");
        Intrinsics.checkNotNullParameter(c40489qXt, "");
        Intrinsics.checkNotNullParameter(c39947qDr, "");
        Intrinsics.checkNotNullParameter(c39937qDh, "");
        Intrinsics.checkNotNullParameter(c39936qDg, "");
        this.copydefault = coroutineDispatcher;
        this.gEmmrt = interfaceC54577xNn;
        this.OLrzqt = qgq;
        this.AEQbTJ = c40489qXt;
        this.djBIcL = c39947qDr;
        this.KWHzl = c39937qDh;
        this.valueOf = c39936qDg;
    }

    /* JADX INFO: renamed from: o.qDl$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qDl.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0270 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Unit unit, @NotNull Continuation<? super java.util.List<C39994qFk>> continuation) throws java.lang.Throwable {
        GetSearchHotUseCase$onExecute$1 getSearchHotUseCase$onExecute$1;
        Function0 function0;
        C39941qDl c39941qDl;
        long j;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC54581xNr interfaceC54581xNr;
        AbstractC54531xLw abstractC54531xLw;
        long j2;
        long jCurrentTimeMillis;
        C39941qDl c39941qDl2;
        long jCurrentTimeMillis2;
        java.util.Iterator it;
        java.util.List list;
        C39941qDl c39941qDl3;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof GetSearchHotUseCase$onExecute$1) {
            getSearchHotUseCase$onExecute$1 = (GetSearchHotUseCase$onExecute$1) continuation;
            int i = getSearchHotUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSearchHotUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getSearchHotUseCase$onExecute$1 = new GetSearchHotUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getSearchHotUseCase$onExecute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (getSearchHotUseCase$onExecute$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                Function0 function02 = new Function0() { // from class: o.qDq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C39941qDl.copydefault();
                    }
                };
                long jCurrentTimeMillis3 = java.lang.System.currentTimeMillis();
                InterfaceC54577xNn interfaceC54577xNn2 = this.gEmmrt;
                if (interfaceC54577xNn2 != null) {
                    getSearchHotUseCase$onExecute$1.L$0 = this;
                    getSearchHotUseCase$onExecute$1.L$1 = function02;
                    getSearchHotUseCase$onExecute$1.J$0 = jCurrentTimeMillis3;
                    getSearchHotUseCase$onExecute$1.label = 1;
                    if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn2, false, null, getSearchHotUseCase$onExecute$1, 3, null) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    function0 = function02;
                    c39941qDl = this;
                    j = jCurrentTimeMillis3;
                    long jCurrentTimeMillis4 = java.lang.System.currentTimeMillis();
                    C40375qTn.AEQbTJ.copydefault("GetMainSearchHotUseCase", "tradeManager ensureInitialize [cost: " + (jCurrentTimeMillis4 - j) + "ms]");
                    interfaceC54577xNn = c39941qDl.gEmmrt;
                    if (interfaceC54577xNn != null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
                        return function0.invoke();
                    }
                    AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt("SPOT");
                    if (abstractC54531xLwOLrzqt == null) {
                        return function0.invoke();
                    }
                    long jCurrentTimeMillis5 = java.lang.System.currentTimeMillis();
                    MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                    GetSearchHotUseCase$onExecute$4$1 getSearchHotUseCase$onExecute$4$1 = new GetSearchHotUseCase$onExecute$4$1(abstractC54531xLwOLrzqt, null);
                    getSearchHotUseCase$onExecute$1.L$0 = c39941qDl;
                    getSearchHotUseCase$onExecute$1.L$1 = interfaceC54581xNrOLrzqt;
                    getSearchHotUseCase$onExecute$1.L$2 = abstractC54531xLwOLrzqt;
                    getSearchHotUseCase$onExecute$1.J$0 = jCurrentTimeMillis5;
                    getSearchHotUseCase$onExecute$1.label = 2;
                    if (BuildersKt.withContext(immediate, getSearchHotUseCase$onExecute$4$1, getSearchHotUseCase$onExecute$1) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    interfaceC54581xNr = interfaceC54581xNrOLrzqt;
                    abstractC54531xLw = abstractC54531xLwOLrzqt;
                    j2 = jCurrentTimeMillis5;
                    long jCurrentTimeMillis6 = java.lang.System.currentTimeMillis();
                    C40375qTn.AEQbTJ.copydefault("GetMainSearchHotUseCase", "tradeBiz ensureInit [cost: " + (jCurrentTimeMillis6 - j2) + "ms]");
                    jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    C39936qDg c39936qDg = c39941qDl.valueOf;
                    getSearchHotUseCase$onExecute$1.L$0 = c39941qDl;
                    getSearchHotUseCase$onExecute$1.L$1 = interfaceC54581xNr;
                    getSearchHotUseCase$onExecute$1.L$2 = abstractC54531xLw;
                    getSearchHotUseCase$onExecute$1.J$0 = jCurrentTimeMillis;
                    getSearchHotUseCase$onExecute$1.label = 3;
                    objCopydefault = c39936qDg.copydefault(getSearchHotUseCase$onExecute$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    InterfaceC54581xNr interfaceC54581xNr2 = interfaceC54581xNr;
                    AbstractC54531xLw abstractC54531xLw2 = abstractC54531xLw;
                    c39941qDl2 = c39941qDl;
                    kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.List) objCopydefault, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
                    C40375qTn.AEQbTJ.copydefault("GetMainSearchHotUseCase", "repo getMainSearchHotData [cost: " + pairOLrzqt.getSecond() + "ms]");
                    java.util.List list2 = (java.util.List) pairOLrzqt.component1();
                    jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : list2) {
                        if (interfaceC54581xNr2.fetchVPNInfo(((SearchHotPo) obj).getInstrumentId())) {
                            arrayList.add(obj);
                        }
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        C39994qFk c39994qFkOLrzqt = c39941qDl2.OLrzqt((SearchHotPo) it.next(), abstractC54531xLw2);
                        if (c39994qFkOLrzqt != null) {
                            arrayList2.add(c39994qFkOLrzqt);
                        }
                    }
                    java.util.List<C39994qFk> listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList2, 20);
                    boolean zEZpvd = c39941qDl2.gEmmrt.EZpvd();
                    getSearchHotUseCase$onExecute$1.L$0 = c39941qDl2;
                    getSearchHotUseCase$onExecute$1.L$1 = null;
                    getSearchHotUseCase$onExecute$1.L$2 = null;
                    getSearchHotUseCase$onExecute$1.J$0 = jCurrentTimeMillis2;
                    getSearchHotUseCase$onExecute$1.label = 4;
                    objCopydefault = c39941qDl2.OLrzqt(listAhwBna, zEZpvd, getSearchHotUseCase$onExecute$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt((java.util.List) objCopydefault, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - jCurrentTimeMillis2));
                    C40375qTn.AEQbTJ.copydefault("GetMainSearchHotUseCase", "updatePriceUseCase [cost: " + pairOLrzqt2.getSecond() + "ms]");
                    list = (java.util.List) pairOLrzqt2.component1();
                    try {
                        Result.Application application = Result.Companion;
                        C40489qXt c40489qXt = c39941qDl2.AEQbTJ;
                        Unit unit2 = Unit.INSTANCE;
                        getSearchHotUseCase$onExecute$1.L$0 = c39941qDl2;
                        getSearchHotUseCase$onExecute$1.L$1 = list;
                        getSearchHotUseCase$onExecute$1.label = 5;
                        objCopydefault = c40489qXt.EZpvd(unit2, getSearchHotUseCase$onExecute$1);
                        break;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        c39941qDl3 = c39941qDl2;
                    }
                    if (objCopydefault != objCopydefault2) {
                        return objCopydefault2;
                    }
                    c39941qDl3 = c39941qDl2;
                    objM7377constructorimpl = Result.m7377constructorimpl((java.util.Map) objCopydefault);
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        C40375qTn.AEQbTJ.copydefault("GetMainSearchHotUseCase", "getWatchingUseCase failed", thM7380exceptionOrNullimpl);
                    }
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = null;
                    }
                    C39937qDh c39937qDh = c39941qDl3.KWHzl;
                    kotlin.Pair<? extends java.util.List<C39994qFk>, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>> pair = new kotlin.Pair<>(list, (java.util.Map) objM7377constructorimpl);
                    getSearchHotUseCase$onExecute$1.L$0 = null;
                    getSearchHotUseCase$onExecute$1.L$1 = null;
                    getSearchHotUseCase$onExecute$1.label = 6;
                    objCopydefault = c39937qDh.EZpvd(pair, getSearchHotUseCase$onExecute$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    return (java.util.List) objCopydefault;
                }
                return function02.invoke();
            case 1:
                j = getSearchHotUseCase$onExecute$1.J$0;
                function0 = (Function0) getSearchHotUseCase$onExecute$1.L$1;
                C39941qDl c39941qDl4 = (C39941qDl) getSearchHotUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                ((Result) objCopydefault).m7386unboximpl();
                c39941qDl = c39941qDl4;
                long jCurrentTimeMillis42 = java.lang.System.currentTimeMillis();
                C40375qTn.AEQbTJ.copydefault("GetMainSearchHotUseCase", "tradeManager ensureInitialize [cost: " + (jCurrentTimeMillis42 - j) + "ms]");
                interfaceC54577xNn = c39941qDl.gEmmrt;
                if (interfaceC54577xNn != null) {
                    break;
                }
                return function0.invoke();
            case 2:
                j2 = getSearchHotUseCase$onExecute$1.J$0;
                abstractC54531xLw = (AbstractC54531xLw) getSearchHotUseCase$onExecute$1.L$2;
                interfaceC54581xNr = (InterfaceC54581xNr) getSearchHotUseCase$onExecute$1.L$1;
                c39941qDl = (C39941qDl) getSearchHotUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                long jCurrentTimeMillis62 = java.lang.System.currentTimeMillis();
                C40375qTn.AEQbTJ.copydefault("GetMainSearchHotUseCase", "tradeBiz ensureInit [cost: " + (jCurrentTimeMillis62 - j2) + "ms]");
                jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                C39936qDg c39936qDg2 = c39941qDl.valueOf;
                getSearchHotUseCase$onExecute$1.L$0 = c39941qDl;
                getSearchHotUseCase$onExecute$1.L$1 = interfaceC54581xNr;
                getSearchHotUseCase$onExecute$1.L$2 = abstractC54531xLw;
                getSearchHotUseCase$onExecute$1.J$0 = jCurrentTimeMillis;
                getSearchHotUseCase$onExecute$1.label = 3;
                objCopydefault = c39936qDg2.copydefault(getSearchHotUseCase$onExecute$1);
                if (objCopydefault == objCopydefault2) {
                }
                InterfaceC54581xNr interfaceC54581xNr22 = interfaceC54581xNr;
                AbstractC54531xLw abstractC54531xLw22 = abstractC54531xLw;
                c39941qDl2 = c39941qDl;
                kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt((java.util.List) objCopydefault, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
                C40375qTn.AEQbTJ.copydefault("GetMainSearchHotUseCase", "repo getMainSearchHotData [cost: " + pairOLrzqt3.getSecond() + "ms]");
                java.util.List list22 = (java.util.List) pairOLrzqt3.component1();
                jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                while (r0.hasNext()) {
                }
                java.util.ArrayList arrayList22 = new java.util.ArrayList();
                it = arrayList3.iterator();
                while (it.hasNext()) {
                }
                java.util.List<C39994qFk> listAhwBna2 = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList22, 20);
                boolean zEZpvd2 = c39941qDl2.gEmmrt.EZpvd();
                getSearchHotUseCase$onExecute$1.L$0 = c39941qDl2;
                getSearchHotUseCase$onExecute$1.L$1 = null;
                getSearchHotUseCase$onExecute$1.L$2 = null;
                getSearchHotUseCase$onExecute$1.J$0 = jCurrentTimeMillis2;
                getSearchHotUseCase$onExecute$1.label = 4;
                objCopydefault = c39941qDl2.OLrzqt(listAhwBna2, zEZpvd2, getSearchHotUseCase$onExecute$1);
                if (objCopydefault == objCopydefault2) {
                }
                kotlin.Pair pairOLrzqt22 = C56390yDp.OLrzqt((java.util.List) objCopydefault, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - jCurrentTimeMillis2));
                C40375qTn.AEQbTJ.copydefault("GetMainSearchHotUseCase", "updatePriceUseCase [cost: " + pairOLrzqt22.getSecond() + "ms]");
                list = (java.util.List) pairOLrzqt22.component1();
                Result.Application application3 = Result.Companion;
                C40489qXt c40489qXt2 = c39941qDl2.AEQbTJ;
                Unit unit22 = Unit.INSTANCE;
                getSearchHotUseCase$onExecute$1.L$0 = c39941qDl2;
                getSearchHotUseCase$onExecute$1.L$1 = list;
                getSearchHotUseCase$onExecute$1.label = 5;
                objCopydefault = c40489qXt2.EZpvd(unit22, getSearchHotUseCase$onExecute$1);
                if (objCopydefault != objCopydefault2) {
                }
                break;
            case 3:
                jCurrentTimeMillis = getSearchHotUseCase$onExecute$1.J$0;
                abstractC54531xLw = (AbstractC54531xLw) getSearchHotUseCase$onExecute$1.L$2;
                interfaceC54581xNr = (InterfaceC54581xNr) getSearchHotUseCase$onExecute$1.L$1;
                c39941qDl = (C39941qDl) getSearchHotUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC54581xNr interfaceC54581xNr222 = interfaceC54581xNr;
                AbstractC54531xLw abstractC54531xLw222 = abstractC54531xLw;
                c39941qDl2 = c39941qDl;
                kotlin.Pair pairOLrzqt32 = C56390yDp.OLrzqt((java.util.List) objCopydefault, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
                C40375qTn.AEQbTJ.copydefault("GetMainSearchHotUseCase", "repo getMainSearchHotData [cost: " + pairOLrzqt32.getSecond() + "ms]");
                java.util.List list222 = (java.util.List) pairOLrzqt32.component1();
                jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                java.util.ArrayList arrayList32 = new java.util.ArrayList();
                while (r0.hasNext()) {
                }
                java.util.ArrayList arrayList222 = new java.util.ArrayList();
                it = arrayList32.iterator();
                while (it.hasNext()) {
                }
                java.util.List<C39994qFk> listAhwBna22 = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList222, 20);
                boolean zEZpvd22 = c39941qDl2.gEmmrt.EZpvd();
                getSearchHotUseCase$onExecute$1.L$0 = c39941qDl2;
                getSearchHotUseCase$onExecute$1.L$1 = null;
                getSearchHotUseCase$onExecute$1.L$2 = null;
                getSearchHotUseCase$onExecute$1.J$0 = jCurrentTimeMillis2;
                getSearchHotUseCase$onExecute$1.label = 4;
                objCopydefault = c39941qDl2.OLrzqt(listAhwBna22, zEZpvd22, getSearchHotUseCase$onExecute$1);
                if (objCopydefault == objCopydefault2) {
                }
                kotlin.Pair pairOLrzqt222 = C56390yDp.OLrzqt((java.util.List) objCopydefault, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - jCurrentTimeMillis2));
                C40375qTn.AEQbTJ.copydefault("GetMainSearchHotUseCase", "updatePriceUseCase [cost: " + pairOLrzqt222.getSecond() + "ms]");
                list = (java.util.List) pairOLrzqt222.component1();
                Result.Application application32 = Result.Companion;
                C40489qXt c40489qXt22 = c39941qDl2.AEQbTJ;
                Unit unit222 = Unit.INSTANCE;
                getSearchHotUseCase$onExecute$1.L$0 = c39941qDl2;
                getSearchHotUseCase$onExecute$1.L$1 = list;
                getSearchHotUseCase$onExecute$1.label = 5;
                objCopydefault = c40489qXt22.EZpvd(unit222, getSearchHotUseCase$onExecute$1);
                if (objCopydefault != objCopydefault2) {
                }
                break;
            case 4:
                jCurrentTimeMillis2 = getSearchHotUseCase$onExecute$1.J$0;
                c39941qDl2 = (C39941qDl) getSearchHotUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                kotlin.Pair pairOLrzqt2222 = C56390yDp.OLrzqt((java.util.List) objCopydefault, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - jCurrentTimeMillis2));
                C40375qTn.AEQbTJ.copydefault("GetMainSearchHotUseCase", "updatePriceUseCase [cost: " + pairOLrzqt2222.getSecond() + "ms]");
                list = (java.util.List) pairOLrzqt2222.component1();
                Result.Application application322 = Result.Companion;
                C40489qXt c40489qXt222 = c39941qDl2.AEQbTJ;
                Unit unit2222 = Unit.INSTANCE;
                getSearchHotUseCase$onExecute$1.L$0 = c39941qDl2;
                getSearchHotUseCase$onExecute$1.L$1 = list;
                getSearchHotUseCase$onExecute$1.label = 5;
                objCopydefault = c40489qXt222.EZpvd(unit2222, getSearchHotUseCase$onExecute$1);
                if (objCopydefault != objCopydefault2) {
                }
                break;
            case 5:
                list = (java.util.List) getSearchHotUseCase$onExecute$1.L$1;
                c39941qDl3 = (C39941qDl) getSearchHotUseCase$onExecute$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objCopydefault);
                    objM7377constructorimpl = Result.m7377constructorimpl((java.util.Map) objCopydefault);
                    break;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    c39941qDl2 = c39941qDl3;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    c39941qDl3 = c39941qDl2;
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                C39937qDh c39937qDh2 = c39941qDl3.KWHzl;
                kotlin.Pair<? extends java.util.List<C39994qFk>, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>> pair2 = new kotlin.Pair<>(list, (java.util.Map) objM7377constructorimpl);
                getSearchHotUseCase$onExecute$1.L$0 = null;
                getSearchHotUseCase$onExecute$1.L$1 = null;
                getSearchHotUseCase$onExecute$1.label = 6;
                objCopydefault = c39937qDh2.EZpvd(pair2, getSearchHotUseCase$onExecute$1);
                if (objCopydefault == objCopydefault2) {
                }
                return (java.util.List) objCopydefault;
            case 6:
                C56391yDq.AEQbTJ(objCopydefault);
                return (java.util.List) objCopydefault;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final java.util.List copydefault() {
        return yDY.AhwBna();
    }

    public final C39994qFk OLrzqt(SearchHotPo searchHotPo, AbstractC54531xLw abstractC54531xLw) {
        BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(searchHotPo.getInstrumentId());
        if (bizInstrumentValueOf == null) {
            return null;
        }
        C39994qFk c39994qFk = (C39994qFk) this.OLrzqt.copydefault((java.lang.Object) bizInstrumentValueOf);
        c39994qFk.EZpvd(searchHotPo);
        return c39994qFk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0080 -> B:24:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.util.List<C39994qFk> list, boolean z, Continuation<? super java.util.List<C39994qFk>> continuation) throws java.lang.Throwable {
        GetSearchHotUseCase$updatePriceAndIndex$1 getSearchHotUseCase$updatePriceAndIndex$1;
        C39941qDl c39941qDl;
        ?? r2;
        java.util.Iterator it;
        int i;
        if (continuation instanceof GetSearchHotUseCase$updatePriceAndIndex$1) {
            getSearchHotUseCase$updatePriceAndIndex$1 = (GetSearchHotUseCase$updatePriceAndIndex$1) continuation;
            int i2 = getSearchHotUseCase$updatePriceAndIndex$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getSearchHotUseCase$updatePriceAndIndex$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getSearchHotUseCase$updatePriceAndIndex$1 = new GetSearchHotUseCase$updatePriceAndIndex$1(this, continuation);
            }
        }
        java.lang.Object obj = getSearchHotUseCase$updatePriceAndIndex$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getSearchHotUseCase$updatePriceAndIndex$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            c39941qDl = this;
            r2 = !z;
            it = list.iterator();
            i = 0;
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = getSearchHotUseCase$updatePriceAndIndex$1.I$2;
            i = getSearchHotUseCase$updatePriceAndIndex$1.I$1;
            int i5 = getSearchHotUseCase$updatePriceAndIndex$1.I$0;
            C39994qFk c39994qFk = (C39994qFk) getSearchHotUseCase$updatePriceAndIndex$1.L$3;
            it = (java.util.Iterator) getSearchHotUseCase$updatePriceAndIndex$1.L$2;
            java.util.List<C39994qFk> list2 = (java.util.List) getSearchHotUseCase$updatePriceAndIndex$1.L$1;
            c39941qDl = (C39941qDl) getSearchHotUseCase$updatePriceAndIndex$1.L$0;
            C56391yDq.AEQbTJ(obj);
            ?? r22 = i5;
            c39994qFk.OLrzqt(i4 + 1);
            c39994qFk.copydefault(true);
            c39994qFk.OLrzqt(i4 >= 3);
            c39994qFk.gEmmrt(r22 == 0);
            list = list2;
            r2 = r22;
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                int i6 = i + 1;
                if (i < 0) {
                    yDY.AYXKKw();
                }
                C39994qFk c39994qFk2 = (C39994qFk) next;
                C39947qDr c39947qDr = c39941qDl.djBIcL;
                getSearchHotUseCase$updatePriceAndIndex$1.L$0 = c39941qDl;
                getSearchHotUseCase$updatePriceAndIndex$1.L$1 = list;
                getSearchHotUseCase$updatePriceAndIndex$1.L$2 = it;
                getSearchHotUseCase$updatePriceAndIndex$1.L$3 = c39994qFk2;
                getSearchHotUseCase$updatePriceAndIndex$1.I$0 = r2;
                getSearchHotUseCase$updatePriceAndIndex$1.I$1 = i6;
                getSearchHotUseCase$updatePriceAndIndex$1.I$2 = i;
                getSearchHotUseCase$updatePriceAndIndex$1.label = 1;
                if (c39947qDr.copydefault(c39994qFk2, getSearchHotUseCase$updatePriceAndIndex$1) == objCopydefault) {
                    return objCopydefault;
                }
                list2 = list;
                i4 = i;
                i = i6;
                c39994qFk = c39994qFk2;
                r22 = r2;
                c39994qFk.OLrzqt(i4 + 1);
                c39994qFk.copydefault(true);
                c39994qFk.OLrzqt(i4 >= 3);
                c39994qFk.gEmmrt(r22 == 0);
                list = list2;
                r2 = r22;
                if (it.hasNext()) {
                    return list;
                }
            }
        }
    }
}
