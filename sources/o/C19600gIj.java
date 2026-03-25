package o;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gIj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19600gIj extends AppCompatTextView {
    public android.graphics.Matrix AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public float[] KWHzl;
    public int[] OLrzqt;
    public Shader copydefault;
    public float gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19600gIj(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19600gIj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:16) call: o.gIj.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C19600gIj(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19600gIj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setGradientColors(new int[]{-7303024, C33492mxV.OLrzqt() ? -986896 : -14013910, -7303024}, new float[]{0.0f, 0.5f, 1.0f});
        this.AEQbTJ = new android.graphics.Matrix();
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.gIl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19600gIj.EZpvd(this.copydefault);
            }
        });
    }

    public static /* synthetic */ void setGradientColors$default(C19600gIj c19600gIj, int[] iArr, float[] fArr, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            fArr = null;
        }
        c19600gIj.setGradientColors(iArr, fArr);
    }

    public final void setGradientColors(@NotNull int[] iArr, float[] fArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        this.OLrzqt = iArr;
        this.KWHzl = fArr;
        AEQbTJ();
    }

    public final void setGradientColors(int i, int i2) {
        setGradientColors$default(this, new int[]{i, i2}, null, 2, null);
    }

    public final void setSilverGradient() {
        setGradientColors(new int[]{-4144960, -1, -4144960}, new float[]{0.0f, 0.5f, 1.0f});
    }

    private final void AEQbTJ() {
        int[] iArr = this.OLrzqt;
        if (iArr != null) {
            Intrinsics.copydefault(iArr);
            if (iArr.length == 0) {
                return;
            }
            int[] iArr2 = this.OLrzqt;
            Intrinsics.copydefault(iArr2);
            this.copydefault = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, iArr2, this.KWHzl, Shader.TileMode.CLAMP);
            getPaint().setShader(this.copydefault);
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        post(new java.lang.Runnable() { // from class: o.gIk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C19600gIj.OLrzqt(this.copydefault);
            }
        });
    }

    public static final void OLrzqt(C19600gIj c19600gIj) {
        c19600gIj.EZpvd();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        AEQbTJ();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        AEQbTJ();
    }

    private final android.animation.ValueAnimator OLrzqt() {
        return (android.animation.ValueAnimator) this.EZpvd.getValue();
    }

    public static final android.animation.ValueAnimator EZpvd(C19600gIj c19600gIj) {
        float width = c19600gIj.getWidth() / 2.0f;
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(-width, c19600gIj.getWidth() + width);
        valueAnimatorOfFloat.setDuration(2000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        return valueAnimatorOfFloat;
    }

    public final void EZpvd() {
        OLrzqt().addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.gIq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C19600gIj.KWHzl(this.AEQbTJ, valueAnimator);
            }
        });
        OLrzqt().start();
    }

    public static final void KWHzl(C19600gIj c19600gIj, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.copydefault(valueAnimator);
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        float fFloatValue = ((java.lang.Float) animatedValue).floatValue();
        c19600gIj.gEmmrt = fFloatValue;
        c19600gIj.AEQbTJ.setTranslate(fFloatValue, 0.0f);
        Shader shader = c19600gIj.copydefault;
        if (shader != null) {
            if (shader != null) {
                shader.setLocalMatrix(c19600gIj.AEQbTJ);
            }
            c19600gIj.invalidate();
        }
    }

    public final void copydefault() {
        OLrzqt().cancel();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        copydefault();
    }
}
