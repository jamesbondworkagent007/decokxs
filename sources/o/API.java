package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class API {
    public static final int $stable = 8;
    public java.util.Map<java.lang.String, C2485ANo> AEQbTJ;
    public java.util.Map<java.lang.String, C2485ANo> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.API */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ API copy$default(API api2, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = api2.AEQbTJ;
        }
        if ((i & 2) != 0) {
            map2 = api2.copydefault;
        }
        return api2.copydefault(map, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, C2485ANo> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, C2485ANo> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final API copydefault(@NotNull java.util.Map<java.lang.String, C2485ANo> map, @NotNull java.util.Map<java.lang.String, C2485ANo> map2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        return new API(map, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof API)) {
            return false;
        }
        API api2 = (API) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, api2.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, api2.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ShareComponentConfig(iosComponents=" + this.AEQbTJ + ", androidComponents=" + this.copydefault + ")";
    }

    public API(@NotNull java.util.Map<java.lang.String, C2485ANo> map, @NotNull java.util.Map<java.lang.String, C2485ANo> map2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        this.AEQbTJ = map;
        this.copydefault = map2;
    }
}
