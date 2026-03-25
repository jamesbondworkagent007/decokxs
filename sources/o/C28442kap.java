package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28442kap {
    public final long KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C28442kap copy$default(C28442kap c28442kap, long j, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c28442kap.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c28442kap.copydefault;
        }
        return c28442kap.OLrzqt(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28442kap OLrzqt(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C28442kap(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28442kap)) {
            return false;
        }
        C28442kap c28442kap = (C28442kap) obj;
        return this.KWHzl == c28442kap.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c28442kap.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Long.hashCode(this.KWHzl) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BlacklistToken(chainId=" + this.KWHzl + ", tokenAddress=" + this.copydefault + ")";
    }

    public C28442kap(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = j;
        this.copydefault = str;
    }
}
