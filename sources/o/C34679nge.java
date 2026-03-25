package o;

import com.okinc.dexkline.market.features.chart.domain.ChartType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34679nge {
    public final boolean AEQbTJ;
    public final ChartType KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34679nge() {
        this(false, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C34679nge copy$default(C34679nge c34679nge, boolean z, java.lang.String str, ChartType chartType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c34679nge.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c34679nge.copydefault;
        }
        if ((i & 4) != 0) {
            chartType = c34679nge.KWHzl;
        }
        return c34679nge.EZpvd(z, str, chartType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34679nge EZpvd(boolean z, @NotNull java.lang.String str, @NotNull ChartType chartType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(chartType, "");
        return new C34679nge(z, str, chartType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartType copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34679nge)) {
            return false;
        }
        C34679nge c34679nge = (C34679nge) obj;
        return this.AEQbTJ == c34679nge.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c34679nge.copydefault) && this.KWHzl == c34679nge.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.AEQbTJ) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AdvancedKLineInfo(hasMCapData=" + this.AEQbTJ + ", circulatingSupply=" + this.copydefault + ", chartType=" + this.KWHzl + ")";
    }

    public C34679nge(boolean z, @NotNull java.lang.String str, @NotNull ChartType chartType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(chartType, "");
        this.AEQbTJ = z;
        this.copydefault = str;
        this.KWHzl = chartType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:com.okinc.dexkline.market.features.chart.domain.ChartType:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.dexkline.market.features.chart.domain.ChartType:0x000f: SGET  A[WRAPPED] (LINE:260) com.okinc.dexkline.market.features.chart.domain.ChartType.PRICE com.okinc.dexkline.market.features.chart.domain.ChartType) : (r3v0 com.okinc.dexkline.market.features.chart.domain.ChartType))
 A[MD:(boolean, java.lang.String, com.okinc.dexkline.market.features.chart.domain.ChartType):void (m)] (LINE:257) call: o.nge.<init>(boolean, java.lang.String, com.okinc.dexkline.market.features.chart.domain.ChartType):void type: THIS */
    public /* synthetic */ C34679nge(boolean z, java.lang.String str, ChartType chartType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ChartType.PRICE : chartType);
    }
}
