package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wXs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52770wXs extends C52767wXp {
    public float AEQbTJ;
    public int OLrzqt;
    public final android.graphics.Rect copydefault;
    public float djBIcL;
    public final android.view.View gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(float f) {
        this.djBIcL = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Rect OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float valueOf() {
        return this.djBIcL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52770wXs(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.gEmmrt = view;
        this.valueOf = -1;
        this.djBIcL = -1.0f;
        this.copydefault = new android.graphics.Rect();
        this.OLrzqt = -1;
    }

    @Override // o.C52767wXp, o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        super.OLrzqt(attributeSet, i, i2);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.gEmmrt.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.sSi, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.valueOf = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.ZNPcth, -1);
        this.djBIcL = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.DuQ, -1.0f);
        this.AEQbTJ = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.ZGRCNj, -1.0f);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.Zpvmxu, 0);
        android.graphics.Rect rect = this.copydefault;
        rect.left = dimensionPixelSize;
        rect.right = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.ZaDspl, 0);
        android.graphics.Rect rect2 = this.copydefault;
        rect2.top = dimensionPixelSize2;
        rect2.bottom = dimensionPixelSize2;
        this.OLrzqt = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.ijmTNW, -1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
