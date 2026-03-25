package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.odG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36556odG {
    public static final int KWHzl = OKMessage.$stable;
    public final OKMessage AEQbTJ;
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C36556odG copy$default(C36556odG c36556odG, java.lang.String str, OKMessage oKMessage, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c36556odG.EZpvd;
        }
        if ((i & 2) != 0) {
            oKMessage = c36556odG.AEQbTJ;
        }
        return c36556odG.AEQbTJ(str, oKMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36556odG AEQbTJ(@NotNull java.lang.String str, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return new C36556odG(str, oKMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36556odG)) {
            return false;
        }
        C36556odG c36556odG = (C36556odG) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c36556odG.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c36556odG.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ReadAllMessageRequest(channelId=" + this.EZpvd + ", latestMessage=" + this.AEQbTJ + ")";
    }

    public C36556odG(@NotNull java.lang.String str, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        this.EZpvd = str;
        this.AEQbTJ = oKMessage;
    }
}
