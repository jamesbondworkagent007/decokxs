package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55060xcn implements InterfaceC52764wXm {
    public final android.view.View KWHzl;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(int i) {
        this.OLrzqt = i;
    }

    public C55060xcn(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.KWHzl = view;
        this.OLrzqt = -2;
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.KWHzl.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.QMuEJi, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.OLrzqt = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.RcvFxC, -2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
