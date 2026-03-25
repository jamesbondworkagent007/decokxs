package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C54401xHa;
import o.C54407xHg;
import o.InterfaceC55702xot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class xSN extends xGQ<java.lang.Object> implements InterfaceC54726xTa {
    public final boolean AEQbTJ;
    public final java.lang.String AYXKKw;
    public C58216yxB AhwBna;
    public AbstractC57556yke AkhnZx;
    public java.util.HashMap<java.lang.String, TickersData> DbNXlk;
    public boolean EZpvd;
    public final MutableLiveData<SourceResp<AbstractC54646xQb>> KWHzl;
    public volatile boolean OLrzqt;
    public AbstractC57556yke copydefault;
    public int djBIcL;
    public final java.util.List<BizInstrument> fetchVPNInfo;
    public C56131xwy gEmmrt;
    public java.util.HashMap<java.lang.String, TickersData> valueOf;
    public final Function2<java.lang.Boolean, java.lang.Exception, Unit> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54726xTa
    public boolean copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.unify_trade.biz.BizInstrument> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public xSN(@NotNull java.lang.String str, @NotNull java.util.List<? extends BizInstrument> list, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2, @NotNull MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.AYXKKw = str;
        this.fetchVPNInfo = list;
        this.values = function2;
        this.KWHzl = mutableLiveData;
        this.AEQbTJ = z;
        this.AhwBna = new C58216yxB();
        this.gEmmrt = new C56131xwy();
        this.DbNXlk = new java.util.HashMap<>();
        this.valueOf = new java.util.HashMap<>();
        EZpvd(new Function2() { // from class: o.xSV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return xSN.OLrzqt(this.copydefault, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        });
        OLrzqt(new Function2() { // from class: o.xSR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return xSN.copydefault(this.copydefault, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        });
    }

    public static final Unit OLrzqt(xSN xsn, boolean z, java.lang.Exception exc) {
        xsn.copydefault(z, exc);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(xSN xsn, boolean z, java.lang.Exception exc) {
        xsn.copydefault(z, exc);
        return Unit.INSTANCE;
    }

    public static final class Activity implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public final /* synthetic */ Function2<java.lang.Boolean, java.lang.Exception, Unit> AEQbTJ;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
            this.AEQbTJ = function2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Exception] */
        @Override // o.InterfaceC55701xos
        public /* bridge */ /* synthetic */ void EZpvd(boolean z, java.util.List<? extends TickersData> list, java.lang.Exception exc) {
            EZpvd2(z, (java.util.List<TickersData>) list, exc);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            xSN.this.copydefault(list);
            this.AEQbTJ.invoke(java.lang.Boolean.valueOf(z), exc);
        }
    }

    public final void EZpvd(Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
        this.AhwBna.AEQbTJ(InterfaceC55702xot.StateListAnimator.getMarketTickers$default(this.gEmmrt, this.AYXKKw, null, new Activity(function2), 2, null));
    }

    public static final class Application implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public final /* synthetic */ Function2<java.lang.Boolean, java.lang.Exception, Unit> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
            this.OLrzqt = function2;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            xSN.this.OLrzqt(list);
            this.OLrzqt.invoke(java.lang.Boolean.valueOf(z), exc);
        }
    }

    private final void OLrzqt(Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
        this.AhwBna.AEQbTJ(this.gEmmrt.KWHzl(new Application(function2)));
    }

    private final void valueOf() {
        AbstractC57556yke abstractC57556ykeAEQbTJ = C54407xHg.Companion.AEQbTJ("tickers-3s", C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, false, null, 63, null), yDY.copydefault(new WsArgV5("tickers-3s", null, null, this.AYXKKw, null, null, null, null, 246, null)), new Function2() { // from class: o.xSM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return xSN.copydefault(this.AEQbTJ, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        });
        this.AkhnZx = abstractC57556ykeAEQbTJ;
        if (abstractC57556ykeAEQbTJ != null) {
            abstractC57556ykeAEQbTJ.AhwBna();
        }
    }

    public static final Unit copydefault(xSN xsn, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        xsn.OLrzqt = true;
        xsn.AhwBna(oKIncomingData.getPayload().toString());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(xSN xsn, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        xsn.OLrzqt(oKIncomingData.getPayload().toString());
        return Unit.INSTANCE;
    }

    private final void AhwBna(java.lang.String str) {
        TickersData tickersDataOLrzqt = TickersData.Companion.OLrzqt(str);
        if (tickersDataOLrzqt != null) {
            this.DbNXlk.put(tickersDataOLrzqt.getInstId(), tickersDataOLrzqt);
        }
    }

    private final void OLrzqt(java.lang.String str) {
        TickersData tickersDataOLrzqt = TickersData.Companion.OLrzqt(str);
        if (tickersDataOLrzqt != null) {
            this.valueOf.put(tickersDataOLrzqt.getCcy(), tickersDataOLrzqt);
        }
    }

    private final void gEmmrt() {
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, 2000L, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.xSQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xSN.KWHzl(this.KWHzl, (java.lang.Long) obj);
            }
        };
        this.AhwBna.OLrzqt(abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.xST
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xSN.EZpvd(function1, obj);
            }
        }));
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(xSN xsn, java.lang.Long l) {
        if (!xsn.KWHzl.hasActiveObservers()) {
            xsn.KWHzl();
        }
        if (xsn.OLrzqt) {
            xsn.OLrzqt = false;
            xsn.values.invoke(java.lang.Boolean.TRUE, null);
            C43296rmc.AEQbTJ("datasource", "------------------" + xsn.AYXKKw + "DataTask>update");
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC54726xTa
    public void KWHzl() {
        this.AhwBna.dispose();
        EZpvd();
    }

    @Override // o.InterfaceC54726xTa
    public TickersData copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.DbNXlk.get(str);
    }

    @Override // o.InterfaceC54726xTa
    public TickersData EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.valueOf.get(str);
    }

    private final void copydefault(boolean z, java.lang.Exception exc) {
        if (z) {
            this.djBIcL++;
        } else {
            this.djBIcL = 0;
            this.values.invoke(java.lang.Boolean.TRUE, exc);
        }
        if (this.djBIcL == 2) {
            this.djBIcL = 0;
            this.EZpvd = true;
            this.values.invoke(java.lang.Boolean.TRUE, null);
            if (this.AEQbTJ) {
                valueOf();
                djBIcL();
                gEmmrt();
            }
        }
    }

    public void EZpvd() {
        C54407xHg.StateListAnimator stateListAnimator = C54407xHg.Companion;
        stateListAnimator.EZpvd("tickers-3s", this.AkhnZx);
        AbstractC57556yke abstractC57556yke = this.AkhnZx;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        C43296rmc.AEQbTJ("FutureSourceTask", "------------------>destroy");
        stateListAnimator.EZpvd("cup-tickers-3s", this.copydefault);
        AbstractC57556yke abstractC57556yke2 = this.copydefault;
        if (abstractC57556yke2 != null) {
            abstractC57556yke2.djBIcL();
        }
        this.AkhnZx = null;
    }

    private final void djBIcL() {
        java.util.List<BizInstrument> list = this.fetchVPNInfo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            java.lang.String tradeSymbol = ((BizInstrument) obj).getTradeSymbol();
            java.lang.Object arrayList = linkedHashMap.get(tradeSymbol);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(tradeSymbol, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        java.util.ArrayList<? extends InterfaceC57559ykh> arrayList2 = new java.util.ArrayList<>();
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(new WsArgV5("cup-tickers-3s", null, null, null, (java.lang.String) ((Map.Entry) it.next()).getKey(), null, null, null, 238, null));
        }
        AbstractC57556yke abstractC57556ykeAEQbTJ = C54407xHg.Companion.AEQbTJ("cup-tickers-3s", C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, false, null, 63, null), arrayList2, new Function2() { // from class: o.xSO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return xSN.AEQbTJ(this.KWHzl, (AbstractC33132mqg) obj2, (OKIncomingData) obj3);
            }
        });
        this.copydefault = abstractC57556ykeAEQbTJ;
        if (abstractC57556ykeAEQbTJ != null) {
            abstractC57556ykeAEQbTJ.AhwBna();
        }
    }

    public final void copydefault(java.util.List<TickersData> list) {
        if (list != null) {
            for (TickersData tickersData : list) {
                this.DbNXlk.put(tickersData.getInstId(), tickersData);
            }
        }
    }

    public final void OLrzqt(java.util.List<TickersData> list) {
        if (list != null) {
            for (TickersData tickersData : list) {
                this.valueOf.put(tickersData.getCcy(), tickersData);
            }
        }
    }
}
