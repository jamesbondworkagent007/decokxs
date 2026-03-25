package o;

import androidx.databinding.ObservableField;
import androidx.lifecycle.AndroidViewModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55915xsu extends AndroidViewModel {
    public final MutableStateFlow<java.lang.String> AEQbTJ;
    public MaxAvailableResp AhwBna;
    public ObservableField<MaxAvailableResp> EZpvd;
    public java.util.ArrayList<java.lang.Object> KWHzl;
    public final C56111xwe<Unit> OLrzqt;
    public xDM copydefault;
    public final C56111xwe<java.lang.String> djBIcL;
    public final C56111xwe<java.lang.String> gEmmrt;
    public final StateFlow<java.lang.String> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ObservableField<MaxAvailableResp> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.lang.String> AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.lang.String> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<Unit> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDM copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(MaxAvailableResp maxAvailableResp) {
        this.AhwBna = maxAvailableResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(xDM xdm) {
        this.copydefault = xdm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.String> valueOf() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55915xsu(@NotNull android.app.Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        this.EZpvd = new ObservableField<>();
        this.KWHzl = new java.util.ArrayList<>();
        this.gEmmrt = new C56111xwe<>();
        this.djBIcL = new C56111xwe<>();
        this.OLrzqt = new C56111xwe<>();
        MutableStateFlow<java.lang.String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.AEQbTJ = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void EZpvd(@NotNull final java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Boolean bool, final boolean z, BizInstrument bizInstrument, C55887xsS c55887xsS, java.lang.String str4) {
        BizInstrument bizInstrumentAhwBna;
        final C55887xsS c55887xsS2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (bizInstrument == null) {
            bizInstrumentAhwBna = c55887xsS != null ? c55887xsS.AhwBna() : null;
            if (bizInstrumentAhwBna == null && (bizInstrumentAhwBna = C56059xvf.EZpvd.isConnected()) == null) {
                return;
            }
        } else {
            bizInstrumentAhwBna = bizInstrument;
        }
        if (c55887xsS == null) {
            c55887xsS2 = new C55887xsS(bizInstrumentAhwBna.getInstType(), bizInstrumentAhwBna.getInstId());
            c55887xsS2.gEmmrt(str4);
        } else {
            c55887xsS2 = c55887xsS;
        }
        final java.lang.String strAEQbTJ = c55887xsS2.AEQbTJ(str);
        pUU.EZpvd("USDRename", "sub Available balance, botType:" + str + ", " + bizInstrumentAhwBna.joinCcyRelevantToString() + ", tradeQuoteCcy:" + strAEQbTJ);
        EZpvd(bizInstrumentAhwBna.getInstId(), bizInstrumentAhwBna.getInstType(), str2, str3, bool, strAEQbTJ, new Function1() { // from class: o.xsA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55915xsu.KWHzl(str, z, this, c55887xsS2, strAEQbTJ, (MaxAvailableResp) obj);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, boolean z, C55915xsu c55915xsu, C55887xsS c55887xsS, java.lang.String str2, MaxAvailableResp maxAvailableResp) {
        Intrinsics.checkNotNullParameter(maxAvailableResp, "");
        pUU.EZpvd("USDRename", "sub Available balance, quote Available balance, botType:" + str + ", quoteMax:" + maxAvailableResp.getQuoteMax());
        if (z) {
            java.lang.String strKWHzl = c55915xsu.KWHzl(c55887xsS, maxAvailableResp.getQuoteMax(), str2);
            pUU.EZpvd("USDRename", "sub Available balance, quote Available balance, formatted quoteMax w tradeQuoteCcy " + str2 + " : " + strKWHzl);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
                c55915xsu.djBIcL.postValue(strKWHzl);
            }
            java.lang.String strOLrzqt = c55915xsu.OLrzqt(c55887xsS, maxAvailableResp);
            if (strOLrzqt != null && C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt)) {
                c55915xsu.gEmmrt.postValue(strOLrzqt);
            }
        } else {
            c55915xsu.djBIcL.postValue(maxAvailableResp.getQuoteMax());
            c55915xsu.gEmmrt.postValue(maxAvailableResp.getBaseMax());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        BizInstrument bizInstrument;
        java.lang.Object next;
        java.lang.Object next2;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        java.util.ArrayList<BizInstrument> arrayListEZpvd = (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(str)) == null) ? null : abstractC54531xLwOLrzqt.EZpvd();
        if (arrayListEZpvd != null) {
            java.util.Iterator<T> it = arrayListEZpvd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) ((BizInstrument) next2).getQuoteSymbol())) {
                        break;
                    }
                }
            }
            bizInstrument = (BizInstrument) next2;
            if (bizInstrument == null) {
                if (arrayListEZpvd != null) {
                    java.util.Iterator<T> it2 = arrayListEZpvd.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        booleanRef.element = false;
                        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) ((BizInstrument) next).getTradeSymbol())) {
                            break;
                        }
                    }
                    bizInstrument = (BizInstrument) next;
                } else {
                    bizInstrument = null;
                }
                if (bizInstrument == null) {
                    return;
                }
            }
        }
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "SPOT");
        EZpvd(bizInstrument.getInstId(), bizInstrument.getInstType(), zEZpvd ? "cash" : "cross", zEZpvd ? "" : "net_mode", zEZpvd ? java.lang.Boolean.TRUE : null, null, new Function1() { // from class: o.xsv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55915xsu.copydefault(this.KWHzl, booleanRef, (MaxAvailableResp) obj);
            }
        });
    }

    public static final Unit copydefault(C55915xsu c55915xsu, Ref.BooleanRef booleanRef, MaxAvailableResp maxAvailableResp) {
        Intrinsics.checkNotNullParameter(maxAvailableResp, "");
        c55915xsu.AEQbTJ.setValue(booleanRef.element ? maxAvailableResp.getQuoteMax() : maxAvailableResp.getBaseMax());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.xsu$Activity */
    public static final class Activity extends AbstractC55740xpe {
        public final /* synthetic */ Function1<MaxAvailableResp, Unit> AEQbTJ;
        public final /* synthetic */ C55915xsu EZpvd;

        /* JADX DEBUG: Multi-variable search result rejected for r31v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.MaxAvailableResp, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.String str4, java.lang.String str5, C55915xsu c55915xsu, Function1<? super MaxAvailableResp, Unit> function1) {
            super(null, null, str, str2, null, null, str3, null, bool, str4, "1", null, null, null, null, null, null, null, null, str5, 522419, null);
            this.EZpvd = c55915xsu;
            this.AEQbTJ = function1;
        }

        @Override // o.AbstractC55740xpe
        public void AEQbTJ(MaxAvailableResp maxAvailableResp, java.lang.String str, xDM xdm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(xdm, "");
            if (maxAvailableResp == null) {
                this.EZpvd.AEQbTJ().set(new MaxAvailableResp((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (DefaultConstructorMarker) null));
                this.EZpvd.OLrzqt().postValue(Unit.INSTANCE);
            } else {
                this.EZpvd.copydefault(maxAvailableResp);
                this.EZpvd.AEQbTJ().set(maxAvailableResp);
                this.AEQbTJ.invoke(maxAvailableResp);
            }
            this.EZpvd.copydefault(xdm);
        }
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, java.lang.String str5, Function1<? super MaxAvailableResp, Unit> function1) {
        AYXKKw();
        Activity activity = new Activity(str2, str, str3, bool, str4, str5, this, function1);
        this.KWHzl.clear();
        this.KWHzl.add(activity);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.copydefault(this.KWHzl);
        }
    }

    public final java.lang.String KWHzl(@NotNull C55887xsS c55887xsS, @NotNull java.lang.String str, java.lang.String str2) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        Intrinsics.checkNotNullParameter(str, "");
        C54571xNh c54571xNhEZpvd = c55887xsS.EZpvd(str, true, str2);
        if (c54571xNhEZpvd != null && (c54536xMLAYXKKw = c54571xNhEZpvd.AYXKKw(str)) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
            str3 = safeString$default;
        }
        BizInstrument bizInstrumentAhwBna = c55887xsS.AhwBna();
        pUU.EZpvd("USDRename", "formatQuoteMaxWithSymbol, " + (bizInstrumentAhwBna != null ? bizInstrumentAhwBna.joinCcyRelevantToString() : null) + ", tradeQuoteCcy:" + str2 + ", amt:" + str + ", result:" + str3);
        return str3;
    }

    public final java.lang.String OLrzqt(@NotNull C55887xsS c55887xsS, MaxAvailableResp maxAvailableResp) {
        C54571xNh c54571xNhCreateAmtConvertForAvailableAmt$default;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        if (maxAvailableResp == null || (c54571xNhCreateAmtConvertForAvailableAmt$default = C55887xsS.createAmtConvertForAvailableAmt$default(c55887xsS, null, false, null, 7, null)) == null || (c54536xMLAYXKKw = c54571xNhCreateAmtConvertForAvailableAmt$default.AYXKKw(maxAvailableResp.getBaseMax())) == null || (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null) {
            return null;
        }
        return C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
    }

    public final java.lang.String KWHzl() {
        C54571xNh c54571xNhCreateAmtConvert$default;
        java.lang.String baseMax;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        if (this.AhwBna == null || (c54571xNhCreateAmtConvert$default = C56059xvf.createAmtConvert$default(C56059xvf.EZpvd, null, false, 3, null)) == null) {
            return null;
        }
        MaxAvailableResp maxAvailableResp = this.AhwBna;
        if (maxAvailableResp == null || (baseMax = maxAvailableResp.getBaseMax()) == null) {
            baseMax = "";
        }
        C54536xML c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default.AYXKKw(baseMax);
        if (c54536xMLAYXKKw == null || (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null) {
            return null;
        }
        return C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
    }

    public final java.lang.String KWHzl(BizInstrument bizInstrument) {
        C54571xNh c54571xNhCreateAmtConvertForAvailableAmt$default;
        java.lang.String baseMax;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        if (this.AhwBna == null || bizInstrument == null || (c54571xNhCreateAmtConvertForAvailableAmt$default = C55887xsS.createAmtConvertForAvailableAmt$default(new C55887xsS(bizInstrument.getInstType(), bizInstrument.getInstId()), null, false, null, 7, null)) == null) {
            return null;
        }
        MaxAvailableResp maxAvailableResp = this.AhwBna;
        if (maxAvailableResp == null || (baseMax = maxAvailableResp.getBaseMax()) == null) {
            baseMax = "";
        }
        C54536xML c54536xMLAYXKKw = c54571xNhCreateAmtConvertForAvailableAmt$default.AYXKKw(baseMax);
        if (c54536xMLAYXKKw == null || (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null) {
            return null;
        }
        return C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
    }

    public static /* synthetic */ java.lang.String getAvaQuoteMax$default(C55915xsu c55915xsu, C55887xsS c55887xsS, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return c55915xsu.AEQbTJ(c55887xsS, str);
    }

    public final java.lang.String AEQbTJ(@NotNull C55887xsS c55887xsS, java.lang.String str) {
        java.lang.String quoteMax;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        if (this.AhwBna == null) {
            return null;
        }
        java.lang.String strAEQbTJ = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "default_usdt") ? "USDT" : c55887xsS.AEQbTJ("grid");
        MaxAvailableResp maxAvailableResp = this.AhwBna;
        if (maxAvailableResp != null && (quoteMax = maxAvailableResp.getQuoteMax()) != null) {
            str2 = quoteMax;
        }
        return KWHzl(c55887xsS, str2, strAEQbTJ);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return getAvaQuoteMax$default(this, new C55887xsS(str, str2), null, 2, null);
    }

    public final void AYXKKw() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.AEQbTJ(this.KWHzl);
        }
        this.EZpvd.set(null);
    }

    public final java.lang.String OLrzqt(MaxAvailableResp maxAvailableResp, boolean z) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        if (maxAvailableResp == null) {
            return "";
        }
        C54571xNh c54571xNhCreateAmtConvert$default = C56059xvf.createAmtConvert$default(C56059xvf.EZpvd, null, true, 1, null);
        if (c54571xNhCreateAmtConvert$default == null || (c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default.AYXKKw(maxAvailableResp.getQuoteMax())) == null || (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null) {
            return null;
        }
        return C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
    }
}
