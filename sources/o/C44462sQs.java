package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sQs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44462sQs {
    public final OKMessage copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44462sQs copy$default(C44462sQs c44462sQs, OKMessage oKMessage, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            oKMessage = c44462sQs.copydefault;
        }
        return c44462sQs.EZpvd(oKMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44462sQs EZpvd(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return new C44462sQs(oKMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44462sQs) && Intrinsics.EZpvd(this.copydefault, ((C44462sQs) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ReceiveCustomMessageEvent(message=" + this.copydefault + ")";
    }

    public C44462sQs(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        this.copydefault = oKMessage;
    }
}
