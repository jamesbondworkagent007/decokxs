package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wYd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52782wYd implements InterfaceC52764wXm {
    public android.graphics.drawable.Drawable AEQbTJ;
    public java.lang.Integer EZpvd;
    public final wXX copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.EZpvd;
    }

    public C52782wYd(@NotNull wXX wxx) {
        Intrinsics.checkNotNullParameter(wxx, "");
        this.copydefault = wxx;
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.copydefault.requireContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.fjfviF, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.AEQbTJ = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.ixgjPv);
        this.EZpvd = java.lang.Integer.valueOf(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.UrRBLY, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
