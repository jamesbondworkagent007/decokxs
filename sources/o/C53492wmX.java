package o;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ChargeGroupData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wmX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53492wmX {
    public Function1<? super java.lang.String, Unit> AEQbTJ;
    public java.lang.String EZpvd;
    public final uPQ KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public BizInstrument copydefault;
    public final androidx.fragment.app.FragmentManager djBIcL;
    public Function0<java.lang.String> gEmmrt;
    public final java.util.List<java.lang.String> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super java.lang.String, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<java.lang.String> function0) {
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public C53492wmX(@NotNull uPQ upq, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(upq, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.KWHzl = upq;
        this.djBIcL = fragmentManager;
        java.util.List<java.lang.String> listGEmmrt = yDY.gEmmrt("default_usdt", "quote", TtmlNode.RUBY_BASE, "dual");
        this.valueOf = listGEmmrt;
        this.EZpvd = listGEmmrt.get(1);
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wna
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53492wmX.OLrzqt();
            }
        });
    }

    public final java.util.ArrayList<java.lang.String> AEQbTJ() {
        return (java.util.ArrayList) this.OLrzqt.getValue();
    }

    public static final java.util.ArrayList OLrzqt() {
        C54591xOa c54591xOaAwvSrB;
        java.util.List<ChargeGroupData> listUzCIH;
        java.lang.Object next;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (c54591xOaAwvSrB = interfaceC54581xNrOLrzqt.AwvSrB()) == null || (listUzCIH = c54591xOaAwvSrB.uzCIH()) == null) {
            return null;
        }
        java.util.Iterator<T> it = listUzCIH.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C59449zhJ.gEmmrt(((ChargeGroupData) next).getKey(), "CRYPTO", true)) {
                break;
            }
        }
        ChargeGroupData chargeGroupData = (ChargeGroupData) next;
        if (chargeGroupData != null) {
            return chargeGroupData.getTypes();
        }
        return null;
    }

    public final void KWHzl(final C47988uAv c47988uAv, boolean z) {
        c47988uAv.setUnitClickable(z, new Function0() { // from class: o.wmY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53492wmX.OLrzqt(this.KWHzl, c47988uAv);
            }
        });
    }

    public static final Unit OLrzqt(final C53492wmX c53492wmX, final C47988uAv c47988uAv) {
        final java.lang.String displayQuoteSymbol;
        if (c53492wmX.copydefault == null) {
            return Unit.INSTANCE;
        }
        Function0<java.lang.String> function0 = c53492wmX.gEmmrt;
        if (function0 == null || (displayQuoteSymbol = function0.invoke()) == null) {
            BizInstrument bizInstrument = c53492wmX.copydefault;
            Intrinsics.copydefault(bizInstrument);
            displayQuoteSymbol = bizInstrument.getDisplayQuoteSymbol();
        }
        BizInstrument bizInstrument2 = c53492wmX.copydefault;
        Intrinsics.copydefault(bizInstrument2);
        final java.lang.String tradeSymbol = bizInstrument2.getTradeSymbol();
        vMU vmu = new vMU();
        vmu.OLrzqt(c53492wmX.AEQbTJ(displayQuoteSymbol, tradeSymbol));
        vmu.AEQbTJ(new Function1() { // from class: o.wnd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53492wmX.EZpvd(c47988uAv, c53492wmX, displayQuoteSymbol, tradeSymbol, (C55276xgr) obj);
            }
        });
        vmu.OLrzqt(new Function0() { // from class: o.wnc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53492wmX.OLrzqt(c47988uAv);
            }
        });
        vmu.show(c53492wmX.djBIcL);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C47988uAv c47988uAv, C53492wmX c53492wmX, java.lang.String str, java.lang.String str2, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        c47988uAv.setInputUnit(C33129mqd.gEmmrt(c55276xgr.AhwBna()));
        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
        java.lang.String str3 = objOLrzqt instanceof java.lang.String ? (java.lang.String) objOLrzqt : null;
        if (str3 != null) {
            c53492wmX.EZpvd = str3;
            c53492wmX.copydefault(str, str2);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C47988uAv c47988uAv) {
        c47988uAv.setSidesLabelUnselect();
        return Unit.INSTANCE;
    }

    public final java.util.List<C55276xgr> AEQbTJ(java.lang.String str, java.lang.String str2) {
        java.lang.Boolean boolValueOf;
        boolean z;
        java.util.ArrayList<java.lang.String> arrayListAEQbTJ = AEQbTJ();
        if (arrayListAEQbTJ == null) {
            boolValueOf = null;
        } else if (!arrayListAEQbTJ.isEmpty()) {
            java.util.Iterator<T> it = arrayListAEQbTJ.iterator();
            while (it.hasNext()) {
                if (C59449zhJ.gEmmrt((java.lang.String) it.next(), str, true)) {
                    z = true;
                    break;
                }
            }
            z = false;
            boolValueOf = java.lang.Boolean.valueOf(z);
        } else {
            z = false;
            boolValueOf = java.lang.Boolean.valueOf(z);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.TRUE)) {
            arrayList.add(new C55276xgr("USDT", this.valueOf.get(0), null, Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) this.valueOf.get(0)), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        arrayList.add(new C55276xgr(str, this.valueOf.get(1), null, Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) this.valueOf.get(1)), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        arrayList.add(new C55276xgr(str2, this.valueOf.get(2), null, Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) this.valueOf.get(2)), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        arrayList.add(new C55276xgr(str + " + " + str2, this.valueOf.get(3), null, Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) this.valueOf.get(3)), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        return arrayList;
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        java.lang.String tradeSymbol;
        java.lang.String strInvoke;
        java.lang.String quoteSymbol = "";
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrument = this.copydefault;
        if (bizInstrument == null || (tradeSymbol = bizInstrument.getTradeSymbol()) == null) {
            tradeSymbol = "";
        }
        Function0<java.lang.String> function0 = this.gEmmrt;
        if (function0 == null || (strInvoke = function0.invoke()) == null) {
            BizInstrument bizInstrument2 = this.copydefault;
            if (bizInstrument2 != null) {
                quoteSymbol = bizInstrument2.getQuoteSymbol();
            }
        } else {
            quoteSymbol = strInvoke;
        }
        this.EZpvd = str;
        copydefault(quoteSymbol, tradeSymbol);
    }

    public final void copydefault(BizInstrument bizInstrument) {
        java.lang.String tradeSymbol;
        java.lang.Boolean boolValueOf;
        java.lang.String str;
        boolean z;
        java.lang.String strInvoke;
        this.copydefault = bizInstrument;
        java.lang.String quoteSymbol = "";
        if (bizInstrument == null || (tradeSymbol = bizInstrument.getTradeSymbol()) == null) {
            tradeSymbol = "";
        }
        Function0<java.lang.String> function0 = this.gEmmrt;
        if (function0 != null && (strInvoke = function0.invoke()) != null) {
            quoteSymbol = strInvoke;
        } else if (bizInstrument != null) {
            quoteSymbol = bizInstrument.getQuoteSymbol();
        }
        java.util.ArrayList<java.lang.String> arrayListAEQbTJ = AEQbTJ();
        if (arrayListAEQbTJ == null) {
            boolValueOf = null;
        } else if (!arrayListAEQbTJ.isEmpty()) {
            java.util.Iterator<T> it = arrayListAEQbTJ.iterator();
            while (it.hasNext()) {
                if (C59449zhJ.gEmmrt((java.lang.String) it.next(), quoteSymbol, true)) {
                    z = true;
                    break;
                }
            }
            z = false;
            boolValueOf = java.lang.Boolean.valueOf(z);
        } else {
            z = false;
            boolValueOf = java.lang.Boolean.valueOf(z);
        }
        if (Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.TRUE)) {
            str = this.valueOf.get(0);
        } else {
            str = this.valueOf.get(1);
        }
        this.EZpvd = str;
        copydefault(quoteSymbol, tradeSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [114=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void copydefault(java.lang.String str, java.lang.String str2) {
        uPQ upq = this.KWHzl;
        java.lang.String str3 = this.EZpvd;
        switch (str3.hashCode()) {
            case -650211604:
                if (str3.equals("default_usdt")) {
                    upq.wlaJM.setVisibility(0);
                    upq.zsXlph.setVisibility(0);
                    upq.AEQbTJ.setVisibility(8);
                    upq.EZpvd.setVisibility(8);
                    upq.wlaJM.setInputUnit("USDT");
                    C47988uAv c47988uAv = upq.wlaJM;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                    KWHzl(c47988uAv, true);
                }
                break;
            case 3016401:
                if (str3.equals(TtmlNode.RUBY_BASE)) {
                    upq.wlaJM.setVisibility(8);
                    upq.zsXlph.setVisibility(8);
                    upq.AEQbTJ.setVisibility(0);
                    upq.EZpvd.setVisibility(0);
                    upq.AEQbTJ.setInputUnit(str2);
                    C47988uAv c47988uAv2 = upq.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
                    KWHzl(c47988uAv2, true);
                }
                break;
            case 3094652:
                if (str3.equals("dual")) {
                    upq.wlaJM.setVisibility(0);
                    upq.zsXlph.setVisibility(0);
                    upq.AEQbTJ.setVisibility(0);
                    upq.EZpvd.setVisibility(0);
                    upq.wlaJM.setInputUnit(str);
                    upq.AEQbTJ.setInputUnit(str2);
                    C47988uAv c47988uAv3 = upq.wlaJM;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv3, "");
                    KWHzl(c47988uAv3, true);
                    C47988uAv c47988uAv4 = upq.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv4, "");
                    KWHzl(c47988uAv4, false);
                }
                break;
            case 107953788:
                if (str3.equals("quote")) {
                    upq.wlaJM.setVisibility(0);
                    upq.zsXlph.setVisibility(0);
                    upq.AEQbTJ.setVisibility(8);
                    upq.EZpvd.setVisibility(8);
                    upq.wlaJM.setInputUnit(str);
                    C47988uAv c47988uAv5 = upq.wlaJM;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv5, "");
                    KWHzl(c47988uAv5, true);
                }
                break;
        }
        Function1<? super java.lang.String, Unit> function1 = this.AEQbTJ;
        if (function1 != null) {
            function1.invoke(this.EZpvd);
        }
    }
}
