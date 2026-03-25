package o;

import android.graphics.Paint;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class wXG extends android.view.View implements InterfaceC52777wXz {
    public java.lang.String AYXKKw;
    public int KWHzl;
    public android.graphics.Paint OLrzqt;
    public android.graphics.Paint djBIcL;
    public int gEmmrt;
    public RelativeLayout.LayoutParams valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wXG(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wXG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.InterfaceC52777wXz
    public void AEQbTJ(int i) {
    }

    @Override // o.InterfaceC52777wXz
    public android.view.View EZpvd() {
        return this;
    }

    @Override // o.InterfaceC52777wXz
    public void EZpvd(int i) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.graphics.Paint KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.graphics.Paint copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBackgroundPaint$OKUILib_uilib(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "");
        this.OLrzqt = paint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTextPaint$OKUILib_uilib(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "");
        this.djBIcL = paint;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.wXG.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wXG(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wXG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(ContextCompat.getColor(context, C52761wXj.Activity.svhCHd));
        paint.setTextSize(C55298xhM.gEmmrt(12.0f, context));
        paint.setAntiAlias(true);
        this.djBIcL = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setColor(ContextCompat.getColor(context, C52761wXj.Activity.GQzpsZ));
        paint2.setAntiAlias(true);
        this.OLrzqt = paint2;
        this.AYXKKw = this.gEmmrt + "/" + this.KWHzl;
        setPadding(C55298xhM.OLrzqt(8, context), C55298xhM.OLrzqt(4, context), C55298xhM.OLrzqt(8, context), C55298xhM.OLrzqt(4, context));
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.invokespecialgBtXYZ);
        setSelectedItem(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.invokespecialdPnHjp, 0));
        KWHzl(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.invokespecialhlXVux, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setSelectedItem(int i) {
        this.gEmmrt = i;
        KWHzl((i + 1) + "/" + this.KWHzl);
    }

    private final void KWHzl(int i) {
        this.KWHzl = i;
        KWHzl(this.gEmmrt + "/" + i);
    }

    private final void KWHzl(java.lang.String str) {
        this.AYXKKw = str;
        invalidate();
        requestLayout();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMeasureText = (int) (KWHzl().measureText(this.AYXKKw) + getPaddingLeft() + getPaddingRight());
        Paint.FontMetrics fontMetrics = KWHzl().getFontMetrics();
        setMeasuredDimension(android.view.View.resolveSize(iMeasureText, i), android.view.View.resolveSize((int) ((fontMetrics.bottom - fontMetrics.top) + getPaddingTop() + getPaddingBottom()), i2));
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = 2;
        float f2 = height / f;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f2, f2, copydefault());
        float fMeasureText = KWHzl().measureText(this.AYXKKw);
        Paint.FontMetrics fontMetrics = KWHzl().getFontMetrics();
        float f3 = fontMetrics.bottom;
        canvas.drawText(this.AYXKKw, (width - fMeasureText) / f, ((height + (f3 - fontMetrics.top)) / f) - f3, KWHzl());
    }

    @Override // o.InterfaceC52777wXz
    public void setCount(int i) {
        KWHzl(i);
    }

    @Override // o.InterfaceC52777wXz
    public void setCount(int i, int i2) {
        KWHzl(i);
        setSelectedItem(i2);
    }

    public RelativeLayout.LayoutParams OLrzqt() {
        if (this.valueOf == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.addRule(21);
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            layoutParams.bottomMargin = C55298xhM.OLrzqt(16, context);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            layoutParams.setMarginEnd(C55298xhM.OLrzqt(24, context2));
            this.valueOf = layoutParams;
        }
        return this.valueOf;
    }

    @Override // o.InterfaceC52777wXz
    public void copydefault(int i, float f, int i2) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            i = (this.KWHzl - 1) - i;
        }
        setSelectedItem(i);
        invalidate();
    }
}
