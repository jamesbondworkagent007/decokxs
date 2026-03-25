package o;

import com.okinc.business.market.features.chart.domain.ChartType;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jNE implements kMU {
    public final boolean EZpvd;
    public final ChartType OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ jNE copy$default(jNE jne, ChartType chartType, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            chartType = jne.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = jne.EZpvd;
        }
        return jne.KWHzl(chartType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jNE KWHzl(@NotNull ChartType chartType, boolean z) {
        Intrinsics.checkNotNullParameter(chartType, "");
        return new jNE(chartType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartType copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jNE)) {
            return false;
        }
        jNE jne = (jNE) obj;
        return this.OLrzqt == jne.OLrzqt && this.EZpvd == jne.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChartTypePickerUiModel(type=" + this.OLrzqt + ", isSelected=" + this.EZpvd + ")";
    }

    public jNE(@NotNull ChartType chartType, boolean z) {
        Intrinsics.checkNotNullParameter(chartType, "");
        this.OLrzqt = chartType;
        this.EZpvd = z;
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        return kMU.TaskDescription.KWHzl(this, kmu);
    }

    @Override // o.kMU
    public java.lang.Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }
}
