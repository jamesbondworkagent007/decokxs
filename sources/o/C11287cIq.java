package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cIq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11287cIq {
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C11287cIq copy$default(C11287cIq c11287cIq, java.lang.String str, java.lang.String str2, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c11287cIq.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = c11287cIq.OLrzqt;
        }
        if ((i & 4) != 0) {
            j = c11287cIq.copydefault;
        }
        return c11287cIq.EZpvd(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11287cIq EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C11287cIq(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11287cIq)) {
            return false;
        }
        C11287cIq c11287cIq = (C11287cIq) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c11287cIq.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c11287cIq.OLrzqt) && this.copydefault == c11287cIq.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Long.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RemoveCustomChainBean(chainId=" + this.EZpvd + ", rpcUrl=" + this.OLrzqt + ", createAt=" + this.copydefault + ")";
    }

    public C11287cIq(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.copydefault = j;
    }
}
