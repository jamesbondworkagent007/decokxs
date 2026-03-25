package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.IdxCcyConfig;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xLw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC54531xLw {
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public final LinkedHashMap<java.lang.String, java.util.ArrayList<BizInstrument>> AYXKKw;
    public AbstractC55758xpw AhwBna;
    public java.util.ArrayList<MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Exception>>> AkhnZx;
    public final java.util.HashMap<java.lang.String, CountDownInfo> DbNXlk;
    public volatile boolean EZpvd;
    public volatile boolean KWHzl;
    public final java.util.HashMap<java.lang.String, BizInstrument> OLrzqt;
    public final java.util.HashMap<java.lang.String, java.lang.String> djBIcL;
    public final InterfaceC56387yDm fARcdN;
    public final java.util.ArrayList<BizInstrument> fetchVPNInfo;
    public final java.util.HashMap<java.lang.String, TradeCoinInfo> gEmmrt;
    public final java.util.ArrayList<BizInstrument> isConnected;
    public final java.util.ArrayList<BizInstrument> valueOf;
    public final Mutex values;

    public abstract java.lang.String AEQbTJ(BizInstrument bizInstrument);

    public abstract void AEQbTJ(@NotNull BizInstrument bizInstrument, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

    public abstract void AEQbTJ(@NotNull java.lang.String str, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.EZpvd = z;
    }

    public abstract xMS AYXKKw(@NotNull java.lang.String str);

    public abstract C54571xNh AhwBna(@NotNull java.lang.String str, java.lang.String str2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<BizInstrument> AkhnZx() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<BizInstrument> AuCTel() {
        return this.isConnected;
    }

    public abstract BizInstrument DbNXlk(@NotNull java.lang.String str);

    public abstract java.util.HashMap<java.lang.String, IdxConfig> DbNXlk();

    public abstract java.lang.Object EZpvd(@NotNull BizInstrument bizInstrument, @NotNull Continuation<? super java.lang.Boolean> continuation);

    public abstract java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super Result<? extends AbstractC54531xLw>> continuation);

    public abstract java.lang.String EZpvd(BizInstrument bizInstrument);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(AbstractC55758xpw abstractC55758xpw) {
        this.AhwBna = abstractC55758xpw;
    }

    public abstract java.lang.String OLrzqt(BizInstrument bizInstrument);

    public abstract void OLrzqt(@NotNull MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Exception>> mutableLiveData, boolean z);

    public abstract java.lang.String copydefault(BizInstrument bizInstrument);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public xMX copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull Function1<? super ResponseData<java.util.List<CountDownInfo>>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault(boolean z) {
        return z ? this.AEQbTJ : this.KWHzl;
    }

    public abstract java.lang.String djBIcL(BizInstrument bizInstrument);

    public abstract java.lang.String djBIcL(@NotNull java.lang.String str);

    public abstract java.util.HashMap<java.lang.String, BizInstrument> djBIcL();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C54571xNh djBIcL(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC55758xpw ejfBZ() {
        return this.AhwBna;
    }

    public java.lang.String fARcdN(java.lang.String str) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<BizInstrument> fARcdN() {
        return this.fetchVPNInfo;
    }

    public abstract java.lang.String fIwbmz(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Mutex fIwbmz() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Exception>>> fJNWhG() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, TradeCoinInfo> fetchVPNInfo() {
        return this.gEmmrt;
    }

    public abstract java.lang.String gEmmrt(BizInstrument bizInstrument);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, BizInstrument> gEmmrt() {
        return this.OLrzqt;
    }

    public abstract xMS gEmmrt(@NotNull java.lang.String str);

    public abstract boolean getFieldNames();

    public abstract BizInstrument isConnected(java.lang.String str);

    public abstract java.lang.String isConnected();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean iwGUEr() {
        return this.KWHzl;
    }

    public abstract java.util.ArrayList<BizInstrument> valueOf();

    public abstract java.util.HashMap<java.lang.String, IdxCcyConfig> values();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zLjUOn() {
        return this.EZpvd;
    }

    public AbstractC54531xLw(@NotNull java.util.HashMap<java.lang.String, TradeCoinInfo> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.gEmmrt = map;
        this.isConnected = new java.util.ArrayList<>();
        this.fetchVPNInfo = new java.util.ArrayList<>();
        this.valueOf = new java.util.ArrayList<>();
        this.OLrzqt = new java.util.HashMap<>();
        this.AYXKKw = new LinkedHashMap<>();
        this.djBIcL = new java.util.HashMap<>();
        this.DbNXlk = new java.util.HashMap<>();
        this.AkhnZx = new java.util.ArrayList<>();
        this.values = MutexKt.Mutex$default(false, 1, null);
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.xLy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC54531xLw.KWHzl();
            }
        });
    }

    public static final xND KWHzl() {
        return (xND) C43251rlk.copydefault(xND.class);
    }

    public final xND getNewProxyInstance() {
        return (xND) this.fARcdN.getValue();
    }

    public static /* synthetic */ boolean isInitFun$default(AbstractC54531xLw abstractC54531xLw, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isInitFun");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return abstractC54531xLw.copydefault(z);
    }

    public final java.lang.String AYXKKw() {
        return isConnected();
    }

    public static /* synthetic */ void ensureInitialized$OKTradeCore_trade_core$default(AbstractC54531xLw abstractC54531xLw, MutableLiveData mutableLiveData, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureInitialized");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC54531xLw.OLrzqt((MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Exception>>) mutableLiveData, z);
    }

    /* JADX INFO: renamed from: ensureInitialized-gIAlu-s$OKTradeCore_trade_core$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8789ensureInitializedgIAlus$OKTradeCore_trade_core$default(AbstractC54531xLw abstractC54531xLw, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureInitialized-gIAlu-s");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return abstractC54531xLw.EZpvd(z, (Continuation<? super Result<? extends AbstractC54531xLw>>) continuation);
    }

    public final void OLrzqt(java.util.ArrayList<BizInstrument> arrayList) {
        if (arrayList != null) {
            valueOf().clear();
            valueOf().addAll(arrayList);
        }
    }

    public final java.util.ArrayList<BizInstrument> EZpvd() {
        return valueOf();
    }

    public BizInstrument valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return djBIcL().get(str);
    }

    public static /* synthetic */ BizInstrument getBizInfoForId$default(AbstractC54531xLw abstractC54531xLw, java.lang.String str, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBizInfoForId");
        }
        if ((i & 2) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        return abstractC54531xLw.KWHzl(str, bool);
    }

    public BizInstrument KWHzl(@NotNull java.lang.String str, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        return valueOf(str);
    }

    public final BizInstrument AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (djBIcL().get(str) == null) {
            return null;
        }
        return this.OLrzqt.get(str) == null ? djBIcL().get(str) : this.OLrzqt.get(str);
    }

    public final BizInstrument copydefault() {
        java.lang.Object next;
        java.util.Iterator<T> it = valueOf().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            BizInstrument bizInstrument = (BizInstrument) next;
            if (!Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "SPOT")) {
                break;
            }
            java.lang.String upperCase = bizInstrument.getBizStatus().toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "LIVE")) {
                break;
            }
        }
        return (BizInstrument) next;
    }

    public void KWHzl(@NotNull java.util.ArrayList<InstrumentInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (this.KWHzl) {
            return;
        }
        this.AEQbTJ = true;
        valueOf().clear();
    }

    public java.util.List<BizInstrument> uzCIH() {
        return new java.util.ArrayList();
    }

    public java.util.List<BizInstrument> hDKMBd() {
        return new java.util.ArrayList();
    }

    public java.util.List<BizInstrument> AhwBna() {
        return EZpvd();
    }

    public java.util.ArrayList<BizInstrument> OLrzqt() {
        return valueOf();
    }

    public final void AYXKKw(@NotNull BizInstrument bizInstrument) {
        java.util.ArrayList<BizInstrument> arrayList;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        if (!Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "OPTION")) {
            if (this.AYXKKw.get(bizInstrument.getCcyType()) == null && (Intrinsics.EZpvd((java.lang.Object) isConnected(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) isConnected(), (java.lang.Object) "FUTURES"))) {
                AuCTelauCTel();
            }
            if ((Intrinsics.EZpvd((java.lang.Object) isConnected(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) isConnected(), (java.lang.Object) "FUTURES")) && (arrayList = this.AYXKKw.get(bizInstrument.getCcyType())) != null) {
                arrayList.add(bizInstrument);
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "FUTURES")) {
            Intrinsics.copydefault(this, "");
            ((xLC) this).AEQbTJ(bizInstrument.getInstFamily(), ((FutureInstrument) bizInstrument).getAlias(), bizInstrument);
        }
        if (Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "OPTION")) {
            Intrinsics.copydefault(this, "");
            ((xLJ) this).AEQbTJ(bizInstrument.getInstFamily(), ((OptionInstrument) bizInstrument).getExpTime(), bizInstrument);
        }
    }

    public final void valueOf(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        if (((Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "FUTURES")) && Intrinsics.EZpvd(bizInstrument.isNegativeContract(), java.lang.Boolean.TRUE)) || Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "OPTION")) {
            this.djBIcL.put(bizInstrument.getTradeSymbol(), bizInstrument.getTradeSymbol());
        } else {
            this.djBIcL.put(bizInstrument.getTradeSymbol(), bizInstrument.getTradeSymbol());
            this.djBIcL.put(bizInstrument.getQuoteSymbol(), bizInstrument.getQuoteSymbol());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AuCTelauCTel() {
        java.util.List<FutureGroupInfo> listDbNXlk;
        if (Intrinsics.EZpvd((java.lang.Object) isConnected(), (java.lang.Object) "SWAP")) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            listDbNXlk = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.fARcdN() : null;
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null) {
                listDbNXlk = interfaceC54581xNrOLrzqt2.DbNXlk();
            }
        }
        if (listDbNXlk != null) {
            for (FutureGroupInfo futureGroupInfo : listDbNXlk) {
                LinkedHashMap<java.lang.String, java.util.ArrayList<BizInstrument>> linkedHashMap = this.AYXKKw;
                java.lang.String ccyType = futureGroupInfo.getCcyType();
                if (ccyType == null) {
                    ccyType = "";
                }
                linkedHashMap.put(ccyType, new java.util.ArrayList<>());
            }
        }
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, java.util.List<CountDownInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("OkBiz", "----->>putCountDownMa " + list + " instType-" + str);
        if (list != null) {
            java.util.Set<Map.Entry<java.lang.String, CountDownInfo>> setEntrySet = this.DbNXlk.entrySet();
            final Function1 function1 = new Function1() { // from class: o.xLA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(AbstractC54531xLw.AEQbTJ(str, (Map.Entry) obj));
                }
            };
            setEntrySet.removeIf(new java.util.function.Predicate() { // from class: o.xLz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj) {
                    return AbstractC54531xLw.AEQbTJ(function1, obj);
                }
            });
        }
        if (list != null) {
            for (CountDownInfo countDownInfo : list) {
                if (countDownInfo.getOnlineTime().length() == 0) {
                    countDownInfo.setOnlineTime(C33129mqd.addS$default(C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), C33129mqd.mulS$default(countDownInfo.getWaitOnlineTime(), 1000, null, null, null, 14, null), null, null, null, 14, null));
                }
                this.DbNXlk.put(countDownInfo.getInstId(), countDownInfo);
            }
        }
    }

    public static final boolean AEQbTJ(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean AEQbTJ(java.lang.String str, Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return Intrinsics.EZpvd((java.lang.Object) ((CountDownInfo) entry.getValue()).getInstType(), (java.lang.Object) str);
    }

    public final CountDownInfo values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.DbNXlk.get(str);
    }

    public final void wlaJM() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC55758xpw abstractC55758xpw = this.AhwBna;
        if (abstractC55758xpw == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(yDY.copydefault(abstractC55758xpw));
    }

    public static /* synthetic */ C54571xNh createTradeConverterWithIndex$default(AbstractC54531xLw abstractC54531xLw, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTradeConverterWithIndex");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return abstractC54531xLw.AhwBna(str, str2);
    }

    public static /* synthetic */ xMX createFundingFeeConverter$default(AbstractC54531xLw abstractC54531xLw, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFundingFeeConverter");
        }
        if ((i & 32) != 0) {
            str6 = "8";
        }
        return abstractC54531xLw.copydefault(str, str2, str3, str4, str5, str6);
    }

    public static /* synthetic */ xMV createProfitConverterWithIndex$default(AbstractC54531xLw abstractC54531xLw, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createProfitConverterWithIndex");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return abstractC54531xLw.AEQbTJ(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMV AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String profitSymbol;
        java.lang.String profitDig;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        if (ejfBZ(isConnected())) {
            profitSymbol = bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getTradeSymbol() : null;
        } else if (bizInstrumentDbNXlk != null) {
            profitSymbol = bizInstrumentDbNXlk.getProfitSymbol();
        }
        xMV xmv = new xMV();
        if (profitSymbol == null) {
            profitSymbol = "";
        }
        if (idxConfigAkhnZx != null && (profitDig = idxConfigAkhnZx.getProfitDig()) != null) {
            str3 = profitDig;
        }
        return xmv.KWHzl(profitSymbol, str3);
    }

    public static /* synthetic */ xMV createProfitConverterWithIndexDefaultDig$default(AbstractC54531xLw abstractC54531xLw, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createProfitConverterWithIndexDefaultDig");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return abstractC54531xLw.d_(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMV d_(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String profitSymbol;
        java.lang.String profitDig;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        if (ejfBZ(isConnected())) {
            profitSymbol = bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getTradeSymbol() : null;
        } else if (bizInstrumentDbNXlk != null) {
            profitSymbol = bizInstrumentDbNXlk.getProfitSymbol();
        }
        xMV xmv = new xMV();
        java.lang.String str3 = profitSymbol != null ? profitSymbol : "";
        if (idxConfigAkhnZx == null || (profitDig = idxConfigAkhnZx.getProfitDig()) == null) {
            profitDig = "8";
        }
        return xmv.KWHzl(str3, profitDig);
    }

    public static /* synthetic */ xMV createProfitRateConverterWithIndex$default(AbstractC54531xLw abstractC54531xLw, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createProfitRateConverterWithIndex");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return abstractC54531xLw.EZpvd(str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMV EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3) {
        java.lang.String profitSymbol;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        if (ejfBZ(isConnected())) {
            profitSymbol = bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getTradeSymbol() : null;
        } else if (bizInstrumentDbNXlk != null) {
            profitSymbol = bizInstrumentDbNXlk.getProfitSymbol();
        }
        return new xMV().KWHzl(profitSymbol != null ? profitSymbol : "", str3);
    }

    public static /* synthetic */ xMV createSizeConverterWithIndex$default(AbstractC54531xLw abstractC54531xLw, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSizeConverterWithIndex");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return abstractC54531xLw.AYXKKw(str, str2);
    }

    public xMV AYXKKw(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String profitSymbol;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        xMV xmv = new xMV();
        java.lang.String marginDig = null;
        if (ejfBZ(bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getInstType() : null)) {
            if (idxConfigAkhnZx != null) {
                marginDig = idxConfigAkhnZx.getBaseDig();
            }
        } else if (idxConfigAkhnZx != null) {
            marginDig = idxConfigAkhnZx.getMarginDig();
        }
        if (bizInstrumentDbNXlk == null || (profitSymbol = bizInstrumentDbNXlk.getProfitSymbol()) == null) {
            profitSymbol = "";
        }
        return xmv.KWHzl(profitSymbol, marginDig != null ? marginDig : "");
    }

    public final java.lang.String fJNWhG(@NotNull java.lang.String str) {
        java.lang.String marginDig;
        Intrinsics.checkNotNullParameter(str, "");
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        return (idxConfigAkhnZx == null || (marginDig = idxConfigAkhnZx.getMarginDig()) == null) ? "" : marginDig;
    }

    public static /* synthetic */ xMV createFeeConverterWithIndex$default(AbstractC54531xLw abstractC54531xLw, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFeeConverterWithIndex");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return abstractC54531xLw.KWHzl(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMV KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String profitSymbol;
        java.lang.String feeDig;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfig = DbNXlk().get(str);
        if (ejfBZ(isConnected())) {
            profitSymbol = bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getTradeSymbol() : null;
        } else if (bizInstrumentDbNXlk != null) {
            profitSymbol = bizInstrumentDbNXlk.getProfitSymbol();
        }
        xMV xmv = new xMV();
        if (profitSymbol == null) {
            profitSymbol = "";
        }
        if (idxConfig != null && (feeDig = idxConfig.getFeeDig()) != null) {
            str3 = feeDig;
        }
        return xmv.KWHzl(profitSymbol, str3);
    }

    public static /* synthetic */ xMV createFeeConverterWithIndexDefaultFeeDig$default(AbstractC54531xLw abstractC54531xLw, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFeeConverterWithIndexDefaultFeeDig");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return abstractC54531xLw.copydefault(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMV copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String profitSymbol;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        if (ejfBZ(isConnected())) {
            profitSymbol = bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getTradeSymbol() : null;
        } else if (bizInstrumentDbNXlk != null) {
            profitSymbol = bizInstrumentDbNXlk.getProfitSymbol();
        }
        return new xMV().KWHzl(profitSymbol != null ? profitSymbol : "", "8");
    }

    public static /* synthetic */ xMV createFeeConverterWithIndexSpotAndMargin$default(AbstractC54531xLw abstractC54531xLw, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFeeConverterWithIndexSpotAndMargin");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return abstractC54531xLw.EZpvd(str, str2);
    }

    public xMV EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String feeDig;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfig = DbNXlk().get(str);
        if (!ejfBZ(isConnected())) {
            str2 = bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getProfitSymbol() : null;
        }
        xMV xmv = new xMV();
        if (str2 == null) {
            str2 = "";
        }
        if (idxConfig != null && (feeDig = idxConfig.getFeeDig()) != null) {
            str3 = feeDig;
        }
        return xmv.KWHzl(str2, str3);
    }

    public final boolean ejfBZ(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN");
    }

    public final boolean AuCTel(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C54571xNh AEQbTJ(@NotNull java.lang.String str) {
        java.lang.String marginDig;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        java.lang.String profitSymbol = null;
        if (ejfBZ(bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getInstType() : null)) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (idxConfigAkhnZx != null ? idxConfigAkhnZx.getBaseDigDisplay() : null))) {
                marginDig = idxConfigAkhnZx != null ? idxConfigAkhnZx.getBaseDigDisplay() : null;
            } else if (idxConfigAkhnZx != null) {
                marginDig = idxConfigAkhnZx.getBaseDig();
            }
        } else if (idxConfigAkhnZx != null) {
            marginDig = idxConfigAkhnZx.getMarginDig();
        }
        if (ejfBZ(bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getInstType() : null)) {
            if (bizInstrumentDbNXlk != null) {
                profitSymbol = bizInstrumentDbNXlk.getTradeSymbol();
            }
        } else if (bizInstrumentDbNXlk != null) {
            profitSymbol = bizInstrumentDbNXlk.getProfitSymbol();
        }
        if (profitSymbol == null) {
            profitSymbol = "";
        }
        return new xMY(profitSymbol, marginDig != null ? marginDig : "");
    }

    public final IdxCcyConfig gEmmrt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return values().get(str + "-" + str2);
    }

    public final IdxCcyConfig fetchVPNInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return values().get(str);
    }

    public final IdxConfig AkhnZx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return DbNXlk().get(str);
    }

    public final java.util.List<java.lang.String> KWHzl(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        IdxConfig idxConfigAkhnZx = AkhnZx(bizInstrument.getInstFamily());
        if (idxConfigAkhnZx != null) {
            return idxConfigAkhnZx.getDepthLvl();
        }
        return null;
    }

    public final void AEQbTJ(java.util.List<IdxCcyConfig> list) {
        if (list != null) {
            for (IdxCcyConfig idxCcyConfig : list) {
                if (ejfBZ(isConnected())) {
                    values().put(idxCcyConfig.getReferId(), idxCcyConfig);
                } else if (AuCTel(isConnected()) && Intrinsics.EZpvd((java.lang.Object) xVE.copydefault.copydefault(idxCcyConfig.getReferId()), (java.lang.Object) "linear")) {
                    values().put(idxCcyConfig.getReferId(), idxCcyConfig);
                } else {
                    values().put(idxCcyConfig.getReferId() + "-" + idxCcyConfig.getCcyName(), idxCcyConfig);
                }
            }
        }
    }

    public final void EZpvd(java.util.List<IdxConfig> list) {
        if (list != null) {
            for (IdxConfig idxConfig : list) {
                DbNXlk().put(idxConfig.getReferId(), idxConfig);
            }
        }
    }

    public final void KWHzl(boolean z, java.lang.String str) {
        if (z) {
            this.KWHzl = true;
        }
        java.util.Iterator<T> it = this.AkhnZx.iterator();
        while (it.hasNext()) {
            ((MutableLiveData) it.next()).postValue(new kotlin.Pair(java.lang.Boolean.valueOf(z), (str == null || str.length() == 0) ? null : new java.lang.Exception(str)));
        }
        this.AkhnZx.clear();
    }
}
