package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bnn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10404bnn {
    public final boolean AEQbTJ;
    public final java.util.List<C10527bqD> EZpvd;
    public final java.util.List<C10525bqB> KWHzl;
    public final java.util.List<C10528bqE> OLrzqt;
    public final java.util.List<C10525bqB> copydefault;
    public final java.util.List<C10525bqB> djBIcL;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.bnn */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C10404bnn copy$default(C10404bnn c10404bnn, java.lang.String str, boolean z, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c10404bnn.valueOf;
        }
        if ((i & 2) != 0) {
            z = c10404bnn.AEQbTJ;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            list = c10404bnn.KWHzl;
        }
        java.util.List list6 = list;
        if ((i & 8) != 0) {
            list2 = c10404bnn.djBIcL;
        }
        java.util.List list7 = list2;
        if ((i & 16) != 0) {
            list3 = c10404bnn.copydefault;
        }
        java.util.List list8 = list3;
        if ((i & 32) != 0) {
            list4 = c10404bnn.EZpvd;
        }
        java.util.List list9 = list4;
        if ((i & 64) != 0) {
            list5 = c10404bnn.OLrzqt;
        }
        return c10404bnn.OLrzqt(str, z2, list6, list7, list8, list9, list5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C10527bqD> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C10528bqE> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C10525bqB> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C10525bqB> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10404bnn OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull java.util.List<C10525bqB> list, @NotNull java.util.List<C10525bqB> list2, @NotNull java.util.List<C10525bqB> list3, @NotNull java.util.List<C10527bqD> list4, @NotNull java.util.List<C10528bqE> list5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        return new C10404bnn(str, z, list, list2, list3, list4, list5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10404bnn)) {
            return false;
        }
        C10404bnn c10404bnn = (C10404bnn) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c10404bnn.valueOf) && this.AEQbTJ == c10404bnn.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, c10404bnn.KWHzl) && Intrinsics.EZpvd(this.djBIcL, c10404bnn.djBIcL) && Intrinsics.EZpvd(this.copydefault, c10404bnn.copydefault) && Intrinsics.EZpvd(this.EZpvd, c10404bnn.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c10404bnn.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.valueOf.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + this.KWHzl.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletAssetAllDataSource(walletId=" + this.valueOf + ", isRefreshFromServer=" + this.AEQbTJ + ", coinAssets=" + this.KWHzl + ", smallCoinAssets=" + this.djBIcL + ", removedCoinMetas=" + this.copydefault + ", defiAssets=" + this.EZpvd + ", nftAssets=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C10525bqB> valueOf() {
        return this.djBIcL;
    }

    public C10404bnn(@NotNull java.lang.String str, boolean z, @NotNull java.util.List<C10525bqB> list, @NotNull java.util.List<C10525bqB> list2, @NotNull java.util.List<C10525bqB> list3, @NotNull java.util.List<C10527bqD> list4, @NotNull java.util.List<C10528bqE> list5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        this.valueOf = str;
        this.AEQbTJ = z;
        this.KWHzl = list;
        this.djBIcL = list2;
        this.copydefault = list3;
        this.EZpvd = list4;
        this.OLrzqt = list5;
    }

    public final java.util.List<C10525bqB> copydefault() {
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) this.KWHzl, (java.lang.Iterable) this.djBIcL);
    }
}
