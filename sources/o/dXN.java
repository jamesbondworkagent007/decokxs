package o;

import com.okinc.business.defi.wallet.approve.ApproveListItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dXN {
    public final java.lang.String AEQbTJ;
    public final boolean EZpvd;
    public final java.util.List<ApproveListItem> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dXN */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ dXN copy$default(dXN dxn, java.lang.String str, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = dxn.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list = dxn.copydefault;
        }
        if ((i & 4) != 0) {
            z = dxn.EZpvd;
        }
        return dxn.AEQbTJ(str, list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dXN AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<ApproveListItem> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new dXN(str, list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ApproveListItem> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dXN)) {
            return false;
        }
        dXN dxn = (dXN) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) dxn.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, dxn.copydefault) && this.EZpvd == dxn.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ApproveRiskyTokenGroup(title=" + this.AEQbTJ + ", itemList=" + this.copydefault + ", hide=" + this.EZpvd + ")";
    }

    public dXN(@NotNull java.lang.String str, @NotNull java.util.List<ApproveListItem> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = str;
        this.copydefault = list;
        this.EZpvd = z;
    }
}
