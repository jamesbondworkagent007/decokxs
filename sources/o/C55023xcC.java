package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55023xcC implements InterfaceC52764wXm {
    public int AEQbTJ;
    public int AYXKKw;
    public int AhwBna;
    public int EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public int copydefault;
    public int djBIcL;
    public final android.view.View gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.AYXKKw;
    }

    public C55023xcC(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.gEmmrt = view;
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.gEmmrt.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.ilfrrN, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.valueOf = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.hwXsuq, 0);
            this.AhwBna = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.UCQKYV, 0);
            this.djBIcL = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.aBDePw, 0);
            this.AYXKKw = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.DzCpqu, 0);
            this.OLrzqt = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.izFvvl, 0);
            this.copydefault = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.HJWChPiaHEvk, 0);
            this.EZpvd = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.sanrWj, 0);
            this.KWHzl = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.HJWChPhFGucI, 0);
            this.AEQbTJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.xxhdY, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
