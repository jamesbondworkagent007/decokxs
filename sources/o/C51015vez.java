package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51015vez {
    public static final int $stable = 0;
    public final java.lang.String algoId;
    public final java.lang.String cycleId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C51015vez copy$default(C51015vez c51015vez, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c51015vez.algoId;
        }
        if ((i & 2) != 0) {
            str2 = c51015vez.cycleId;
        }
        return c51015vez.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C51015vez AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C51015vez(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51015vez)) {
            return false;
        }
        C51015vez c51015vez = (C51015vez) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.algoId, (java.lang.Object) c51015vez.algoId) && Intrinsics.EZpvd((java.lang.Object) this.cycleId, (java.lang.Object) c51015vez.cycleId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.algoId.hashCode() * 31) + this.cycleId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TerminateCycleData(algoId=" + this.algoId + ", cycleId=" + this.cycleId + ")";
    }

    public C51015vez(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.algoId = str;
        this.cycleId = str2;
    }
}
