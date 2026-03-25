package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bcz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C4408Bcz {
    public static final int $stable = 8;
    public C4369BcM AEQbTJ;
    public java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C4408Bcz copy$default(C4408Bcz c4408Bcz, java.lang.String str, C4369BcM c4369BcM, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c4408Bcz.EZpvd;
        }
        if ((i & 2) != 0) {
            c4369BcM = c4408Bcz.AEQbTJ;
        }
        return c4408Bcz.KWHzl(str, c4369BcM);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4369BcM EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4408Bcz KWHzl(@NotNull java.lang.String str, @NotNull C4369BcM c4369BcM) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c4369BcM, "");
        return new C4408Bcz(str, c4369BcM);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4408Bcz)) {
            return false;
        }
        C4408Bcz c4408Bcz = (C4408Bcz) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c4408Bcz.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c4408Bcz.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WsArgPayload(channel=" + this.EZpvd + ", params=" + this.AEQbTJ + ")";
    }

    public C4408Bcz(@NotNull java.lang.String str, @NotNull C4369BcM c4369BcM) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c4369BcM, "");
        this.EZpvd = str;
        this.AEQbTJ = c4369BcM;
    }
}
