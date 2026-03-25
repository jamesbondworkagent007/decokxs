package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.growth.SharePreviewMode;
import uniffi.growth.ShareType;

/* JADX INFO: loaded from: classes13.dex */
public final class ANW {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public ShareType EZpvd;
    public SharePreviewMode KWHzl;
    public C2564AQp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ANW copy$default(ANW anw, C2564AQp c2564AQp, ShareType shareType, SharePreviewMode sharePreviewMode, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c2564AQp = anw.copydefault;
        }
        if ((i & 2) != 0) {
            shareType = anw.EZpvd;
        }
        if ((i & 4) != 0) {
            sharePreviewMode = anw.KWHzl;
        }
        if ((i & 8) != 0) {
            str = anw.AEQbTJ;
        }
        return anw.copydefault(c2564AQp, shareType, sharePreviewMode, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareType AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2564AQp EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ANW copydefault(@NotNull C2564AQp c2564AQp, @NotNull ShareType shareType, @NotNull SharePreviewMode sharePreviewMode, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c2564AQp, "");
        Intrinsics.checkNotNullParameter(shareType, "");
        Intrinsics.checkNotNullParameter(sharePreviewMode, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new ANW(c2564AQp, shareType, sharePreviewMode, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharePreviewMode copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ANW)) {
            return false;
        }
        ANW anw = (ANW) obj;
        return Intrinsics.EZpvd(this.copydefault, anw.copydefault) && this.EZpvd == anw.EZpvd && this.KWHzl == anw.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) anw.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ImageCustomPreviewConfig(common=" + this.copydefault + ", shareType=" + this.EZpvd + ", sharePreviewMode=" + this.KWHzl + ", customFragmentClass=" + this.AEQbTJ + ")";
    }

    public ANW(@NotNull C2564AQp c2564AQp, @NotNull ShareType shareType, @NotNull SharePreviewMode sharePreviewMode, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c2564AQp, "");
        Intrinsics.checkNotNullParameter(shareType, "");
        Intrinsics.checkNotNullParameter(sharePreviewMode, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = c2564AQp;
        this.EZpvd = shareType;
        this.KWHzl = sharePreviewMode;
        this.AEQbTJ = str;
    }
}
