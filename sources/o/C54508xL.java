package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C54508xL {
    public final java.lang.String EZpvd;
    public final java.util.List<C54373xG> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C54508xL copy$default(C54508xL c54508xL, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c54508xL.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c54508xL.EZpvd;
        }
        return c54508xL.OLrzqt(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54508xL OLrzqt(@NotNull java.util.List<C54373xG> list, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C54508xL(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C54373xG> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54508xL)) {
            return false;
        }
        C54508xL c54508xL = (C54508xL) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c54508xL.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c54508xL.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.lang.String str = this.EZpvd;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Ec2QueryErrorResponse(errors=" + this.OLrzqt + ", requestId=" + this.EZpvd + ')';
    }

    public C54508xL(@NotNull java.util.List<C54373xG> list, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
        this.EZpvd = str;
    }
}
