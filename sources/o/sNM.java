package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sNM {
    public final boolean AEQbTJ;
    public final boolean KWHzl;
    public final java.util.List<OKMessage> OLrzqt;
    public final java.lang.Long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.sNM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ sNM copy$default(sNM snm, java.util.List list, boolean z, boolean z2, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = snm.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = snm.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z2 = snm.KWHzl;
        }
        if ((i & 8) != 0) {
            l = snm.copydefault;
        }
        return snm.EZpvd(list, z, z2, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sNM EZpvd(@NotNull java.util.List<OKMessage> list, boolean z, boolean z2, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(list, "");
        return new sNM(list, z, z2, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<OKMessage> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sNM)) {
            return false;
        }
        sNM snm = (sNM) obj;
        return Intrinsics.EZpvd(this.OLrzqt, snm.OLrzqt) && this.AEQbTJ == snm.AEQbTJ && this.KWHzl == snm.KWHzl && Intrinsics.EZpvd(this.copydefault, snm.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode3 = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.Long l = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MessageListResponse(messageList=" + this.OLrzqt + ", hasNextPage=" + this.AEQbTJ + ", hasPreviousPage=" + this.KWHzl + ", firstUnreadSeq=" + this.copydefault + ")";
    }

    public sNM(@NotNull java.util.List<OKMessage> list, boolean z, boolean z2, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
        this.AEQbTJ = z;
        this.KWHzl = z2;
        this.copydefault = l;
    }
}
