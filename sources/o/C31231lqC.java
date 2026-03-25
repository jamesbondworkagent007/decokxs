package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.lqC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31231lqC {
    public final java.lang.Boolean AEQbTJ;
    public final java.lang.Boolean EZpvd;
    public final java.lang.Boolean KWHzl;
    public final java.lang.Boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C31231lqC() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31231lqC copy$default(C31231lqC c31231lqC, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = c31231lqC.OLrzqt;
        }
        if ((i & 2) != 0) {
            bool2 = c31231lqC.AEQbTJ;
        }
        if ((i & 4) != 0) {
            bool3 = c31231lqC.EZpvd;
        }
        if ((i & 8) != 0) {
            bool4 = c31231lqC.KWHzl;
        }
        return c31231lqC.copydefault(bool, bool2, bool3, bool4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31231lqC copydefault(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4) {
        return new C31231lqC(bool, bool2, bool3, bool4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31231lqC)) {
            return false;
        }
        C31231lqC c31231lqC = (C31231lqC) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c31231lqC.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c31231lqC.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c31231lqC.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c31231lqC.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Boolean bool = this.OLrzqt;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        java.lang.Boolean bool2 = this.AEQbTJ;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        java.lang.Boolean bool3 = this.EZpvd;
        int iHashCode3 = bool3 == null ? 0 : bool3.hashCode();
        java.lang.Boolean bool4 = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool4 != null ? bool4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CheckUserStatusInfo(checkFreeze=" + this.OLrzqt + ", checkCefi=" + this.AEQbTJ + ", checkEmail=" + this.EZpvd + ", checkIp=" + this.KWHzl + ")";
    }

    public C31231lqC(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4) {
        this.OLrzqt = bool;
        this.AEQbTJ = bool2;
        this.EZpvd = bool3;
        this.KWHzl = bool4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r2v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r5v0 java.lang.Boolean))
 A[MD:(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:6) call: o.lqC.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ C31231lqC(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4);
    }
}
