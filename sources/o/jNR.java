package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jNR {
    public final jNU AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.util.List<jNX> KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.jNR */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jNR copy$default(jNR jnr, jNU jnu, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            jnu = jnr.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list = jnr.KWHzl;
        }
        java.util.List list2 = list;
        if ((i & 4) != 0) {
            str = jnr.OLrzqt;
        }
        java.lang.String str4 = str;
        if ((i & 8) != 0) {
            str2 = jnr.copydefault;
        }
        java.lang.String str5 = str2;
        if ((i & 16) != 0) {
            str3 = jnr.EZpvd;
        }
        return jnr.AEQbTJ(jnu, list2, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jNR AEQbTJ(@NotNull jNU jnu, @NotNull java.util.List<jNX> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(jnu, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new jNR(jnu, list, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<jNX> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jNU copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jNR)) {
            return false;
        }
        jNR jnr = (jNR) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, jnr.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, jnr.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) jnr.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) jnr.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) jnr.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DevAnalysisBottomSheetUiModel(headerData=" + this.AEQbTJ + ", createdTokens=" + this.KWHzl + ", page=" + this.OLrzqt + ", pageSize=" + this.copydefault + ", totalPage=" + this.EZpvd + ")";
    }

    public jNR(@NotNull jNU jnu, @NotNull java.util.List<jNX> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(jnu, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ = jnu;
        this.KWHzl = list;
        this.OLrzqt = str;
        this.copydefault = str2;
        this.EZpvd = str3;
    }
}
