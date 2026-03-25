package o;

import com.ibm.icu.impl.StaticUnicodeSets;
import com.ibm.icu.text.DecimalFormatSymbols;
import com.ibm.icu.text.UnicodeSet;

/* JADX INFO: renamed from: o.aeS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7151aeS implements InterfaceC7141aeI {
    public final C7136aeD AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final C7139aeG copydefault = C7139aeG.OLrzqt(32768);

    @Override // o.InterfaceC7141aeI
    public void KWHzl(C7145aeM c7145aeM) {
    }

    public static C7151aeS KWHzl(DecimalFormatSymbols decimalFormatSymbols, C7166aeh c7166aeh) {
        return new C7151aeS(decimalFormatSymbols, c7166aeh);
    }

    public C7151aeS(DecimalFormatSymbols decimalFormatSymbols, C7166aeh c7166aeh) {
        this.EZpvd = decimalFormatSymbols.getExponentSeparator();
        this.AEQbTJ = C7136aeD.OLrzqt(decimalFormatSymbols, c7166aeh, 48);
        java.lang.String minusSignString = decimalFormatSymbols.getMinusSignString();
        this.KWHzl = C7150aeR.EZpvd(copydefault(), minusSignString) ? null : minusSignString;
        java.lang.String plusSignString = decimalFormatSymbols.getPlusSignString();
        this.OLrzqt = C7150aeR.EZpvd(KWHzl(), plusSignString) ? null : plusSignString;
    }

    public static UnicodeSet copydefault() {
        return StaticUnicodeSets.EZpvd(StaticUnicodeSets.Key.MINUS_SIGN);
    }

    public static UnicodeSet KWHzl() {
        return StaticUnicodeSets.EZpvd(StaticUnicodeSets.Key.PLUS_SIGN);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    @Override // o.InterfaceC7141aeI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean AEQbTJ(C7031acE c7031acE, C7145aeM c7145aeM) {
        int i;
        if (!c7145aeM.copydefault() || (c7145aeM.AEQbTJ & 8) != 0) {
            return false;
        }
        int iAEQbTJ = c7031acE.AEQbTJ();
        int iEZpvd = c7031acE.EZpvd(this.EZpvd);
        if (iEZpvd != this.EZpvd.length()) {
            return iEZpvd == c7031acE.length();
        }
        if (c7031acE.length() == iEZpvd) {
            return true;
        }
        c7031acE.EZpvd(iEZpvd);
        this.copydefault.AEQbTJ(c7031acE, null);
        if (c7031acE.length() == 0) {
            c7031acE.AEQbTJ(iAEQbTJ);
            return true;
        }
        if (c7031acE.copydefault(copydefault())) {
            c7031acE.EZpvd();
        } else {
            if (c7031acE.copydefault(KWHzl())) {
                c7031acE.EZpvd();
            } else if (c7031acE.AEQbTJ(this.KWHzl)) {
                int iEZpvd2 = c7031acE.EZpvd(this.KWHzl);
                if (iEZpvd2 != this.KWHzl.length()) {
                    c7031acE.AEQbTJ(iAEQbTJ);
                    return true;
                }
                c7031acE.EZpvd(iEZpvd2);
            } else if (c7031acE.AEQbTJ(this.OLrzqt)) {
                int iEZpvd3 = c7031acE.EZpvd(this.OLrzqt);
                if (iEZpvd3 != this.OLrzqt.length()) {
                    c7031acE.AEQbTJ(iAEQbTJ);
                    return true;
                }
                c7031acE.EZpvd(iEZpvd3);
            }
            i = 1;
            if (c7031acE.length() != 0) {
                c7031acE.AEQbTJ(iAEQbTJ);
                return true;
            }
            this.copydefault.AEQbTJ(c7031acE, null);
            if (c7031acE.length() == 0) {
                c7031acE.AEQbTJ(iAEQbTJ);
                return true;
            }
            boolean z = c7145aeM.AhwBna == null;
            if (z) {
                c7145aeM.AhwBna = new C7167aei();
            }
            int iAEQbTJ2 = c7031acE.AEQbTJ();
            boolean zKWHzl = this.AEQbTJ.KWHzl(c7031acE, c7145aeM, i);
            if (z) {
                c7145aeM.AhwBna = null;
            }
            if (c7031acE.AEQbTJ() != iAEQbTJ2) {
                c7145aeM.AEQbTJ |= 8;
            } else {
                c7031acE.AEQbTJ(iAEQbTJ);
            }
            return zKWHzl;
        }
        i = -1;
        if (c7031acE.length() != 0) {
        }
    }

    @Override // o.InterfaceC7141aeI
    public boolean OLrzqt(C7031acE c7031acE) {
        return c7031acE.AEQbTJ(this.EZpvd);
    }

    public java.lang.String toString() {
        return "<ScientificMatcher " + this.EZpvd + ">";
    }
}
