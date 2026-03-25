package o;

import com.ibm.icu.impl.StaticUnicodeSets;
import com.ibm.icu.text.DecimalFormatSymbols;

/* JADX INFO: renamed from: o.aeN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7146aeN extends AbstractC7212afa {
    public static final C7146aeN copydefault = new C7146aeN();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "<PermilleMatcher>";
    }

    public static C7146aeN AEQbTJ(DecimalFormatSymbols decimalFormatSymbols) {
        java.lang.String perMillString = decimalFormatSymbols.getPerMillString();
        C7146aeN c7146aeN = copydefault;
        return c7146aeN.gEmmrt.OLrzqt((java.lang.CharSequence) perMillString) ? c7146aeN : new C7146aeN(perMillString);
    }

    public C7146aeN(java.lang.String str) {
        super(str, copydefault.gEmmrt);
    }

    private C7146aeN() {
        super(StaticUnicodeSets.Key.PERMILLE_SIGN);
    }

    @Override // o.AbstractC7212afa
    public boolean EZpvd(C7145aeM c7145aeM) {
        return (c7145aeM.AEQbTJ & 4) != 0;
    }

    @Override // o.AbstractC7212afa
    public void EZpvd(C7031acE c7031acE, C7145aeM c7145aeM) {
        c7145aeM.AEQbTJ |= 4;
        c7145aeM.copydefault(c7031acE);
    }
}
