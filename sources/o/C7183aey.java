package o;

import com.ibm.icu.impl.StandardPlural;
import com.ibm.icu.text.DecimalFormatSymbols;
import com.ibm.icu.util.Currency;
import o.C7029acC;

/* JADX INFO: renamed from: o.aey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7183aey implements InterfaceC7141aeI {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String[] djBIcL;
    public final C7029acC<Currency.Activity> gEmmrt;
    public final C7029acC<Currency.Activity> valueOf;

    @Override // o.InterfaceC7141aeI
    public void KWHzl(C7145aeM c7145aeM) {
    }

    @Override // o.InterfaceC7141aeI
    public boolean OLrzqt(C7031acE c7031acE) {
        return true;
    }

    public static C7183aey KWHzl(Currency currency, DecimalFormatSymbols decimalFormatSymbols, int i) {
        return new C7183aey(currency, decimalFormatSymbols, i);
    }

    public C7183aey(Currency currency, DecimalFormatSymbols decimalFormatSymbols, int i) {
        this.AEQbTJ = currency.getSubtype();
        this.EZpvd = currency.getSymbol(decimalFormatSymbols.getULocale());
        this.copydefault = currency.getCurrencyCode();
        this.KWHzl = decimalFormatSymbols.getPatternForCurrencySpacing(2, false);
        this.OLrzqt = decimalFormatSymbols.getPatternForCurrencySpacing(2, true);
        if ((i & 8192) == 0) {
            this.gEmmrt = Currency.getParsingTrie(decimalFormatSymbols.getULocale(), 1);
            this.valueOf = Currency.getParsingTrie(decimalFormatSymbols.getULocale(), 0);
            this.djBIcL = null;
            return;
        }
        this.gEmmrt = null;
        this.valueOf = null;
        this.djBIcL = new java.lang.String[StandardPlural.COUNT];
        for (int i2 = 0; i2 < StandardPlural.COUNT; i2++) {
            this.djBIcL[i2] = currency.getName(decimalFormatSymbols.getLocale(), 2, StandardPlural.VALUES.get(i2).getKeyword(), (boolean[]) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    @Override // o.InterfaceC7141aeI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean AEQbTJ(C7031acE c7031acE, C7145aeM c7145aeM) {
        boolean z;
        if (c7145aeM.KWHzl != null) {
            return false;
        }
        int iAEQbTJ = c7031acE.AEQbTJ();
        if (c7145aeM.copydefault() && !this.OLrzqt.isEmpty()) {
            int iEZpvd = c7031acE.EZpvd(this.OLrzqt);
            if (iEZpvd == this.OLrzqt.length()) {
                c7031acE.EZpvd(iEZpvd);
            }
            if (iEZpvd == c7031acE.length()) {
            }
        } else {
            z = copydefault(c7031acE, c7145aeM);
        }
        if (c7145aeM.KWHzl == null) {
            c7031acE.AEQbTJ(iAEQbTJ);
            return z;
        }
        if (c7145aeM.copydefault() || this.KWHzl.isEmpty()) {
            return z;
        }
        int iEZpvd2 = c7031acE.EZpvd(this.KWHzl);
        if (iEZpvd2 == this.KWHzl.length()) {
            c7031acE.EZpvd(iEZpvd2);
        }
        return z || iEZpvd2 == c7031acE.length();
    }

    public final boolean copydefault(C7031acE c7031acE, C7145aeM c7145aeM) {
        int iOLrzqt = !this.EZpvd.isEmpty() ? c7031acE.OLrzqt(this.EZpvd) : -1;
        boolean z = true;
        boolean z2 = iOLrzqt == c7031acE.length();
        if (iOLrzqt == this.EZpvd.length()) {
            c7145aeM.KWHzl = this.AEQbTJ;
            c7031acE.EZpvd(iOLrzqt);
            c7145aeM.copydefault(c7031acE);
            return z2;
        }
        int iEZpvd = this.copydefault.isEmpty() ? -1 : c7031acE.EZpvd(this.copydefault);
        boolean z3 = z2 || iEZpvd == c7031acE.length();
        if (iEZpvd == this.copydefault.length()) {
            c7145aeM.KWHzl = this.AEQbTJ;
            c7031acE.EZpvd(iEZpvd);
            c7145aeM.copydefault(c7031acE);
            return z3;
        }
        if (this.gEmmrt != null) {
            C7029acC.Activity activity = new C7029acC.Activity();
            java.util.Iterator<Currency.Activity> itAEQbTJ = this.gEmmrt.AEQbTJ(c7031acE, 0, activity);
            boolean z4 = z3 || activity.AEQbTJ;
            if (itAEQbTJ == null) {
                itAEQbTJ = this.valueOf.AEQbTJ(c7031acE, 0, activity);
                if (!z4 && !activity.AEQbTJ) {
                    z = false;
                }
            } else {
                z = z4;
            }
            if (itAEQbTJ == null) {
                return z;
            }
            c7145aeM.KWHzl = itAEQbTJ.next().OLrzqt();
            c7031acE.EZpvd(activity.copydefault);
            c7145aeM.copydefault(c7031acE);
            return z;
        }
        int length = 0;
        for (int i = 0; i < StandardPlural.COUNT; i++) {
            java.lang.String str = this.djBIcL[i];
            if (!str.isEmpty()) {
                int iEZpvd2 = c7031acE.EZpvd(str);
                if (iEZpvd2 == str.length() && str.length() > length) {
                    length = str.length();
                }
                z3 = z3 || iEZpvd2 > 0;
            }
        }
        if (length > 0) {
            c7145aeM.KWHzl = this.AEQbTJ;
            c7031acE.EZpvd(length);
            c7145aeM.copydefault(c7031acE);
        }
        return z3;
    }

    public java.lang.String toString() {
        return "<CombinedCurrencyMatcher " + this.AEQbTJ + ">";
    }
}
