package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pLX {
    public static final int $stable = 8;

    @SerializedName("appInfo")
    private final pLG appInfo;

    @SerializedName("links")
    private final java.util.List<pLS> links;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pLX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ pLX copy$default(pLX plx, pLG plg, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            plg = plx.appInfo;
        }
        if ((i & 2) != 0) {
            list = plx.links;
        }
        return plx.AEQbTJ(plg, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pLX AEQbTJ(@NotNull pLG plg, @NotNull java.util.List<pLS> list) {
        Intrinsics.checkNotNullParameter(plg, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new pLX(plg, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pLX)) {
            return false;
        }
        pLX plx = (pLX) obj;
        return Intrinsics.EZpvd(this.appInfo, plx.appInfo) && Intrinsics.EZpvd(this.links, plx.links);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.appInfo.hashCode() * 31) + this.links.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LinksInfo(appInfo=" + this.appInfo + ", links=" + this.links + ")";
    }

    public pLX(@NotNull pLG plg, @NotNull java.util.List<pLS> list) {
        Intrinsics.checkNotNullParameter(plg, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.appInfo = plg;
        this.links = list;
    }
}
