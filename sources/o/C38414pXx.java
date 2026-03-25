package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pXx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C38414pXx {
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Object copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C38414pXx copy$default(C38414pXx c38414pXx, java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = c38414pXx.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = c38414pXx.KWHzl;
        }
        if ((i & 4) != 0) {
            obj = c38414pXx.copydefault;
        }
        return c38414pXx.copydefault(str, str2, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38414pXx copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C38414pXx(str, str2, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38414pXx)) {
            return false;
        }
        C38414pXx c38414pXx = (C38414pXx) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c38414pXx.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c38414pXx.KWHzl) && Intrinsics.EZpvd(this.copydefault, c38414pXx.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        java.lang.Object obj = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PageHubItem(id=" + this.EZpvd + ", buttonText=" + this.KWHzl + ", data=" + this.copydefault + ")";
    }

    public C38414pXx(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.KWHzl = str2;
        this.copydefault = obj;
    }
}
