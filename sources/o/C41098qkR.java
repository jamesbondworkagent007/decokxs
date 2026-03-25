package o;

import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41098qkR {
    public static final int copydefault = FuturesUnitVo.KWHzl;
    public final FuturesTypeEnum AEQbTJ;
    public final FuturesUnitVo EZpvd;
    public final PeriodEnum KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41098qkR copy$default(C41098qkR c41098qkR, FuturesTypeEnum futuresTypeEnum, FuturesUnitVo futuresUnitVo, PeriodEnum periodEnum, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            futuresTypeEnum = c41098qkR.AEQbTJ;
        }
        if ((i & 2) != 0) {
            futuresUnitVo = c41098qkR.EZpvd;
        }
        if ((i & 4) != 0) {
            periodEnum = c41098qkR.KWHzl;
        }
        return c41098qkR.KWHzl(futuresTypeEnum, futuresUnitVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesTypeEnum AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41098qkR KWHzl(@NotNull FuturesTypeEnum futuresTypeEnum, @NotNull FuturesUnitVo futuresUnitVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        Intrinsics.checkNotNullParameter(futuresUnitVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41098qkR(futuresTypeEnum, futuresUnitVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesUnitVo OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41098qkR)) {
            return false;
        }
        C41098qkR c41098qkR = (C41098qkR) obj;
        return this.AEQbTJ == c41098qkR.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, c41098qkR.EZpvd) && this.KWHzl == c41098qkR.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetMarketDiscoverFuturesHotPosPayload(futuresType=" + this.AEQbTJ + ", futuresUnit=" + this.EZpvd + ", period=" + this.KWHzl + ")";
    }

    public C41098qkR(@NotNull FuturesTypeEnum futuresTypeEnum, @NotNull FuturesUnitVo futuresUnitVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        Intrinsics.checkNotNullParameter(futuresUnitVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.AEQbTJ = futuresTypeEnum;
        this.EZpvd = futuresUnitVo;
        this.KWHzl = periodEnum;
    }
}
