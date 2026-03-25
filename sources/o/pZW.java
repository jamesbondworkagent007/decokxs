package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pZW {
    public final java.util.List<pZT> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pZW */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ pZW copy$default(pZW pzw, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = pzw.KWHzl;
        }
        return pzw.OLrzqt(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<pZT> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pZW OLrzqt(@NotNull java.util.List<pZT> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new pZW(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pZW) && Intrinsics.EZpvd(this.KWHzl, ((pZW) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CedefiBoostVo(boostActivity=" + this.KWHzl + ")";
    }

    public pZW(@NotNull java.util.List<pZT> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
    }
}
