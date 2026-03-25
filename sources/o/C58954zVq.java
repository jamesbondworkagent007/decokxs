package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zVq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C58954zVq {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.util.List<C58949zVl> EZpvd;
    public java.lang.String OLrzqt;
    public java.util.List<C58947zVj> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zVq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C58954zVq copy$default(C58954zVq c58954zVq, java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c58954zVq.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c58954zVq.OLrzqt;
        }
        if ((i & 4) != 0) {
            list = c58954zVq.EZpvd;
        }
        if ((i & 8) != 0) {
            list2 = c58954zVq.copydefault;
        }
        return c58954zVq.EZpvd(str, str2, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C58947zVj> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58954zVq EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C58949zVl> list, @NotNull java.util.List<C58947zVj> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C58954zVq(str, str2, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C58949zVl> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58954zVq)) {
            return false;
        }
        C58954zVq c58954zVq = (C58954zVq) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c58954zVq.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c58954zVq.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c58954zVq.EZpvd) && Intrinsics.EZpvd(this.copydefault, c58954zVq.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PasskeyAssertionParam(domain=" + this.AEQbTJ + ", challenge=" + this.OLrzqt + ", allowCredentials=" + this.EZpvd + ", additionalData=" + this.copydefault + ")";
    }

    public C58954zVq(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C58949zVl> list, @NotNull java.util.List<C58947zVj> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.EZpvd = list;
        this.copydefault = list2;
    }
}
