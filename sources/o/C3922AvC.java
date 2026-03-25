package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AvC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C3922AvC {
    public static final int $stable = 8;
    public java.util.List<C3809Asu> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.AvC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3922AvC copy$default(C3922AvC c3922AvC, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c3922AvC.OLrzqt;
        }
        return c3922AvC.copydefault(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C3809Asu> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3922AvC copydefault(@NotNull java.util.List<C3809Asu> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C3922AvC(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3922AvC) && Intrinsics.EZpvd(this.OLrzqt, ((C3922AvC) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SubmitOrderQuickConvertRequest(orders=" + this.OLrzqt + ")";
    }

    public C3922AvC(@NotNull java.util.List<C3809Asu> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
    }
}
