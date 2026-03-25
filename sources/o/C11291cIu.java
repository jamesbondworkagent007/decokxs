package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cIu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11291cIu {
    public final java.lang.String KWHzl;
    public final java.util.List<C11283cIm> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.cIu */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C11291cIu copy$default(C11291cIu c11291cIu, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c11291cIu.KWHzl;
        }
        if ((i & 2) != 0) {
            list = c11291cIu.copydefault;
        }
        return c11291cIu.EZpvd(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11291cIu EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<C11283cIm> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C11291cIu(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C11283cIm> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11291cIu)) {
            return false;
        }
        C11291cIu c11291cIu = (C11291cIu) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c11291cIu.KWHzl) && Intrinsics.EZpvd(this.copydefault, c11291cIu.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletCreateSignData(walletId=" + this.KWHzl + ", addresses=" + this.copydefault + ")";
    }

    public C11291cIu(@NotNull java.lang.String str, @NotNull java.util.List<C11283cIm> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = str;
        this.copydefault = list;
    }
}
