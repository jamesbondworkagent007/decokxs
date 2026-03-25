package o;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.tradeuilib.header.TradeBusinessSwitchVMNew$initBiz$1;
import com.okinc.tradeuilib.header.TradeBusinessSwitchVMNew$tradeObserver$1$1;
import com.okinc.tradeuilib.header.TradeBusinessSwitchVMNew$tradeObserver$1$2;
import com.okinc.tradeuilib.header.TradeBusinessSwitchVMNew$tradeObserver$1$3;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.biz.TokenBusinessData;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
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

/* JADX INFO: renamed from: o.usw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49673usw extends AndroidViewModel {
    public Job AEQbTJ;
    public boolean AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public java.lang.String AkhnZx;
    public java.lang.String DbNXlk;
    public Function1<? super java.util.ArrayList<TokenBusinessData>, Unit> EZpvd;
    public AtomicInteger KWHzl;
    public java.util.List<? extends kotlin.Pair<java.lang.String, ? extends BizInstrument>> OLrzqt;
    public final android.app.Application copydefault;
    public Job djBIcL;
    public Function0<Unit> ejfBZ;
    public final TradeLiveData<java.util.ArrayList<TokenBusinessData>> fARcdN;
    public int fIwbmz;
    public java.util.ArrayList<TokenBusinessData> fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final boolean isConnected;
    public final InterfaceC56387yDm valueOf;
    public InterfaceC54581xNr values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AkhnZx = str;
        this.DbNXlk = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.ejfBZ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Function1<? super java.util.ArrayList<TokenBusinessData>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.app.Application)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(android.app.Application, boolean):void (m)] (LINE:44) call: o.usw.<init>(android.app.Application, boolean):void type: THIS */
    public /* synthetic */ C49673usw(android.app.Application application, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49673usw(@NotNull android.app.Application application, boolean z) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        this.copydefault = application;
        this.isConnected = z;
        this.fARcdN = new TradeLiveData<>();
        this.fJNWhG = new java.util.ArrayList<>();
        this.AkhnZx = "BTC-USDT";
        this.DbNXlk = "SPOT";
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.usA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49673usw.isConnected();
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.usx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49673usw.fetchVPNInfo();
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.usD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49673usw.DbNXlk();
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.usF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49673usw.AEQbTJ();
            }
        });
        this.KWHzl = new AtomicInteger(0);
        this.fIwbmz = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TradeLiveData<AbstractC54531xLw> AYXKKw() {
        return (TradeLiveData) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TradeLiveData isConnected() {
        return new TradeLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TradeLiveData<AbstractC54531xLw> AkhnZx() {
        return (TradeLiveData) this.fetchVPNInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TradeLiveData fetchVPNInfo() {
        return new TradeLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TradeLiveData DbNXlk() {
        return new TradeLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TradeLiveData<AbstractC54531xLw> djBIcL() {
        return (TradeLiveData) this.valueOf.getValue();
    }

    public static final TradeLiveData AEQbTJ() {
        return new TradeLiveData();
    }

    public final TradeLiveData<AbstractC54531xLw> gEmmrt() {
        return (TradeLiveData) this.gEmmrt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC49497upf values() {
        return (InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna() {
        java.lang.String quoteSymbol;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        java.lang.String instFamily;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        BizInstrument bizInstrumentValueOf2;
        if (this.AYXKKw) {
            return;
        }
        this.AYXKKw = true;
        Job job = this.AEQbTJ;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        Function0<Unit> function0 = this.ejfBZ;
        if (function0 != null) {
            function0.invoke();
        }
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String str = "";
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt.OLrzqt(this.DbNXlk)) == null || (bizInstrumentValueOf2 = abstractC54531xLwOLrzqt2.valueOf(this.AkhnZx)) == null || (quoteSymbol = bizInstrumentValueOf2.getQuoteSymbol()) == null) {
            quoteSymbol = "";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(this.DbNXlk)) != null && (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(this.AkhnZx)) != null && (instFamily = bizInstrumentValueOf.getInstFamily()) != null) {
            str = instFamily;
        }
        java.util.List<kotlin.Pair<java.lang.String, BizInstrument>> listKWHzl = KWHzl(str);
        this.OLrzqt = listKWHzl;
        OLrzqt(listKWHzl, quoteSymbol);
    }

    public final void OLrzqt(@NotNull java.lang.Object obj) {
        if (Result.m7384isSuccessimpl(obj)) {
            Function0<Unit> function0 = this.ejfBZ;
            if (function0 != null) {
                function0.invoke();
            }
            if (Result.m7383isFailureimpl(obj)) {
                obj = null;
            }
            InterfaceC54581xNr interfaceC54581xNr = (InterfaceC54581xNr) obj;
            if (interfaceC54581xNr != null) {
                this.values = interfaceC54581xNr;
                this.AYXKKw = false;
                this.KWHzl.set(0);
                this.fIwbmz = 1;
                xND xndAEQbTJ = values().AEQbTJ();
                if (xndAEQbTJ != null && Intrinsics.EZpvd(xndAEQbTJ.DbNXlk(), java.lang.Boolean.TRUE)) {
                    this.fIwbmz++;
                }
                xND xndAEQbTJ2 = values().AEQbTJ();
                if (xndAEQbTJ2 != null && Intrinsics.EZpvd(xndAEQbTJ2.AkhnZx(), java.lang.Boolean.TRUE)) {
                    this.fIwbmz++;
                }
                Job job = this.AEQbTJ;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
                }
                this.AEQbTJ = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TradeBusinessSwitchVMNew$tradeObserver$1$1(this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TradeBusinessSwitchVMNew$tradeObserver$1$2(this, interfaceC54581xNr, null), 3, null);
                if (this.isConnected) {
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TradeBusinessSwitchVMNew$tradeObserver$1$3(interfaceC54581xNr, this, null), 3, null);
                }
            }
        }
    }

    public final void valueOf() {
        if (this.KWHzl.incrementAndGet() < this.fIwbmz || this.AYXKKw) {
            return;
        }
        AhwBna();
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Job job;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AkhnZx = str;
        this.DbNXlk = str2;
        this.AYXKKw = false;
        this.KWHzl.set(0);
        Job job2 = this.AEQbTJ;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
        }
        Job job3 = this.djBIcL;
        if (job3 != null && job3.isActive() && (job = this.djBIcL) != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.djBIcL = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TradeBusinessSwitchVMNew$initBiz$1(this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: java.util.ArrayList<com.okinc.unify_trade.biz.TokenBusinessData> */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt(java.util.List<? extends kotlin.Pair<java.lang.String, ? extends BizInstrument>> list, java.lang.String str) {
        java.util.ArrayList<java.lang.String> arrayListEjfBZ;
        this.fJNWhG.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            for (kotlin.Pair<java.lang.String, ? extends BizInstrument> pair : list) {
                java.lang.String first = pair.getFirst();
                int iHashCode = first.hashCode();
                if (iHashCode != -1956807563) {
                    if (iHashCode != 2552066) {
                        if (iHashCode == 2558355 && first.equals("SWAP")) {
                            arrayList.add(KWHzl(pair, AkhnZx(), str));
                        }
                    } else if (first.equals("SPOT")) {
                        arrayList.add(KWHzl(pair, AYXKKw(), str));
                    }
                } else if (first.equals("OPTION")) {
                    arrayList.add(KWHzl(pair, djBIcL(), str));
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
        this.fJNWhG = arrayList2;
        Function1<? super java.util.ArrayList<TokenBusinessData>, Unit> function1 = this.EZpvd;
        if (function1 != null) {
            function1.invoke(arrayList2);
        }
        this.fARcdN.postValue(this.fJNWhG);
    }

    private final TokenBusinessData KWHzl(kotlin.Pair<java.lang.String, ? extends BizInstrument> pair, TradeLiveData<AbstractC54531xLw> tradeLiveData, java.lang.String str) {
        BizInstrument bizInstrumentOLrzqt;
        TokenBusinessData tokenBusinessData = new TokenBusinessData(false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BizInstrument) null, false, 0, false, (java.lang.String) null, 131071, (DefaultConstructorMarker) null);
        if (pair.getSecond() != null) {
            BizInstrument second = pair.getSecond();
            Intrinsics.copydefault(second);
            return EZpvd(true, second);
        }
        AbstractC54531xLw value = tradeLiveData.getValue();
        if (value != null) {
            bizInstrumentOLrzqt = value.DbNXlk("BTC-" + str);
        } else {
            bizInstrumentOLrzqt = null;
        }
        if (bizInstrumentOLrzqt == null) {
            bizInstrumentOLrzqt = OLrzqt(tradeLiveData);
        }
        return bizInstrumentOLrzqt != null ? EZpvd(false, bizInstrumentOLrzqt) : tokenBusinessData;
    }

    private final BizInstrument OLrzqt(TradeLiveData<AbstractC54531xLw> tradeLiveData) {
        java.lang.String strAYXKKw;
        InterfaceC54581xNr interfaceC54581xNr;
        AbstractC54531xLw value = tradeLiveData.getValue();
        if (value == null || (strAYXKKw = value.AYXKKw()) == null || (interfaceC54581xNr = this.values) == null) {
            return null;
        }
        return InterfaceC54581xNr.TaskDescription.getBizDefaultByType$default(interfaceC54581xNr, strAYXKKw, null, 2, null);
    }

    private final TokenBusinessData EZpvd(boolean z, BizInstrument bizInstrument) {
        return new TokenBusinessData(z, bizInstrument.getInstId(), bizInstrument.getInstType(), bizInstrument.getTradeSymbol(), bizInstrument.getQuoteSymbol(), bizInstrument.getInstFamily(), bizInstrument.isPositiveContract(), bizInstrument.getDisplayId(), false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BizInstrument) null, false, 0, false, (java.lang.String) null, 130816, (DefaultConstructorMarker) null);
    }

    private final java.util.List<kotlin.Pair<java.lang.String, BizInstrument>> KWHzl(java.lang.String str) {
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
