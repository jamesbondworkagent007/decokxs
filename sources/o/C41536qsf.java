package o;

import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41536qsf {
    public final boolean AEQbTJ;
    public final PeriodEnum EZpvd;
    public final java.util.List<InterfaceC41638qub> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qsf */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41536qsf copy$default(C41536qsf c41536qsf, java.util.List list, PeriodEnum periodEnum, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c41536qsf.KWHzl;
        }
        if ((i & 2) != 0) {
            periodEnum = c41536qsf.EZpvd;
        }
        if ((i & 4) != 0) {
            z = c41536qsf.AEQbTJ;
        }
        return c41536qsf.OLrzqt(list, periodEnum, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41638qub> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41536qsf OLrzqt(@NotNull java.util.List<? extends InterfaceC41638qub> list, @NotNull PeriodEnum periodEnum, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41536qsf(list, periodEnum, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41536qsf)) {
            return false;
        }
        C41536qsf c41536qsf = (C41536qsf) obj;
        return Intrinsics.EZpvd(this.KWHzl, c41536qsf.KWHzl) && this.EZpvd == c41536qsf.EZpvd && this.AEQbTJ == c41536qsf.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.qub> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41536qsf(@NotNull java.util.List<? extends InterfaceC41638qub> list, @NotNull PeriodEnum periodEnum, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.KWHzl = list;
        this.EZpvd = periodEnum;
        this.AEQbTJ = z;
    }

    public java.lang.String toString() {
        return "SubscribeFuturesPeriodTickersPayload(period=" + this.EZpvd + ", isEnableWs=" + this.AEQbTJ + ", futuresVoListSize=" + this.KWHzl.size() + ")";
    }
}
