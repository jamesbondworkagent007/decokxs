package o;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageWithReactions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sNQ {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final java.util.List<InHouseIMMessageWithReactions> OLrzqt;
    public final java.lang.Long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.sNQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ sNQ copy$default(sNQ snq, java.util.List list, boolean z, boolean z2, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = snq.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = snq.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z2 = snq.EZpvd;
        }
        if ((i & 8) != 0) {
            l = snq.copydefault;
        }
        return snq.EZpvd(list, z, z2, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InHouseIMMessageWithReactions> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sNQ EZpvd(@NotNull java.util.List<InHouseIMMessageWithReactions> list, boolean z, boolean z2, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(list, "");
        return new sNQ(list, z, z2, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long OLrzqt() {
        return this.copydefault;
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
        if (!(obj instanceof sNQ)) {
            return false;
        }
        sNQ snq = (sNQ) obj;
        return Intrinsics.EZpvd(this.OLrzqt, snq.OLrzqt) && this.AEQbTJ == snq.AEQbTJ && this.EZpvd == snq.EZpvd && Intrinsics.EZpvd(this.copydefault, snq.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode3 = java.lang.Boolean.hashCode(this.EZpvd);
        java.lang.Long l = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InHouseMessageListResponse(messageList=" + this.OLrzqt + ", hasNextPage=" + this.AEQbTJ + ", hasPreviousPage=" + this.EZpvd + ", firstUnreadSeq=" + this.copydefault + ")";
    }

    public sNQ(@NotNull java.util.List<InHouseIMMessageWithReactions> list, boolean z, boolean z2, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
        this.AEQbTJ = z;
        this.EZpvd = z2;
        this.copydefault = l;
    }
}
