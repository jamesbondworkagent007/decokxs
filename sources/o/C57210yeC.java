package o;

import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yeC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57210yeC extends android.widget.FrameLayout {
    public final float[] AEQbTJ;
    public final float AYXKKw;
    public final RectF AhwBna;
    public final float EZpvd;
    public final float KWHzl;
    public boolean OLrzqt;
    public final android.graphics.Path copydefault;
    public final float valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClipCorner(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57210yeC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        float fDp$default = C55298xhM.dp$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.AYXKKw = fDp$default;
        float fDp$default2 = C55298xhM.dp$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.valueOf = fDp$default2;
        float f = this.KWHzl;
        float f2 = this.EZpvd;
        this.AEQbTJ = new float[]{fDp$default, fDp$default, fDp$default2, fDp$default2, f, f, f2, f2};
        this.copydefault = new android.graphics.Path();
        this.AhwBna = new RectF();
        this.OLrzqt = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        if (this.OLrzqt) {
            canvas.save();
            canvas.clipPath(this.copydefault);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.copydefault.reset();
        this.AhwBna.set(0.0f, 0.0f, i, i2);
        this.copydefault.addRoundRect(this.AhwBna, this.AEQbTJ, Path.Direction.CW);
    }
}
