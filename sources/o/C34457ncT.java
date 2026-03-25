package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ncT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34457ncT {
    public final boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public final java.lang.Throwable copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34457ncT() {
        this(false, false, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C34457ncT copy$default(C34457ncT c34457ncT, boolean z, boolean z2, java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c34457ncT.OLrzqt;
        }
        if ((i & 2) != 0) {
            z2 = c34457ncT.AEQbTJ;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            str = c34457ncT.EZpvd;
        }
        java.lang.String str3 = str;
        if ((i & 8) != 0) {
            str2 = c34457ncT.KWHzl;
        }
        java.lang.String str4 = str2;
        if ((i & 16) != 0) {
            th = c34457ncT.copydefault;
        }
        return c34457ncT.AEQbTJ(z, z3, str3, str4, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34457ncT AEQbTJ(boolean z, boolean z2, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C34457ncT(z, z2, str, str2, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34457ncT)) {
            return false;
        }
        C34457ncT c34457ncT = (C34457ncT) obj;
        return this.OLrzqt == c34457ncT.OLrzqt && this.AEQbTJ == c34457ncT.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c34457ncT.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c34457ncT.KWHzl) && Intrinsics.EZpvd(this.copydefault, c34457ncT.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.OLrzqt);
        int iHashCode2 = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode3 = this.EZpvd.hashCode();
        int iHashCode4 = this.KWHzl.hashCode();
        java.lang.Throwable th = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (th == null ? 0 : th.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TokenBalanceUiState(isLoading=" + this.OLrzqt + ", isTokenSupported=" + this.AEQbTJ + ", balance=" + this.EZpvd + ", balanceUsd=" + this.KWHzl + ", error=" + this.copydefault + ")";
    }

    public C34457ncT(boolean z, boolean z2, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = z;
        this.AEQbTJ = z2;
        this.EZpvd = str;
        this.KWHzl = str2;
        this.copydefault = th;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r5v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x001e: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r8v0 java.lang.Throwable))
 A[MD:(boolean, boolean, java.lang.String, java.lang.String, java.lang.Throwable):void (m)] (LINE:14) call: o.ncT.<init>(boolean, boolean, java.lang.String, java.lang.String, java.lang.Throwable):void type: THIS */
    public /* synthetic */ C34457ncT(boolean z, boolean z2, java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : th);
    }
}
