package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.tYk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46548tYk<T> {
    public boolean EZpvd;
    public final T copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tYk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C46548tYk copy$default(C46548tYk c46548tYk, boolean z, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            z = c46548tYk.EZpvd;
        }
        if ((i & 2) != 0) {
            obj = c46548tYk.copydefault;
        }
        return c46548tYk.KWHzl(z, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46548tYk<T> KWHzl(boolean z, T t) {
        return new C46548tYk<>(z, t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46548tYk)) {
            return false;
        }
        C46548tYk c46548tYk = (C46548tYk) obj;
        return this.EZpvd == c46548tYk.EZpvd && Intrinsics.EZpvd(this.copydefault, c46548tYk.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.EZpvd);
        T t = this.copydefault;
        return (iHashCode * 31) + (t == null ? 0 : t.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Selectable(isSelected=" + this.EZpvd + ", data=" + this.copydefault + ")";
    }

    public C46548tYk(boolean z, T t) {
        this.EZpvd = z;
        this.copydefault = t;
    }
}
