package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fDO {
    public final java.lang.String AEQbTJ;
    public final dTH AYXKKw;
    public final java.lang.String EZpvd;
    public final java.util.List<java.lang.String> KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.fDO */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ fDO copy$default(fDO fdo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, dTH dth, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fdo.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = fdo.AEQbTJ;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = fdo.copydefault;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            list = fdo.KWHzl;
        }
        java.util.List list2 = list;
        if ((i & 16) != 0) {
            dth = fdo.AYXKKw;
        }
        dTH dth2 = dth;
        if ((i & 32) != 0) {
            z = fdo.OLrzqt;
        }
        return fdo.OLrzqt(str, str4, str5, list2, dth2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dTH AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final fDO OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.List<java.lang.String> list, @NotNull dTH dth, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(dth, "");
        return new fDO(str, str2, str3, list, dth, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fDO)) {
            return false;
        }
        fDO fdo = (fDO) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) fdo.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) fdo.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) fdo.copydefault) && Intrinsics.EZpvd(this.KWHzl, fdo.KWHzl) && Intrinsics.EZpvd(this.AYXKKw, fdo.AYXKKw) && this.OLrzqt == fdo.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        java.lang.String str = this.AEQbTJ;
        return (((((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AccountSearchResult(id=" + this.EZpvd + ", avatarAddress=" + this.AEQbTJ + ", name=" + this.copydefault + ", openedChainAddresses=" + this.KWHzl + ", teeWalletStatus=" + this.AYXKKw + ", isSelected=" + this.OLrzqt + ")";
    }

    public fDO(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.List<java.lang.String> list, @NotNull dTH dth, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(dth, "");
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.copydefault = str3;
        this.KWHzl = list;
        this.AYXKKw = dth;
        this.OLrzqt = z;
    }

    public final java.lang.String EZpvd(java.lang.String str, boolean z) {
        if (str == null || str.length() == 0) {
            return null;
        }
        java.util.List<java.lang.String> list = this.KWHzl;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (StringsKt__StringsKt.AhwBna((java.lang.String) obj, str, z)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.size() == 1 ? (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList) : str;
    }
}
