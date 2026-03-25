package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mXJ {
    public final java.lang.Object EZpvd;
    public final boolean KWHzl;
    public final mXK OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public mXJ() {
        this(null, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ mXJ copy$default(mXJ mxj, mXK mxk, boolean z, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            mxk = mxj.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = mxj.KWHzl;
        }
        if ((i & 4) != 0) {
            obj = mxj.EZpvd;
        }
        return mxj.OLrzqt(mxk, z, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final mXJ OLrzqt(@NotNull mXK mxk, boolean z, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(mxk, "");
        return new mXJ(mxk, z, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final mXK OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mXJ)) {
            return false;
        }
        mXJ mxj = (mXJ) obj;
        return Intrinsics.EZpvd(this.OLrzqt, mxj.OLrzqt) && this.KWHzl == mxj.KWHzl && Intrinsics.EZpvd(this.EZpvd, mxj.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.Object obj = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DataUiState(loading=" + this.OLrzqt + ", error=" + this.KWHzl + ", successData=" + this.EZpvd + ")";
    }

    public mXJ(@NotNull mXK mxk, boolean z, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(mxk, "");
        this.OLrzqt = mxk;
        this.KWHzl = z;
        this.EZpvd = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:o.mXK:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.mXK:0x000c: CONSTRUCTOR false, false, false, (7 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:4) call: o.mXK.<init>(boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 o.mXK))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0014: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r9v0 java.lang.Object))
 A[MD:(o.mXK, boolean, java.lang.Object):void (m)] (LINE:3) call: o.mXJ.<init>(o.mXK, boolean, java.lang.Object):void type: THIS */
    public /* synthetic */ mXJ(mXK mxk, boolean z, java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new mXK(false, false, false, 7, null) : mxk, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : obj);
    }
}
