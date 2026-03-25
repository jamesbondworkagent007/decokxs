package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55240xgH implements InterfaceC52764wXm {
    public int AEQbTJ;
    public int EZpvd;
    public final C55239xgG KWHzl;
    public int OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    public C55240xgH(@NotNull C55239xgG c55239xgG) {
        Intrinsics.checkNotNullParameter(c55239xgG, "");
        this.KWHzl = c55239xgG;
        this.copydefault = -1;
        this.EZpvd = -1;
        this.OLrzqt = -1;
        this.AEQbTJ = -1;
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.KWHzl.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.zFZsbn, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.copydefault = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.glXhWM, -1);
        this.EZpvd = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.RIsQag, -1);
        this.OLrzqt = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.QhsCdEQhsCdE, -1);
        this.AEQbTJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.hrnhsO, -1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
