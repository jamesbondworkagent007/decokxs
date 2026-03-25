package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LP {
    public final java.lang.Object AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.util.Map<java.lang.String, java.lang.Object> KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LP() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.LP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LP copy$default(LP lp, java.lang.String str, java.lang.Object obj, java.lang.String str2, java.lang.String str3, java.util.Map map, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = lp.OLrzqt;
        }
        if ((i & 2) != 0) {
            obj = lp.AEQbTJ;
        }
        java.lang.Object obj3 = obj;
        if ((i & 4) != 0) {
            str2 = lp.EZpvd;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            str3 = lp.copydefault;
        }
        java.lang.String str5 = str3;
        if ((i & 16) != 0) {
            map = lp.KWHzl;
        }
        return lp.KWHzl(str, obj3, str4, str5, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault == null && this.OLrzqt == null && this.AEQbTJ == null && this.EZpvd == null && this.KWHzl == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LP KWHzl(java.lang.String str, java.lang.Object obj, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        return new LP(str, obj, str2, str3, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LP)) {
            return false;
        }
        LP lp = (LP) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) lp.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, lp.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) lp.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) lp.copydefault) && Intrinsics.EZpvd(this.KWHzl, lp.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.Object obj = this.AEQbTJ;
        int iHashCode2 = obj == null ? 0 : obj.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.copydefault;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        java.util.Map<java.lang.String, java.lang.Object> map = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Variant(value=" + this.OLrzqt + ", payload=" + this.AEQbTJ + ", expKey=" + this.EZpvd + ", key=" + this.copydefault + ", metadata=" + this.KWHzl + ')';
    }

    public LP(java.lang.String str, java.lang.Object obj, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        this.OLrzqt = str;
        this.AEQbTJ = obj;
        this.EZpvd = str2;
        this.copydefault = str3;
        this.KWHzl = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r6v0 java.lang.Object))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r9v0 java.util.Map))
 A[MD:(java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.util.Map<java.lang.String, ? extends java.lang.Object>):void (m)] (LINE:5) call: o.LP.<init>(java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.util.Map):void type: THIS */
    public /* synthetic */ LP(java.lang.String str, java.lang.Object obj, java.lang.String str2, java.lang.String str3, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : map);
    }

    public final boolean KWHzl() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.KWHzl;
        java.lang.Object obj = map != null ? map.get("default") : null;
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
