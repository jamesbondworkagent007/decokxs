package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AhV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C3201AhV {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public java.lang.String KWHzl;
    public java.util.List<java.lang.Long> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.AhV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3201AhV copy$default(C3201AhV c3201AhV, java.util.List list, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c3201AhV.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = c3201AhV.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str = c3201AhV.KWHzl;
        }
        return c3201AhV.KWHzl(list, z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Long> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3201AhV KWHzl(@NotNull java.util.List<java.lang.Long> list, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C3201AhV(list, z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3201AhV)) {
            return false;
        }
        C3201AhV c3201AhV = (C3201AhV) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c3201AhV.OLrzqt) && this.AEQbTJ == c3201AhV.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c3201AhV.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.AEQbTJ);
        java.lang.String str = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UploadIdState(fileIds=" + this.OLrzqt + ", isSubmitting=" + this.AEQbTJ + ", reminderContent=" + this.KWHzl + ")";
    }

    public C3201AhV(@NotNull java.util.List<java.lang.Long> list, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
        this.AEQbTJ = z;
        this.KWHzl = str;
    }
}
