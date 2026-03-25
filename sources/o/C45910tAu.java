package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tAu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45910tAu {
    public static final int $stable = 8;
    public final java.util.List<java.lang.String> followedList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tAu */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C45910tAu copy$default(C45910tAu c45910tAu, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c45910tAu.followedList;
        }
        return c45910tAu.OLrzqt(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45910tAu OLrzqt(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C45910tAu(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C45910tAu) && Intrinsics.EZpvd(this.followedList, ((C45910tAu) obj).followedList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.followedList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PlanetFollowBatchRequest(followedList=" + this.followedList + ")";
    }

    public C45910tAu(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.followedList = list;
    }
}
