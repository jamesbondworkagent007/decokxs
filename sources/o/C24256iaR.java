package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iaR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C24256iaR {
    public C24259iaU EZpvd;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C24256iaR() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C24256iaR copy$default(C24256iaR c24256iaR, java.lang.String str, C24259iaU c24259iaU, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c24256iaR.OLrzqt;
        }
        if ((i & 2) != 0) {
            c24259iaU = c24256iaR.EZpvd;
        }
        return c24256iaR.OLrzqt(str, c24259iaU);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24259iaU EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24256iaR OLrzqt(@NotNull java.lang.String str, C24259iaU c24259iaU) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C24256iaR(str, c24259iaU);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24256iaR)) {
            return false;
        }
        C24256iaR c24256iaR = (C24256iaR) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c24256iaR.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c24256iaR.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        C24259iaU c24259iaU = this.EZpvd;
        return (iHashCode * 31) + (c24259iaU == null ? 0 : c24259iaU.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ResultContractBean(data=" + this.OLrzqt + ", openContractBean=" + this.EZpvd + ")";
    }

    public C24256iaR(@NotNull java.lang.String str, C24259iaU c24259iaU) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.EZpvd = c24259iaU;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:o.iaU:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.iaU) : (r2v0 o.iaU))
 A[MD:(java.lang.String, o.iaU):void (m)] (LINE:202) call: o.iaR.<init>(java.lang.String, o.iaU):void type: THIS */
    public /* synthetic */ C24256iaR(java.lang.String str, C24259iaU c24259iaU, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : c24259iaU);
    }
}
