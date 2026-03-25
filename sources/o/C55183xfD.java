package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xfD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55183xfD implements InterfaceC52764wXm {
    public android.graphics.drawable.Drawable AEQbTJ;
    public final C55230xfy AYXKKw;
    public int AhwBna;
    public android.content.res.ColorStateList DbNXlk;
    public float EZpvd;
    public android.graphics.drawable.Drawable KWHzl;
    public android.content.res.ColorStateList OLrzqt;
    public android.content.res.ColorStateList copydefault;
    public android.graphics.drawable.Drawable djBIcL;
    public android.content.res.ColorStateList fetchVPNInfo;
    public int gEmmrt;
    public float isConnected;
    public int valueOf;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.res.ColorStateList AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.res.ColorStateList KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.res.ColorStateList valueOf() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.res.ColorStateList values() {
        return this.DbNXlk;
    }

    public C55183xfD(@NotNull C55230xfy c55230xfy) {
        Intrinsics.checkNotNullParameter(c55230xfy, "");
        this.AYXKKw = c55230xfy;
        this.gEmmrt = -1;
        this.values = -1;
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.AYXKKw.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.HJWChPURsaBn, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.fetchVPNInfo = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.HJWChPfvRMlC);
        this.copydefault = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.HJWChPdNQGVJ);
        this.djBIcL = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.QSAYLr);
        this.AEQbTJ = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.HJWChPUUMfbK);
        this.gEmmrt = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.dNxZaP, -1);
        this.values = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.BVXAa, 0);
        this.DbNXlk = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.DuR);
        this.OLrzqt = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.iqeXgQ);
        this.isConnected = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.ikIEnW, 0.0f);
        this.KWHzl = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.isElapsedRealtimeNanosAvailable);
        this.EZpvd = typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.HJWChPdIKEqB, 0.0f);
        int i3 = C52761wXj.PictureInPictureParams.HJWChPfrwjPh;
        android.content.Context context = this.AYXKKw.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.AhwBna = typedArrayObtainStyledAttributes.getDimensionPixelSize(i3, C55298xhM.KWHzl(40.0f, context));
        int i4 = C52761wXj.PictureInPictureParams.RZMhtF;
        android.content.Context context2 = this.AYXKKw.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.valueOf = typedArrayObtainStyledAttributes.getDimensionPixelSize(i4, C55298xhM.KWHzl(36.0f, context2));
        typedArrayObtainStyledAttributes.recycle();
    }
}
