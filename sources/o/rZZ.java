package o;

/* JADX INFO: loaded from: classes16.dex */
public final class rZZ {
    public final int EZpvd;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ rZZ copy$default(rZZ rzz, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = rzz.copydefault;
        }
        if ((i3 & 2) != 0) {
            i2 = rzz.EZpvd;
        }
        return rzz.KWHzl(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final rZZ KWHzl(int i, int i2) {
        return new rZZ(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rZZ)) {
            return false;
        }
        rZZ rzz = (rZZ) obj;
        return this.copydefault == rzz.copydefault && this.EZpvd == rzz.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.copydefault) * 31) + java.lang.Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CategoryInfo(bizType=" + this.copydefault + ", msgType=" + this.EZpvd + ")";
    }

    public rZZ(int i, int i2) {
        this.copydefault = i;
        this.EZpvd = i2;
    }
}
