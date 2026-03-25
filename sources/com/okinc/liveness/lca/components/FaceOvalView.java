package com.okinc.liveness.lca.components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.okinc.liveness.lca.data.VideoViewportSize;
import com.okinc.liveness.lca.manager.FaceCaptchaManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55298xhM;
import o.C56548yJl;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class FaceOvalView extends View {
    public static final String TAG = "faceovalview";
    public final long ANIMATION_DURATION;
    public final int BLUR_BACKGROUND_CLOR;
    public final int DEFAULT_STROKE_COLOR;
    public float animationProgress;
    public ValueAnimator animator;
    public OnBlurBackgroundReadyListener blurBackgroundReadyListener;
    public Bitmap blurBitmap;
    public final Paint blurPaint;
    public boolean blurReadyNotificationSent;
    public final float blurScale;
    public RectF currentFaceGuideRect;
    public final Paint gradientPaint;
    public boolean needUpdateBlur;
    public final Paint paint;
    public int progressColor;
    public final Paint progressPaint;
    public int progressValue;
    public RectF scaledBoundingRect;
    public int strokeColor;
    public RectF targetFaceGuideRect;
    public VideoViewportSize videoViewportSize;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public interface OnBlurBackgroundReadyListener {
        void onBlurBackgroundReady();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceOvalView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceOvalView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final float lerp(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: com.okinc.liveness.lca.components.FaceOvalView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ FaceOvalView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceOvalView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.paint = new Paint(1);
        this.animationProgress = 1.0f;
        this.BLUR_BACKGROUND_CLOR = -7829368;
        int color = Color.parseColor("#FFFFFFFF");
        this.DEFAULT_STROKE_COLOR = color;
        this.strokeColor = color;
        this.ANIMATION_DURATION = 300L;
        this.gradientPaint = new Paint(1);
        this.blurScale = 0.05f;
        this.needUpdateBlur = true;
        Paint paint = new Paint(1);
        setAlpha(0.9f);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.blurPaint = paint;
        this.progressColor = -16711936;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(C55298xhM.dp2pxFloat$default(6.0f, null, 1, null));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(this.progressColor);
        this.progressPaint = paint2;
        setLayerType(2, null);
        updateGradientPaint();
    }

    public final void setOnBlurBackgroundReadyListener(@NotNull OnBlurBackgroundReadyListener onBlurBackgroundReadyListener) {
        Intrinsics.checkNotNullParameter(onBlurBackgroundReadyListener, "");
        this.blurBackgroundReadyListener = onBlurBackgroundReadyListener;
        if (this.blurBitmap == null || this.blurReadyNotificationSent) {
            return;
        }
        onBlurBackgroundReadyListener.onBlurBackgroundReady();
        this.blurReadyNotificationSent = true;
    }

    public final void setStrokeColor(int i) {
        this.strokeColor = i;
        invalidate();
    }

    public final void resetColor() {
        setStrokeColor(this.DEFAULT_STROKE_COLOR);
    }

    public final void setStrokeColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            this.strokeColor = Color.parseColor(str);
            invalidate();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public final void setProgress(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        this.progressValue = i;
        invalidate();
    }

    public final void setProgressColor(int i) {
        this.progressColor = i;
        this.progressPaint.setColor(i);
        invalidate();
    }

    public final void startAnimation(final RectF rectF, final RectF rectF2) {
        post(new Runnable() { // from class: com.okinc.liveness.lca.components.FaceOvalView$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                FaceOvalView.startAnimation$lambda$4(this.f$0, rectF2, rectF);
            }
        });
    }

    public static final void startAnimation$lambda$4(final FaceOvalView faceOvalView, RectF rectF, RectF rectF2) {
        ValueAnimator valueAnimator = faceOvalView.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (rectF == null) {
            faceOvalView.currentFaceGuideRect = null;
            faceOvalView.targetFaceGuideRect = null;
            faceOvalView.scaledBoundingRect = null;
            faceOvalView.animationProgress = 1.0f;
            faceOvalView.invalidate();
            return;
        }
        if (rectF2 == null) {
            faceOvalView.currentFaceGuideRect = new RectF(rectF);
            faceOvalView.targetFaceGuideRect = new RectF(rectF);
            faceOvalView.animationProgress = 1.0f;
            faceOvalView.updateScaledBoundingRect();
            faceOvalView.invalidate();
            return;
        }
        faceOvalView.currentFaceGuideRect = new RectF(rectF2);
        faceOvalView.targetFaceGuideRect = new RectF(rectF);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(faceOvalView.ANIMATION_DURATION);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.okinc.liveness.lca.components.FaceOvalView$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                FaceOvalView.startAnimation$lambda$4$lambda$3$lambda$2(this.f$0, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.start();
        faceOvalView.animator = valueAnimatorOfFloat;
    }

    public static final void startAnimation$lambda$4$lambda$3$lambda$2(FaceOvalView faceOvalView, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        faceOvalView.animationProgress = ((Float) animatedValue).floatValue();
        faceOvalView.updateScaledBoundingRect();
        faceOvalView.invalidate();
    }

    public final void updateScaledBoundingRect() {
        RectF rectF;
        if (this.videoViewportSize == null || (rectF = this.currentFaceGuideRect) == null || this.targetFaceGuideRect == null) {
            return;
        }
        Intrinsics.copydefault(rectF);
        float f = rectF.left;
        RectF rectF2 = this.targetFaceGuideRect;
        Intrinsics.copydefault(rectF2);
        float fLerp = lerp(f, rectF2.left, this.animationProgress);
        RectF rectF3 = this.currentFaceGuideRect;
        Intrinsics.copydefault(rectF3);
        float f2 = rectF3.top;
        RectF rectF4 = this.targetFaceGuideRect;
        Intrinsics.copydefault(rectF4);
        float fLerp2 = lerp(f2, rectF4.top, this.animationProgress);
        RectF rectF5 = this.currentFaceGuideRect;
        Intrinsics.copydefault(rectF5);
        float f3 = rectF5.right;
        RectF rectF6 = this.targetFaceGuideRect;
        Intrinsics.copydefault(rectF6);
        float fLerp3 = lerp(f3, rectF6.right, this.animationProgress);
        RectF rectF7 = this.currentFaceGuideRect;
        Intrinsics.copydefault(rectF7);
        float f4 = rectF7.bottom;
        RectF rectF8 = this.targetFaceGuideRect;
        Intrinsics.copydefault(rectF8);
        RectF rectF9 = new RectF(fLerp, fLerp2, fLerp3, lerp(f4, rectF8.bottom, this.animationProgress));
        VideoViewportSize videoViewportSize = this.videoViewportSize;
        Intrinsics.copydefault(videoViewportSize);
        this.scaledBoundingRect = videoViewportSize.getScaledBoundingRect(rectF9);
    }

    public final void updateFarFaceOval(FaceCaptchaManager faceCaptchaManager) {
        this.videoViewportSize = faceCaptchaManager != null ? faceCaptchaManager.getVideoViewportSize() : null;
        startAnimation(this.currentFaceGuideRect, faceCaptchaManager != null ? faceCaptchaManager.getFarFaceOvalRect() : null);
    }

    public final void updateCloseFaceOval(FaceCaptchaManager faceCaptchaManager) {
        this.videoViewportSize = faceCaptchaManager != null ? faceCaptchaManager.getVideoViewportSize() : null;
        startAnimation(this.currentFaceGuideRect, faceCaptchaManager != null ? faceCaptchaManager.getCloseFaceOvalRect() : null);
    }

    public final void reset() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.currentFaceGuideRect = null;
        this.targetFaceGuideRect = null;
        this.videoViewportSize = null;
        this.scaledBoundingRect = null;
        this.strokeColor = this.DEFAULT_STROKE_COLOR;
        this.animationProgress = 1.0f;
        this.progressValue = 0;
        invalidate();
    }

    public final void createBlurBitmap() {
        if (this.needUpdateBlur) {
            try {
                if (getWidth() <= 0 || getHeight() <= 0) {
                    pUU.valueOf(TAG, "Invalid dimensions: width=" + getWidth() + ", height=" + getHeight());
                    return;
                }
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    new Canvas(bitmapCreateBitmap).drawColor(this.BLUR_BACKGROUND_CLOR);
                    Intrinsics.copydefault(bitmapCreateBitmap);
                    try {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, C56548yJl.copydefault((int) (getWidth() * this.blurScale), 1), C56548yJl.copydefault((int) (getHeight() * this.blurScale), 1), true);
                        Intrinsics.copydefault(bitmapCreateScaledBitmap);
                        try {
                            Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, getWidth(), getHeight(), true);
                            Intrinsics.copydefault(bitmapCreateScaledBitmap2);
                            Bitmap bitmap = this.blurBitmap;
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                            this.blurBitmap = bitmapCreateScaledBitmap2;
                            bitmapCreateBitmap.recycle();
                            bitmapCreateScaledBitmap.recycle();
                            this.needUpdateBlur = false;
                            post(new Runnable() { // from class: com.okinc.liveness.lca.components.FaceOvalView$$ExternalSyntheticLambda0
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    FaceOvalView.createBlurBitmap$lambda$6(this.f$0);
                                }
                            });
                        } catch (Exception e) {
                            pUU.OLrzqt(TAG, "Failed to create final bitmap", e);
                            bitmapCreateBitmap.recycle();
                            bitmapCreateScaledBitmap.recycle();
                        }
                    } catch (Exception e2) {
                        pUU.OLrzqt(TAG, "Failed to create scaled bitmap", e2);
                        bitmapCreateBitmap.recycle();
                    }
                } catch (OutOfMemoryError e3) {
                    pUU.OLrzqt(TAG, "Failed to create original bitmap", e3);
                }
            } catch (Exception e4) {
                pUU.OLrzqt(TAG, "Error creating blur bitmap", e4);
            }
        }
    }

    public static final void createBlurBitmap$lambda$6(FaceOvalView faceOvalView) {
        if (faceOvalView.blurReadyNotificationSent) {
            return;
        }
        OnBlurBackgroundReadyListener onBlurBackgroundReadyListener = faceOvalView.blurBackgroundReadyListener;
        if (onBlurBackgroundReadyListener != null) {
            onBlurBackgroundReadyListener.onBlurBackgroundReady();
        }
        faceOvalView.blurReadyNotificationSent = true;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        updateGradientPaint();
        this.needUpdateBlur = true;
        this.blurReadyNotificationSent = false;
        invalidate();
    }

    public final void updateBlurBackground() {
        this.needUpdateBlur = true;
        this.blurReadyNotificationSent = false;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (this.videoViewportSize == null || this.scaledBoundingRect == null) {
            return;
        }
        if (this.needUpdateBlur) {
            post(new Runnable() { // from class: com.okinc.liveness.lca.components.FaceOvalView$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.createBlurBitmap();
                }
            });
        }
        int width = getWidth();
        VideoViewportSize videoViewportSize = this.videoViewportSize;
        Intrinsics.copydefault(videoViewportSize);
        int width2 = (width - videoViewportSize.getViewportPixelSize().getWidth()) / 2;
        int height = getHeight();
        VideoViewportSize videoViewportSize2 = this.videoViewportSize;
        Intrinsics.copydefault(videoViewportSize2);
        Point point = new Point(width2, (height - videoViewportSize2.getViewportPixelSize().getHeight()) / 2);
        float f = point.x;
        RectF rectF = this.scaledBoundingRect;
        Intrinsics.copydefault(rectF);
        float f2 = rectF.left;
        float f3 = point.y;
        RectF rectF2 = this.scaledBoundingRect;
        Intrinsics.copydefault(rectF2);
        PointF pointF = new PointF(f + f2, f3 + rectF2.top);
        RectF rectF3 = this.scaledBoundingRect;
        Intrinsics.copydefault(rectF3);
        float f4 = rectF3.right;
        RectF rectF4 = this.scaledBoundingRect;
        Intrinsics.copydefault(rectF4);
        float f5 = rectF4.left;
        RectF rectF5 = this.scaledBoundingRect;
        Intrinsics.copydefault(rectF5);
        float f6 = rectF5.bottom;
        RectF rectF6 = this.scaledBoundingRect;
        Intrinsics.copydefault(rectF6);
        SizeF sizeF = new SizeF(f4 - f5, f6 - rectF6.top);
        float f7 = pointF.x;
        RectF rectF7 = new RectF(f7, pointF.y, sizeF.getWidth() + f7, pointF.y + sizeF.getHeight());
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        Path path = new Path();
        path.addRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), Path.Direction.CW);
        path.addOval(rectF7, Path.Direction.CCW);
        canvas.clipPath(path);
        Bitmap bitmap = this.blurBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.blurPaint);
        }
        canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.gradientPaint);
        canvas.restoreToCount(iSaveLayer);
        Paint paint = this.paint;
        paint.setColor(this.strokeColor);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C55298xhM.dp2pxFloat$default(6.0f, null, 1, null));
        canvas.drawOval(rectF7, this.paint);
        int i = this.progressValue;
        if (i > 0) {
            float f8 = ((i / 100.0f) * 360.0f) / 2.0f;
            canvas.drawArc(rectF7, 90.0f, -f8, false, this.progressPaint);
            canvas.drawArc(rectF7, 90.0f, f8, false, this.progressPaint);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Bitmap bitmap = this.blurBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.blurBitmap = null;
        this.blurBackgroundReadyListener = null;
    }

    public final void updateGradientPaint() {
        this.gradientPaint.setAntiAlias(true);
        this.gradientPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), new int[]{Color.argb(255, 0, 0, 0), Color.argb(0, 128, 128, 128), Color.argb(255, 0, 0, 0)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.components.FaceOvalView.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
