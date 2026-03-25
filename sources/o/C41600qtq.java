package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41600qtq {
    public final java.util.List<ChargeGroupVo> AEQbTJ;
    public final java.util.List<InterfaceC41583qtZ> EZpvd;
    public final java.util.List<InterfaceC41641que> KWHzl;
    public final long OLrzqt;
    public final java.util.List<CategoryGroupVo> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.qtq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41600qtq copy$default(C41600qtq c41600qtq, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c41600qtq.copydefault;
        }
        if ((i & 2) != 0) {
            list2 = c41600qtq.AEQbTJ;
        }
        java.util.List list5 = list2;
        if ((i & 4) != 0) {
            list3 = c41600qtq.KWHzl;
        }
        java.util.List list6 = list3;
        if ((i & 8) != 0) {
            list4 = c41600qtq.EZpvd;
        }
        java.util.List list7 = list4;
        if ((i & 16) != 0) {
            j = c41600qtq.OLrzqt;
        }
        return c41600qtq.OLrzqt(list, list5, list6, list7, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41641que> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41641que> AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<CategoryGroupVo> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41583qtZ> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ChargeGroupVo> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41600qtq OLrzqt(@NotNull java.util.List<CategoryGroupVo> list, @NotNull java.util.List<ChargeGroupVo> list2, @NotNull java.util.List<? extends InterfaceC41641que> list3, @NotNull java.util.List<? extends InterfaceC41583qtZ> list4, long j) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new C41600qtq(list, list2, list3, list4, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41583qtZ> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41600qtq)) {
            return false;
        }
        C41600qtq c41600qtq = (C41600qtq) obj;
        return Intrinsics.EZpvd(this.copydefault, c41600qtq.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c41600qtq.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c41600qtq.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c41600qtq.EZpvd) && this.OLrzqt == c41600qtq.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ChargeGroupVo> gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Long.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetAllSpotAndCoinVosResult(categoryGroupList=" + this.copydefault + ", chargeGroupList=" + this.AEQbTJ + ", allSpotVoList=" + this.KWHzl + ", allCoinVoList=" + this.EZpvd + ", ts=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<CategoryGroupVo> valueOf() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends o.que> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends o.qtZ> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41600qtq(@NotNull java.util.List<CategoryGroupVo> list, @NotNull java.util.List<ChargeGroupVo> list2, @NotNull java.util.List<? extends InterfaceC41641que> list3, @NotNull java.util.List<? extends InterfaceC41583qtZ> list4, long j) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.copydefault = list;
        this.AEQbTJ = list2;
        this.KWHzl = list3;
        this.EZpvd = list4;
        this.OLrzqt = j;
    }
}
