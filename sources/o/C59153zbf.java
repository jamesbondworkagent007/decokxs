package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zbf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59153zbf<T> {
    public final T AEQbTJ;
    public final T AYXKKw;
    public final java.lang.String EZpvd;
    public final T KWHzl;
    public final C56929yXo OLrzqt;
    public final T copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59153zbf)) {
            return false;
        }
        C59153zbf c59153zbf = (C59153zbf) obj;
        return Intrinsics.EZpvd(this.copydefault, c59153zbf.copydefault) && Intrinsics.EZpvd(this.KWHzl, c59153zbf.KWHzl) && Intrinsics.EZpvd(this.AYXKKw, c59153zbf.AYXKKw) && Intrinsics.EZpvd(this.AEQbTJ, c59153zbf.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c59153zbf.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c59153zbf.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        T t = this.copydefault;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.KWHzl;
        int iHashCode2 = t2 == null ? 0 : t2.hashCode();
        T t3 = this.AYXKKw;
        int iHashCode3 = t3 == null ? 0 : t3.hashCode();
        T t4 = this.AEQbTJ;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (t4 != null ? t4.hashCode() : 0)) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.copydefault + ", compilerVersion=" + this.KWHzl + ", languageVersion=" + this.AYXKKw + ", expectedVersion=" + this.AEQbTJ + ", filePath=" + this.EZpvd + ", classId=" + this.OLrzqt + ')';
    }

    public C59153zbf(T t, T t2, T t3, T t4, @NotNull java.lang.String str, @NotNull C56929yXo c56929yXo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        this.copydefault = t;
        this.KWHzl = t2;
        this.AYXKKw = t3;
        this.AEQbTJ = t4;
        this.EZpvd = str;
        this.OLrzqt = c56929yXo;
    }
}
