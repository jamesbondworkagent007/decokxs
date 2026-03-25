package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tlr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47218tlr {
    public final C47211tlk AEQbTJ;
    public final java.util.List<java.lang.Integer> KWHzl;
    public final java.util.List<C47206tlf> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tlr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C47218tlr copy$default(C47218tlr c47218tlr, java.util.List list, C47211tlk c47211tlk, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c47218tlr.KWHzl;
        }
        if ((i & 2) != 0) {
            c47211tlk = c47218tlr.AEQbTJ;
        }
        if ((i & 4) != 0) {
            list2 = c47218tlr.copydefault;
        }
        return c47218tlr.copydefault(list, c47211tlk, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C47206tlf> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47211tlk copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47218tlr copydefault(@NotNull java.util.List<java.lang.Integer> list, @NotNull C47211tlk c47211tlk, @NotNull java.util.List<C47206tlf> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c47211tlk, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C47218tlr(list, c47211tlk, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47218tlr)) {
            return false;
        }
        C47218tlr c47218tlr = (C47218tlr) obj;
        return Intrinsics.EZpvd(this.KWHzl, c47218tlr.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c47218tlr.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c47218tlr.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RsdOssConfig(needUploadFiles=" + this.KWHzl + ", ossConfig=" + this.AEQbTJ + ", appList=" + this.copydefault + ")";
    }

    public C47218tlr(@NotNull java.util.List<java.lang.Integer> list, @NotNull C47211tlk c47211tlk, @NotNull java.util.List<C47206tlf> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c47211tlk, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.KWHzl = list;
        this.AEQbTJ = c47211tlk;
        this.copydefault = list2;
    }
}
