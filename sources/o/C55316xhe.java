package o;

import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55316xhe implements InterfaceC52764wXm {
    public final C55317xhf AEQbTJ;
    public int AYXKKw;
    public float EZpvd;
    public float KWHzl;
    public boolean OLrzqt;
    public float copydefault;
    public int djBIcL;
    public float gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float valueOf() {
        return this.gEmmrt;
    }

    public C55316xhe(@NotNull C55317xhf c55317xhf) {
        Intrinsics.checkNotNullParameter(c55317xhf, "");
        this.AEQbTJ = c55317xhf;
        this.djBIcL = 400;
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.AEQbTJ.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.djSkpj, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.AYXKKw = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.finit, ContextCompat.getColor(this.AEQbTJ.getContext(), C52761wXj.Activity.cancel));
        this.djBIcL = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.fvQaOB, 400);
        this.gEmmrt = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.flVtFt, 0.0f);
        this.EZpvd = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.dxcTrN, 0.0f);
        this.KWHzl = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.fFgQHt, 0.0f);
        this.copydefault = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.dvKsVJ, 0.0f);
        this.copydefault = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.dvKsVJ, 0.0f);
        this.OLrzqt = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.fZBcTu, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
