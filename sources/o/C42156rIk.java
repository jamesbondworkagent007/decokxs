package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.rIk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C42156rIk {
    public final java.util.List<java.lang.String> OLrzqt;
    public final java.util.List<java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C42156rIk() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rIk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C42156rIk copy$default(C42156rIk c42156rIk, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c42156rIk.copydefault;
        }
        if ((i & 2) != 0) {
            list2 = c42156rIk.OLrzqt;
        }
        return c42156rIk.EZpvd(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C42156rIk EZpvd(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        return new C42156rIk(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42156rIk)) {
            return false;
        }
        C42156rIk c42156rIk = (C42156rIk) obj;
        return Intrinsics.EZpvd(this.copydefault, c42156rIk.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c42156rIk.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.List<java.lang.String> list = this.copydefault;
        int iHashCode = list == null ? 0 : list.hashCode();
        java.util.List<java.lang.String> list2 = this.OLrzqt;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ShowAndHiddenIds(hiddenItemIds=" + this.copydefault + ", displayedItemIds=" + this.OLrzqt + ")";
    }

    public C42156rIk(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        this.copydefault = list;
        this.OLrzqt = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:1042) call: o.rIk.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ C42156rIk(java.util.List list, java.util.List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
