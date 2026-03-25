package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51014vey {
    public static final int $stable = 0;
    public final java.lang.String algoId;
    public final java.lang.String percentage;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C51014vey copy$default(C51014vey c51014vey, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c51014vey.algoId;
        }
        if ((i & 2) != 0) {
            str2 = c51014vey.percentage;
        }
        return c51014vey.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C51014vey OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C51014vey(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51014vey)) {
            return false;
        }
        C51014vey c51014vey = (C51014vey) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.algoId, (java.lang.Object) c51014vey.algoId) && Intrinsics.EZpvd((java.lang.Object) this.percentage, (java.lang.Object) c51014vey.percentage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.algoId.hashCode() * 31) + this.percentage.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ReduceArbPositionReq(algoId=" + this.algoId + ", percentage=" + this.percentage + ")";
    }

    public C51014vey(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.algoId = str;
        this.percentage = str2;
    }
}
