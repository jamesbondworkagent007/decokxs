package o;

import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinWatchInstrument;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.FavoriteBizInfo;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.subscribe.SettingWatchList;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import com.okinc.unify_trade.trade.model.WatchMarketData;
import com.okinc.unify_trade.trade.source.watch.IWatchSource$loadBizInfo$1;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class xTS extends AbstractC54646xQb {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public Job AEQbTJ;
    public final xTK AYXKKw;
    public final CopyOnWriteArrayList<WatchListData> AhwBna;
    public xTG AkhnZx;
    public final java.util.HashMap<java.lang.String, TickersData> AuCTel;
    public final boolean DbNXlk;
    public final Function1<WatchListData, java.lang.Boolean> EZpvd;
    public boolean KWHzl;
    public InterfaceC54763xUk OLrzqt;
    public final C58216yxB djBIcL;
    public InterfaceC58217yxC fARcdN;
    public final java.util.HashMap<java.lang.String, TickersData> fIwbmz;
    public InterfaceC58217yxC fJNWhG;
    public final ConcurrentHashMap<java.lang.String, WatchListData> fetchVPNInfo;
    public InterfaceC58217yxC gEmmrt;
    public InterfaceC58217yxC isConnected;
    public java.lang.String valueOf;
    public C41435qqk<?, MarketDataSource> values;

    public abstract void AEQbTJ(@NotNull java.util.List<WatchListData> list, @NotNull InterfaceC55701xos<Unit> interfaceC55701xos, boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyOnWriteArrayList<WatchListData> AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58216yxB AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xTG AkhnZx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41435qqk<?, MarketDataSource> DbNXlk() {
        return this.values;
    }

    public abstract void KWHzl(@NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<WatchListData, java.lang.Boolean> djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC58217yxC gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFieldNames() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.subscribe.WatchListData, java.lang.Boolean> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xTS(xTK xtk, @NotNull java.util.HashMap<java.lang.String, TickersData> map, @NotNull java.util.HashMap<java.lang.String, TickersData> map2, boolean z, @NotNull Function1<? super WatchListData, java.lang.Boolean> function1) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AYXKKw = xtk;
        this.AuCTel = map;
        this.fIwbmz = map2;
        this.DbNXlk = z;
        this.EZpvd = function1;
        this.djBIcL = new C58216yxB();
        this.AhwBna = new CopyOnWriteArrayList<>();
        this.fetchVPNInfo = new ConcurrentHashMap<>();
        this.valueOf = "";
    }

    public static final class TaskDescription implements Function2<java.lang.Boolean, java.lang.Exception, Unit> {
        public final /* synthetic */ Continuation<java.lang.Boolean> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Continuation<? super java.lang.Boolean> continuation) {
            this.KWHzl = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(java.lang.Boolean bool, java.lang.Exception exc) {
            EZpvd(bool.booleanValue(), exc);
            return Unit.INSTANCE;
        }

        public final void EZpvd(boolean z, java.lang.Exception exc) {
            if (z) {
                Continuation<java.lang.Boolean> continuation = this.KWHzl;
                Result.Application application = Result.Companion;
                continuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.TRUE));
            } else {
                Continuation<java.lang.Boolean> continuation2 = this.KWHzl;
                Result.Application application2 = Result.Companion;
                if (exc == null) {
                    exc = new java.lang.Exception("Unknown error");
                }
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(exc)));
            }
        }
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        KWHzl(new TaskDescription(c56434yFf));
        java.lang.Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xTS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static /* synthetic */ void setAllWatch$default(xTS xts, java.util.List list, InterfaceC55701xos interfaceC55701xos, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAllWatch");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        xts.AEQbTJ((java.util.List<WatchListData>) list, (InterfaceC55701xos<Unit>) interfaceC55701xos, z);
    }

    public final <R> void AEQbTJ(@NotNull Function1<? super java.util.List<? extends MarketDataSource>, ? extends java.util.List<? extends R>> function1, @NotNull Function1<? super java.util.List<? extends R>, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.values = new C41435qqk<>(function1, function12);
        copydefault(false);
    }

    @Override // o.AbstractC54646xQb
    public void copydefault(@NotNull Function1<? super java.util.ArrayList<MarketDataSource>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        super.copydefault(function1);
        copydefault(false);
    }

    public final java.util.List<SettingWatchList> copydefault(@NotNull java.util.List<WatchListData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (WatchListData watchListData : list) {
            arrayList.add(new SettingWatchList("0", watchListData.getInstId(), watchListData.getInstType(), watchListData.getAlias(), watchListData.getExpTime(), watchListData.getChainId(), watchListData.getTokenContractAddress()));
        }
        return arrayList;
    }

    public void OLrzqt(@NotNull java.util.List<WatchListData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C43296rmc.AEQbTJ("WatchList", " watch source syncWatchList() called with: watchList = " + list);
        this.AhwBna.clear();
        CopyOnWriteArrayList<WatchListData> copyOnWriteArrayList = this.AhwBna;
        Function1<WatchListData, java.lang.Boolean> function1 = this.EZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (function1.invoke((WatchListData) obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        copyOnWriteArrayList.addAll(arrayList);
        refreshTicker$default(this, false, 1, null);
    }

    public void AEQbTJ(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        pUU.KWHzl("IWatchSource", "setSortCondition: ");
        if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "") && fJNWhG() != null) {
            java.util.ArrayList<MarketDataSource> arrayListHDKMBd = hDKMBd();
            Function1<java.util.ArrayList<MarketDataSource>, Unit> function1FJNWhG = fJNWhG();
            if (function1FJNWhG != null) {
                function1FJNWhG.invoke(arrayListHDKMBd);
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) str)) {
            return;
        }
        this.valueOf = str;
        refreshTicker$default(this, false, 1, null);
    }

    public static /* synthetic */ void refreshTicker$default(xTS xts, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshTicker");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        xts.copydefault(z);
    }

    public final void copydefault(boolean z) {
        synchronized (this) {
            pUU.EZpvd("IWatchSource", "refreshTicker() called ");
            xTG xtg = this.AkhnZx;
            if (xtg != null && xtg.OLrzqt()) {
                pUU.EZpvd("IWatchSource", "refreshTicker() called invoke");
                if (z) {
                    InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
                    if (interfaceC58217yxC != null) {
                        interfaceC58217yxC.dispose();
                    }
                    AubY();
                } else {
                    InterfaceC58217yxC interfaceC58217yxC2 = this.gEmmrt;
                    if (interfaceC58217yxC2 == null || !interfaceC58217yxC2.isDisposed()) {
                        AubY();
                    }
                }
            }
        }
    }

    public final java.lang.String OLrzqt(WatchListData watchListData) {
        BizInstrument bizInstrumentValueOf;
        java.lang.String instId;
        java.lang.String instId2;
        if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "FUTURES")) {
            AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl("FUTURES");
            xLC xlc = abstractC54531xLwKWHzl instanceof xLC ? (xLC) abstractC54531xLwKWHzl : null;
            bizInstrumentValueOf = xlc != null ? xlc.valueOf(watchListData.getInstId(), watchListData.getAlias()) : null;
            if (bizInstrumentValueOf != null && (instId2 = bizInstrumentValueOf.getInstId()) != null) {
                return instId2;
            }
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "OPTION")) {
                return watchListData.getInstId();
            }
            AbstractC54531xLw abstractC54531xLwKWHzl2 = xUD.KWHzl("OPTION");
            bizInstrumentValueOf = abstractC54531xLwKWHzl2 != null ? abstractC54531xLwKWHzl2.valueOf(watchListData.getInstId()) : null;
            if (bizInstrumentValueOf != null && (instId = bizInstrumentValueOf.getInstId()) != null) {
                return instId;
            }
        }
        return "";
    }

    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function2, "");
            Job job = this.AEQbTJ;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            if (str.length() > 0 && C59454zhO.zsXlph(str) == ';') {
                str = StringsKt__StringsKt.copydefault(str, str.length() - 1, str.length()).toString();
            }
            this.AEQbTJ = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new IWatchSource$loadBizInfo$1(str2, str, this, function2, null), 3, null);
        }
    }

    public void KWHzl(final boolean z, final java.lang.Exception exc, @NotNull final Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl("SPOT");
        xLL xll = abstractC54531xLwKWHzl instanceof xLL ? (xLL) abstractC54531xLwKWHzl : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (xll == (interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt("SPOT") : null)) {
            function2.invoke(java.lang.Boolean.valueOf(z), exc);
            return;
        }
        CopyOnWriteArrayList<WatchListData> copyOnWriteArrayList = this.AhwBna;
        if (!(copyOnWriteArrayList instanceof java.util.Collection) || !copyOnWriteArrayList.isEmpty()) {
            for (WatchListData watchListData : copyOnWriteArrayList) {
                BizInstrument bizInstrumentAEQbTJ = AEQbTJ(watchListData.getInstId(), watchListData.getInstType(), true);
                if (Intrinsics.EZpvd((java.lang.Object) (bizInstrumentAEQbTJ != null ? bizInstrumentAEQbTJ.getInstType() : null), (java.lang.Object) "SPOT") && !Intrinsics.EZpvd((java.lang.Object) bizInstrumentAEQbTJ.getBizStatus(), (java.lang.Object) "LIVE")) {
                    if (xll != null) {
                        pUU.KWHzl("WatchListInit", " WatchSource  loadCountDownInfo started ");
                        xll.copydefault(new Function1() { // from class: o.xUe
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return xTS.AEQbTJ(function2, z, exc, (ResponseData) obj);
                            }
                        });
                        return;
                    } else {
                        function2.invoke(java.lang.Boolean.valueOf(z), exc);
                        return;
                    }
                }
            }
        }
        function2.invoke(java.lang.Boolean.valueOf(z), exc);
    }

    public static final Unit AEQbTJ(Function2 function2, boolean z, java.lang.Exception exc, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        pUU.KWHzl("WatchListInit", " WatchSource  loadCountDownInfo end ");
        function2.invoke(java.lang.Boolean.valueOf(z), exc);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(FavoriteBizInfo favoriteBizInfo) {
        OLrzqt(favoriteBizInfo);
        copydefault();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.LinkedHashMap<java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(@NotNull LinkedHashMap<java.lang.String, java.lang.String> linkedHashMap, @NotNull java.lang.String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(linkedHashMap, "");
            Intrinsics.checkNotNullParameter(str, "");
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
            if (!listSplit$default.isEmpty()) {
                linkedHashMap.put(listSplit$default.get(0), listSplit$default.get(0));
                if (!Intrinsics.EZpvd(listSplit$default.get(1), (java.lang.Object) "USD")) {
                    linkedHashMap.put(listSplit$default.get(1), listSplit$default.get(1));
                }
            }
        }
    }

    public final void OLrzqt(FavoriteBizInfo favoriteBizInfo) {
        synchronized (this) {
            pWO.KWHzl().EZpvd(favoriteBizInfo != null ? new FavoriteBizInfo(null, null, favoriteBizInfo.getMCoinList()) : null);
            if (favoriteBizInfo != null) {
                C54764xUl c54764xUl = new C54764xUl(favoriteBizInfo);
                c54764xUl.AEQbTJ(favoriteBizInfo);
                this.OLrzqt = c54764xUl;
            }
        }
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public void uzCIH() {
        this.KWHzl = true;
        if (this.isConnected == null) {
            AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("WATCH_COUNT_DOWN_EVENT");
            final Function1 function1 = new Function1() { // from class: o.xUa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return xTS.AhwBna(this.copydefault, (java.lang.String) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.xUd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    xTS.valueOf(function1, obj);
                }
            });
            this.djBIcL.AEQbTJ(interfaceC58217yxCAEQbTJ);
            this.isConnected = interfaceC58217yxCAEQbTJ;
        }
        getNewProxyInstance();
        if (this.fARcdN == null) {
            AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ2 = RxBus.AEQbTJ("NEW_COIN_ONLINE_STATUS_UPDATE");
            final Function1 function12 = new Function1() { // from class: o.xTZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return xTS.gEmmrt(this.EZpvd, (java.lang.String) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ2 = abstractC58185ywXAEQbTJ2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.xUf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    xTS.DbNXlk(function12, obj);
                }
            });
            this.fARcdN = interfaceC58217yxCAEQbTJ2;
            if (interfaceC58217yxCAEQbTJ2 != null) {
                this.djBIcL.AEQbTJ(interfaceC58217yxCAEQbTJ2);
            }
        }
        if (this.fJNWhG == null) {
            AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ3 = RxBus.AEQbTJ("NEW_CONTRACT_ONLINE_STATUS_UPDATE");
            final Function1 function13 = new Function1() { // from class: o.xUg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return xTS.AYXKKw(this.EZpvd, (java.lang.String) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ3 = abstractC58185ywXAEQbTJ3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.xUi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    xTS.isConnected(function13, obj);
                }
            });
            this.fJNWhG = interfaceC58217yxCAEQbTJ3;
            if (interfaceC58217yxCAEQbTJ3 != null) {
                this.djBIcL.AEQbTJ(interfaceC58217yxCAEQbTJ3);
            }
        }
    }

    public static final Unit AhwBna(xTS xts, java.lang.String str) {
        pUU.KWHzl("IWatchSource", "countDownRefresh: ");
        refreshTicker$default(xts, false, 1, null);
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(xTS xts, java.lang.String str) {
        refreshTicker$default(xts, false, 1, null);
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(xTS xts, java.lang.String str) {
        refreshTicker$default(xts, false, 1, null);
        return Unit.INSTANCE;
    }

    public final void getNewProxyInstance() {
        xTG xtg;
        pUU.KWHzl("WatchSource", " try restart teh watch task");
        xTG xtg2 = this.AkhnZx;
        if (xtg2 != null || this.KWHzl) {
            if (xtg2 != null && (xtg2 == null || xtg2.copydefault())) {
                xTG xtg3 = this.AkhnZx;
                if (Intrinsics.EZpvd(xtg3 != null ? xtg3.KWHzl() : null, this.AhwBna) && ((xtg = this.AkhnZx) == null || xtg.OLrzqt())) {
                    return;
                }
            }
            pUU.KWHzl("WatchSource", "real restart teh watch task");
            xTG xtg4 = this.AkhnZx;
            if (xtg4 != null) {
                xtg4.AYXKKw();
            }
            this.AkhnZx = new xTG(this.AhwBna, new Function2() { // from class: o.xUb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return xTS.copydefault(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
                }
            }, this.AYXKKw, this.AuCTel, this.fIwbmz, this.DbNXlk);
        }
    }

    public static final Unit copydefault(xTS xts, boolean z, java.lang.Exception exc) {
        if (z) {
            pUU.KWHzl("WatchSource", " watch source call back refresh ticker");
            refreshTicker$default(xts, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    private final void AubY() {
        xTG xtg;
        xTK xtk = this.AYXKKw;
        if (xtk != null && !xtk.KWHzl() && (xtg = this.AkhnZx) != null) {
            xtg.AYXKKw();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just("");
        final Function1 function1 = new Function1() { // from class: o.xTV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xTS.OLrzqt(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.xTY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return xTS.AYXKKw(function1, obj);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.xTU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xTS.copydefault(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xTW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xTS.gEmmrt(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.xTX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xTS.OLrzqt((java.lang.Throwable) obj);
            }
        };
        this.gEmmrt = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xUc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xTS.AhwBna(function13, obj);
            }
        });
    }

    public static final kotlin.Pair AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.Pair OLrzqt(xTS xts, java.lang.String str) {
        java.util.List arrayList;
        java.util.List listFJNWhG;
        boolean z;
        CountDownInfo countDownInfoAEQbTJ;
        CountDownInfo countDownInfoAEQbTJ2;
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd("IWatchSource", "start getTickerList ");
        java.util.ArrayList<MarketDataSource> arrayListHDKMBd = xts.hDKMBd();
        if (!Intrinsics.EZpvd((java.lang.Object) xts.valueOf, (java.lang.Object) "")) {
            arrayListHDKMBd = xts.EZpvd(arrayListHDKMBd, xts.valueOf);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) xts.valueOf) && !Intrinsics.EZpvd((java.lang.Object) xts.valueOf, (java.lang.Object) "name_descending_sort") && !Intrinsics.EZpvd((java.lang.Object) xts.valueOf, (java.lang.Object) "name_ascending_sort")) {
            AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl("SPOT");
            AbstractC54531xLw abstractC54531xLwKWHzl2 = xUD.KWHzl("SWAP");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (abstractC54531xLwKWHzl != null) {
                linkedHashMap.put("SPOT", abstractC54531xLwKWHzl);
            }
            if (abstractC54531xLwKWHzl2 != null) {
                linkedHashMap.put("SWAP", abstractC54531xLwKWHzl2);
            }
            if (abstractC54531xLwKWHzl != null || abstractC54531xLwKWHzl2 != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                java.util.Iterator it = arrayListHDKMBd.iterator();
                while (true) {
                    boolean z2 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    MarketDataSource marketDataSource = (MarketDataSource) next;
                    if (!Intrinsics.EZpvd((java.lang.Object) marketDataSource.getInstType(), (java.lang.Object) "SPOT")) {
                        z2 = false;
                    } else if (abstractC54531xLwKWHzl == null) {
                        countDownInfoAEQbTJ2 = null;
                        if (countDownInfoAEQbTJ2 == null) {
                        }
                    } else {
                        java.lang.String instId = marketDataSource.getInstId();
                        if (instId == null) {
                            instId = "";
                        }
                        BizInstrument bizInstrumentValueOf = abstractC54531xLwKWHzl.valueOf(instId);
                        if (bizInstrumentValueOf != null) {
                            countDownInfoAEQbTJ2 = xUD.AEQbTJ(bizInstrumentValueOf.getInstId(), "SPOT");
                        }
                        if (countDownInfoAEQbTJ2 == null) {
                        }
                    }
                    java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z2);
                    java.lang.Object arrayList2 = linkedHashMap2.get(boolValueOf);
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList();
                        linkedHashMap2.put(boolValueOf, arrayList2);
                    }
                    ((java.util.List) arrayList2).add(next);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (java.lang.Object obj : arrayListHDKMBd) {
                    MarketDataSource marketDataSource2 = (MarketDataSource) obj;
                    if (!Intrinsics.EZpvd((java.lang.Object) marketDataSource2.getInstType(), (java.lang.Object) "SWAP")) {
                        z = false;
                    } else if (abstractC54531xLwKWHzl2 == null) {
                        countDownInfoAEQbTJ = null;
                        if (countDownInfoAEQbTJ == null) {
                            z = true;
                        }
                    } else {
                        java.lang.String instId2 = marketDataSource2.getInstId();
                        if (instId2 == null) {
                            instId2 = "";
                        }
                        BizInstrument bizInstrumentValueOf2 = abstractC54531xLwKWHzl2.valueOf(instId2);
                        if (bizInstrumentValueOf2 != null) {
                            countDownInfoAEQbTJ = xUD.AEQbTJ(bizInstrumentValueOf2.getInstId(), "SWAP");
                        }
                        if (countDownInfoAEQbTJ == null) {
                        }
                    }
                    java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(z);
                    java.lang.Object arrayList3 = linkedHashMap3.get(boolValueOf2);
                    if (arrayList3 == null) {
                        arrayList3 = new java.util.ArrayList();
                        linkedHashMap3.put(boolValueOf2, arrayList3);
                    }
                    ((java.util.List) arrayList3).add(obj);
                }
                arrayListHDKMBd = new java.util.ArrayList<>();
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                java.util.Collection<? extends MarketDataSource> arrayList4 = (java.util.List) linkedHashMap2.get(bool);
                if (arrayList4 == null) {
                    arrayList4 = new java.util.ArrayList<>();
                }
                arrayListHDKMBd.addAll(arrayList4);
                java.util.Collection<? extends MarketDataSource> arrayList5 = (java.util.List) linkedHashMap3.get(bool);
                if (arrayList5 == null) {
                    arrayList5 = new java.util.ArrayList<>();
                }
                arrayListHDKMBd.addAll(arrayList5);
                java.util.Comparator<MarketDataSource> comparatorCopydefault = xTT.copydefault(linkedHashMap);
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.util.List list = (java.util.List) linkedHashMap2.get(java.lang.Boolean.TRUE);
                if (list == null || (listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list)) == null || (arrayList = CollectionsKt___CollectionsKt.EZpvd(listFJNWhG, comparatorCopydefault)) == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList6.addAll(arrayList);
                arrayListHDKMBd.addAll(arrayList6);
            }
        }
        pUU.EZpvd("IWatchSource", " getTickerList  end");
        C41435qqk<?, MarketDataSource> c41435qqk = xts.values;
        return C56390yDp.OLrzqt(arrayListHDKMBd, c41435qqk != null ? c41435qqk.AEQbTJ(arrayListHDKMBd) : null);
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: kotlin.jvm.functions.Function1<java.util.ArrayList<com.okinc.tradeapi.bean.MarketDataSource>, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(xTS xts, kotlin.Pair pair) {
        pUU.EZpvd("IWatchSource", " start fill ui data");
        Function1<java.util.ArrayList<MarketDataSource>, Unit> function1FJNWhG = xts.fJNWhG();
        if (function1FJNWhG != 0) {
            function1FJNWhG.invoke(pair.getFirst());
        }
        C41436qql c41436qql = (C41436qql) pair.getSecond();
        if (c41436qql != null) {
            c41436qql.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        C6777aVl.Companion.EZpvd(new java.lang.Exception("WatchMarketDataSource:" + th.getMessage()));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<MarketDataSource> hDKMBd() {
        java.util.Iterator it;
        TickersData tickersDataCopydefault;
        TickersData tickersDataKWHzl;
        java.lang.String tickerPrice;
        java.util.ArrayList<MarketDataSource> arrayList = new java.util.ArrayList<>();
        java.util.Iterator it2 = new java.util.ArrayList(this.AhwBna).iterator();
        while (it2.hasNext()) {
            WatchListData watchListData = (WatchListData) it2.next();
            BizInstrument watchMarketInstrument$default = xUD.getWatchMarketInstrument$default(watchListData.getInstType(), watchListData.getInstId(), watchListData.getInstId(), watchListData.getAlias(), false, 16, null);
            if (watchMarketInstrument$default != null) {
                Intrinsics.copydefault(watchListData);
                java.lang.String strOLrzqt = OLrzqt(watchListData);
                this.fetchVPNInfo.put(strOLrzqt + watchListData.getInstType(), watchListData);
                java.lang.String instType = watchListData.getInstType();
                if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "COIN")) {
                    xTG xtg = this.AkhnZx;
                    tickersDataCopydefault = xtg != null ? xtg.KWHzl(strOLrzqt) : null;
                    if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "COIN")) {
                        xTG xtg2 = this.AkhnZx;
                        tickersDataKWHzl = xtg2 != null ? xtg2.KWHzl(strOLrzqt) : null;
                        xTG xtg3 = this.AkhnZx;
                        TickersData tickersDataKWHzl2 = xtg3 == null ? xtg3.KWHzl(watchMarketInstrument$default.getQuoteSymbol()) : null;
                        java.lang.String instType2 = watchListData.getInstType();
                        java.lang.String volCcy24h = tickersDataCopydefault == null ? tickersDataCopydefault.getVolCcy24h() : null;
                        java.lang.String vol24h = tickersDataCopydefault == null ? tickersDataCopydefault.getVol24h() : null;
                        java.lang.String strOLrzqt2 = OLrzqt(strOLrzqt, watchListData.getInstType());
                        java.lang.String symbol = !(watchMarketInstrument$default instanceof CoinWatchInstrument) ? ((CoinWatchInstrument) watchMarketInstrument$default).getSymbol() : watchMarketInstrument$default.getTradeSymbol();
                        it = it2;
                        java.lang.String quoteSymbol = (!Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "MARGIN")) ? watchMarketInstrument$default.getQuoteSymbol() : null;
                        kotlin.Pair<java.lang.Double, java.lang.String> pairAEQbTJ = tickersDataCopydefault == null ? AEQbTJ(tickersDataCopydefault) : null;
                        java.lang.String last = tickersDataCopydefault == null ? tickersDataCopydefault.getLast() : null;
                        java.lang.String last2 = tickersDataKWHzl == null ? tickersDataKWHzl.getLast() : null;
                        java.lang.String open24h = tickersDataCopydefault == null ? tickersDataCopydefault.getOpen24h() : null;
                        java.lang.String alias = watchListData.getAlias();
                        java.lang.String strCopydefault = !Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "COIN") ? copydefault(watchListData.getInstId()) : "";
                        java.lang.String strEZpvd = !Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "COIN") ? EZpvd(watchListData.getInstId()) : "";
                        java.lang.String strAEQbTJ = AEQbTJ(watchMarketInstrument$default, watchListData.getInstType(), strOLrzqt);
                        java.lang.String strCopydefault2 = copydefault(watchMarketInstrument$default, watchListData.getInstType(), strOLrzqt);
                        java.lang.String strAEQbTJ2 = AEQbTJ(watchMarketInstrument$default);
                        java.util.ArrayList<MarketDataSource> arrayList2 = arrayList;
                        WatchMarketData watchMarketData = new WatchMarketData(instType2, strOLrzqt, strOLrzqt2, alias, symbol, quoteSymbol, strEZpvd, volCcy24h, vol24h, pairAEQbTJ, last, last2, open24h, strCopydefault, strAEQbTJ, strCopydefault2, null, null, OLrzqt(strAEQbTJ2 != null ? strAEQbTJ2 : ""), tickersDataKWHzl2 == null ? tickersDataKWHzl2.getLast() : null, watchMarketInstrument$default.getDisplayId(), watchMarketInstrument$default.getDisplayQuoteSymbol(), ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, null);
                        if (watchMarketInstrument$default.isPreMarketPair()) {
                            watchMarketData.setPreMarket(true);
                        }
                        watchMarketData.setHotTag(copydefault(watchListData));
                        watchMarketData.setNewLabel(KWHzl(watchListData));
                        C54762xUj c54762xUj = C54762xUj.EZpvd;
                        watchMarketData.setSortVolume(c54762xUj.KWHzl(watchMarketData));
                        watchMarketData.setSortTurnover(java.lang.Double.valueOf(c54762xUj.EZpvd(watchMarketData)));
                        tickerPrice = watchMarketData.getTickerPrice();
                        if (tickerPrice != null || tickerPrice.length() == 0) {
                            pUU.KWHzl("MarketWatchHelper", "ticker data wrong  instId" + strOLrzqt + " " + watchListData);
                        }
                        arrayList = arrayList2;
                        arrayList.add(watchMarketData);
                    } else {
                        xTG xtg4 = this.AkhnZx;
                        if (xtg4 != null) {
                            tickersDataKWHzl = xtg4.KWHzl(watchMarketInstrument$default.getTradeSymbol());
                        }
                        xTG xtg32 = this.AkhnZx;
                        if (xtg32 == null) {
                        }
                        java.lang.String instType22 = watchListData.getInstType();
                        if (tickersDataCopydefault == null) {
                        }
                        if (tickersDataCopydefault == null) {
                        }
                        java.lang.String strOLrzqt22 = OLrzqt(strOLrzqt, watchListData.getInstType());
                        if (!(watchMarketInstrument$default instanceof CoinWatchInstrument)) {
                        }
                        it = it2;
                        if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "SPOT")) {
                            if (tickersDataCopydefault == null) {
                            }
                            if (tickersDataCopydefault == null) {
                            }
                            if (tickersDataKWHzl == null) {
                            }
                            if (tickersDataCopydefault == null) {
                            }
                            java.lang.String alias2 = watchListData.getAlias();
                            if (!Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "COIN")) {
                            }
                            if (!Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "COIN")) {
                            }
                            java.lang.String strAEQbTJ3 = AEQbTJ(watchMarketInstrument$default, watchListData.getInstType(), strOLrzqt);
                            java.lang.String strCopydefault22 = copydefault(watchMarketInstrument$default, watchListData.getInstType(), strOLrzqt);
                            java.lang.String strAEQbTJ22 = AEQbTJ(watchMarketInstrument$default);
                            java.util.ArrayList<MarketDataSource> arrayList22 = arrayList;
                            WatchMarketData watchMarketData2 = new WatchMarketData(instType22, strOLrzqt, strOLrzqt22, alias2, symbol, quoteSymbol, strEZpvd, volCcy24h, vol24h, pairAEQbTJ, last, last2, open24h, strCopydefault, strAEQbTJ3, strCopydefault22, null, null, OLrzqt(strAEQbTJ22 != null ? strAEQbTJ22 : ""), tickersDataKWHzl2 == null ? tickersDataKWHzl2.getLast() : null, watchMarketInstrument$default.getDisplayId(), watchMarketInstrument$default.getDisplayQuoteSymbol(), ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, null);
                            if (watchMarketInstrument$default.isPreMarketPair()) {
                            }
                            watchMarketData2.setHotTag(copydefault(watchListData));
                            watchMarketData2.setNewLabel(KWHzl(watchListData));
                            C54762xUj c54762xUj2 = C54762xUj.EZpvd;
                            watchMarketData2.setSortVolume(c54762xUj2.KWHzl(watchMarketData2));
                            watchMarketData2.setSortTurnover(java.lang.Double.valueOf(c54762xUj2.EZpvd(watchMarketData2)));
                            tickerPrice = watchMarketData2.getTickerPrice();
                            if (tickerPrice != null) {
                                pUU.KWHzl("MarketWatchHelper", "ticker data wrong  instId" + strOLrzqt + " " + watchListData);
                                arrayList = arrayList22;
                                arrayList.add(watchMarketData2);
                            }
                        }
                    }
                } else if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "OPTION")) {
                    xTG xtg5 = this.AkhnZx;
                    if (xtg5 != null) {
                        tickersDataCopydefault = xtg5.AEQbTJ(strOLrzqt);
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "COIN")) {
                    }
                } else {
                    xTG xtg6 = this.AkhnZx;
                    if (xtg6 != null) {
                        tickersDataCopydefault = xtg6.copydefault(strOLrzqt);
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "COIN")) {
                    }
                }
            } else {
                it = it2;
            }
            it2 = it;
        }
        return arrayList;
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        TickersData tickersDataKWHzl;
        xTG xtg = this.AkhnZx;
        if (xtg == null || (tickersDataKWHzl = xtg.KWHzl(str)) == null) {
            return null;
        }
        return tickersDataKWHzl.getLast();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xoj.calApplies$default(o.xoj, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.Object):kotlin.Pair */
    private final kotlin.Pair<java.lang.Double, java.lang.String> AEQbTJ(TickersData tickersData) {
        return C55692xoj.calApplies$default(C55692xoj.KWHzl, tickersData.getLast(), tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8(), false, 16, null);
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        java.lang.String instFamily;
        AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl(str2);
        BizInstrument bizInstrumentValueOf = abstractC54531xLwKWHzl != null ? abstractC54531xLwKWHzl.valueOf(str) : null;
        return (bizInstrumentValueOf == null || (instFamily = bizInstrumentValueOf.getInstFamily()) == null) ? "" : instFamily;
    }

    public final java.lang.String AEQbTJ(BizInstrument bizInstrument, java.lang.String str, java.lang.String str2) {
        if (bizInstrument instanceof SwapInstrument) {
            return ((SwapInstrument) bizInstrument).getCtType();
        }
        if (bizInstrument instanceof FutureInstrument) {
            return ((FutureInstrument) bizInstrument).getCtType();
        }
        return null;
    }

    public final java.lang.String AEQbTJ(BizInstrument bizInstrument) {
        if (Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "MARGIN")) {
            return bizInstrument.getQuoteSymbol();
        }
        return null;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        java.lang.String strCopydefault;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        return (interfaceC54581xNrCopydefault == null || (strCopydefault = interfaceC54581xNrCopydefault.copydefault(str)) == null) ? "" : strCopydefault;
    }

    public final java.lang.String copydefault(java.lang.String str) {
        java.lang.String strValueOf;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        return (interfaceC54581xNrCopydefault == null || (strValueOf = interfaceC54581xNrCopydefault.valueOf(str)) == null) ? "" : strValueOf;
    }

    public final java.lang.String copydefault(BizInstrument bizInstrument, java.lang.String str, java.lang.String str2) {
        if (!(bizInstrument instanceof SpotInstrument)) {
            return null;
        }
        SpotInstrument spotInstrument = (SpotInstrument) bizInstrument;
        java.lang.String level = spotInstrument.getLevel();
        java.lang.String str3 = C33129mqd.OLrzqt((java.lang.CharSequence) level) ? level : null;
        return str3 == null ? spotInstrument.getCoinLever() : str3;
    }

    public final void copydefault() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (WatchListData watchListData : this.AhwBna) {
            if (xUD.KWHzl(watchListData.getInstType(), watchListData.getInstId(), watchListData.getInstId(), watchListData.getAlias(), true) == null) {
                pUU.KWHzl("IWatchSource", "remove watch list " + watchListData.getInstId() + " " + watchListData.getAlias());
                arrayList.add(watchListData);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.AhwBna.remove((WatchListData) it.next());
        }
        if (this.AhwBna.isEmpty()) {
            ThreadUtils.copydefault(new java.lang.Runnable() { // from class: o.xTP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    xTS.copydefault(this.EZpvd);
                }
            });
        }
    }

    public static final void copydefault(xTS xts) {
        C41436qql<?> c41436qqlAEQbTJ;
        C41435qqk<?, MarketDataSource> c41435qqk = xts.values;
        if (c41435qqk == null || (c41436qqlAEQbTJ = c41435qqk.AEQbTJ(yDY.AhwBna())) == null) {
            return;
        }
        c41436qqlAEQbTJ.copydefault();
    }

    public final boolean copydefault(WatchListData watchListData) {
        if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "FUTURES")) {
            AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl("FUTURES");
            xLC xlc = abstractC54531xLwKWHzl instanceof xLC ? (xLC) abstractC54531xLwKWHzl : null;
            FutureInstrument futureInstrumentValueOf = xlc != null ? xlc.valueOf(watchListData.getInstId(), watchListData.getAlias()) : null;
            if (futureInstrumentValueOf != null) {
                return futureInstrumentValueOf.isNewTag();
            }
        } else if (!Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "OPTION")) {
            if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "COIN")) {
                InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
                if (interfaceC54581xNrCopydefault != null) {
                    return interfaceC54581xNrCopydefault.EZpvd(watchListData.getInstId());
                }
            } else {
                BizInstrument watchMarketInstrument$default = xUD.getWatchMarketInstrument$default(watchListData.getInstType(), watchListData.getInstId(), null, null, false, 28, null);
                if (watchMarketInstrument$default != null) {
                    return watchMarketInstrument$default.isNewTag();
                }
            }
        }
        return false;
    }

    public final boolean KWHzl(WatchListData watchListData) {
        if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "FUTURES")) {
            AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl("FUTURES");
            xLC xlc = abstractC54531xLwKWHzl instanceof xLC ? (xLC) abstractC54531xLwKWHzl : null;
            FutureInstrument futureInstrumentValueOf = xlc != null ? xlc.valueOf(watchListData.getInstId(), watchListData.getAlias()) : null;
            if (futureInstrumentValueOf != null) {
                return futureInstrumentValueOf.isNewLabel();
            }
        } else if (!Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "OPTION")) {
            if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "COIN")) {
                InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
                if (interfaceC54581xNrCopydefault != null) {
                    return interfaceC54581xNrCopydefault.KWHzl(watchListData.getInstId());
                }
            } else {
                BizInstrument watchMarketInstrument$default = xUD.getWatchMarketInstrument$default(watchListData.getInstType(), watchListData.getInstId(), null, null, false, 28, null);
                if (watchMarketInstrument$default != null) {
                    return watchMarketInstrument$default.isNewLabel();
                }
            }
        }
        return false;
    }

    public final java.util.HashMap<java.lang.String, TickersData> KWHzl() {
        ConcurrentHashMap<java.lang.String, TickersData> concurrentHashMapEZpvd;
        xTG xtg = this.AkhnZx;
        if (xtg == null || (concurrentHashMapEZpvd = xtg.EZpvd()) == null) {
            return null;
        }
        return new java.util.HashMap<>(concurrentHashMapEZpvd);
    }

    public final java.util.HashMap<java.lang.String, TickersData> ejfBZ() {
        ConcurrentHashMap<java.lang.String, TickersData> concurrentHashMapAEQbTJ;
        xTG xtg = this.AkhnZx;
        if (xtg == null || (concurrentHashMapAEQbTJ = xtg.AEQbTJ()) == null) {
            return null;
        }
        return new java.util.HashMap<>(concurrentHashMapAEQbTJ);
    }

    public static /* synthetic */ java.util.List commitCoinList$default(xTS xts, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: commitCoinList");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return xts.OLrzqt((java.util.List<CoinQuote>) list, z);
    }

    public final java.util.List<WatchListData> OLrzqt(java.util.List<CoinQuote> list, boolean z) {
        C43296rmc.AEQbTJ("WatchList", "commitCoinList() called with, forGroup = " + z);
        if (list == null || list.isEmpty() || list.size() > this.AhwBna.size()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (CoinQuote coinQuote : list) {
            WatchListData watchListData = this.fetchVPNInfo.get(coinQuote.getInstId() + coinQuote.getInstType());
            if (watchListData == null) {
                BizInstrument watchMarketInstrument$default = xUD.getWatchMarketInstrument$default(coinQuote.getInstId(), coinQuote.getInstType(), null, null, false, 28, null);
                if (watchMarketInstrument$default != null) {
                    xUV xuv = xUV.EZpvd;
                    java.lang.String strOLrzqt = xuv.OLrzqt(watchMarketInstrument$default);
                    java.lang.String strKWHzl = xuv.KWHzl(watchMarketInstrument$default);
                    java.lang.String strCopydefault = xuv.copydefault(watchMarketInstrument$default);
                    java.lang.String str = strCopydefault == null ? "" : strCopydefault;
                    java.lang.String strAEQbTJ = xuv.AEQbTJ(watchMarketInstrument$default);
                    if (strAEQbTJ == null) {
                        strAEQbTJ = "";
                    }
                    watchListData = new WatchListData(str, strAEQbTJ, strKWHzl, strOLrzqt, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null);
                } else {
                    watchListData = null;
                }
            }
            if (watchListData != null) {
                arrayList.add(watchListData);
            }
        }
        return qWL.copydefault.copydefault(arrayList, this.AhwBna, z);
    }

    public final java.util.List<WatchListData> KWHzl(@NotNull CoinQuote coinQuote) {
        WatchListData watchListData;
        Intrinsics.checkNotNullParameter(coinQuote, "");
        C43296rmc.AEQbTJ("WatchList", "bringTop() called with, forGroup = true");
        WatchListData watchListData2 = this.fetchVPNInfo.get(coinQuote.getInstId() + coinQuote.getInstType());
        if (watchListData2 == null) {
            BizInstrument bizInstrumentAEQbTJ = AEQbTJ(coinQuote.getInstId(), coinQuote.getInstType(), true);
            if (bizInstrumentAEQbTJ != null) {
                xUV xuv = xUV.EZpvd;
                java.lang.String strOLrzqt = xuv.OLrzqt(bizInstrumentAEQbTJ);
                java.lang.String strKWHzl = xuv.KWHzl(bizInstrumentAEQbTJ);
                java.lang.String strCopydefault = xuv.copydefault(bizInstrumentAEQbTJ);
                java.lang.String str = strCopydefault == null ? "" : strCopydefault;
                java.lang.String strAEQbTJ = xuv.AEQbTJ(bizInstrumentAEQbTJ);
                watchListData = new WatchListData(str, strAEQbTJ == null ? "" : strAEQbTJ, strKWHzl, strOLrzqt, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null);
            } else {
                watchListData = null;
            }
            watchListData2 = watchListData;
            if (watchListData2 == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(this.AhwBna);
                return arrayList;
            }
        }
        CopyOnWriteArrayList<WatchListData> copyOnWriteArrayList = this.AhwBna;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : copyOnWriteArrayList) {
            WatchListData watchListData3 = (WatchListData) obj;
            Intrinsics.copydefault(watchListData3);
            if (Intrinsics.EZpvd((java.lang.Object) qWJ.OLrzqt(watchListData3), (java.lang.Object) qWJ.OLrzqt(coinQuote))) {
                arrayList2.add(obj);
            }
        }
        java.util.List<WatchListData> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList2);
        listFJNWhG.remove(watchListData2);
        listFJNWhG.add(0, watchListData2);
        return qWL.copydefault.copydefault(listFJNWhG, this.AhwBna, true);
    }

    public final int AEQbTJ(@NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        WatchListData watchListData = this.fetchVPNInfo.get(coinQuote.getInstId() + coinQuote.getInstType());
        if (watchListData == null) {
            BizInstrument bizInstrumentAEQbTJ = AEQbTJ(coinQuote.getInstId(), coinQuote.getInstType(), true);
            if (bizInstrumentAEQbTJ != null) {
                xUV xuv = xUV.EZpvd;
                java.lang.String strOLrzqt = xuv.OLrzqt(bizInstrumentAEQbTJ);
                java.lang.String strKWHzl = xuv.KWHzl(bizInstrumentAEQbTJ);
                java.lang.String strCopydefault = xuv.copydefault(bizInstrumentAEQbTJ);
                java.lang.String str = strCopydefault == null ? "" : strCopydefault;
                java.lang.String strAEQbTJ = xuv.AEQbTJ(bizInstrumentAEQbTJ);
                watchListData = new WatchListData(str, strAEQbTJ == null ? "" : strAEQbTJ, strKWHzl, strOLrzqt, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null);
            } else {
                watchListData = null;
            }
        }
        return this.AhwBna.indexOf(watchListData);
    }

    public final void iwGUEr() {
        this.djBIcL.dispose();
    }

    @Override // o.AbstractC54646xQb
    public void valueOf() {
        Unit unit;
        super.valueOf();
        iwGUEr();
        try {
            Result.Application application = Result.Companion;
            InterfaceC58217yxC interfaceC58217yxC = this.fARcdN;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            InterfaceC58217yxC interfaceC58217yxC2 = this.isConnected;
            if (interfaceC58217yxC2 != null) {
                interfaceC58217yxC2.dispose();
            }
            InterfaceC58217yxC interfaceC58217yxC3 = this.fJNWhG;
            if (interfaceC58217yxC3 != null) {
                interfaceC58217yxC3.dispose();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Job job = this.AEQbTJ;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }
}
