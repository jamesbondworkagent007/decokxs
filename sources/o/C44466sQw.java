package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sQw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44466sQw {
    public final OKMessage AEQbTJ;
    public final OKMessage EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44466sQw copy$default(C44466sQw c44466sQw, OKMessage oKMessage, OKMessage oKMessage2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            oKMessage = c44466sQw.EZpvd;
        }
        if ((i & 2) != 0) {
            oKMessage2 = c44466sQw.AEQbTJ;
        }
        return c44466sQw.copydefault(oKMessage, oKMessage2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44466sQw copydefault(@NotNull OKMessage oKMessage, @NotNull OKMessage oKMessage2) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage2, "");
        return new C44466sQw(oKMessage, oKMessage2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44466sQw)) {
            return false;
        }
        C44466sQw c44466sQw = (C44466sQw) obj;
        return Intrinsics.EZpvd(this.EZpvd, c44466sQw.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c44466sQw.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ReplaceEvent(oldMessage=" + this.EZpvd + ", newMessage=" + this.AEQbTJ + ")";
    }

    public C44466sQw(@NotNull OKMessage oKMessage, @NotNull OKMessage oKMessage2) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage2, "");
        this.EZpvd = oKMessage;
        this.AEQbTJ = oKMessage2;
    }
}
