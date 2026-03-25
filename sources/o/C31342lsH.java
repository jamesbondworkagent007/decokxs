package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31342lsH {
    public final java.util.List<C31341lsG> KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lsH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C31342lsH copy$default(C31342lsH c31342lsH, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c31342lsH.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c31342lsH.OLrzqt;
        }
        if ((i & 4) != 0) {
            list = c31342lsH.KWHzl;
        }
        return c31342lsH.KWHzl(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31342lsH KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C31341lsG> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C31342lsH(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31342lsH)) {
            return false;
        }
        C31342lsH c31342lsH = (C31342lsH) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c31342lsH.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c31342lsH.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c31342lsH.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PendingClaimData(nextCursor=" + this.copydefault + ", total=" + this.OLrzqt + ", orderList=" + this.KWHzl + ")";
    }

    public C31342lsH(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C31341lsG> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = str;
        this.OLrzqt = str2;
        this.KWHzl = list;
    }
}
