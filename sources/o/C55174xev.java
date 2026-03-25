package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55174xev implements InterfaceC52764wXm {
    public int AEQbTJ;
    public float AYXKKw;
    public int EZpvd;
    public float KWHzl;
    public float OLrzqt;
    public final C55172xet copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    public C55174xev(@NotNull C55172xet c55172xet) {
        Intrinsics.checkNotNullParameter(c55172xet, "");
        this.copydefault = c55172xet;
        this.EZpvd = -1;
        this.AEQbTJ = -1;
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.copydefault.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.OmJATG, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.OLrzqt = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.fhUrPt, 0.0f);
        this.KWHzl = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.getLocation, 0.0f);
        this.AYXKKw = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.sElUiK, 0.0f);
        this.EZpvd = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.RihMUf, -1);
        this.AEQbTJ = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.pause, -1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
