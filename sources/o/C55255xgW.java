package o;

import com.google.android.material.resources.MaterialResources;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55255xgW implements InterfaceC52764wXm {
    public android.content.res.ColorStateList AEQbTJ;
    public C55252xgT EZpvd;
    public final C55247xgO KWHzl;
    public C55252xgT OLrzqt;
    public float copydefault;
    public C55252xgT gEmmrt;
    public C55252xgT valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55252xgT AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55252xgT AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55252xgT EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.res.ColorStateList KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55252xgT OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float copydefault() {
        return this.copydefault;
    }

    public C55255xgW(@NotNull C55247xgO c55247xgO) {
        Intrinsics.checkNotNullParameter(c55247xgO, "");
        this.KWHzl = c55247xgO;
        this.valueOf = new C55252xgT(c55247xgO);
        this.OLrzqt = new C55252xgT(c55247xgO);
        this.EZpvd = new C55252xgT(c55247xgO);
        this.gEmmrt = new C55252xgT(c55247xgO);
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.KWHzl.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.onAvailable, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.AEQbTJ = MaterialResources.getColorStateList(this.KWHzl.getContext(), typedArrayObtainStyledAttributes, C52761wXj.PictureInPictureParams.SQPLEi);
        int i3 = C52761wXj.PictureInPictureParams.SaJVGb;
        android.content.Context context = this.KWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.copydefault = typedArrayObtainStyledAttributes.getDimension(i3, C55298xhM.EZpvd(18.0f, context));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.OFQuKP, -1);
        if (resourceId != -1) {
            this.valueOf.OLrzqt(null, 0, resourceId);
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.QTtQrx, -1);
        if (resourceId2 != -1) {
            this.OLrzqt.OLrzqt(null, 0, resourceId2);
        }
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.SUwuXE, -1);
        if (resourceId3 != -1) {
            this.EZpvd.OLrzqt(null, 0, resourceId3);
        }
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.OhRmUC, -1);
        if (resourceId4 != -1) {
            this.gEmmrt.OLrzqt(null, 0, resourceId4);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
