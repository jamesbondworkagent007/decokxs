package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sQx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44467sQx {
    public final OKMessage copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44467sQx copy$default(C44467sQx c44467sQx, OKMessage oKMessage, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            oKMessage = c44467sQx.copydefault;
        }
        return c44467sQx.KWHzl(oKMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44467sQx KWHzl(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return new C44467sQx(oKMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44467sQx) && Intrinsics.EZpvd(this.copydefault, ((C44467sQx) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ReceiveEvent(message=" + this.copydefault + ")";
    }

    public C44467sQx(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        this.copydefault = oKMessage;
    }
}
