package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.CountDownType;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.trade.model.SpotSourceData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public class xQJ extends AbstractC54646xQb {
    public final java.lang.String AEQbTJ;
    public final MutableLiveData<SourceResp<AbstractC54646xQb>> AYXKKw;
    public java.lang.String AhwBna;
    public xSY AkhnZx;
    public final java.util.ArrayList<ChargeGroupData> DbNXlk;
    public CopyOnWriteArrayList<SpotInstrument> EZpvd;
    public InterfaceC58217yxC KWHzl;
    public final boolean OLrzqt;
    public final java.util.HashMap<java.lang.String, TradeCoinInfo> copydefault;
    public java.util.ArrayList<SpotInstrument> djBIcL;
    public InterfaceC58217yxC fARcdN;
    public InterfaceC58217yxC fJNWhG;
    public java.lang.String fetchVPNInfo;
    public java.lang.String gEmmrt;
    public final java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> isConnected;
    public final boolean valueOf;
    public final boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<SourceResp<AbstractC54646xQb>> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xSY AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(xSY xsy) {
        this.AkhnZx = xsy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<SpotInstrument> gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r12v0 java.util.ArrayList)
  (r13v0 java.util.HashMap)
  (r14v0 java.util.HashMap)
  (r15v0 boolean)
  (r16v0 androidx.lifecycle.MutableLiveData)
  (r17v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("unknown") : (r19v0 java.lang.String))
 A[MD:(java.util.ArrayList<com.okinc.unify_trade.biz.SpotInstrument>, java.util.HashMap<java.lang.String, com.okinc.unify_trade.biz.TradeCoinInfo>, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>, boolean, androidx.lifecycle.MutableLiveData<com.okinc.tradeapi.bean.SourceResp<o.xQb>>, boolean, boolean, java.lang.String):void (m)] (LINE:41) call: o.xQJ.<init>(java.util.ArrayList, java.util.HashMap, java.util.HashMap, boolean, androidx.lifecycle.MutableLiveData, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ xQJ(java.util.ArrayList arrayList, java.util.HashMap map, java.util.HashMap map2, boolean z, MutableLiveData mutableLiveData, boolean z2, boolean z3, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, map, map2, z, mutableLiveData, z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? "unknown" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xQJ(@NotNull java.util.ArrayList<SpotInstrument> arrayList, @NotNull java.util.HashMap<java.lang.String, TradeCoinInfo> map, @NotNull java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map2, boolean z, @NotNull MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, boolean z2, boolean z3, @NotNull java.lang.String str) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = arrayList;
        this.copydefault = map;
        this.isConnected = map2;
        this.OLrzqt = z;
        this.AYXKKw = mutableLiveData;
        this.valueOf = z2;
        this.values = z3;
        this.AEQbTJ = str;
        this.EZpvd = new CopyOnWriteArrayList<>();
        this.DbNXlk = new java.util.ArrayList<>();
        this.gEmmrt = "";
    }

    public static /* synthetic */ void init$default(xQJ xqj, java.lang.Boolean bool, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
        }
        if ((i & 1) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        xqj.KWHzl(bool, (Function1<? super java.lang.Boolean, Unit>) function1);
    }

    public final void KWHzl(final java.lang.Boolean bool, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.KWHzl("NavOptPhase1", this.AEQbTJ + " -> SpotMarketDataSource invoke init");
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.xQN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58249yxi
            public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                xQJ.EZpvd(this.KWHzl, bool, interfaceC58251yxk);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.xQS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xQJ.OLrzqt(this.copydefault, function1, (java.lang.String) obj);
            }
        };
        this.KWHzl = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xQQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xQJ.AhwBna(function12, obj);
            }
        });
    }

    public static final void EZpvd(xQJ xqj, java.lang.Boolean bool, InterfaceC58251yxk interfaceC58251yxk) {
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        java.util.List listOLrzqt = bool != null ? C41428qqd.OLrzqt.OLrzqt(xqj.djBIcL, bool.booleanValue()) : null;
        java.util.ArrayList<SpotInstrument> arrayList = listOLrzqt instanceof java.util.ArrayList ? (java.util.ArrayList) listOLrzqt : null;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
        }
        xqj.djBIcL = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (xqj.copydefault((SpotInstrument) obj, xqj.valueOf)) {
                arrayList2.add(obj);
            }
        }
        xqj.djBIcL = new java.util.ArrayList<>(arrayList2);
        interfaceC58251yxk.onNext("");
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(xQJ xqj, Function1 function1, java.lang.String str) {
        pUU.KWHzl("NavOptPhase1", xqj.AEQbTJ + " -> SpotMarketDataSource spotFilterInstrument rx callback");
        xqj.EZpvd((Function1<? super java.lang.Boolean, Unit>) function1);
        return Unit.INSTANCE;
    }

    public final boolean copydefault(SpotInstrument spotInstrument, boolean z) {
        CountDownInfo countDownInfo;
        if (z) {
            if (spotInstrument.getCountDownInfo() == null) {
                return true;
            }
            if (spotInstrument.getCountDownInfo() != null) {
                CountDownInfo countDownInfo2 = spotInstrument.getCountDownInfo();
                if (Intrinsics.EZpvd((java.lang.Object) (countDownInfo2 != null ? countDownInfo2.getType() : null), (java.lang.Object) "0") && (countDownInfo = spotInstrument.getCountDownInfo()) != null && countDownInfo.countDownTimeExpire()) {
                    return true;
                }
            }
            CountDownInfo countDownInfo3 = spotInstrument.getCountDownInfo();
            if ((countDownInfo3 != null ? countDownInfo3.getShowType() : null) == CountDownType.SHOW_CANCEL) {
                return true;
            }
        } else {
            if (spotInstrument.getCountDownInfo() == null) {
                return true;
            }
            CountDownInfo countDownInfo4 = spotInstrument.getCountDownInfo();
            if ((countDownInfo4 != null ? countDownInfo4.getShowType() : null) == CountDownType.SHOW_COUNT_DOWN) {
                return true;
            }
            CountDownInfo countDownInfo5 = spotInstrument.getCountDownInfo();
            if ((countDownInfo5 != null ? countDownInfo5.getShowType() : null) == CountDownType.SHOW_EXPECT) {
                return true;
            }
        }
        return false;
    }

    public final void EZpvd(final Function1<? super java.lang.Boolean, Unit> function1) {
        AEQbTJ(new Function1() { // from class: o.xQK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xQJ.EZpvd(this.OLrzqt, function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        KWHzl(new Function1() { // from class: o.xQG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xQJ.EZpvd(this.EZpvd, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit EZpvd(final xQJ xqj, final Function1 function1, boolean z) {
        pUU.KWHzl("NavOptPhase1", xqj.AEQbTJ + " -> SpotMarketDataSource loadWatchList 01 callback");
        pUU.KWHzl("SpotMarketDataSource", "initSpot: chargeGroupId:" + xqj.gEmmrt);
        xqj.AEQbTJ(true, new Function1() { // from class: o.xQT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xQJ.OLrzqt(this.OLrzqt, function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(xQJ xqj, Function1 function1, boolean z) {
        pUU.KWHzl("NavOptPhase1", xqj.AEQbTJ + " -> SpotMarketDataSource filter callback");
        xqj.iwGUEr();
        xSY xsy = xqj.AkhnZx;
        if (xsy != null) {
            xsy.AEQbTJ(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(xqj.EZpvd), 0, 30);
        }
        function1.invoke(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final xQJ xqj, int i) {
        pUU.KWHzl("NavOptPhase1", xqj.AEQbTJ + " -> SpotMarketDataSource notifyWatch callback");
        xqj.AEQbTJ(new Function1() { // from class: o.xQY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xQJ.EZpvd(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(xQJ xqj, boolean z) {
        pUU.KWHzl("NavOptPhase1", xqj.AEQbTJ + " -> SpotMarketDataSource loadWatchList 02 callback");
        xqj.uzCIH();
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd("SpotMarketDataSource", "setFilterCondition() called with: chargeGroupId = " + str + ", categoryId = " + str2);
        if (Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) str) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) str2)) {
            return;
        }
        this.gEmmrt = str;
        this.AhwBna = str2;
        filter$default(this, false, new Function1() { // from class: o.xQZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xQJ.KWHzl(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }, 1, null);
    }

    public static final Unit KWHzl(xQJ xqj, boolean z) {
        xqj.uzCIH();
        xqj.EZpvd(xqj.fetchVPNInfo);
        return Unit.INSTANCE;
    }

    public final void uzCIH() {
        xSY xsy = this.AkhnZx;
        if (xsy == null || !xsy.copydefault()) {
            return;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.fJNWhG;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        getFieldNames();
    }

    public void copydefault(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) str)) {
            return;
        }
        this.fetchVPNInfo = str;
        uzCIH();
        EZpvd(str);
    }

    public final void EZpvd(java.lang.String str) {
        if (this.valueOf) {
            if (str == null || str.length() == 0) {
                xSY xsy = this.AkhnZx;
                if (xsy != null) {
                    xsy.AEQbTJ(CollectionsKt___CollectionsKt.QfsBiF(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.EZpvd)), 0, 30);
                    return;
                }
                return;
            }
            xSY xsy2 = this.AkhnZx;
            if (xsy2 != null) {
                xsy2.OLrzqt();
            }
        }
    }

    @Override // o.AbstractC54646xQb
    public void AEQbTJ() {
        xSY xsy = this.AkhnZx;
        if (xsy != null) {
            xsy.EZpvd();
        }
    }

    @Override // o.AbstractC54646xQb
    public void EZpvd(int i, int i2) {
        xSY xsy;
        java.lang.String str = this.fetchVPNInfo;
        if ((str == null || str.length() == 0) && (xsy = this.AkhnZx) != null) {
            xsy.AEQbTJ(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.EZpvd), i, i2);
        }
    }

    private final void iwGUEr() {
        pUU.KWHzl("NavOptPhase1", this.AEQbTJ + " -> SpotMarketDataSource startRegisterDataSource invoke");
        DbNXlk();
    }

    public void DbNXlk() {
        xSY xsy = this.AkhnZx;
        if (xsy != null && xsy != null) {
            xsy.AEQbTJ();
        }
        this.AkhnZx = new C54733xTh(this.djBIcL, new Function2() { // from class: o.xQR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return xQJ.KWHzl(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        }, this.AYXKKw, null, this.valueOf, this.values);
    }

    public static final Unit KWHzl(xQJ xqj, boolean z, java.lang.Exception exc) {
        java.lang.String message;
        if (z) {
            xqj.uzCIH();
        } else {
            Function1<java.lang.String, Unit> function1FIwbmz = xqj.fIwbmz();
            if (function1FIwbmz != null) {
                if (exc == null || (message = exc.getMessage()) == null) {
                    message = "";
                }
                function1FIwbmz.invoke(message);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xQJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void filter$default(xQJ xqj, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: filter");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        xqj.AEQbTJ(z, (Function1<? super java.lang.Boolean, Unit>) function1);
    }

    public final void AEQbTJ(final boolean z, final Function1<? super java.lang.Boolean, Unit> function1) {
        pUU.KWHzl("SpotMarketDataSource", "filter: ");
        InterfaceC58217yxC interfaceC58217yxC = this.fARcdN;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just("");
        final Function1 function12 = new Function1() { // from class: o.xRc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xQJ.copydefault(this.AEQbTJ, z, (java.lang.String) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.xRi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return xQJ.fetchVPNInfo(function12, obj);
            }
        }).subscribeOn(yBP.EZpvd()).observeOn(C58266yxz.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.xQH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xQJ.EZpvd(this.copydefault, function1, (java.util.ArrayList) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xQP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xQJ.values(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.xQO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xQJ.AEQbTJ(function1, (java.lang.Throwable) obj);
            }
        };
        this.fARcdN = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xQM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xQJ.fARcdN(function14, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.ArrayList fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final java.util.ArrayList copydefault(xQJ xqj, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("NavOptPhase1", xqj.AEQbTJ + " -> SpotMarketDataSource createChargeGroup invoke");
        xqj.copydefault();
        if (z) {
            xqj.gEmmrt = xqj.KWHzl(xqj.DbNXlk);
        }
        return xqj.copydefault(xqj.djBIcL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(xQJ xqj, Function1 function1, java.util.ArrayList arrayList) {
        pUU.KWHzl("NavOptPhase1", xqj.AEQbTJ + " -> SpotMarketDataSource createChargeGroup rx callback");
        xqj.EZpvd.clear();
        CopyOnWriteArrayList<SpotInstrument> copyOnWriteArrayList = xqj.EZpvd;
        Intrinsics.copydefault(arrayList);
        copyOnWriteArrayList.addAll(CollectionsKt___CollectionsKt.QfsBiF(arrayList));
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(Function1 function1, java.lang.Throwable th) {
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        java.util.ArrayList<ChargeGroupData> arrayListKWHzl = KWHzl();
        this.DbNXlk.clear();
        this.DbNXlk.addAll(arrayListKWHzl);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:37:0x00b4 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<ChargeGroupData> KWHzl() {
        java.util.List<ChargeGroupData> listAhwBna;
        java.util.ArrayList<BizInstrument> arrayListEZpvd;
        java.util.HashMap map = new java.util.HashMap();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (listAhwBna = interfaceC54581xNrOLrzqt.AEQbTJ()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList<ChargeGroupData> arrayList = new java.util.ArrayList<>(listAhwBna);
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            map.put(((ChargeGroupData) it.next()).getId(), 0L);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null) {
            arrayListEZpvd = null;
        } else {
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(this.OLrzqt ? "MARGIN" : "SPOT");
            if (abstractC54531xLwOLrzqt != null) {
                arrayListEZpvd = abstractC54531xLwOLrzqt.EZpvd();
            }
        }
        if (arrayListEZpvd != null) {
            for (BizInstrument bizInstrument : arrayListEZpvd) {
                for (ChargeGroupData chargeGroupData : arrayList) {
                    if (chargeGroupData.getTypes().contains(bizInstrument.getQuoteSymbol())) {
                        java.lang.Object obj = (java.lang.Long) map.get(chargeGroupData.getId());
                        if (obj == null) {
                            obj = "0";
                        }
                        map.put(chargeGroupData.getId(), java.lang.Long.valueOf(C33129mqd.valueOf(obj) + 1));
                    }
                }
            }
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return arrayList;
            }
            if (C33129mqd.valueOf(map.get(arrayList.get(size).getId()), "0")) {
                arrayList.remove(size);
            }
        }
    }

    private final void getFieldNames() {
        xSY xsy;
        synchronized (this) {
            pUU.KWHzl("NavOptPhase1", this.AEQbTJ + " -> SpotMarketDataSource sortByTicker invoke start..");
            if (!this.AYXKKw.hasActiveObservers() && (xsy = this.AkhnZx) != null) {
                xsy.AEQbTJ();
            }
            InterfaceC58217yxC interfaceC58217yxC = this.fJNWhG;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just("");
            final Function1 function1 = new Function1() { // from class: o.xQU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return xQJ.KWHzl(this.KWHzl, (java.lang.String) obj);
                }
            };
            AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.xQX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return xQJ.AkhnZx(function1, obj);
                }
            }).subscribeOn(yBP.EZpvd()).observeOn(C58266yxz.OLrzqt());
            final Function1 function12 = new Function1() { // from class: o.xRe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return xQJ.OLrzqt(this.AEQbTJ, (java.util.ArrayList) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xRb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    xQJ.DbNXlk(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.xRa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return xQJ.EZpvd((java.lang.Throwable) obj);
                }
            };
            this.fJNWhG = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xRd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    xQJ.isConnected(function13, obj);
                }
            });
        }
    }

    public static final java.util.ArrayList AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final java.util.ArrayList KWHzl(xQJ xqj, java.lang.String str) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("SpotMarketDataSource", "sortByTicker: currentGroup size:" + xqj.EZpvd.size());
        pUU.KWHzl("SpotMarketDataSource", "chargeGroupId:" + xqj.gEmmrt + " category:" + xqj.AhwBna);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SpotMarketDataSource ");
        sb.append(xqj);
        pUU.KWHzl("SpotMarketDataSource", sb.toString());
        java.util.ArrayList<MarketDataSource> arrayListKWHzl = xqj.KWHzl(new java.util.ArrayList<>(CollectionsKt___CollectionsKt.QfsBiF(xqj.EZpvd)));
        if (Intrinsics.EZpvd((java.lang.Object) xqj.AhwBna, (java.lang.Object) "41") && ((str2 = xqj.fetchVPNInfo) == null || str2.length() == 0)) {
            xqj.fetchVPNInfo = "coins_new_sort";
        }
        java.lang.String str3 = xqj.fetchVPNInfo;
        if (str3 == null || str3.length() == 0) {
            return xqj.OLrzqt(arrayListKWHzl);
        }
        java.lang.String str4 = xqj.fetchVPNInfo;
        Intrinsics.copydefault((java.lang.Object) str4);
        return xqj.EZpvd(arrayListKWHzl, str4);
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(xQJ xqj, java.util.ArrayList arrayList) {
        pUU.KWHzl("NavOptPhase1", xqj.AEQbTJ + " -> SpotMarketDataSource sortByTicker callback ...");
        Function1<java.util.ArrayList<MarketDataSource>, Unit> function1FJNWhG = xqj.fJNWhG();
        if (function1FJNWhG != null) {
            Intrinsics.copydefault(arrayList);
            function1FJNWhG.invoke(arrayList);
        }
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        C6777aVl.Companion.EZpvd(new java.lang.Exception("SpotMarketDataSource:" + th.getMessage()));
        return Unit.INSTANCE;
    }

    private final java.util.ArrayList<MarketDataSource> KWHzl(java.util.ArrayList<SpotInstrument> arrayList) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            java.util.List listQfsBiF = CollectionsKt___CollectionsKt.QfsBiF(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.stream.Stream streamParallelStream = listQfsBiF.parallelStream();
            final Function1 function1 = new Function1() { // from class: o.xQV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return xQJ.OLrzqt(this.KWHzl, (SpotInstrument) obj);
                }
            };
            java.util.stream.Stream map = streamParallelStream.map(new java.util.function.Function() { // from class: o.xQW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return xQJ.AYXKKw(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "");
            arrayList2.addAll(C59471zhf.OLrzqt(map));
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList2);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = arrayList3;
        }
        return (java.util.ArrayList) objM7377constructorimpl;
    }

    public static final SpotSourceData AYXKKw(Function1 function1, java.lang.Object obj) {
        return (SpotSourceData) function1.invoke(obj);
    }

    public static final SpotSourceData OLrzqt(xQJ xqj, SpotInstrument spotInstrument) {
        Intrinsics.copydefault(spotInstrument);
        return xqj.EZpvd(spotInstrument);
    }

    public final SpotSourceData EZpvd(SpotInstrument spotInstrument) {
        xSY xsy;
        xSY xsy2 = this.AkhnZx;
        TickersData tickersDataCopydefault = xsy2 != null ? xsy2.copydefault(spotInstrument.getInstId()) : null;
        xSY xsy3 = this.AkhnZx;
        TickersData tickersDataKWHzl = xsy3 != null ? xsy3.KWHzl(spotInstrument.getTradeSymbol()) : null;
        TickersData tickersDataKWHzl2 = (!this.values || (xsy = this.AkhnZx) == null) ? null : xsy.KWHzl(spotInstrument.getQuoteSymbol());
        java.lang.String instType = spotInstrument.getInstType();
        java.lang.String instId = spotInstrument.getInstId();
        java.lang.String instId2 = spotInstrument.getInstId();
        java.lang.String tradeSymbol = spotInstrument.getTradeSymbol();
        java.lang.String quoteSymbol = spotInstrument.getQuoteSymbol();
        java.lang.String volCcy24h = tickersDataCopydefault != null ? tickersDataCopydefault.getVolCcy24h() : null;
        java.lang.String vol24h = tickersDataCopydefault != null ? tickersDataCopydefault.getVol24h() : null;
        java.lang.String level = spotInstrument.getLevel();
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) level)) {
            level = null;
        }
        if (level == null) {
            level = spotInstrument.getCoinLever();
        }
        SpotSourceData spotSourceData = new SpotSourceData(instType, instId, instId2, tradeSymbol, quoteSymbol, volCcy24h, vol24h, level, tickersDataCopydefault != null ? copydefault(tickersDataCopydefault) : null, tickersDataCopydefault != null ? tickersDataCopydefault.getLast() : null, tickersDataKWHzl != null ? tickersDataKWHzl.getLast() : null, "", spotInstrument.getListTime(), OLrzqt(spotInstrument), AEQbTJ(spotInstrument.getQuoteCcy()), tickersDataKWHzl2 != null ? tickersDataKWHzl2.getLast() : null, spotInstrument.getDisplayId(), spotInstrument.getDisplayQuoteSymbol());
        spotSourceData.setHotTag(spotInstrument.isNewTag());
        if (!Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) "41")) {
            spotSourceData.setNewLabel(spotInstrument.isNewLabel());
        }
        xUW xuw = xUW.KWHzl;
        spotSourceData.setSortVolume(xuw.OLrzqt(spotSourceData));
        spotSourceData.setSortTurnover(java.lang.Double.valueOf(xuw.KWHzl(spotSourceData)));
        spotSourceData.setSortCcyVolume(xuw.copydefault(spotSourceData));
        return spotSourceData;
    }

    public final kotlin.Pair<java.lang.Double, java.lang.String> copydefault(TickersData tickersData) {
        return C55692xoj.KWHzl.AEQbTJ(tickersData.getLast(), tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8(), C55608xnE.OLrzqt());
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        TickersData tickersDataKWHzl;
        xSY xsy = this.AkhnZx;
        return (xsy == null || (tickersDataKWHzl = xsy.KWHzl(str)) == null) ? "" : tickersDataKWHzl.getLast();
    }

    private final java.util.ArrayList<SpotInstrument> copydefault(java.util.ArrayList<SpotInstrument> arrayList) {
        java.util.ArrayList<SpotInstrument> arrayList2 = new java.util.ArrayList<>();
        pUU.KWHzl("SpotMarketDataSource", "getFilterList: mChargeGroupId:" + this.gEmmrt + " mCategory:" + this.AhwBna);
        for (SpotInstrument spotInstrument : arrayList) {
            if (copydefault(this.AhwBna, spotInstrument) && AEQbTJ(this.gEmmrt, spotInstrument.getQuoteCcy())) {
                arrayList2.add(spotInstrument);
            }
        }
        return arrayList2;
    }

    public final boolean AEQbTJ(java.lang.String str, java.lang.String str2) {
        return OLrzqt(str, str2);
    }

    public final boolean copydefault(java.lang.String str, SpotInstrument spotInstrument) {
        java.util.ArrayList<java.lang.String> groups;
        if (str == null || str.length() == 0) {
            return true;
        }
        TradeCoinInfo tradeCoinInfo = this.copydefault.get(spotInstrument.getBaseCcy());
        if (tradeCoinInfo == null || (groups = tradeCoinInfo.getGroups()) == null) {
            return false;
        }
        return groups.contains(str);
    }

    public final boolean OLrzqt(java.lang.String str, java.lang.String str2) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            return true;
        }
        java.util.List<java.lang.String> list = this.isConnected.get(str);
        if (list != null) {
            return list.contains(str2);
        }
        return false;
    }

    @Override // o.AbstractC54646xQb
    public void valueOf() {
        pUU.KWHzl("SpotMarketDataSource", "------------------>destroy");
        super.valueOf();
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        xSY xsy = this.AkhnZx;
        if (xsy != null) {
            xsy.AEQbTJ();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.fARcdN;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC3 = this.fJNWhG;
        if (interfaceC58217yxC3 != null) {
            interfaceC58217yxC3.dispose();
        }
    }

    public final java.lang.String KWHzl(java.util.List<ChargeGroupData> list) {
        return (list == null || list.isEmpty()) ? "1" : list.get(0).getId();
    }

    @Override // o.AbstractC54646xQb, o.InterfaceC54647xQc
    public void AEQbTJ(@NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            C55608xnE.KWHzl(interfaceC54581xNrOLrzqt, (Function1<? super java.lang.Boolean, Unit>) new Function1() { // from class: o.xQL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return xQJ.AYXKKw(this.OLrzqt, function1, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        } else {
            super.AEQbTJ(function1);
        }
    }

    public static final Unit AYXKKw(xQJ xqj, Function1 function1, boolean z) {
        if (z) {
            super.AEQbTJ((Function1<? super java.lang.Boolean, Unit>) function1);
        } else {
            function1.invoke(java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
