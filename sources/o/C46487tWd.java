package o;

import com.okinc.planet.widget.chart.MarkerSide;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tWd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46487tWd implements InterfaceC46484tWa {
    public final java.lang.Number AEQbTJ;
    public final MarkerSide EZpvd;
    public final long KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46487tWd copy$default(C46487tWd c46487tWd, long j, java.lang.Number number, MarkerSide markerSide, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c46487tWd.KWHzl;
        }
        if ((i & 2) != 0) {
            number = c46487tWd.AEQbTJ;
        }
        if ((i & 4) != 0) {
            markerSide = c46487tWd.EZpvd;
        }
        return c46487tWd.OLrzqt(j, number, markerSide);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarkerSide EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46484tWa
    public java.lang.Number KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46484tWa
    public long OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46487tWd OLrzqt(long j, @NotNull java.lang.Number number, @NotNull MarkerSide markerSide) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(markerSide, "");
        return new C46487tWd(j, number, markerSide);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46487tWd)) {
            return false;
        }
        C46487tWd c46487tWd = (C46487tWd) obj;
        return this.KWHzl == c46487tWd.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, c46487tWd.AEQbTJ) && this.EZpvd == c46487tWd.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Long.hashCode(this.KWHzl) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChartMarkerData(timestamp=" + this.KWHzl + ", value=" + this.AEQbTJ + ", side=" + this.EZpvd + ")";
    }

    public C46487tWd(long j, @NotNull java.lang.Number number, @NotNull MarkerSide markerSide) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(markerSide, "");
        this.KWHzl = j;
        this.AEQbTJ = number;
        this.EZpvd = markerSide;
    }
}
