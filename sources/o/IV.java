package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class IV {
    public final java.util.Map<java.lang.String, java.lang.Object> AEQbTJ;
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.IV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IV copy$default(IV iv, java.lang.String str, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = iv.copydefault;
        }
        if ((i & 2) != 0) {
            map = iv.AEQbTJ;
        }
        if ((i & 4) != 0) {
            map2 = iv.KWHzl;
        }
        return iv.copydefault(str, map, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.Object> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IV copydefault(@NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> map2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new IV(str, map, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IV)) {
            return false;
        }
        IV iv = (IV) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) iv.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, iv.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, iv.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        java.util.Map<java.lang.String, java.lang.Object> map = this.AEQbTJ;
        int iHashCode2 = map == null ? 0 : map.hashCode();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map2 = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (map2 != null ? map2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AnalyticsEvent(eventType=" + this.copydefault + ", eventProperties=" + this.AEQbTJ + ", userProperties=" + this.KWHzl + ')';
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> */
    /* JADX WARN: Multi-variable type inference failed */
    public IV(@NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> map2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.AEQbTJ = map;
        this.KWHzl = map2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r3v0 java.util.Map))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r4v0 java.util.Map))
 A[MD:(java.lang.String, java.util.Map<java.lang.String, ? extends java.lang.Object>, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>):void (m)] (LINE:7) call: o.IV.<init>(java.lang.String, java.util.Map, java.util.Map):void type: THIS */
    public /* synthetic */ IV(java.lang.String str, java.util.Map map, java.util.Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : map2);
    }
}
