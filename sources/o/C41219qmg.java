package o;

import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qmg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41219qmg {
    public final ChargeGroupVo AEQbTJ;
    public final java.util.List<InterfaceC41641que> EZpvd;
    public final PeriodEnum copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qmg */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41219qmg copy$default(C41219qmg c41219qmg, java.util.List list, ChargeGroupVo chargeGroupVo, PeriodEnum periodEnum, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c41219qmg.EZpvd;
        }
        if ((i & 2) != 0) {
            chargeGroupVo = c41219qmg.AEQbTJ;
        }
        if ((i & 4) != 0) {
            periodEnum = c41219qmg.copydefault;
        }
        return c41219qmg.copydefault(list, chargeGroupVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChargeGroupVo EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41641que> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41219qmg copydefault(@NotNull java.util.List<? extends InterfaceC41641que> list, @NotNull ChargeGroupVo chargeGroupVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(chargeGroupVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41219qmg(list, chargeGroupVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41219qmg)) {
            return false;
        }
        C41219qmg c41219qmg = (C41219qmg) obj;
        return Intrinsics.EZpvd(this.EZpvd, c41219qmg.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c41219qmg.AEQbTJ) && this.copydefault == c41219qmg.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetMarketDiscoverSpotHotVosPayload(spotVoList=" + this.EZpvd + ", chargeGroupVo=" + this.AEQbTJ + ", period=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.que> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41219qmg(@NotNull java.util.List<? extends InterfaceC41641que> list, @NotNull ChargeGroupVo chargeGroupVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(chargeGroupVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.EZpvd = list;
        this.AEQbTJ = chargeGroupVo;
        this.copydefault = periodEnum;
    }
}
