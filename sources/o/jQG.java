package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jQG {
    public final java.lang.Object AEQbTJ;
    public final boolean EZpvd;
    public final jQE KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public jQG() {
        this(null, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ jQG copy$default(jQG jqg, jQE jqe, boolean z, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            jqe = jqg.KWHzl;
        }
        if ((i & 2) != 0) {
            z = jqg.EZpvd;
        }
        if ((i & 4) != 0) {
            obj = jqg.AEQbTJ;
        }
        return jqg.AEQbTJ(jqe, z, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jQG AEQbTJ(@NotNull jQE jqe, boolean z, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(jqe, "");
        return new jQG(jqe, z, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jQE copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jQG)) {
            return false;
        }
        jQG jqg = (jQG) obj;
        return Intrinsics.EZpvd(this.KWHzl, jqg.KWHzl) && this.EZpvd == jqg.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, jqg.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.EZpvd);
        java.lang.Object obj = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DataUiState(loading=" + this.KWHzl + ", error=" + this.EZpvd + ", successData=" + this.AEQbTJ + ")";
    }

    public jQG(@NotNull jQE jqe, boolean z, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(jqe, "");
        this.KWHzl = jqe;
        this.EZpvd = z;
        this.AEQbTJ = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:o.jQE:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.jQE:0x000c: CONSTRUCTOR false, false, false, (7 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:4) call: o.jQE.<init>(boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 o.jQE))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0014: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r9v0 java.lang.Object))
 A[MD:(o.jQE, boolean, java.lang.Object):void (m)] (LINE:3) call: o.jQG.<init>(o.jQE, boolean, java.lang.Object):void type: THIS */
    public /* synthetic */ jQG(jQE jqe, boolean z, java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new jQE(false, false, false, 7, null) : jqe, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : obj);
    }
}
