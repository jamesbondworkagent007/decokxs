package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.ixU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25477ixU {
    public java.util.List<java.lang.String> EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.List<java.lang.String> OLrzqt;
    public java.lang.Integer copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25477ixU() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ixU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C25477ixU copy$default(C25477ixU c25477ixU, java.util.List list, java.lang.Integer num, java.util.List list2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c25477ixU.EZpvd;
        }
        if ((i & 2) != 0) {
            num = c25477ixU.copydefault;
        }
        if ((i & 4) != 0) {
            list2 = c25477ixU.OLrzqt;
        }
        if ((i & 8) != 0) {
            str = c25477ixU.KWHzl;
        }
        return c25477ixU.AEQbTJ(list, num, list2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25477ixU AEQbTJ(java.util.List<java.lang.String> list, java.lang.Integer num, java.util.List<java.lang.String> list2, java.lang.String str) {
        return new C25477ixU(list, num, list2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25477ixU)) {
            return false;
        }
        C25477ixU c25477ixU = (C25477ixU) obj;
        return Intrinsics.EZpvd(this.EZpvd, c25477ixU.EZpvd) && Intrinsics.EZpvd(this.copydefault, c25477ixU.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c25477ixU.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c25477ixU.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.List<java.lang.String> list = this.EZpvd;
        int iHashCode = list == null ? 0 : list.hashCode();
        java.lang.Integer num = this.copydefault;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        java.util.List<java.lang.String> list2 = this.OLrzqt;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        java.lang.String str = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestBatchClaimParam(claimIndex=" + this.EZpvd + ", claimOverdue=" + this.copydefault + ", callDataExtJsonList=" + this.OLrzqt + ", callDataExtJson=" + this.KWHzl + ")";
    }

    public C25477ixU(java.util.List<java.lang.String> list, java.lang.Integer num, java.util.List<java.lang.String> list2, java.lang.String str) {
        this.EZpvd = list;
        this.copydefault = num;
        this.OLrzqt = list2;
        this.KWHzl = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.util.List<java.lang.String>, java.lang.Integer, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:620) call: o.ixU.<init>(java.util.List, java.lang.Integer, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ C25477ixU(java.util.List list, java.lang.Integer num, java.util.List list2, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str);
    }
}
