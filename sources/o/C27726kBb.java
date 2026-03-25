package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.kBb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27726kBb<T> {
    public final T AEQbTJ;
    public final double KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kBb */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C27726kBb copy$default(C27726kBb c27726kBb, double d, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            d = c27726kBb.KWHzl;
        }
        if ((i & 2) != 0) {
            obj = c27726kBb.AEQbTJ;
        }
        return c27726kBb.AEQbTJ(d, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27726kBb<T> AEQbTJ(double d, T t) {
        return new C27726kBb<>(d, t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27726kBb)) {
            return false;
        }
        C27726kBb c27726kBb = (C27726kBb) obj;
        return java.lang.Double.compare(this.KWHzl, c27726kBb.KWHzl) == 0 && Intrinsics.EZpvd(this.AEQbTJ, c27726kBb.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Double.hashCode(this.KWHzl);
        T t = this.AEQbTJ;
        return (iHashCode * 31) + (t == null ? 0 : t.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TreemapItem(weight=" + this.KWHzl + ", data=" + this.AEQbTJ + ")";
    }

    public C27726kBb(double d, T t) {
        this.KWHzl = d;
        this.AEQbTJ = t;
    }
}
