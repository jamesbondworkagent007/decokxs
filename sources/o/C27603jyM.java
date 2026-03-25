package o;

import com.okinc.business.market.data.constant.AddressTrackerSortType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jyM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27603jyM {
    public final java.lang.Long AEQbTJ;
    public final AddressTrackerSortType EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final boolean copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27603jyM copy$default(C27603jyM c27603jyM, java.lang.String str, java.lang.Long l, int i, int i2, AddressTrackerSortType addressTrackerSortType, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = c27603jyM.gEmmrt;
        }
        if ((i3 & 2) != 0) {
            l = c27603jyM.AEQbTJ;
        }
        java.lang.Long l2 = l;
        if ((i3 & 4) != 0) {
            i = c27603jyM.KWHzl;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = c27603jyM.OLrzqt;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            addressTrackerSortType = c27603jyM.EZpvd;
        }
        AddressTrackerSortType addressTrackerSortType2 = addressTrackerSortType;
        if ((i3 & 32) != 0) {
            z = c27603jyM.copydefault;
        }
        return c27603jyM.copydefault(str, l2, i4, i5, addressTrackerSortType2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27603jyM copydefault(@NotNull java.lang.String str, java.lang.Long l, int i, int i2, @NotNull AddressTrackerSortType addressTrackerSortType, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(addressTrackerSortType, "");
        return new C27603jyM(str, l, i, i2, addressTrackerSortType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27603jyM)) {
            return false;
        }
        C27603jyM c27603jyM = (C27603jyM) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c27603jyM.gEmmrt) && Intrinsics.EZpvd(this.AEQbTJ, c27603jyM.AEQbTJ) && this.KWHzl == c27603jyM.KWHzl && this.OLrzqt == c27603jyM.OLrzqt && this.EZpvd == c27603jyM.EZpvd && this.copydefault == c27603jyM.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        java.lang.Long l = this.AEQbTJ;
        return (((((((((iHashCode * 31) + (l == null ? 0 : l.hashCode())) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetTrackingAddressListRequest(walletAddress=" + this.gEmmrt + ", groupId=" + this.AEQbTJ + ", pageNum=" + this.KWHzl + ", pageSize=" + this.OLrzqt + ", sortType=" + this.EZpvd + ", isAsc=" + this.copydefault + ")";
    }

    public C27603jyM(@NotNull java.lang.String str, java.lang.Long l, int i, int i2, @NotNull AddressTrackerSortType addressTrackerSortType, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(addressTrackerSortType, "");
        this.gEmmrt = str;
        this.AEQbTJ = l;
        this.KWHzl = i;
        this.OLrzqt = i2;
        this.EZpvd = addressTrackerSortType;
        this.copydefault = z;
    }

    public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        java.util.Map<java.lang.String, java.lang.String> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("walletAddress", this.gEmmrt), C56390yDp.OLrzqt("pageNum", java.lang.String.valueOf(this.KWHzl)), C56390yDp.OLrzqt("pageSize", java.lang.String.valueOf(this.OLrzqt)), C56390yDp.OLrzqt("sortType", java.lang.String.valueOf(this.EZpvd.getValue())), C56390yDp.OLrzqt("isAsc", java.lang.String.valueOf(this.copydefault)), C56390yDp.OLrzqt("queryNative", "true"));
        java.lang.Long l = this.AEQbTJ;
        if (l != null) {
            mapDjBIcL.put("groupId", java.lang.String.valueOf(l.longValue()));
        }
        return mapDjBIcL;
    }
}
