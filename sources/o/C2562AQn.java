package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.growth.SharePreviewMode;
import uniffi.growth.ShareType;

/* JADX INFO: renamed from: o.AQn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C2562AQn {
    public static final int $stable = 8;
    public C2564AQp AEQbTJ;
    public ShareType KWHzl;
    public SharePreviewMode copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2562AQn copy$default(C2562AQn c2562AQn, C2564AQp c2564AQp, ShareType shareType, SharePreviewMode sharePreviewMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c2564AQp = c2562AQn.AEQbTJ;
        }
        if ((i & 2) != 0) {
            shareType = c2562AQn.KWHzl;
        }
        if ((i & 4) != 0) {
            sharePreviewMode = c2562AQn.copydefault;
        }
        return c2562AQn.copydefault(c2564AQp, shareType, sharePreviewMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2564AQp KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharePreviewMode OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2562AQn copydefault(@NotNull C2564AQp c2564AQp, @NotNull ShareType shareType, @NotNull SharePreviewMode sharePreviewMode) {
        Intrinsics.checkNotNullParameter(c2564AQp, "");
        Intrinsics.checkNotNullParameter(shareType, "");
        Intrinsics.checkNotNullParameter(sharePreviewMode, "");
        return new C2562AQn(c2564AQp, shareType, sharePreviewMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareType copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2562AQn)) {
            return false;
        }
        C2562AQn c2562AQn = (C2562AQn) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c2562AQn.AEQbTJ) && this.KWHzl == c2562AQn.KWHzl && this.copydefault == c2562AQn.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TextPreviewConfig(common=" + this.AEQbTJ + ", shareType=" + this.KWHzl + ", sharePreviewMode=" + this.copydefault + ")";
    }

    public C2562AQn(@NotNull C2564AQp c2564AQp, @NotNull ShareType shareType, @NotNull SharePreviewMode sharePreviewMode) {
        Intrinsics.checkNotNullParameter(c2564AQp, "");
        Intrinsics.checkNotNullParameter(shareType, "");
        Intrinsics.checkNotNullParameter(sharePreviewMode, "");
        this.AEQbTJ = c2564AQp;
        this.KWHzl = shareType;
        this.copydefault = sharePreviewMode;
    }
}
