package o;

import com.ibm.icu.impl.StaticUnicodeSets;
import com.ibm.icu.text.DecimalFormatSymbols;

/* JADX INFO: renamed from: o.aeP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7148aeP extends AbstractC7212afa {
    public static final C7148aeP OLrzqt = new C7148aeP();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "<PercentMatcher>";
    }

    public static C7148aeP AEQbTJ(DecimalFormatSymbols decimalFormatSymbols) {
        java.lang.String percentString = decimalFormatSymbols.getPercentString();
        C7148aeP c7148aeP = OLrzqt;
        return c7148aeP.gEmmrt.OLrzqt((java.lang.CharSequence) percentString) ? c7148aeP : new C7148aeP(percentString);
    }

    public C7148aeP(java.lang.String str) {
        super(str, OLrzqt.gEmmrt);
    }

    private C7148aeP() {
        super(StaticUnicodeSets.Key.PERCENT_SIGN);
    }

    @Override // o.AbstractC7212afa
    public boolean EZpvd(C7145aeM c7145aeM) {
        return (c7145aeM.AEQbTJ & 2) != 0;
    }

    @Override // o.AbstractC7212afa
    public void EZpvd(C7031acE c7031acE, C7145aeM c7145aeM) {
        c7145aeM.AEQbTJ |= 2;
        c7145aeM.copydefault(c7031acE);
    }
}
