package o;

import com.okinc.market.search.features.main.recommend.hot.domain.GetNewSearchUseCase$onExecute$1;
import com.okinc.market.search.features.main.recommend.hot.domain.GetNewSearchUseCase$onExecute$4$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qDp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39945qDp extends AbstractC49400uno<kotlin.Pair<? extends java.lang.String, ? extends C41622quL>, java.util.List<? extends C39994qFk>> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final C40489qXt AEQbTJ;
    public final C39943qDn EZpvd;
    public final C39937qDh KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final InterfaceC54577xNn djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.qDp$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qDp.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @yCM
    public C39945qDp(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn, @NotNull C40489qXt c40489qXt, @NotNull C39937qDh c39937qDh, @NotNull C39943qDn c39943qDn) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40489qXt, "");
        Intrinsics.checkNotNullParameter(c39937qDh, "");
        Intrinsics.checkNotNullParameter(c39943qDn, "");
        this.OLrzqt = coroutineDispatcher;
        this.djBIcL = interfaceC54577xNn;
        this.AEQbTJ = c40489qXt;
        this.KWHzl = c39937qDh;
        this.EZpvd = c39943qDn;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<java.lang.String, C41622quL> pair, @NotNull Continuation<? super java.util.List<C39994qFk>> continuation) throws java.lang.Throwable {
        GetNewSearchUseCase$onExecute$1 getNewSearchUseCase$onExecute$1;
        kotlin.Pair<java.lang.String, C41622quL> pair2;
        Continuation continuation2;
        C39945qDp c39945qDp;
        long j;
        long jCurrentTimeMillis;
        kotlin.Pair<java.lang.String, C41622quL> pair3;
        java.util.List listAhwBna;
        C39945qDp c39945qDp2;
        C39945qDp c39945qDp3;
        java.lang.Throwable th;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object obj;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof GetNewSearchUseCase$onExecute$1) {
            getNewSearchUseCase$onExecute$1 = (GetNewSearchUseCase$onExecute$1) continuation;
            int i = getNewSearchUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getNewSearchUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getNewSearchUseCase$onExecute$1 = new GetNewSearchUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getNewSearchUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getNewSearchUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
            InterfaceC54577xNn interfaceC54577xNn = this.djBIcL;
            if (interfaceC54577xNn != null) {
                getNewSearchUseCase$onExecute$1.L$0 = this;
                pair2 = pair;
                getNewSearchUseCase$onExecute$1.L$1 = pair2;
                getNewSearchUseCase$onExecute$1.J$0 = jCurrentTimeMillis2;
                getNewSearchUseCase$onExecute$1.label = 1;
                continuation2 = null;
                if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, null, getNewSearchUseCase$onExecute$1, 3, null) == objCopydefault) {
                    return objCopydefault;
                }
                c39945qDp = this;
                j = jCurrentTimeMillis2;
            } else {
                return yDY.AhwBna();
            }
        } else if (i2 == 1) {
            j = getNewSearchUseCase$onExecute$1.J$0;
            kotlin.Pair<java.lang.String, C41622quL> pair4 = (kotlin.Pair) getNewSearchUseCase$onExecute$1.L$1;
            c39945qDp = (C39945qDp) getNewSearchUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            ((Result) objEZpvd).m7386unboximpl();
            pair2 = pair4;
            continuation2 = null;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(objEZpvd);
                        return (java.util.List) objEZpvd;
                    }
                    listAhwBna = (java.util.List) getNewSearchUseCase$onExecute$1.L$1;
                    c39945qDp2 = (C39945qDp) getNewSearchUseCase$onExecute$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objEZpvd);
                        continuation2 = null;
                        objM7377constructorimpl = Result.m7377constructorimpl((java.util.Map) objEZpvd);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        continuation2 = null;
                        Result.Application application = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    obj = objM7377constructorimpl;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                    if (thM7380exceptionOrNullimpl != null) {
                        C40375qTn.AEQbTJ.copydefault("GetMainSearchHotUseCase", "getWatchingUseCase failed", thM7380exceptionOrNullimpl);
                    }
                    if (Result.m7383isFailureimpl(obj)) {
                        obj = continuation2;
                    }
                    C39937qDh c39937qDh = c39945qDp2.KWHzl;
                    kotlin.Pair<? extends java.util.List<C39994qFk>, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>> pair5 = new kotlin.Pair<>(listAhwBna, (java.util.Map) obj);
                    getNewSearchUseCase$onExecute$1.L$0 = continuation2;
                    getNewSearchUseCase$onExecute$1.L$1 = continuation2;
                    getNewSearchUseCase$onExecute$1.label = 5;
                    objEZpvd = c39937qDh.EZpvd(pair5, getNewSearchUseCase$onExecute$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    return (java.util.List) objEZpvd;
                }
                c39945qDp3 = (C39945qDp) getNewSearchUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                continuation2 = null;
                c39945qDp2 = c39945qDp3;
                listAhwBna = (java.util.List) objEZpvd;
                if (listAhwBna.isEmpty()) {
                    return yDY.AhwBna();
                }
                try {
                    Result.Application application2 = Result.Companion;
                    C40489qXt c40489qXt = c39945qDp2.AEQbTJ;
                    Unit unit = Unit.INSTANCE;
                    getNewSearchUseCase$onExecute$1.L$0 = c39945qDp2;
                    getNewSearchUseCase$onExecute$1.L$1 = listAhwBna;
                    getNewSearchUseCase$onExecute$1.label = 4;
                    objEZpvd = c40489qXt.EZpvd(unit, getNewSearchUseCase$onExecute$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl((java.util.Map) objEZpvd);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                obj = objM7377constructorimpl;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                if (thM7380exceptionOrNullimpl != null) {
                }
                if (Result.m7383isFailureimpl(obj)) {
                }
                C39937qDh c39937qDh2 = c39945qDp2.KWHzl;
                kotlin.Pair<? extends java.util.List<C39994qFk>, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>> pair52 = new kotlin.Pair<>(listAhwBna, (java.util.Map) obj);
                getNewSearchUseCase$onExecute$1.L$0 = continuation2;
                getNewSearchUseCase$onExecute$1.L$1 = continuation2;
                getNewSearchUseCase$onExecute$1.label = 5;
                objEZpvd = c39937qDh2.EZpvd(pair52, getNewSearchUseCase$onExecute$1);
                if (objEZpvd == objCopydefault) {
                }
                return (java.util.List) objEZpvd;
            }
            jCurrentTimeMillis = getNewSearchUseCase$onExecute$1.J$0;
            pair3 = (kotlin.Pair) getNewSearchUseCase$onExecute$1.L$1;
            c39945qDp = (C39945qDp) getNewSearchUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            continuation2 = null;
            long jCurrentTimeMillis3 = java.lang.System.currentTimeMillis();
            C40375qTn.AEQbTJ.copydefault("GetMainSearchHotUseCase", "tradeBiz ensureInit [cost: " + (jCurrentTimeMillis3 - jCurrentTimeMillis) + "ms]");
            if (Intrinsics.EZpvd((java.lang.Object) pair3.getFirst(), (java.lang.Object) "popular_searches")) {
                listAhwBna = yDY.AhwBna();
                c39945qDp2 = c39945qDp;
                if (listAhwBna.isEmpty()) {
                }
            } else {
                C39943qDn c39943qDn = c39945qDp.EZpvd;
                C41622quL second = pair3.getSecond();
                getNewSearchUseCase$onExecute$1.L$0 = c39945qDp;
                getNewSearchUseCase$onExecute$1.L$1 = continuation2;
                getNewSearchUseCase$onExecute$1.label = 3;
                objEZpvd = c39943qDn.EZpvd(second, getNewSearchUseCase$onExecute$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c39945qDp3 = c39945qDp;
                c39945qDp2 = c39945qDp3;
                listAhwBna = (java.util.List) objEZpvd;
                if (listAhwBna.isEmpty()) {
                }
            }
        }
        long jCurrentTimeMillis4 = java.lang.System.currentTimeMillis();
        C40375qTn.AEQbTJ.copydefault("GetMainSearchHotUseCase", "tradeManager ensureInitialize [cost: " + (jCurrentTimeMillis4 - j) + "ms]");
        jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        GetNewSearchUseCase$onExecute$4$1 getNewSearchUseCase$onExecute$4$1 = new GetNewSearchUseCase$onExecute$4$1(c39945qDp, continuation2);
        getNewSearchUseCase$onExecute$1.L$0 = c39945qDp;
        getNewSearchUseCase$onExecute$1.L$1 = pair2;
        getNewSearchUseCase$onExecute$1.J$0 = jCurrentTimeMillis;
        getNewSearchUseCase$onExecute$1.label = 2;
        if (BuildersKt.withContext(immediate, getNewSearchUseCase$onExecute$4$1, getNewSearchUseCase$onExecute$1) == objCopydefault) {
            return objCopydefault;
        }
        pair3 = pair2;
        long jCurrentTimeMillis32 = java.lang.System.currentTimeMillis();
        C40375qTn.AEQbTJ.copydefault("GetMainSearchHotUseCase", "tradeBiz ensureInit [cost: " + (jCurrentTimeMillis32 - jCurrentTimeMillis) + "ms]");
        if (Intrinsics.EZpvd((java.lang.Object) pair3.getFirst(), (java.lang.Object) "popular_searches")) {
        }
    }
}
