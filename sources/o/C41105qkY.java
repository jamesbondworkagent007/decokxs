package o;

import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41105qkY {
    public static final int OLrzqt = FuturesUnitVo.KWHzl;
    public final PeriodEnum AEQbTJ;
    public final FuturesTypeEnum KWHzl;
    public final FuturesUnitVo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41105qkY copy$default(C41105qkY c41105qkY, FuturesTypeEnum futuresTypeEnum, FuturesUnitVo futuresUnitVo, PeriodEnum periodEnum, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            futuresTypeEnum = c41105qkY.KWHzl;
        }
        if ((i & 2) != 0) {
            futuresUnitVo = c41105qkY.copydefault;
        }
        if ((i & 4) != 0) {
            periodEnum = c41105qkY.AEQbTJ;
        }
        return c41105qkY.copydefault(futuresTypeEnum, futuresUnitVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesUnitVo KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesTypeEnum copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41105qkY copydefault(@NotNull FuturesTypeEnum futuresTypeEnum, @NotNull FuturesUnitVo futuresUnitVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        Intrinsics.checkNotNullParameter(futuresUnitVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41105qkY(futuresTypeEnum, futuresUnitVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41105qkY)) {
            return false;
        }
        C41105qkY c41105qkY = (C41105qkY) obj;
        return this.KWHzl == c41105qkY.KWHzl && Intrinsics.EZpvd(this.copydefault, c41105qkY.copydefault) && this.AEQbTJ == c41105qkY.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetMarketDiscoverFuturesTurnoverPosPayload(futuresType=" + this.KWHzl + ", futuresUnit=" + this.copydefault + ", period=" + this.AEQbTJ + ")";
    }

    public C41105qkY(@NotNull FuturesTypeEnum futuresTypeEnum, @NotNull FuturesUnitVo futuresUnitVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        Intrinsics.checkNotNullParameter(futuresUnitVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.KWHzl = futuresTypeEnum;
        this.copydefault = futuresUnitVo;
        this.AEQbTJ = periodEnum;
    }
}
