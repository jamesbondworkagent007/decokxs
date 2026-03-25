package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jKp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25902jKp {
    public final java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25902jKp copy$default(C25902jKp c25902jKp, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c25902jKp.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c25902jKp.KWHzl;
        }
        return c25902jKp.KWHzl(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25902jKp KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C25902jKp(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25902jKp)) {
            return false;
        }
        C25902jKp c25902jKp = (C25902jKp) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c25902jKp.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c25902jKp.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AllFees(allFees=" + this.AEQbTJ + ", allFeesString=" + this.KWHzl + ")";
    }

    public C25902jKp(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.KWHzl = str2;
    }
}
