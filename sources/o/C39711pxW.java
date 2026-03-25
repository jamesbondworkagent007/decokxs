package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pxW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39711pxW {
    public final float EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C39711pxW copy$default(C39711pxW c39711pxW, java.lang.String str, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c39711pxW.KWHzl;
        }
        if ((i & 2) != 0) {
            f = c39711pxW.EZpvd;
        }
        return c39711pxW.AEQbTJ(str, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39711pxW AEQbTJ(@NotNull java.lang.String str, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C39711pxW(str, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39711pxW)) {
            return false;
        }
        C39711pxW c39711pxW = (C39711pxW) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c39711pxW.KWHzl) && java.lang.Float.compare(this.EZpvd, c39711pxW.EZpvd) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + java.lang.Float.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LockProgressTokeInfo(amount=" + this.KWHzl + ", percent=" + this.EZpvd + ")";
    }

    public C39711pxW(@NotNull java.lang.String str, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.EZpvd = f;
    }
}
