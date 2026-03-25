package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class AZO {
    public static final int $stable = 8;
    public AZL AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AZO copy$default(AZO azo, java.lang.String str, java.lang.String str2, java.lang.String str3, AZL azl, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = azo.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = azo.EZpvd;
        }
        if ((i & 4) != 0) {
            str3 = azo.KWHzl;
        }
        if ((i & 8) != 0) {
            azl = azo.AEQbTJ;
        }
        return azo.OLrzqt(str, str2, str3, azl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AZL KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AZO OLrzqt(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull AZL azl) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(azl, "");
        return new AZO(str, str2, str3, azl);
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
        if (!(obj instanceof AZO)) {
            return false;
        }
        AZO azo = (AZO) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) azo.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) azo.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) azo.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, azo.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.lang.String str = this.EZpvd;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MultipartPart(name=" + this.OLrzqt + ", filename=" + this.EZpvd + ", contentType=" + this.KWHzl + ", data=" + this.AEQbTJ + ")";
    }

    public AZO(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull AZL azl) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(azl, "");
        this.OLrzqt = str;
        this.EZpvd = str2;
        this.KWHzl = str3;
        this.AEQbTJ = azl;
    }
}
