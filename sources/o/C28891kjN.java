package o;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.business.dex.utils.CDNSourceManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28891kjN extends LinearLayoutCompat {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public int AEQbTJ;
    public boolean AhwBna;
    public android.animation.ValueAnimator EZpvd;
    public final C21637hGt KWHzl;
    public boolean copydefault;
    public Application djBIcL;
    public long gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28891kjN(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28891kjN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:44) call: o.kjN.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28891kjN(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28891kjN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C21637hGt c21637hGtCopydefault = C21637hGt.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c21637hGtCopydefault, "");
        this.KWHzl = c21637hGtCopydefault;
        this.valueOf = -1;
        this.gEmmrt = 1200L;
        setupPillShape();
        setupShimmer();
    }

    public final void setupPillShape() {
        setBackground(copydefault());
    }

    /* JADX INFO: renamed from: o.kjN$ActionBar */
    public static final class ActionBar extends android.graphics.drawable.Drawable {
        public final android.graphics.Paint OLrzqt = new android.graphics.Paint(1);
        public final android.graphics.Path AEQbTJ = new android.graphics.Path();

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        public ActionBar() {
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas canvas) {
            Application application;
            Intrinsics.checkNotNullParameter(canvas, "");
            RectF rectF = new RectF(getBounds());
            float fHeight = rectF.height() / 2.0f;
            this.OLrzqt.setColor(C28891kjN.this.AEQbTJ);
            this.OLrzqt.setStyle(Paint.Style.FILL);
            this.AEQbTJ.reset();
            this.AEQbTJ.addRoundRect(rectF, fHeight, fHeight, Path.Direction.CW);
            canvas.drawPath(this.AEQbTJ, this.OLrzqt);
            if (!C28891kjN.this.AhwBna || (application = C28891kjN.this.djBIcL) == null) {
                return;
            }
            canvas.save();
            canvas.clipPath(this.AEQbTJ);
            application.setBounds(getBounds());
            application.draw(canvas);
            canvas.restore();
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.OLrzqt.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.OLrzqt.setColorFilter(colorFilter);
        }
    }

    public final android.graphics.drawable.Drawable copydefault() {
        return new ActionBar();
    }

    public final void setupShimmer() {
        this.djBIcL = new Application(this.valueOf);
    }

    public static /* synthetic */ void setContent$default(C28891kjN c28891kjN, java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            drawable = null;
        }
        if ((i & 4) != 0) {
            drawable2 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        c28891kjN.setContent(charSequence, drawable, drawable2, z);
    }

    public final void setContent(java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, boolean z) {
        C21637hGt c21637hGt = this.KWHzl;
        c21637hGt.KWHzl.setText(charSequence);
        AppCompatImageView appCompatImageView = c21637hGt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(drawable != null ? 0 : 8);
        c21637hGt.EZpvd.setImageDrawable(drawable);
        LottieAnimationView lottieAnimationView = c21637hGt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        lottieAnimationView.setVisibility((drawable2 != null || z) ? 0 : 8);
        if (z) {
            LottieAnimationView lottieAnimationView2 = c21637hGt.AEQbTJ;
            Intrinsics.copydefault(lottieAnimationView2);
            C22361hds.OLrzqt(lottieAnimationView2, CDNSourceManager.LottieSource.DEX_MARKET_MEME_LOADING);
            lottieAnimationView2.playAnimation();
            return;
        }
        c21637hGt.AEQbTJ.setImageDrawable(drawable2);
    }

    public static /* synthetic */ void setTextStyle$default(C28891kjN c28891kjN, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        c28891kjN.setTextStyle(i, z);
    }

    public final void setTextStyle(int i, boolean z) {
        android.widget.TextView textView = this.KWHzl.KWHzl;
        android.content.res.ColorStateList textColors = z ? textView.getTextColors() : null;
        textView.setTextAppearance(i);
        if (textColors != null) {
            textView.setTextColor(textColors);
        }
    }

    public static /* synthetic */ void setContentPadding$default(C28891kjN c28891kjN, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = -1.0f;
        }
        if ((i & 2) != 0) {
            f2 = -1.0f;
        }
        c28891kjN.setContentPadding(f, f2);
    }

    public final void setContentPadding(float f, float f2) {
        if (f >= 0.0f || f2 >= 0.0f) {
            LinearLayoutCompat root = this.KWHzl.getRoot();
            int iDp2pxFloat$default = f >= 0.0f ? (int) C55298xhM.dp2pxFloat$default(f, null, 1, null) : root.getPaddingLeft();
            int iDp2pxFloat$default2 = f2 >= 0.0f ? (int) C55298xhM.dp2pxFloat$default(f2, null, 1, null) : root.getPaddingTop();
            root.setPadding(iDp2pxFloat$default, iDp2pxFloat$default2, iDp2pxFloat$default, iDp2pxFloat$default2);
        }
    }

    public final void setPillBackgroundColor(@androidx.annotation.ColorInt int i) {
        this.AEQbTJ = i;
        invalidate();
    }

    public static /* synthetic */ void setShimmerColor$default(C28891kjN c28891kjN, int i, float f, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.5f;
        }
        c28891kjN.setShimmerColor(i, f);
    }

    public final void setShimmerColor(@androidx.annotation.ColorInt int i, float f) {
        int iArgb = Color.argb((int) (f * 255), Color.red(i), Color.green(i), Color.blue(i));
        this.valueOf = iArgb;
        Application application = this.djBIcL;
        if (application != null) {
            application.KWHzl(iArgb);
        }
        invalidate();
    }

    public final void setShimmerVisible(boolean z) {
        this.AhwBna = z;
        if (!z) {
            AEQbTJ();
        }
        invalidate();
    }

    public static /* synthetic */ void setShimmerEnabled$default(C28891kjN c28891kjN, boolean z, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 0.25f;
        }
        c28891kjN.setShimmerEnabled(z, f);
    }

    public final void setShimmerEnabled(boolean z, float f) {
        this.copydefault = z;
        this.AhwBna = true;
        if (z) {
            OLrzqt();
            return;
        }
        AEQbTJ();
        Application application = this.djBIcL;
        if (application != null) {
            application.copydefault(f);
        }
        invalidate();
    }

    public final void OLrzqt() {
        android.animation.ValueAnimator valueAnimator = this.EZpvd;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(this.gEmmrt);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setRepeatMode(1);
            valueAnimatorOfFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.kjM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                    C28891kjN.AEQbTJ(this.AEQbTJ, valueAnimator2);
                }
            });
            valueAnimatorOfFloat.start();
            this.EZpvd = valueAnimatorOfFloat;
        }
    }

    public static final void AEQbTJ(C28891kjN c28891kjN, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        float fFloatValue = ((java.lang.Float) animatedValue).floatValue();
        Application application = c28891kjN.djBIcL;
        if (application != null) {
            application.copydefault(fFloatValue);
        }
        c28891kjN.invalidate();
    }

    public final void AEQbTJ() {
        android.animation.ValueAnimator valueAnimator = this.EZpvd;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.EZpvd = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AEQbTJ();
    }

    /* JADX INFO: renamed from: o.kjN$Application */
    public final class Application extends android.graphics.drawable.Drawable {
        public int AEQbTJ;
        public final android.graphics.Paint copydefault = new android.graphics.Paint(1);
        public float OLrzqt = 0.1f;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(float f) {
            this.OLrzqt = f;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        public Application(int i) {
            this.AEQbTJ = i;
            copydefault();
        }

        public final void KWHzl(int i) {
            this.AEQbTJ = i;
            copydefault();
        }

        public final void copydefault() {
            this.copydefault.setShader(new LinearGradient(0.0f, 0.0f, C55298xhM.dp2pxFloat$default(40.0f, null, 1, null), 0.0f, new int[]{0, this.AEQbTJ, 0}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.MIRROR));
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NotNull android.graphics.Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "");
            RectF rectF = new RectF(getBounds());
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            float fDp2pxFloat$default = C55298xhM.dp2pxFloat$default(40.0f, null, 1, null);
            float fSqrt = (float) java.lang.Math.sqrt((fWidth * fWidth) + (fHeight * fHeight));
            float f = 0.5f * fSqrt;
            float f2 = this.OLrzqt;
            canvas.save();
            canvas.translate((-f) + ((fWidth + (2 * f)) * f2), 0.0f);
            canvas.translate(fDp2pxFloat$default / 2.0f, fHeight / 2.0f);
            canvas.rotate(45.0f);
            canvas.translate((-fDp2pxFloat$default) / 2.0f, (-fSqrt) / 2.0f);
            canvas.drawRect(0.0f, 0.0f, fDp2pxFloat$default, fSqrt, this.copydefault);
            canvas.restore();
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.copydefault.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.copydefault.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: renamed from: o.kjN$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kjN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
