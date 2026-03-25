package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C54401xHa;
import o.C54407xHg;
import o.InterfaceC55702xot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xTh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54733xTh extends xGQ<java.lang.Object> implements xSY {
    public final boolean AEQbTJ;
    public final LinkedBlockingDeque<java.lang.String> AYXKKw;
    public AbstractC57556yke AhwBna;
    public C58216yxB AkhnZx;
    public final LinkedBlockingDeque<java.lang.String> AuCTel;
    public final java.util.List<BizInstrument> DbNXlk;
    public final MutableLiveData<SourceResp<java.lang.Object>> EZpvd;
    public final MutableLiveData<SourceResp<AbstractC54646xQb>> KWHzl;
    public C56131xwy OLrzqt;
    public volatile boolean copydefault;
    public AbstractC57556yke djBIcL;
    public final java.util.ArrayList<TickersData> ejfBZ;
    public java.util.HashMap<java.lang.String, TickersData> fARcdN;
    public final boolean fIwbmz;
    public AbstractC57556yke fJNWhG;
    public java.util.HashMap<java.lang.String, TickersData> fetchVPNInfo;
    public final java.util.ArrayList<TickersData> gEmmrt;
    public final Function2<java.lang.Boolean, java.lang.Exception, Unit> isConnected;
    public int valueOf;
    public AbstractC57556yke values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.unify_trade.biz.BizInstrument> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C54733xTh(@NotNull java.util.List<? extends BizInstrument> list, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2, MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, MutableLiveData<SourceResp<java.lang.Object>> mutableLiveData2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.DbNXlk = list;
        this.isConnected = function2;
        this.KWHzl = mutableLiveData;
        this.EZpvd = mutableLiveData2;
        this.AEQbTJ = z;
        this.fIwbmz = z2;
        this.AkhnZx = new C58216yxB();
        this.OLrzqt = new C56131xwy();
        this.fARcdN = new java.util.HashMap<>();
        this.fetchVPNInfo = new java.util.HashMap<>();
        this.AuCTel = new LinkedBlockingDeque<>();
        this.AYXKKw = new LinkedBlockingDeque<>();
        copydefault(new Function2() { // from class: o.xTm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C54733xTh.OLrzqt(this.EZpvd, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        });
        EZpvd(new Function2() { // from class: o.xTl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C54733xTh.AEQbTJ(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        });
        this.ejfBZ = new java.util.ArrayList<>();
        this.gEmmrt = new java.util.ArrayList<>();
    }

    public static final Unit OLrzqt(C54733xTh c54733xTh, boolean z, java.lang.Exception exc) {
        c54733xTh.OLrzqt(z, exc);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C54733xTh c54733xTh, boolean z, java.lang.Exception exc) {
        c54733xTh.OLrzqt(z, exc);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(boolean z, java.lang.Exception exc) {
        if (z) {
            this.valueOf++;
        } else {
            this.valueOf = 0;
            this.isConnected.invoke(java.lang.Boolean.TRUE, exc);
        }
        if (this.valueOf == 2) {
            this.valueOf = 0;
            this.copydefault = true;
            fJNWhG();
        }
    }

    /* JADX INFO: renamed from: o.xTh$Application */
    public static final class Application implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public final /* synthetic */ Function2<java.lang.Boolean, java.lang.Exception, Unit> AEQbTJ;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
            this.AEQbTJ = function2;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            C54733xTh.this.ejfBZ.clear();
            if (list != null) {
                C54733xTh.this.ejfBZ.addAll(list);
            }
            this.AEQbTJ.invoke(java.lang.Boolean.valueOf(z), exc);
        }
    }

    public final void copydefault(Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
        this.AkhnZx.AEQbTJ(InterfaceC55702xot.StateListAnimator.getMarketTickers$default(this.OLrzqt, "SPOT", null, new Application(function2), 2, null));
    }

    /* JADX INFO: renamed from: o.xTh$ActionBar */
    public static final class ActionBar implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public final /* synthetic */ Function2<java.lang.Boolean, java.lang.Exception, Unit> AEQbTJ;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
            this.AEQbTJ = function2;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            C54733xTh.this.gEmmrt.clear();
            if (list != null) {
                C54733xTh.this.gEmmrt.addAll(list);
            }
            this.AEQbTJ.invoke(java.lang.Boolean.valueOf(z), exc);
        }
    }

    public final void EZpvd(Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
        this.AkhnZx.AEQbTJ(this.OLrzqt.KWHzl(new ActionBar(function2)));
    }

    public final void values() {
        AbstractC57556yke abstractC57556ykeAEQbTJ = C54407xHg.Companion.AEQbTJ("tickers-3s", C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, false, null, 63, null), yDY.copydefault(new WsArgV5("tickers-3s", null, null, "SPOT", null, null, null, null, 246, null)), new Function2() { // from class: o.xTt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C54733xTh.gEmmrt(this.AEQbTJ, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        });
        this.fJNWhG = abstractC57556ykeAEQbTJ;
        if (abstractC57556ykeAEQbTJ != null) {
            abstractC57556ykeAEQbTJ.AhwBna();
        }
    }

    public static final Unit gEmmrt(C54733xTh c54733xTh, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        c54733xTh.AuCTel.put(oKIncomingData.getPayload().toString());
        c54733xTh.copydefault = true;
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        if (this.fIwbmz) {
            java.util.Iterator<T> it = this.DbNXlk.iterator();
            while (it.hasNext()) {
                linkedHashSet2.add(((BizInstrument) it.next()).getQuoteSymbol());
            }
        } else {
            java.util.Iterator<T> it2 = this.DbNXlk.iterator();
            while (it2.hasNext()) {
                linkedHashSet2.add(((BizInstrument) it2.next()).getTradeSymbol());
            }
        }
        C43296rmc.EZpvd("spotDataTask", "create cup ccy: " + linkedHashSet2 + " ");
        java.util.Iterator it3 = linkedHashSet2.iterator();
        while (it3.hasNext()) {
            linkedHashSet.add(new WsArgV5("cup-tickers-3s", null, null, null, (java.lang.String) it3.next(), null, null, null, 238, null));
        }
        AbstractC57556yke abstractC57556ykeAEQbTJ = C54407xHg.Companion.AEQbTJ("cup-tickers-3s", C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, false, null, 63, null), new java.util.ArrayList<>(linkedHashSet), new Function2() { // from class: o.xTy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C54733xTh.djBIcL(this.AEQbTJ, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        });
        this.values = abstractC57556ykeAEQbTJ;
        if (abstractC57556ykeAEQbTJ != null) {
            abstractC57556ykeAEQbTJ.AhwBna();
        }
    }

    public static final Unit djBIcL(C54733xTh c54733xTh, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        c54733xTh.AYXKKw.put(oKIncomingData.getPayload().toString());
        return Unit.INSTANCE;
    }

    @Override // o.xSY
    public void EZpvd() {
        final Ref.IntRef intRef = new Ref.IntRef();
        copydefault(new Function2() { // from class: o.xTz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C54733xTh.AEQbTJ(intRef, this, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        });
        EZpvd(new Function2() { // from class: o.xTx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C54733xTh.OLrzqt(intRef, this, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        });
    }

    public static final Unit AEQbTJ(Ref.IntRef intRef, C54733xTh c54733xTh, boolean z, java.lang.Exception exc) {
        if (!z) {
            intRef.element = 0;
        } else {
            intRef.element++;
        }
        if (intRef.element == 2) {
            c54733xTh.copydefault = true;
            pUU.EZpvd("SpotDataTask", "getSpotTickerHttp -- " + intRef.element);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Ref.IntRef intRef, C54733xTh c54733xTh, boolean z, java.lang.Exception exc) {
        if (!z) {
            intRef.element = 0;
        } else {
            intRef.element++;
        }
        if (intRef.element == 2) {
            c54733xTh.copydefault = true;
            pUU.EZpvd("SpotDataTask", "getCupTickerHttp -- " + intRef.element);
        }
        return Unit.INSTANCE;
    }

    @Override // o.xSY
    public void AEQbTJ(@NotNull java.util.List<? extends BizInstrument> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        if (this.AEQbTJ) {
            DbNXlk();
            java.util.ArrayList<? extends InterfaceC57559ykh> arrayList = new java.util.ArrayList<>();
            java.util.List listQfsBiF = CollectionsKt___CollectionsKt.QfsBiF(list);
            int i3 = 0;
            for (java.lang.Object obj : listQfsBiF) {
                if (i3 < 0) {
                    yDY.AYXKKw();
                }
                BizInstrument bizInstrument = (BizInstrument) obj;
                if (i <= i3 && i3 <= i2) {
                    arrayList.add(new WsArgV5("tickers-3s", bizInstrument.getInstId(), null, null, null, null, null, null, 252, null));
                }
                i3++;
            }
            C57567ykp v5Connection$default = C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, false, null, 63, null);
            AbstractC57556yke abstractC57556ykeAEQbTJ = C54407xHg.Companion.AEQbTJ("tickers-3s", v5Connection$default, arrayList, new Function2() { // from class: o.xTo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C54733xTh.OLrzqt(this.copydefault, (AbstractC33132mqg) obj2, (OKIncomingData) obj3);
                }
            });
            this.djBIcL = abstractC57556ykeAEQbTJ;
            if (abstractC57556ykeAEQbTJ != null) {
                abstractC57556ykeAEQbTJ.AhwBna();
            }
            java.util.ArrayList<? extends InterfaceC57559ykh> arrayList2 = new java.util.ArrayList<>();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i4 = 0;
            for (java.lang.Object obj2 : listQfsBiF) {
                if (i4 < 0) {
                    yDY.AYXKKw();
                }
                BizInstrument bizInstrument2 = (BizInstrument) obj2;
                if (i <= i4 && i4 <= i2) {
                    if (this.fIwbmz) {
                        linkedHashSet.add(bizInstrument2.getQuoteSymbol());
                    } else {
                        linkedHashSet.add(bizInstrument2.getTradeSymbol());
                    }
                }
                i4++;
            }
            C43296rmc.EZpvd("spotDataTask", "area cup ccy " + linkedHashSet);
            java.util.Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList2.add(new WsArgV5("cup-tickers-3s", null, null, null, (java.lang.String) it.next(), null, null, null, 238, null));
            }
            AbstractC57556yke abstractC57556ykeAEQbTJ2 = C54407xHg.Companion.AEQbTJ("cup-tickers-3s", v5Connection$default, arrayList2, new Function2() { // from class: o.xTp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return C54733xTh.AYXKKw(this.copydefault, (AbstractC33132mqg) obj3, (OKIncomingData) obj4);
                }
            });
            this.AhwBna = abstractC57556ykeAEQbTJ2;
            if (abstractC57556ykeAEQbTJ2 != null) {
                abstractC57556ykeAEQbTJ2.AhwBna();
            }
            pUU.EZpvd("SpotDataTask", " bindArea  size : " + arrayList.size() + "  " + arrayList2.size() + " start :" + i + "  end :" + i2);
        }
    }

    public static final Unit OLrzqt(C54733xTh c54733xTh, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        pUU.EZpvd("SpotDataTask", "----->> receive data : " + oKIncomingData);
        c54733xTh.AuCTel.put(oKIncomingData.getPayload().toString());
        c54733xTh.copydefault = true;
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C54733xTh c54733xTh, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        pUU.EZpvd("SpotDataTask", "----->> receive data : " + oKIncomingData);
        c54733xTh.AYXKKw.put(oKIncomingData.getPayload().toString());
        c54733xTh.copydefault = true;
        return Unit.INSTANCE;
    }

    @Override // o.xSY
    public void OLrzqt() {
        if (this.AEQbTJ) {
            this.AuCTel.clear();
            this.AYXKKw.clear();
            DbNXlk();
            values();
            djBIcL();
        }
    }

    public final void gEmmrt() throws java.lang.InterruptedException {
        while (!this.AuCTel.isEmpty()) {
            java.lang.String strTake = this.AuCTel.take();
            Intrinsics.checkNotNullExpressionValue(strTake, "");
            OLrzqt(strTake);
        }
    }

    public final void valueOf() throws java.lang.InterruptedException {
        while (!this.AYXKKw.isEmpty()) {
            java.lang.String strTake = this.AYXKKw.take();
            Intrinsics.checkNotNullExpressionValue(strTake, "");
            EZpvd(strTake);
        }
    }

    public final void OLrzqt(java.lang.String str) {
        TickersData tickersDataOLrzqt = TickersData.Companion.OLrzqt(str);
        if (tickersDataOLrzqt != null) {
            this.fARcdN.put(tickersDataOLrzqt.getInstId(), tickersDataOLrzqt);
            pUU.EZpvd("SpotDataTask", "parseTickers " + tickersDataOLrzqt.getInstId());
        }
    }

    public final void EZpvd(java.lang.String str) {
        TickersData tickersDataOLrzqt = TickersData.Companion.OLrzqt(str);
        if (tickersDataOLrzqt != null) {
            this.fetchVPNInfo.put(tickersDataOLrzqt.getCcy(), tickersDataOLrzqt);
        }
    }

    private final void fJNWhG() {
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, this.AEQbTJ ? 2000L : 700L, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.xTg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54733xTh.KWHzl(this.OLrzqt, (java.lang.Long) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgInterval.map(new InterfaceC58229yxO() { // from class: o.xTn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C54733xTh.KWHzl(function1, obj);
            }
        }).observeOn(yBP.KWHzl());
        final Function1 function12 = new Function1() { // from class: o.xTu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54733xTh.KWHzl(this.OLrzqt, (java.lang.Boolean) obj);
            }
        };
        AbstractC58247yxg map = abstractC58247yxgObserveOn.map(new InterfaceC58229yxO() { // from class: o.xTq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C54733xTh.AEQbTJ(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.xTr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54733xTh.AEQbTJ(this.EZpvd, (java.lang.Boolean) obj);
            }
        };
        this.AkhnZx.OLrzqt(map.subscribe(new InterfaceC58227yxM() { // from class: o.xTs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54733xTh.AYXKKw(function13, obj);
            }
        }));
    }

    public static final java.lang.Boolean KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean KWHzl(C54733xTh c54733xTh, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return java.lang.Boolean.valueOf(c54733xTh.copydefault);
    }

    public static final java.lang.Boolean AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean KWHzl(C54733xTh c54733xTh, java.lang.Boolean bool) throws java.lang.InterruptedException {
        boolean z;
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            z = true;
            if (!c54733xTh.AuCTel.isEmpty()) {
                c54733xTh.gEmmrt();
            }
            if (!c54733xTh.AYXKKw.isEmpty()) {
                c54733xTh.valueOf();
            }
            if (!c54733xTh.ejfBZ.isEmpty()) {
                c54733xTh.fetchVPNInfo();
            }
            if (!c54733xTh.gEmmrt.isEmpty()) {
                c54733xTh.isConnected();
            }
        } else {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C54733xTh c54733xTh, java.lang.Boolean bool) {
        if (c54733xTh.KWHzl()) {
            c54733xTh.AEQbTJ();
        }
        if (c54733xTh.copydefault) {
            pUU.EZpvd("SpotDataTask", "------------------SpotDataTask>update");
            c54733xTh.copydefault = false;
            if (!c54733xTh.AEQbTJ) {
                c54733xTh.AkhnZx.dispose();
            }
            c54733xTh.isConnected.invoke(java.lang.Boolean.TRUE, null);
        }
        return Unit.INSTANCE;
    }

    public final boolean KWHzl() {
        MutableLiveData<SourceResp<java.lang.Object>> mutableLiveData;
        MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData2 = this.KWHzl;
        return mutableLiveData2 == null ? (mutableLiveData = this.EZpvd) == null || !mutableLiveData.hasActiveObservers() : !mutableLiveData2.hasActiveObservers();
    }

    @Override // o.xSY
    public void AEQbTJ() {
        this.AkhnZx.dispose();
        DbNXlk();
    }

    @Override // o.xSY
    public TickersData copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.fARcdN.get(str);
    }

    @Override // o.xSY
    public TickersData KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TickersData tickersData = this.fetchVPNInfo.get(str);
        return (tickersData == null && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "USD")) ? qTI.Companion.KWHzl() : tickersData;
    }

    @Override // o.xSY
    public boolean copydefault() {
        return this.fARcdN.size() > 0;
    }

    public void DbNXlk() {
        pUU.EZpvd("SpotDataTask", "------------------>destroy");
        C54407xHg.StateListAnimator stateListAnimator = C54407xHg.Companion;
        stateListAnimator.EZpvd("tickers-3s", this.fJNWhG);
        AbstractC57556yke abstractC57556yke = this.fJNWhG;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        stateListAnimator.EZpvd("cup-tickers-3s", this.values);
        AbstractC57556yke abstractC57556yke2 = this.values;
        if (abstractC57556yke2 != null) {
            abstractC57556yke2.djBIcL();
        }
        stateListAnimator.EZpvd("tickers-3s", this.djBIcL);
        AbstractC57556yke abstractC57556yke3 = this.djBIcL;
        if (abstractC57556yke3 != null) {
            abstractC57556yke3.djBIcL();
        }
        stateListAnimator.EZpvd("cup-tickers-3s", this.AhwBna);
        AbstractC57556yke abstractC57556yke4 = this.AhwBna;
        if (abstractC57556yke4 != null) {
            abstractC57556yke4.djBIcL();
        }
    }

    public final void fetchVPNInfo() {
        for (TickersData tickersData : this.ejfBZ) {
            this.fARcdN.put(tickersData.getInstId(), tickersData);
        }
        this.ejfBZ.clear();
    }

    public final void isConnected() {
        for (TickersData tickersData : this.gEmmrt) {
            this.fetchVPNInfo.put(tickersData.getCcy(), tickersData);
        }
        this.gEmmrt.clear();
    }
}
