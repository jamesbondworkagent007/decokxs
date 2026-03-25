package o;

import com.okinc.okimcore.model.im.OKConversationType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sQi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44452sQi {
    public final OKConversationType AEQbTJ;
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44452sQi copy$default(C44452sQi c44452sQi, java.lang.String str, OKConversationType oKConversationType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c44452sQi.EZpvd;
        }
        if ((i & 2) != 0) {
            oKConversationType = c44452sQi.AEQbTJ;
        }
        return c44452sQi.KWHzl(str, oKConversationType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44452sQi KWHzl(@NotNull java.lang.String str, @NotNull OKConversationType oKConversationType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        return new C44452sQi(str, oKConversationType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44452sQi)) {
            return false;
        }
        C44452sQi c44452sQi = (C44452sQi) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c44452sQi.EZpvd) && this.AEQbTJ == c44452sQi.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ClearEvent(targetId=" + this.EZpvd + ", conversationType=" + this.AEQbTJ + ")";
    }

    public C44452sQi(@NotNull java.lang.String str, @NotNull OKConversationType oKConversationType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        this.EZpvd = str;
        this.AEQbTJ = oKConversationType;
    }
}
