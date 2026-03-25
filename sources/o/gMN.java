package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gMN {
    public final int EZpvd;
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gMN */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ gMN copy$default(gMN gmn, int i, java.util.Map map, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = gmn.EZpvd;
        }
        if ((i2 & 2) != 0) {
            map = gmn.OLrzqt;
        }
        return gmn.copydefault(i, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final gMN copydefault(@androidx.annotation.StringRes int i, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new gMN(i, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gMN)) {
            return false;
        }
        gMN gmn = (gMN) obj;
        return this.EZpvd == gmn.EZpvd && Intrinsics.EZpvd(this.OLrzqt, gmn.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.EZpvd) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TitleConfig(resId=" + this.EZpvd + ", params=" + this.OLrzqt + ")";
    }

    public gMN(@androidx.annotation.StringRes int i, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd = i;
        this.OLrzqt = map;
    }
}
