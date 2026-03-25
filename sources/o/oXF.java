package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oXF<T> {
    public final android.graphics.Path EZpvd;
    public final android.graphics.Path KWHzl;
    public final android.graphics.Path OLrzqt;
    public final java.util.Map<java.lang.Integer, oXL<T>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oXF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ oXF copy$default(oXF oxf, android.graphics.Path path, android.graphics.Path path2, android.graphics.Path path3, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            path = oxf.EZpvd;
        }
        if ((i & 2) != 0) {
            path2 = oxf.OLrzqt;
        }
        if ((i & 4) != 0) {
            path3 = oxf.KWHzl;
        }
        if ((i & 8) != 0) {
            map = oxf.copydefault;
        }
        return oxf.copydefault(path, path2, path3, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Path AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.Integer, oXL<T>> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Path OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Path copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oXF<T> copydefault(@NotNull android.graphics.Path path, @NotNull android.graphics.Path path2, @NotNull android.graphics.Path path3, @NotNull java.util.Map<java.lang.Integer, oXL<T>> map) {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(path2, "");
        Intrinsics.checkNotNullParameter(path3, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new oXF<>(path, path2, path3, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oXF)) {
            return false;
        }
        oXF oxf = (oXF) obj;
        return Intrinsics.EZpvd(this.EZpvd, oxf.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, oxf.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, oxf.KWHzl) && Intrinsics.EZpvd(this.copydefault, oxf.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ConvertResult(linePath=" + this.EZpvd + ", filledUpPath=" + this.OLrzqt + ", filledDownPath=" + this.KWHzl + ", dataMap=" + this.copydefault + ")";
    }

    public oXF(@NotNull android.graphics.Path path, @NotNull android.graphics.Path path2, @NotNull android.graphics.Path path3, @NotNull java.util.Map<java.lang.Integer, oXL<T>> map) {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(path2, "");
        Intrinsics.checkNotNullParameter(path3, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd = path;
        this.OLrzqt = path2;
        this.KWHzl = path3;
        this.copydefault = map;
    }
}
