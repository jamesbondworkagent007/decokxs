package o;

import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qmb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41214qmb {
    public final PeriodEnum EZpvd;
    public final java.util.List<InterfaceC41641que> OLrzqt;
    public final ChargeGroupVo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qmb */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41214qmb copy$default(C41214qmb c41214qmb, java.util.List list, ChargeGroupVo chargeGroupVo, PeriodEnum periodEnum, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c41214qmb.OLrzqt;
        }
        if ((i & 2) != 0) {
            chargeGroupVo = c41214qmb.copydefault;
        }
        if ((i & 4) != 0) {
            periodEnum = c41214qmb.EZpvd;
        }
        return c41214qmb.OLrzqt(list, chargeGroupVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41641que> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChargeGroupVo OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41214qmb OLrzqt(@NotNull java.util.List<? extends InterfaceC41641que> list, @NotNull ChargeGroupVo chargeGroupVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(chargeGroupVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41214qmb(list, chargeGroupVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41214qmb)) {
            return false;
        }
        C41214qmb c41214qmb = (C41214qmb) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c41214qmb.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c41214qmb.copydefault) && this.EZpvd == c41214qmb.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetMarketDiscoverSpotDownVosPayload(spotVoList=" + this.OLrzqt + ", chargeGroupVo=" + this.copydefault + ", period=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.que> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41214qmb(@NotNull java.util.List<? extends InterfaceC41641que> list, @NotNull ChargeGroupVo chargeGroupVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(chargeGroupVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.OLrzqt = list;
        this.copydefault = chargeGroupVo;
        this.EZpvd = periodEnum;
    }
}
