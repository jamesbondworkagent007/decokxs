package o;

import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41106qkZ {
    public static final int AEQbTJ = FuturesUnitVo.KWHzl | C41467qrP.OLrzqt;
    public final C41467qrP EZpvd;
    public final FuturesUnitVo KWHzl;
    public final FuturesTypeEnum OLrzqt;
    public final PeriodEnum copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41106qkZ copy$default(C41106qkZ c41106qkZ, C41467qrP c41467qrP, FuturesTypeEnum futuresTypeEnum, FuturesUnitVo futuresUnitVo, PeriodEnum periodEnum, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c41467qrP = c41106qkZ.EZpvd;
        }
        if ((i & 2) != 0) {
            futuresTypeEnum = c41106qkZ.OLrzqt;
        }
        if ((i & 4) != 0) {
            futuresUnitVo = c41106qkZ.KWHzl;
        }
        if ((i & 8) != 0) {
            periodEnum = c41106qkZ.copydefault;
        }
        return c41106qkZ.AEQbTJ(c41467qrP, futuresTypeEnum, futuresUnitVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesUnitVo AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41106qkZ AEQbTJ(@NotNull C41467qrP c41467qrP, @NotNull FuturesTypeEnum futuresTypeEnum, @NotNull FuturesUnitVo futuresUnitVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(c41467qrP, "");
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        Intrinsics.checkNotNullParameter(futuresUnitVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41106qkZ(c41467qrP, futuresTypeEnum, futuresUnitVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesTypeEnum KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41467qrP OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41106qkZ)) {
            return false;
        }
        C41106qkZ c41106qkZ = (C41106qkZ) obj;
        return Intrinsics.EZpvd(this.EZpvd, c41106qkZ.EZpvd) && this.OLrzqt == c41106qkZ.OLrzqt && Intrinsics.EZpvd(this.KWHzl, c41106qkZ.KWHzl) && this.copydefault == c41106qkZ.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetMarketDiscoverFuturesTurnoverVosPayload(allFuturesVos=" + this.EZpvd + ", futuresType=" + this.OLrzqt + ", futuresUnit=" + this.KWHzl + ", period=" + this.copydefault + ")";
    }

    public C41106qkZ(@NotNull C41467qrP c41467qrP, @NotNull FuturesTypeEnum futuresTypeEnum, @NotNull FuturesUnitVo futuresUnitVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(c41467qrP, "");
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        Intrinsics.checkNotNullParameter(futuresUnitVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.EZpvd = c41467qrP;
        this.OLrzqt = futuresTypeEnum;
        this.KWHzl = futuresUnitVo;
        this.copydefault = periodEnum;
    }
}
