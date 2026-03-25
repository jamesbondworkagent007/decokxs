package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10531bqH {
    public final java.util.List<C10528bqE> EZpvd;
    public final java.util.List<C10528bqE> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.bqH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C10531bqH copy$default(C10531bqH c10531bqH, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c10531bqH.OLrzqt;
        }
        if ((i & 2) != 0) {
            list2 = c10531bqH.EZpvd;
        }
        return c10531bqH.KWHzl(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10531bqH KWHzl(@NotNull java.util.List<C10528bqE> list, @NotNull java.util.List<C10528bqE> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C10531bqH(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10531bqH)) {
            return false;
        }
        C10531bqH c10531bqH = (C10531bqH) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c10531bqH.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c10531bqH.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletNftAssetDataSource(nftAssets=" + this.OLrzqt + ", createdNftAssets=" + this.EZpvd + ")";
    }

    public C10531bqH(@NotNull java.util.List<C10528bqE> list, @NotNull java.util.List<C10528bqE> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.OLrzqt = list;
        this.EZpvd = list2;
    }
}
