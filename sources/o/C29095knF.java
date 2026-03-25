package o;

import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.knF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29095knF {
    public final boolean AEQbTJ;
    public final PnLDetailsUiModel EZpvd;
    public final java.lang.Throwable OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29095knF() {
        this(false, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C29095knF copy$default(C29095knF c29095knF, boolean z, PnLDetailsUiModel pnLDetailsUiModel, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c29095knF.AEQbTJ;
        }
        if ((i & 2) != 0) {
            pnLDetailsUiModel = c29095knF.EZpvd;
        }
        if ((i & 4) != 0) {
            th = c29095knF.OLrzqt;
        }
        return c29095knF.EZpvd(z, pnLDetailsUiModel, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLDetailsUiModel AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29095knF EZpvd(boolean z, PnLDetailsUiModel pnLDetailsUiModel, java.lang.Throwable th) {
        return new C29095knF(z, pnLDetailsUiModel, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
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
        if (!(obj instanceof C29095knF)) {
            return false;
        }
        C29095knF c29095knF = (C29095knF) obj;
        return this.AEQbTJ == c29095knF.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, c29095knF.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c29095knF.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
        PnLDetailsUiModel pnLDetailsUiModel = this.EZpvd;
        int iHashCode2 = pnLDetailsUiModel == null ? 0 : pnLDetailsUiModel.hashCode();
        java.lang.Throwable th = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (th != null ? th.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PnLUiState(isLoading=" + this.AEQbTJ + ", pnlData=" + this.EZpvd + ", error=" + this.OLrzqt + ")";
    }

    public C29095knF(boolean z, PnLDetailsUiModel pnLDetailsUiModel, java.lang.Throwable th) {
        this.AEQbTJ = z;
        this.EZpvd = pnLDetailsUiModel;
        this.OLrzqt = th;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel) : (r3v0 com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r4v0 java.lang.Throwable))
 A[MD:(boolean, com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel, java.lang.Throwable):void (m)] (LINE:12) call: o.knF.<init>(boolean, com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel, java.lang.Throwable):void type: THIS */
    public /* synthetic */ C29095knF(boolean z, PnLDetailsUiModel pnLDetailsUiModel, java.lang.Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : pnLDetailsUiModel, (i & 4) != 0 ? null : th);
    }
}
