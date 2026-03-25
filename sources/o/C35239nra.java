package o;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35239nra {
    public static final int KWHzl = (RelationInfo.$stable | OKConversation.$stable) | OKMessage.$stable;
    public final OKConversation AEQbTJ;
    public final OKMessage EZpvd;
    public final RelationInfo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35239nra copy$default(C35239nra c35239nra, OKMessage oKMessage, OKConversation oKConversation, RelationInfo relationInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            oKMessage = c35239nra.EZpvd;
        }
        if ((i & 2) != 0) {
            oKConversation = c35239nra.AEQbTJ;
        }
        if ((i & 4) != 0) {
            relationInfo = c35239nra.copydefault;
        }
        return c35239nra.OLrzqt(oKMessage, oKConversation, relationInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelationInfo KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKConversation OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35239nra OLrzqt(@NotNull OKMessage oKMessage, @NotNull OKConversation oKConversation, RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        return new C35239nra(oKMessage, oKConversation, relationInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35239nra)) {
            return false;
        }
        C35239nra c35239nra = (C35239nra) obj;
        return Intrinsics.EZpvd(this.EZpvd, c35239nra.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c35239nra.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c35239nra.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        RelationInfo relationInfo = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (relationInfo == null ? 0 : relationInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MessageSendInterceptorData(message=" + this.EZpvd + ", conversation=" + this.AEQbTJ + ", relationInfo=" + this.copydefault + ")";
    }

    public C35239nra(@NotNull OKMessage oKMessage, @NotNull OKConversation oKConversation, RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        this.EZpvd = oKMessage;
        this.AEQbTJ = oKConversation;
        this.copydefault = relationInfo;
    }
}
