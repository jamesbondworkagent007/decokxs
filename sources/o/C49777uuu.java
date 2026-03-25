package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uuu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49777uuu {
    public final int AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C49777uuu copy$default(C49777uuu c49777uuu, java.lang.String str, java.lang.String str2, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c49777uuu.EZpvd;
        }
        if ((i2 & 2) != 0) {
            str2 = c49777uuu.KWHzl;
        }
        if ((i2 & 4) != 0) {
            z = c49777uuu.OLrzqt;
        }
        if ((i2 & 8) != 0) {
            i = c49777uuu.AEQbTJ;
        }
        return c49777uuu.AEQbTJ(str, str2, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C49777uuu AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C49777uuu(str, str2, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49777uuu)) {
            return false;
        }
        C49777uuu c49777uuu = (C49777uuu) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c49777uuu.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c49777uuu.KWHzl) && this.OLrzqt == c49777uuu.OLrzqt && this.AEQbTJ == c49777uuu.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ItemLeverageData(title=" + this.EZpvd + ", content=" + this.KWHzl + ", select=" + this.OLrzqt + ", currentIndex=" + this.AEQbTJ + ")";
    }

    public C49777uuu(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.KWHzl = str2;
        this.OLrzqt = z;
        this.AEQbTJ = i;
    }
}
