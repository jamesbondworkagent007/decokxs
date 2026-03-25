package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yPD implements InterfaceC56724yPz {
    public final java.util.Set<yPA> AEQbTJ;
    public final java.util.List<yPA> EZpvd;
    public final java.util.Set<yPA> KWHzl;
    public final java.util.List<yPA> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56724yPz
    public java.util.List<yPA> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56724yPz
    public java.util.List<yPA> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56724yPz
    public java.util.Set<yPA> copydefault() {
        return this.AEQbTJ;
    }

    public yPD(@NotNull java.util.List<yPA> list, @NotNull java.util.Set<yPA> set, @NotNull java.util.List<yPA> list2, @NotNull java.util.Set<yPA> set2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(set2, "");
        this.EZpvd = list;
        this.AEQbTJ = set;
        this.copydefault = list2;
        this.KWHzl = set2;
    }
}
