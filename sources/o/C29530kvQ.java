package o;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kvQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29530kvQ extends android.graphics.drawable.Drawable {
    public final int AEQbTJ;
    public final int EZpvd;
    public final android.graphics.Paint KWHzl = new android.graphics.Paint(1);
    public final boolean copydefault;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public C29530kvQ(int i, int i2, boolean z) {
        this.AEQbTJ = i;
        this.EZpvd = i2;
        this.copydefault = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        android.graphics.Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "");
        this.KWHzl.setShader(new LinearGradient(bounds.right, bounds.bottom, bounds.exactCenterX(), bounds.exactCenterY(), this.AEQbTJ, this.EZpvd, Shader.TileMode.CLAMP));
        if (this.copydefault) {
            float fDp2pxFloat$default = C55298xhM.dp2pxFloat$default(16.0f, null, 1, null);
            canvas.drawRoundRect(new RectF(bounds), fDp2pxFloat$default, fDp2pxFloat$default, this.KWHzl);
        } else {
            canvas.drawRect(bounds, this.KWHzl);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.KWHzl.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.KWHzl.setColorFilter(colorFilter);
    }
}
