package o;

import com.okinc.okimcore.model.im.OKCallCommon;
import com.okinc.okimcore.model.im.OKCallSession;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sQl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44455sQl {
    public final OKCallCommon.OKCallDisconnectedReason EZpvd;
    public final OKCallSession copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44455sQl copy$default(C44455sQl c44455sQl, OKCallSession oKCallSession, OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            oKCallSession = c44455sQl.copydefault;
        }
        if ((i & 2) != 0) {
            oKCallDisconnectedReason = c44455sQl.EZpvd;
        }
        return c44455sQl.EZpvd(oKCallSession, oKCallDisconnectedReason);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKCallSession AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44455sQl EZpvd(@NotNull OKCallSession oKCallSession, OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason) {
        Intrinsics.checkNotNullParameter(oKCallSession, "");
        return new C44455sQl(oKCallSession, oKCallDisconnectedReason);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKCallCommon.OKCallDisconnectedReason OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44455sQl)) {
            return false;
        }
        C44455sQl c44455sQl = (C44455sQl) obj;
        return Intrinsics.EZpvd(this.copydefault, c44455sQl.copydefault) && this.EZpvd == c44455sQl.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason = this.EZpvd;
        return (iHashCode * 31) + (oKCallDisconnectedReason == null ? 0 : oKCallDisconnectedReason.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CallSessionEvent(callSession=" + this.copydefault + ", disConnectedReason=" + this.EZpvd + ")";
    }

    public C44455sQl(@NotNull OKCallSession oKCallSession, OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason) {
        Intrinsics.checkNotNullParameter(oKCallSession, "");
        this.copydefault = oKCallSession;
        this.EZpvd = oKCallDisconnectedReason;
    }
}
