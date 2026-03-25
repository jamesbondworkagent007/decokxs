package o;

import com.ibm.icu.text.DecimalFormatSymbols;
import com.ibm.icu.text.UnicodeSet;

/* JADX INFO: renamed from: o.aeL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7144aeL extends AbstractC7212afa {
    public static final C7144aeL OLrzqt = new C7144aeL("NaN");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "<NanMatcher>";
    }

    public static C7144aeL copydefault(DecimalFormatSymbols decimalFormatSymbols, int i) {
        java.lang.String naN = decimalFormatSymbols.getNaN();
        C7144aeL c7144aeL = OLrzqt;
        return c7144aeL.djBIcL.equals(naN) ? c7144aeL : new C7144aeL(naN);
    }

    public C7144aeL(java.lang.String str) {
        super(str, UnicodeSet.OLrzqt);
    }

    @Override // o.AbstractC7212afa
    public boolean EZpvd(C7145aeM c7145aeM) {
        return c7145aeM.copydefault();
    }

    @Override // o.AbstractC7212afa
    public void EZpvd(C7031acE c7031acE, C7145aeM c7145aeM) {
        c7145aeM.AEQbTJ |= 64;
        c7145aeM.copydefault(c7031acE);
    }
}
