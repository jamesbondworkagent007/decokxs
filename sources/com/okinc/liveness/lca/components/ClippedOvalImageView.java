package com.okinc.liveness.lca.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.liveness.lca.data.VideoViewportSize;
import com.okinc.liveness.lca.manager.FaceCaptchaManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ClippedOvalImageView extends AppCompatImageView {
    public static final int $stable = 8;
    public final Path clipPath;
    public FaceCaptchaManager faceCaptchaManager;
    public RectF ovalRectF;
    public VideoViewportSize videoViewportSize;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClippedOvalImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClippedOvalImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: com.okinc.liveness.lca.components.ClippedOvalImageView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ ClippedOvalImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClippedOvalImageView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.clipPath = new Path();
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public final void setOvalClipBounds(FaceCaptchaManager faceCaptchaManager) {
        this.faceCaptchaManager = faceCaptchaManager;
        this.videoViewportSize = faceCaptchaManager != null ? faceCaptchaManager.getVideoViewportSize() : null;
        calculateOvalRect();
        updateViewSize();
        invalidate();
    }

    public final void calculateOvalRect() {
        FaceCaptchaManager faceCaptchaManager = this.faceCaptchaManager;
        if (faceCaptchaManager == null || this.videoViewportSize == null) {
            this.ovalRectF = null;
            return;
        }
        RectF closeFaceOvalRect = faceCaptchaManager != null ? faceCaptchaManager.getCloseFaceOvalRect() : null;
        if (closeFaceOvalRect == null) {
            this.ovalRectF = null;
            return;
        }
        VideoViewportSize videoViewportSize = this.videoViewportSize;
        RectF scaledBoundingRect = videoViewportSize != null ? videoViewportSize.getScaledBoundingRect(closeFaceOvalRect) : null;
        if (scaledBoundingRect == null) {
            this.ovalRectF = null;
            return;
        }
        int width = getWidth();
        VideoViewportSize videoViewportSize2 = this.videoViewportSize;
        Intrinsics.copydefault(videoViewportSize2);
        int width2 = (width - videoViewportSize2.getViewportPixelSize().getWidth()) / 2;
        int height = getHeight();
        VideoViewportSize videoViewportSize3 = this.videoViewportSize;
        Intrinsics.copydefault(videoViewportSize3);
        Point point = new Point(width2, (height - videoViewportSize3.getViewportPixelSize().getHeight()) / 2);
        PointF pointF = new PointF(point.x + scaledBoundingRect.left, point.y + scaledBoundingRect.top);
        SizeF sizeF = new SizeF(scaledBoundingRect.right - scaledBoundingRect.left, scaledBoundingRect.bottom - scaledBoundingRect.top);
        float f = pointF.x;
        this.ovalRectF = new RectF(f, pointF.y, sizeF.getWidth() + f, pointF.y + sizeF.getHeight());
    }

    public final void updateViewSize() {
        post(new Runnable() { // from class: com.okinc.liveness.lca.components.ClippedOvalImageView$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ClippedOvalImageView.updateViewSize$lambda$0(this.f$0);
            }
        });
    }

    public static final void updateViewSize$lambda$0(ClippedOvalImageView clippedOvalImageView) {
        if (clippedOvalImageView.ovalRectF != null) {
            ViewGroup.LayoutParams layoutParams = clippedOvalImageView.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            RectF rectF = clippedOvalImageView.ovalRectF;
            Intrinsics.copydefault(rectF);
            layoutParams2.width = (int) rectF.width();
            RectF rectF2 = clippedOvalImageView.ovalRectF;
            Intrinsics.copydefault(rectF2);
            int iHeight = (int) rectF2.height();
            layoutParams2.height = iHeight;
            pUU.EZpvd("ClippedOvalImageView", "params.width=" + layoutParams2.width + " params.height=" + iHeight);
            clippedOvalImageView.setLayoutParams(layoutParams2);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        if (this.ovalRectF == null) {
            super.onDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        this.clipPath.reset();
        this.clipPath.addOval(new RectF(0.0f, 0.0f, getWidth(), getHeight()), Path.Direction.CW);
        canvas.clipPath(this.clipPath);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.faceCaptchaManager = null;
        this.videoViewportSize = null;
        this.ovalRectF = null;
    }
}
