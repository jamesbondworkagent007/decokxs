package o;

import com.okinc.find_ui.ranking.stock.model.GetStockVosUseCase$getStockVosFromRemote$1;
import com.okinc.find_ui.ranking.stock.model.GetStockVosUseCase$invoke$1;
import com.okinc.find_ui.ranking.stock.model.GetStockVosUseCase$onExecute$1;
import com.okinc.market.quotation.data.model.stock.StockListPo;
import com.okinc.market.quotation.data.model.stock.StockTokenPo;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.noK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35064noK implements InterfaceC49404uns<C35067noN, java.util.List<? extends C35069noP>> {
    public final C41662quz EZpvd;
    public final C35072noS KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    private static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C35064noK(@NotNull C41662quz c41662quz) {
        Intrinsics.checkNotNullParameter(c41662quz, "");
        this.EZpvd = c41662quz;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.noQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35064noK.gEmmrt();
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.noO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35064noK.KWHzl();
            }
        });
        this.KWHzl = new C35072noS(500L);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((C35067noN) obj, (Continuation<? super java.util.List<C35069noP>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX INFO: renamed from: o.noK$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.noK.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final Mutex AYXKKw() {
        return (Mutex) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mutex gEmmrt() {
        return MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0023 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, o.noN] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull C35067noN c35067noN, @NotNull Continuation<? super java.util.List<C35069noP>> continuation) {
        GetStockVosUseCase$invoke$1 getStockVosUseCase$invoke$1;
        C35064noK c35064noK;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof GetStockVosUseCase$invoke$1) {
            getStockVosUseCase$invoke$1 = (GetStockVosUseCase$invoke$1) continuation;
            int i = getStockVosUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getStockVosUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getStockVosUseCase$invoke$1 = new GetStockVosUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getStockVosUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getStockVosUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutexAYXKKw = AYXKKw();
                getStockVosUseCase$invoke$1.L$0 = this;
                getStockVosUseCase$invoke$1.L$1 = c35067noN;
                getStockVosUseCase$invoke$1.L$2 = mutexAYXKKw;
                getStockVosUseCase$invoke$1.label = 1;
                if (mutexAYXKKw.lock(null, getStockVosUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c35064noK = this;
                r2 = c35067noN;
                mutex = mutexAYXKKw;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex2 = (Mutex) getStockVosUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c35067noN = mutex2;
                    return (java.util.List) objEZpvd;
                }
                Mutex mutex3 = (Mutex) getStockVosUseCase$invoke$1.L$2;
                C35067noN c35067noN2 = (C35067noN) getStockVosUseCase$invoke$1.L$1;
                c35064noK = (C35064noK) getStockVosUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = c35067noN2;
                mutex = mutex3;
            }
            getStockVosUseCase$invoke$1.L$0 = mutex;
            getStockVosUseCase$invoke$1.L$1 = null;
            getStockVosUseCase$invoke$1.L$2 = null;
            getStockVosUseCase$invoke$1.label = 2;
            objEZpvd = InterfaceC49404uns.Activity.EZpvd(c35064noK, r2, getStockVosUseCase$invoke$1);
            c35067noN = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (java.util.List) objEZpvd;
        } finally {
            c35067noN.unlock(null);
        }
    }

    public final ConcurrentHashMap<java.lang.String, SoftReference<java.util.List<C35069noP>>> AEQbTJ() {
        return (ConcurrentHashMap) this.copydefault.getValue();
    }

    public static final ConcurrentHashMap KWHzl() {
        return new ConcurrentHashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:11|62|12)(2:16|17))(4:18|66|19|(11:21|(1:23)(1:24)|25|64|32|40|(1:44)|45|(4:48|(1:50)|51|(2:60|61)(1:55))|56|(2:58|59)(1:67))(2:26|(1:28)(1:29)))|30|31|64|32|40|(2:42|44)|45|(0)|56|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C35067noN c35067noN, @NotNull Continuation<? super java.util.List<C35069noP>> continuation) throws java.lang.Throwable {
        GetStockVosUseCase$onExecute$1 getStockVosUseCase$onExecute$1;
        java.lang.String strEZpvd;
        C35064noK c35064noK;
        java.lang.String str;
        java.util.List<C35069noP> list;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        java.util.List list2;
        if (continuation instanceof GetStockVosUseCase$onExecute$1) {
            getStockVosUseCase$onExecute$1 = (GetStockVosUseCase$onExecute$1) continuation;
            int i = getStockVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getStockVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getStockVosUseCase$onExecute$1 = new GetStockVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getStockVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getStockVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            strEZpvd = c35067noN.EZpvd();
            InterfaceC35073noT interfaceC35073noTCopydefault = c35067noN.copydefault();
            java.lang.Integer numAEQbTJ = c35067noN.AEQbTJ();
            boolean zKWHzl = c35067noN.KWHzl();
            pUU.KWHzl("GetStockVosUseCase", "get stock vos, [input: " + c35067noN + "]");
            try {
                Result.Application application = Result.Companion;
            } catch (java.lang.Throwable th) {
                th = th;
                c35064noK = this;
                java.lang.String str2 = strEZpvd;
                th = th;
                str = str2;
                Result.Application application2 = Result.Companion;
                java.lang.Object objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                strEZpvd = str;
                objM7377constructorimpl = objM7377constructorimpl2;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                java.util.List list3 = (java.util.List) objM7377constructorimpl;
                if (list3 == null) {
                }
            }
            if (zKWHzl) {
                SoftReference<java.util.List<C35069noP>> softReference = AEQbTJ().get(strEZpvd);
                list = softReference != null ? softReference.get() : null;
                pUU.KWHzl("GetStockVosUseCase", "getStockVosUseCase: get from VO cache [key: " + strEZpvd + "]");
                c35064noK = this;
                objM7377constructorimpl = Result.m7377constructorimpl(list);
                if (Result.m7384isSuccessimpl(objM7377constructorimpl) && (list2 = (java.util.List) objM7377constructorimpl) != null) {
                    c35064noK.AEQbTJ().put(strEZpvd, new SoftReference<>(list2));
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    SoftReference<java.util.List<C35069noP>> softReference2 = c35064noK.AEQbTJ().get(strEZpvd);
                    java.util.List<C35069noP> list4 = softReference2 != null ? softReference2.get() : null;
                    if (list4 == null || list4.isEmpty()) {
                        pUU.KWHzl("GetStockVosUseCase", "getStockVosUseCase: no cache, throw network error [key: " + strEZpvd + ", error: " + thM7380exceptionOrNullimpl + "]");
                        throw thM7380exceptionOrNullimpl;
                    }
                    pUU.KWHzl("GetStockVosUseCase", "getStockVosUseCase: use cache as fallback [key: " + strEZpvd + ", error: " + thM7380exceptionOrNullimpl + "]");
                    objM7377constructorimpl = list4;
                }
                java.util.List list32 = (java.util.List) objM7377constructorimpl;
                return list32 == null ? yDY.AhwBna() : list32;
            }
            getStockVosUseCase$onExecute$1.L$0 = this;
            getStockVosUseCase$onExecute$1.L$1 = strEZpvd;
            getStockVosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = EZpvd(strEZpvd, interfaceC35073noTCopydefault, numAEQbTJ, getStockVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c35064noK = this;
            obj = objEZpvd;
            str = strEZpvd;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) getStockVosUseCase$onExecute$1.L$1;
            c35064noK = (C35064noK) getStockVosUseCase$onExecute$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                java.lang.Object objM7377constructorimpl22 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                strEZpvd = str;
                objM7377constructorimpl = objM7377constructorimpl22;
            }
        }
        java.util.List<C35069noP> list5 = (java.util.List) obj;
        strEZpvd = str;
        list = list5;
        objM7377constructorimpl = Result.m7377constructorimpl(list);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            c35064noK.AEQbTJ().put(strEZpvd, new SoftReference<>(list2));
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        java.util.List list322 = (java.util.List) objM7377constructorimpl;
        if (list322 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.String str, InterfaceC35073noT interfaceC35073noT, java.lang.Integer num, Continuation<? super java.util.List<C35069noP>> continuation) throws java.lang.Throwable {
        GetStockVosUseCase$getStockVosFromRemote$1 getStockVosUseCase$getStockVosFromRemote$1;
        StockListPo stockListPoOLrzqt;
        C35064noK c35064noK;
        java.util.List<StockTokenPo> futures;
        if (continuation instanceof GetStockVosUseCase$getStockVosFromRemote$1) {
            getStockVosUseCase$getStockVosFromRemote$1 = (GetStockVosUseCase$getStockVosFromRemote$1) continuation;
            int i = getStockVosUseCase$getStockVosFromRemote$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getStockVosUseCase$getStockVosFromRemote$1.label = i - Integer.MIN_VALUE;
            } else {
                getStockVosUseCase$getStockVosFromRemote$1 = new GetStockVosUseCase$getStockVosFromRemote$1(this, continuation);
            }
        }
        java.lang.Object objAhwBna = getStockVosUseCase$getStockVosFromRemote$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getStockVosUseCase$getStockVosFromRemote$1.label;
        java.util.ArrayList arrayList = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAhwBna);
            stockListPoOLrzqt = this.KWHzl.OLrzqt();
            if (stockListPoOLrzqt != null) {
                pUU.KWHzl("GetStockVosUseCase", "Using request-level cached StockListPo [cacheAge: " + this.KWHzl.AEQbTJ() + "ms, bizType: " + str + "]");
                if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT")) {
                    futures = stockListPoOLrzqt != null ? stockListPoOLrzqt.getSpot() : null;
                } else if (stockListPoOLrzqt != null) {
                    futures = stockListPoOLrzqt.getFutures();
                }
                if (futures != null) {
                    arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(futures, 10));
                    java.util.Iterator<T> it = futures.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C35071noR.OLrzqt((StockTokenPo) it.next(), interfaceC35073noT));
                    }
                }
                return arrayList;
            }
            java.util.Map<java.lang.String, java.lang.String> mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(num)));
            C41662quz c41662quz = this.EZpvd;
            getStockVosUseCase$getStockVosFromRemote$1.L$0 = this;
            getStockVosUseCase$getStockVosFromRemote$1.L$1 = str;
            getStockVosUseCase$getStockVosFromRemote$1.L$2 = interfaceC35073noT;
            getStockVosUseCase$getStockVosFromRemote$1.label = 1;
            objAhwBna = c41662quz.AhwBna(mapEZpvd, getStockVosUseCase$getStockVosFromRemote$1);
            if (objAhwBna == objCopydefault) {
                return objCopydefault;
            }
            c35064noK = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC35073noT = (InterfaceC35073noT) getStockVosUseCase$getStockVosFromRemote$1.L$2;
            str = (java.lang.String) getStockVosUseCase$getStockVosFromRemote$1.L$1;
            c35064noK = (C35064noK) getStockVosUseCase$getStockVosFromRemote$1.L$0;
            C56391yDq.AEQbTJ(objAhwBna);
        }
        java.util.List list = (java.util.List) objAhwBna;
        stockListPoOLrzqt = list != null ? (StockListPo) CollectionsKt___CollectionsKt.firstOrNull(list) : null;
        pUU.KWHzl("GetStockVosUseCase", "HTTP request completed, caching StockListPo [bizType: " + str + "]");
        c35064noK.KWHzl.copydefault(stockListPoOLrzqt);
        if (stockListPoOLrzqt != null) {
            java.lang.String str2 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT") ? "SWAP" : "SPOT";
            java.util.List<StockTokenPo> spot = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SPOT") ? stockListPoOLrzqt.getSpot() : stockListPoOLrzqt.getFutures();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(spot, 10));
            java.util.Iterator<T> it2 = spot.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C35071noR.OLrzqt((StockTokenPo) it2.next(), interfaceC35073noT));
            }
            c35064noK.AEQbTJ().put(str2, new SoftReference<>(arrayList2));
            pUU.KWHzl("GetStockVosUseCase", "Pre-cached " + str2 + " VO list [size: " + arrayList2.size() + "]");
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT")) {
        }
        if (futures != null) {
        }
        return arrayList;
    }

    public static /* synthetic */ java.lang.Object getStockVosFromRemote$default(C35064noK c35064noK, java.lang.String str, InterfaceC35073noT interfaceC35073noT, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            num = 7;
        }
        return c35064noK.EZpvd(str, interfaceC35073noT, num, continuation);
    }
}
