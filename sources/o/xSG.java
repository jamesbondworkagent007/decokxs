package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class xSG extends xGQ<java.lang.Object> implements xSZ {
    public final LinkedBlockingDeque<java.lang.String> AEQbTJ;
    public final boolean AYXKKw;
    public volatile boolean AhwBna;
    public final ConcurrentHashMap<java.lang.String, TickersData> AkhnZx;
    public final java.util.ArrayList<TickersData> DbNXlk;
    public final java.lang.String EZpvd;
    public InterfaceC58217yxC KWHzl;
    public java.util.List<java.lang.String> OLrzqt;
    public final java.util.List<java.lang.String> copydefault;
    public final MutableLiveData<SourceResp<java.lang.Object>> djBIcL;
    public final Function2<java.lang.Boolean, java.lang.Exception, Unit> fetchVPNInfo;
    public InterfaceC58217yxC gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public AbstractC57556yke valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.AhwBna = z;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<TickersData> gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r7v0 java.util.List)
  (r8v0 kotlin.jvm.functions.Function2)
  (r9v0 androidx.lifecycle.MutableLiveData)
  (r10v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.util.List<java.lang.String>, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit>, androidx.lifecycle.MutableLiveData<com.okinc.tradeapi.bean.SourceResp<java.lang.Object>>, boolean, java.lang.String):void (m)] (LINE:26) call: o.xSG.<init>(java.util.List, kotlin.jvm.functions.Function2, androidx.lifecycle.MutableLiveData, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ xSG(java.util.List list, Function2 function2, MutableLiveData mutableLiveData, boolean z, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, function2, mutableLiveData, z, (i & 16) != 0 ? "" : str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public xSG(@NotNull java.util.List<java.lang.String> list, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2, @NotNull MutableLiveData<SourceResp<java.lang.Object>> mutableLiveData, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = list;
        this.fetchVPNInfo = function2;
        this.djBIcL = mutableLiveData;
        this.AYXKKw = z;
        this.EZpvd = str;
        this.AkhnZx = new ConcurrentHashMap<>();
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.xSC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xSG.EZpvd();
            }
        });
        this.AEQbTJ = new LinkedBlockingDeque<>();
        this.DbNXlk = new java.util.ArrayList<>();
        fetchVPNInfo();
    }

    public static final C56131xwy EZpvd() {
        return new C56131xwy();
    }

    public final C56131xwy valueOf() {
        return (C56131xwy) this.isConnected.getValue();
    }

    public final void fetchVPNInfo() {
        AuCTel();
        if (this.AYXKKw) {
            KWHzl(this.copydefault);
        }
        fIwbmz();
    }

    public static final class Activity implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            xSG xsg = xSG.this;
            synchronized (xSG.class) {
                xsg.gEmmrt().clear();
                if (list != null) {
                    xsg.gEmmrt().addAll(list);
                }
            }
            xSG.this.EZpvd(true);
        }
    }

    @Override // o.xSZ
    public void AuCTel() {
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC == null || interfaceC58217yxC.isDisposed()) {
            this.gEmmrt = valueOf().KWHzl(new Activity());
        }
    }

    public final void KWHzl(java.util.List<java.lang.String> list) {
        if (Intrinsics.EZpvd(this.OLrzqt, list)) {
            return;
        }
        this.OLrzqt = list;
        if (this.valueOf != null) {
            fARcdN();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new WsArgV5("cup-tickers-3s", null, null, null, (java.lang.String) it.next(), null, null, null, 238, null));
        }
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, "cup-tickers-3s", arrayList, (Function1) null, 4, (java.lang.Object) null);
        this.valueOf = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = true;
        this.AEQbTJ.put(str);
    }

    @Override // o.xSZ
    public void AEQbTJ(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (this.AYXKKw) {
            KWHzl(list);
        }
    }

    private final void OLrzqt(java.lang.String str) {
        TickersData tickersDataOLrzqt = TickersData.Companion.OLrzqt(str);
        if (tickersDataOLrzqt != null) {
            this.AkhnZx.put(tickersDataOLrzqt.getCcy(), tickersDataOLrzqt);
        }
    }

    public final void djBIcL() throws java.lang.InterruptedException {
        while (!this.AEQbTJ.isEmpty()) {
            java.lang.String strTake = this.AEQbTJ.take();
            Intrinsics.checkNotNullExpressionValue(strTake, "");
            OLrzqt(strTake);
        }
    }

    public final void fIwbmz() {
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, this.AYXKKw ? 2000L : 700L, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.xSD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xSG.OLrzqt(this.AEQbTJ, (java.lang.Long) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgInterval.map(new InterfaceC58229yxO() { // from class: o.xSF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return xSG.KWHzl(function1, obj);
            }
        }).observeOn(yBP.KWHzl());
        final Function1 function12 = new Function1() { // from class: o.xSE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xSG.EZpvd(this.copydefault, (java.lang.Boolean) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn2 = abstractC58247yxgObserveOn.map(new InterfaceC58229yxO() { // from class: o.xSI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return xSG.AYXKKw(function12, obj);
            }
        }).observeOn(C58266yxz.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.xSK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xSG.KWHzl(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        };
        this.KWHzl = abstractC58247yxgObserveOn2.subscribe(new InterfaceC58227yxM() { // from class: o.xSH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xSG.EZpvd(function13, obj);
            }
        });
    }

    public static final java.lang.Boolean KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean OLrzqt(xSG xsg, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return java.lang.Boolean.valueOf(xsg.AhwBna);
    }

    public static final java.lang.Boolean AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean EZpvd(xSG xsg, java.lang.Boolean bool) throws java.lang.InterruptedException {
        boolean z;
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            synchronized (xSG.class) {
                if (C33129mqd.KWHzl((java.util.Collection) xsg.DbNXlk)) {
                    xsg.DbNXlk();
                }
                Unit unit = Unit.INSTANCE;
            }
            z = true;
            if (!xsg.AEQbTJ.isEmpty()) {
                xsg.djBIcL();
            }
        } else {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(xSG xsg, java.lang.Boolean bool) {
        InterfaceC58217yxC interfaceC58217yxC;
        if (!xsg.djBIcL.hasActiveObservers()) {
            xsg.isConnected();
        }
        if (xsg.AhwBna) {
            xsg.AhwBna = false;
            pUU.EZpvd("CoinMarketTask", xsg.EZpvd + " -> CoinMarketTask startCheckResultLoop notify");
            xsg.fetchVPNInfo.invoke(java.lang.Boolean.TRUE, null);
            if (!xsg.AYXKKw && (interfaceC58217yxC = xsg.KWHzl) != null) {
                interfaceC58217yxC.dispose();
            }
        }
        return Unit.INSTANCE;
    }

    public final void isConnected() {
        fARcdN();
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.KWHzl;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    public final void fARcdN() {
        pUU.EZpvd("datasource", "------------------CoinSourceTask>destroy");
        AbstractC57556yke abstractC57556yke = this.valueOf;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        C54407xHg.Companion.EZpvd("cup-tickers-3s", this.valueOf);
        this.valueOf = null;
    }

    @Override // o.xSZ
    public boolean values() {
        return this.AkhnZx.size() > 0;
    }

    @Override // o.xSZ
    public TickersData EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AkhnZx.get(str);
    }

    @Override // o.xSZ
    public void KWHzl() {
        fJNWhG();
    }

    public void fJNWhG() {
        isConnected();
    }

    public final void DbNXlk() {
        java.util.ArrayList<TickersData> arrayList = this.DbNXlk;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
        for (java.lang.Object obj : arrayList) {
            linkedHashMap.put(((TickersData) obj).getCcy(), obj);
        }
        this.AkhnZx.putAll(linkedHashMap);
        this.DbNXlk.clear();
    }
}
