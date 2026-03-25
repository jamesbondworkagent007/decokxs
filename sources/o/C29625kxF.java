package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kxF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29625kxF {
    public final java.util.List<C29626kxG> AEQbTJ;
    public final java.lang.Throwable KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29625kxF() {
        this(false, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kxF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C29625kxF copy$default(C29625kxF c29625kxF, boolean z, java.lang.Throwable th, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c29625kxF.copydefault;
        }
        if ((i & 2) != 0) {
            th = c29625kxF.KWHzl;
        }
        if ((i & 4) != 0) {
            list = c29625kxF.AEQbTJ;
        }
        return c29625kxF.AEQbTJ(z, th, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29625kxF AEQbTJ(boolean z, java.lang.Throwable th, @NotNull java.util.List<C29626kxG> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C29625kxF(z, th, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C29626kxG> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29625kxF)) {
            return false;
        }
        C29625kxF c29625kxF = (C29625kxF) obj;
        return this.copydefault == c29625kxF.copydefault && Intrinsics.EZpvd(this.KWHzl, c29625kxF.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c29625kxF.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.copydefault);
        java.lang.Throwable th = this.KWHzl;
        return (((iHashCode * 31) + (th == null ? 0 : th.hashCode())) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SmartMoneyAddressUiState(isLoading=" + this.copydefault + ", error=" + this.KWHzl + ", addresses=" + this.AEQbTJ + ")";
    }

    public C29625kxF(boolean z, java.lang.Throwable th, @NotNull java.util.List<C29626kxG> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = z;
        this.KWHzl = th;
        this.AEQbTJ = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r2v0 java.lang.Throwable))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000a: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:6)) : (r3v0 java.util.List))
 A[MD:(boolean, java.lang.Throwable, java.util.List<o.kxG>):void (m)] (LINE:3) call: o.kxF.<init>(boolean, java.lang.Throwable, java.util.List):void type: THIS */
    public /* synthetic */ C29625kxF(boolean z, java.lang.Throwable th, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : th, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
