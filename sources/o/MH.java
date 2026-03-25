package o;

/* JADX INFO: loaded from: classes2.dex */
public final class MH implements MJ {
    public java.lang.String EZpvd;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.MJ
    public void EZpvd(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.MJ
    public void copydefault(java.lang.String str) {
        this.EZpvd = str;
    }

    @Override // o.MJ
    public MF copydefault() {
        return new MF(this.copydefault, this.EZpvd);
    }
}
