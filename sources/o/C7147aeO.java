package o;

import com.ibm.icu.impl.StaticUnicodeSets;
import com.ibm.icu.text.DecimalFormatSymbols;

/* JADX INFO: renamed from: o.aeO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7147aeO extends AbstractC7212afa {
    public final boolean KWHzl;
    public static final C7147aeO OLrzqt = new C7147aeO(false);
    public static final C7147aeO EZpvd = new C7147aeO(true);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "<PlusSignMatcher>";
    }

    public static C7147aeO KWHzl(DecimalFormatSymbols decimalFormatSymbols, boolean z) {
        java.lang.String plusSignString = decimalFormatSymbols.getPlusSignString();
        C7147aeO c7147aeO = OLrzqt;
        if (C7150aeR.EZpvd(c7147aeO.gEmmrt, plusSignString)) {
            return z ? EZpvd : c7147aeO;
        }
        return new C7147aeO(plusSignString, z);
    }

    public C7147aeO(java.lang.String str, boolean z) {
        super(str, OLrzqt.gEmmrt);
        this.KWHzl = z;
    }

    public C7147aeO(boolean z) {
        super(StaticUnicodeSets.Key.PLUS_SIGN);
        this.KWHzl = z;
    }

    @Override // o.AbstractC7212afa
    public boolean EZpvd(C7145aeM c7145aeM) {
        return !this.KWHzl && c7145aeM.copydefault();
    }

    @Override // o.AbstractC7212afa
    public void EZpvd(C7031acE c7031acE, C7145aeM c7145aeM) {
        c7145aeM.copydefault(c7031acE);
    }
}
