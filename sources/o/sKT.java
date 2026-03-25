package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sKT {
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Long OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ sKT copy$default(sKT skt, java.lang.String str, java.lang.String str2, int i, java.lang.Long l, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = skt.copydefault;
        }
        if ((i2 & 2) != 0) {
            str2 = skt.KWHzl;
        }
        if ((i2 & 4) != 0) {
            i = skt.EZpvd;
        }
        if ((i2 & 8) != 0) {
            l = skt.OLrzqt;
        }
        return skt.EZpvd(str, str2, i, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sKT EZpvd(@NotNull java.lang.String str, java.lang.String str2, int i, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        return new sKT(str, str2, i, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sKT)) {
            return false;
        }
        sKT skt = (sKT) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) skt.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) skt.KWHzl) && this.EZpvd == skt.EZpvd && Intrinsics.EZpvd(this.OLrzqt, skt.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = java.lang.Integer.hashCode(this.EZpvd);
        java.lang.Long l = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchMessagesRequest(keyword=" + this.copydefault + ", conversationId=" + this.KWHzl + ", pageSize=" + this.EZpvd + ", lastMessageSendTime=" + this.OLrzqt + ")";
    }

    public sKT(@NotNull java.lang.String str, java.lang.String str2, int i, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.KWHzl = str2;
        this.EZpvd = i;
        this.OLrzqt = l;
    }
}
