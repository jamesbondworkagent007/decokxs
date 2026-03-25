package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zGz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58562zGz {
    public static final int $stable = 8;
    public AbstractC60238zyv KWHzl;
    public C58954zVq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C58562zGz copy$default(C58562zGz c58562zGz, C58954zVq c58954zVq, AbstractC60238zyv abstractC60238zyv, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c58954zVq = c58562zGz.copydefault;
        }
        if ((i & 2) != 0) {
            abstractC60238zyv = c58562zGz.KWHzl;
        }
        return c58562zGz.copydefault(c58954zVq, abstractC60238zyv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58954zVq AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC60238zyv EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58562zGz copydefault(C58954zVq c58954zVq, @NotNull AbstractC60238zyv abstractC60238zyv) {
        Intrinsics.checkNotNullParameter(abstractC60238zyv, "");
        return new C58562zGz(c58954zVq, abstractC60238zyv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58562zGz)) {
            return false;
        }
        C58562zGz c58562zGz = (C58562zGz) obj;
        return Intrinsics.EZpvd(this.copydefault, c58562zGz.copydefault) && Intrinsics.EZpvd(this.KWHzl, c58562zGz.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        C58954zVq c58954zVq = this.copydefault;
        return ((c58954zVq == null ? 0 : c58954zVq.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MfaPasskeyState(assertionParam=" + this.copydefault + ", networkStatus=" + this.KWHzl + ")";
    }

    public C58562zGz(C58954zVq c58954zVq, @NotNull AbstractC60238zyv abstractC60238zyv) {
        Intrinsics.checkNotNullParameter(abstractC60238zyv, "");
        this.copydefault = c58954zVq;
        this.KWHzl = abstractC60238zyv;
    }
}
