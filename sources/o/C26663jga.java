package o;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26663jga {
    public final java.util.List<InvestTokenWithAmount> AEQbTJ;
    public final boolean KWHzl;
    public final java.lang.Throwable copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C26663jga() {
        this(null, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jga */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C26663jga copy$default(C26663jga c26663jga, java.util.List list, boolean z, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c26663jga.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = c26663jga.KWHzl;
        }
        if ((i & 4) != 0) {
            th = c26663jga.copydefault;
        }
        return c26663jga.EZpvd(list, z, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26663jga EZpvd(@NotNull java.util.List<InvestTokenWithAmount> list, boolean z, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C26663jga(list, z, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestTokenWithAmount> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26663jga)) {
            return false;
        }
        C26663jga c26663jga = (C26663jga) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c26663jga.AEQbTJ) && this.KWHzl == c26663jga.KWHzl && Intrinsics.EZpvd(this.copydefault, c26663jga.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.Throwable th = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (th == null ? 0 : th.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TokenSelectionUiState(tokenList=" + this.AEQbTJ + ", isLoading=" + this.KWHzl + ", error=" + this.copydefault + ")";
    }

    public C26663jga(@NotNull java.util.List<InvestTokenWithAmount> list, boolean z, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        this.KWHzl = z;
        this.copydefault = th;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:6)) : (r1v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000d: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, boolean, java.lang.Throwable):void (m)] (LINE:5) call: o.jga.<init>(java.util.List, boolean, java.lang.Throwable):void type: THIS */
    public /* synthetic */ C26663jga(java.util.List list, boolean z, java.lang.Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : th);
    }
}
