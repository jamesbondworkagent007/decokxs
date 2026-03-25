package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35244nrf {
    public final java.util.List<java.lang.String> EZpvd;
    public final java.lang.Class<? extends sJU<?>> KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nrf */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C35244nrf copy$default(C35244nrf c35244nrf, java.lang.String str, java.util.List list, java.lang.Class cls, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c35244nrf.OLrzqt;
        }
        if ((i & 2) != 0) {
            list = c35244nrf.EZpvd;
        }
        if ((i & 4) != 0) {
            cls = c35244nrf.KWHzl;
        }
        return c35244nrf.copydefault(str, list, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Class<? extends sJU<?>> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35244nrf copydefault(@NotNull java.lang.String str, java.util.List<java.lang.String> list, @NotNull java.lang.Class<? extends sJU<?>> cls) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        return new C35244nrf(str, list, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35244nrf)) {
            return false;
        }
        C35244nrf c35244nrf = (C35244nrf) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c35244nrf.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c35244nrf.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c35244nrf.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.util.List<java.lang.String> list = this.EZpvd;
        return (((iHashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OKMessageConverterData(serviceName=" + this.OLrzqt + ", bizNames=" + this.EZpvd + ", converter=" + this.KWHzl + ")";
    }

    public C35244nrf(@NotNull java.lang.String str, java.util.List<java.lang.String> list, @NotNull java.lang.Class<? extends sJU<?>> cls) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        this.OLrzqt = str;
        this.EZpvd = list;
        this.KWHzl = cls;
    }
}
