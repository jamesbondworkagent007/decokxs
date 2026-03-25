package o;

import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qla, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41160qla {
    public static final int AEQbTJ = FuturesUnitVo.KWHzl;
    public final boolean EZpvd;
    public final PeriodEnum KWHzl;
    public final FuturesUnitVo OLrzqt;
    public final FuturesTypeEnum copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41160qla copy$default(C41160qla c41160qla, FuturesTypeEnum futuresTypeEnum, FuturesUnitVo futuresUnitVo, PeriodEnum periodEnum, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            futuresTypeEnum = c41160qla.copydefault;
        }
        if ((i & 2) != 0) {
            futuresUnitVo = c41160qla.OLrzqt;
        }
        if ((i & 4) != 0) {
            periodEnum = c41160qla.KWHzl;
        }
        if ((i & 8) != 0) {
            z = c41160qla.EZpvd;
        }
        return c41160qla.copydefault(futuresTypeEnum, futuresUnitVo, periodEnum, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesUnitVo AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesTypeEnum copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41160qla copydefault(@NotNull FuturesTypeEnum futuresTypeEnum, @NotNull FuturesUnitVo futuresUnitVo, @NotNull PeriodEnum periodEnum, boolean z) {
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        Intrinsics.checkNotNullParameter(futuresUnitVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41160qla(futuresTypeEnum, futuresUnitVo, periodEnum, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41160qla)) {
            return false;
        }
        C41160qla c41160qla = (C41160qla) obj;
        return this.copydefault == c41160qla.copydefault && Intrinsics.EZpvd(this.OLrzqt, c41160qla.OLrzqt) && this.KWHzl == c41160qla.KWHzl && this.EZpvd == c41160qla.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetMarketDiscoverFuturesUpDownPosPayload(futuresType=" + this.copydefault + ", futuresUnit=" + this.OLrzqt + ", period=" + this.KWHzl + ", isUpRank=" + this.EZpvd + ")";
    }

    public C41160qla(@NotNull FuturesTypeEnum futuresTypeEnum, @NotNull FuturesUnitVo futuresUnitVo, @NotNull PeriodEnum periodEnum, boolean z) {
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        Intrinsics.checkNotNullParameter(futuresUnitVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.copydefault = futuresTypeEnum;
        this.OLrzqt = futuresUnitVo;
        this.KWHzl = periodEnum;
        this.EZpvd = z;
    }
}
