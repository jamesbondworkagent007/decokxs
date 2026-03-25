package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.trade.model.OptionSourceData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xQg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C54651xQg extends AbstractC54646xQb {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final java.util.ArrayList<OptionInstrument> AEQbTJ;
    public InterfaceC58217yxC AYXKKw;
    public final boolean AhwBna;
    public xSW AkhnZx;
    public java.util.ArrayList<OptionInstrument> DbNXlk;
    public final java.lang.String EZpvd;
    public final java.util.HashMap<java.lang.String, TradeCoinInfo> KWHzl;
    public java.util.ArrayList<OptionInstrument> OLrzqt;
    public final MutableLiveData<SourceResp<AbstractC54646xQb>> djBIcL;
    public InterfaceC58217yxC fetchVPNInfo;
    public InterfaceC58217yxC gEmmrt;
    public InterfaceC58217yxC isConnected;
    public android.util.ArrayMap<java.lang.String, java.lang.String> valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(xSW xsw) {
        this.AkhnZx = xsw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<OptionInstrument> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<SourceResp<AbstractC54646xQb>> djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xSW gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r7v0 java.util.ArrayList)
  (r8v0 java.util.HashMap)
  (r9v0 androidx.lifecycle.MutableLiveData)
  (r10v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("unknown") : (r11v0 java.lang.String))
 A[MD:(java.util.ArrayList<com.okinc.unify_trade.biz.OptionInstrument>, java.util.HashMap<java.lang.String, com.okinc.unify_trade.biz.TradeCoinInfo>, androidx.lifecycle.MutableLiveData<com.okinc.tradeapi.bean.SourceResp<o.xQb>>, boolean, java.lang.String):void (m)] (LINE:31) call: o.xQg.<init>(java.util.ArrayList, java.util.HashMap, androidx.lifecycle.MutableLiveData, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ C54651xQg(java.util.ArrayList arrayList, java.util.HashMap map, MutableLiveData mutableLiveData, boolean z, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, map, mutableLiveData, z, (i & 16) != 0 ? "unknown" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54651xQg(@NotNull java.util.ArrayList<OptionInstrument> arrayList, @NotNull java.util.HashMap<java.lang.String, TradeCoinInfo> map, @NotNull MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, boolean z, @NotNull java.lang.String str) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk = arrayList;
        this.KWHzl = map;
        this.djBIcL = mutableLiveData;
        this.AhwBna = z;
        this.EZpvd = str;
        this.AEQbTJ = new java.util.ArrayList<>();
        this.valueOf = new android.util.ArrayMap<>();
        this.OLrzqt = new java.util.ArrayList<>();
    }

    /* JADX INFO: renamed from: o.xQg$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xQg.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void OLrzqt(@NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.KWHzl("NavOptPhase1", this.EZpvd + " -> OptionMarketDataSource invoke init");
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.xQl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58249yxi
            public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                C54651xQg.AEQbTJ(this.copydefault, interfaceC58251yxk);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.xQo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54651xQg.OLrzqt(this.OLrzqt, function1, (java.lang.String) obj);
            }
        };
        this.gEmmrt = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xQn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54651xQg.fetchVPNInfo(function12, obj);
            }
        });
    }

    public static final void AEQbTJ(C54651xQg c54651xQg, InterfaceC58251yxk interfaceC58251yxk) {
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        java.util.List listFilterMarketInstrument$default = C41428qqd.filterMarketInstrument$default(C41428qqd.OLrzqt, c54651xQg.DbNXlk, false, 2, null);
        java.util.ArrayList<OptionInstrument> arrayList = listFilterMarketInstrument$default instanceof java.util.ArrayList ? (java.util.ArrayList) listFilterMarketInstrument$default : null;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
        }
        c54651xQg.DbNXlk = arrayList;
        interfaceC58251yxk.onNext("");
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final C54651xQg c54651xQg, final Function1 function1, java.lang.String str) {
        pUU.KWHzl("NavOptPhase1", c54651xQg.EZpvd + " -> OptionMarketDataSource optionMarketFilter rx callback");
        c54651xQg.AEQbTJ(new Function1() { // from class: o.xQp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54651xQg.EZpvd(this.KWHzl, function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        c54651xQg.KWHzl(new Function1() { // from class: o.xQm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54651xQg.copydefault(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final C54651xQg c54651xQg, final Function1 function1, boolean z) {
        OptionInstrument optionInstrument = c54651xQg.DbNXlk.get(0);
        Intrinsics.checkNotNullExpressionValue(optionInstrument, "");
        c54651xQg.valueOf.put("instFamily", optionInstrument.getInstFly());
        c54651xQg.valueOf.put(c54651xQg.copydefault("expTime"), null);
        c54651xQg.valueOf.put(c54651xQg.copydefault("stk"), null);
        c54651xQg.valueOf.put(c54651xQg.copydefault("optType"), null);
        java.lang.Object objClone = c54651xQg.DbNXlk.clone();
        Intrinsics.copydefault(objClone, "");
        c54651xQg.OLrzqt = (java.util.ArrayList) objClone;
        c54651xQg.EZpvd(new Function1() { // from class: o.xQE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54651xQg.OLrzqt(this.OLrzqt, function1, (java.util.ArrayList) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C54651xQg c54651xQg, Function1 function1, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        c54651xQg.AkhnZx();
        function1.invoke(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final C54651xQg c54651xQg, int i) {
        c54651xQg.AEQbTJ(new Function1() { // from class: o.xQA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54651xQg.AEQbTJ(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C54651xQg c54651xQg, boolean z) {
        c54651xQg.AhwBna();
        return Unit.INSTANCE;
    }

    public void AkhnZx() {
        xSW xsw = this.AkhnZx;
        if (xsw != null) {
            xsw.djBIcL();
        }
        this.AkhnZx = new xSW(this.AEQbTJ, new Function2() { // from class: o.xQD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C54651xQg.OLrzqt(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        }, this.djBIcL, this.AhwBna);
    }

    public static final Unit OLrzqt(C54651xQg c54651xQg, boolean z, java.lang.Exception exc) {
        java.lang.String message;
        if (z) {
            c54651xQg.AhwBna();
        } else {
            Function1<java.lang.String, Unit> function1FIwbmz = c54651xQg.fIwbmz();
            if (function1FIwbmz != null) {
                if (exc == null || (message = exc.getMessage()) == null) {
                    message = "";
                }
                function1FIwbmz.invoke(message);
            }
        }
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        xSW xsw = this.AkhnZx;
        if (xsw == null || !xsw.gEmmrt()) {
            return;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.fetchVPNInfo;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        DbNXlk();
    }

    public final void KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 == null || str2.length() == 0) {
            str2 = null;
        }
        if (str3 == null || str3.length() == 0) {
            str3 = null;
        }
        if (str4 == null || str4.length() == 0) {
            str4 = null;
        }
        pUU.KWHzl("OptionMarketDataSource", "==========>instFly:" + str);
        this.valueOf.put("instFamily", str);
        this.valueOf.put(copydefault("expTime"), str2);
        this.valueOf.put(copydefault("stk"), str3);
        this.valueOf.put(copydefault("optType"), str4);
        AhwBna(new Function1() { // from class: o.xQj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54651xQg.copydefault(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit copydefault(C54651xQg c54651xQg, boolean z) {
        c54651xQg.AhwBna();
        return Unit.INSTANCE;
    }

    public void djBIcL(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) str)) {
            return;
        }
        this.values = str;
        AhwBna();
    }

    private final java.util.ArrayList<MarketDataSource> KWHzl(java.util.ArrayList<OptionInstrument> arrayList) {
        java.lang.String last;
        java.util.ArrayList<OptionInstrument> arrayList2 = new java.util.ArrayList(arrayList);
        java.util.ArrayList<MarketDataSource> arrayList3 = new java.util.ArrayList<>();
        for (OptionInstrument optionInstrument : arrayList2) {
            xSW xsw = this.AkhnZx;
            java.lang.String last2 = null;
            TickersData tickersDataKWHzl = xsw != null ? xsw.KWHzl(optionInstrument.getInstId()) : null;
            xSW xsw2 = this.AkhnZx;
            TickersData tickersDataCopydefault = xsw2 != null ? xsw2.copydefault(optionInstrument.getTradeSymbol()) : null;
            java.lang.String instType = optionInstrument.getInstType();
            java.lang.String instId = optionInstrument.getInstId();
            java.lang.String strCopydefault = xMR.copydefault.copydefault(optionInstrument.getStk());
            java.lang.String optType = optionInstrument.getOptType();
            java.lang.String instFamily = optionInstrument.getInstFamily();
            java.lang.String strCopydefault2 = TaskDescription.AEQbTJ(optionInstrument.getUly()).copydefault();
            java.util.Locale locale = java.util.Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = strCopydefault2.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            java.lang.String volCcy24h = tickersDataKWHzl != null ? tickersDataKWHzl.getVolCcy24h() : null;
            java.lang.String vol24h = tickersDataKWHzl != null ? tickersDataKWHzl.getVol24h() : null;
            kotlin.Pair pairCalApplies$default = tickersDataKWHzl == null ? null : C55692xoj.calApplies$default(C55692xoj.KWHzl, tickersDataKWHzl.getLast(), tickersDataKWHzl.getOpen24h(), tickersDataKWHzl.getSodUtc0(), tickersDataKWHzl.getSodUtc8(), false, 16, null);
            if (tickersDataKWHzl == null || (last = tickersDataKWHzl.getLast()) == null) {
                last = "";
            }
            if (tickersDataCopydefault != null) {
                last2 = tickersDataCopydefault.getLast();
            }
            Intrinsics.copydefault(optionInstrument);
            OptionSourceData optionSourceData = new OptionSourceData(instType, instId, instFamily, upperCase, volCcy24h, vol24h, pairCalApplies$default, last, last2, "", strCopydefault, optType, OLrzqt(optionInstrument));
            xUW xuw = xUW.KWHzl;
            optionSourceData.setSortTurnover(java.lang.Double.valueOf(xuw.KWHzl(optionSourceData)));
            optionSourceData.setSortVolume(xuw.OLrzqt(optionSourceData));
            arrayList3.add(optionSourceData);
        }
        return arrayList3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xQg */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void filter$default(C54651xQg c54651xQg, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: filter");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        c54651xQg.AhwBna(function1);
    }

    private final void AhwBna(final Function1<? super java.lang.Boolean, Unit> function1) {
        InterfaceC58217yxC interfaceC58217yxC = this.isConnected;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just("");
        final Function1 function12 = new Function1() { // from class: o.xQe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54651xQg.EZpvd(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.xQf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C54651xQg.DbNXlk(function12, obj);
            }
        }).subscribeOn(yBP.EZpvd()).observeOn(C58266yxz.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.xQq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54651xQg.AEQbTJ(function1, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xQz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54651xQg.fIwbmz(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.xQy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54651xQg.copydefault(function1, (java.lang.Throwable) obj);
            }
        };
        this.isConnected = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xQx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54651xQg.values(function14, obj);
            }
        });
    }

    public static final java.lang.Boolean DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean EZpvd(C54651xQg c54651xQg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = c54651xQg.valueOf.get("instFamily");
        java.lang.String str3 = c54651xQg.valueOf.get(c54651xQg.copydefault("expTime"));
        java.lang.String str4 = c54651xQg.valueOf.get(c54651xQg.copydefault("stk"));
        java.lang.String str5 = c54651xQg.valueOf.get(c54651xQg.copydefault("optType"));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (OptionInstrument optionInstrument : c54651xQg.OLrzqt) {
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) optionInstrument.getInstFly()) && (str3 == null || str3.length() == 0 || Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) optionInstrument.getExpTime()))) {
                if (str4 == null || str4.length() == 0 || Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) optionInstrument.getStk())) {
                    if (str5 == null || str5.length() == 0 || Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) optionInstrument.getOptType())) {
                        arrayList.add(optionInstrument);
                    }
                }
            }
        }
        c54651xQg.AEQbTJ.clear();
        return java.lang.Boolean.valueOf(c54651xQg.AEQbTJ.addAll(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Function1 function1, java.lang.Boolean bool) {
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function1 function1, java.lang.Throwable th) {
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xQg */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initFilter$default(C54651xQg c54651xQg, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initFilter");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        c54651xQg.EZpvd((Function1<? super java.util.ArrayList<OptionInstrument>, Unit>) function1);
    }

    public final void EZpvd(final Function1<? super java.util.ArrayList<OptionInstrument>, Unit> function1) {
        InterfaceC58217yxC interfaceC58217yxC = this.AYXKKw;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just("");
        final Function1 function12 = new Function1() { // from class: o.xQv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54651xQg.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.xQt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C54651xQg.isConnected(function12, obj);
            }
        }).subscribeOn(yBP.EZpvd()).observeOn(C58266yxz.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.xQu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54651xQg.copydefault(function1, this, (Unit) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xQr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54651xQg.AkhnZx(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.xQs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54651xQg.EZpvd(function1, this, (java.lang.Throwable) obj);
            }
        };
        this.AYXKKw = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xQw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54651xQg.AuCTel(function14, obj);
            }
        });
    }

    public static final Unit isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit KWHzl(C54651xQg c54651xQg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = c54651xQg.valueOf.get("instFamily");
        java.lang.String str3 = c54651xQg.valueOf.get(c54651xQg.copydefault("expTime"));
        java.lang.String str4 = c54651xQg.valueOf.get(c54651xQg.copydefault("stk"));
        java.lang.String str5 = c54651xQg.valueOf.get(c54651xQg.copydefault("optType"));
        for (OptionInstrument optionInstrument : c54651xQg.OLrzqt) {
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) optionInstrument.getInstFly()) && (str3 == null || str3.length() == 0 || Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) optionInstrument.getExpTime()))) {
                if (str4 == null || str4.length() == 0 || Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) optionInstrument.getStk())) {
                    if (str5 == null || str5.length() == 0 || Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) optionInstrument.getOptType())) {
                        c54651xQg.AEQbTJ.add(optionInstrument);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function1 function1, C54651xQg c54651xQg, Unit unit) {
        if (function1 != null) {
            function1.invoke(c54651xQg.AEQbTJ);
        }
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function1 function1, C54651xQg c54651xQg, java.lang.Throwable th) {
        if (function1 != null) {
            function1.invoke(c54651xQg.AEQbTJ);
        }
        return Unit.INSTANCE;
    }

    public final void DbNXlk() {
        xSW xsw;
        synchronized (this) {
            pUU.KWHzl("NavOptPhase1", this.EZpvd + " -> OptionMarketDataSource sortByTicker invoke start..");
            if (!this.djBIcL.hasActiveObservers() && (xsw = this.AkhnZx) != null) {
                xsw.djBIcL();
            }
            InterfaceC58217yxC interfaceC58217yxC = this.fetchVPNInfo;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just("");
            final Function1 function1 = new Function1() { // from class: o.xQC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54651xQg.AYXKKw(this.EZpvd, (java.lang.String) obj);
                }
            };
            AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.xQB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C54651xQg.ejfBZ(function1, obj);
                }
            }).subscribeOn(yBP.EZpvd()).observeOn(C58266yxz.OLrzqt());
            final Function1 function12 = new Function1() { // from class: o.xQd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54651xQg.KWHzl(this.EZpvd, (java.util.ArrayList) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xQk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C54651xQg.fARcdN(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.xQh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54651xQg.AEQbTJ((java.lang.Throwable) obj);
                }
            };
            this.fetchVPNInfo = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xQi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C54651xQg.fJNWhG(function13, obj);
                }
            });
        }
    }

    public static final java.util.ArrayList ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final java.util.ArrayList AYXKKw(C54651xQg c54651xQg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<MarketDataSource> arrayListKWHzl = c54651xQg.KWHzl(c54651xQg.AEQbTJ);
        java.lang.String str2 = c54651xQg.values;
        if (str2 == null || str2.length() == 0) {
            return arrayListKWHzl;
        }
        java.lang.String str3 = c54651xQg.values;
        Intrinsics.copydefault((java.lang.Object) str3);
        return c54651xQg.EZpvd(arrayListKWHzl, str3);
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C54651xQg c54651xQg, java.util.ArrayList arrayList) {
        pUU.KWHzl("NavOptPhase1", c54651xQg.EZpvd + " -> OptionMarketDataSource sortByTicker callback ...");
        Function1<java.util.ArrayList<MarketDataSource>, Unit> function1FJNWhG = c54651xQg.fJNWhG();
        if (function1FJNWhG != null) {
            Intrinsics.copydefault(arrayList);
            function1FJNWhG.invoke(arrayList);
        }
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        C6777aVl.Companion.EZpvd(new java.lang.Exception("OptionMarketDataSource:" + th.getMessage()));
        return Unit.INSTANCE;
    }

    public final java.util.List<java.lang.String> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = this.valueOf.get(copydefault("expTime"));
        java.util.ArrayList<OptionInstrument> arrayList = this.DbNXlk;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            OptionInstrument optionInstrument = (OptionInstrument) obj;
            if (Intrinsics.EZpvd((java.lang.Object) optionInstrument.getInstFly(), (java.lang.Object) str) && (str2 == null || str2.length() == 0 || Intrinsics.EZpvd((java.lang.Object) optionInstrument.getExpTime(), (java.lang.Object) str2))) {
                arrayList2.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj2 : arrayList2) {
            java.lang.String stk = ((OptionInstrument) obj2).getStk();
            java.lang.Object arrayList3 = linkedHashMap.get(stk);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                linkedHashMap.put(stk, arrayList3);
            }
            ((java.util.List) arrayList3).add(obj2);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(linkedHashMap.size());
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList4.add((java.lang.String) ((Map.Entry) it.next()).getKey());
        }
        return arrayList4;
    }

    public final java.util.List<java.lang.String> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = this.valueOf.get(copydefault("expTime"));
        java.util.ArrayList<OptionInstrument> arrayList = this.DbNXlk;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            OptionInstrument optionInstrument = (OptionInstrument) obj;
            if (Intrinsics.EZpvd((java.lang.Object) optionInstrument.getInstFly(), (java.lang.Object) str) && (str2 == null || str2.length() == 0 || Intrinsics.EZpvd((java.lang.Object) optionInstrument.getExpTime(), (java.lang.Object) str2))) {
                arrayList2.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj2 : arrayList2) {
            java.lang.String optType = ((OptionInstrument) obj2).getOptType();
            java.lang.Object arrayList3 = linkedHashMap.get(optType);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                linkedHashMap.put(optType, arrayList3);
            }
            ((java.util.List) arrayList3).add(obj2);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(linkedHashMap.size());
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList4.add((java.lang.String) ((Map.Entry) it.next()).getKey());
        }
        return arrayList4;
    }

    @Override // o.AbstractC54646xQb
    public void valueOf() {
        super.valueOf();
        pUU.KWHzl("OptionMarketDataSource", "------------------>destroy");
        InterfaceC58217yxC interfaceC58217yxC = this.AYXKKw;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.isConnected;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC3 = this.gEmmrt;
        if (interfaceC58217yxC3 != null) {
            interfaceC58217yxC3.dispose();
        }
        xSW xsw = this.AkhnZx;
        if (xsw != null) {
            xsw.djBIcL();
        }
        InterfaceC58217yxC interfaceC58217yxC4 = this.fetchVPNInfo;
        if (interfaceC58217yxC4 != null) {
            interfaceC58217yxC4.dispose();
        }
    }

    public final java.lang.String copydefault(java.lang.String str) {
        return this.valueOf.get("instFamily") + "-" + str;
    }

    public final java.util.List<java.lang.String> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<OptionInstrument> arrayList = this.DbNXlk;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (Intrinsics.EZpvd((java.lang.Object) ((OptionInstrument) obj).getInstFly(), (java.lang.Object) str)) {
                arrayList2.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj2 : arrayList2) {
            java.lang.String expTime = ((OptionInstrument) obj2).getExpTime();
            java.lang.Object arrayList3 = linkedHashMap.get(expTime);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                linkedHashMap.put(expTime, arrayList3);
            }
            ((java.util.List) arrayList3).add(obj2);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(linkedHashMap.size());
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList4.add((java.lang.String) ((Map.Entry) it.next()).getKey());
        }
        return arrayList4;
    }
}
