package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55177xey extends C52768wXq {
    public android.graphics.drawable.Drawable DTwDnp;
    public int ORxRYg;
    public int OcIXYQ;
    public android.graphics.drawable.Drawable QKVWgx;
    public int QOLQEE;
    public int QUSxYX;
    public int QVAiDq;
    public android.graphics.drawable.Drawable QbewEr;
    public int QfsBiF;
    public int RJOkX;
    public int RcXXUw;
    public int UeEOUB;
    public int aKErDB;
    public android.graphics.drawable.Drawable dNCPSb;
    public int djSkpj;
    public int dxcTrN;
    public final android.view.View fFgQHt;
    public int fZBcTu;
    public int finit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.dxcTrN = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable AwvSrB() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable AxsJAY() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DTwDnp() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int ORxRYg() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OcIXYQ() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QKVWgx() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QOLQEE() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QUSxYX() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable QVAiDq() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable QbewEr() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QfsBiF() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int RJOkX() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int RcXXUw() {
        return this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int aKErDB() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.RJOkX = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int dNCPSb() {
        return this.fZBcTu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djSkpj() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gHZMYf() {
        return this.ORxRYg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55177xey(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.fFgQHt = view;
        this.dxcTrN = -1;
        this.RJOkX = -1;
    }

    @Override // o.C52768wXq, o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        super.OLrzqt(attributeSet, i, i2);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.fFgQHt.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.sZqaRl, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.dNCPSb = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.QOjuYg);
        this.aKErDB = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.HJWChPQdUnVm, 0);
        this.QbewEr = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.QfZsXX);
        this.djSkpj = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.itxZVF, 0);
        this.QUSxYX = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.HJWChPQPAeHI, 0);
        this.RcXXUw = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.iLAtSv, 0);
        this.QKVWgx = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.HJWChPOKBmQNaCIdOM);
        this.QVAiDq = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.HJWChPOKBmQN, 0);
        this.DTwDnp = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.putInt);
        this.OcIXYQ = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.fDu, 0);
        this.ORxRYg = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.fAklCm, 0);
        this.QOLQEE = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.HJWChPOZOJIj, 0);
        this.dxcTrN = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.ORmwhf, -1);
        this.RJOkX = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.DjwCMv, -1);
        this.QfsBiF = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.QsIRgs, 0);
        this.UeEOUB = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.ibnZAm, -1);
        int i3 = C52761wXj.PictureInPictureParams.iWlNch;
        android.content.Context context = this.fFgQHt.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.fZBcTu = typedArrayObtainStyledAttributes.getDimensionPixelSize(i3, C55298xhM.OLrzqt(1, context));
        this.finit = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.ONJgbh, -1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
