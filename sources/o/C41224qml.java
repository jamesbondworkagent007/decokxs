package o;

import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41224qml {
    public final java.util.List<InterfaceC41641que> AEQbTJ;
    public final ChargeGroupVo KWHzl;
    public final PeriodEnum OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qml */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41224qml copy$default(C41224qml c41224qml, java.util.List list, ChargeGroupVo chargeGroupVo, PeriodEnum periodEnum, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c41224qml.AEQbTJ;
        }
        if ((i & 2) != 0) {
            chargeGroupVo = c41224qml.KWHzl;
        }
        if ((i & 4) != 0) {
            periodEnum = c41224qml.OLrzqt;
        }
        return c41224qml.AEQbTJ(list, chargeGroupVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41224qml AEQbTJ(@NotNull java.util.List<? extends InterfaceC41641que> list, @NotNull ChargeGroupVo chargeGroupVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(chargeGroupVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41224qml(list, chargeGroupVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChargeGroupVo KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41641que> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41224qml)) {
            return false;
        }
        C41224qml c41224qml = (C41224qml) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c41224qml.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c41224qml.KWHzl) && this.OLrzqt == c41224qml.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetMarketDiscoverSpotTurnoverVosPayload(spotVoList=" + this.AEQbTJ + ", chargeGroupVo=" + this.KWHzl + ", period=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.que> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41224qml(@NotNull java.util.List<? extends InterfaceC41641que> list, @NotNull ChargeGroupVo chargeGroupVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(chargeGroupVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.AEQbTJ = list;
        this.KWHzl = chargeGroupVo;
        this.OLrzqt = periodEnum;
    }
}
