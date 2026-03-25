package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AIf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2346AIf {
    public static final int $stable = 8;
    public int EZpvd;
    public boolean KWHzl;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2346AIf copy$default(C2346AIf c2346AIf, boolean z, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = c2346AIf.KWHzl;
        }
        if ((i2 & 2) != 0) {
            i = c2346AIf.EZpvd;
        }
        if ((i2 & 4) != 0) {
            str = c2346AIf.copydefault;
        }
        return c2346AIf.EZpvd(z, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2346AIf EZpvd(boolean z, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C2346AIf(z, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2346AIf)) {
            return false;
        }
        C2346AIf c2346AIf = (C2346AIf) obj;
        return this.KWHzl == c2346AIf.KWHzl && this.EZpvd == c2346AIf.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c2346AIf.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.KWHzl) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ApiResult(isSuccess=" + this.KWHzl + ", code=" + this.EZpvd + ", message=" + this.copydefault + ")";
    }

    public C2346AIf(boolean z, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = z;
        this.EZpvd = i;
        this.copydefault = str;
    }
}
