package o;

import com.okinc.business.invest_biz.data.bean.HomeTokensItemData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iYC {
    public final java.util.List<InterfaceC27436jvE> KWHzl;
    public final int OLrzqt;
    public final java.util.List<HomeTokensItemData> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iYC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ iYC copy$default(iYC iyc, java.util.List list, int i, java.util.List list2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            list = iyc.copydefault;
        }
        if ((i2 & 2) != 0) {
            i = iyc.OLrzqt;
        }
        if ((i2 & 4) != 0) {
            list2 = iyc.KWHzl;
        }
        return iyc.AEQbTJ(list, i, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iYC AEQbTJ(@NotNull java.util.List<HomeTokensItemData> list, int i, @NotNull java.util.List<? extends InterfaceC27436jvE> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new iYC(list, i, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC27436jvE> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iYC)) {
            return false;
        }
        iYC iyc = (iYC) obj;
        return Intrinsics.EZpvd(this.copydefault, iyc.copydefault) && this.OLrzqt == iyc.OLrzqt && Intrinsics.EZpvd(this.KWHzl, iyc.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiRecommendDashboard(tokenList=" + this.copydefault + ", type=" + this.OLrzqt + ", items=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends o.jvE> */
    /* JADX WARN: Multi-variable type inference failed */
    public iYC(@NotNull java.util.List<HomeTokensItemData> list, int i, @NotNull java.util.List<? extends InterfaceC27436jvE> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.copydefault = list;
        this.OLrzqt = i;
        this.KWHzl = list2;
    }
}
