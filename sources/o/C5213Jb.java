package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5213Jb {
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.Map<java.lang.String, java.lang.Object> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5213Jb() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Jb */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C5213Jb copy$default(C5213Jb c5213Jb, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c5213Jb.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = c5213Jb.KWHzl;
        }
        if ((i & 4) != 0) {
            map = c5213Jb.OLrzqt;
        }
        return c5213Jb.EZpvd(str, str2, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.Object> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5213Jb EZpvd(java.lang.String str, java.lang.String str2, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new C5213Jb(str, str2, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5213Jb)) {
            return false;
        }
        C5213Jb c5213Jb = (C5213Jb) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c5213Jb.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c5213Jb.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c5213Jb.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Identity(userId=" + ((java.lang.Object) this.EZpvd) + ", deviceId=" + ((java.lang.Object) this.KWHzl) + ", userProperties=" + this.OLrzqt + ')';
    }

    public C5213Jb(java.lang.String str, java.lang.String str2, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd = str;
        this.KWHzl = str2;
        this.OLrzqt = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x000f: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:16)) : (r4v0 java.util.Map))
 A[MD:(java.lang.String, java.lang.String, java.util.Map<java.lang.String, ? extends java.lang.Object>):void (m)] (LINE:13) call: o.Jb.<init>(java.lang.String, java.lang.String, java.util.Map):void type: THIS */
    public /* synthetic */ C5213Jb(java.lang.String str, java.lang.String str2, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? C56424yEw.KWHzl() : map);
    }
}
