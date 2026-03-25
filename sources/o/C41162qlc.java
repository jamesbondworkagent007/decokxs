package o;

import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qlc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41162qlc {
    public static final int AEQbTJ = FuturesUnitVo.KWHzl | C41467qrP.OLrzqt;
    public final PeriodEnum EZpvd;
    public final FuturesTypeEnum KWHzl;
    public final FuturesUnitVo OLrzqt;
    public final C41467qrP copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41162qlc copy$default(C41162qlc c41162qlc, C41467qrP c41467qrP, FuturesTypeEnum futuresTypeEnum, FuturesUnitVo futuresUnitVo, PeriodEnum periodEnum, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c41467qrP = c41162qlc.copydefault;
        }
        if ((i & 2) != 0) {
            futuresTypeEnum = c41162qlc.KWHzl;
        }
        if ((i & 4) != 0) {
            futuresUnitVo = c41162qlc.OLrzqt;
        }
        if ((i & 8) != 0) {
            periodEnum = c41162qlc.EZpvd;
        }
        return c41162qlc.OLrzqt(c41467qrP, futuresTypeEnum, futuresUnitVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesTypeEnum AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesUnitVo EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41467qrP KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41162qlc OLrzqt(@NotNull C41467qrP c41467qrP, @NotNull FuturesTypeEnum futuresTypeEnum, @NotNull FuturesUnitVo futuresUnitVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(c41467qrP, "");
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        Intrinsics.checkNotNullParameter(futuresUnitVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41162qlc(c41467qrP, futuresTypeEnum, futuresUnitVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41162qlc)) {
            return false;
        }
        C41162qlc c41162qlc = (C41162qlc) obj;
        return Intrinsics.EZpvd(this.copydefault, c41162qlc.copydefault) && this.KWHzl == c41162qlc.KWHzl && Intrinsics.EZpvd(this.OLrzqt, c41162qlc.OLrzqt) && this.EZpvd == c41162qlc.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.copydefault.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetMarketDiscoverFuturesUpVosPayload(allFuturesVos=" + this.copydefault + ", futuresType=" + this.KWHzl + ", futuresUnit=" + this.OLrzqt + ", period=" + this.EZpvd + ")";
    }

    public C41162qlc(@NotNull C41467qrP c41467qrP, @NotNull FuturesTypeEnum futuresTypeEnum, @NotNull FuturesUnitVo futuresUnitVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(c41467qrP, "");
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        Intrinsics.checkNotNullParameter(futuresUnitVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.copydefault = c41467qrP;
        this.KWHzl = futuresTypeEnum;
        this.OLrzqt = futuresUnitVo;
        this.EZpvd = periodEnum;
    }
}
