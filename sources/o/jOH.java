package o;

import androidx.lifecycle.LiveData;
import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jOH {
    public final LiveData<java.lang.String> EZpvd;
    public final ChartDetailFragment.Companion.SubChartTabType OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jOH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jOH copy$default(jOH joh, java.lang.String str, ChartDetailFragment.Companion.SubChartTabType subChartTabType, LiveData liveData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = joh.copydefault;
        }
        if ((i & 2) != 0) {
            subChartTabType = joh.OLrzqt;
        }
        if ((i & 4) != 0) {
            liveData = joh.EZpvd;
        }
        return joh.OLrzqt(str, subChartTabType, liveData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartDetailFragment.Companion.SubChartTabType AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jOH OLrzqt(@NotNull java.lang.String str, @NotNull ChartDetailFragment.Companion.SubChartTabType subChartTabType, LiveData<java.lang.String> liveData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(subChartTabType, "");
        return new jOH(str, subChartTabType, liveData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jOH)) {
            return false;
        }
        jOH joh = (jOH) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) joh.copydefault) && this.OLrzqt == joh.OLrzqt && Intrinsics.EZpvd(this.EZpvd, joh.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        LiveData<java.lang.String> liveData = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (liveData == null ? 0 : liveData.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TabTitle(title=" + this.copydefault + ", subChartType=" + this.OLrzqt + ", count=" + this.EZpvd + ")";
    }

    public jOH(@NotNull java.lang.String str, @NotNull ChartDetailFragment.Companion.SubChartTabType subChartTabType, LiveData<java.lang.String> liveData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(subChartTabType, "");
        this.copydefault = str;
        this.OLrzqt = subChartTabType;
        this.EZpvd = liveData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$Companion$SubChartTabType)
  (wrap:androidx.lifecycle.LiveData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null androidx.lifecycle.LiveData) : (r3v0 androidx.lifecycle.LiveData))
 A[MD:(java.lang.String, com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$Companion$SubChartTabType, androidx.lifecycle.LiveData<java.lang.String>):void (m)] (LINE:561) call: o.jOH.<init>(java.lang.String, com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$Companion$SubChartTabType, androidx.lifecycle.LiveData):void type: THIS */
    public /* synthetic */ jOH(java.lang.String str, ChartDetailFragment.Companion.SubChartTabType subChartTabType, LiveData liveData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, subChartTabType, (i & 4) != 0 ? null : liveData);
    }
}
