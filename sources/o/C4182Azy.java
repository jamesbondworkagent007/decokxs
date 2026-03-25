package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Azy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C4182Azy {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C4182Azy copy$default(C4182Azy c4182Azy, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c4182Azy.AEQbTJ;
        }
        return c4182Azy.KWHzl(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4182Azy KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C4182Azy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4182Azy) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((C4182Azy) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BridgeApproveDataParamsJson(json=" + this.AEQbTJ + ")";
    }

    public C4182Azy(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }
}
