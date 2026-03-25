package o;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.StaticLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oJx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C35955oJx extends AppCompatTextView {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public android.animation.ValueAnimator AEQbTJ;
    public boolean AYXKKw;
    public int AhwBna;
    public final float AkhnZx;
    public android.animation.ValueAnimator DbNXlk;
    public boolean EZpvd;
    public float OLrzqt;
    public boolean copydefault;
    public long djBIcL;
    public float fIwbmz;
    public final android.graphics.Paint fetchVPNInfo;
    public java.lang.CharSequence gEmmrt;
    public int isConnected;
    public android.text.Layout valueOf;
    public long values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35955oJx(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35955oJx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoStart(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShimmerDuration(long j) {
        this.djBIcL = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShimmerWidth(int i) {
        this.isConnected = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextTransitionAnimationEnabled(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextTransitionDuration(long j) {
        this.values = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] android.R.attr.textViewStyle int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:32) call: o.oJx.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C35955oJx(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? android.R.attr.textViewStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35955oJx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = -1;
        this.isConnected = 20;
        this.AkhnZx = 0.3f;
        this.djBIcL = 1001L;
        this.copydefault = true;
        this.values = 200L;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.fetchVPNInfo = paint;
        this.values = context.getResources().getInteger(android.R.integer.config_shortAnimTime);
        int[] iArr = C35399nuc.VoiceInteractor.wlaJM;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setShimmerColor(typedArrayObtainStyledAttributes.getColor(C35399nuc.VoiceInteractor.gHZMYf, -1));
        this.isConnected = typedArrayObtainStyledAttributes.getInt(C35399nuc.VoiceInteractor.AwvSrB, 20);
        this.djBIcL = typedArrayObtainStyledAttributes.getInt(C35399nuc.VoiceInteractor.zuBGHE, 1001);
        this.copydefault = typedArrayObtainStyledAttributes.getBoolean(C35399nuc.VoiceInteractor.zLjUOn, true);
        this.AYXKKw = typedArrayObtainStyledAttributes.getBoolean(C35399nuc.VoiceInteractor.AuCTelauCTel, false);
        typedArrayObtainStyledAttributes.recycle();
        paint.set(getPaint());
        paint.setColor(this.AhwBna);
    }

    /* JADX INFO: renamed from: o.oJx$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oJx.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void setShimmerColor(int i) {
        this.AhwBna = i;
        this.fetchVPNInfo.setColor(i);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.copydefault) {
            copydefault();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        OLrzqt();
        android.animation.ValueAnimator valueAnimator = this.DbNXlk;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, TextView.BufferType bufferType) {
        java.lang.CharSequence text;
        Layout.Alignment alignment;
        if (this.AYXKKw && getWidth() > 0 && (text = getText()) != null && text.length() != 0 && !Intrinsics.EZpvd(charSequence, getText())) {
            java.lang.CharSequence text2 = getText();
            this.gEmmrt = text2;
            if (text2 == null) {
                text2 = "";
            }
            android.text.TextPaint paint = getPaint();
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            android.text.Layout layout = getLayout();
            if (layout == null || (alignment = layout.getAlignment()) == null) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            this.valueOf = StaticLayout.Builder.obtain(text2, 0, text2.length(), paint, (width - paddingLeft) - paddingRight).setAlignment(alignment).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).build();
            super.setText(charSequence, bufferType);
            KWHzl();
            return;
        }
        super.setText(charSequence, bufferType);
    }

    public final void KWHzl() {
        android.animation.ValueAnimator valueAnimator = this.DbNXlk;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.values);
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.oJG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                C35955oJx.AEQbTJ(this.copydefault, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.addListener(new Activity());
        this.DbNXlk = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public static final void AEQbTJ(C35955oJx c35955oJx, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c35955oJx.fIwbmz = ((java.lang.Float) animatedValue).floatValue();
        c35955oJx.invalidate();
    }

    /* JADX INFO: renamed from: o.oJx$Activity */
    public static final class Activity extends android.animation.AnimatorListenerAdapter {
        public Activity() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C35955oJx.this.valueOf = null;
            C35955oJx.this.gEmmrt = null;
        }
    }

    public final void copydefault() {
        if (this.EZpvd) {
            return;
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.djBIcL);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.oJz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C35955oJx.copydefault(this.AEQbTJ, valueAnimator);
            }
        });
        this.AEQbTJ = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
        this.EZpvd = true;
    }

    public static final void copydefault(C35955oJx c35955oJx, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c35955oJx.OLrzqt = ((java.lang.Float) animatedValue).floatValue();
        c35955oJx.invalidate();
    }

    public final void OLrzqt() {
        android.animation.ValueAnimator valueAnimator = this.AEQbTJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.EZpvd = false;
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        if (this.valueOf != null) {
            float height = getHeight();
            float f = (-height) * this.fIwbmz;
            float totalPaddingLeft = getTotalPaddingLeft();
            float totalPaddingTop = getTotalPaddingTop();
            int iSave = canvas.save();
            canvas.translate(totalPaddingLeft, totalPaddingTop + f);
            try {
                android.text.Layout layout = this.valueOf;
                if (layout != null) {
                    layout.draw(canvas);
                }
                canvas.restoreToCount(iSave);
                iSave = canvas.save();
                canvas.translate(0.0f, f);
                try {
                    AEQbTJ(canvas, java.lang.String.valueOf(this.gEmmrt), this.valueOf);
                    canvas.restoreToCount(iSave);
                    float f2 = this.fIwbmz;
                    iSave = canvas.save();
                    canvas.translate(0.0f, height * (1.0f - f2));
                    try {
                        super.onDraw(canvas);
                        AEQbTJ(canvas, getText().toString(), getLayout());
                        return;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        }
        super.onDraw(canvas);
        AEQbTJ(canvas, getText().toString(), getLayout());
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, java.lang.String str, android.text.Layout layout) {
        if (!this.EZpvd || str.length() == 0 || layout == null) {
            return;
        }
        float f = this.OLrzqt;
        if (f < 0.5f) {
            return;
        }
        int length = str.length();
        this.fetchVPNInfo.setTypeface(getPaint().getTypeface());
        this.fetchVPNInfo.setTextSize(getPaint().getTextSize());
        float f2 = (((f - 0.5f) * 2) * (length + (r7 * 2))) - this.isConnected;
        int iFloor = (int) java.lang.Math.floor(f2 - r3);
        int iMax = java.lang.Math.max(0, iFloor);
        int iMin = java.lang.Math.min(length, (int) java.lang.Math.ceil(this.isConnected + f2));
        float totalPaddingLeft = getTotalPaddingLeft();
        float totalPaddingTop = getTotalPaddingTop();
        int iSave = canvas.save();
        canvas.translate(totalPaddingLeft, totalPaddingTop);
        try {
            float f3 = (this.isConnected * this.AkhnZx) / 2.0f;
            for (int i = iMax; i < iMin; i++) {
                float fAbs = java.lang.Math.abs(i - f2);
                int i2 = 255;
                if (fAbs > f3) {
                    float f4 = this.isConnected;
                    i2 = fAbs >= f4 ? 0 : (int) ((1.0f - ((fAbs - f3) / (f4 - f3))) * 255);
                }
                if (i2 > 0) {
                    this.fetchVPNInfo.setAlpha(i2);
                    canvas.drawText(str, i, i + 1, layout.getPrimaryHorizontal(i), layout.getLineBaseline(layout.getLineForOffset(i)), this.fetchVPNInfo);
                }
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }
}
