package o;

import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41097qkQ {
    public static final int KWHzl = FuturesUnitVo.KWHzl | C41467qrP.OLrzqt;
    public final PeriodEnum AEQbTJ;
    public final FuturesTypeEnum EZpvd;
    public final FuturesUnitVo OLrzqt;
    public final C41467qrP copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41097qkQ copy$default(C41097qkQ c41097qkQ, C41467qrP c41467qrP, FuturesTypeEnum futuresTypeEnum, FuturesUnitVo futuresUnitVo, PeriodEnum periodEnum, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c41467qrP = c41097qkQ.copydefault;
        }
        if ((i & 2) != 0) {
            futuresTypeEnum = c41097qkQ.EZpvd;
        }
        if ((i & 4) != 0) {
            futuresUnitVo = c41097qkQ.OLrzqt;
        }
        if ((i & 8) != 0) {
            periodEnum = c41097qkQ.AEQbTJ;
        }
        return c41097qkQ.copydefault(c41467qrP, futuresTypeEnum, futuresUnitVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesTypeEnum EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41467qrP OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesUnitVo copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41097qkQ copydefault(@NotNull C41467qrP c41467qrP, @NotNull FuturesTypeEnum futuresTypeEnum, @NotNull FuturesUnitVo futuresUnitVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(c41467qrP, "");
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        Intrinsics.checkNotNullParameter(futuresUnitVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41097qkQ(c41467qrP, futuresTypeEnum, futuresUnitVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41097qkQ)) {
            return false;
        }
        C41097qkQ c41097qkQ = (C41097qkQ) obj;
        return Intrinsics.EZpvd(this.copydefault, c41097qkQ.copydefault) && this.EZpvd == c41097qkQ.EZpvd && Intrinsics.EZpvd(this.OLrzqt, c41097qkQ.OLrzqt) && this.AEQbTJ == c41097qkQ.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetMarketDiscoverFuturesDownVosPayload(allFuturesVos=" + this.copydefault + ", futuresType=" + this.EZpvd + ", futuresUnit=" + this.OLrzqt + ", period=" + this.AEQbTJ + ")";
    }

    public C41097qkQ(@NotNull C41467qrP c41467qrP, @NotNull FuturesTypeEnum futuresTypeEnum, @NotNull FuturesUnitVo futuresUnitVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(c41467qrP, "");
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        Intrinsics.checkNotNullParameter(futuresUnitVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.copydefault = c41467qrP;
        this.EZpvd = futuresTypeEnum;
        this.OLrzqt = futuresUnitVo;
        this.AEQbTJ = periodEnum;
    }
}
