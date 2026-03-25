package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class BnW {
    public static final int $stable = 8;
    public java.util.List<BoF> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.BnW */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BnW copy$default(BnW bnW, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = bnW.KWHzl;
        }
        return bnW.copydefault(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<BoF> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BnW copydefault(@NotNull java.util.List<BoF> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new BnW(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BnW) && Intrinsics.EZpvd(this.KWHzl, ((BnW) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LanguageListState(list=" + this.KWHzl + ")";
    }

    public BnW(@NotNull java.util.List<BoF> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
    }
}
