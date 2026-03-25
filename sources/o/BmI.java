package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class BmI {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public java.lang.String EZpvd;
    public int KWHzl;
    public java.util.List<BoG> OLrzqt;
    public java.util.List<BoG> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.BmI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BmI copy$default(BmI bmI, java.util.List list, java.lang.String str, int i, boolean z, java.util.List list2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            list = bmI.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            str = bmI.EZpvd;
        }
        java.lang.String str2 = str;
        if ((i2 & 4) != 0) {
            i = bmI.KWHzl;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = bmI.AEQbTJ;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            list2 = bmI.copydefault;
        }
        return bmI.OLrzqt(list, str2, i3, z2, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<BoG> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<BoG> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BmI OLrzqt(@NotNull java.util.List<BoG> list, @NotNull java.lang.String str, int i, boolean z, @NotNull java.util.List<BoG> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new BmI(list, str, i, z, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BmI)) {
            return false;
        }
        BmI bmI = (BmI) obj;
        return Intrinsics.EZpvd(this.OLrzqt, bmI.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) bmI.EZpvd) && this.KWHzl == bmI.KWHzl && this.AEQbTJ == bmI.AEQbTJ && Intrinsics.EZpvd(this.copydefault, bmI.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CurrencyListState(apiList=" + this.OLrzqt + ", searchQuery=" + this.EZpvd + ", currentCurrencyId=" + this.KWHzl + ", isSearchBarVisible=" + this.AEQbTJ + ", filteredList=" + this.copydefault + ")";
    }

    public BmI(@NotNull java.util.List<BoG> list, @NotNull java.lang.String str, int i, boolean z, @NotNull java.util.List<BoG> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.OLrzqt = list;
        this.EZpvd = str;
        this.KWHzl = i;
        this.AEQbTJ = z;
        this.copydefault = list2;
    }
}
