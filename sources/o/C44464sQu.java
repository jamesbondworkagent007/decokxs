package o;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sQu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44464sQu {
    public final OKMessage EZpvd;
    public final OKRecallNotificationMessage OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44464sQu copy$default(C44464sQu c44464sQu, OKMessage oKMessage, OKRecallNotificationMessage oKRecallNotificationMessage, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            oKMessage = c44464sQu.EZpvd;
        }
        if ((i & 2) != 0) {
            oKRecallNotificationMessage = c44464sQu.OLrzqt;
        }
        return c44464sQu.EZpvd(oKMessage, oKRecallNotificationMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKRecallNotificationMessage EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44464sQu EZpvd(@NotNull OKMessage oKMessage, OKRecallNotificationMessage oKRecallNotificationMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return new C44464sQu(oKMessage, oKRecallNotificationMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44464sQu)) {
            return false;
        }
        C44464sQu c44464sQu = (C44464sQu) obj;
        return Intrinsics.EZpvd(this.EZpvd, c44464sQu.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c44464sQu.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        OKRecallNotificationMessage oKRecallNotificationMessage = this.OLrzqt;
        return (iHashCode * 31) + (oKRecallNotificationMessage == null ? 0 : oKRecallNotificationMessage.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecallEvent(message=" + this.EZpvd + ", recallNotifyMessage=" + this.OLrzqt + ")";
    }

    public C44464sQu(@NotNull OKMessage oKMessage, OKRecallNotificationMessage oKRecallNotificationMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        this.EZpvd = oKMessage;
        this.OLrzqt = oKRecallNotificationMessage;
    }
}
