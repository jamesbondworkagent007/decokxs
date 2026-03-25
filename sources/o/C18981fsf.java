package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.fsf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18981fsf {
    public final java.util.List<C18988fsm> AEQbTJ;
    public final boolean EZpvd;
    public final java.util.List<C18987fsl> KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18981fsf() {
        this(false, null, null, false, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fsf */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C18981fsf copy$default(C18981fsf c18981fsf, boolean z, java.util.List list, java.util.List list2, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c18981fsf.copydefault;
        }
        if ((i & 2) != 0) {
            list = c18981fsf.AEQbTJ;
        }
        if ((i & 4) != 0) {
            list2 = c18981fsf.KWHzl;
        }
        if ((i & 8) != 0) {
            z2 = c18981fsf.EZpvd;
        }
        return c18981fsf.OLrzqt(z, list, list2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C18988fsm> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18981fsf OLrzqt(boolean z, java.util.List<C18988fsm> list, java.util.List<C18987fsl> list2, boolean z2) {
        return new C18981fsf(z, list, list2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C18987fsl> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18981fsf)) {
            return false;
        }
        C18981fsf c18981fsf = (C18981fsf) obj;
        return this.copydefault == c18981fsf.copydefault && Intrinsics.EZpvd(this.AEQbTJ, c18981fsf.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c18981fsf.KWHzl) && this.EZpvd == c18981fsf.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.copydefault);
        java.util.List<C18988fsm> list = this.AEQbTJ;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        java.util.List<C18987fsl> list2 = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (list2 != null ? list2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HotSearchUiState(isLoading=" + this.copydefault + ", listToken=" + this.AEQbTJ + ", listDApp=" + this.KWHzl + ", isError=" + this.EZpvd + ")";
    }

    public C18981fsf(boolean z, java.util.List<C18988fsm> list, java.util.List<C18987fsl> list2, boolean z2) {
        this.copydefault = z;
        this.AEQbTJ = list;
        this.KWHzl = list2;
        this.EZpvd = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
 A[MD:(boolean, java.util.List<o.fsm>, java.util.List<o.fsl>, boolean):void (m)] (LINE:3) call: o.fsf.<init>(boolean, java.util.List, java.util.List, boolean):void type: THIS */
    public /* synthetic */ C18981fsf(boolean z, java.util.List list, java.util.List list2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? false : z2);
    }
}
