package com.okinc.im.widgets.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C35399nuc;
import o.C52761wXj;
import o.yII;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class VerticalVignetteDrawable extends Drawable {
    private static final int DEFAULT_GRADIENT_DISTANCE = 160;
    private LinearGradient bottomGradient;
    private final int colour;
    private final float gradientDistancePx;
    private final int minHeightPx;
    private final Paint paint;
    private LinearGradient topGradient;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.minHeightPx;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.widgets.drawable.VerticalVignetteDrawable.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0006: INVOKE (wrap:int:0x0004: SGET  A[WRAPPED] o.wXj.Activity.HJWChPOKBmQN int), (r1v0 android.content.Context) STATIC call: o.mpX.OLrzqt(int, android.content.Context):int A[MD:(int, android.content.Context):int (m), WRAPPED] (LINE:53)) : (r2v0 int))
  (wrap:float:?: TERNARY null = ((wrap:int:0x000a: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (160.0f float) : (r3v0 float))
 A[MD:(android.content.Context, int, float):void (m)] (LINE:51) call: com.okinc.im.widgets.drawable.VerticalVignetteDrawable.<init>(android.content.Context, int, float):void type: THIS */
    public /* synthetic */ VerticalVignetteDrawable(Context context, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? C33070mpX.OLrzqt(C52761wXj.Activity.HJWChPOKBmQN, context) : i, (i2 & 4) != 0 ? 160.0f : f);
    }

    public VerticalVignetteDrawable(@NotNull Context context, @ColorInt int i, @Dimension(unit = 0) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        this.paint = new Paint(1);
        this.colour = i;
        float f2 = f * context.getResources().getDisplayMetrics().density;
        this.gradientDistancePx = f2;
        this.minHeightPx = yII.EZpvd(f2 * 2);
    }

    public VerticalVignetteDrawable(@NotNull Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "");
        this.paint = new Paint(1);
        float f = context.getResources().getDisplayMetrics().density;
        int iOLrzqt = C33070mpX.OLrzqt(C52761wXj.Activity.HJWChPOKBmQN, context);
        float f2 = 160;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C35399nuc.VoiceInteractor.RJOkX, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.colour = typedArrayObtainStyledAttributes.getColor(C35399nuc.VoiceInteractor.QVAiDq, iOLrzqt);
            float dimension = typedArrayObtainStyledAttributes.getDimension(C35399nuc.VoiceInteractor.QfsBiF, f2 * f);
            this.gradientDistancePx = dimension;
            typedArrayObtainStyledAttributes.recycle();
            this.minHeightPx = yII.EZpvd(dimension * 2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        LinearGradient linearGradient = this.topGradient;
        if (linearGradient != null) {
            this.paint.setShader(linearGradient);
            canvas.drawRect(0.0f, 0.0f, getBounds().width(), this.gradientDistancePx, this.paint);
        }
        LinearGradient linearGradient2 = this.bottomGradient;
        if (linearGradient2 != null) {
            this.paint.setShader(linearGradient2);
            canvas.drawRect(0.0f, getBounds().height() - this.gradientDistancePx, getBounds().width(), getBounds().height(), this.paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "");
        if (rect.isEmpty()) {
            this.topGradient = null;
            this.bottomGradient = null;
            return;
        }
        float f = this.gradientDistancePx;
        int i = this.colour;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.topGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f, i, 0, tileMode);
        this.bottomGradient = new LinearGradient(0.0f, rect.height() - this.gradientDistancePx, 0.0f, rect.height(), 0, this.colour, tileMode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }
}
