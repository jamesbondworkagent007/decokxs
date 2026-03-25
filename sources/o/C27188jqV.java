package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27188jqV {
    public final java.util.List<java.lang.String> EZpvd;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jqV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C27188jqV copy$default(C27188jqV c27188jqV, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c27188jqV.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c27188jqV.copydefault;
        }
        return c27188jqV.KWHzl(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27188jqV KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C27188jqV(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27188jqV)) {
            return false;
        }
        C27188jqV c27188jqV = (C27188jqV) obj;
        return Intrinsics.EZpvd(this.EZpvd, c27188jqV.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c27188jqV.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestSymbolGroupEntry(logos=" + this.EZpvd + ", label=" + this.copydefault + ")";
    }

    public C27188jqV(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = list;
        this.copydefault = str;
    }
}
