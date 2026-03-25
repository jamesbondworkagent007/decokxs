package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ANY {
    public static final int $stable = 8;
    public AbstractC2499AOc AEQbTJ;
    public java.lang.String EZpvd;
    public ANX KWHzl;
    public java.lang.String OLrzqt;
    public APL copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ANY copy$default(ANY any, APL apl, AbstractC2499AOc abstractC2499AOc, ANX anx, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            apl = any.copydefault;
        }
        if ((i & 2) != 0) {
            abstractC2499AOc = any.AEQbTJ;
        }
        AbstractC2499AOc abstractC2499AOc2 = abstractC2499AOc;
        if ((i & 4) != 0) {
            anx = any.KWHzl;
        }
        ANX anx2 = anx;
        if ((i & 8) != 0) {
            str = any.EZpvd;
        }
        java.lang.String str3 = str;
        if ((i & 16) != 0) {
            str2 = any.OLrzqt;
        }
        return any.OLrzqt(apl, abstractC2499AOc2, anx2, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final APL EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ANX OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ANY OLrzqt(@NotNull APL apl, AbstractC2499AOc abstractC2499AOc, ANX anx, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(apl, "");
        return new ANY(apl, abstractC2499AOc, anx, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC2499AOc copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ANY)) {
            return false;
        }
        ANY any = (ANY) obj;
        return Intrinsics.EZpvd(this.copydefault, any.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, any.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, any.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) any.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) any.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        AbstractC2499AOc abstractC2499AOc = this.AEQbTJ;
        int iHashCode2 = abstractC2499AOc == null ? 0 : abstractC2499AOc.hashCode();
        ANX anx = this.KWHzl;
        int iHashCode3 = anx == null ? 0 : anx.hashCode();
        java.lang.String str = this.EZpvd;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ImageShareParams(common=" + this.copydefault + ", previewImageSource=" + this.AEQbTJ + ", imageFooterConfig=" + this.KWHzl + ", pendingShareImagePath=" + this.EZpvd + ", pendingShareBitmapKey=" + this.OLrzqt + ")";
    }

    public ANY(@NotNull APL apl, AbstractC2499AOc abstractC2499AOc, ANX anx, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(apl, "");
        this.copydefault = apl;
        this.AEQbTJ = abstractC2499AOc;
        this.KWHzl = anx;
        this.EZpvd = str;
        this.OLrzqt = str2;
    }
}
