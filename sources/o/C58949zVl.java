package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zVl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C58949zVl {
    public static final int $stable = 8;
    public java.util.List<java.lang.String> OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zVl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C58949zVl copy$default(C58949zVl c58949zVl, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c58949zVl.copydefault;
        }
        if ((i & 2) != 0) {
            list = c58949zVl.OLrzqt;
        }
        return c58949zVl.copydefault(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58949zVl copydefault(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C58949zVl(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58949zVl)) {
            return false;
        }
        C58949zVl c58949zVl = (C58949zVl) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c58949zVl.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c58949zVl.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PasskeyAllowCredential(id=" + this.copydefault + ", transports=" + this.OLrzqt + ")";
    }

    public C58949zVl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = str;
        this.OLrzqt = list;
    }
}
