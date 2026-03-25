package o;

import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC28823khz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kwi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29601kwi {
    public final java.util.List<InterfaceC28823khz.ActionBar> AEQbTJ;
    public final SignalMetricsFilter EZpvd;
    public final C29537kvX KWHzl;
    public final SignalsFilter OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kwi */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C29601kwi copy$default(C29601kwi c29601kwi, java.util.List list, SignalMetricsFilter signalMetricsFilter, SignalsFilter signalsFilter, C29537kvX c29537kvX, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c29601kwi.AEQbTJ;
        }
        if ((i & 2) != 0) {
            signalMetricsFilter = c29601kwi.EZpvd;
        }
        if ((i & 4) != 0) {
            signalsFilter = c29601kwi.OLrzqt;
        }
        if ((i & 8) != 0) {
            c29537kvX = c29601kwi.KWHzl;
        }
        return c29601kwi.EZpvd(list, signalMetricsFilter, signalsFilter, c29537kvX);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalsFilter AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalMetricsFilter EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29601kwi EZpvd(@NotNull java.util.List<InterfaceC28823khz.ActionBar> list, @NotNull SignalMetricsFilter signalMetricsFilter, @NotNull SignalsFilter signalsFilter, @NotNull C29537kvX c29537kvX) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(signalMetricsFilter, "");
        Intrinsics.checkNotNullParameter(signalsFilter, "");
        Intrinsics.checkNotNullParameter(c29537kvX, "");
        return new C29601kwi(list, signalMetricsFilter, signalsFilter, c29537kvX);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC28823khz.ActionBar> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29537kvX copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29601kwi)) {
            return false;
        }
        C29601kwi c29601kwi = (C29601kwi) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c29601kwi.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c29601kwi.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c29601kwi.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c29601kwi.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SignalFilterBottomSheetUiState(currentProtocolsState=" + this.AEQbTJ + ", metricsState=" + this.EZpvd + ", signalsState=" + this.OLrzqt + ", validationState=" + this.KWHzl + ")";
    }

    public C29601kwi(@NotNull java.util.List<InterfaceC28823khz.ActionBar> list, @NotNull SignalMetricsFilter signalMetricsFilter, @NotNull SignalsFilter signalsFilter, @NotNull C29537kvX c29537kvX) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(signalMetricsFilter, "");
        Intrinsics.checkNotNullParameter(signalsFilter, "");
        Intrinsics.checkNotNullParameter(c29537kvX, "");
        this.AEQbTJ = list;
        this.EZpvd = signalMetricsFilter;
        this.OLrzqt = signalsFilter;
        this.KWHzl = c29537kvX;
    }
}
