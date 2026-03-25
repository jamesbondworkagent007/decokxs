package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26741jhz implements InterfaceC27436jvE {
    public final java.util.List<C26693jhD> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jhz */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C26741jhz copy$default(C26741jhz c26741jhz, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c26741jhz.AEQbTJ;
        }
        return c26741jhz.KWHzl((java.util.List<C26693jhD>) list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C26693jhD> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26741jhz KWHzl(@NotNull java.util.List<C26693jhD> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C26741jhz(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26741jhz) && Intrinsics.EZpvd(this.AEQbTJ, ((C26741jhz) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiTransactionPointsInfo(pointsList=" + this.AEQbTJ + ")";
    }

    public C26741jhz(@NotNull java.util.List<C26693jhD> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
    }
}
