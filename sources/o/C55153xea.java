package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55153xea extends C52768wXq {
    public int AuCTelauCTel;
    public android.graphics.drawable.Drawable AubY;
    public boolean AwvSrB;
    public int AxsJAY;
    public int DTwDnp;
    public int ORxRYg;
    public int OcIXYQ;
    public float QKVWgx;
    public int QOLQEE;
    public float QUSxYX;
    public float QVAiDq;
    public int QbewEr;
    public float QfsBiF;
    public float RJOkX;
    public float RcXXUw;
    public final C55097xdX UeEOUB;
    public float aKErDB;
    public int dNCPSb;
    public float djSkpj;
    public int dxcTrN;
    public int fFgQHt;
    public int gHZMYf;
    public android.graphics.drawable.Drawable sSMYrx;
    public int zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AuCTelauCTel() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable AubY() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AwvSrB() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AxsJAY() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float DTwDnp() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int ORxRYg() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OcIXYQ() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float QKVWgx() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QOLQEE() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float QUSxYX() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QVAiDq() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float QbewEr() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float QfsBiF() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int RJOkX() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int UeEOUB() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int aKErDB() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gHZMYf() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int sSMYrx() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable zLjUOn() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int zsXlph() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int zuBGHE() {
        return this.QOLQEE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55153xea(@NotNull C55097xdX c55097xdX) {
        super(c55097xdX);
        Intrinsics.checkNotNullParameter(c55097xdX, "");
        this.UeEOUB = c55097xdX;
        this.fFgQHt = -1;
        this.dxcTrN = -1;
        this.AwvSrB = true;
    }

    @Override // o.C52768wXq, o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        super.OLrzqt(attributeSet, i, i2);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.UeEOUB.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.QSbQqJ, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.sSMYrx = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.OVMstZ);
        this.gHZMYf = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.QSusPL, 0);
        this.AubY = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.setCurrentKeyboardTarget);
        this.AxsJAY = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.registerKeyboardTarget, 0);
        this.AuCTelauCTel = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.keyboardTargetTextChanged, 0);
        this.QfsBiF = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.UkCIYP, -1.0f);
        this.QUSxYX = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.QYvkLl, -1.0f);
        this.QKVWgx = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.DkGEDn, -1.0f);
        this.QVAiDq = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.QVMIlxQVMIlx, -1.0f);
        this.DTwDnp = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.QVMIlx, 0);
        this.ORxRYg = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.kcQGz, 0);
        this.aKErDB = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.addPreRequisiteCollector, -1.0f);
        this.djSkpj = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.QhsCdE, -1.0f);
        this.RJOkX = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.QezThh, -1.0f);
        this.RcXXUw = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.invokespecialhrnhsO, -1.0f);
        this.QbewEr = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.sFt, 0);
        this.dNCPSb = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.fWSAZA, 0);
        this.fFgQHt = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.apNKau, -1);
        this.dxcTrN = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.RcLksq, -1);
        this.OcIXYQ = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.ruDxL, 0);
        this.zuBGHE = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.hdBMmm, 0);
        this.QOLQEE = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.fdazkH, 0);
        this.AwvSrB = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.aPFruk, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
