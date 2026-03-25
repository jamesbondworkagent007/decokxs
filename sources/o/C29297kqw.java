package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kqw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29297kqw {
    public final java.util.List<C29295kqu> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kqw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C29297kqw copy$default(C29297kqw c29297kqw, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c29297kqw.EZpvd;
        }
        return c29297kqw.copydefault(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C29295kqu> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29297kqw copydefault(@NotNull java.util.List<C29295kqu> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C29297kqw(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29297kqw) && Intrinsics.EZpvd(this.EZpvd, ((C29297kqw) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SignalGemsUiData(gems=" + this.EZpvd + ")";
    }

    public C29297kqw(@NotNull java.util.List<C29295kqu> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
    }
}
