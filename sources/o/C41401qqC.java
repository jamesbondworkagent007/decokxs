package o;

import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41401qqC {
    public final PeriodEnum KWHzl;
    public final java.util.List<java.lang.String> OLrzqt;
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qqC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41401qqC copy$default(C41401qqC c41401qqC, java.util.Map map, java.util.List list, PeriodEnum periodEnum, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = c41401qqC.copydefault;
        }
        if ((i & 2) != 0) {
            list = c41401qqC.OLrzqt;
        }
        if ((i & 4) != 0) {
            periodEnum = c41401qqC.KWHzl;
        }
        return c41401qqC.copydefault(map, list, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41401qqC copydefault(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, java.util.List<java.lang.String> list, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41401qqC(map, list, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41401qqC)) {
            return false;
        }
        C41401qqC c41401qqC = (C41401qqC) obj;
        return Intrinsics.EZpvd(this.copydefault, c41401qqC.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c41401qqC.OLrzqt) && this.KWHzl == c41401qqC.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.copydefault;
        int iHashCode = map == null ? 0 : map.hashCode();
        java.util.List<java.lang.String> list = this.OLrzqt;
        return (((iHashCode * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SubscribeWsPeriodTickersPayload(instIdMap=" + this.copydefault + ", ccyList=" + this.OLrzqt + ", period=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41401qqC(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, java.util.List<java.lang.String> list, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.copydefault = map;
        this.OLrzqt = list;
        this.KWHzl = periodEnum;
    }
}
