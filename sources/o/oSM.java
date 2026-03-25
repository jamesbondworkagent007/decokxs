package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class oSM<A, B, C, D> {
    public final C AEQbTJ;
    public final B EZpvd;
    public final A KWHzl;
    public final D copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oSM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ oSM copy$default(oSM osm, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i, java.lang.Object obj5) {
        if ((i & 1) != 0) {
            obj = osm.KWHzl;
        }
        if ((i & 2) != 0) {
            obj2 = osm.EZpvd;
        }
        if ((i & 4) != 0) {
            obj3 = osm.AEQbTJ;
        }
        if ((i & 8) != 0) {
            obj4 = osm.copydefault;
        }
        return osm.copydefault(obj, obj2, obj3, obj4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final A AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final D KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oSM<A, B, C, D> copydefault(A a2, B b, C c, D d) {
        return new oSM<>(a2, b, c, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oSM)) {
            return false;
        }
        oSM osm = (oSM) obj;
        return Intrinsics.EZpvd(this.KWHzl, osm.KWHzl) && Intrinsics.EZpvd(this.EZpvd, osm.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, osm.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, osm.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        A a2 = this.KWHzl;
        int iHashCode = a2 == null ? 0 : a2.hashCode();
        B b = this.EZpvd;
        int iHashCode2 = b == null ? 0 : b.hashCode();
        C c = this.AEQbTJ;
        int iHashCode3 = c == null ? 0 : c.hashCode();
        D d = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (d != null ? d.hashCode() : 0);
    }

    public oSM(A a2, B b, C c, D d) {
        this.KWHzl = a2;
        this.EZpvd = b;
        this.AEQbTJ = c;
        this.copydefault = d;
    }

    public java.lang.String toString() {
        return "(" + this.KWHzl + ", " + this.EZpvd + ", " + this.AEQbTJ + ", " + this.copydefault + ")";
    }
}
