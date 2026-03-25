package o;

import com.okinc.okimcore.model.im.OKConversation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ntj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35354ntj {
    public final OKConversation KWHzl;
    public final android.os.Bundle copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35354ntj copy$default(C35354ntj c35354ntj, OKConversation oKConversation, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            oKConversation = c35354ntj.KWHzl;
        }
        if ((i & 2) != 0) {
            bundle = c35354ntj.copydefault;
        }
        return c35354ntj.KWHzl(oKConversation, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35354ntj KWHzl(@NotNull OKConversation oKConversation, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        return new C35354ntj(oKConversation, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35354ntj)) {
            return false;
        }
        C35354ntj c35354ntj = (C35354ntj) obj;
        return Intrinsics.EZpvd(this.KWHzl, c35354ntj.KWHzl) && Intrinsics.EZpvd(this.copydefault, c35354ntj.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BaseTaskHandlerParams(conversation=" + this.KWHzl + ", extras=" + this.copydefault + ")";
    }

    public C35354ntj(@NotNull OKConversation oKConversation, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        this.KWHzl = oKConversation;
        this.copydefault = bundle;
    }
}
