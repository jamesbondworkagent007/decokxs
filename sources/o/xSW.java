package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickerCupReq;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C54401xHa;
import o.C54407xHg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class xSW {
    public final MutableLiveData<SourceResp<AbstractC54646xQb>> AEQbTJ;
    public final java.util.List<BizInstrument> AYXKKw;
    public java.util.HashMap<java.lang.String, TickersData> AhwBna;
    public ConcurrentHashMap<java.lang.String, TickersData> DbNXlk;
    public boolean EZpvd;
    public final boolean KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public volatile boolean copydefault;
    public AbstractC57556yke djBIcL;
    public C58216yxB gEmmrt;
    public AbstractC57556yke isConnected;
    public volatile int valueOf;
    public final Function2<java.lang.Boolean, java.lang.Exception, Unit> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.unify_trade.biz.BizInstrument> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public xSW(@NotNull java.util.List<? extends BizInstrument> list, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2, @NotNull MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.AYXKKw = list;
        this.values = function2;
        this.AEQbTJ = mutableLiveData;
        this.KWHzl = z;
        this.gEmmrt = new C58216yxB();
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.xTd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xSW.copydefault();
            }
        });
        this.DbNXlk = new ConcurrentHashMap<>();
        this.AhwBna = new java.util.HashMap<>();
        EZpvd(new Function2() { // from class: o.xTb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return xSW.AEQbTJ(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        });
        AEQbTJ(new Function2() { // from class: o.xTi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return xSW.copydefault(this.copydefault, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        });
    }

    public final C56131xwy AEQbTJ() {
        return (C56131xwy) this.OLrzqt.getValue();
    }

    public static final C56131xwy copydefault() {
        return new C56131xwy();
    }

    public static final Unit AEQbTJ(xSW xsw, boolean z, java.lang.Exception exc) {
        xsw.KWHzl(z, exc);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(xSW xsw, boolean z, java.lang.Exception exc) {
        xsw.KWHzl(z, exc);
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public final /* synthetic */ Function2<java.lang.Boolean, java.lang.Exception, Unit> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
            this.OLrzqt = function2;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            xSW.this.KWHzl(list);
            this.OLrzqt.invoke(java.lang.Boolean.valueOf(z), exc);
        }
    }

    public static final class TaskDescription implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public final /* synthetic */ Function2<java.lang.Boolean, java.lang.Exception, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
            this.copydefault = function2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Exception] */
        @Override // o.InterfaceC55701xos
        public /* bridge */ /* synthetic */ void EZpvd(boolean z, java.util.List<? extends TickersData> list, java.lang.Exception exc) {
            EZpvd2(z, (java.util.List<TickersData>) list, exc);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            xSW.this.copydefault(list);
            this.copydefault.invoke(java.lang.Boolean.valueOf(z), exc);
        }
    }

    public void EZpvd(@NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.gEmmrt.AEQbTJ(C55692xoj.getMarkPriceTicker$default(C55692xoj.KWHzl, "OPTION", null, null, null, null, new TaskDescription(function2), 28, null));
    }

    public final void EZpvd() {
        java.util.ArrayList<? extends InterfaceC57559ykh> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<T> it = this.AYXKKw.iterator();
        while (it.hasNext()) {
            arrayList.add(new WsArgV5("mp-tickers-3s", ((BizInstrument) it.next()).getInstId(), null, null, null, null, null, null, 252, null));
        }
        AbstractC57556yke abstractC57556ykeAEQbTJ = C54407xHg.Companion.AEQbTJ("mp-tickers-3s", C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, false, null, 63, null), arrayList, new Function2() { // from class: o.xSX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return xSW.OLrzqt(this.EZpvd, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        });
        this.isConnected = abstractC57556ykeAEQbTJ;
        if (abstractC57556ykeAEQbTJ != null) {
            abstractC57556ykeAEQbTJ.AhwBna();
        }
    }

    public static final Unit OLrzqt(xSW xsw, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        xsw.copydefault = true;
        xsw.EZpvd(oKIncomingData.getPayload().toString());
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        java.util.ArrayList<? extends InterfaceC57559ykh> arrayList = new java.util.ArrayList<>();
        java.util.List<BizInstrument> list = this.AYXKKw;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            java.lang.String tradeSymbol = ((BizInstrument) obj).getTradeSymbol();
            java.lang.Object arrayList2 = linkedHashMap.get(tradeSymbol);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                linkedHashMap.put(tradeSymbol, arrayList2);
            }
            ((java.util.List) arrayList2).add(obj);
        }
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(new WsArgV5("cup-tickers-3s", null, null, null, (java.lang.String) ((Map.Entry) it.next()).getKey(), null, null, null, 238, null));
        }
        AbstractC57556yke abstractC57556ykeAEQbTJ = C54407xHg.Companion.AEQbTJ("cup-tickers-3s", C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, false, null, 63, null), arrayList, new Function2() { // from class: o.xTc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return xSW.KWHzl(this.EZpvd, (AbstractC33132mqg) obj2, (OKIncomingData) obj3);
            }
        });
        this.djBIcL = abstractC57556ykeAEQbTJ;
        if (abstractC57556ykeAEQbTJ != null) {
            abstractC57556ykeAEQbTJ.AhwBna();
        }
    }

    public static final Unit KWHzl(xSW xsw, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        xsw.OLrzqt(oKIncomingData.getPayload().toString());
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str) {
        TickersData tickersDataOLrzqt = TickersData.Companion.OLrzqt(str);
        if (tickersDataOLrzqt != null) {
            this.DbNXlk.put(tickersDataOLrzqt.getInstId(), tickersDataOLrzqt);
        }
    }

    public final void OLrzqt(java.lang.String str) {
        TickersData tickersDataOLrzqt = TickersData.Companion.OLrzqt(str);
        if (tickersDataOLrzqt != null) {
            this.AhwBna.put(tickersDataOLrzqt.getCcy(), tickersDataOLrzqt);
        }
    }

    public final void AhwBna() {
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, 3000L, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.xTf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xSW.AEQbTJ(this.EZpvd, (java.lang.Long) obj);
            }
        };
        this.gEmmrt.OLrzqt(abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.xTe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xSW.OLrzqt(function1, obj);
            }
        }));
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(xSW xsw, java.lang.Long l) {
        if (!xsw.AEQbTJ.hasActiveObservers()) {
            xsw.djBIcL();
        }
        if (xsw.copydefault) {
            xsw.copydefault = false;
            xsw.values.invoke(java.lang.Boolean.TRUE, null);
            C43296rmc.AEQbTJ("datasource", "------------------OptionDataTask>update");
        }
        return Unit.INSTANCE;
    }

    public void djBIcL() {
        this.gEmmrt.dispose();
        C43296rmc.AEQbTJ("OptionSourceTask", "------------------>destroy");
        AYXKKw();
    }

    public TickersData KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.DbNXlk.get(str);
    }

    public TickersData copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AhwBna.get(str);
    }

    public final void KWHzl(boolean z, java.lang.Exception exc) {
        if (z) {
            this.valueOf++;
        } else {
            this.valueOf = 0;
            this.values.invoke(java.lang.Boolean.TRUE, exc);
        }
        if (this.valueOf != 2) {
            if (this.valueOf > 2) {
                this.EZpvd = true;
                this.values.invoke(java.lang.Boolean.TRUE, null);
                return;
            }
            return;
        }
        this.EZpvd = true;
        this.values.invoke(java.lang.Boolean.TRUE, null);
        if (this.KWHzl) {
            EZpvd();
            OLrzqt();
            AhwBna();
        }
    }

    public void AYXKKw() {
        C54407xHg.StateListAnimator stateListAnimator = C54407xHg.Companion;
        stateListAnimator.EZpvd("mp-tickers-3s", this.isConnected);
        AbstractC57556yke abstractC57556yke = this.isConnected;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        stateListAnimator.EZpvd("cup-tickers-3s", this.djBIcL);
        AbstractC57556yke abstractC57556yke2 = this.djBIcL;
        if (abstractC57556yke2 != null) {
            abstractC57556yke2.djBIcL();
        }
    }

    public void AEQbTJ(@NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        java.util.List<BizInstrument> list = this.AYXKKw;
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
        java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap.size());
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((java.lang.String) ((Map.Entry) it.next()).getKey());
        }
        this.gEmmrt.AEQbTJ(AEQbTJ().copydefault(new TickerCupReq(arrayList2), new StateListAnimator(function2)));
    }

    public final void copydefault(java.util.List<TickersData> list) {
        if (list != null) {
            for (TickersData tickersData : list) {
                this.DbNXlk.put(tickersData.getInstId(), tickersData);
            }
        }
    }

    public final void KWHzl(java.util.List<TickersData> list) {
        if (list != null) {
            for (TickersData tickersData : list) {
                this.AhwBna.put(tickersData.getCcy(), tickersData);
            }
        }
    }
}
