package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tfz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46908tfz implements InterfaceC46849tet {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46849tet
    public int KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46849tet
    public java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    public C46908tfz(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.AEQbTJ = str2;
    }

    @Override // o.InterfaceC46849tet
    public java.lang.String EZpvd() {
        return C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, this.EZpvd, this.AEQbTJ, false, false, false, 28, null);
    }

    @Override // o.InterfaceC46849tet
    public kotlin.Pair<java.lang.String, java.lang.String> copydefault() {
        java.lang.String strCopydefault = C44585sZg.AEQbTJ(this.EZpvd).copydefault();
        java.util.Locale locale = java.util.Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strCopydefault.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return C56390yDp.OLrzqt(C55687xoe.AEQbTJ.OLrzqt(upperCase), null);
    }

    @Override // o.InterfaceC46849tet
    public int KWHzl() {
        return C56033xvF.KWHzl(this.AEQbTJ, this.EZpvd);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    @Override // o.InterfaceC46849tet
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String KWHzl(int i) {
        java.lang.String quoteSymbol;
        java.lang.String marginSymbol;
        xOW newProxyInstance;
        ValuationCurrencyData valuationCurrencyDataAEQbTJ;
        java.lang.String isoCode;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        if (i == 3 || i == 4) {
            return "%";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        BizInstrument bizInstrumentValueOf = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(this.AEQbTJ)) == null) ? null : abstractC54531xLwOLrzqt.valueOf(this.EZpvd);
        java.lang.String str = this.AEQbTJ;
        switch (str.hashCode()) {
            case -2027980370:
                if (str.equals("MARGIN")) {
                    if (bizInstrumentValueOf != null && (quoteSymbol = bizInstrumentValueOf.getQuoteSymbol()) != null) {
                        return quoteSymbol;
                    }
                }
                return "";
            case 2552066:
                if (str.equals("SPOT")) {
                }
                return "";
            case 2558355:
                if (str.equals("SWAP")) {
                    if (bizInstrumentValueOf != null && Intrinsics.EZpvd(bizInstrumentValueOf.isNegativeContract(), java.lang.Boolean.TRUE)) {
                        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
                        if (interfaceC54581xNrOLrzqt2 != null && (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) != null && (valuationCurrencyDataAEQbTJ = newProxyInstance.AEQbTJ("USD")) != null && (isoCode = valuationCurrencyDataAEQbTJ.getIsoCode()) != null) {
                            return isoCode;
                        }
                    } else if (bizInstrumentValueOf != null && (marginSymbol = bizInstrumentValueOf.getMarginSymbol()) != null) {
                        return marginSymbol;
                    }
                }
                return "";
            case 214415088:
                if (str.equals("FUTURES")) {
                }
                return "";
            default:
                return "";
        }
    }
}
