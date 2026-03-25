package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pxO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39703pxO {
    public final java.util.List<java.lang.String> AEQbTJ;
    public final float EZpvd;
    public final long KWHzl;
    public final java.lang.String OLrzqt;
    public final java.util.Map<java.lang.String, java.util.List<C39709pxU>> copydefault;
    public final java.util.Map<java.lang.String, java.util.List<C39709pxU>> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.util.List<C39709pxU>> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39703pxO EZpvd(long j, float f, java.lang.String str, @NotNull java.util.Map<java.lang.String, java.util.List<C39709pxU>> map, @NotNull java.util.Map<java.lang.String, java.util.List<C39709pxU>> map2, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C39703pxO(j, f, str, map, map2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.util.List<C39709pxU>> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39703pxO)) {
            return false;
        }
        C39703pxO c39703pxO = (C39703pxO) obj;
        return this.KWHzl == c39703pxO.KWHzl && java.lang.Float.compare(this.EZpvd, c39703pxO.EZpvd) == 0 && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c39703pxO.OLrzqt) && Intrinsics.EZpvd(this.gEmmrt, c39703pxO.gEmmrt) && Intrinsics.EZpvd(this.copydefault, c39703pxO.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c39703pxO.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.KWHzl);
        int iHashCode2 = java.lang.Float.hashCode(this.EZpvd);
        java.lang.String str = this.OLrzqt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.gEmmrt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CombineScheduleChartData(time=" + this.KWHzl + ", currentTimePercent=" + this.EZpvd + ", defaultSelectTs=" + this.OLrzqt + ", tsData=" + this.gEmmrt + ", chartData=" + this.copydefault + ", timeList=" + this.AEQbTJ + ")";
    }

    public C39703pxO(long j, float f, java.lang.String str, @NotNull java.util.Map<java.lang.String, java.util.List<C39709pxU>> map, @NotNull java.util.Map<java.lang.String, java.util.List<C39709pxU>> map2, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = j;
        this.EZpvd = f;
        this.OLrzqt = str;
        this.gEmmrt = map;
        this.copydefault = map2;
        this.AEQbTJ = list;
    }
}
