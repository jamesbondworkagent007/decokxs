package o;

import android.graphics.Paint;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fTA extends android.view.View {
    public final float AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public final float OLrzqt;
    public float copydefault;
    public final int djBIcL;
    public final android.graphics.Paint gEmmrt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fTA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.gEmmrt = paint;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13754dXa.PendingIntent.AYXKKw);
        this.djBIcL = typedArrayObtainStyledAttributes.getInt(C13754dXa.PendingIntent.AkhnZx, 5);
        this.OLrzqt = typedArrayObtainStyledAttributes.getDimension(C13754dXa.PendingIntent.isConnected, C55298xhM.dp2pxFloat$default(2.0f, null, 1, null));
        this.AEQbTJ = typedArrayObtainStyledAttributes.getDimension(C13754dXa.PendingIntent.DbNXlk, C55298xhM.dp2pxFloat$default(24.0f, null, 1, null));
        this.EZpvd = typedArrayObtainStyledAttributes.getColor(C13754dXa.PendingIntent.fetchVPNInfo, C33070mpX.copydefault(C52761wXj.Activity.zuBGHE));
        this.KWHzl = typedArrayObtainStyledAttributes.getColor(C13754dXa.PendingIntent.values, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fTA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fTA(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((int) this.OLrzqt, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (this.AEQbTJ * this.djBIcL), 1073741824));
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        OLrzqt(canvas);
        EZpvd(canvas);
    }

    public final void EZpvd(android.graphics.Canvas canvas) {
        float f = this.copydefault * this.AEQbTJ;
        this.gEmmrt.setColor(this.KWHzl);
        float f2 = this.OLrzqt;
        float f3 = f2 / 2;
        canvas.drawRoundRect(0.0f, f, f2, f + this.AEQbTJ, f3, f3, this.gEmmrt);
    }

    public final void OLrzqt(android.graphics.Canvas canvas) {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f = measuredWidth / 2;
        this.gEmmrt.setColor(this.EZpvd);
        canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, f, f, this.gEmmrt);
    }

    public final void setProgress(int i) {
        float f;
        if (i < 0) {
            f = 0.0f;
        } else {
            int i2 = this.djBIcL - 1;
            f = i > i2 ? i2 : i;
        }
        this.copydefault = f;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[PHI: r0
  0x0005: PHI (r0v4 float) = (r0v0 float), (r0v3 float) binds: [B:3:0x0003, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setProgress(float f) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = f2;
        } else {
            f2 = this.djBIcL - 1;
            if (f > f2) {
            }
        }
        this.copydefault = f;
        invalidate();
    }
}
