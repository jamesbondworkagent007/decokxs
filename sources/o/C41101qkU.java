package o;

import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41101qkU {
    public static final int AEQbTJ = FuturesUnitVo.KWHzl | C41467qrP.OLrzqt;
    public final FuturesTypeEnum EZpvd;
    public final FuturesUnitVo KWHzl;
    public final C41467qrP OLrzqt;
    public final PeriodEnum copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41101qkU copy$default(C41101qkU c41101qkU, C41467qrP c41467qrP, FuturesTypeEnum futuresTypeEnum, FuturesUnitVo futuresUnitVo, PeriodEnum periodEnum, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c41467qrP = c41101qkU.OLrzqt;
        }
        if ((i & 2) != 0) {
            futuresTypeEnum = c41101qkU.EZpvd;
        }
        if ((i & 4) != 0) {
            futuresUnitVo = c41101qkU.KWHzl;
        }
        if ((i & 8) != 0) {
            periodEnum = c41101qkU.copydefault;
        }
        return c41101qkU.EZpvd(c41467qrP, futuresTypeEnum, futuresUnitVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41101qkU EZpvd(@NotNull C41467qrP c41467qrP, @NotNull FuturesTypeEnum futuresTypeEnum, @NotNull FuturesUnitVo futuresUnitVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(c41467qrP, "");
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        Intrinsics.checkNotNullParameter(futuresUnitVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41101qkU(c41467qrP, futuresTypeEnum, futuresUnitVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41467qrP KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesUnitVo OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesTypeEnum copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41101qkU)) {
            return false;
        }
        C41101qkU c41101qkU = (C41101qkU) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c41101qkU.OLrzqt) && this.EZpvd == c41101qkU.EZpvd && Intrinsics.EZpvd(this.KWHzl, c41101qkU.KWHzl) && this.copydefault == c41101qkU.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetMarketDiscoverFuturesHotVosPayload(allFuturesVos=" + this.OLrzqt + ", futuresType=" + this.EZpvd + ", futuresUnit=" + this.KWHzl + ", period=" + this.copydefault + ")";
    }

    public C41101qkU(@NotNull C41467qrP c41467qrP, @NotNull FuturesTypeEnum futuresTypeEnum, @NotNull FuturesUnitVo futuresUnitVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(c41467qrP, "");
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        Intrinsics.checkNotNullParameter(futuresUnitVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.OLrzqt = c41467qrP;
        this.EZpvd = futuresTypeEnum;
        this.KWHzl = futuresUnitVo;
        this.copydefault = periodEnum;
    }
}
