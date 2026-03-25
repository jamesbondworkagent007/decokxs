package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class zGY {
    public static final int $stable = 8;
    public AbstractC60238zyv copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ zGY copy$default(zGY zgy, AbstractC60238zyv abstractC60238zyv, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abstractC60238zyv = zgy.copydefault;
        }
        return zgy.OLrzqt(abstractC60238zyv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC60238zyv KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zGY OLrzqt(@NotNull AbstractC60238zyv abstractC60238zyv) {
        Intrinsics.checkNotNullParameter(abstractC60238zyv, "");
        return new zGY(abstractC60238zyv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zGY) && Intrinsics.EZpvd(this.copydefault, ((zGY) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MfaPasswordState(networkStatus=" + this.copydefault + ")";
    }

    public zGY(@NotNull AbstractC60238zyv abstractC60238zyv) {
        Intrinsics.checkNotNullParameter(abstractC60238zyv, "");
        this.copydefault = abstractC60238zyv;
    }
}
