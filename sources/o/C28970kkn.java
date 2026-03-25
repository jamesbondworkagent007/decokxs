package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.kkn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28970kkn {
    public final java.util.List<C28897kjT> EZpvd;
    public final boolean KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C28970kkn() {
        this(false, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kkn */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C28970kkn copy$default(C28970kkn c28970kkn, boolean z, boolean z2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c28970kkn.copydefault;
        }
        if ((i & 2) != 0) {
            z2 = c28970kkn.KWHzl;
        }
        if ((i & 4) != 0) {
            list = c28970kkn.EZpvd;
        }
        return c28970kkn.KWHzl(z, z2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28970kkn KWHzl(boolean z, boolean z2, java.util.List<C28897kjT> list) {
        return new C28970kkn(z, z2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C28897kjT> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28970kkn)) {
            return false;
        }
        C28970kkn c28970kkn = (C28970kkn) obj;
        return this.copydefault == c28970kkn.copydefault && this.KWHzl == c28970kkn.KWHzl && Intrinsics.EZpvd(this.EZpvd, c28970kkn.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode2 = java.lang.Boolean.hashCode(this.KWHzl);
        java.util.List<C28897kjT> list = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ModuleUiState(isLoading=" + this.copydefault + ", isError=" + this.KWHzl + ", modules=" + this.EZpvd + ")";
    }

    public C28970kkn(boolean z, boolean z2, java.util.List<C28897kjT> list) {
        this.copydefault = z;
        this.KWHzl = z2;
        this.EZpvd = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(boolean, boolean, java.util.List<o.kjT>):void (m)] (LINE:16) call: o.kkn.<init>(boolean, boolean, java.util.List):void type: THIS */
    public /* synthetic */ C28970kkn(boolean z, boolean z2, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : list);
    }
}
