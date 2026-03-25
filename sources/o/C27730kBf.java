package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.kBf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27730kBf<T> {
    public final int AEQbTJ;
    public final float EZpvd;
    public final int KWHzl;
    public final T OLrzqt;
    public final float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.kBf */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C27730kBf copy$default(C27730kBf c27730kBf, int i, int i2, float f, float f2, java.lang.Object obj, int i3, java.lang.Object obj2) {
        if ((i3 & 1) != 0) {
            i = c27730kBf.KWHzl;
        }
        if ((i3 & 2) != 0) {
            i2 = c27730kBf.AEQbTJ;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            f = c27730kBf.EZpvd;
        }
        float f3 = f;
        if ((i3 & 8) != 0) {
            f2 = c27730kBf.copydefault;
        }
        float f4 = f2;
        if ((i3 & 16) != 0) {
            obj = c27730kBf.OLrzqt;
        }
        return c27730kBf.OLrzqt(i, i4, f3, f4, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27730kBf<T> OLrzqt(int i, int i2, float f, float f2, T t) {
        return new C27730kBf<>(i, i2, f, f2, t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27730kBf)) {
            return false;
        }
        C27730kBf c27730kBf = (C27730kBf) obj;
        return this.KWHzl == c27730kBf.KWHzl && this.AEQbTJ == c27730kBf.AEQbTJ && java.lang.Float.compare(this.EZpvd, c27730kBf.EZpvd) == 0 && java.lang.Float.compare(this.copydefault, c27730kBf.copydefault) == 0 && Intrinsics.EZpvd(this.OLrzqt, c27730kBf.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.KWHzl);
        int iHashCode2 = java.lang.Integer.hashCode(this.AEQbTJ);
        int iHashCode3 = java.lang.Float.hashCode(this.EZpvd);
        int iHashCode4 = java.lang.Float.hashCode(this.copydefault);
        T t = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (t == null ? 0 : t.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TreeMapLayoutData(posX=" + this.KWHzl + ", posY=" + this.AEQbTJ + ", width=" + this.EZpvd + ", height=" + this.copydefault + ", item=" + this.OLrzqt + ")";
    }

    public C27730kBf(int i, int i2, float f, float f2, T t) {
        this.KWHzl = i;
        this.AEQbTJ = i2;
        this.EZpvd = f;
        this.copydefault = f2;
        this.OLrzqt = t;
    }
}
