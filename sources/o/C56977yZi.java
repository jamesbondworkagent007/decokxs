package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yZi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56977yZi {
    public final int EZpvd;
    public final C56929yXo OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56929yXo KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56929yXo copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56977yZi)) {
            return false;
        }
        C56977yZi c56977yZi = (C56977yZi) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c56977yZi.OLrzqt) && this.EZpvd == c56977yZi.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + java.lang.Integer.hashCode(this.EZpvd);
    }

    public C56977yZi(@NotNull C56929yXo c56929yXo, int i) {
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        this.OLrzqt = c56929yXo;
        this.EZpvd = i;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = this.EZpvd;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.OLrzqt);
        int i3 = this.EZpvd;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
