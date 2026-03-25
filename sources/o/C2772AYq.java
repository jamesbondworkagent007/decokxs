package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AYq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C2772AYq {
    public static final int $stable = 8;
    public AXY EZpvd;
    public AXY copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2772AYq copy$default(C2772AYq c2772AYq, AXY axy, AXY axy2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            axy = c2772AYq.EZpvd;
        }
        if ((i & 2) != 0) {
            axy2 = c2772AYq.copydefault;
        }
        return c2772AYq.AEQbTJ(axy, axy2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AXY AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2772AYq AEQbTJ(@NotNull AXY axy, @NotNull AXY axy2) {
        Intrinsics.checkNotNullParameter(axy, "");
        Intrinsics.checkNotNullParameter(axy2, "");
        return new C2772AYq(axy, axy2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AXY copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2772AYq)) {
            return false;
        }
        C2772AYq c2772AYq = (C2772AYq) obj;
        return Intrinsics.EZpvd(this.EZpvd, c2772AYq.EZpvd) && Intrinsics.EZpvd(this.copydefault, c2772AYq.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LanguageState(previousLanguage=" + this.EZpvd + ", currentLanguage=" + this.copydefault + ")";
    }

    public C2772AYq(@NotNull AXY axy, @NotNull AXY axy2) {
        Intrinsics.checkNotNullParameter(axy, "");
        Intrinsics.checkNotNullParameter(axy2, "");
        this.EZpvd = axy;
        this.copydefault = axy2;
    }
}
