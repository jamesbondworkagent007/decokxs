package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fgS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18333fgS {
    public final C10854bwM AEQbTJ;
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18333fgS copy$default(C18333fgS c18333fgS, java.lang.String str, C10854bwM c10854bwM, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c18333fgS.EZpvd;
        }
        if ((i & 2) != 0) {
            c10854bwM = c18333fgS.AEQbTJ;
        }
        return c18333fgS.copydefault(str, c10854bwM);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18333fgS copydefault(@NotNull java.lang.String str, @NotNull C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        return new C18333fgS(str, c10854bwM);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18333fgS)) {
            return false;
        }
        C18333fgS c18333fgS = (C18333fgS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c18333fgS.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c18333fgS.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CloudBackupAddressItemData(address=" + this.EZpvd + ", coinMeta=" + this.AEQbTJ + ")";
    }

    public C18333fgS(@NotNull java.lang.String str, @NotNull C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        this.EZpvd = str;
        this.AEQbTJ = c10854bwM;
    }
}
