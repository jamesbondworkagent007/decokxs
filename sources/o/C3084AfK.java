package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AfK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3084AfK {
    public static final int $stable = 8;
    public java.util.List<C3082AfI> AEQbTJ;
    public java.lang.String KWHzl;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.AfK */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3084AfK copy$default(C3084AfK c3084AfK, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3084AfK.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = c3084AfK.copydefault;
        }
        if ((i & 4) != 0) {
            list = c3084AfK.AEQbTJ;
        }
        return c3084AfK.AEQbTJ(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3084AfK AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.List<C3082AfI> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C3084AfK(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C3082AfI> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3084AfK)) {
            return false;
        }
        C3084AfK c3084AfK = (C3084AfK) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c3084AfK.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c3084AfK.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c3084AfK.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        java.lang.String str = this.copydefault;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SyncInitiateResponse(business=" + this.KWHzl + ", violatedPrecondition=" + this.copydefault + ", devices=" + this.AEQbTJ + ")";
    }

    public C3084AfK(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.List<C3082AfI> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = str;
        this.copydefault = str2;
        this.AEQbTJ = list;
    }
}
