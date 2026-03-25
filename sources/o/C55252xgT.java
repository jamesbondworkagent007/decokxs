package o;

import com.google.android.material.resources.TextAppearance;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55252xgT implements InterfaceC52764wXm {
    public int AEQbTJ;
    public float AhwBna;
    public int EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public int copydefault;
    public int djBIcL;
    public final android.view.View gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.djBIcL;
    }

    public C55252xgT(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.gEmmrt = view;
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.gEmmrt.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.SFHvfS, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int i3 = C52761wXj.PictureInPictureParams.RjCdvp;
        android.content.Context context = this.gEmmrt.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.AEQbTJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(i3, C55298xhM.OLrzqt(20, context));
        int i4 = C52761wXj.PictureInPictureParams.RjCdvpRjCdvp;
        android.content.Context context2 = this.gEmmrt.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.OLrzqt = typedArrayObtainStyledAttributes.getDimensionPixelSize(i4, C55298xhM.OLrzqt(4, context2));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.RsCxkX, -1);
        this.KWHzl = resourceId;
        if (resourceId != -1) {
            this.AhwBna = new TextAppearance(this.gEmmrt.getContext(), this.KWHzl).getTextSize();
        }
        this.djBIcL = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.RhlVAI, -1);
        int i5 = C52761wXj.PictureInPictureParams.hTAtCx;
        android.content.Context context3 = this.gEmmrt.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        this.EZpvd = typedArrayObtainStyledAttributes.getDimensionPixelSize(i5, C55298xhM.OLrzqt(0, context3));
        this.copydefault = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.onLost, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
