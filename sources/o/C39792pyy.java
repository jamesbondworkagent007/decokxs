package o;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pyy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39792pyy extends android.view.View {
    public float AEQbTJ;
    public android.graphics.Paint AYXKKw;
    public float AhwBna;
    public android.graphics.Bitmap EZpvd;
    public float KWHzl;
    public int OLrzqt;
    public float copydefault;
    public android.graphics.Path gEmmrt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39792pyy(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39792pyy(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.OLrzqt = -1;
        EZpvd(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39792pyy(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.OLrzqt = -1;
        EZpvd(context, attributeSet);
    }

    public final void EZpvd(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.KWHzl = C55298xhM.copydefault(3.0f, context);
        this.AEQbTJ = C55298xhM.copydefault(3.0f, context);
        this.OLrzqt = C33508mxl.copydefault(context);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.AYXKKw = paint;
        Intrinsics.copydefault(paint);
        paint.setColor(this.OLrzqt);
        android.graphics.Paint paint2 = this.AYXKKw;
        Intrinsics.copydefault(paint2);
        paint2.setStrokeWidth(1.0f);
        android.graphics.Paint paint3 = this.AYXKKw;
        Intrinsics.copydefault(paint3);
        paint3.setStyle(Paint.Style.STROKE);
        android.graphics.Paint paint4 = this.AYXKKw;
        Intrinsics.copydefault(paint4);
        paint4.setPathEffect(new DashPathEffect(new float[]{this.KWHzl, this.AEQbTJ}, 0.0f));
        this.gEmmrt = new android.graphics.Path();
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        setLayerType(1, null);
        this.copydefault = C33129mqd.djBIcL(java.lang.Integer.valueOf(getMeasuredWidth()));
        this.AhwBna = C33129mqd.djBIcL(java.lang.Integer.valueOf(getMeasuredHeight() / 2));
        android.graphics.Path path = this.gEmmrt;
        if (path != null) {
            path.reset();
            path.moveTo(0.0f, this.AhwBna);
            path.lineTo(this.copydefault, this.AhwBna);
        }
        android.graphics.Path path2 = this.gEmmrt;
        Intrinsics.copydefault(path2);
        android.graphics.Paint paint = this.AYXKKw;
        Intrinsics.copydefault(paint);
        canvas.drawPath(path2, paint);
        android.graphics.Bitmap bitmap = this.EZpvd;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.copydefault - bitmap.getWidth(), this.AhwBna - (bitmap.getHeight() / 2), this.AYXKKw);
        }
    }

    public final void OLrzqt(@androidx.annotation.ColorInt int i) {
        this.OLrzqt = i;
        android.graphics.Paint paint = this.AYXKKw;
        if (paint != null) {
            paint.setColor(i);
        }
        invalidate();
    }

    public final void copydefault(@NotNull android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        this.EZpvd = bitmap;
        invalidate();
    }
}
