package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.growth.SharePreviewMode;
import uniffi.growth.ShareType;

/* JADX INFO: renamed from: o.AOe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C2501AOe {
    public static final int $stable = 8;
    public SharePreviewMode AEQbTJ;
    public ShareType EZpvd;
    public C2564AQp KWHzl;
    public AbstractC2499AOc OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2501AOe copy$default(C2501AOe c2501AOe, C2564AQp c2564AQp, ShareType shareType, SharePreviewMode sharePreviewMode, java.lang.String str, AbstractC2499AOc abstractC2499AOc, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c2564AQp = c2501AOe.KWHzl;
        }
        if ((i & 2) != 0) {
            shareType = c2501AOe.EZpvd;
        }
        ShareType shareType2 = shareType;
        if ((i & 4) != 0) {
            sharePreviewMode = c2501AOe.AEQbTJ;
        }
        SharePreviewMode sharePreviewMode2 = sharePreviewMode;
        if ((i & 8) != 0) {
            str = c2501AOe.copydefault;
        }
        java.lang.String str2 = str;
        if ((i & 16) != 0) {
            abstractC2499AOc = c2501AOe.OLrzqt;
        }
        return c2501AOe.AEQbTJ(c2564AQp, shareType2, sharePreviewMode2, str2, abstractC2499AOc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2501AOe AEQbTJ(@NotNull C2564AQp c2564AQp, @NotNull ShareType shareType, @NotNull SharePreviewMode sharePreviewMode, java.lang.String str, AbstractC2499AOc abstractC2499AOc) {
        Intrinsics.checkNotNullParameter(c2564AQp, "");
        Intrinsics.checkNotNullParameter(shareType, "");
        Intrinsics.checkNotNullParameter(sharePreviewMode, "");
        return new C2501AOe(c2564AQp, shareType, sharePreviewMode, str, abstractC2499AOc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharePreviewMode AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC2499AOc EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2564AQp OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareType copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2501AOe)) {
            return false;
        }
        C2501AOe c2501AOe = (C2501AOe) obj;
        return Intrinsics.EZpvd(this.KWHzl, c2501AOe.KWHzl) && this.EZpvd == c2501AOe.EZpvd && this.AEQbTJ == c2501AOe.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c2501AOe.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c2501AOe.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        java.lang.String str = this.copydefault;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        AbstractC2499AOc abstractC2499AOc = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (abstractC2499AOc != null ? abstractC2499AOc.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LinkPreviewConfig(common=" + this.KWHzl + ", shareType=" + this.EZpvd + ", sharePreviewMode=" + this.AEQbTJ + ", previewStyleBody=" + this.copydefault + ", previewImage=" + this.OLrzqt + ")";
    }

    public C2501AOe(@NotNull C2564AQp c2564AQp, @NotNull ShareType shareType, @NotNull SharePreviewMode sharePreviewMode, java.lang.String str, AbstractC2499AOc abstractC2499AOc) {
        Intrinsics.checkNotNullParameter(c2564AQp, "");
        Intrinsics.checkNotNullParameter(shareType, "");
        Intrinsics.checkNotNullParameter(sharePreviewMode, "");
        this.KWHzl = c2564AQp;
        this.EZpvd = shareType;
        this.AEQbTJ = sharePreviewMode;
        this.copydefault = str;
        this.OLrzqt = abstractC2499AOc;
    }
}
