package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class zJK {
    public static final int $stable = 8;
    public int KWHzl;
    public zJJ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ zJK copy$default(zJK zjk, int i, zJJ zjj, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = zjk.KWHzl;
        }
        if ((i2 & 2) != 0) {
            zjj = zjk.OLrzqt;
        }
        return zjk.copydefault(i, zjj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zJJ AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zJK copydefault(int i, @NotNull zJJ zjj) {
        Intrinsics.checkNotNullParameter(zjj, "");
        return new zJK(i, zjj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zJK)) {
            return false;
        }
        zJK zjk = (zJK) obj;
        return this.KWHzl == zjk.KWHzl && Intrinsics.EZpvd(this.OLrzqt, zjk.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.KWHzl) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NewDeviceAuthMethod(authType=" + this.KWHzl + ", kind=" + this.OLrzqt + ")";
    }

    public zJK(int i, @NotNull zJJ zjj) {
        Intrinsics.checkNotNullParameter(zjj, "");
        this.KWHzl = i;
        this.OLrzqt = zjj;
    }
}
