package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.liB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30806liB {
    public boolean AEQbTJ;
    public C30808liD EZpvd;
    public boolean KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C30806liB() {
        this(false, false, false, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C30806liB copy$default(C30806liB c30806liB, boolean z, boolean z2, boolean z3, C30808liD c30808liD, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c30806liB.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z2 = c30806liB.KWHzl;
        }
        if ((i & 4) != 0) {
            z3 = c30806liB.copydefault;
        }
        if ((i & 8) != 0) {
            c30808liD = c30806liB.EZpvd;
        }
        return c30806liB.copydefault(z, z2, z3, c30808liD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30806liB copydefault(boolean z, boolean z2, boolean z3, @NotNull C30808liD c30808liD) {
        Intrinsics.checkNotNullParameter(c30808liD, "");
        return new C30806liB(z, z2, z3, c30808liD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30808liD copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30806liB)) {
            return false;
        }
        C30806liB c30806liB = (C30806liB) obj;
        return this.AEQbTJ == c30806liB.AEQbTJ && this.KWHzl == c30806liB.KWHzl && this.copydefault == c30806liB.copydefault && Intrinsics.EZpvd(this.EZpvd, c30806liB.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.AEQbTJ) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AdvancedSettingUiState(isLoading=" + this.AEQbTJ + ", isInit=" + this.KWHzl + ", isSupportMev=" + this.copydefault + ", model=" + this.EZpvd + ")";
    }

    public C30806liB(boolean z, boolean z2, boolean z3, @NotNull C30808liD c30808liD) {
        Intrinsics.checkNotNullParameter(c30808liD, "");
        this.AEQbTJ = z;
        this.KWHzl = z2;
        this.copydefault = z3;
        this.EZpvd = c30808liD;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
  (wrap:o.liD:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.liD:0x0016: INVOKE (wrap:o.liD$Application:0x0014: SGET  A[WRAPPED] (LINE:12) o.liD.Companion o.liD$Application) VIRTUAL call: o.liD.Application.copydefault():o.liD A[MD:():o.liD (m), WRAPPED] (LINE:12)) : (r5v0 o.liD))
 A[MD:(boolean, boolean, boolean, o.liD):void (m)] (LINE:8) call: o.liB.<init>(boolean, boolean, boolean, o.liD):void type: THIS */
    public /* synthetic */ C30806liB(boolean z, boolean z2, boolean z3, C30808liD c30808liD, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? C30808liD.Companion.copydefault() : c30808liD);
    }
}
