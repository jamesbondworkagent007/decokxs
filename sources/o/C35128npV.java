package o;

import com.okinc.find_ui.widgetprovider.p2p.data.P2PPairsInfo;
import com.okinc.find_ui.widgetprovider.p2p.data.P2PTradeSide;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35128npV {
    public final P2PTradeSide AEQbTJ;
    public final java.util.List<P2PPairsInfo> KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C35128npV() {
        this(false, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.npV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C35128npV copy$default(C35128npV c35128npV, boolean z, java.lang.String str, P2PTradeSide p2PTradeSide, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c35128npV.copydefault;
        }
        if ((i & 2) != 0) {
            str = c35128npV.OLrzqt;
        }
        if ((i & 4) != 0) {
            p2PTradeSide = c35128npV.AEQbTJ;
        }
        if ((i & 8) != 0) {
            list = c35128npV.KWHzl;
        }
        return c35128npV.copydefault(z, str, p2PTradeSide, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final P2PTradeSide AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35128npV copydefault(boolean z, java.lang.String str, @NotNull P2PTradeSide p2PTradeSide, @NotNull java.util.List<P2PPairsInfo> list) {
        Intrinsics.checkNotNullParameter(p2PTradeSide, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C35128npV(z, str, p2PTradeSide, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35128npV)) {
            return false;
        }
        C35128npV c35128npV = (C35128npV) obj;
        return this.copydefault == c35128npV.copydefault && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c35128npV.OLrzqt) && this.AEQbTJ == c35128npV.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, c35128npV.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.copydefault);
        java.lang.String str = this.OLrzqt;
        return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "P2PState(isLoading=" + this.copydefault + ", error=" + this.OLrzqt + ", currentTradeSide=" + this.AEQbTJ + ", p2pPairsList=" + this.KWHzl + ")";
    }

    public C35128npV(boolean z, java.lang.String str, @NotNull P2PTradeSide p2PTradeSide, @NotNull java.util.List<P2PPairsInfo> list) {
        Intrinsics.checkNotNullParameter(p2PTradeSide, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = z;
        this.OLrzqt = str;
        this.AEQbTJ = p2PTradeSide;
        this.KWHzl = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:com.okinc.find_ui.widgetprovider.p2p.data.P2PTradeSide:?: TERNARY null = ((wrap:int:0x000a: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.find_ui.widgetprovider.p2p.data.P2PTradeSide:0x000e: SGET  A[WRAPPED] (LINE:332) com.okinc.find_ui.widgetprovider.p2p.data.P2PTradeSide.BUY com.okinc.find_ui.widgetprovider.p2p.data.P2PTradeSide) : (r3v0 com.okinc.find_ui.widgetprovider.p2p.data.P2PTradeSide))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:333)) : (r4v0 java.util.List))
 A[MD:(boolean, java.lang.String, com.okinc.find_ui.widgetprovider.p2p.data.P2PTradeSide, java.util.List<com.okinc.find_ui.widgetprovider.p2p.data.P2PPairsInfo>):void (m)] (LINE:329) call: o.npV.<init>(boolean, java.lang.String, com.okinc.find_ui.widgetprovider.p2p.data.P2PTradeSide, java.util.List):void type: THIS */
    public /* synthetic */ C35128npV(boolean z, java.lang.String str, P2PTradeSide p2PTradeSide, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? P2PTradeSide.BUY : p2PTradeSide, (i & 8) != 0 ? yDY.AhwBna() : list);
    }
}
