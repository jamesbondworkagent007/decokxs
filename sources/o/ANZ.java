package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.growth.ImagePreviewType;
import uniffi.growth.SharePreviewMode;
import uniffi.growth.ShareType;

/* JADX INFO: loaded from: classes13.dex */
public final class ANZ {
    public static final int $stable = 8;
    public ImagePreviewType AEQbTJ;
    public C2564AQp EZpvd;
    public boolean KWHzl;
    public APH OLrzqt;
    public SharePreviewMode copydefault;
    public ShareType valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ANZ copy$default(ANZ anz, C2564AQp c2564AQp, ShareType shareType, SharePreviewMode sharePreviewMode, ImagePreviewType imagePreviewType, boolean z, APH aph, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c2564AQp = anz.EZpvd;
        }
        if ((i & 2) != 0) {
            shareType = anz.valueOf;
        }
        ShareType shareType2 = shareType;
        if ((i & 4) != 0) {
            sharePreviewMode = anz.copydefault;
        }
        SharePreviewMode sharePreviewMode2 = sharePreviewMode;
        if ((i & 8) != 0) {
            imagePreviewType = anz.AEQbTJ;
        }
        ImagePreviewType imagePreviewType2 = imagePreviewType;
        if ((i & 16) != 0) {
            z = anz.KWHzl;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            aph = anz.OLrzqt;
        }
        return anz.AEQbTJ(c2564AQp, shareType2, sharePreviewMode2, imagePreviewType2, z2, aph);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ANZ AEQbTJ(@NotNull C2564AQp c2564AQp, @NotNull ShareType shareType, @NotNull SharePreviewMode sharePreviewMode, @NotNull ImagePreviewType imagePreviewType, boolean z, APH aph) {
        Intrinsics.checkNotNullParameter(c2564AQp, "");
        Intrinsics.checkNotNullParameter(shareType, "");
        Intrinsics.checkNotNullParameter(sharePreviewMode, "");
        Intrinsics.checkNotNullParameter(imagePreviewType, "");
        return new ANZ(c2564AQp, shareType, sharePreviewMode, imagePreviewType, z, aph);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImagePreviewType AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final APH EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2564AQp KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareType OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharePreviewMode copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ANZ)) {
            return false;
        }
        ANZ anz = (ANZ) obj;
        return Intrinsics.EZpvd(this.EZpvd, anz.EZpvd) && this.valueOf == anz.valueOf && this.copydefault == anz.copydefault && this.AEQbTJ == anz.AEQbTJ && this.KWHzl == anz.KWHzl && Intrinsics.EZpvd(this.OLrzqt, anz.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.valueOf.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        int iHashCode4 = this.AEQbTJ.hashCode();
        int iHashCode5 = java.lang.Boolean.hashCode(this.KWHzl);
        APH aph = this.OLrzqt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (aph == null ? 0 : aph.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ImageDefaultPreviewConfig(common=" + this.EZpvd + ", shareType=" + this.valueOf + ", sharePreviewMode=" + this.copydefault + ", imagePreviewType=" + this.AEQbTJ + ", isShowing=" + this.KWHzl + ", imagePreviewPadding=" + this.OLrzqt + ")";
    }

    public ANZ(@NotNull C2564AQp c2564AQp, @NotNull ShareType shareType, @NotNull SharePreviewMode sharePreviewMode, @NotNull ImagePreviewType imagePreviewType, boolean z, APH aph) {
        Intrinsics.checkNotNullParameter(c2564AQp, "");
        Intrinsics.checkNotNullParameter(shareType, "");
        Intrinsics.checkNotNullParameter(sharePreviewMode, "");
        Intrinsics.checkNotNullParameter(imagePreviewType, "");
        this.EZpvd = c2564AQp;
        this.valueOf = shareType;
        this.copydefault = sharePreviewMode;
        this.AEQbTJ = imagePreviewType;
        this.KWHzl = z;
        this.OLrzqt = aph;
    }
}
