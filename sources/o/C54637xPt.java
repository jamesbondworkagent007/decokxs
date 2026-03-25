package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.di.LocalizeDIModule;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.tradeapi.bean.TradeGroupData;
import com.okinc.unify_trade.biz.CoinWatchInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.trade.model.CoinMarketData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C54637xPt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xPt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C54637xPt extends AbstractC54646xQb {
    private static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final java.lang.String AEQbTJ;
    public final MutableLiveData<SourceResp<java.lang.Object>> AYXKKw;
    public final boolean AhwBna;
    public java.lang.String AkhnZx;
    public java.lang.String AuCTel;
    public xSZ DbNXlk;
    public java.util.ArrayList<TradeCoinInfo> OLrzqt;
    public final java.util.ArrayList<TradeCoinInfo> djBIcL;
    public InterfaceC58217yxC fARcdN;
    public java.util.ArrayList<TradeGroupData> fIwbmz;
    public InterfaceC58217yxC fJNWhG;
    public C54452xIy fetchVPNInfo;
    public InterfaceC58217yxC gEmmrt;
    public final C58216yxB isConnected;
    public final boolean valueOf;
    public final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AhwBna() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(java.lang.String str) {
        this.AuCTel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(xSZ xsz) {
        this.DbNXlk = xsz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<SourceResp<java.lang.Object>> copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public xSZ djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 java.util.ArrayList)
  (r9v0 androidx.lifecycle.MutableLiveData)
  (wrap:java.lang.String:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("unknown") : (r11v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(java.util.ArrayList<com.okinc.unify_trade.biz.TradeCoinInfo>, androidx.lifecycle.MutableLiveData<com.okinc.tradeapi.bean.SourceResp<java.lang.Object>>, java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:43) call: o.xPt.<init>(java.util.ArrayList, androidx.lifecycle.MutableLiveData, java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ C54637xPt(java.util.ArrayList arrayList, MutableLiveData mutableLiveData, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, mutableLiveData, (i & 4) != 0 ? null : str, (i & 8) != 0 ? "unknown" : str2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54637xPt(@NotNull java.util.ArrayList<TradeCoinInfo> arrayList, @NotNull MutableLiveData<SourceResp<java.lang.Object>> mutableLiveData, java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = arrayList;
        this.AYXKKw = mutableLiveData;
        this.AEQbTJ = str2;
        this.AhwBna = z;
        this.valueOf = z2;
        this.fIwbmz = new java.util.ArrayList<>();
        this.isConnected = new C58216yxB();
        this.djBIcL = new java.util.ArrayList<>();
        this.AkhnZx = str;
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.xPK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54637xPt.KWHzl();
            }
        });
    }

    /* JADX INFO: renamed from: o.xPt$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xPt.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final pTU AYXKKw() {
        return (pTU) this.values.getValue();
    }

    public static final pTU KWHzl() {
        return ((LocalizeDIModule.Activity) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), LocalizeDIModule.Activity.class)).gkJEwt();
    }

    public void AEQbTJ(java.lang.String str) {
        if (!Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) str)) {
            this.AkhnZx = str;
            filter$default(this, null, 1, null);
        }
    }

    public void OLrzqt(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) AhwBna(), (java.lang.Object) str)) {
            return;
        }
        EZpvd(str);
        AkhnZx();
    }

    public final void OLrzqt(@NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.xPP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58249yxi
            public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                C54637xPt.copydefault(this.copydefault, interfaceC58251yxk);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.xPR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54637xPt.EZpvd(this.copydefault, function1, (java.lang.String) obj);
            }
        };
        this.gEmmrt = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xPO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54637xPt.gEmmrt(function12, obj);
            }
        });
    }

    public static final void copydefault(C54637xPt c54637xPt, InterfaceC58251yxk interfaceC58251yxk) {
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        java.util.List<TradeCoinInfo> listKWHzl = C41428qqd.OLrzqt.KWHzl(c54637xPt.OLrzqt);
        if (listKWHzl != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listKWHzl) {
                TradeCoinInfo tradeCoinInfo = (TradeCoinInfo) obj;
                if (!Intrinsics.EZpvd((java.lang.Object) tradeCoinInfo.getTradeCoin(), (java.lang.Object) "0") && !Intrinsics.EZpvd((java.lang.Object) tradeCoinInfo.getSymbol(), (java.lang.Object) "USDT")) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        java.util.ArrayList<TradeCoinInfo> arrayList2 = new java.util.ArrayList<>(arrayList);
        c54637xPt.OLrzqt = arrayList2;
        c54637xPt.OLrzqt = c54637xPt.KWHzl(arrayList2, c54637xPt.AkhnZx);
        interfaceC58251yxk.onNext("");
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final C54637xPt c54637xPt, final Function1 function1, java.lang.String str) {
        c54637xPt.AEQbTJ(new Function1() { // from class: o.xPM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54637xPt.OLrzqt(this.EZpvd, function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        c54637xPt.KWHzl(new Function1() { // from class: o.xPI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54637xPt.EZpvd(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C54637xPt c54637xPt, Function1 function1, boolean z) {
        pUU.EZpvd("CoinSearchMarketSource", c54637xPt.AEQbTJ + " -> filter step1 done.");
        if (c54637xPt.fetchVPNInfo == null) {
            c54637xPt.fetchVPNInfo = new C54452xIy();
        }
        C54638xPu c54638xPu = C54638xPu.OLrzqt;
        C54452xIy c54452xIy = c54637xPt.fetchVPNInfo;
        Intrinsics.copydefault(c54452xIy);
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = c54638xPu.AEQbTJ(c54452xIy, c54637xPt.AYXKKw().OLrzqt().getLocale(), c54637xPt.new ActionBar(function1));
        if (interfaceC58217yxCAEQbTJ != null) {
            c54637xPt.isConnected.AEQbTJ(interfaceC58217yxCAEQbTJ);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.xPt$ActionBar */
    public static final class ActionBar implements InterfaceC55701xos<java.util.List<? extends TradeGroupData>> {
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Function1<? super java.lang.Boolean, Unit> function1) {
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(final boolean z, java.util.List<TradeGroupData> list, java.lang.Exception exc) {
            if (z && list != null && !list.isEmpty()) {
                pUU.KWHzl("CoinSearchMarketDataSource", "requestCategoryGroup sucess");
                C54637xPt.this.fIwbmz.clear();
                C54637xPt.this.fIwbmz.addAll(list);
            }
            if (C54637xPt.this.AhwBna) {
                pUU.EZpvd("CoinSearchMarketSource", C54637xPt.this.AEQbTJ + " -> requestCategoryGroup done.");
                this.KWHzl.invoke(java.lang.Boolean.valueOf(z));
                return;
            }
            final C54637xPt c54637xPt = C54637xPt.this;
            final Function1<java.lang.Boolean, Unit> function1 = this.KWHzl;
            c54637xPt.EZpvd((Function1<? super java.lang.Boolean, Unit>) new Function1() { // from class: o.xPW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54637xPt.ActionBar.OLrzqt(c54637xPt, function1, z, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }

        public static final Unit OLrzqt(C54637xPt c54637xPt, Function1 function1, boolean z, boolean z2) {
            pUU.EZpvd("CoinSearchMarketSource", c54637xPt.AEQbTJ + " -> requestCategoryGroup done.");
            c54637xPt.OLrzqt();
            function1.invoke(java.lang.Boolean.valueOf(z));
            return Unit.INSTANCE;
        }
    }

    public static final Unit EZpvd(final C54637xPt c54637xPt, int i) {
        c54637xPt.AEQbTJ(new Function1() { // from class: o.xPL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54637xPt.copydefault(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C54637xPt c54637xPt, boolean z) {
        c54637xPt.AkhnZx();
        return Unit.INSTANCE;
    }

    public final void AkhnZx() {
        xSZ xszDjBIcL = djBIcL();
        if (xszDjBIcL == null || !xszDjBIcL.values()) {
            return;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.fJNWhG;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        DbNXlk();
    }

    public void OLrzqt() {
        xSZ xsg;
        xSZ xszDjBIcL = djBIcL();
        if (xszDjBIcL != null) {
            xszDjBIcL.KWHzl();
        }
        if (this.valueOf) {
            xsg = new xSL(gEmmrt(), new Function2() { // from class: o.xPx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C54637xPt.EZpvd(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
                }
            }, this.AYXKKw, false, this.AEQbTJ);
        } else {
            xsg = new xSG(gEmmrt(), new Function2() { // from class: o.xPC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C54637xPt.copydefault(this.copydefault, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
                }
            }, this.AYXKKw, false, null, 16, null);
        }
        OLrzqt(xsg);
        pUU.EZpvd("CoinSearchMarketSource", this.AEQbTJ + " -> ticker register");
    }

    public static final Unit EZpvd(C54637xPt c54637xPt, boolean z, java.lang.Exception exc) {
        if (z) {
            pUU.EZpvd("CoinSearchMarketSource", c54637xPt.AEQbTJ + " -> refresh ticker");
            c54637xPt.AkhnZx();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C54637xPt c54637xPt, boolean z, java.lang.Exception exc) {
        if (z) {
            c54637xPt.AkhnZx();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xPt */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void filter$default(C54637xPt c54637xPt, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: filter");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        c54637xPt.EZpvd((Function1<? super java.lang.Boolean, Unit>) function1);
    }

    public final void EZpvd(final Function1<? super java.lang.Boolean, Unit> function1) {
        InterfaceC58217yxC interfaceC58217yxC = this.fARcdN;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just("");
        final Function1 function12 = new Function1() { // from class: o.xPF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54637xPt.KWHzl(this.KWHzl, (java.lang.String) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.xPD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C54637xPt.valueOf(function12, obj);
            }
        }).subscribeOn(yBP.EZpvd()).observeOn(C58266yxz.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.xPE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54637xPt.EZpvd(this.OLrzqt, function1, (java.util.ArrayList) obj);
            }
        };
        this.fARcdN = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xPJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54637xPt.AYXKKw(function13, obj);
            }
        });
    }

    public static final java.util.ArrayList valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final java.util.ArrayList KWHzl(C54637xPt c54637xPt, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return c54637xPt.KWHzl(c54637xPt.OLrzqt, c54637xPt.AkhnZx);
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C54637xPt c54637xPt, Function1 function1, java.util.ArrayList arrayList) {
        c54637xPt.djBIcL.clear();
        c54637xPt.djBIcL.addAll(arrayList);
        c54637xPt.AkhnZx();
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public final void DbNXlk() {
        xSZ xszDjBIcL;
        if (!this.AYXKKw.hasActiveObservers() && (xszDjBIcL = djBIcL()) != null) {
            xszDjBIcL.KWHzl();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.fJNWhG;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just("");
        final Function1 function1 = new Function1() { // from class: o.xPQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54637xPt.EZpvd(this.copydefault, (java.lang.String) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.xPN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C54637xPt.values(function1, obj);
            }
        }).subscribeOn(yBP.EZpvd()).observeOn(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.xPB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54637xPt.EZpvd(this.EZpvd, (java.util.ArrayList) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xPA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54637xPt.isConnected(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.xPy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54637xPt.EZpvd(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        this.fJNWhG = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xPz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54637xPt.fetchVPNInfo(function13, obj);
            }
        });
    }

    public static final java.util.ArrayList values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final java.util.ArrayList EZpvd(C54637xPt c54637xPt, java.lang.String str) {
        java.lang.String strAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<MarketDataSource> arrayListEZpvd = c54637xPt.EZpvd(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(c54637xPt.djBIcL));
        if (Intrinsics.EZpvd((java.lang.Object) c54637xPt.AkhnZx, (java.lang.Object) "41") && ((strAhwBna = c54637xPt.AhwBna()) == null || strAhwBna.length() == 0)) {
            c54637xPt.EZpvd("coins_new_sort");
        }
        java.lang.String strAhwBna2 = c54637xPt.AhwBna();
        if (strAhwBna2 == null || strAhwBna2.length() == 0) {
            return arrayListEZpvd;
        }
        java.lang.String strAhwBna3 = c54637xPt.AhwBna();
        Intrinsics.copydefault((java.lang.Object) strAhwBna3);
        return c54637xPt.EZpvd(arrayListEZpvd, strAhwBna3);
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C54637xPt c54637xPt, java.util.ArrayList arrayList) {
        pUU.EZpvd("CoinSearchMarketSource", c54637xPt.AEQbTJ + " -> ticker sorted notify ok.");
        Function1<java.util.ArrayList<MarketDataSource>, Unit> function1FJNWhG = c54637xPt.fJNWhG();
        if (function1FJNWhG != null) {
            Intrinsics.copydefault(arrayList);
            function1FJNWhG.invoke(arrayList);
        }
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C54637xPt c54637xPt, java.lang.Throwable th) {
        pUU.AEQbTJ("CoinSearchMarketSource", c54637xPt.AEQbTJ + " -> ticker sorted notify error", th);
        return Unit.INSTANCE;
    }

    public final java.util.ArrayList<MarketDataSource> EZpvd(java.util.List<TradeCoinInfo> list) {
        java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list);
        java.lang.System.currentTimeMillis();
        java.util.ArrayList<MarketDataSource> arrayList = new java.util.ArrayList<>();
        java.util.stream.Stream streamParallelStream = listAxsJAYsNCnLh.parallelStream();
        final Function1 function1 = new Function1() { // from class: o.xPH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54637xPt.copydefault(this.OLrzqt, (TradeCoinInfo) obj);
            }
        };
        java.util.stream.Stream map = streamParallelStream.map(new java.util.function.Function() { // from class: o.xPG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return C54637xPt.AkhnZx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "");
        arrayList.addAll(C59471zhf.OLrzqt(map));
        return arrayList;
    }

    public static final CoinMarketData AkhnZx(Function1 function1, java.lang.Object obj) {
        return (CoinMarketData) function1.invoke(obj);
    }

    public static final CoinMarketData copydefault(C54637xPt c54637xPt, TradeCoinInfo tradeCoinInfo) {
        Intrinsics.copydefault(tradeCoinInfo);
        return c54637xPt.KWHzl(tradeCoinInfo);
    }

    public final CoinMarketData KWHzl(TradeCoinInfo tradeCoinInfo) {
        xSZ xszDjBIcL = djBIcL();
        TickersData tickersDataEZpvd = xszDjBIcL != null ? xszDjBIcL.EZpvd(tradeCoinInfo.getSymbol()) : null;
        CoinMarketData coinMarketData = new CoinMarketData("COIN", tradeCoinInfo.getSymbol(), tradeCoinInfo.getName(), tradeCoinInfo.getSymbol(), tickersDataEZpvd == null ? null : C55692xoj.calApplies$default(C55692xoj.KWHzl, tickersDataEZpvd.getLast(), tickersDataEZpvd.getOpen24h(), tickersDataEZpvd.getSodUtc0(), tickersDataEZpvd.getSodUtc8(), false, 16, null), tickersDataEZpvd != null ? tickersDataEZpvd.getLast() : null, tradeCoinInfo.getUrl(), OLrzqt(new CoinWatchInstrument(tradeCoinInfo.getSymbol(), "COIN")), tradeCoinInfo.getListTime());
        coinMarketData.setHotTag(Intrinsics.EZpvd((java.lang.Object) tradeCoinInfo.getNewTag(), (java.lang.Object) "1"));
        coinMarketData.setDisplayQuoteSymbol(tradeCoinInfo.getDisplaySymbol());
        if (!Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) "41")) {
            coinMarketData.setNewLabel(Intrinsics.EZpvd((java.lang.Object) tradeCoinInfo.getNewLabel(), (java.lang.Object) "1"));
        }
        return coinMarketData;
    }

    public final java.util.ArrayList<TradeCoinInfo> KWHzl(java.util.ArrayList<TradeCoinInfo> arrayList, java.lang.String str) {
        java.util.ArrayList<TradeCoinInfo> arrayList2 = new java.util.ArrayList<>();
        for (TradeCoinInfo tradeCoinInfo : arrayList) {
            if (str == null || str.length() == 0 || tradeCoinInfo.getGroups().contains(str)) {
                arrayList2.add(tradeCoinInfo);
            }
        }
        return arrayList2;
    }

    @Override // o.AbstractC54646xQb
    public void valueOf() {
        super.valueOf();
        pUU.KWHzl("CoinSeaMarketDataSource", "------------------>destroy");
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        xSZ xszDjBIcL = djBIcL();
        if (xszDjBIcL != null) {
            xszDjBIcL.KWHzl();
        }
        this.isConnected.dispose();
        InterfaceC58217yxC interfaceC58217yxC2 = this.fARcdN;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    public final java.util.ArrayList<java.lang.String> gEmmrt() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            arrayList.add(((TradeCoinInfo) it.next()).getSymbol());
        }
        return arrayList;
    }
}
