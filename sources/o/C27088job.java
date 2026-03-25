package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.job, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27088job {
    public final java.lang.Throwable AEQbTJ;
    public final java.util.List<C27090jod> KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27088job() {
        this(null, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.job */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C27088job copy$default(C27088job c27088job, java.util.List list, boolean z, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c27088job.KWHzl;
        }
        if ((i & 2) != 0) {
            z = c27088job.copydefault;
        }
        if ((i & 4) != 0) {
            th = c27088job.AEQbTJ;
        }
        return c27088job.EZpvd(list, z, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27088job EZpvd(@NotNull java.util.List<C27090jod> list, boolean z, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C27088job(list, z, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C27090jod> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27088job)) {
            return false;
        }
        C27088job c27088job = (C27088job) obj;
        return Intrinsics.EZpvd(this.KWHzl, c27088job.KWHzl) && this.copydefault == c27088job.copydefault && Intrinsics.EZpvd(this.AEQbTJ, c27088job.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.copydefault);
        java.lang.Throwable th = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (th == null ? 0 : th.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ValidatorSelectionUiState(validators=" + this.KWHzl + ", isLoading=" + this.copydefault + ", error=" + this.AEQbTJ + ")";
    }

    public C27088job(@NotNull java.util.List<C27090jod> list, boolean z, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
        this.copydefault = z;
        this.AEQbTJ = th;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:4)) : (r1v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000d: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
 A[MD:(java.util.List<o.jod>, boolean, java.lang.Throwable):void (m)] (LINE:3) call: o.job.<init>(java.util.List, boolean, java.lang.Throwable):void type: THIS */
    public /* synthetic */ C27088job(java.util.List list, boolean z, java.lang.Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : th);
    }
}
