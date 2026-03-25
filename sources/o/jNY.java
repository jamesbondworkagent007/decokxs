package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jNY {
    public final java.lang.String OLrzqt;
    public final float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ jNY copy$default(jNY jny, float f, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = jny.copydefault;
        }
        if ((i & 2) != 0) {
            str = jny.OLrzqt;
        }
        return jny.EZpvd(f, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jNY EZpvd(float f, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new jNY(f, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jNY)) {
            return false;
        }
        jNY jny = (jNY) obj;
        return java.lang.Float.compare(this.copydefault, jny.copydefault) == 0 && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) jny.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Float.hashCode(this.copydefault) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NativeTokenPrice(price=" + this.copydefault + ", symbol=" + this.OLrzqt + ")";
    }

    public jNY(float f, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = f;
        this.OLrzqt = str;
    }
}
