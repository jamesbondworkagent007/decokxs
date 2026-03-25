package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pLu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38088pLu {
    public final java.lang.String AEQbTJ;
    public final DeeplinkMode EZpvd;
    public final java.util.Map<java.lang.String, java.lang.Object> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pLu */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C38088pLu copy$default(C38088pLu c38088pLu, java.lang.String str, DeeplinkMode deeplinkMode, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c38088pLu.AEQbTJ;
        }
        if ((i & 2) != 0) {
            deeplinkMode = c38088pLu.EZpvd;
        }
        if ((i & 4) != 0) {
            map = c38088pLu.copydefault;
        }
        return c38088pLu.AEQbTJ(str, deeplinkMode, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeeplinkMode AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38088pLu AEQbTJ(@NotNull java.lang.String str, @NotNull DeeplinkMode deeplinkMode, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deeplinkMode, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new C38088pLu(str, deeplinkMode, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.Object> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38088pLu)) {
            return false;
        }
        C38088pLu c38088pLu = (C38088pLu) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c38088pLu.AEQbTJ) && this.EZpvd == c38088pLu.EZpvd && Intrinsics.EZpvd(this.copydefault, c38088pLu.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DeeplinkParsedInfo(path=" + this.AEQbTJ + ", mode=" + this.EZpvd + ", params=" + this.copydefault + ")";
    }

    public C38088pLu(@NotNull java.lang.String str, @NotNull DeeplinkMode deeplinkMode, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deeplinkMode, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.AEQbTJ = str;
        this.EZpvd = deeplinkMode;
        this.copydefault = map;
    }
}
