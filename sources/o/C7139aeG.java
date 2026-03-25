package o;

import com.ibm.icu.impl.StaticUnicodeSets;
import com.ibm.icu.text.UnicodeSet;
import o.InterfaceC7141aeI;

/* JADX INFO: renamed from: o.aeG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7139aeG extends AbstractC7212afa implements InterfaceC7141aeI.Activity {
    public static final C7139aeG copydefault = new C7139aeG(StaticUnicodeSets.EZpvd(StaticUnicodeSets.Key.DEFAULT_IGNORABLES));
    public static final C7139aeG OLrzqt = new C7139aeG(StaticUnicodeSets.EZpvd(StaticUnicodeSets.Key.STRICT_IGNORABLES));
    public static final C7139aeG AEQbTJ = new C7139aeG(StaticUnicodeSets.EZpvd(StaticUnicodeSets.Key.EMPTY));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C7139aeG OLrzqt(int i) {
        return (65536 & i) != 0 ? AEQbTJ : (i & 32768) != 0 ? OLrzqt : copydefault;
    }

    @Override // o.AbstractC7212afa
    public void EZpvd(C7031acE c7031acE, C7145aeM c7145aeM) {
    }

    @Override // o.AbstractC7212afa
    public boolean EZpvd(C7145aeM c7145aeM) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "<IgnorablesMatcher>";
    }

    public C7139aeG(UnicodeSet unicodeSet) {
        super("", unicodeSet);
    }
}
