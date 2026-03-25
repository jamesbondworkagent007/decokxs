package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class wYI implements InterfaceC52764wXm {
    public int AEQbTJ;
    public float EZpvd;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AEQbTJ;
    }

    public wYI(@NotNull C52794wYp c52794wYp) {
        Intrinsics.checkNotNullParameter(c52794wYp, "");
        this.copydefault = c52794wYp;
        this.AEQbTJ = -1;
        this.EZpvd = -1.0f;
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.copydefault.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.UlpNxW, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.AEQbTJ = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.UNDaji, -1);
        this.EZpvd = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.gRtANS, -1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
