package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mJd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31929mJd {
    public boolean AEQbTJ;
    public java.util.List<mHO> OLrzqt;
    public Job copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C31929mJd() {
        this(null, null, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mJd */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C31929mJd copy$default(C31929mJd c31929mJd, Job job, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            job = c31929mJd.copydefault;
        }
        if ((i & 2) != 0) {
            list = c31929mJd.OLrzqt;
        }
        if ((i & 4) != 0) {
            z = c31929mJd.AEQbTJ;
        }
        return c31929mJd.OLrzqt(job, list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Job job) {
        this.copydefault = job;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Job KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<mHO> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31929mJd OLrzqt(Job job, @NotNull java.util.List<mHO> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C31929mJd(job, list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.util.List<mHO> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31929mJd)) {
            return false;
        }
        C31929mJd c31929mJd = (C31929mJd) obj;
        return Intrinsics.EZpvd(this.copydefault, c31929mJd.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c31929mJd.OLrzqt) && this.AEQbTJ == c31929mJd.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Job job = this.copydefault;
        return ((((job == null ? 0 : job.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AnimationState(carouselJob=" + this.copydefault + ", tokenItems=" + this.OLrzqt + ", isAnimating=" + this.AEQbTJ + ")";
    }

    public C31929mJd(Job job, @NotNull java.util.List<mHO> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = job;
        this.OLrzqt = list;
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:kotlinx.coroutines.Job:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.coroutines.Job) : (r1v0 kotlinx.coroutines.Job))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:32)) : (r2v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000d: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(kotlinx.coroutines.Job, java.util.List<o.mHO>, boolean):void (m)] (LINE:30) call: o.mJd.<init>(kotlinx.coroutines.Job, java.util.List, boolean):void type: THIS */
    public /* synthetic */ C31929mJd(Job job, java.util.List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : job, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? false : z);
    }
}
