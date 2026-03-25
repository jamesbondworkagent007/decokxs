package o;

import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54983xbP extends C52801wYw {
    public final C52770wXs DCJXGO;
    public int DCUTEI;
    public final android.view.View OBJEWx;
    public final C52770wXs ODWQjV;
    public int OuxcSI;
    public final C52770wXs QHmsKR;
    public final C52770wXs QkdxfA;
    public int RKDWNf;
    public int ffGIBT;
    public int getPostValueLengthLimit;
    public int zuWLRA;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52770wXs DCJXGO() {
        return this.DCJXGO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DCUTEI() {
        return this.getPostValueLengthLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DXXBbs() {
        return this.ffGIBT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52770wXs DarRvM() {
        return this.ODWQjV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int ODWQjV() {
        return this.OuxcSI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OqFWZa() {
        return this.DCUTEI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OuxcSI() {
        return this.zuWLRA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52770wXs ffGIBT() {
        return this.QHmsKR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPostValueLengthLimit() {
        return this.RKDWNf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52770wXs zuWLRA() {
        return this.QkdxfA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54983xbP(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.OBJEWx = view;
        this.DCJXGO = new C52770wXs(view);
        this.ODWQjV = new C52770wXs(view);
        this.QHmsKR = new C52770wXs(view);
        this.QkdxfA = new C52770wXs(view);
    }

    @Override // o.C52801wYw, o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        super.OLrzqt(attributeSet, C52761wXj.ActionBar.dUDNAs, i2);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.OBJEWx.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.DPhTBN, i, C52761wXj.LoaderManager.djSkpj);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.DQzvGN, -1);
        if (resourceId != -1) {
            this.DCJXGO.OLrzqt(null, 0, resourceId);
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.reset, -1);
        if (resourceId2 != -1) {
            this.ODWQjV.OLrzqt(null, 0, resourceId2);
        }
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.zLAIeZ, -1);
        if (resourceId3 != -1) {
            this.QHmsKR.OLrzqt(null, 0, resourceId3);
        }
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.ihnvzI, -1);
        if (resourceId4 != -1) {
            this.QkdxfA.OLrzqt(null, 0, resourceId4);
        }
        EZpvd(typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.RvdRAu));
        this.DCUTEI = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.DPHNDa, ContextCompat.getColor(this.OBJEWx.getContext(), C52761wXj.Activity.fdOvFl));
        KWHzl(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.aJZHYI, ContextCompat.getColor(this.OBJEWx.getContext(), C52761wXj.Activity.zuBGHE)));
        this.zuWLRA = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.fkESqH, ContextCompat.getColor(this.OBJEWx.getContext(), C52761wXj.Activity.zuBGHE));
        this.getPostValueLengthLimit = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.RAQtXZ, ContextCompat.getColor(this.OBJEWx.getContext(), C52761wXj.Activity.fdOvFl));
        int i3 = C52761wXj.PictureInPictureParams.DPHsZd;
        android.content.Context context = this.OBJEWx.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.ffGIBT = typedArrayObtainStyledAttributes.getDimensionPixelSize(i3, C55298xhM.OLrzqt(1, context));
        int i4 = C52761wXj.PictureInPictureParams.DrNnAm;
        android.content.Context context2 = this.OBJEWx.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.OuxcSI = typedArrayObtainStyledAttributes.getDimensionPixelSize(i4, C55298xhM.KWHzl(1.5f, context2));
        copydefault(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.Swccd, ContextCompat.getColor(this.OBJEWx.getContext(), C52761wXj.Activity.invokespecialODCBUN)));
        this.RKDWNf = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.geLlBI, ContextCompat.getColor(this.OBJEWx.getContext(), C52761wXj.Activity.invokespecialDPHOMC));
        copydefault(typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.DQYQgr));
        typedArrayObtainStyledAttributes.recycle();
    }
}
