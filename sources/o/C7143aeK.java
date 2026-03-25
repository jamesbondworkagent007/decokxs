package o;

import com.ibm.icu.text.UnicodeSet;
import o.InterfaceC7141aeI;

/* JADX INFO: renamed from: o.aeK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7143aeK extends AbstractC7212afa implements InterfaceC7141aeI.Activity {
    @Override // o.AbstractC7212afa
    public void EZpvd(C7031acE c7031acE, C7145aeM c7145aeM) {
    }

    @Override // o.AbstractC7212afa
    public boolean EZpvd(C7145aeM c7145aeM) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "<PaddingMatcher>";
    }

    public static C7143aeK copydefault(java.lang.String str) {
        return new C7143aeK(str);
    }

    public C7143aeK(java.lang.String str) {
        super(str, UnicodeSet.OLrzqt);
    }
}
