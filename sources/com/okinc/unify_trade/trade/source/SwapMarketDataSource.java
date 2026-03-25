package com.okinc.unify_trade.trade.source;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.trade.model.FutureSourceData;
import com.okinc.unify_trade.trade.model.SwapSourceData;
import com.okinc.unify_trade.trade.source.SwapMarketDataSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54646xQb;
import o.AbstractC58247yxg;
import o.C33129mqd;
import o.C41428qqd;
import o.C55608xnE;
import o.C55692xoj;
import o.C56444yFp;
import o.C58266yxz;
import o.C6777aVl;
import o.InterfaceC54581xNr;
import o.InterfaceC54726xTa;
import o.InterfaceC56445yFq;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC58249yxi;
import o.InterfaceC58251yxk;
import o.TaskDescription;
import o.pUU;
import o.pWO;
import o.xSN;
import o.xUW;
import o.yBP;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public class SwapMarketDataSource extends AbstractC54646xQb {
    public final HashMap<String, TradeCoinInfo> AEQbTJ;
    public String AYXKKw;
    public InterfaceC58217yxC AhwBna;
    public InterfaceC54726xTa AkhnZx;
    public List<SwapInstrument> AuCTel;
    public InterfaceC58217yxC DbNXlk;
    public RuleType EZpvd;
    public final String KWHzl;
    public List<FutureInstrument> OLrzqt;
    public final ArrayList<BizInstrument> copydefault;
    public String djBIcL;
    public String fetchVPNInfo;
    public final MutableLiveData<SourceResp<AbstractC54646xQb>> gEmmrt;
    public InterfaceC58217yxC isConnected;
    public final boolean valueOf;
    public String values;

    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RuleType.values().length];
            try {
                iArr[RuleType.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RuleType.PREMARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RuleType.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SwapInstrument> AYXKKw() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<SourceResp<AbstractC54646xQb>> AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FutureInstrument> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(InterfaceC54726xTa interfaceC54726xTa) {
        this.AkhnZx = interfaceC54726xTa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC54726xTa djBIcL() {
        return this.AkhnZx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwapMarketDataSource(@NotNull List<SwapInstrument> list, @NotNull List<FutureInstrument> list2, @NotNull HashMap<String, TradeCoinInfo> map, @NotNull MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, boolean z, @NotNull String str) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AuCTel = list;
        this.OLrzqt = list2;
        this.AEQbTJ = map;
        this.gEmmrt = mutableLiveData;
        this.valueOf = z;
        this.KWHzl = str;
        this.copydefault = new ArrayList<>();
        this.values = gEmmrt();
        this.EZpvd = RuleType.ALL;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class RuleType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ RuleType[] $VALUES;
        private final String typeName;
        public static final RuleType NORMAL = new RuleType("NORMAL", 0, "normal");
        public static final RuleType PREMARKET = new RuleType("PREMARKET", 1, "pre_market");
        public static final RuleType ALL = new RuleType("ALL", 2, "all");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ RuleType[] $values() {
            return new RuleType[]{NORMAL, PREMARKET, ALL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<RuleType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTypeName() {
            return this.typeName;
        }

        private RuleType(String str, int i, String str2) {
            this.typeName = str2;
        }

        static {
            RuleType[] ruleTypeArr$values = $values();
            $VALUES = ruleTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(ruleTypeArr$values);
        }

        public static RuleType valueOf(String str) {
            return (RuleType) Enum.valueOf(RuleType.class, str);
        }

        public static RuleType[] values() {
            return (RuleType[]) $VALUES.clone();
        }
    }

    public final String gEmmrt() {
        List<FutureGroupInfo> listFARcdN;
        FutureGroupInfo futureGroupInfo;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (!C33129mqd.KWHzl((Collection) (interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.fARcdN() : null))) {
            return "USD";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null || (listFARcdN = interfaceC54581xNrOLrzqt2.fARcdN()) == null || (futureGroupInfo = listFARcdN.get(0)) == null) {
            return null;
        }
        return futureGroupInfo.getCcyType();
    }

    public final void EZpvd(@NotNull final Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.KWHzl("NavOptPhase1", this.KWHzl + " -> SwapMarketDataSource invoke init");
        InterfaceC58217yxC interfaceC58217yxC = this.AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.xRg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58249yxi
            public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                SwapMarketDataSource.AEQbTJ(this.OLrzqt, interfaceC58251yxk);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.xRx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapMarketDataSource.copydefault(this.copydefault, function1, (java.lang.String) obj);
            }
        };
        this.AhwBna = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xRy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                SwapMarketDataSource.isConnected(function12, obj);
            }
        });
    }

    public static final void AEQbTJ(SwapMarketDataSource swapMarketDataSource, InterfaceC58251yxk interfaceC58251yxk) {
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        C41428qqd c41428qqd = C41428qqd.OLrzqt;
        List<SwapInstrument> listFilterMarketInstrument$default = C41428qqd.filterMarketInstrument$default(c41428qqd, swapMarketDataSource.AuCTel, false, 2, null);
        if (listFilterMarketInstrument$default == null) {
            listFilterMarketInstrument$default = new ArrayList<>();
        }
        swapMarketDataSource.AuCTel = listFilterMarketInstrument$default;
        List<FutureInstrument> listFilterMarketInstrument$default2 = C41428qqd.filterMarketInstrument$default(c41428qqd, swapMarketDataSource.OLrzqt, false, 2, null);
        if (listFilterMarketInstrument$default2 == null) {
            listFilterMarketInstrument$default2 = new ArrayList<>();
        }
        swapMarketDataSource.OLrzqt = listFilterMarketInstrument$default2;
        interfaceC58251yxk.onNext("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isConnected(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final SwapMarketDataSource swapMarketDataSource, final Function1 function1, String str) {
        pUU.KWHzl("NavOptPhase1", swapMarketDataSource.KWHzl + " -> SwapMarketDataSource spotFilterInstrument rx callback");
        swapMarketDataSource.AEQbTJ(new Function1() { // from class: o.xRu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapMarketDataSource.OLrzqt(this.KWHzl, function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        swapMarketDataSource.KWHzl(new Function1() { // from class: o.xRw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapMarketDataSource.AEQbTJ(this.EZpvd, ((java.lang.Integer) obj).intValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final SwapMarketDataSource swapMarketDataSource, final Function1 function1, boolean z) {
        pUU.KWHzl("NavOptPhase1", swapMarketDataSource.KWHzl + " -> SwapMarketDataSource loadWatchList 01 callback");
        swapMarketDataSource.OLrzqt(new Function1() { // from class: o.xRn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapMarketDataSource.EZpvd(this.AEQbTJ, function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(SwapMarketDataSource swapMarketDataSource, Function1 function1, boolean z) {
        pUU.KWHzl("NavOptPhase1", swapMarketDataSource.KWHzl + " -> SwapMarketDataSource filter callback");
        swapMarketDataSource.uzCIH();
        function1.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final SwapMarketDataSource swapMarketDataSource, int i) {
        pUU.KWHzl("NavOptPhase1", swapMarketDataSource.KWHzl + " -> SwapMarketDataSource notifyWatch callback");
        swapMarketDataSource.AEQbTJ(new Function1() { // from class: o.xRf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapMarketDataSource.KWHzl(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final class Activity<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            BizInstrument bizInstrument = (BizInstrument) t;
            BizInstrument bizInstrument2 = (BizInstrument) t2;
            return yET.KWHzl(Integer.valueOf((bizInstrument.isPreMarketPair() || bizInstrument.isRebasePair()) ? 0 : 1), Integer.valueOf((bizInstrument2.isPreMarketPair() || bizInstrument2.isRebasePair()) ? 0 : 1));
        }
    }

    public static final Unit KWHzl(SwapMarketDataSource swapMarketDataSource, boolean z) {
        pUU.KWHzl("NavOptPhase1", swapMarketDataSource.KWHzl + " -> SwapMarketDataSource loadWatchList 02 callback");
        swapMarketDataSource.ejfBZ();
        return Unit.INSTANCE;
    }

    public final void ejfBZ() {
        InterfaceC54726xTa interfaceC54726xTa = this.AkhnZx;
        if (interfaceC54726xTa == null || !interfaceC54726xTa.copydefault()) {
            return;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.isConnected;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        getFieldNames();
    }

    private final void uzCIH() {
        pUU.KWHzl("NavOptPhase1", this.KWHzl + " -> SwapMarketDataSource startRegisterDataSource invoke");
        DbNXlk();
    }

    public void DbNXlk() {
        InterfaceC54726xTa interfaceC54726xTa = this.AkhnZx;
        if (interfaceC54726xTa != null) {
            interfaceC54726xTa.KWHzl();
        }
        this.AkhnZx = new xSN("SWAP", this.AuCTel, new Function2() { // from class: o.xRz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SwapMarketDataSource.OLrzqt(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        }, this.gEmmrt, this.valueOf);
    }

    public static final Unit OLrzqt(SwapMarketDataSource swapMarketDataSource, boolean z, Exception exc) {
        String message;
        if (z) {
            swapMarketDataSource.ejfBZ();
        } else {
            Function1<String, Unit> function1FIwbmz = swapMarketDataSource.fIwbmz();
            if (function1FIwbmz != null) {
                if (exc == null || (message = exc.getMessage()) == null) {
                    message = "";
                }
                function1FIwbmz.invoke(message);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setFilterCondition$default(SwapMarketDataSource swapMarketDataSource, String str, String str2, String str3, RuleType ruleType, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFilterCondition");
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            ruleType = RuleType.NORMAL;
        }
        swapMarketDataSource.KWHzl(str, str2, str3, ruleType);
    }

    public final void KWHzl(@NotNull String str, String str2, String str3, @NotNull RuleType ruleType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(ruleType, "");
        if (Intrinsics.EZpvd((Object) this.values, (Object) str) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) str2) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) str3)) {
            return;
        }
        this.values = str;
        this.djBIcL = str2;
        this.AYXKKw = str3;
        this.EZpvd = ruleType;
        filter$default(this, null, 1, null);
    }

    public void EZpvd(String str) {
        if (Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) str)) {
            return;
        }
        this.fetchVPNInfo = str;
        ejfBZ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.trade.source.SwapMarketDataSource */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void filter$default(SwapMarketDataSource swapMarketDataSource, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: filter");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        swapMarketDataSource.OLrzqt((Function1<? super Boolean, Unit>) function1);
    }

    private final void OLrzqt(final Function1<? super Boolean, Unit> function1) {
        InterfaceC58217yxC interfaceC58217yxC = this.DbNXlk;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just("");
        final Function1 function12 = new Function1() { // from class: o.xRA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapMarketDataSource.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.xRB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return SwapMarketDataSource.djBIcL(function12, obj);
            }
        }).subscribeOn(yBP.EZpvd()).observeOn(C58266yxz.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.xRC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapMarketDataSource.copydefault(this.copydefault, function1, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xRl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                SwapMarketDataSource.gEmmrt(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.xRm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapMarketDataSource.copydefault(function1, (java.lang.Throwable) obj);
            }
        };
        this.DbNXlk = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xRk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                SwapMarketDataSource.AhwBna(function14, obj);
            }
        });
    }

    public static final List djBIcL(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static final List KWHzl(SwapMarketDataSource swapMarketDataSource, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("NavOptPhase1", swapMarketDataSource.KWHzl + " -> SwapMarketDataSource filterByType invoke");
        return swapMarketDataSource.copydefault(swapMarketDataSource.AuCTel, swapMarketDataSource.OLrzqt);
    }

    public static final void gEmmrt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(SwapMarketDataSource swapMarketDataSource, Function1 function1, List list) {
        pUU.KWHzl("NavOptPhase1", swapMarketDataSource.KWHzl + " -> SwapMarketDataSource filterByType rx callback");
        swapMarketDataSource.copydefault.clear();
        swapMarketDataSource.copydefault.addAll(list);
        swapMarketDataSource.ejfBZ();
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function1 function1, Throwable th) {
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        C6777aVl.Companion.EZpvd(new Exception("SwapMarketDataSource:" + th.getMessage()));
        return Unit.INSTANCE;
    }

    private final void getFieldNames() {
        InterfaceC54726xTa interfaceC54726xTa;
        synchronized (this) {
            pUU.KWHzl("NavOptPhase1", this.KWHzl + " -> SwapMarketDataSource sortTicker invoke start..");
            if (!this.gEmmrt.hasActiveObservers() && (interfaceC54726xTa = this.AkhnZx) != null) {
                interfaceC54726xTa.KWHzl();
            }
            InterfaceC58217yxC interfaceC58217yxC = this.isConnected;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just("");
            final Function1 function1 = new Function1() { // from class: o.xRo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapMarketDataSource.EZpvd(this.EZpvd, (java.lang.String) obj);
                }
            };
            AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.xRt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return SwapMarketDataSource.fetchVPNInfo(function1, obj);
                }
            }).subscribeOn(yBP.EZpvd()).observeOn(C58266yxz.OLrzqt());
            final Function1 function12 = new Function1() { // from class: o.xRs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapMarketDataSource.EZpvd(this.KWHzl, (java.util.ArrayList) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xRp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    SwapMarketDataSource.DbNXlk(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.xRr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapMarketDataSource.KWHzl((java.lang.Throwable) obj);
                }
            };
            this.isConnected = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xRq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    SwapMarketDataSource.values(function13, obj);
                }
            });
        }
    }

    public static final ArrayList fetchVPNInfo(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ArrayList) function1.invoke(obj);
    }

    public static final ArrayList EZpvd(SwapMarketDataSource swapMarketDataSource, String str) {
        ArrayList<MarketDataSource> arrayListOLrzqt;
        String str2;
        Intrinsics.checkNotNullParameter(str, "");
        ArrayList<MarketDataSource> arrayListCopydefault = swapMarketDataSource.copydefault(swapMarketDataSource.copydefault);
        if (Intrinsics.EZpvd((Object) swapMarketDataSource.djBIcL, (Object) "41") && ((str2 = swapMarketDataSource.fetchVPNInfo) == null || str2.length() == 0)) {
            swapMarketDataSource.fetchVPNInfo = "coins_new_sort";
        }
        String str3 = swapMarketDataSource.fetchVPNInfo;
        if (str3 == null || str3.length() == 0) {
            arrayListOLrzqt = swapMarketDataSource.OLrzqt(arrayListCopydefault);
        } else {
            String str4 = swapMarketDataSource.fetchVPNInfo;
            Intrinsics.copydefault((Object) str4);
            arrayListOLrzqt = swapMarketDataSource.EZpvd(arrayListCopydefault, str4);
        }
        if (Intrinsics.EZpvd((Object) swapMarketDataSource.values, (Object) "USD")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : arrayListOLrzqt) {
                String baseSymbol = ((MarketDataSource) obj).getBaseSymbol();
                Object arrayList = linkedHashMap.get(baseSymbol);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(baseSymbol, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            Set setEntrySet = linkedHashMap.entrySet();
            arrayListOLrzqt = new ArrayList<>();
            Iterator it = setEntrySet.iterator();
            while (it.hasNext()) {
                arrayListOLrzqt.addAll((Collection) ((Map.Entry) it.next()).getValue());
            }
        }
        return arrayListOLrzqt;
    }

    public static final void DbNXlk(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(SwapMarketDataSource swapMarketDataSource, ArrayList arrayList) {
        pUU.KWHzl("NavOptPhase1", swapMarketDataSource.KWHzl + " -> SwapMarketDataSource sortTicker callback ...");
        Function1<ArrayList<MarketDataSource>, Unit> function1FJNWhG = swapMarketDataSource.fJNWhG();
        if (function1FJNWhG != null) {
            Intrinsics.copydefault(arrayList);
            function1FJNWhG.invoke(arrayList);
        }
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Throwable th) {
        C6777aVl.Companion.EZpvd(new Exception("SwapMarketDataSource:" + th.getMessage()));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC54646xQb
    public void valueOf() {
        super.valueOf();
        pUU.KWHzl("SwapMarketDataSource", "------------------>destroy");
        InterfaceC58217yxC interfaceC58217yxC = this.AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC54726xTa interfaceC54726xTa = this.AkhnZx;
        if (interfaceC54726xTa != null) {
            interfaceC54726xTa.KWHzl();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.isConnected;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC3 = this.DbNXlk;
        if (interfaceC58217yxC3 != null) {
            interfaceC58217yxC3.dispose();
        }
    }

    public final List<BizInstrument> copydefault(List<SwapInstrument> list, List<FutureInstrument> list2) {
        List<FutureInstrument> listAEQbTJ = AEQbTJ(list2, this.EZpvd);
        int i = StateListAnimator.AEQbTJ[this.EZpvd.ordinal()];
        if (i == 1) {
            return OLrzqt(list, listAEQbTJ);
        }
        if (i == 2) {
            return listAEQbTJ;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return CollectionsKt___CollectionsKt.EZpvd(OLrzqt(list, listAEQbTJ), new Activity());
    }

    public final List<BizInstrument> OLrzqt(List<SwapInstrument> list, List<FutureInstrument> list2) {
        String str;
        ArrayList<String> groups;
        String str2;
        ArrayList<String> groups2;
        ArrayList arrayList = new ArrayList();
        String str3 = this.AYXKKw;
        if (str3 == null || str3.length() == 0 || Intrinsics.EZpvd((Object) this.AYXKKw, (Object) "SWAP")) {
            for (SwapInstrument swapInstrument : list) {
                HashMap<String, TradeCoinInfo> map = this.AEQbTJ;
                String strCopydefault = TaskDescription.AEQbTJ(swapInstrument.getInstFly()).copydefault();
                Locale locale = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String upperCase = strCopydefault.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                TradeCoinInfo tradeCoinInfo = map.get(upperCase);
                if (Intrinsics.EZpvd((Object) this.values, (Object) swapInstrument.getCcyType()) && ((str = this.djBIcL) == null || str.length() == 0 || (tradeCoinInfo != null && (groups = tradeCoinInfo.getGroups()) != null && CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) groups), this.djBIcL)))) {
                    arrayList.add(swapInstrument);
                }
            }
        }
        String str4 = this.AYXKKw;
        if (str4 == null || str4.length() == 0 || Intrinsics.EZpvd((Object) this.AYXKKw, (Object) "FUTURES")) {
            for (FutureInstrument futureInstrument : list2) {
                HashMap<String, TradeCoinInfo> map2 = this.AEQbTJ;
                String strCopydefault2 = TaskDescription.AEQbTJ(futureInstrument.getInstFly()).copydefault();
                Locale locale2 = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                String upperCase2 = strCopydefault2.toUpperCase(locale2);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                TradeCoinInfo tradeCoinInfo2 = map2.get(upperCase2);
                if (Intrinsics.EZpvd((Object) this.values, (Object) futureInstrument.getCcyType()) && ((str2 = this.djBIcL) == null || str2.length() == 0 || (tradeCoinInfo2 != null && (groups2 = tradeCoinInfo2.getGroups()) != null && CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) groups2), this.djBIcL)))) {
                    arrayList.add(futureInstrument);
                }
            }
        }
        if (!Intrinsics.EZpvd((Object) this.values, (Object) "USD")) {
            return arrayList;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String tradeSymbol = ((BizInstrument) obj).getTradeSymbol();
            Object arrayList2 = linkedHashMap.get(tradeSymbol);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(tradeSymbol, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        Set setEntrySet = linkedHashMap.entrySet();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            arrayList3.addAll((Collection) ((Map.Entry) it.next()).getValue());
        }
        return arrayList3;
    }

    private final ArrayList<MarketDataSource> copydefault(ArrayList<BizInstrument> arrayList) {
        List<BizInstrument> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
        ArrayList<MarketDataSource> arrayList2 = new ArrayList<>();
        for (BizInstrument bizInstrument : listAxsJAYsNCnLh) {
            if (bizInstrument instanceof SwapInstrument) {
                OLrzqt((SwapInstrument) bizInstrument, arrayList2);
            } else if (bizInstrument instanceof FutureInstrument) {
                EZpvd((FutureInstrument) bizInstrument, arrayList2);
            }
        }
        return arrayList2;
    }

    public final void EZpvd(FutureInstrument futureInstrument, ArrayList<MarketDataSource> arrayList) {
        InterfaceC54726xTa interfaceC54726xTa = this.AkhnZx;
        TickersData tickersDataCopydefault = interfaceC54726xTa != null ? interfaceC54726xTa.copydefault(futureInstrument.getInstId()) : null;
        InterfaceC54726xTa interfaceC54726xTa2 = this.AkhnZx;
        TickersData tickersDataEZpvd = interfaceC54726xTa2 != null ? interfaceC54726xTa2.EZpvd(futureInstrument.getTradeSymbol()) : null;
        InterfaceC54726xTa interfaceC54726xTa3 = this.AkhnZx;
        TickersData tickersDataEZpvd2 = interfaceC54726xTa3 != null ? interfaceC54726xTa3.EZpvd(futureInstrument.getQuoteSymbol()) : null;
        String instType = futureInstrument.getInstType();
        String instId = futureInstrument.getInstId();
        String instFamily = futureInstrument.getInstFamily();
        String strCopydefault = TaskDescription.AEQbTJ(futureInstrument.getInstFly()).copydefault();
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String upperCase = strCopydefault.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        FutureSourceData futureSourceData = new FutureSourceData(instType, instId, instFamily, upperCase, tickersDataCopydefault != null ? tickersDataCopydefault.getVolCcy24h() : null, tickersDataCopydefault != null ? tickersDataCopydefault.getVol24h() : null, tickersDataCopydefault == null ? null : C55692xoj.calApplies$default(C55692xoj.KWHzl, tickersDataCopydefault.getLast(), tickersDataCopydefault.getOpen24h(), tickersDataCopydefault.getSodUtc0(), tickersDataCopydefault.getSodUtc8(), false, 16, null), tickersDataCopydefault != null ? tickersDataCopydefault.getLast() : null, tickersDataEZpvd != null ? tickersDataEZpvd.getLast() : null, "", futureInstrument.getCtType(), futureInstrument.getAlias(), OLrzqt(futureInstrument), false, false, null, 57344, null);
        if (futureInstrument.isPreMarketPair()) {
            futureSourceData.setPreMarket(true);
        }
        futureSourceData.setQuoteCupTickerPrice(tickersDataEZpvd2 != null ? tickersDataEZpvd2.getLast() : null);
        futureSourceData.setHotTag(futureInstrument.isNewTag());
        futureSourceData.setNewLabel(futureInstrument.isNewLabel());
        xUW xuw = xUW.KWHzl;
        futureSourceData.setSortTurnover(Double.valueOf(xuw.KWHzl(futureSourceData)));
        futureSourceData.setSortVolume(xuw.OLrzqt(futureSourceData));
        arrayList.add(futureSourceData);
    }

    public final void OLrzqt(SwapInstrument swapInstrument, ArrayList<MarketDataSource> arrayList) {
        InterfaceC54726xTa interfaceC54726xTa = this.AkhnZx;
        TickersData tickersDataCopydefault = interfaceC54726xTa != null ? interfaceC54726xTa.copydefault(swapInstrument.getInstId()) : null;
        InterfaceC54726xTa interfaceC54726xTa2 = this.AkhnZx;
        TickersData tickersDataEZpvd = interfaceC54726xTa2 != null ? interfaceC54726xTa2.EZpvd(swapInstrument.getTradeSymbol()) : null;
        InterfaceC54726xTa interfaceC54726xTa3 = this.AkhnZx;
        TickersData tickersDataEZpvd2 = interfaceC54726xTa3 != null ? interfaceC54726xTa3.EZpvd(swapInstrument.getQuoteSymbol()) : null;
        String instType = swapInstrument.getInstType();
        String instId = swapInstrument.getInstId();
        String instFamily = swapInstrument.getInstFamily();
        String strCopydefault = TaskDescription.AEQbTJ(swapInstrument.getInstFly()).copydefault();
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String upperCase = strCopydefault.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        SwapSourceData swapSourceData = new SwapSourceData(instType, instId, instFamily, upperCase, tickersDataCopydefault != null ? tickersDataCopydefault.getVolCcy24h() : null, tickersDataCopydefault != null ? tickersDataCopydefault.getVol24h() : null, tickersDataCopydefault == null ? null : C55692xoj.calApplies$default(C55692xoj.KWHzl, tickersDataCopydefault.getLast(), tickersDataCopydefault.getOpen24h(), tickersDataCopydefault.getSodUtc0(), tickersDataCopydefault.getSodUtc8(), false, 16, null), tickersDataCopydefault != null ? tickersDataCopydefault.getLast() : null, tickersDataEZpvd != null ? tickersDataEZpvd.getLast() : null, "", swapInstrument.getCtType(), OLrzqt(swapInstrument), swapInstrument.getListTime());
        swapSourceData.setPreMarket(swapInstrument.isPreMarketPair());
        swapSourceData.setRebase(swapInstrument.isRebasePair());
        swapSourceData.setQuoteCupTickerPrice(tickersDataEZpvd2 != null ? tickersDataEZpvd2.getLast() : null);
        swapSourceData.setHotTag(swapInstrument.isNewTag());
        if (!Intrinsics.EZpvd((Object) this.djBIcL, (Object) "41")) {
            swapSourceData.setNewLabel(swapInstrument.isNewLabel());
        }
        xUW xuw = xUW.KWHzl;
        swapSourceData.setSortVolume(xuw.OLrzqt(swapSourceData));
        swapSourceData.setSortTurnover(Double.valueOf(xuw.KWHzl(swapSourceData)));
        arrayList.add(swapSourceData);
    }

    @Override // o.AbstractC54646xQb, o.InterfaceC54647xQc
    public void AEQbTJ(@NotNull final Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            C55608xnE.KWHzl(interfaceC54581xNrOLrzqt, (Function1<? super Boolean, Unit>) new Function1() { // from class: o.xRv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapMarketDataSource.djBIcL(this.OLrzqt, function1, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        } else {
            super.AEQbTJ(function1);
        }
    }

    public static final Unit djBIcL(SwapMarketDataSource swapMarketDataSource, Function1 function1, boolean z) {
        if (z) {
            super.AEQbTJ((Function1<? super Boolean, Unit>) function1);
        } else {
            function1.invoke(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public final List<FutureInstrument> AEQbTJ(List<FutureInstrument> list, RuleType ruleType) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            FutureInstrument futureInstrument = (FutureInstrument) obj;
            if (ruleType == RuleType.PREMARKET) {
                if (futureInstrument.isPreMarketPair()) {
                    arrayList.add(obj);
                }
            } else if (ruleType != RuleType.NORMAL || !futureInstrument.isPreMarketPair()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
