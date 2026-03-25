package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rCi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41992rCi {
    public final java.util.HashMap<java.lang.String, java.lang.String> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rCi */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41992rCi copy$default(C41992rCi c41992rCi, java.util.HashMap map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = c41992rCi.EZpvd;
        }
        return c41992rCi.KWHzl(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, java.lang.String> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41992rCi KWHzl(@NotNull java.util.HashMap<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new C41992rCi(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41992rCi) && Intrinsics.EZpvd(this.EZpvd, ((C41992rCi) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SectionDataModel(sectionMap=" + this.EZpvd + ")";
    }

    public C41992rCi(@NotNull java.util.HashMap<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd = map;
    }
}
