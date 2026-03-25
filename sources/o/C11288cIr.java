package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cIr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11288cIr {
    public final java.util.List<C11283cIm> AEQbTJ;
    public final java.util.List<C11283cIm> EZpvd;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.cIr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C11288cIr copy$default(C11288cIr c11288cIr, java.lang.String str, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c11288cIr.OLrzqt;
        }
        if ((i & 2) != 0) {
            list = c11288cIr.EZpvd;
        }
        if ((i & 4) != 0) {
            list2 = c11288cIr.AEQbTJ;
        }
        return c11288cIr.copydefault(str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C11283cIm> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C11283cIm> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11288cIr copydefault(@NotNull java.lang.String str, @NotNull java.util.List<C11283cIm> list, @NotNull java.util.List<C11283cIm> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C11288cIr(str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11288cIr)) {
            return false;
        }
        C11288cIr c11288cIr = (C11288cIr) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c11288cIr.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c11288cIr.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c11288cIr.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletSyncSignData(walletId=" + this.OLrzqt + ", updateAddresses=" + this.EZpvd + ", addAddresses=" + this.AEQbTJ + ")";
    }

    public C11288cIr(@NotNull java.lang.String str, @NotNull java.util.List<C11283cIm> list, @NotNull java.util.List<C11283cIm> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.OLrzqt = str;
        this.EZpvd = list;
        this.AEQbTJ = list2;
    }
}
