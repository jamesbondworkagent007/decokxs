package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wXp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C52767wXp implements InterfaceC52764wXm {
    public final android.view.View EZpvd;
    public int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.KWHzl;
    }

    public C52767wXp(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.EZpvd = view;
        this.KWHzl = -1;
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.EZpvd.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.DxnCrt, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.KWHzl = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.DlmWDR, -1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
