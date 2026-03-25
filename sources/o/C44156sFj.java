package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sFj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44156sFj {
    public final android.net.Uri AEQbTJ;
    public final C44161sFo EZpvd;
    public final java.io.File OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44156sFj copy$default(C44156sFj c44156sFj, java.io.File file, android.net.Uri uri, C44161sFo c44161sFo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            file = c44156sFj.OLrzqt;
        }
        if ((i & 2) != 0) {
            uri = c44156sFj.AEQbTJ;
        }
        if ((i & 4) != 0) {
            c44161sFo = c44156sFj.EZpvd;
        }
        return c44156sFj.KWHzl(file, uri, c44161sFo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44156sFj KWHzl(@NotNull java.io.File file, @NotNull android.net.Uri uri, @NotNull C44161sFo c44161sFo) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(c44161sFo, "");
        return new C44156sFj(file, uri, c44161sFo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.net.Uri OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44156sFj)) {
            return false;
        }
        C44156sFj c44156sFj = (C44156sFj) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c44156sFj.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c44156sFj.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c44156sFj.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CachedFileInfo(cacheFile=" + this.OLrzqt + ", cacheFileUri=" + this.AEQbTJ + ", fileInfo=" + this.EZpvd + ")";
    }

    public C44156sFj(@NotNull java.io.File file, @NotNull android.net.Uri uri, @NotNull C44161sFo c44161sFo) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(c44161sFo, "");
        this.OLrzqt = file;
        this.AEQbTJ = uri;
        this.EZpvd = c44161sFo;
    }
}
