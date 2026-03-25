package o;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.biz.TokenBusinessData;
import com.okinc.unify_trade.module.trade.TokenBusinessViewModel$initBiz$1;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32112mPy;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xJr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54472xJr extends AndroidViewModel {
    public final java.lang.String AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public java.lang.String AkhnZx;
    public java.lang.String DbNXlk;
    public java.util.List<? extends kotlin.Pair<java.lang.String, ? extends BizInstrument>> EZpvd;
    public final android.app.Application KWHzl;
    public Function1<? super java.util.ArrayList<TokenBusinessData>, Unit> OLrzqt;
    public AtomicInteger copydefault;
    public final InterfaceC56387yDm djBIcL;
    public Function0<Unit> ejfBZ;
    public final TradeLiveData<java.util.ArrayList<TokenBusinessData>> fIwbmz;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final Observer<AbstractC54531xLw> gEmmrt;
    public InterfaceC54581xNr isConnected;
    public final InterfaceC56387yDm valueOf;
    public java.util.ArrayList<TokenBusinessData> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<java.util.ArrayList<TokenBusinessData>> ejfBZ() {
        return this.fIwbmz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54472xJr(@NotNull android.app.Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        this.KWHzl = application;
        this.fIwbmz = new TradeLiveData<>();
        this.values = new java.util.ArrayList<>();
        this.AEQbTJ = "BTC";
        this.AkhnZx = "BTC-USDT";
        this.DbNXlk = "SPOT";
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.xJs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54472xJr.gEmmrt();
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.xJx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54472xJr.djBIcL();
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.xJy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54472xJr.valueOf();
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.xJv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54472xJr.AhwBna();
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.xJw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54472xJr.AYXKKw();
            }
        });
        this.copydefault = new AtomicInteger();
        this.gEmmrt = new Observer() { // from class: o.xJz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C54472xJr.KWHzl(this.EZpvd, (AbstractC54531xLw) obj);
            }
        };
    }

    public static final MutableLiveData gEmmrt() {
        return new MutableLiveData();
    }

    public final MutableLiveData<AbstractC54531xLw> DbNXlk() {
        return (MutableLiveData) this.djBIcL.getValue();
    }

    public static final MutableLiveData djBIcL() {
        return new MutableLiveData();
    }

    public final MutableLiveData<AbstractC54531xLw> values() {
        return (MutableLiveData) this.AYXKKw.getValue();
    }

    public static final MutableLiveData valueOf() {
        return new MutableLiveData();
    }

    public final MutableLiveData<AbstractC54531xLw> fetchVPNInfo() {
        return (MutableLiveData) this.fetchVPNInfo.getValue();
    }

    public static final MutableLiveData AhwBna() {
        return new MutableLiveData();
    }

    public final MutableLiveData<AbstractC54531xLw> AkhnZx() {
        return (MutableLiveData) this.AhwBna.getValue();
    }

    public static final MutableLiveData AYXKKw() {
        return new MutableLiveData();
    }

    public final MutableLiveData<AbstractC54531xLw> isConnected() {
        return (MutableLiveData) this.valueOf.getValue();
    }

    public static final void KWHzl(C54472xJr c54472xJr, AbstractC54531xLw abstractC54531xLw) {
        java.lang.String ccyType;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        java.lang.String instFamily;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        BizInstrument bizInstrumentValueOf2;
        c54472xJr.copydefault.incrementAndGet();
        if (c54472xJr.copydefault.get() >= 5) {
            Function0<Unit> function0 = c54472xJr.ejfBZ;
            if (function0 != null) {
                function0.invoke();
            }
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            java.lang.String str = "";
            if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt.OLrzqt(c54472xJr.DbNXlk)) == null || (bizInstrumentValueOf2 = abstractC54531xLwOLrzqt2.valueOf(c54472xJr.AkhnZx)) == null || (ccyType = bizInstrumentValueOf2.getCcyType()) == null) {
                ccyType = "";
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(c54472xJr.DbNXlk)) != null && (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(c54472xJr.AkhnZx)) != null && (instFamily = bizInstrumentValueOf.getInstFamily()) != null) {
                str = instFamily;
            }
            java.util.List<kotlin.Pair<java.lang.String, BizInstrument>> listOLrzqt = c54472xJr.OLrzqt(str);
            c54472xJr.EZpvd = listOLrzqt;
            c54472xJr.copydefault(listOLrzqt, ccyType);
        }
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AkhnZx = str;
        this.DbNXlk = str2;
        this.copydefault.set(0);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TokenBusinessViewModel$initBiz$1(this, null), 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [118=5] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: java.util.ArrayList<com.okinc.unify_trade.biz.TokenBusinessData> */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(java.util.List<? extends kotlin.Pair<java.lang.String, ? extends BizInstrument>> list, java.lang.String str) {
        java.util.ArrayList<java.lang.String> arrayListEjfBZ;
        this.values.clear();
        TokenBusinessData[] tokenBusinessDataArr = new TokenBusinessData[5];
        if (list != null) {
            for (kotlin.Pair<java.lang.String, ? extends BizInstrument> pair : list) {
                java.lang.String first = pair.getFirst();
                switch (first.hashCode()) {
                    case -2027980370:
                        if (first.equals("MARGIN")) {
                            tokenBusinessDataArr[1] = KWHzl(pair, values(), str);
                        }
                        break;
                    case -1956807563:
                        if (first.equals("OPTION")) {
                            tokenBusinessDataArr[4] = KWHzl(pair, isConnected(), str);
                        }
                        break;
                    case 2552066:
                        if (first.equals("SPOT")) {
                            tokenBusinessDataArr[0] = KWHzl(pair, DbNXlk(), str);
                        }
                        break;
                    case 2558355:
                        if (first.equals("SWAP")) {
                            tokenBusinessDataArr[2] = KWHzl(pair, fetchVPNInfo(), str);
                        }
                        break;
                    case 214415088:
                        if (first.equals("FUTURES")) {
                            tokenBusinessDataArr[3] = KWHzl(pair, AkhnZx(), str);
                        }
                        break;
                }
            }
        }
        java.util.List listAwvSrB = yDV.AwvSrB(tokenBusinessDataArr);
        Intrinsics.copydefault(listAwvSrB, "");
        java.util.List listQfsBiF = CollectionsKt___CollectionsKt.QfsBiF((java.util.ArrayList) listAwvSrB);
        java.util.ArrayList<TokenBusinessData> arrayList = new java.util.ArrayList<>();
        for (java.lang.Object obj : listQfsBiF) {
            TokenBusinessData tokenBusinessData = (TokenBusinessData) obj;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (arrayListEjfBZ = interfaceC54581xNrOLrzqt.ejfBZ()) != null && arrayListEjfBZ.contains(tokenBusinessData.getInstType())) {
                arrayList.add(obj);
            }
        }
        this.values = arrayList;
        Function1<? super java.util.ArrayList<TokenBusinessData>, Unit> function1 = this.OLrzqt;
        if (function1 != null) {
            function1.invoke(arrayList);
        }
        this.fIwbmz.postValue(this.values);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TokenBusinessData KWHzl(kotlin.Pair<java.lang.String, ? extends BizInstrument> pair, MutableLiveData<AbstractC54531xLw> mutableLiveData, java.lang.String str) {
        BizInstrument bizInstrumentDbNXlk;
        TokenBusinessData tokenBusinessData = new TokenBusinessData(false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BizInstrument) null, false, 0, false, (java.lang.String) null, 131071, (DefaultConstructorMarker) null);
        if (pair.getSecond() != null) {
            BizInstrument second = pair.getSecond();
            Intrinsics.copydefault(second);
            return copydefault(true, second);
        }
        if (mutableLiveData.getValue() instanceof xLC) {
            AbstractC54531xLw value = mutableLiveData.getValue();
            if (value != null) {
                java.lang.Object[] objArr = {(xLC) value, this.AEQbTJ + "-" + str};
                bizInstrumentDbNXlk = (BizInstrument) CollectionsKt___CollectionsKt.firstOrNull((java.util.ArrayList) xLC.AEQbTJ(-2038251653, C32112mPy.ActionBar.KWHzl(), C32112mPy.ActionBar.KWHzl(), C32112mPy.ActionBar.KWHzl(), C32112mPy.ActionBar.KWHzl(), 2038251653, objArr));
            } else {
                bizInstrumentDbNXlk = null;
            }
        } else {
            AbstractC54531xLw value2 = mutableLiveData.getValue();
            if (value2 != null) {
                bizInstrumentDbNXlk = value2.DbNXlk(this.AEQbTJ + "-" + str);
            }
        }
        if (bizInstrumentDbNXlk == null) {
            bizInstrumentDbNXlk = copydefault(mutableLiveData);
        }
        return bizInstrumentDbNXlk != null ? copydefault(false, bizInstrumentDbNXlk) : tokenBusinessData;
    }

    public final BizInstrument copydefault(MutableLiveData<AbstractC54531xLw> mutableLiveData) {
        java.lang.String strAYXKKw;
        InterfaceC54581xNr interfaceC54581xNr;
        AbstractC54531xLw value = mutableLiveData.getValue();
        if (value == null || (strAYXKKw = value.AYXKKw()) == null || (interfaceC54581xNr = this.isConnected) == null) {
            return null;
        }
        return InterfaceC54581xNr.TaskDescription.getBizDefaultByType$default(interfaceC54581xNr, strAYXKKw, null, 2, null);
    }

    private final TokenBusinessData copydefault(boolean z, BizInstrument bizInstrument) {
        return new TokenBusinessData(z, bizInstrument.getInstId(), bizInstrument.getInstType(), bizInstrument.getTradeSymbol(), bizInstrument.getQuoteSymbol(), bizInstrument.getInstFamily(), bizInstrument.isPositiveContract(), (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BizInstrument) null, false, 0, false, bizInstrument.getDisplayQuoteSymbol(), 65408, (DefaultConstructorMarker) null);
    }

    private final java.util.List<kotlin.Pair<java.lang.String, BizInstrument>> OLrzqt(java.lang.String str) {
        java.util.ArrayList<AbstractC54531xLw> arrayListAuCTel;
        BizInstrument bizInstrumentDbNXlk;
        C56084xwD fieldNames;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.List<FutureGroupInfo> listFARcdN;
        BizInstrument bizInstrumentDbNXlk2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        java.util.List<FutureGroupInfo> listDbNXlk;
        java.lang.String upperCase = TaskDescription.AEQbTJ(str).copydefault().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt3 != null && (arrayListAuCTel = interfaceC54581xNrOLrzqt3.AuCTel()) != null) {
            for (AbstractC54531xLw abstractC54531xLw : arrayListAuCTel) {
                if (abstractC54531xLw instanceof xLJ) {
                    xLJ xlj = (xLJ) abstractC54531xLw;
                    bizInstrumentDbNXlk2 = xlj.DbNXlk(str);
                    if (bizInstrumentDbNXlk2 == null) {
                        java.lang.String upperCase2 = upperCase.toUpperCase(java.util.Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                        bizInstrumentDbNXlk2 = xlj.DbNXlk(upperCase2 + "-USD");
                    }
                } else {
                    if (abstractC54531xLw instanceof xLC) {
                        xLC xlc = (xLC) abstractC54531xLw;
                        bizInstrumentDbNXlk = xlc.DbNXlk(str);
                        if (bizInstrumentDbNXlk == null && (interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt()) != null && (listDbNXlk = interfaceC54581xNrOLrzqt2.DbNXlk()) != null) {
                            for (FutureGroupInfo futureGroupInfo : listDbNXlk) {
                                if (bizInstrumentDbNXlk == null) {
                                    java.lang.String upperCase3 = upperCase.toUpperCase(java.util.Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                                    bizInstrumentDbNXlk = xlc.DbNXlk(upperCase3 + "-" + futureGroupInfo.getCcyType());
                                }
                            }
                        }
                    } else if (abstractC54531xLw instanceof xLU) {
                        xLU xlu = (xLU) abstractC54531xLw;
                        bizInstrumentDbNXlk = xlu.DbNXlk(str);
                        if (bizInstrumentDbNXlk == null && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null && (listFARcdN = interfaceC54581xNrOLrzqt.fARcdN()) != null) {
                            for (FutureGroupInfo futureGroupInfo2 : listFARcdN) {
                                if (bizInstrumentDbNXlk == null) {
                                    java.lang.String upperCase4 = upperCase.toUpperCase(java.util.Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase4, "");
                                    bizInstrumentDbNXlk = xlu.DbNXlk(upperCase4 + "-" + futureGroupInfo2.getCcyType());
                                }
                            }
                        }
                    } else {
                        InterfaceC54581xNr interfaceC54581xNrOLrzqt4 = C54589xNz.EZpvd.OLrzqt();
                        java.util.List<ChargeGroupData> listCopydefault = (interfaceC54581xNrOLrzqt4 == null || (fieldNames = interfaceC54581xNrOLrzqt4.getFieldNames()) == null) ? null : fieldNames.copydefault();
                        bizInstrumentDbNXlk = abstractC54531xLw.DbNXlk(str);
                        if (bizInstrumentDbNXlk == null && listCopydefault != null) {
                            java.util.Iterator<T> it = listCopydefault.iterator();
                            while (it.hasNext()) {
                                for (java.lang.String str2 : ((ChargeGroupData) it.next()).getTypes()) {
                                    if (bizInstrumentDbNXlk == null) {
                                        java.lang.String upperCase5 = upperCase.toUpperCase(java.util.Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(upperCase5, "");
                                        bizInstrumentDbNXlk = abstractC54531xLw.DbNXlk(upperCase5 + "-" + str2);
                                    }
                                }
                            }
                        }
                    }
                    bizInstrumentDbNXlk2 = bizInstrumentDbNXlk;
                }
                arrayList.add(new kotlin.Pair(abstractC54531xLw.AYXKKw(), bizInstrumentDbNXlk2));
            }
        }
        return arrayList;
    }

    public final void AuCTel() {
        DbNXlk().removeObserver(this.gEmmrt);
        values().removeObserver(this.gEmmrt);
        fetchVPNInfo().removeObserver(this.gEmmrt);
        AkhnZx().removeObserver(this.gEmmrt);
        isConnected().removeObserver(this.gEmmrt);
        this.OLrzqt = null;
        this.ejfBZ = null;
    }
}
