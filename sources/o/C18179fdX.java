package o;

import com.okinc.business.defi.wallet.home.usdgActivity.data.model.AddressRegisterBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18179fdX {
    public final java.util.List<AddressRegisterBean> AEQbTJ;
    public final java.lang.String KWHzl;
    public final long OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fdX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C18179fdX copy$default(C18179fdX c18179fdX, java.lang.String str, long j, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c18179fdX.KWHzl;
        }
        if ((i & 2) != 0) {
            j = c18179fdX.OLrzqt;
        }
        if ((i & 4) != 0) {
            list = c18179fdX.AEQbTJ;
        }
        return c18179fdX.KWHzl(str, j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AddressRegisterBean> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18179fdX KWHzl(@NotNull java.lang.String str, long j, @NotNull java.util.List<AddressRegisterBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C18179fdX(str, j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18179fdX)) {
            return false;
        }
        C18179fdX c18179fdX = (C18179fdX) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c18179fdX.KWHzl) && this.OLrzqt == c18179fdX.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, c18179fdX.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RegisterActivityAddressInput(uid=" + this.KWHzl + ", bannerId=" + this.OLrzqt + ", registerAddressList=" + this.AEQbTJ + ")";
    }

    public C18179fdX(@NotNull java.lang.String str, long j, @NotNull java.util.List<AddressRegisterBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = str;
        this.OLrzqt = j;
        this.AEQbTJ = list;
    }
}
