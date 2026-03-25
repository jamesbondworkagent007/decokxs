package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.zfL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59345zfL<T> {
    public final T EZpvd;
    public final T KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59345zfL)) {
            return false;
        }
        C59345zfL c59345zfL = (C59345zfL) obj;
        return Intrinsics.EZpvd(this.KWHzl, c59345zfL.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c59345zfL.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        T t = this.KWHzl;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.EZpvd;
        return (iHashCode * 31) + (t2 != null ? t2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ApproximationBounds(lower=" + this.KWHzl + ", upper=" + this.EZpvd + ')';
    }

    public C59345zfL(T t, T t2) {
        this.KWHzl = t;
        this.EZpvd = t2;
    }
}
