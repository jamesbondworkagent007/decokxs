package com.okinc.liveness.lca.components;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.util.Size;
import android.view.Display;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.amplifyframework.ui.liveness.camera.OpenGLRenderer;
import com.google.common.util.concurrent.ListenableFuture;
import com.okinc.liveness.lca.components.PreviewTextureView;
import com.okinc.liveness.lca.utils.DisplayExtKt;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C42459rTq;
import o.C56529yIt;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class PreviewTextureView extends TextureView {
    public static final int FRAME_UPDATE_THRESHOLD = 5;
    public static final String TAG = "PreviewTextureView";
    public int consecutiveNoUpdates;
    public int diagnosticFrameCount;
    public final long diagnosticLogIntervalMs;
    public int frameUpdateCount;
    public boolean isPendingInitialization;
    public final AtomicBoolean isPreviewStarted;
    public final AtomicBoolean isReleasingResources;
    public long lastDiagnosticLogTime;
    public long lastFrameTime;
    public long lastStallCheckTime;
    public OnPreviewDisplayedListener previewDisplayedListener;
    public int ratioHeight;
    public int ratioWidth;
    public OpenGLRenderer renderer;
    public boolean stallWarningLogged;
    public final AtomicReference<Surface> surfaceRef;
    public final PreviewTextureView$surfaceTextureListenerImpl$1 surfaceTextureListenerImpl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public interface OnPreviewDisplayedListener {
        void onPreviewDisplayed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewTextureView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewTextureView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnPreviewDisplayedListener(OnPreviewDisplayedListener onPreviewDisplayedListener) {
        this.previewDisplayedListener = onPreviewDisplayedListener;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: com.okinc.liveness.lca.components.PreviewTextureView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ PreviewTextureView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.okinc.liveness.lca.components.PreviewTextureView$surfaceTextureListenerImpl$1] */
    public PreviewTextureView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.surfaceRef = new AtomicReference<>(null);
        this.isReleasingResources = new AtomicBoolean(false);
        this.isPreviewStarted = new AtomicBoolean(false);
        this.diagnosticLogIntervalMs = 5000L;
        this.ratioWidth = LivenessCoordinator.TARGET_HEIGHT;
        this.ratioHeight = LivenessCoordinator.TARGET_WIDTH;
        this.surfaceTextureListenerImpl = new TextureView.SurfaceTextureListener() { // from class: com.okinc.liveness.lca.components.PreviewTextureView$surfaceTextureListenerImpl$1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                Intrinsics.checkNotNullParameter(surfaceTexture, "");
                pUU.EZpvd(PreviewTextureView.TAG, "Lca liveness - Surface available");
                this.this$0.setAspectRatio(i2, i3);
                if (this.this$0.isPendingInitialization) {
                    this.this$0.initializeSurface(surfaceTexture, i2, i3);
                    this.this$0.isPendingInitialization = false;
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                Intrinsics.checkNotNullParameter(surfaceTexture, "");
                this.this$0.diagnosticFrameCount++;
                this.this$0.consecutiveNoUpdates = 0;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.this$0.lastFrameTime > 0) {
                    long j = jCurrentTimeMillis - this.this$0.lastFrameTime;
                    if (j > 500 && this.this$0.isPreviewStarted.get()) {
                        pUU.valueOf("kyc_in_house", "Lca liveness - PreviewTextureView STALL: " + j + "ms gap between surface updates");
                    }
                }
                this.this$0.lastFrameTime = jCurrentTimeMillis;
                this.this$0.stallWarningLogged = false;
                if (jCurrentTimeMillis - this.this$0.lastDiagnosticLogTime >= this.this$0.diagnosticLogIntervalMs) {
                    double d = (((double) this.this$0.diagnosticFrameCount) * 1000.0d) / ((jCurrentTimeMillis - this.this$0.lastDiagnosticLogTime) + 1);
                    int i2 = this.this$0.diagnosticFrameCount;
                    C56529yIt c56529yIt = C56529yIt.KWHzl;
                    String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    pUU.KWHzl("kyc_in_house", "Lca liveness - PreviewTextureView HEARTBEAT: received " + i2 + " surface updates, ~" + str + " FPS, previewStarted=" + this.this$0.isPreviewStarted.get());
                    this.this$0.diagnosticFrameCount = 0;
                    this.this$0.lastDiagnosticLogTime = jCurrentTimeMillis;
                }
                if (this.this$0.isPreviewStarted.get()) {
                    return;
                }
                this.this$0.frameUpdateCount++;
                if (this.this$0.frameUpdateCount < 5 || !this.this$0.isPreviewStarted.compareAndSet(false, true)) {
                    return;
                }
                pUU.EZpvd(PreviewTextureView.TAG, "Lca liveness - Preview is now visible on UI");
                this.this$0.onPreviewDisplayed();
                PreviewTextureView.OnPreviewDisplayedListener onPreviewDisplayedListener = this.this$0.previewDisplayedListener;
                if (onPreviewDisplayedListener != null) {
                    onPreviewDisplayedListener.onPreviewDisplayed();
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                Intrinsics.checkNotNullParameter(surfaceTexture, "");
                this.this$0.initializeSurface(surfaceTexture, i2, i3);
                this.this$0.setAspectRatio(i2, i3);
                this.this$0.resetPreviewState();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                Intrinsics.checkNotNullParameter(surfaceTexture, "");
                pUU.EZpvd(PreviewTextureView.TAG, "Lca liveness - Surface destroyed");
                this.this$0.releaseSurface();
                return true;
            }
        };
        setOpaque(true);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.components.PreviewTextureView.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void setAspectRatio(int i, int i2) {
        if (C42459rTq.KWHzl.djBIcL()) {
            this.ratioWidth = i;
            this.ratioHeight = i2;
            requestLayout();
        }
    }

    public final void initPreview(@NotNull OpenGLRenderer openGLRenderer) {
        Intrinsics.checkNotNullParameter(openGLRenderer, "");
        pUU.EZpvd(TAG, "Lca liveness - initPreview");
        releaseSurface();
        this.renderer = openGLRenderer;
        resetPreviewState();
        if (isAvailable()) {
            pUU.EZpvd(TAG, "Lca liveness - Surface is already available, initializing now");
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            if (surfaceTexture != null) {
                initializeSurface(surfaceTexture, getWidth(), getHeight());
            } else {
                pUU.valueOf(TAG, "Lca liveness - Surface texture is null despite being available");
                this.isPendingInitialization = true;
            }
        } else {
            pUU.EZpvd(TAG, "Lca liveness - Surface not yet available, pending initialization");
            this.isPendingInitialization = true;
        }
        setSurfaceTextureListener(this.surfaceTextureListenerImpl);
    }

    public final void resetPreviewState() {
        this.isPreviewStarted.set(false);
        this.frameUpdateCount = 0;
    }

    public final void onPreviewDisplayed() {
        try {
            pUU.EZpvd(TAG, "Lca liveness - Internal processing after preview is displayed");
        } catch (Exception e) {
            pUU.AEQbTJ(TAG, "Lca liveness - Error in internal preview display processing", e);
        }
    }

    public final void initializeSurface(SurfaceTexture surfaceTexture, int i, int i2) {
        try {
            Surface andSet = this.surfaceRef.getAndSet(null);
            if (andSet != null) {
                andSet.release();
            }
            surfaceTexture.setDefaultBufferSize(i, i2);
            Surface surface = new Surface(surfaceTexture);
            this.surfaceRef.set(surface);
            OpenGLRenderer openGLRenderer = this.renderer;
            if (openGLRenderer != null) {
                Size size = new Size(i, i2);
                Display display = getDisplay();
                openGLRenderer.attachPreviewSurface(surface, size, display != null ? DisplayExtKt.rotationDegrees(display) : 0);
            }
        } catch (Exception e) {
            pUU.AEQbTJ(TAG, "Lca liveness - Failed to initialize surface", e);
            Surface andSet2 = this.surfaceRef.getAndSet(null);
            if (andSet2 != null) {
                andSet2.release();
            }
        }
    }

    public final void releaseSurface() {
        if (this.isReleasingResources.compareAndSet(false, true)) {
            try {
                OpenGLRenderer openGLRenderer = this.renderer;
                if (openGLRenderer != null) {
                    try {
                        ListenableFuture<Void> listenableFutureDetachPreviewSurface = openGLRenderer.detachPreviewSurface();
                        if (listenableFutureDetachPreviewSurface != null) {
                            listenableFutureDetachPreviewSurface.addListener(new Runnable() { // from class: com.okinc.liveness.lca.components.PreviewTextureView$$ExternalSyntheticLambda0
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    PreviewTextureView.releaseSurface$lambda$2(this.f$0);
                                }
                            }, ContextCompat.getMainExecutor(getContext()));
                            Unit unit = Unit.INSTANCE;
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        pUU.OLrzqt(TAG, "Lca liveness - Failed to detach preview surface", e);
                        Surface andSet = this.surfaceRef.getAndSet(null);
                        if (andSet != null) {
                            andSet.release();
                        }
                        this.isReleasingResources.set(false);
                        Unit unit2 = Unit.INSTANCE;
                        return;
                    }
                }
                Surface andSet2 = this.surfaceRef.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.release();
                }
                this.isReleasingResources.set(false);
                Unit unit3 = Unit.INSTANCE;
                return;
            } catch (Exception e2) {
                pUU.OLrzqt(TAG, "Lca liveness - Failed to release surface", e2);
                this.isReleasingResources.set(false);
                Unit unit4 = Unit.INSTANCE;
                return;
            }
        }
        pUU.EZpvd(TAG, "Lca liveness - Surface release already in progress");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x0001 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.liveness.lca.components.PreviewTextureView */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: com.okinc.liveness.lca.components.PreviewTextureView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    public static final void releaseSurface$lambda$2(PreviewTextureView previewTextureView) {
        try {
            try {
                Surface andSet = previewTextureView.surfaceRef.getAndSet(null);
                if (andSet != null) {
                    andSet.release();
                }
            } catch (Exception e) {
                pUU.OLrzqt(TAG, "Lca liveness - Error releasing surface in callback", e);
            }
        } finally {
            previewTextureView.isReleasingResources.set(false);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (C42459rTq.KWHzl.djBIcL()) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int i3 = this.ratioWidth;
            int i4 = this.ratioHeight;
            int i5 = (size2 * i3) / i4;
            if (size < i5) {
                setMeasuredDimension(size, (i4 * size) / i3);
            } else {
                setMeasuredDimension(i5, size2);
            }
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        pUU.EZpvd(TAG, "Lca liveness - Detached from window");
        cleanup();
        super.onDetachedFromWindow();
    }

    public final void cleanup() {
        pUU.EZpvd(TAG, "Lca liveness - cleanup");
        releaseSurface();
        resetPreviewState();
        this.previewDisplayedListener = null;
        this.renderer = null;
        setSurfaceTextureListener(null);
    }
}
