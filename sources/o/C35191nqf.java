package o;

import com.okinc.find_ui.widgetprovider.data.CoinCandle;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import o.C52761wXj;

/* JADX INFO: renamed from: o.nqf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35191nqf {
    public boolean OLrzqt;
    public final java.util.Map<java.lang.String, CoinCandle> EZpvd = new LinkedHashMap();
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ = new LinkedHashMap();
    public final int AhwBna = C33512mxp.AEQbTJ.isConnected();
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.nqe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35191nqf.copydefault(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.nqd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35191nqf.AEQbTJ(this.copydefault);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, CoinCandle> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.OLrzqt;
    }

    public final C35187nqb EZpvd() {
        return (C35187nqb) this.copydefault.getValue();
    }

    public static final C35187nqb copydefault(C35191nqf c35191nqf) {
        return new C35187nqb(C33070mpX.copydefault(c35191nqf.AhwBna == 0 ? C52761wXj.Activity.HJWChPRAkuRW : C52761wXj.Activity.fhUrPt));
    }

    public final C35187nqb OLrzqt() {
        return (C35187nqb) this.KWHzl.getValue();
    }

    public static final C35187nqb AEQbTJ(C35191nqf c35191nqf) {
        return new C35187nqb(C33070mpX.copydefault(c35191nqf.AhwBna != 0 ? C52761wXj.Activity.HJWChPRAkuRW : C52761wXj.Activity.fhUrPt));
    }
}
