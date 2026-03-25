package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fMm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C17631fMm {
    public final int AEQbTJ;
    public final java.util.List<C17630fMl> EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fMm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C17631fMm copy$default(C17631fMm c17631fMm, int i, java.lang.String str, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c17631fMm.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            str = c17631fMm.KWHzl;
        }
        if ((i2 & 4) != 0) {
            list = c17631fMm.EZpvd;
        }
        return c17631fMm.AEQbTJ(i, str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C17631fMm AEQbTJ(int i, @NotNull java.lang.String str, @NotNull java.util.List<C17630fMl> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C17631fMm(i, str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C17630fMl> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17631fMm)) {
            return false;
        }
        C17631fMm c17631fMm = (C17631fMm) obj;
        return this.AEQbTJ == c17631fMm.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c17631fMm.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c17631fMm.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.AEQbTJ) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecoverChainItemInfo(index=" + this.AEQbTJ + ", fromEmail=" + this.KWHzl + ", chainInfoList=" + this.EZpvd + ")";
    }

    public C17631fMm(int i, @NotNull java.lang.String str, @NotNull java.util.List<C17630fMl> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = i;
        this.KWHzl = str;
        this.EZpvd = list;
    }
}
