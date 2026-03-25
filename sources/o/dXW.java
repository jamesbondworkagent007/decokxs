package o;

import com.okinc.business.defi.wallet.approve.ApproveListItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class dXW {
    public final java.util.List<ApproveListItem> AEQbTJ;
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dXW */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ dXW copy$default(dXW dxw, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = dxw.EZpvd;
        }
        if ((i & 2) != 0) {
            list = dxw.AEQbTJ;
        }
        return dxw.KWHzl(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ApproveListItem> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dXW KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<ApproveListItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new dXW(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dXW)) {
            return false;
        }
        dXW dxw = (dXW) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) dxw.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, dxw.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ApproveTokenGroup(title=" + this.EZpvd + ", itemList=" + this.AEQbTJ + ")";
    }

    public dXW(@NotNull java.lang.String str, @NotNull java.util.List<ApproveListItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = str;
        this.AEQbTJ = list;
    }
}
