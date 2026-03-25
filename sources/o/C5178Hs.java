package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.Hs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5178Hs<T> {
    public final int AEQbTJ;
    public final T copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Hs */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C5178Hs copy$default(C5178Hs c5178Hs, int i, java.lang.Object obj, int i2, java.lang.Object obj2) {
        if ((i2 & 1) != 0) {
            i = c5178Hs.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            obj = c5178Hs.copydefault;
        }
        return c5178Hs.AEQbTJ(i, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5178Hs<T> AEQbTJ(int i, T t) {
        return new C5178Hs<>(i, t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5178Hs)) {
            return false;
        }
        C5178Hs c5178Hs = (C5178Hs) obj;
        return this.AEQbTJ == c5178Hs.AEQbTJ && Intrinsics.EZpvd(this.copydefault, c5178Hs.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.AEQbTJ);
        T t = this.copydefault;
        return (iHashCode * 31) + (t == null ? 0 : t.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ParseResult(pos=" + this.AEQbTJ + ", result=" + this.copydefault + ')';
    }

    public C5178Hs(int i, T t) {
        this.AEQbTJ = i;
        this.copydefault = t;
    }
}
