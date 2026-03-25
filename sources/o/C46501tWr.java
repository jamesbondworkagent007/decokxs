package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tWr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46501tWr {
    public final java.lang.String AEQbTJ;
    public final float EZpvd;
    public final int KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46501tWr copy$default(C46501tWr c46501tWr, float f, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            f = c46501tWr.EZpvd;
        }
        if ((i2 & 2) != 0) {
            str = c46501tWr.OLrzqt;
        }
        if ((i2 & 4) != 0) {
            str2 = c46501tWr.AEQbTJ;
        }
        if ((i2 & 8) != 0) {
            i = c46501tWr.KWHzl;
        }
        return c46501tWr.copydefault(f, str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46501tWr copydefault(float f, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C46501tWr(f, str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46501tWr)) {
            return false;
        }
        C46501tWr c46501tWr = (C46501tWr) obj;
        return java.lang.Float.compare(this.EZpvd, c46501tWr.EZpvd) == 0 && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c46501tWr.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c46501tWr.AEQbTJ) && this.KWHzl == c46501tWr.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.EZpvd) * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SegmentData(angle=" + this.EZpvd + ", label=" + this.OLrzqt + ", ratioStr=" + this.AEQbTJ + ", color=" + this.KWHzl + ")";
    }

    public C46501tWr(float f, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = f;
        this.OLrzqt = str;
        this.AEQbTJ = str2;
        this.KWHzl = i;
    }
}
