package com.amplifyframework.ui.liveness.camera;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Display;
import android.view.Surface;
import android.view.TextureView;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import com.amplifyframework.ui.liveness.camera.PreviewTextureView;
import com.amplifyframework.ui.liveness.util.ExtensionsKt;
import com.ibm.icu.text.DateFormat;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56529yIt;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PreviewTextureView extends TextureView {
    private static final int HEARTBEAT_INTERVAL_FRAMES = 100;
    private static final long PREVIEW_STALL_THRESHOLD_MS = 500;
    private static final String TAG = "awsLiveness";
    private boolean hasReceivedUpdate;
    private long lastPreviewUpdateTime;
    private long maxPreviewGap;
    private long previewFrameCount;
    private long previewStartTime;
    private Surface surface;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasReceivedUpdate$OKCompliance_ok_compliance_dynamic_aws_impl() {
        return this.hasReceivedUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasReceivedUpdate$OKCompliance_ok_compliance_dynamic_aws_impl(boolean z) {
        this.hasReceivedUpdate = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewTextureView(@NotNull Context context, @NotNull OpenGLRenderer openGLRenderer) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(openGLRenderer, "");
        pUU.KWHzl("awsLiveness", "PreviewTextureView initialized");
        setSurfaceTextureListener(new AnonymousClass1(openGLRenderer, context));
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.ui.liveness.camera.PreviewTextureView.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.ui.liveness.camera.PreviewTextureView$1, reason: invalid class name */
    public static final class AnonymousClass1 implements TextureView.SurfaceTextureListener {
        final /* synthetic */ Context $context;
        final /* synthetic */ OpenGLRenderer $renderer;

        public AnonymousClass1(OpenGLRenderer openGLRenderer, Context context) {
            this.$renderer = openGLRenderer;
            this.$context = context;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "");
            pUU.KWHzl("awsLiveness", "Surface texture available: " + i + "x" + i2);
            PreviewTextureView.this.previewStartTime = System.currentTimeMillis();
            PreviewTextureView previewTextureView = PreviewTextureView.this;
            Surface surface = new Surface(surfaceTexture);
            OpenGLRenderer openGLRenderer = this.$renderer;
            PreviewTextureView previewTextureView2 = PreviewTextureView.this;
            Size size = new Size(i, i2);
            Display display = previewTextureView2.getDisplay();
            Intrinsics.checkNotNullExpressionValue(display, "");
            openGLRenderer.attachPreviewSurface(surface, size, ExtensionsKt.rotationDegrees(display));
            previewTextureView.surface = surface;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            PreviewTextureView.this.previewFrameCount++;
            if (!PreviewTextureView.this.getHasReceivedUpdate$OKCompliance_ok_compliance_dynamic_aws_impl()) {
                PreviewTextureView.this.setHasReceivedUpdate$OKCompliance_ok_compliance_dynamic_aws_impl(true);
                pUU.KWHzl("awsLiveness", "First preview frame received after " + (jCurrentTimeMillis - PreviewTextureView.this.previewStartTime) + DateFormat.MINUTE_SECOND);
            }
            if (PreviewTextureView.this.lastPreviewUpdateTime > 0) {
                long j = jCurrentTimeMillis - PreviewTextureView.this.lastPreviewUpdateTime;
                if (j > PreviewTextureView.this.maxPreviewGap) {
                    PreviewTextureView.this.maxPreviewGap = j;
                }
                if (j > PreviewTextureView.PREVIEW_STALL_THRESHOLD_MS) {
                    pUU.valueOf("awsLiveness", "Preview stall detected: " + j + "ms since last update (total frames: " + PreviewTextureView.this.previewFrameCount + ")");
                }
            }
            PreviewTextureView.this.lastPreviewUpdateTime = jCurrentTimeMillis;
            if (PreviewTextureView.this.previewFrameCount % ((long) 100) == 0) {
                long j2 = jCurrentTimeMillis - PreviewTextureView.this.previewStartTime;
                double d = j2 > 0 ? (PreviewTextureView.this.previewFrameCount * 1000.0d) / j2 : AudioStats.AUDIO_AMPLITUDE_NONE;
                long j3 = PreviewTextureView.this.previewFrameCount;
                C56529yIt c56529yIt = C56529yIt.KWHzl;
                String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                pUU.KWHzl("awsLiveness", "Preview heartbeat: frames=" + j3 + ", fps=" + str + ", maxGap=" + PreviewTextureView.this.maxPreviewGap + DateFormat.MINUTE_SECOND);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "");
            pUU.KWHzl("awsLiveness", "Surface texture size changed: " + i + "x" + i2);
            PreviewTextureView previewTextureView = PreviewTextureView.this;
            Surface surface = new Surface(surfaceTexture);
            OpenGLRenderer openGLRenderer = this.$renderer;
            PreviewTextureView previewTextureView2 = PreviewTextureView.this;
            Size size = new Size(i, i2);
            Display display = previewTextureView2.getDisplay();
            Intrinsics.checkNotNullExpressionValue(display, "");
            openGLRenderer.attachPreviewSurface(surface, size, ExtensionsKt.rotationDegrees(display));
            previewTextureView.surface = surface;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "");
            long jCurrentTimeMillis = PreviewTextureView.this.previewStartTime > 0 ? System.currentTimeMillis() - PreviewTextureView.this.previewStartTime : 0L;
            pUU.KWHzl("awsLiveness", "Surface texture destroyed: totalFrames=" + PreviewTextureView.this.previewFrameCount + ", duration=" + jCurrentTimeMillis + "ms, maxGap=" + PreviewTextureView.this.maxPreviewGap + DateFormat.MINUTE_SECOND);
            final Surface surface = PreviewTextureView.this.surface;
            PreviewTextureView.this.surface = null;
            this.$renderer.detachPreviewSurface().addListener(new Runnable() { // from class: com.amplifyframework.ui.liveness.camera.PreviewTextureView$1$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    PreviewTextureView.AnonymousClass1.onSurfaceTextureDestroyed$lambda$2(surface, surfaceTexture);
                }
            }, ContextCompat.getMainExecutor(this.$context));
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSurfaceTextureDestroyed$lambda$2(Surface surface, SurfaceTexture surfaceTexture) {
            if (surface != null) {
                surface.release();
            }
            surfaceTexture.release();
        }
    }
}
