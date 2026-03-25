package o;

import com.ibm.icu.impl.StaticUnicodeSets;
import com.ibm.icu.text.DecimalFormatSymbols;

/* JADX INFO: renamed from: o.aeF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7138aeF extends AbstractC7212afa {
    public static final C7138aeF OLrzqt = new C7138aeF(false);
    public static final C7138aeF copydefault = new C7138aeF(true);
    public final boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "<MinusSignMatcher>";
    }

    public static C7138aeF OLrzqt(DecimalFormatSymbols decimalFormatSymbols, boolean z) {
        java.lang.String minusSignString = decimalFormatSymbols.getMinusSignString();
        C7138aeF c7138aeF = OLrzqt;
        if (C7150aeR.EZpvd(c7138aeF.gEmmrt, minusSignString)) {
            return z ? copydefault : c7138aeF;
        }
        return new C7138aeF(minusSignString, z);
    }

    public C7138aeF(java.lang.String str, boolean z) {
        super(str, OLrzqt.gEmmrt);
        this.KWHzl = z;
    }

    public C7138aeF(boolean z) {
        super(StaticUnicodeSets.Key.MINUS_SIGN);
        this.KWHzl = z;
    }

    @Override // o.AbstractC7212afa
    public boolean EZpvd(C7145aeM c7145aeM) {
        return !this.KWHzl && c7145aeM.copydefault();
    }

    @Override // o.AbstractC7212afa
    public void EZpvd(C7031acE c7031acE, C7145aeM c7145aeM) {
        c7145aeM.AEQbTJ |= 1;
        c7145aeM.copydefault(c7031acE);
    }
}
