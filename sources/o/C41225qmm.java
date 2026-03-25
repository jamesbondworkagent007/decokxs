package o;

import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qmm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41225qmm {
    public static final int OLrzqt = ChargeGroupVo.EZpvd;
    public final PeriodEnum KWHzl;
    public final ChargeGroupVo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41225qmm copy$default(C41225qmm c41225qmm, ChargeGroupVo chargeGroupVo, PeriodEnum periodEnum, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            chargeGroupVo = c41225qmm.copydefault;
        }
        if ((i & 2) != 0) {
            periodEnum = c41225qmm.KWHzl;
        }
        return c41225qmm.AEQbTJ(chargeGroupVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41225qmm AEQbTJ(@NotNull ChargeGroupVo chargeGroupVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(chargeGroupVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41225qmm(chargeGroupVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChargeGroupVo EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41225qmm)) {
            return false;
        }
        C41225qmm c41225qmm = (C41225qmm) obj;
        return Intrinsics.EZpvd(this.copydefault, c41225qmm.copydefault) && this.KWHzl == c41225qmm.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetMarketDiscoverSpotTurnoverPosPayload(chargeGroupVo=" + this.copydefault + ", period=" + this.KWHzl + ")";
    }

    public C41225qmm(@NotNull ChargeGroupVo chargeGroupVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(chargeGroupVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.copydefault = chargeGroupVo;
        this.KWHzl = periodEnum;
    }
}
