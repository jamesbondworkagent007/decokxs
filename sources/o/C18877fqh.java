package o;

import com.okinc.business.defi.wallet.mine.data.BoundWallet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fqh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18877fqh {
    public final java.lang.String AEQbTJ;
    public final java.util.List<BoundWallet> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fqh */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C18877fqh copy$default(C18877fqh c18877fqh, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c18877fqh.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list = c18877fqh.KWHzl;
        }
        return c18877fqh.copydefault(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<BoundWallet> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18877fqh copydefault(@NotNull java.lang.String str, @NotNull java.util.List<BoundWallet> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C18877fqh(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18877fqh)) {
            return false;
        }
        C18877fqh c18877fqh = (C18877fqh) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c18877fqh.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c18877fqh.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BoundWalletInfo(groupName=" + this.AEQbTJ + ", wallets=" + this.KWHzl + ")";
    }

    public C18877fqh(@NotNull java.lang.String str, @NotNull java.util.List<BoundWallet> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = str;
        this.KWHzl = list;
    }
}
