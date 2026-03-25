package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54968xbA implements InterfaceC52764wXm {
    public int AEQbTJ;
    public final C55019xbz KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AEQbTJ;
    }

    public C54968xbA(@NotNull C55019xbz c55019xbz) {
        Intrinsics.checkNotNullParameter(c55019xbz, "");
        this.KWHzl = c55019xbz;
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.KWHzl.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.zzJhsT, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.AEQbTJ = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.OStAOF, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
