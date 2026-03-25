package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.auJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C7990auJ<A, B, C, D, E, F> {
    public final B AEQbTJ;
    public final D EZpvd;
    public final C KWHzl;
    public final A OLrzqt;
    public final E copydefault;
    public final F valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.auJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C7990auJ copy$default(C7990auJ c7990auJ, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, int i, java.lang.Object obj7) {
        if ((i & 1) != 0) {
            obj = c7990auJ.OLrzqt;
        }
        if ((i & 2) != 0) {
            obj2 = c7990auJ.AEQbTJ;
        }
        java.lang.Object obj8 = obj2;
        if ((i & 4) != 0) {
            obj3 = c7990auJ.KWHzl;
        }
        java.lang.Object obj9 = obj3;
        if ((i & 8) != 0) {
            obj4 = c7990auJ.EZpvd;
        }
        java.lang.Object obj10 = obj4;
        if ((i & 16) != 0) {
            obj5 = c7990auJ.copydefault;
        }
        java.lang.Object obj11 = obj5;
        if ((i & 32) != 0) {
            obj6 = c7990auJ.valueOf;
        }
        return c7990auJ.EZpvd(obj, obj8, obj9, obj10, obj11, obj6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final E AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final F AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final D EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7990auJ<A, B, C, D, E, F> EZpvd(A a2, B b, C c, D d, E e, F f) {
        return new C7990auJ<>(a2, b, c, d, e, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final A KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7990auJ)) {
            return false;
        }
        C7990auJ c7990auJ = (C7990auJ) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c7990auJ.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c7990auJ.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c7990auJ.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c7990auJ.EZpvd) && Intrinsics.EZpvd(this.copydefault, c7990auJ.copydefault) && Intrinsics.EZpvd(this.valueOf, c7990auJ.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        A a2 = this.OLrzqt;
        int iHashCode = a2 == null ? 0 : a2.hashCode();
        B b = this.AEQbTJ;
        int iHashCode2 = b == null ? 0 : b.hashCode();
        C c = this.KWHzl;
        int iHashCode3 = c == null ? 0 : c.hashCode();
        D d = this.EZpvd;
        int iHashCode4 = d == null ? 0 : d.hashCode();
        E e = this.copydefault;
        int iHashCode5 = e == null ? 0 : e.hashCode();
        F f = this.valueOf;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (f != null ? f.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Sextuple(a=" + this.OLrzqt + ", b=" + this.AEQbTJ + ", c=" + this.KWHzl + ", d=" + this.EZpvd + ", e=" + this.copydefault + ", f=" + this.valueOf + ')';
    }

    public C7990auJ(A a2, B b, C c, D d, E e, F f) {
        this.OLrzqt = a2;
        this.AEQbTJ = b;
        this.KWHzl = c;
        this.EZpvd = d;
        this.copydefault = e;
        this.valueOf = f;
    }
}
