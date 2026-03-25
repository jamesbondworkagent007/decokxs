package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qOz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40252qOz {
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> EZpvd;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qOz */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C40252qOz copy$default(C40252qOz c40252qOz, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c40252qOz.copydefault;
        }
        if ((i & 2) != 0) {
            map = c40252qOz.EZpvd;
        }
        return c40252qOz.EZpvd(str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40252qOz EZpvd(@NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C40252qOz(str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40252qOz)) {
            return false;
        }
        C40252qOz c40252qOz = (C40252qOz) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c40252qOz.copydefault) && Intrinsics.EZpvd(this.EZpvd, c40252qOz.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.EZpvd;
        return (iHashCode * 31) + (map == null ? 0 : map.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetNavSearchBizModeSubPagesPayload(fromPage=" + this.copydefault + ", configMap=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C40252qOz(@NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.EZpvd = map;
    }
}
