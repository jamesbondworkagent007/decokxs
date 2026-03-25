package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kwR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29584kwR {
    public final java.util.List<C29582kwP> AEQbTJ;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kwR */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C29584kwR copy$default(C29584kwR c29584kwR, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c29584kwR.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c29584kwR.KWHzl;
        }
        return c29584kwR.KWHzl(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C29582kwP> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29584kwR KWHzl(@NotNull java.util.List<C29582kwP> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C29584kwR(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29584kwR)) {
            return false;
        }
        C29584kwR c29584kwR = (C29584kwR) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c29584kwR.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c29584kwR.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SignalAlertHistoryUiModel(signals=" + this.AEQbTJ + ", maxIncreasePercentage=" + this.KWHzl + ")";
    }

    public C29584kwR(@NotNull java.util.List<C29582kwP> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = list;
        this.KWHzl = str;
    }
}
