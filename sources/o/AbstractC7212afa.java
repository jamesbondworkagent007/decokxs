package o;

import com.ibm.icu.impl.StaticUnicodeSets;
import com.ibm.icu.text.UnicodeSet;

/* JADX INFO: renamed from: o.afa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7212afa implements InterfaceC7141aeI {
    public final java.lang.String djBIcL;
    public final UnicodeSet gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UnicodeSet EZpvd() {
        return this.gEmmrt;
    }

    public abstract void EZpvd(C7031acE c7031acE, C7145aeM c7145aeM);

    public abstract boolean EZpvd(C7145aeM c7145aeM);

    @Override // o.InterfaceC7141aeI
    public void KWHzl(C7145aeM c7145aeM) {
    }

    public AbstractC7212afa(java.lang.String str, UnicodeSet unicodeSet) {
        this.djBIcL = str;
        this.gEmmrt = unicodeSet;
    }

    public AbstractC7212afa(StaticUnicodeSets.Key key) {
        this.djBIcL = "";
        this.gEmmrt = StaticUnicodeSets.EZpvd(key);
    }

    @Override // o.InterfaceC7141aeI
    public boolean AEQbTJ(C7031acE c7031acE, C7145aeM c7145aeM) {
        int iEZpvd;
        if (EZpvd(c7145aeM)) {
            return false;
        }
        if (this.djBIcL.isEmpty()) {
            iEZpvd = 0;
        } else {
            iEZpvd = c7031acE.EZpvd(this.djBIcL);
            if (iEZpvd == this.djBIcL.length()) {
                c7031acE.EZpvd(this.djBIcL.length());
                EZpvd(c7031acE, c7145aeM);
                return false;
            }
        }
        if (!c7031acE.copydefault(this.gEmmrt)) {
            return iEZpvd == c7031acE.length();
        }
        c7031acE.EZpvd();
        EZpvd(c7031acE, c7145aeM);
        return false;
    }

    @Override // o.InterfaceC7141aeI
    public boolean OLrzqt(C7031acE c7031acE) {
        return c7031acE.copydefault(this.gEmmrt) || c7031acE.AEQbTJ(this.djBIcL);
    }
}
