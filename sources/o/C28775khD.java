package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28775khD {
    public final java.util.List<C28868kir> AEQbTJ;
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.khD */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C28775khD copy$default(C28775khD c28775khD, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c28775khD.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c28775khD.EZpvd;
        }
        return c28775khD.EZpvd(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28775khD EZpvd(@NotNull java.util.List<C28868kir> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C28775khD(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C28868kir> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28775khD)) {
            return false;
        }
        C28775khD c28775khD = (C28775khD) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c28775khD.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c28775khD.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SimilarTokensResult(tokens=" + this.AEQbTJ + ", tokenLargeLogoUrl=" + this.EZpvd + ")";
    }

    public C28775khD(@NotNull java.util.List<C28868kir> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = list;
        this.EZpvd = str;
    }
}
