package o;

import com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jdI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26486jdI {
    public final boolean EZpvd;
    public final java.util.List<InvestNetworkFeeItem> KWHzl;
    public final java.lang.Throwable OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C26486jdI() {
        this(false, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jdI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C26486jdI copy$default(C26486jdI c26486jdI, boolean z, java.lang.Throwable th, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c26486jdI.EZpvd;
        }
        if ((i & 2) != 0) {
            th = c26486jdI.OLrzqt;
        }
        if ((i & 4) != 0) {
            list = c26486jdI.KWHzl;
        }
        return c26486jdI.EZpvd(z, th, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestNetworkFeeItem> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26486jdI EZpvd(boolean z, java.lang.Throwable th, @NotNull java.util.List<InvestNetworkFeeItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C26486jdI(z, th, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26486jdI)) {
            return false;
        }
        C26486jdI c26486jdI = (C26486jdI) obj;
        return this.EZpvd == c26486jdI.EZpvd && Intrinsics.EZpvd(this.OLrzqt, c26486jdI.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c26486jdI.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.EZpvd);
        java.lang.Throwable th = this.OLrzqt;
        return (((iHashCode * 31) + (th == null ? 0 : th.hashCode())) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NetworkFeeUiState(isLoading=" + this.EZpvd + ", error=" + this.OLrzqt + ", networkFeeList=" + this.KWHzl + ")";
    }

    public C26486jdI(boolean z, java.lang.Throwable th, @NotNull java.util.List<InvestNetworkFeeItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = z;
        this.OLrzqt = th;
        this.KWHzl = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r2v0 java.lang.Throwable))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000a: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:6)) : (r3v0 java.util.List))
 A[MD:(boolean, java.lang.Throwable, java.util.List<com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem>):void (m)] (LINE:3) call: o.jdI.<init>(boolean, java.lang.Throwable, java.util.List):void type: THIS */
    public /* synthetic */ C26486jdI(boolean z, java.lang.Throwable th, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : th, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
