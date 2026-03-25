package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41418qqT {
    public final SortBy AEQbTJ;
    public final CategoryGroupVo EZpvd;
    public final SortOrder KWHzl;
    public final java.util.List<InterfaceC41583qtZ> OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.qqT */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41418qqT copy$default(C41418qqT c41418qqT, CategoryGroupVo categoryGroupVo, SortBy sortBy, SortOrder sortOrder, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            categoryGroupVo = c41418qqT.EZpvd;
        }
        if ((i & 2) != 0) {
            sortBy = c41418qqT.AEQbTJ;
        }
        SortBy sortBy2 = sortBy;
        if ((i & 4) != 0) {
            sortOrder = c41418qqT.KWHzl;
        }
        SortOrder sortOrder2 = sortOrder;
        if ((i & 8) != 0) {
            list = c41418qqT.OLrzqt;
        }
        java.util.List list2 = list;
        if ((i & 16) != 0) {
            z = c41418qqT.copydefault;
        }
        return c41418qqT.copydefault(categoryGroupVo, sortBy2, sortOrder2, list2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CategoryGroupVo AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41583qtZ> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortBy KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortOrder copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41418qqT copydefault(@NotNull CategoryGroupVo categoryGroupVo, @NotNull SortBy sortBy, @NotNull SortOrder sortOrder, @NotNull java.util.List<? extends InterfaceC41583qtZ> list, boolean z) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        Intrinsics.checkNotNullParameter(sortBy, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C41418qqT(categoryGroupVo, sortBy, sortOrder, list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41418qqT)) {
            return false;
        }
        C41418qqT c41418qqT = (C41418qqT) obj;
        return Intrinsics.EZpvd(this.EZpvd, c41418qqT.EZpvd) && this.AEQbTJ == c41418qqT.AEQbTJ && this.KWHzl == c41418qqT.KWHzl && Intrinsics.EZpvd(this.OLrzqt, c41418qqT.OLrzqt) && this.copydefault == c41418qqT.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends o.qtZ> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41418qqT(@NotNull CategoryGroupVo categoryGroupVo, @NotNull SortBy sortBy, @NotNull SortOrder sortOrder, @NotNull java.util.List<? extends InterfaceC41583qtZ> list, boolean z) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        Intrinsics.checkNotNullParameter(sortBy, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = categoryGroupVo;
        this.AEQbTJ = sortBy;
        this.KWHzl = sortOrder;
        this.OLrzqt = list;
        this.copydefault = z;
    }

    public java.lang.String toString() {
        return "SubscribeCoinVosPayload(categoryGroup=" + this.EZpvd.AhwBna() + ", sortBy=" + this.AEQbTJ + ", sortOrder=" + this.KWHzl + ", allCoinVoList=" + this.OLrzqt.size() + ", isEnableWsTickers=" + this.copydefault + ")";
    }
}
