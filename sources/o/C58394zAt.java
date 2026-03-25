package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zAt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C58394zAt {
    public static final int $stable = 8;
    public AbstractC60238zyv AEQbTJ;
    public java.lang.String KWHzl;
    public C58381zAg OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C58394zAt copy$default(C58394zAt c58394zAt, AbstractC60238zyv abstractC60238zyv, C58381zAg c58381zAg, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abstractC60238zyv = c58394zAt.AEQbTJ;
        }
        if ((i & 2) != 0) {
            c58381zAg = c58394zAt.OLrzqt;
        }
        if ((i & 4) != 0) {
            str = c58394zAt.KWHzl;
        }
        return c58394zAt.KWHzl(abstractC60238zyv, c58381zAg, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58394zAt KWHzl(@NotNull AbstractC60238zyv abstractC60238zyv, C58381zAg c58381zAg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC60238zyv, "");
        return new C58394zAt(abstractC60238zyv, c58381zAg, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC60238zyv KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58381zAg OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58394zAt)) {
            return false;
        }
        C58394zAt c58394zAt = (C58394zAt) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c58394zAt.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c58394zAt.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c58394zAt.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        C58381zAg c58381zAg = this.OLrzqt;
        int iHashCode2 = c58381zAg == null ? 0 : c58381zAg.hashCode();
        java.lang.String str = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ConfirmNewPasswordState(networkState=" + this.AEQbTJ + ", submitResult=" + this.OLrzqt + ", errorMessage=" + this.KWHzl + ")";
    }

    public C58394zAt(@NotNull AbstractC60238zyv abstractC60238zyv, C58381zAg c58381zAg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC60238zyv, "");
        this.AEQbTJ = abstractC60238zyv;
        this.OLrzqt = c58381zAg;
        this.KWHzl = str;
    }
}
