package o;

import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wXD extends C55177xey {
    public android.graphics.drawable.Drawable AuCTelauCTel;
    public int AubY;
    public int AwvSrB;
    public int AxsJAY;
    public int gHZMYf;
    public final OKAlertBanner sSMYrx;
    public android.graphics.drawable.Drawable zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AuCTelauCTel() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AubY() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable sSMYrx() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable zLjUOn() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int zsXlph() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int zuBGHE() {
        return this.AxsJAY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wXD(@NotNull OKAlertBanner oKAlertBanner) {
        super(oKAlertBanner);
        Intrinsics.checkNotNullParameter(oKAlertBanner, "");
        this.sSMYrx = oKAlertBanner;
    }

    @Override // o.C55177xey, o.C52768wXq, o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        super.OLrzqt(attributeSet, i, i2);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.sSMYrx.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.ffGIBT, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.zuBGHE = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.QkdxfA);
        this.AxsJAY = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.OBJEWx, 0);
        this.AuCTelauCTel = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.OuxcSI);
        this.AwvSrB = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.QSBOWP, 0);
        this.AubY = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.RKDWNf, 0);
        this.gHZMYf = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.QHmsKR, 0);
        AEQbTJ(typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.gwTjWJ, -1));
        copydefault(typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.getPostValueLengthLimit, -1));
        typedArrayObtainStyledAttributes.recycle();
    }
}
