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

/* JADX INFO: renamed from: o.vSp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50551vSp {
    public java.lang.String AEQbTJ;
    public BizInstrument EZpvd;
    public Function1<? super java.lang.String, Unit> KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final uMV copydefault;
    public Function0<java.lang.String> djBIcL;
    public final java.util.List<java.lang.String> gEmmrt;
    public final androidx.fragment.app.FragmentManager valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<java.lang.String> function0) {
        this.djBIcL = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function1<? super java.lang.String, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    public C50551vSp(@NotNull uMV umv, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(umv, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.copydefault = umv;
        this.valueOf = fragmentManager;
        java.util.List<java.lang.String> listGEmmrt = yDY.gEmmrt("default_usdt", "quote", TtmlNode.RUBY_BASE, "dual");
        this.gEmmrt = listGEmmrt;
        this.AEQbTJ = listGEmmrt.get(1);
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.vSn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50551vSp.AEQbTJ();
            }
        });
    }

    public final java.util.ArrayList<java.lang.String> EZpvd() {
        return (java.util.ArrayList) this.OLrzqt.getValue();
    }

    public static final java.util.ArrayList AEQbTJ() {
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

    public final void OLrzqt(final C47988uAv c47988uAv, boolean z) {
        c47988uAv.setUnitClickable(z, new Function0() { // from class: o.vSo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50551vSp.copydefault(this.OLrzqt, c47988uAv);
            }
        });
    }

    public static final Unit copydefault(final C50551vSp c50551vSp, final C47988uAv c47988uAv) {
        final java.lang.String displayQuoteSymbol;
        if (c50551vSp.EZpvd == null) {
            return Unit.INSTANCE;
        }
        Function0<java.lang.String> function0 = c50551vSp.djBIcL;
        if (function0 == null || (displayQuoteSymbol = function0.invoke()) == null) {
            BizInstrument bizInstrument = c50551vSp.EZpvd;
            Intrinsics.copydefault(bizInstrument);
            displayQuoteSymbol = bizInstrument.getDisplayQuoteSymbol();
        }
        BizInstrument bizInstrument2 = c50551vSp.EZpvd;
        Intrinsics.copydefault(bizInstrument2);
        final java.lang.String tradeSymbol = bizInstrument2.getTradeSymbol();
        vMU vmu = new vMU();
        vmu.OLrzqt(c50551vSp.KWHzl(displayQuoteSymbol, tradeSymbol));
        vmu.AEQbTJ(new Function1() { // from class: o.vSl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50551vSp.EZpvd(c47988uAv, c50551vSp, displayQuoteSymbol, tradeSymbol, (C55276xgr) obj);
            }
        });
        vmu.OLrzqt(new Function0() { // from class: o.vSm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50551vSp.AEQbTJ(c47988uAv);
            }
        });
        vmu.show(c50551vSp.valueOf);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C47988uAv c47988uAv, C50551vSp c50551vSp, java.lang.String str, java.lang.String str2, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        c47988uAv.setInputUnit(C33129mqd.gEmmrt(c55276xgr.AhwBna()));
        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
        java.lang.String str3 = objOLrzqt instanceof java.lang.String ? (java.lang.String) objOLrzqt : null;
        if (str3 != null) {
            c50551vSp.AEQbTJ = str3;
            c50551vSp.OLrzqt(str, str2);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C47988uAv c47988uAv) {
        c47988uAv.setSidesLabelUnselect();
        return Unit.INSTANCE;
    }

    public final java.util.List<C55276xgr> KWHzl(java.lang.String str, java.lang.String str2) {
        java.lang.Boolean boolValueOf;
        boolean z;
        java.util.ArrayList<java.lang.String> arrayListEZpvd = EZpvd();
        if (arrayListEZpvd == null) {
            boolValueOf = null;
        } else if (!arrayListEZpvd.isEmpty()) {
            java.util.Iterator<T> it = arrayListEZpvd.iterator();
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
            arrayList.add(new C55276xgr("USDT", this.gEmmrt.get(0), null, Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) this.gEmmrt.get(0)), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        arrayList.add(new C55276xgr(str, this.gEmmrt.get(1), null, Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) this.gEmmrt.get(1)), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        arrayList.add(new C55276xgr(str2, this.gEmmrt.get(2), null, Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) this.gEmmrt.get(2)), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        arrayList.add(new C55276xgr(str + " + " + str2, this.gEmmrt.get(3), null, Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) this.gEmmrt.get(3)), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        return arrayList;
    }

    public final void KWHzl(BizInstrument bizInstrument) {
        java.lang.String tradeSymbol;
        java.lang.Boolean boolValueOf;
        java.lang.String str;
        boolean z;
        java.lang.String strInvoke;
        this.EZpvd = bizInstrument;
        java.lang.String quoteSymbol = "";
        if (bizInstrument == null || (tradeSymbol = bizInstrument.getTradeSymbol()) == null) {
            tradeSymbol = "";
        }
        Function0<java.lang.String> function0 = this.djBIcL;
        if (function0 != null && (strInvoke = function0.invoke()) != null) {
            quoteSymbol = strInvoke;
        } else if (bizInstrument != null) {
            quoteSymbol = bizInstrument.getQuoteSymbol();
        }
        java.util.ArrayList<java.lang.String> arrayListEZpvd = EZpvd();
        if (arrayListEZpvd == null) {
            boolValueOf = null;
        } else if (!arrayListEZpvd.isEmpty()) {
            java.util.Iterator<T> it = arrayListEZpvd.iterator();
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
            str = this.gEmmrt.get(0);
        } else {
            str = this.gEmmrt.get(1);
        }
        this.AEQbTJ = str;
        OLrzqt(quoteSymbol, tradeSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [107=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        uMV umv = this.copydefault;
        java.lang.String str3 = this.AEQbTJ;
        switch (str3.hashCode()) {
            case -650211604:
                if (str3.equals("default_usdt")) {
                    umv.AkhnZx.setVisibility(0);
                    umv.values.setVisibility(0);
                    umv.KWHzl.setVisibility(8);
                    umv.copydefault.setVisibility(8);
                    umv.AkhnZx.setInputUnit("USDT");
                    C47988uAv c47988uAv = umv.AkhnZx;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                    OLrzqt(c47988uAv, true);
                }
                break;
            case 3016401:
                if (str3.equals(TtmlNode.RUBY_BASE)) {
                    umv.AkhnZx.setVisibility(8);
                    umv.values.setVisibility(8);
                    umv.KWHzl.setVisibility(0);
                    umv.copydefault.setVisibility(0);
                    umv.KWHzl.setInputUnit(str2);
                    C47988uAv c47988uAv2 = umv.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
                    OLrzqt(c47988uAv2, true);
                }
                break;
            case 3094652:
                if (str3.equals("dual")) {
                    umv.AkhnZx.setVisibility(0);
                    umv.values.setVisibility(0);
                    umv.KWHzl.setVisibility(0);
                    umv.copydefault.setVisibility(0);
                    umv.AkhnZx.setInputUnit(str);
                    umv.KWHzl.setInputUnit(str2);
                    C47988uAv c47988uAv3 = umv.AkhnZx;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv3, "");
                    OLrzqt(c47988uAv3, true);
                    C47988uAv c47988uAv4 = umv.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv4, "");
                    OLrzqt(c47988uAv4, false);
                }
                break;
            case 107953788:
                if (str3.equals("quote")) {
                    umv.AkhnZx.setVisibility(0);
                    umv.values.setVisibility(0);
                    umv.KWHzl.setVisibility(8);
                    umv.copydefault.setVisibility(8);
                    umv.AkhnZx.setInputUnit(str);
                    C47988uAv c47988uAv5 = umv.AkhnZx;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv5, "");
                    OLrzqt(c47988uAv5, true);
                }
                break;
        }
        Function1<? super java.lang.String, Unit> function1 = this.KWHzl;
        if (function1 != null) {
            function1.invoke(this.AEQbTJ);
        }
    }
}
