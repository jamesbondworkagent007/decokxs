package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OutputStream {
    public final java.lang.String AEQbTJ;
    public final Regex EZpvd;
    public final PushbackInputStream KWHzl;
    public final java.util.Map<java.lang.String, PushbackInputStream> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.OutputStream */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OutputStream copy$default(OutputStream outputStream, java.lang.String str, java.util.Map map, Regex regex, PushbackInputStream pushbackInputStream, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = outputStream.AEQbTJ;
        }
        if ((i & 2) != 0) {
            map = outputStream.OLrzqt;
        }
        if ((i & 4) != 0) {
            regex = outputStream.EZpvd;
        }
        if ((i & 8) != 0) {
            pushbackInputStream = outputStream.KWHzl;
        }
        return outputStream.AEQbTJ(str, map, regex, pushbackInputStream);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OutputStream AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, PushbackInputStream> map, @NotNull Regex regex, @NotNull PushbackInputStream pushbackInputStream) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(regex, "");
        Intrinsics.checkNotNullParameter(pushbackInputStream, "");
        return new OutputStream(str, map, regex, pushbackInputStream);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PushbackInputStream AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Regex EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, PushbackInputStream> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OutputStream)) {
            return false;
        }
        OutputStream outputStream = (OutputStream) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) outputStream.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, outputStream.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, outputStream.EZpvd) && Intrinsics.EZpvd(this.KWHzl, outputStream.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Partition(id=" + this.AEQbTJ + ", regions=" + this.OLrzqt + ", regionRegex=" + this.EZpvd + ", baseConfig=" + this.KWHzl + ')';
    }

    public OutputStream(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, PushbackInputStream> map, @NotNull Regex regex, @NotNull PushbackInputStream pushbackInputStream) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(regex, "");
        Intrinsics.checkNotNullParameter(pushbackInputStream, "");
        this.AEQbTJ = str;
        this.OLrzqt = map;
        this.EZpvd = regex;
        this.KWHzl = pushbackInputStream;
    }
}
