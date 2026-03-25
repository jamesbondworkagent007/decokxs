package o;

import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qmj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41222qmj {
    public static final int AEQbTJ = ChargeGroupVo.EZpvd;
    public final PeriodEnum OLrzqt;
    public final ChargeGroupVo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41222qmj copy$default(C41222qmj c41222qmj, ChargeGroupVo chargeGroupVo, PeriodEnum periodEnum, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            chargeGroupVo = c41222qmj.copydefault;
        }
        if ((i & 2) != 0) {
            periodEnum = c41222qmj.OLrzqt;
        }
        return c41222qmj.OLrzqt(chargeGroupVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChargeGroupVo OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41222qmj OLrzqt(@NotNull ChargeGroupVo chargeGroupVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(chargeGroupVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41222qmj(chargeGroupVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41222qmj)) {
            return false;
        }
        C41222qmj c41222qmj = (C41222qmj) obj;
        return Intrinsics.EZpvd(this.copydefault, c41222qmj.copydefault) && this.OLrzqt == c41222qmj.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetMarketDiscoverSpotHotPosPayload(chargeGroupVo=" + this.copydefault + ", period=" + this.OLrzqt + ")";
    }

    public C41222qmj(@NotNull ChargeGroupVo chargeGroupVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(chargeGroupVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.copydefault = chargeGroupVo;
        this.OLrzqt = periodEnum;
    }
}
