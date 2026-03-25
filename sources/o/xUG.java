package o;

import com.okinc.market.common.MarketHttpApi;
import com.okinc.market.common.bean.DexTokenItemListRequest;
import com.okinc.market.common.bean.FavoriteInfo;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.unify_trade.biz.FavoriteBizConfig;
import com.okinc.unify_trade.biz.FavoriteBizInfo;
import com.okinc.unify_trade.biz.FavoriteBizInst;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import com.okinc.unify_trade.trade.source.watch.WatchMarketDataSource$initWatch$1$pair$1;
import com.okinc.unify_trade.trade.source.watch.WatchMarketDataSource$loadWatchList$1;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xUG extends xTS {
    public static final Activity Companion = new Activity(null);
    public static final int wlaJM = 8;
    public Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> AwvSrB;
    public java.util.List<TradeCoinInfo> AxsJAY;
    public final java.util.HashMap<java.lang.String, TickersData> DTwDnp;
    public xTB ORxRYg;
    public final boolean OcIXYQ;
    public final java.util.HashMap<java.lang.String, TickersData> QKVWgx;
    public final InterfaceC56387yDm QOLQEE;
    public CoroutineScope QfsBiF;
    public FavoriteBizInst gHZMYf;
    public java.util.List<FavoriteBizConfig> sSMYrx;
    public final xTK zLjUOn;
    public final InterfaceC56387yDm zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean valueOf(WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        return true;
    }

    public static final class Application extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public Application(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            pUU.AEQbTJ("WatchMarketDataSource", "CoroutineExceptionHandler", th);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (r7v0 o.xTK)
  (wrap:java.util.HashMap:0x0009: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.HashMap:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:47) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r8v0 java.util.HashMap))
  (wrap:java.util.HashMap:0x0013: TERNARY null = ((wrap:int:0x000a: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.HashMap:0x0010: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:48) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r9v0 java.util.HashMap))
  (wrap:boolean:0x0019: TERNARY null = ((wrap:int:0x0014: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x001a: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0020: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:50) call: o.xUL.<init>():void type: CONSTRUCTOR) : (r11v0 kotlin.jvm.functions.Function1))
 A[MD:(o.xTK, java.util.HashMap<java.lang.String, com.okinc.unify_trade.biz.subscribe.TickersData>, java.util.HashMap<java.lang.String, com.okinc.unify_trade.biz.subscribe.TickersData>, boolean, kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.subscribe.WatchListData, java.lang.Boolean>):void (m)] (LINE:45) call: o.xUG.<init>(o.xTK, java.util.HashMap, java.util.HashMap, boolean, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ xUG(xTK xtk, java.util.HashMap map, java.util.HashMap map2, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(xtk, (i & 2) != 0 ? new java.util.HashMap() : map, (i & 4) != 0 ? new java.util.HashMap() : map2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? new Function1() { // from class: o.xUL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(xUG.valueOf((WatchListData) obj));
            }
        } : function1);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xUG.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xUG(xTK xtk, @NotNull java.util.HashMap<java.lang.String, TickersData> map, @NotNull java.util.HashMap<java.lang.String, TickersData> map2, boolean z, @NotNull Function1<? super WatchListData, java.lang.Boolean> function1) {
        super(xtk, map, map2, z, function1);
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.zLjUOn = xtk;
        this.DTwDnp = map;
        this.QKVWgx = map2;
        this.OcIXYQ = z;
        this.QfsBiF = CoroutineScopeKt.CoroutineScope(C40440qVy.Companion.AEQbTJ().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null)).plus(new Application(CoroutineExceptionHandler.Key)));
        this.QOLQEE = C56392yDr.copydefault(new Function0() { // from class: o.xUF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xUG.AubY();
            }
        });
        this.zuBGHE = C56392yDr.copydefault(new Function0() { // from class: o.xUK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xUG.AuCTelauCTel();
            }
        });
    }

    private final C56131xwy AwvSrB() {
        return (C56131xwy) this.QOLQEE.getValue();
    }

    public static final C56131xwy AubY() {
        return new C56131xwy();
    }

    public static final MarketHttpApi AuCTelauCTel() {
        return (MarketHttpApi) C43417ror.OLrzqt(C56524yIo.AEQbTJ(MarketHttpApi.class));
    }

    public final MarketHttpApi wlaJM() {
        return (MarketHttpApi) this.zuBGHE.getValue();
    }

    @Override // o.xTS
    public void KWHzl(@NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        pUU.KWHzl("WatchListInit", " WatchSource  initBasic  starte ");
        this.AwvSrB = function2;
        initWatch$default(this, false, 1, null);
        KWHzl(new Function1() { // from class: o.xUJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xUG.KWHzl(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit KWHzl(xUG xug, int i) {
        pUU.KWHzl("IWatchSource", "login refresh data");
        if (xug.AkhnZx() != null || xug.getFieldNames()) {
            if (xug.values() instanceof xPT) {
                java.util.ArrayList<WatchListData> arrayListAEQbTJ = ((xPT) xug.values()).AEQbTJ();
                if (arrayListAEQbTJ != null && !Intrinsics.EZpvd(xug.AYXKKw(), arrayListAEQbTJ)) {
                    if (xug.AYXKKw().isEmpty()) {
                        xug.gEmmrt(true);
                    } else {
                        xug.OLrzqt(arrayListAEQbTJ);
                    }
                }
            } else {
                xug.gEmmrt(true);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void updateWatchFromNet$default(xUG xug, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        xug.gEmmrt(z);
    }

    public final void gEmmrt(final boolean z) {
        EZpvd(new Function2() { // from class: o.xUM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return xUG.OLrzqt(this.OLrzqt, z, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        });
    }

    public static final Unit OLrzqt(xUG xug, boolean z, boolean z2, java.lang.Exception exc) {
        if (z2) {
            pUU.KWHzl("WatchMarketDataSource", "updateWatchFromNet: ");
            xTS.refreshTicker$default(xug, false, 1, null);
            if (z) {
                xug.getNewProxyInstance();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.xTS, o.AbstractC54646xQb
    public void copydefault(@NotNull Function1<? super java.util.ArrayList<MarketDataSource>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        super.copydefault(function1);
        if (AYXKKw().isEmpty()) {
            function1.invoke(new java.util.ArrayList());
        }
    }

    public static /* synthetic */ void initWatch$default(xUG xug, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        xug.AYXKKw(z);
    }

    public final void AYXKKw(final boolean z) {
        EZpvd(new Function2() { // from class: o.xUI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return xUG.copydefault(z, this, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        });
    }

    public static final Unit copydefault(final boolean z, final xUG xug, boolean z2, java.lang.Exception exc) {
        C41436qql<?> c41436qqlAEQbTJ;
        Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2;
        if (!z2 && z) {
            Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function22 = xug.AwvSrB;
            if (function22 != null) {
                function22.invoke(java.lang.Boolean.FALSE, exc);
            }
        } else if (xug.AYXKKw().isEmpty()) {
            if (z && (function2 = xug.AwvSrB) != null) {
                function2.invoke(java.lang.Boolean.TRUE, null);
            }
            xug.KWHzl(true);
            Function1<java.util.ArrayList<MarketDataSource>, Unit> function1FJNWhG = xug.fJNWhG();
            if (function1FJNWhG != null) {
                function1FJNWhG.invoke(new java.util.ArrayList<>());
            }
            C41435qqk<?, MarketDataSource> c41435qqkDbNXlk = xug.DbNXlk();
            if (c41435qqkDbNXlk != null && (c41436qqlAEQbTJ = c41435qqkDbNXlk.AEQbTJ(yDY.AhwBna())) != null) {
                c41436qqlAEQbTJ.copydefault();
            }
        } else {
            Triple<java.lang.String, java.lang.String, java.util.List<DexTokenItemListRequest>> tripleKWHzl = xTQ.copydefault.KWHzl(Util.toImmutableList(xug.AYXKKw()), new WatchMarketDataSource$initWatch$1$pair$1(xug));
            xug.AEQbTJ(tripleKWHzl.getFirst(), tripleKWHzl.getSecond(), new Function2() { // from class: o.xUQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return xUG.copydefault(this.KWHzl, z, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
                }
            });
        }
        xTB xtb = xug.ORxRYg;
        if (xtb != null) {
            xtb.OLrzqt();
        }
        xug.ORxRYg = new xTB(xug.AYXKKw(), new Function1() { // from class: o.xUN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xUG.AEQbTJ(((java.lang.Boolean) obj).booleanValue());
            }
        }, xug.zLjUOn);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final xUG xug, final boolean z, final boolean z2, final java.lang.Exception exc) {
        if (z2) {
            xug.KWHzl(z2, exc, new Function2() { // from class: o.xUP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return xUG.KWHzl(this.AEQbTJ, z2, z, exc, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
                }
            });
        } else {
            xug.EZpvd(z2, z, exc);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(xUG xug, boolean z, boolean z2, java.lang.Exception exc, boolean z3, java.lang.Exception exc2) {
        xug.EZpvd(z, z2, exc);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(boolean z) {
        pUU.KWHzl("IWatchSource", "initWatch: start refresh watch list for refresh");
        return Unit.INSTANCE;
    }

    public final void EZpvd(boolean z, boolean z2, java.lang.Exception exc) {
        Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2;
        pUU.KWHzl("WatchListInit", " WatchSource  load complete  ");
        KWHzl(z);
        pUU.KWHzl("WatchListInit", " WatchSource  notify refresh  ");
        if (!z && z2) {
            Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function22 = this.AwvSrB;
            if (function22 != null) {
                function22.invoke(java.lang.Boolean.valueOf(z), exc);
                return;
            }
            return;
        }
        uzCIH();
        if (!z2 || (function2 = this.AwvSrB) == null) {
            return;
        }
        function2.invoke(java.lang.Boolean.valueOf(z), null);
    }

    @Override // o.xTS
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
        java.lang.Object objM7377constructorimpl;
        FavoriteBizConfig favoriteBizConfig;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        FavoriteBizInst favoriteBizInst = this.gHZMYf;
        java.util.List<TradeCoinInfo> list = this.AxsJAY;
        java.util.List<FavoriteBizConfig> list2 = this.sSMYrx;
        if (favoriteBizInst != null && list != null && list2 != null) {
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            int i = 3;
            FavoriteBizConfig favoriteBizConfig2 = new FavoriteBizConfig((java.util.List) (0 == true ? 1 : 0), (java.util.List) (0 == true ? 1 : 0), i, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            if (str.length() == 0) {
                AEQbTJ(new FavoriteBizInfo(favoriteBizInst, favoriteBizConfig2, list));
                function2.invoke(java.lang.Boolean.TRUE, null);
                return;
            }
            try {
                Result.Application application = Result.Companion;
                java.util.List<FavoriteBizConfig> list3 = this.sSMYrx;
                if (list3 == null || (favoriteBizConfig = (FavoriteBizConfig) CollectionsKt___CollectionsKt.firstOrNull(list3)) == null) {
                    favoriteBizConfig = new FavoriteBizConfig((java.util.List) (b3 == true ? 1 : 0), (java.util.List) (b2 == true ? 1 : 0), i, (DefaultConstructorMarker) (b == true ? 1 : 0));
                }
                AEQbTJ(new FavoriteBizInfo(favoriteBizInst, favoriteBizConfig, list));
                function2.invoke(java.lang.Boolean.TRUE, null);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                function2.invoke(java.lang.Boolean.FALSE, thM7380exceptionOrNullimpl instanceof java.lang.Exception ? (java.lang.Exception) thM7380exceptionOrNullimpl : null);
            }
            Result.m7376boximpl(objM7377constructorimpl);
            return;
        }
        super.AEQbTJ(str, str2, function2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<com.okinc.unify_trade.biz.subscribe.WatchListData, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(FavoriteInfo favoriteInfo) {
        java.util.List<WatchListData> favorites = favoriteInfo.getFavorites();
        Function1<WatchListData, java.lang.Boolean> function1DjBIcL = djBIcL();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : favorites) {
            if (((java.lang.Boolean) function1DjBIcL.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (!Intrinsics.EZpvd((java.lang.Object) ((WatchListData) obj2).getInstType(), (java.lang.Object) "CEDEFI")) {
                arrayList2.add(obj2);
            }
        }
        KWHzl(arrayList2);
        this.gHZMYf = favoriteInfo.getSimpleProduct();
        this.AxsJAY = favoriteInfo.getCoins();
        this.sSMYrx = favoriteInfo.getConfigs();
        AYXKKw().clear();
        AYXKKw().addAll(arrayList2);
    }

    public final void EZpvd(Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
        pUU.KWHzl("WatchMarketDataSource", "loadWatchList() called with: loader = " + function2);
        BuildersKt__Builders_commonKt.launch$default(this.QfsBiF, null, null, new WatchMarketDataSource$loadWatchList$1(this, function2, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: kotlin.jvm.functions.Function1<com.okinc.unify_trade.biz.subscribe.WatchListData, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.xTS
    public void OLrzqt(@NotNull java.util.List<WatchListData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        Function1<WatchListData, java.lang.Boolean> function1DjBIcL = djBIcL();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((java.lang.Boolean) function1DjBIcL.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (!Intrinsics.EZpvd((java.lang.Object) ((WatchListData) obj2).getInstType(), (java.lang.Object) "CEDEFI")) {
                arrayList2.add(obj2);
            }
        }
        KWHzl(arrayList2);
        super.OLrzqt((java.util.List<WatchListData>) arrayList2);
    }

    public final void KWHzl(java.util.List<WatchListData> list) {
        AuCTel().clear();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AEQbTJ((WatchListData) it.next());
        }
    }

    @Override // o.xTS
    public void AEQbTJ(@NotNull java.util.List<WatchListData> list, @NotNull final InterfaceC55701xos<Unit> interfaceC55701xos, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        OLrzqt(list);
        xTS.refreshTicker$default(this, false, 1, null);
        if (values() instanceof xPY) {
            ((xPY) values()).copydefault(list, new Function1() { // from class: o.xUE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return xUG.OLrzqt(interfaceC55701xos, (Result) obj);
                }
            });
        } else {
            AwvSrB().EZpvd(copydefault(list), new StateListAnimator(z, this, interfaceC55701xos));
        }
    }

    public static final Unit OLrzqt(InterfaceC55701xos interfaceC55701xos, Result result) {
        java.lang.Object objM7386unboximpl = result.m7386unboximpl();
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            interfaceC55701xos.EZpvd(true, Unit.INSTANCE, null);
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
            interfaceC55701xos.EZpvd(false, Unit.INSTANCE, new java.lang.Exception(thM7380exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements InterfaceC55701xos<Unit> {
        public final /* synthetic */ xUG EZpvd;
        public final /* synthetic */ boolean KWHzl;
        public final /* synthetic */ InterfaceC55701xos<Unit> copydefault;

        public StateListAnimator(boolean z, xUG xug, InterfaceC55701xos<Unit> interfaceC55701xos) {
            this.KWHzl = z;
            this.EZpvd = xug;
            this.copydefault = interfaceC55701xos;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, Unit unit, java.lang.Exception exc) {
            if (this.KWHzl) {
                xUG.updateWatchFromNet$default(this.EZpvd, false, 1, null);
            }
            this.copydefault.EZpvd(z, unit, exc);
        }
    }

    @Override // o.xTS, o.AbstractC54646xQb
    public void valueOf() {
        super.valueOf();
        C43296rmc.AEQbTJ("LoginMarketDataSource", "------------------>destroy");
        AhwBna().dispose();
        InterfaceC58217yxC interfaceC58217yxCGEmmrt = gEmmrt();
        if (interfaceC58217yxCGEmmrt != null) {
            interfaceC58217yxCGEmmrt.dispose();
        }
        this.AwvSrB = null;
        xTG xtgAkhnZx = AkhnZx();
        if (xtgAkhnZx != null) {
            xtgAkhnZx.AYXKKw();
        }
        xTB xtb = this.ORxRYg;
        if (xtb != null) {
            xtb.OLrzqt();
        }
        CoroutineScopeKt.cancel$default(this.QfsBiF, null, 1, null);
    }
}
