package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.qVn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40429qVn {
    public final boolean AEQbTJ;
    public final java.util.List<java.lang.String> EZpvd;
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qVn */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C40429qVn copy$default(C40429qVn c40429qVn, java.util.Map map, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = c40429qVn.OLrzqt;
        }
        if ((i & 2) != 0) {
            list = c40429qVn.EZpvd;
        }
        if ((i & 4) != 0) {
            z = c40429qVn.AEQbTJ;
        }
        return c40429qVn.EZpvd(map, list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40429qVn EZpvd(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, java.util.List<java.lang.String> list, boolean z) {
        return new C40429qVn(map, list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40429qVn)) {
            return false;
        }
        C40429qVn c40429qVn = (C40429qVn) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c40429qVn.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c40429qVn.EZpvd) && this.AEQbTJ == c40429qVn.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.OLrzqt;
        int iHashCode = map == null ? 0 : map.hashCode();
        java.util.List<java.lang.String> list = this.EZpvd;
        return (((iHashCode * 31) + (list != null ? list.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetHttpTickersPayload(instIdMap=" + this.OLrzqt + ", ccyList=" + this.EZpvd + ", requestAllCcy=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C40429qVn(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, java.util.List<java.lang.String> list, boolean z) {
        this.OLrzqt = map;
        this.EZpvd = list;
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.Map)
  (r2v0 java.util.List)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, java.util.List<java.lang.String>, boolean):void (m)] (LINE:16) call: o.qVn.<init>(java.util.Map, java.util.List, boolean):void type: THIS */
    public /* synthetic */ C40429qVn(java.util.Map map, java.util.List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, list, (i & 4) != 0 ? false : z);
    }
}
