package o;

import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.math.RoundingMode;

/* JADX INFO: renamed from: o.uqb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49546uqb {
    public static final C49546uqb AEQbTJ = new C49546uqb();

    private C49546uqb() {
    }

    public static /* synthetic */ java.lang.String formatDataWithCcy$default(C49546uqb c49546uqb, java.lang.String str, java.lang.Integer num, java.lang.String str2, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return c49546uqb.AEQbTJ(str, num, str2, roundingMode);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.Integer num, java.lang.String str2, RoundingMode roundingMode) {
        if (str == null || str.length() == 0) {
            return "--";
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            return xMR.copydefault.copydefault(C33129mqd.formatS$default(str, num, null, roundingMode, 2, null)) + " " + str2;
        }
        return xMR.copydefault.copydefault(C33129mqd.formatS$default(str, num, null, roundingMode, 2, null)) + " --";
    }

    public final int AEQbTJ(java.lang.String str) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        TradeCoinInfo tradeCoinInfoAhwBna;
        java.lang.String sizeDig;
        if (str == null || str.length() == 0 || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(str)) == null || (sizeDig = tradeCoinInfoAhwBna.getSizeDig()) == null) {
            return 4;
        }
        return C33129mqd.AhwBna(sizeDig);
    }
}
