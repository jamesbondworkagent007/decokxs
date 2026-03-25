package o;

import com.okinc.dexkline.market.features.chart.domain.ChartType;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC34635nfn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mWh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32284mWh implements InterfaceC34635nfn {
    public final ChartType AEQbTJ;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C32284mWh copy$default(C32284mWh c32284mWh, ChartType chartType, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            chartType = c32284mWh.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = c32284mWh.OLrzqt;
        }
        return c32284mWh.KWHzl(chartType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartType AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32284mWh KWHzl(@NotNull ChartType chartType, boolean z) {
        Intrinsics.checkNotNullParameter(chartType, "");
        return new C32284mWh(chartType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32284mWh)) {
            return false;
        }
        C32284mWh c32284mWh = (C32284mWh) obj;
        return this.AEQbTJ == c32284mWh.AEQbTJ && this.OLrzqt == c32284mWh.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChartTypePickerUiModel(type=" + this.AEQbTJ + ", isSelected=" + this.OLrzqt + ")";
    }

    public C32284mWh(@NotNull ChartType chartType, boolean z) {
        Intrinsics.checkNotNullParameter(chartType, "");
        this.AEQbTJ = chartType;
        this.OLrzqt = z;
    }

    @Override // o.InterfaceC34635nfn
    public boolean AEQbTJ(@NotNull InterfaceC34635nfn interfaceC34635nfn) {
        return InterfaceC34635nfn.Activity.copydefault(this, interfaceC34635nfn);
    }

    @Override // o.InterfaceC34635nfn
    public boolean KWHzl(@NotNull InterfaceC34635nfn interfaceC34635nfn) {
        return InterfaceC34635nfn.Activity.KWHzl(this, interfaceC34635nfn);
    }

    @Override // o.InterfaceC34635nfn
    public java.lang.Object copydefault(@NotNull InterfaceC34635nfn interfaceC34635nfn) {
        return InterfaceC34635nfn.Activity.AEQbTJ(this, interfaceC34635nfn);
    }
}
