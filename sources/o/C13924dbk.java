package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dbk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C13924dbk {
    public final java.lang.String AEQbTJ;
    public final C10854bwM KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C13924dbk copy$default(C13924dbk c13924dbk, C10854bwM c10854bwM, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c10854bwM = c13924dbk.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c13924dbk.AEQbTJ;
        }
        return c13924dbk.KWHzl(c10854bwM, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13924dbk KWHzl(@NotNull C10854bwM c10854bwM, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C13924dbk(c10854bwM, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13924dbk)) {
            return false;
        }
        C13924dbk c13924dbk = (C13924dbk) obj;
        return Intrinsics.EZpvd(this.KWHzl, c13924dbk.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c13924dbk.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SupportCustomCoinChainMeta(coinMeta=" + this.KWHzl + ", imageUrl=" + this.AEQbTJ + ")";
    }

    public C13924dbk(@NotNull C10854bwM c10854bwM, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = c10854bwM;
        this.AEQbTJ = str;
    }
}
