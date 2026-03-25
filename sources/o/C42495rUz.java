package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rUz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C42495rUz {
    public final java.util.HashMap<java.lang.String, java.lang.String> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rUz */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C42495rUz copy$default(C42495rUz c42495rUz, java.util.HashMap map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = c42495rUz.OLrzqt;
        }
        return c42495rUz.KWHzl(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, java.lang.String> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C42495rUz KWHzl(@NotNull java.util.HashMap<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new C42495rUz(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C42495rUz) && Intrinsics.EZpvd(this.OLrzqt, ((C42495rUz) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SectionDataModel(sectionMap=" + this.OLrzqt + ")";
    }

    public C42495rUz(@NotNull java.util.HashMap<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.OLrzqt = map;
    }
}
