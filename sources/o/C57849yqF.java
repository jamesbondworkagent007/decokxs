package o;

/* JADX INFO: renamed from: o.yqF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57849yqF {
    public java.lang.String AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.AEQbTJ;
    }

    public C57849yqF(java.lang.String str) {
        this.AEQbTJ = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C57849yqF) {
            return ((C57849yqF) obj).AEQbTJ.equalsIgnoreCase(this.AEQbTJ);
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
