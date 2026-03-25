package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.auL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C7992auL<A, B, C, D> {
    public final A AEQbTJ;
    public final D EZpvd;
    public final C KWHzl;
    public final B OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.auL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C7992auL copy$default(C7992auL c7992auL, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i, java.lang.Object obj5) {
        if ((i & 1) != 0) {
            obj = c7992auL.AEQbTJ;
        }
        if ((i & 2) != 0) {
            obj2 = c7992auL.OLrzqt;
        }
        if ((i & 4) != 0) {
            obj3 = c7992auL.KWHzl;
        }
        if ((i & 8) != 0) {
            obj4 = c7992auL.EZpvd;
        }
        return c7992auL.AEQbTJ(obj, obj2, obj3, obj4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7992auL<A, B, C, D> AEQbTJ(A a2, B b, C c, D d) {
        return new C7992auL<>(a2, b, c, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final A KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final D OLrzqt() {
        return this.EZpvd;
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
        if (!(obj instanceof C7992auL)) {
            return false;
        }
        C7992auL c7992auL = (C7992auL) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c7992auL.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c7992auL.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c7992auL.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c7992auL.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        A a2 = this.AEQbTJ;
        int iHashCode = a2 == null ? 0 : a2.hashCode();
        B b = this.OLrzqt;
        int iHashCode2 = b == null ? 0 : b.hashCode();
        C c = this.KWHzl;
        int iHashCode3 = c == null ? 0 : c.hashCode();
        D d = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (d != null ? d.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Quadruple(a=" + this.AEQbTJ + ", b=" + this.OLrzqt + ", c=" + this.KWHzl + ", d=" + this.EZpvd + ')';
    }

    public C7992auL(A a2, B b, C c, D d) {
        this.AEQbTJ = a2;
        this.OLrzqt = b;
        this.KWHzl = c;
        this.EZpvd = d;
    }
}
