package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sFo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44161sFo {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44161sFo copy$default(C44161sFo c44161sFo, java.lang.String str, long j, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c44161sFo.AEQbTJ;
        }
        if ((i & 2) != 0) {
            j = c44161sFo.copydefault;
        }
        if ((i & 4) != 0) {
            str2 = c44161sFo.EZpvd;
        }
        return c44161sFo.EZpvd(str, j, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44161sFo EZpvd(@NotNull java.lang.String str, long j, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C44161sFo(str, j, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44161sFo)) {
            return false;
        }
        C44161sFo c44161sFo = (C44161sFo) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c44161sFo.AEQbTJ) && this.copydefault == c44161sFo.copydefault && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c44161sFo.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = java.lang.Long.hashCode(this.copydefault);
        java.lang.String str = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FileInfo(name=" + this.AEQbTJ + ", size=" + this.copydefault + ", mimeType=" + this.EZpvd + ")";
    }

    public C44161sFo(@NotNull java.lang.String str, long j, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.copydefault = j;
        this.EZpvd = str2;
    }
}
