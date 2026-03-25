package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.core.util.SPUtils;
import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.CountDownType;
import com.okinc.unify_trade.biz.subscribe.TickerDataGroup;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.trade.source.SearchTradeBizInfo;
import com.okinc.unify_trade.trade.source.search.BaseTradeSearchLoader$init$1$1$1;
import com.okinc.unify_trade.trade.source.search.BaseTradeSearchLoader$initBiz$1;
import com.okinc.unify_trade.trade.source.search.TradeSearchGroup;
import java.util.Objects;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public abstract class xRQ {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public volatile int AhwBna;
    public boolean AkhnZx;
    public final java.util.ArrayList<MutableLiveData<Unit>> DbNXlk;
    public final java.util.List<kotlin.Pair<java.lang.Long, java.lang.String>> KWHzl;
    public int OLrzqt;
    public Function1<? super BizInstrument, java.lang.Boolean> copydefault;
    public java.util.List<java.lang.String> djBIcL;
    public boolean ejfBZ;
    public MutableLiveData<xRQ> fIwbmz;
    public Function1<? super java.lang.Integer, Unit> gEmmrt;
    public final java.lang.String AuCTel = "trade_search_history";
    public InterfaceC54647xQc AEQbTJ = qVD.AEQbTJ.OLrzqt();
    public java.util.ArrayList<SearchTradeBizInfo> isConnected = new java.util.ArrayList<>();
    public final java.util.ArrayList<BizInstrument> valueOf = new java.util.ArrayList<>();
    public final android.util.ArrayMap<java.lang.String, TickersData> AYXKKw = new android.util.ArrayMap<>();
    public C58216yxB fetchVPNInfo = new C58216yxB();
    public final int values = 20;
    public CoroutineScope fJNWhG = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super BizInstrument, java.lang.Boolean> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<BizInstrument> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.gEmmrt = function1;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xRQ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public xRQ() {
        KWHzl().OLrzqt(new Function0() { // from class: o.xSb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xRQ.EZpvd(this.copydefault);
            }
        });
        this.DbNXlk = new java.util.ArrayList<>();
        this.KWHzl = new java.util.ArrayList();
    }

    public final InterfaceC54647xQc KWHzl() {
        if (this.AEQbTJ.bI_()) {
            return this.AEQbTJ;
        }
        InterfaceC54647xQc interfaceC54647xQcOLrzqt = qVD.AEQbTJ.OLrzqt();
        this.AEQbTJ = interfaceC54647xQcOLrzqt;
        return interfaceC54647xQcOLrzqt;
    }

    public static /* synthetic */ void init$default(xRQ xrq, java.util.List list, MutableLiveData mutableLiveData, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        xrq.EZpvd((java.util.List<java.lang.String>) list, (MutableLiveData<xRQ>) mutableLiveData, z, z2);
    }

    public void EZpvd(@NotNull final java.util.List<java.lang.String> list, @NotNull final MutableLiveData<xRQ> mutableLiveData, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.ejfBZ = z;
        this.AkhnZx = z2;
        try {
            Result.Application application = Result.Companion;
            copydefault(new Function1() { // from class: o.xRU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return xRQ.EZpvd(this.KWHzl, list, mutableLiveData, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("UPDATE_NEW_COIN_UI");
        final Function1 function1 = new Function1() { // from class: o.xRT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xRQ.EZpvd(this.OLrzqt, (java.lang.String) obj);
            }
        };
        this.fetchVPNInfo.AEQbTJ(abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.xSc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xRQ.gEmmrt(function1, obj);
            }
        }));
    }

    public static final Unit EZpvd(xRQ xrq, java.util.List list, MutableLiveData mutableLiveData, boolean z) {
        xrq.AEQbTJ();
        xrq.djBIcL = list;
        java.util.ArrayList arrayList = SPUtils.getArrayList(xrq.AuCTel, SearchTradeBizInfo.class);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        if (arrayList.size() != 0) {
            xrq.isConnected.addAll(arrayList);
        }
        xrq.fIwbmz = mutableLiveData;
        xrq.OLrzqt = list.size();
        if (!CoroutineScopeKt.isActive(xrq.fJNWhG)) {
            xrq.fJNWhG = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        }
        BuildersKt__Builders_commonKt.launch$default(xrq.fJNWhG, null, null, new BaseTradeSearchLoader$init$1$1$1(list, xrq, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(xRQ xrq, java.lang.String str) {
        Function1<? super java.lang.Integer, Unit> function1 = xrq.gEmmrt;
        if (function1 != null) {
            function1.invoke(-1);
        }
        xrq.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(xRQ xrq) {
        Objects.toString(xrq.gEmmrt);
        Objects.toString(xrq.gEmmrt);
        Function1<? super java.lang.Integer, Unit> function1 = xrq.gEmmrt;
        if (function1 != null) {
            function1.invoke(-1);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        BaseTradeSearchLoader$initBiz$1 baseTradeSearchLoader$initBiz$1;
        xRQ xrq;
        AbstractC54531xLw abstractC54531xLw;
        if (continuation instanceof BaseTradeSearchLoader$initBiz$1) {
            baseTradeSearchLoader$initBiz$1 = (BaseTradeSearchLoader$initBiz$1) continuation;
            int i = baseTradeSearchLoader$initBiz$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseTradeSearchLoader$initBiz$1.label = i - Integer.MIN_VALUE;
            } else {
                baseTradeSearchLoader$initBiz$1 = new BaseTradeSearchLoader$initBiz$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = baseTradeSearchLoader$initBiz$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = baseTradeSearchLoader$initBiz$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            if (interfaceC54581xNrOLrzqt == null) {
                xrq = this;
                abstractC54531xLw = null;
                if (abstractC54531xLw != null) {
                    MutableLiveData<xRQ> mutableLiveData = xrq.fIwbmz;
                    if (mutableLiveData != null) {
                        mutableLiveData.postValue(null);
                    }
                } else {
                    xrq.AhwBna++;
                    if (xrq.AhwBna == xrq.OLrzqt) {
                        xrq.copydefault();
                        MutableLiveData<xRQ> mutableLiveData2 = xrq.fIwbmz;
                        if (mutableLiveData2 != null) {
                            mutableLiveData2.postValue(xrq);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            baseTradeSearchLoader$initBiz$1.L$0 = this;
            baseTradeSearchLoader$initBiz$1.label = 1;
            objEZpvd = interfaceC54581xNrOLrzqt.EZpvd(str, baseTradeSearchLoader$initBiz$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            xrq = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xrq = (xRQ) baseTradeSearchLoader$initBiz$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        abstractC54531xLw = (AbstractC54531xLw) objEZpvd;
        if (abstractC54531xLw != null) {
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(Function1<? super java.lang.Boolean, Unit> function1) {
        KWHzl().AEQbTJ(function1);
    }

    public static final class Application implements InterfaceC55701xos<java.util.List<? extends TickerDataGroup>> {
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<TickerDataGroup> list, java.lang.Exception exc) {
            if (z) {
                xRQ.this.KWHzl(list);
                Function1 function1 = xRQ.this.gEmmrt;
                if (function1 != null) {
                    function1.invoke(-1);
                }
            }
        }
    }

    public final void AEQbTJ() {
        C55692xoj.KWHzl.AEQbTJ(new Application());
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault() {
        java.util.ArrayList arrayList;
        java.util.List listAhwBna;
        CountDownInfo countDownInfo;
        java.lang.Boolean boolValueOf;
        java.util.List<BizInstrument> listAhwBna2;
        this.KWHzl.clear();
        java.util.List<java.lang.String> list = this.djBIcL;
        if (list != null) {
            for (java.lang.String str : list) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
                AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(str) : null;
                if (this.AkhnZx) {
                    if (abstractC54531xLwOLrzqt == null || (listAhwBna2 = C55608xnE.AEQbTJ(abstractC54531xLwOLrzqt)) == null) {
                        listAhwBna2 = yDY.AhwBna();
                    }
                    arrayList = new java.util.ArrayList(listAhwBna2);
                } else {
                    arrayList = new java.util.ArrayList();
                }
                if (abstractC54531xLwOLrzqt == null || (listAhwBna = C55608xnE.queryBizList$default(abstractC54531xLwOLrzqt, false, 1, null)) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                arrayList.addAll(listAhwBna);
                java.util.List<BizInstrument> listEZpvd = C41428qqd.OLrzqt.EZpvd(arrayList);
                if (listEZpvd == null) {
                    listEZpvd = yDY.AhwBna();
                }
                if (abstractC54531xLwOLrzqt instanceof xLL) {
                    java.util.ArrayList<BizInstrument> arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : listEZpvd) {
                        if (((BizInstrument) obj).getCountDownInfo() != null) {
                            arrayList2.add(obj);
                        }
                    }
                    for (BizInstrument bizInstrument : arrayList2) {
                        try {
                            Result.Application application = Result.Companion;
                            CountDownInfo countDownInfo2 = bizInstrument.getCountDownInfo();
                            if (countDownInfo2 == null) {
                                boolValueOf = null;
                                Result.m7377constructorimpl(boolValueOf);
                            } else {
                                if (C33129mqd.valueOf(countDownInfo2.getOnlineTime()) <= java.lang.System.currentTimeMillis()) {
                                    countDownInfo2 = null;
                                }
                                if (countDownInfo2 != null) {
                                    boolValueOf = java.lang.Boolean.valueOf(this.KWHzl.add(C56390yDp.OLrzqt(java.lang.Long.valueOf(C33129mqd.valueOf(countDownInfo2.getOnlineTime()) - java.lang.System.currentTimeMillis()), countDownInfo2.getInstId())));
                                }
                                Result.m7377constructorimpl(boolValueOf);
                            }
                        } catch (java.lang.Throwable th) {
                            Result.Application application2 = Result.Companion;
                            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        }
                    }
                }
                if (C33129mqd.KWHzl((java.util.Collection) listEZpvd)) {
                    java.util.ArrayList<BizInstrument> arrayList3 = this.valueOf;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : listEZpvd) {
                        BizInstrument bizInstrument2 = (BizInstrument) obj2;
                        if (this.ejfBZ) {
                            CountDownInfo countDownInfo3 = bizInstrument2.getCountDownInfo();
                            if ((countDownInfo3 != null ? countDownInfo3.getShowType() : null) != CountDownType.SHOW_CANCEL) {
                                arrayList4.add(obj2);
                            }
                        } else if (bizInstrument2.getCountDownInfo() == null || ((countDownInfo = bizInstrument2.getCountDownInfo()) != null && countDownInfo.countDownTimeExpire())) {
                            arrayList4.add(obj2);
                        }
                    }
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    for (java.lang.Object obj3 : arrayList4) {
                        BizInstrument bizInstrument3 = (BizInstrument) obj3;
                        Function1<? super BizInstrument, java.lang.Boolean> function1 = this.copydefault;
                        if (function1 == null || function1.invoke(bizInstrument3).booleanValue()) {
                            arrayList5.add(obj3);
                        }
                    }
                    arrayList3.addAll(arrayList5);
                }
            }
        }
        if (!this.KWHzl.isEmpty()) {
            java.util.Iterator<T> it = this.KWHzl.iterator();
            while (it.hasNext()) {
                kotlin.Pair pair = (kotlin.Pair) it.next();
                if (!this.fetchVPNInfo.isDisposed()) {
                    AbstractC58260yxt<java.lang.Long> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(((java.lang.Number) pair.getFirst()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
                    final Function1 function12 = new Function1() { // from class: o.xRR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj4) {
                            return xRQ.EZpvd(this.AEQbTJ, (java.lang.Long) obj4);
                        }
                    };
                    InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xRX
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj4) {
                            xRQ.KWHzl(function12, obj4);
                        }
                    };
                    final Function1 function13 = new Function1() { // from class: o.xRW
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj4) {
                            return xRQ.AEQbTJ((java.lang.Throwable) obj4);
                        }
                    };
                    this.fetchVPNInfo.AEQbTJ(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xRV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj4) {
                            xRQ.OLrzqt(function13, obj4);
                        }
                    }));
                }
            }
        }
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(xRQ xrq, java.lang.Long l) {
        Function1<? super java.lang.Integer, Unit> function1 = xrq.gEmmrt;
        if (function1 != null) {
            function1.invoke(-1);
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        pUU.AEQbTJ("TradeSearchLoader", "trade search loader count down load ticker", th);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.util.ArrayList getTradeSearchGroupList$default(xRQ xrq, java.lang.Boolean bool, java.lang.String str, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradeSearchGroupList");
        }
        if ((i & 1) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        return xrq.OLrzqt(bool, str, arrayList);
    }

    public final java.util.ArrayList<TradeSearchGroup> OLrzqt(java.lang.Boolean bool, @NotNull java.lang.String str, @NotNull java.util.ArrayList<TradeSearchGroup> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (!Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            return arrayList;
        }
        java.lang.Object objClone = arrayList.clone();
        Intrinsics.copydefault(objClone, "");
        java.util.ArrayList<TradeSearchGroup> arrayList2 = (java.util.ArrayList) objClone;
        int i = 0;
        TradeSearchGroup tradeSearchGroup = null;
        for (java.lang.Object obj : arrayList2) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            TradeSearchGroup tradeSearchGroup2 = (TradeSearchGroup) obj;
            if (Intrinsics.EZpvd((java.lang.Object) tradeSearchGroup2.getBizType(), (java.lang.Object) "OPTION")) {
                tradeSearchGroup = tradeSearchGroup2;
            }
            i++;
        }
        java.util.ArrayList<BizInstrument> bizInstList = tradeSearchGroup != null ? tradeSearchGroup.getBizInstList() : null;
        if (tradeSearchGroup != null) {
            arrayList2.remove(tradeSearchGroup);
        }
        if (C33129mqd.KWHzl((java.util.Collection) bizInstList)) {
            Intrinsics.copydefault(bizInstList, "");
            arrayList2.add(new TradeSearchGroup("OPTION", bizInstList));
        }
        return arrayList2;
    }

    public final void EZpvd() {
        java.util.Iterator<T> it = this.DbNXlk.iterator();
        while (it.hasNext()) {
            ((MutableLiveData) it.next()).postValue(Unit.INSTANCE);
        }
    }

    public final void KWHzl(java.util.List<TickerDataGroup> list) {
        synchronized (this) {
            if (list != null) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    java.util.List<TickersData> tickers = ((TickerDataGroup) it.next()).getTickers();
                    if (tickers != null) {
                        for (TickersData tickersData : tickers) {
                            this.AYXKKw.put(tickersData.getInstId(), tickersData);
                        }
                    }
                }
            }
        }
    }
}
