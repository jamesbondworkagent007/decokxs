package o;

import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41593qtj {
    public final boolean AEQbTJ;
    public final PeriodEnum EZpvd;
    public final java.util.List<InterfaceC41641que> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qtj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41593qtj copy$default(C41593qtj c41593qtj, java.util.List list, PeriodEnum periodEnum, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c41593qtj.KWHzl;
        }
        if ((i & 2) != 0) {
            periodEnum = c41593qtj.EZpvd;
        }
        if ((i & 4) != 0) {
            z = c41593qtj.AEQbTJ;
        }
        return c41593qtj.copydefault(list, periodEnum, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41641que> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41593qtj copydefault(@NotNull java.util.List<? extends InterfaceC41641que> list, @NotNull PeriodEnum periodEnum, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41593qtj(list, periodEnum, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41593qtj)) {
            return false;
        }
        C41593qtj c41593qtj = (C41593qtj) obj;
        return Intrinsics.EZpvd(this.KWHzl, c41593qtj.KWHzl) && this.EZpvd == c41593qtj.EZpvd && this.AEQbTJ == c41593qtj.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.que> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41593qtj(@NotNull java.util.List<? extends InterfaceC41641que> list, @NotNull PeriodEnum periodEnum, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.KWHzl = list;
        this.EZpvd = periodEnum;
        this.AEQbTJ = z;
    }

    public java.lang.String toString() {
        return "SubscribeSpotPeriodTickersPayload(period=" + this.EZpvd + ", isEnableWs=" + this.AEQbTJ + ", spotVoListSize=" + this.KWHzl.size() + ")";
    }
}
