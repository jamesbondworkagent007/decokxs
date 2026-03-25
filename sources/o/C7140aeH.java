package o;

import com.ibm.icu.impl.StaticUnicodeSets;
import com.ibm.icu.text.DecimalFormatSymbols;

/* JADX INFO: renamed from: o.aeH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7140aeH extends AbstractC7212afa {
    public static final C7140aeH OLrzqt = new C7140aeH();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "<InfinityMatcher>";
    }

    public static C7140aeH OLrzqt(DecimalFormatSymbols decimalFormatSymbols) {
        java.lang.String infinity = decimalFormatSymbols.getInfinity();
        C7140aeH c7140aeH = OLrzqt;
        return C7150aeR.EZpvd(c7140aeH.gEmmrt, infinity) ? c7140aeH : new C7140aeH(infinity);
    }

    public C7140aeH(java.lang.String str) {
        super(str, OLrzqt.gEmmrt);
    }

    private C7140aeH() {
        super(StaticUnicodeSets.Key.INFINITY_SIGN);
    }

    @Override // o.AbstractC7212afa
    public boolean EZpvd(C7145aeM c7145aeM) {
        return (c7145aeM.AEQbTJ & 128) != 0;
    }

    @Override // o.AbstractC7212afa
    public void EZpvd(C7031acE c7031acE, C7145aeM c7145aeM) {
        c7145aeM.AEQbTJ |= 128;
        c7145aeM.copydefault(c7031acE);
    }
}
