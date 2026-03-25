package o;

import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class jQC {
    public final jQI EZpvd;
    public final java.util.List<ChartDataUIItem> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jQC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jQC copy$default(jQC jqc, jQI jqi, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            jqi = jqc.EZpvd;
        }
        if ((i & 2) != 0) {
            list = jqc.KWHzl;
        }
        return jqc.copydefault(jqi, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jQI AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ChartDataUIItem> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jQC copydefault(jQI jqi, @NotNull java.util.List<ChartDataUIItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new jQC(jqi, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jQC)) {
            return false;
        }
        jQC jqc = (jQC) obj;
        return Intrinsics.EZpvd(this.EZpvd, jqc.EZpvd) && Intrinsics.EZpvd(this.KWHzl, jqc.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        jQI jqi = this.EZpvd;
        return ((jqi == null ? 0 : jqi.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LiquidityChartUIModel(liquidityPoolChartConfig=" + this.EZpvd + ", results=" + this.KWHzl + ")";
    }

    public jQC(jQI jqi, @NotNull java.util.List<ChartDataUIItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = jqi;
        this.KWHzl = list;
    }
}
