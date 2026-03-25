package o;

import android.graphics.Bitmap;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oSF extends android.view.View {
    public final float AEQbTJ;
    public final float AYXKKw;
    public final float AhwBna;
    public final float AkhnZx;
    public float DbNXlk;
    public android.graphics.Bitmap EZpvd;
    public final android.graphics.Paint KWHzl;
    public final android.graphics.Paint OLrzqt;
    public final float copydefault;
    public final android.graphics.Paint djBIcL;
    public final android.graphics.Rect fetchVPNInfo;
    public final android.graphics.Paint gEmmrt;
    public java.lang.String isConnected;
    public final RectF valueOf;
    public final android.graphics.Paint values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oSF(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oSF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.oSF.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ oSF(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oSF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new android.graphics.Paint(1);
        this.djBIcL = new android.graphics.Paint(1);
        this.gEmmrt = new android.graphics.Paint(1);
        this.OLrzqt = new android.graphics.Paint(1);
        this.values = new android.graphics.Paint(1);
        this.AEQbTJ = C55298xhM.dp$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
        this.AYXKKw = C55298xhM.dp$default(0.5f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.copydefault = C55298xhM.dp$default(2, (android.content.Context) null, 1, (java.lang.Object) null);
        this.AhwBna = C55298xhM.dp$default(3, (android.content.Context) null, 1, (java.lang.Object) null);
        this.AkhnZx = C55298xhM.dp$default(2, (android.content.Context) null, 1, (java.lang.Object) null);
        this.isConnected = "";
        this.fetchVPNInfo = new android.graphics.Rect();
        this.valueOf = new RectF();
        OLrzqt();
    }

    public final void OLrzqt() {
        android.graphics.Paint paint = this.KWHzl;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(C33070mpX.copydefault(C52761wXj.Activity.QVAiDq));
        paint.setStrokeWidth(this.AYXKKw);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fCopydefault = C55298xhM.copydefault(3.0f, context);
        paint.setPathEffect(new DashPathEffect(new float[]{fCopydefault, fCopydefault}, 0.0f));
        this.djBIcL.setStyle(Paint.Style.FILL);
        this.djBIcL.setColor(C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC));
        android.graphics.Paint paint2 = this.gEmmrt;
        paint2.setStyle(style);
        paint2.setColor(C33070mpX.copydefault(C52761wXj.Activity.QVAiDq));
        paint2.setStrokeWidth(this.AYXKKw);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        android.graphics.Paint paint3 = this.OLrzqt;
        paint3.setStyle(style);
        paint3.setColor(C33070mpX.copydefault(C52761wXj.Activity.QVAiDq));
        paint3.setStrokeWidth(this.AYXKKw);
        android.graphics.Paint paint4 = this.values;
        paint4.setColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        paint4.setTextSize(C55298xhM.sp2pxFloat$default(10.0f, null, 1, null));
    }

    public final void setText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isConnected = str;
        this.values.getTextBounds(str, 0, str.length(), this.fetchVPNInfo);
        this.DbNXlk = this.values.measureText(str);
        requestLayout();
        invalidate();
    }

    public final void setIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return;
        }
        android.graphics.Bitmap bitmap = this.EZpvd;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.EZpvd = KWHzl(drawable, (int) this.AEQbTJ);
        requestLayout();
        invalidate();
    }

    public final android.graphics.Bitmap KWHzl(android.graphics.drawable.Drawable drawable, int i) {
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, i, i);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        AEQbTJ(canvas);
        OLrzqt(canvas);
    }

    public final void AEQbTJ(android.graphics.Canvas canvas) {
        float height = getHeight() / 2.0f;
        canvas.drawLine(0.0f, height, getWidth(), height, this.KWHzl);
    }

    public final void OLrzqt(android.graphics.Canvas canvas) {
        float fKWHzl = KWHzl();
        if (fKWHzl <= 0.0f) {
            return;
        }
        float fCopydefault = copydefault();
        float height = (getHeight() - fCopydefault) / 2;
        float f = fCopydefault + height;
        this.valueOf.set(getWidth() - fKWHzl, height, getWidth(), f);
        copydefault(canvas);
        KWHzl(canvas, height, f);
    }

    public final void copydefault(android.graphics.Canvas canvas) {
        RectF rectF = this.valueOf;
        float f = this.copydefault;
        canvas.drawRoundRect(rectF, f, f, this.djBIcL);
        RectF rectF2 = this.valueOf;
        float f2 = this.copydefault;
        canvas.drawRoundRect(rectF2, f2, f2, this.gEmmrt);
    }

    public final void KWHzl(android.graphics.Canvas canvas, float f, float f2) {
        float f3 = this.valueOf.left + this.AhwBna;
        if (this.isConnected.length() > 0) {
            float fCenterY = this.valueOf.centerY();
            android.graphics.Rect rect = this.fetchVPNInfo;
            canvas.drawText(this.isConnected, f3, fCenterY - ((rect.top + rect.bottom) / 2.0f), this.values);
            f3 += this.DbNXlk + this.AhwBna;
        }
        android.graphics.Bitmap bitmap = this.EZpvd;
        if (bitmap != null) {
            if (this.isConnected.length() > 0) {
                canvas.drawLine(f3, f, f3, f2, this.OLrzqt);
                f3 += this.AYXKKw + this.AhwBna;
            }
            canvas.drawBitmap(bitmap, f3, this.valueOf.centerY() - (this.AEQbTJ / 2), (android.graphics.Paint) null);
        }
    }

    public final float KWHzl() {
        float f = this.isConnected.length() > 0 ? 0.0f + (this.AhwBna * 2) + this.DbNXlk : 0.0f;
        if (this.EZpvd == null) {
            return f;
        }
        float f2 = f + this.AhwBna + this.AEQbTJ;
        return this.isConnected.length() > 0 ? f2 + this.AYXKKw + this.AhwBna : f2;
    }

    public final float copydefault() {
        return java.lang.Math.max(this.fetchVPNInfo.height(), this.AEQbTJ) + (this.AkhnZx * 2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(KWHzl(i, (int) (KWHzl() + getPaddingStart() + getPaddingEnd())), KWHzl(i2, (int) (copydefault() + getPaddingTop() + getPaddingBottom())));
    }

    public final int KWHzl(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i2 : View.MeasureSpec.getSize(i);
        }
        return java.lang.Math.min(View.MeasureSpec.getSize(i), i2);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.graphics.Bitmap bitmap = this.EZpvd;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.EZpvd = null;
    }
}
