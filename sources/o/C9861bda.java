package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bda, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9861bda {
    public final java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C9861bda copy$default(C9861bda c9861bda, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c9861bda.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = c9861bda.OLrzqt;
        }
        if ((i & 4) != 0) {
            str2 = c9861bda.KWHzl;
        }
        return c9861bda.AEQbTJ(str, z, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9861bda AEQbTJ(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C9861bda(str, z, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9861bda)) {
            return false;
        }
        C9861bda c9861bda = (C9861bda) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c9861bda.AEQbTJ) && this.OLrzqt == c9861bda.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c9861bda.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MultiStatus(walletId=" + this.AEQbTJ + ", status=" + this.OLrzqt + ", msg=" + this.KWHzl + ")";
    }

    public C9861bda(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.OLrzqt = z;
        this.KWHzl = str2;
    }
}
