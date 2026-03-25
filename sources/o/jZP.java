package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.market.features.holders.ui.detail.widget.HolderDetailsUiModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jZP {
    public final java.lang.Throwable AEQbTJ;
    public final boolean AhwBna;
    public final java.util.List<C26277jYm> EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;
    public final boolean djBIcL;
    public final boolean gEmmrt;
    public final HolderDetailsUiModel valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public jZP() {
        this(false, false, false, null, false, null, null, false, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C26277jYm> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jZP copydefault(boolean z, boolean z2, boolean z3, java.lang.Throwable th, boolean z4, HolderDetailsUiModel holderDetailsUiModel, java.util.List<C26277jYm> list, boolean z5, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new jZP(z, z2, z3, th, z4, holderDetailsUiModel, list, z5, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jZP)) {
            return false;
        }
        jZP jzp = (jZP) obj;
        return this.gEmmrt == jzp.gEmmrt && this.djBIcL == jzp.djBIcL && this.OLrzqt == jzp.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, jzp.AEQbTJ) && this.KWHzl == jzp.KWHzl && Intrinsics.EZpvd(this.valueOf, jzp.valueOf) && Intrinsics.EZpvd(this.EZpvd, jzp.EZpvd) && this.AhwBna == jzp.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) jzp.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.gEmmrt);
        int iHashCode2 = java.lang.Boolean.hashCode(this.djBIcL);
        int iHashCode3 = java.lang.Boolean.hashCode(this.OLrzqt);
        java.lang.Throwable th = this.AEQbTJ;
        int iHashCode4 = th == null ? 0 : th.hashCode();
        int iHashCode5 = java.lang.Boolean.hashCode(this.KWHzl);
        HolderDetailsUiModel holderDetailsUiModel = this.valueOf;
        int iHashCode6 = holderDetailsUiModel == null ? 0 : holderDetailsUiModel.hashCode();
        java.util.List<C26277jYm> list = this.EZpvd;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list != null ? list.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HolderDetailsUiState(isLoading=" + this.gEmmrt + ", isLoadingMore=" + this.djBIcL + ", canLoadMore=" + this.OLrzqt + ", error=" + this.AEQbTJ + ", hasOlderTransactions=" + this.KWHzl + ", holderDetails=" + this.valueOf + ", historyList=" + this.EZpvd + ", stopLoadMore=" + this.AhwBna + ", explorerUrl=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderDetailsUiModel valueOf() {
        return this.valueOf;
    }

    public jZP(boolean z, boolean z2, boolean z3, java.lang.Throwable th, boolean z4, HolderDetailsUiModel holderDetailsUiModel, java.util.List<C26277jYm> list, boolean z5, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = z;
        this.djBIcL = z2;
        this.OLrzqt = z3;
        this.AEQbTJ = th;
        this.KWHzl = z4;
        this.valueOf = holderDetailsUiModel;
        this.EZpvd = list;
        this.AhwBna = z5;
        this.copydefault = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r14v0 java.lang.Throwable))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:com.okinc.business.market.features.holders.ui.detail.widget.HolderDetailsUiModel:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.holders.ui.detail.widget.HolderDetailsUiModel) : (r16v0 com.okinc.business.market.features.holders.ui.detail.widget.HolderDetailsUiModel))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.util.List) : (null java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r20v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
 A[MD:(boolean, boolean, boolean, java.lang.Throwable, boolean, com.okinc.business.market.features.holders.ui.detail.widget.HolderDetailsUiModel, java.util.List<o.jYm>, boolean, java.lang.String):void (m)] (LINE:39) call: o.jZP.<init>(boolean, boolean, boolean, java.lang.Throwable, boolean, com.okinc.business.market.features.holders.ui.detail.widget.HolderDetailsUiModel, java.util.List, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ jZP(boolean z, boolean z2, boolean z3, java.lang.Throwable th, boolean z4, HolderDetailsUiModel holderDetailsUiModel, java.util.List list, boolean z5, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? null : th, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? null : holderDetailsUiModel, (i & 64) == 0 ? list : null, (i & 128) == 0 ? z5 : false, (i & 256) != 0 ? "" : str);
    }
}
