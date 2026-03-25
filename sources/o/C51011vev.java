package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51011vev {
    public static final int $stable = 0;
    public final java.lang.String stgyName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C51011vev copy$default(C51011vev c51011vev, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c51011vev.stgyName;
        }
        return c51011vev.copydefault(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C51011vev copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C51011vev(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C51011vev) && Intrinsics.EZpvd((java.lang.Object) this.stgyName, (java.lang.Object) ((C51011vev) obj).stgyName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.stgyName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AuditStrategyNameReq(stgyName=" + this.stgyName + ")";
    }

    public C51011vev(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stgyName = str;
    }
}
