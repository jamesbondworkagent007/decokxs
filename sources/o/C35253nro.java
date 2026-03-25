package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C35253nro {
    public final boolean EZpvd;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35253nro copy$default(C35253nro c35253nro, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c35253nro.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c35253nro.copydefault;
        }
        return c35253nro.KWHzl(z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35253nro KWHzl(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C35253nro(z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35253nro)) {
            return false;
        }
        C35253nro c35253nro = (C35253nro) obj;
        return this.EZpvd == c35253nro.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c35253nro.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.EZpvd) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UnreadCount(hasUnreadMessages=" + this.EZpvd + ", displayText=" + this.copydefault + ")";
    }

    public C35253nro(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = z;
        this.copydefault = str;
    }
}
