package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.growth.SharePreviewMode;
import uniffi.growth.ShareType;

/* JADX INFO: renamed from: o.AOa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C2497AOa {
    public static final int $stable = 8;
    public ShareType AEQbTJ;
    public SharePreviewMode EZpvd;
    public java.lang.String KWHzl;
    public C2564AQp OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2497AOa copy$default(C2497AOa c2497AOa, C2564AQp c2564AQp, ShareType shareType, SharePreviewMode sharePreviewMode, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c2564AQp = c2497AOa.OLrzqt;
        }
        if ((i & 2) != 0) {
            shareType = c2497AOa.AEQbTJ;
        }
        ShareType shareType2 = shareType;
        if ((i & 4) != 0) {
            sharePreviewMode = c2497AOa.EZpvd;
        }
        SharePreviewMode sharePreviewMode2 = sharePreviewMode;
        if ((i & 8) != 0) {
            str = c2497AOa.KWHzl;
        }
        java.lang.String str3 = str;
        if ((i & 16) != 0) {
            str2 = c2497AOa.copydefault;
        }
        return c2497AOa.EZpvd(c2564AQp, shareType2, sharePreviewMode2, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharePreviewMode AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2497AOa EZpvd(@NotNull C2564AQp c2564AQp, @NotNull ShareType shareType, @NotNull SharePreviewMode sharePreviewMode, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(c2564AQp, "");
        Intrinsics.checkNotNullParameter(shareType, "");
        Intrinsics.checkNotNullParameter(sharePreviewMode, "");
        return new C2497AOa(c2564AQp, shareType, sharePreviewMode, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareType KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2564AQp OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2497AOa)) {
            return false;
        }
        C2497AOa c2497AOa = (C2497AOa) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c2497AOa.OLrzqt) && this.AEQbTJ == c2497AOa.AEQbTJ && this.EZpvd == c2497AOa.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c2497AOa.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c2497AOa.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ImageCustomLuaPreviewConfig(common=" + this.OLrzqt + ", shareType=" + this.AEQbTJ + ", sharePreviewMode=" + this.EZpvd + ", customMenuItemsKey=" + this.KWHzl + ", customViewKey=" + this.copydefault + ")";
    }

    public C2497AOa(@NotNull C2564AQp c2564AQp, @NotNull ShareType shareType, @NotNull SharePreviewMode sharePreviewMode, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(c2564AQp, "");
        Intrinsics.checkNotNullParameter(shareType, "");
        Intrinsics.checkNotNullParameter(sharePreviewMode, "");
        this.OLrzqt = c2564AQp;
        this.AEQbTJ = shareType;
        this.EZpvd = sharePreviewMode;
        this.KWHzl = str;
        this.copydefault = str2;
    }
}
