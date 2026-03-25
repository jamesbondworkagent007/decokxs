package o;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.tradeuilib.header.HeaderTradeBusinessSwitchVM$initBiz$1;
import com.okinc.tradeuilib.header.HeaderTradeBusinessSwitchVM$tradeObserver$1$1;
import com.okinc.tradeuilib.header.HeaderTradeBusinessSwitchVM$tradeObserver$1$2;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.biz.TokenBusinessData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.usr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49668usr extends AndroidViewModel {
    public Job AEQbTJ;
    public java.lang.String AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public InterfaceC54581xNr DbNXlk;
    public Job EZpvd;
    public java.util.List<? extends kotlin.Pair<java.lang.String, ? extends BizInstrument>> KWHzl;
    public final android.app.Application OLrzqt;
    public Function1<? super java.util.ArrayList<TokenBusinessData>, Unit> copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final TradeLiveData<java.util.ArrayList<TokenBusinessData>> fetchVPNInfo;
    public java.lang.String gEmmrt;
    public Function0<Unit> isConnected;
    public final InterfaceC56387yDm valueOf;
    public java.util.ArrayList<TokenBusinessData> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.isConnected = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AYXKKw = str;
        this.gEmmrt = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Function1<? super java.util.ArrayList<TokenBusinessData>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49668usr(@NotNull android.app.Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        this.OLrzqt = application;
        this.fetchVPNInfo = new TradeLiveData<>();
        this.values = new java.util.ArrayList<>();
        this.AYXKKw = "BTC-USDT";
        this.gEmmrt = "SPOT";
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.uss
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49668usr.copydefault();
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.usz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49668usr.AhwBna();
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.usy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49668usr.OLrzqt();
            }
        });
    }

    public static final TradeLiveData copydefault() {
        return new TradeLiveData();
    }

    public final TradeLiveData<AbstractC54531xLw> AYXKKw() {
        return (TradeLiveData) this.valueOf.getValue();
    }

    public static final TradeLiveData AhwBna() {
        return new TradeLiveData();
    }

    public final TradeLiveData<AbstractC54531xLw> djBIcL() {
        return (TradeLiveData) this.AhwBna.getValue();
    }

    public static final TradeLiveData OLrzqt() {
        return new TradeLiveData();
    }

    public final TradeLiveData<AbstractC54531xLw> gEmmrt() {
        return (TradeLiveData) this.djBIcL.getValue();
    }

    public final InterfaceC49497upf DbNXlk() {
        return (InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI);
    }

    public final void valueOf() {
        java.lang.String quoteSymbol;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        java.lang.String instFamily;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        BizInstrument bizInstrumentValueOf2;
        Job job = this.EZpvd;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        Function0<Unit> function0 = this.isConnected;
        if (function0 != null) {
            function0.invoke();
        }
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String str = "";
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt.OLrzqt(this.gEmmrt)) == null || (bizInstrumentValueOf2 = abstractC54531xLwOLrzqt2.valueOf(this.AYXKKw)) == null || (quoteSymbol = bizInstrumentValueOf2.getQuoteSymbol()) == null) {
            quoteSymbol = "";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(this.gEmmrt)) != null && (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(this.AYXKKw)) != null && (instFamily = bizInstrumentValueOf.getInstFamily()) != null) {
            str = instFamily;
        }
        java.util.List<kotlin.Pair<java.lang.String, BizInstrument>> listCopydefault = copydefault(str);
        this.KWHzl = listCopydefault;
        copydefault(listCopydefault, quoteSymbol);
    }

    public final void EZpvd(@NotNull java.lang.Object obj) {
        if (Result.m7384isSuccessimpl(obj)) {
            Function0<Unit> function0 = this.isConnected;
            if (function0 != null) {
                function0.invoke();
            }
            if (Result.m7383isFailureimpl(obj)) {
                obj = null;
            }
            InterfaceC54581xNr interfaceC54581xNr = (InterfaceC54581xNr) obj;
            if (interfaceC54581xNr != null) {
                this.DbNXlk = interfaceC54581xNr;
                Job job = this.EZpvd;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
                }
                this.EZpvd = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HeaderTradeBusinessSwitchVM$tradeObserver$1$1(this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HeaderTradeBusinessSwitchVM$tradeObserver$1$2(this, interfaceC54581xNr, null), 3, null);
            }
        }
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Job job;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AYXKKw = str;
        this.gEmmrt = str2;
        Job job2 = this.EZpvd;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
        }
        Job job3 = this.AEQbTJ;
        if (job3 != null && job3.isActive() && (job = this.AEQbTJ) != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.AEQbTJ = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HeaderTradeBusinessSwitchVM$initBiz$1(this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: java.util.ArrayList<com.okinc.unify_trade.biz.TokenBusinessData> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(java.util.List<? extends kotlin.Pair<java.lang.String, ? extends BizInstrument>> list, java.lang.String str) {
        java.util.ArrayList<java.lang.String> arrayListEjfBZ;
        this.values.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            for (kotlin.Pair<java.lang.String, ? extends BizInstrument> pair : list) {
                java.lang.String first = pair.getFirst();
                int iHashCode = first.hashCode();
                if (iHashCode != -1956807563) {
                    if (iHashCode != 2552066) {
                        if (iHashCode == 2558355 && first.equals("SWAP")) {
                            arrayList.add(OLrzqt(pair, djBIcL(), str));
                        }
                    } else if (first.equals("SPOT")) {
                        arrayList.add(OLrzqt(pair, AYXKKw(), str));
                    }
                } else if (first.equals("OPTION")) {
                    arrayList.add(OLrzqt(pair, gEmmrt(), str));
                }
            }
        }
        java.util.List listQfsBiF = CollectionsKt___CollectionsKt.QfsBiF(arrayList);
        java.util.ArrayList<TokenBusinessData> arrayList2 = new java.util.ArrayList<>();
        for (java.lang.Object obj : listQfsBiF) {
            TokenBusinessData tokenBusinessData = (TokenBusinessData) obj;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (arrayListEjfBZ = interfaceC54581xNrOLrzqt.ejfBZ()) != null && arrayListEjfBZ.contains(tokenBusinessData.getInstType())) {
                arrayList2.add(obj);
            }
        }
        if (C54586xNw.OLrzqt.EZpvd() && Intrinsics.EZpvd((java.lang.Object) C54589xNz.EZpvd.fetchVPNInfo(), (java.lang.Object) "trade_cedefi_dex")) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((TokenBusinessData) it.next()).setAvailable(true);
            }
        }
        this.values = arrayList2;
        Function1<? super java.util.ArrayList<TokenBusinessData>, Unit> function1 = this.copydefault;
        if (function1 != null) {
            function1.invoke(arrayList2);
        }
        this.fetchVPNInfo.postValue(this.values);
    }

    public final TokenBusinessData OLrzqt(kotlin.Pair<java.lang.String, ? extends BizInstrument> pair, TradeLiveData<AbstractC54531xLw> tradeLiveData, java.lang.String str) {
        BizInstrument bizInstrumentCopydefault;
        TokenBusinessData tokenBusinessData = new TokenBusinessData(false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BizInstrument) null, false, 0, false, (java.lang.String) null, 131071, (DefaultConstructorMarker) null);
        if (pair.getSecond() != null) {
            BizInstrument second = pair.getSecond();
            Intrinsics.copydefault(second);
            return AEQbTJ(true, second);
        }
        AbstractC54531xLw value = tradeLiveData.getValue();
        if (value != null) {
            bizInstrumentCopydefault = value.DbNXlk("BTC-" + str);
        } else {
            bizInstrumentCopydefault = null;
        }
        if (bizInstrumentCopydefault == null) {
            bizInstrumentCopydefault = copydefault(tradeLiveData);
        }
        return bizInstrumentCopydefault != null ? AEQbTJ(false, bizInstrumentCopydefault) : tokenBusinessData;
    }

    public final BizInstrument copydefault(TradeLiveData<AbstractC54531xLw> tradeLiveData) {
        java.lang.String strAYXKKw;
        InterfaceC54581xNr interfaceC54581xNr;
        AbstractC54531xLw value = tradeLiveData.getValue();
        if (value == null || (strAYXKKw = value.AYXKKw()) == null || (interfaceC54581xNr = this.DbNXlk) == null) {
            return null;
        }
        return InterfaceC54581xNr.TaskDescription.getBizDefaultByType$default(interfaceC54581xNr, strAYXKKw, null, 2, null);
    }

    public final TokenBusinessData AEQbTJ(boolean z, BizInstrument bizInstrument) {
        return new TokenBusinessData(z, bizInstrument.getInstId(), bizInstrument.getInstType(), bizInstrument.getTradeSymbol(), bizInstrument.getQuoteSymbol(), bizInstrument.getInstFamily(), bizInstrument.isPositiveContract(), bizInstrument.getDisplayId(), false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BizInstrument) null, false, 0, false, (java.lang.String) null, 130816, (DefaultConstructorMarker) null);
    }

    public final java.util.List<kotlin.Pair<java.lang.String, BizInstrument>> copydefault(java.lang.String str) {
        BizInstrument bizInstrumentDbNXlk;
        C56084xwD fieldNames;
        BizInstrument bizInstrumentDbNXlk2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.List<FutureGroupInfo> listFARcdN;
        java.lang.String upperCase = TaskDescription.AEQbTJ(str).copydefault().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
        java.util.ArrayList<AbstractC54531xLw> arrayListAuCTel = interfaceC54581xNrOLrzqt2 != null ? interfaceC54581xNrOLrzqt2.AuCTel() : null;
        if (arrayListAuCTel != null) {
            java.util.Iterator<AbstractC54531xLw> it = arrayListAuCTel.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                AbstractC54531xLw next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                AbstractC54531xLw abstractC54531xLw = next;
                if (!(abstractC54531xLw instanceof xLC) && !(abstractC54531xLw instanceof xLD)) {
                    if (abstractC54531xLw instanceof xLJ) {
                        xLJ xlj = (xLJ) abstractC54531xLw;
                        bizInstrumentDbNXlk2 = xlj.DbNXlk(str);
                        if (bizInstrumentDbNXlk2 == null) {
                            java.lang.String upperCase2 = upperCase.toUpperCase(java.util.Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                            bizInstrumentDbNXlk2 = xlj.DbNXlk(upperCase2 + "-USD");
                        }
                    } else {
                        if (abstractC54531xLw instanceof xLU) {
                            xLU xlu = (xLU) abstractC54531xLw;
                            bizInstrumentDbNXlk = xlu.getFieldNames(str);
                            if (bizInstrumentDbNXlk == null && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null && (listFARcdN = interfaceC54581xNrOLrzqt.fARcdN()) != null) {
                                for (FutureGroupInfo futureGroupInfo : listFARcdN) {
                                    if (bizInstrumentDbNXlk == null) {
                                        java.lang.String upperCase3 = upperCase.toUpperCase(java.util.Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                                        bizInstrumentDbNXlk = xlu.getFieldNames(upperCase3 + "-" + futureGroupInfo.getCcyType());
                                    }
                                }
                            }
                        } else {
                            InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = C54589xNz.EZpvd.OLrzqt();
                            java.util.List<ChargeGroupData> listCopydefault = (interfaceC54581xNrOLrzqt3 == null || (fieldNames = interfaceC54581xNrOLrzqt3.getFieldNames()) == null) ? null : fieldNames.copydefault();
                            bizInstrumentDbNXlk = abstractC54531xLw.DbNXlk(str);
                            if (bizInstrumentDbNXlk == null && listCopydefault != null) {
                                java.util.Iterator<T> it2 = listCopydefault.iterator();
                                while (it2.hasNext()) {
                                    for (java.lang.String str2 : ((ChargeGroupData) it2.next()).getTypes()) {
                                        if (bizInstrumentDbNXlk == null) {
                                            java.lang.String upperCase4 = upperCase.toUpperCase(java.util.Locale.ROOT);
                                            Intrinsics.checkNotNullExpressionValue(upperCase4, "");
                                            bizInstrumentDbNXlk = abstractC54531xLw.DbNXlk(upperCase4 + "-" + str2);
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
        }
        return arrayList;
    }
}
