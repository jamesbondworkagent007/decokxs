package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xes, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55171xes implements InterfaceC52764wXm {
    public android.graphics.drawable.Drawable AEQbTJ;
    public int AYXKKw;
    public int EZpvd;
    public final C55173xeu KWHzl;
    public int OLrzqt;
    public int copydefault;
    public int djBIcL;
    public int gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.djBIcL;
    }

    public C55171xes(@NotNull C55173xeu c55173xeu) {
        Intrinsics.checkNotNullParameter(c55173xeu, "");
        this.KWHzl = c55173xeu;
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.KWHzl.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.AEQbTJ, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.AEQbTJ = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.copydefault);
        this.djBIcL = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.gEmmrt, 0);
        this.AYXKKw = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.djBIcL, 0);
        this.copydefault = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.valueOf, 0);
        this.EZpvd = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.AhwBna, 0);
        this.OLrzqt = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.AYXKKw, 0);
        this.gEmmrt = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C52761wXj.PictureInPictureParams.EZpvd, 0);
        this.valueOf = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C52761wXj.PictureInPictureParams.OLrzqt, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
