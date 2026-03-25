package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sQz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44469sQz {
    public final OKMessage copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44469sQz copy$default(C44469sQz c44469sQz, OKMessage oKMessage, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            oKMessage = c44469sQz.copydefault;
        }
        return c44469sQz.AEQbTJ(oKMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44469sQz AEQbTJ(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return new C44469sQz(oKMessage);
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
        return (obj instanceof C44469sQz) && Intrinsics.EZpvd(this.copydefault, ((C44469sQz) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ReceiveReadReceiptEvent(message=" + this.copydefault + ")";
    }

    public C44469sQz(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        this.copydefault = oKMessage;
    }
}
