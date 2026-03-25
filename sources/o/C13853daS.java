package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.daS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13853daS {
    public final java.lang.String AEQbTJ;
    public final C10854bwM OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C13853daS copy$default(C13853daS c13853daS, java.lang.String str, C10854bwM c10854bwM, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c13853daS.AEQbTJ;
        }
        if ((i & 2) != 0) {
            c10854bwM = c13853daS.OLrzqt;
        }
        return c13853daS.OLrzqt(str, c10854bwM);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13853daS OLrzqt(@NotNull java.lang.String str, @NotNull C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        return new C13853daS(str, c10854bwM);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13853daS)) {
            return false;
        }
        C13853daS c13853daS = (C13853daS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c13853daS.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c13853daS.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SupportedChain(address=" + this.AEQbTJ + ", coinMeta=" + this.OLrzqt + ")";
    }

    public C13853daS(@NotNull java.lang.String str, @NotNull C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        this.AEQbTJ = str;
        this.OLrzqt = c10854bwM;
    }
}
