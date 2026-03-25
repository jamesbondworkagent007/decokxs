package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rUM {
    public static final int copydefault = AKL.$stable;
    public final AKL KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ rUM copy$default(rUM rum, java.lang.String str, AKL akl, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = rum.OLrzqt;
        }
        if ((i & 2) != 0) {
            akl = rum.KWHzl;
        }
        return rum.EZpvd(str, akl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final rUM EZpvd(@NotNull java.lang.String str, @NotNull AKL akl) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(akl, "");
        return new rUM(str, akl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rUM)) {
            return false;
        }
        rUM rum = (rUM) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) rum.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, rum.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FeatureConfigWithKey(key=" + this.OLrzqt + ", configModel=" + this.KWHzl + ")";
    }

    public rUM(@NotNull java.lang.String str, @NotNull AKL akl) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(akl, "");
        this.OLrzqt = str;
        this.KWHzl = akl;
    }
}
