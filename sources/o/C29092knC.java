package o;

import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.knC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29092knC {
    public final boolean AEQbTJ;
    public final java.lang.Throwable EZpvd;
    public final java.util.List<HoldingAsset> KWHzl;
    public final boolean OLrzqt;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29092knC() {
        this(false, null, null, false, 0L, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.knC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C29092knC copy$default(C29092knC c29092knC, boolean z, java.util.List list, java.lang.Throwable th, boolean z2, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c29092knC.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list = c29092knC.KWHzl;
        }
        java.util.List list2 = list;
        if ((i & 4) != 0) {
            th = c29092knC.EZpvd;
        }
        java.lang.Throwable th2 = th;
        if ((i & 8) != 0) {
            z2 = c29092knC.OLrzqt;
        }
        boolean z3 = z2;
        if ((i & 16) != 0) {
            j = c29092knC.copydefault;
        }
        return c29092knC.AEQbTJ(z, list2, th2, z3, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29092knC AEQbTJ(boolean z, java.util.List<HoldingAsset> list, java.lang.Throwable th, boolean z2, long j) {
        return new C29092knC(z, list, th, z2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<HoldingAsset> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29092knC)) {
            return false;
        }
        C29092knC c29092knC = (C29092knC) obj;
        return this.AEQbTJ == c29092knC.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, c29092knC.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c29092knC.EZpvd) && this.OLrzqt == c29092knC.OLrzqt && this.copydefault == c29092knC.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
        java.util.List<HoldingAsset> list = this.KWHzl;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        java.lang.Throwable th = this.EZpvd;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (th != null ? th.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Long.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ActivePositionsUiState(isLoading=" + this.AEQbTJ + ", positions=" + this.KWHzl + ", error=" + this.EZpvd + ", haveValidPnlData=" + this.OLrzqt + ", timeStamp=" + this.copydefault + ")";
    }

    public C29092knC(boolean z, java.util.List<HoldingAsset> list, java.lang.Throwable th, boolean z2, long j) {
        this.AEQbTJ = z;
        this.KWHzl = list;
        this.EZpvd = th;
        this.OLrzqt = z2;
        this.copydefault = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 java.util.List))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000d: ARITH (r11v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.Throwable) : (null java.lang.Throwable))
  (wrap:boolean:0x0018: TERNARY null = ((wrap:int:0x0013: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r8v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0019: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x001d: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:32)) : (r9v0 long))
 A[MD:(boolean, java.util.List<com.okinc.business.market.features.holdings.domain.model.HoldingAsset>, java.lang.Throwable, boolean, long):void (m)] (LINE:27) call: o.knC.<init>(boolean, java.util.List, java.lang.Throwable, boolean, long):void type: THIS */
    public /* synthetic */ C29092knC(boolean z, java.util.List list, java.lang.Throwable th, boolean z2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list, (i & 4) == 0 ? th : null, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? java.lang.System.currentTimeMillis() : j);
    }
}
