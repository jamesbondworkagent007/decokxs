package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27364jtm {
    public final java.lang.String EZpvd;
    public final java.util.List<InterfaceC27436jvE> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jtm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C27364jtm copy$default(C27364jtm c27364jtm, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c27364jtm.EZpvd;
        }
        if ((i & 2) != 0) {
            list = c27364jtm.copydefault;
        }
        return c27364jtm.KWHzl(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC27436jvE> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27364jtm KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<? extends InterfaceC27436jvE> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C27364jtm(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27364jtm)) {
            return false;
        }
        C27364jtm c27364jtm = (C27364jtm) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c27364jtm.EZpvd) && Intrinsics.EZpvd(this.copydefault, c27364jtm.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiDashboard(totalAssets=" + this.EZpvd + ", protocols=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends o.jvE> */
    /* JADX WARN: Multi-variable type inference failed */
    public C27364jtm(@NotNull java.lang.String str, @NotNull java.util.List<? extends InterfaceC27436jvE> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = str;
        this.copydefault = list;
    }
}
