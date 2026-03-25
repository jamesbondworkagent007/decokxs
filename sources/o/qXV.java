package o;

import android.animation.ValueAnimator;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import com.okinc.market.ext.UpDownColor;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.pVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class qXV extends android.view.View {
    public int AEQbTJ;
    public int AYXKKw;
    public float AhwBna;
    public final android.graphics.Paint EZpvd;
    public int KWHzl;
    public android.animation.ValueAnimator OLrzqt;
    public int copydefault;
    public int djBIcL;
    public final android.graphics.Paint gEmmrt;
    public int valueOf;
    public final android.graphics.Paint values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qXV(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qXV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.qXV.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ qXV(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qXV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = 100;
        this.AYXKKw = -13517467;
        this.KWHzl = -1052689;
        this.AEQbTJ = 300;
        this.copydefault = 1613872485;
        this.AhwBna = C55298xhM.dp$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.gEmmrt = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(style);
        this.values = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setStyle(style);
        this.EZpvd = paint3;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, pVX.FragmentManager.accept, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.djBIcL = typedArrayObtainStyledAttributes.getInteger(pVX.FragmentManager.OqFWZa, this.djBIcL);
        this.valueOf = typedArrayObtainStyledAttributes.getInteger(pVX.FragmentManager.ODWQjV, this.valueOf);
        this.AYXKKw = typedArrayObtainStyledAttributes.getColor(pVX.FragmentManager.DXXBbs, this.AYXKKw);
        this.KWHzl = typedArrayObtainStyledAttributes.getColor(pVX.FragmentManager.AxsJAYsNCnLh, this.KWHzl);
        this.AEQbTJ = typedArrayObtainStyledAttributes.getInteger(pVX.FragmentManager.DAIeex, this.AEQbTJ);
        this.copydefault = typedArrayObtainStyledAttributes.getColor(pVX.FragmentManager.QKudOq, this.AYXKKw);
        this.AhwBna = typedArrayObtainStyledAttributes.getDimension(pVX.FragmentManager.DarRvM, C55298xhM.dp$default(24, (android.content.Context) null, 1, (java.lang.Object) null));
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        paint2.setColor(this.AYXKKw);
        paint3.setColor(this.KWHzl);
        paint.setColor(this.copydefault);
        paint.setMaskFilter(new BlurMaskFilter(this.AhwBna, BlurMaskFilter.Blur.SOLID));
        if (isInEditMode() && this.djBIcL == 0) {
            setProgress$default(this, new java.security.SecureRandom().nextInt(this.valueOf), 0, 2, null);
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = height / 2;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f, f, this.EZpvd);
        float f2 = width * (this.djBIcL / this.valueOf);
        canvas.drawRoundRect(0.0f, 0.0f, f2, height, f, f, this.gEmmrt);
        canvas.drawRoundRect(0.0f, 0.0f, f2, height, f, f, this.values);
    }

    public static /* synthetic */ void setProgress$default(qXV qxv, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = qxv.djBIcL;
        }
        qxv.setProgress(i, i2);
    }

    public final void setProgress(int i, int i2) {
        android.animation.ValueAnimator valueAnimator = this.OLrzqt;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(i2, i);
        valueAnimatorOfInt.setDuration(this.AEQbTJ);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.qXU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                qXV.setProgress$lambda$5$lambda$4(this.OLrzqt, valueAnimator2);
            }
        });
        valueAnimatorOfInt.start();
        this.OLrzqt = valueAnimatorOfInt;
    }

    public static final void setProgress$lambda$5$lambda$4(qXV qxv, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        qxv.djBIcL = ((java.lang.Integer) animatedValue).intValue();
        qxv.invalidate();
    }

    public final void setMax(int i) {
        this.valueOf = i;
        invalidate();
    }

    public final void setProgressColor(int i) {
        this.AYXKKw = i;
        this.values.setColor(i);
        this.copydefault = i;
        this.gEmmrt.setColor(i);
        invalidate();
    }

    public static /* synthetic */ void setProgressColor$default(qXV qxv, UpDownColor upDownColor, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        qxv.setProgressColor(upDownColor, z);
    }

    public final void setProgressColor(@NotNull UpDownColor upDownColor, boolean z) {
        Intrinsics.checkNotNullParameter(upDownColor, "");
        setProgressColor(C41431qqg.getChartColor$default(this, upDownColor, 0, 0, 0, z, 14, null));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.KWHzl = i;
        this.EZpvd.setColor(i);
        invalidate();
    }
}
