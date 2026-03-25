package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AYc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2758AYc {
    public static final int $stable = 8;
    public java.util.List<AXZ> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.AYc */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2758AYc copy$default(C2758AYc c2758AYc, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c2758AYc.copydefault;
        }
        return c2758AYc.AEQbTJ(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2758AYc AEQbTJ(@NotNull java.util.List<AXZ> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C2758AYc(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AXZ> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2758AYc) && Intrinsics.EZpvd(this.copydefault, ((C2758AYc) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AppLanguageList(items=" + this.copydefault + ")";
    }

    public C2758AYc(@NotNull java.util.List<AXZ> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }
}
