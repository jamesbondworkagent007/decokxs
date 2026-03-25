package o;

import android.graphics.Paint;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vkF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51287vkF extends android.view.View {
    public final float AEQbTJ;
    public float AYXKKw;
    public final float EZpvd;
    public final float KWHzl;
    public final android.graphics.Paint OLrzqt;
    public final float copydefault;
    public final android.graphics.Path djBIcL;
    public float valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51287vkF(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51287vkF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:16) call: o.vkF.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51287vkF(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51287vkF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.OLrzqt = paint;
        this.djBIcL = new android.graphics.Path();
        this.AYXKKw = C55298xhM.EZpvd(6.0f, context);
        this.valueOf = 0.99f;
        this.KWHzl = C55298xhM.EZpvd(4.0f, context);
        this.EZpvd = C55298xhM.EZpvd(2.0f, context);
        this.copydefault = 0.98f;
        this.AEQbTJ = 0.05f;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.AYXKKw = getMeasuredHeight() * 0.5f;
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        android.graphics.Paint paint = this.OLrzqt;
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        paint.setColor(C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null));
        float f = this.valueOf;
        if (f > 0.0f && f < 1.0f) {
            float fMin = java.lang.Math.min(f, this.copydefault);
            this.valueOf = fMin;
            this.valueOf = java.lang.Math.max(fMin, this.AEQbTJ);
            float measuredWidth = getMeasuredWidth() * this.valueOf;
            float f2 = this.AYXKKw;
            canvas.drawCircle(f2, f2, f2, this.OLrzqt);
            canvas.drawRect(this.AYXKKw, 0.0f, measuredWidth - this.KWHzl, getMeasuredHeight(), this.OLrzqt);
            this.djBIcL.moveTo(measuredWidth - this.KWHzl, 0.0f);
            this.djBIcL.lineTo(measuredWidth, 0.0f);
            this.djBIcL.lineTo(measuredWidth - this.KWHzl, getMeasuredHeight());
            canvas.drawPath(this.djBIcL, this.OLrzqt);
            this.OLrzqt.setColor(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
            float f3 = measuredWidth + this.EZpvd;
            this.djBIcL.reset();
            this.djBIcL.moveTo(f3, 0.0f);
            this.djBIcL.lineTo(f3 - this.KWHzl, getMeasuredHeight());
            this.djBIcL.lineTo(f3, getMeasuredHeight());
            canvas.drawPath(this.djBIcL, this.OLrzqt);
            canvas.drawRect(f3, 0.0f, getMeasuredWidth() - this.AYXKKw, getMeasuredHeight(), this.OLrzqt);
            float measuredWidth2 = getMeasuredWidth();
            float f4 = this.AYXKKw;
            canvas.drawCircle(measuredWidth2 - f4, f4, f4, this.OLrzqt);
            return;
        }
        if (f != -1.0f && f == 1.0f) {
            this.OLrzqt.setColor(C33512mxp.getRiseUpColor$default(c33512mxp, 0.0f, 1, null));
        } else {
            this.OLrzqt.setColor(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
        }
        float f5 = this.AYXKKw;
        canvas.drawCircle(f5, f5, f5, this.OLrzqt);
        canvas.drawRect(this.AYXKKw, 0.0f, getMeasuredWidth() - this.AYXKKw, getMeasuredHeight(), this.OLrzqt);
        float measuredWidth3 = getMeasuredWidth();
        float f6 = this.AYXKKw;
        canvas.drawCircle(measuredWidth3 - f6, f6, f6, this.OLrzqt);
    }

    public final void setProfitRatio(float f) {
        this.valueOf = f;
        invalidate();
    }
}
