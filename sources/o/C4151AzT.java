package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AzT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C4151AzT {
    public static final int $stable = 8;
    public java.util.List<java.lang.String> KWHzl;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.AzT */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4151AzT copy$default(C4151AzT c4151AzT, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c4151AzT.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c4151AzT.copydefault;
        }
        return c4151AzT.copydefault(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4151AzT copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C4151AzT(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4151AzT)) {
            return false;
        }
        C4151AzT c4151AzT = (C4151AzT) obj;
        return Intrinsics.EZpvd(this.KWHzl, c4151AzT.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c4151AzT.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChainSlippageModel(slippageList=" + this.KWHzl + ", selectItem=" + this.copydefault + ")";
    }

    public C4151AzT(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = list;
        this.copydefault = str;
    }
}
