package o;

import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import o.C7113adh;

/* JADX INFO: renamed from: o.adc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7108adc {
    public java.lang.String AEQbTJ;
    public C7113adh.ActionBar<C7110ade> AhwBna;
    public java.util.Map<java.lang.Integer, java.lang.Integer> EZpvd;
    public C7048acV KWHzl;
    public C7048acV OLrzqt;
    public C7033acG djBIcL;
    public UnicodeSet gEmmrt;
    public UResourceBundle valueOf;
    public ULocale copydefault = ULocale.ROOT;
    public int AYXKKw = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(UResourceBundle uResourceBundle) {
        this.valueOf = uResourceBundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt() {
        int i = this.AYXKKw;
        return ((i >> 12) & 4080) | ((i >> 14) & 3);
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: o.adh$ActionBar<T extends o.adh>, o.adh$ActionBar<o.ade> */
    public C7108adc(C7113adh.ActionBar<C7110ade> actionBar) {
        if (actionBar != null) {
            this.AhwBna = actionBar.clone();
        } else {
            this.AhwBna = new C7113adh.ActionBar<>(new C7110ade());
        }
    }

    public void EZpvd() {
        if (this.OLrzqt == null) {
            this.OLrzqt = new C7048acV(C7067aco.AEQbTJ().AhwBna);
        }
        this.KWHzl = this.OLrzqt;
    }

    public java.lang.String AEQbTJ() {
        java.lang.String str = this.AEQbTJ;
        if (str != null) {
            return str;
        }
        UResourceBundle uResourceBundle = this.valueOf;
        return uResourceBundle != null ? uResourceBundle.getFieldNames() : "";
    }
}
