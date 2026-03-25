package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jIa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25833jIa {
    public final float AEQbTJ;
    public final java.lang.String EZpvd;
    public final float KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25833jIa copy$default(C25833jIa c25833jIa, java.lang.String str, float f, float f2, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c25833jIa.OLrzqt;
        }
        if ((i & 2) != 0) {
            f = c25833jIa.KWHzl;
        }
        if ((i & 4) != 0) {
            f2 = c25833jIa.AEQbTJ;
        }
        if ((i & 8) != 0) {
            str2 = c25833jIa.EZpvd;
        }
        return c25833jIa.OLrzqt(str, f, f2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25833jIa OLrzqt(@NotNull java.lang.String str, float f, float f2, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C25833jIa(str, f, f2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25833jIa)) {
            return false;
        }
        C25833jIa c25833jIa = (C25833jIa) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c25833jIa.OLrzqt) && java.lang.Float.compare(this.KWHzl, c25833jIa.KWHzl) == 0 && java.lang.Float.compare(this.AEQbTJ, c25833jIa.AEQbTJ) == 0 && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c25833jIa.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.OLrzqt.hashCode() * 31) + java.lang.Float.hashCode(this.KWHzl)) * 31) + java.lang.Float.hashCode(this.AEQbTJ)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Point(time=" + this.OLrzqt + ", value=" + this.KWHzl + ", x=" + this.AEQbTJ + ", displayValue=" + this.EZpvd + ")";
    }

    public C25833jIa(@NotNull java.lang.String str, float f, float f2, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.KWHzl = f;
        this.AEQbTJ = f2;
        this.EZpvd = str2;
    }
}
