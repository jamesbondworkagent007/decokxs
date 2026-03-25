package o;

/* JADX INFO: renamed from: o.aeV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7154aeV extends AbstractC7156aeX {
    public static final C7154aeV OLrzqt = new C7154aeV(true);
    public static final C7154aeV copydefault = new C7154aeV(false);
    public final boolean AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C7154aeV OLrzqt(boolean z) {
        return z ? OLrzqt : copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "<RequireDecimalSeparator>";
    }

    public C7154aeV(boolean z) {
        this.AEQbTJ = z;
    }

    @Override // o.InterfaceC7141aeI
    public void KWHzl(C7145aeM c7145aeM) {
        int i = c7145aeM.AEQbTJ;
        if (((i & 32) != 0) != this.AEQbTJ) {
            c7145aeM.AEQbTJ = i | 256;
        }
    }
}
