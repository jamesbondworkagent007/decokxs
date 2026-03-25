package o;

/* JADX INFO: renamed from: o.ufw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48984ufw {
    public final int EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C48984ufw copy$default(C48984ufw c48984ufw, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c48984ufw.EZpvd;
        }
        return c48984ufw.copydefault(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48984ufw copydefault(int i) {
        return new C48984ufw(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C48984ufw) && this.EZpvd == ((C48984ufw) obj).EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AppModeInfo(okAppType=" + this.EZpvd + ")";
    }

    public C48984ufw(int i) {
        this.EZpvd = i;
    }
}
