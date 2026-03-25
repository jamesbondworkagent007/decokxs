package o;

/* JADX INFO: renamed from: o.aYO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6913aYO implements InterfaceC6912aYN {
    public long AEQbTJ;
    public InterfaceC6911aYM EZpvd;
    public java.lang.String KWHzl;
    public boolean OLrzqt = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC6912aYN
    public java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(java.lang.String str) {
        this.KWHzl = str;
    }

    public void AEQbTJ(boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC6912aYN
    public InterfaceC6911aYM EZpvd() {
        return this.EZpvd;
    }

    public boolean OLrzqt() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(InterfaceC6911aYM interfaceC6911aYM) {
        this.EZpvd = interfaceC6911aYM;
    }

    @Override // o.InterfaceC6910aYL
    public java.lang.String format() {
        return C6946aYv.EZpvd(this);
    }
}
