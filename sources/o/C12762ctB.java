package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ctB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12762ctB {
    public final java.lang.Integer AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.Long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C12762ctB() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C12762ctB copy$default(C12762ctB c12762ctB, java.lang.Long l, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = c12762ctB.copydefault;
        }
        if ((i & 2) != 0) {
            num = c12762ctB.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str = c12762ctB.EZpvd;
        }
        return c12762ctB.copydefault(l, num, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12762ctB copydefault(java.lang.Long l, java.lang.Integer num, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C12762ctB(l, num, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12762ctB)) {
            return false;
        }
        C12762ctB c12762ctB = (C12762ctB) obj;
        return Intrinsics.EZpvd(this.copydefault, c12762ctB.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c12762ctB.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c12762ctB.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Long l = this.copydefault;
        int iHashCode = l == null ? 0 : l.hashCode();
        java.lang.Integer num = this.AEQbTJ;
        return (((iHashCode * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChainSignResult(generalChainId=" + this.copydefault + ", addressType=" + this.AEQbTJ + ", signResult=" + this.EZpvd + ")";
    }

    public C12762ctB(java.lang.Long l, java.lang.Integer num, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = l;
        this.AEQbTJ = num;
        this.EZpvd = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.Integer, java.lang.String):void (m)] (LINE:6) call: o.ctB.<init>(java.lang.Long, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ C12762ctB(java.lang.Long l, java.lang.Integer num, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : num, (i & 4) != 0 ? "" : str);
    }
}
