package com.amplifyframework.ui.liveness.camera;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Pair;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class OpenGLRenderer {
    private static final boolean DEBUG = false;
    private static final float[] DIRECTION_UP_ROT_0;
    private static final float[] DIRECTION_UP_ROT_180;
    private static final float[] DIRECTION_UP_ROT_270;
    private static final float[] DIRECTION_UP_ROT_90;
    private static final AtomicInteger RENDERER_COUNT;
    private static final String TAG = "OpenGLRenderer";
    private Function2<String, Exception, Unit> errorCallback;
    private Transformation mAdditionalTransformation;
    private Pair<Executor, Consumer<Long>> mFrameUpdateListener;
    private Transformation mOutputTransformation;
    private Size mPreviewSize;
    private SurfaceTexture mPreviewTexture;
    private Function1<String, Unit> onLog;
    private Size requestSize;
    private final SingleThreadHandlerExecutor mExecutor = new SingleThreadHandlerExecutor(String.format(Locale.US, "GLRenderer-%03d", Integer.valueOf(RENDERER_COUNT.incrementAndGet())), 0);
    private long mNativeContext = 0;
    private long mAdditionalContext = 0;
    private boolean mIsShutdown = false;
    private int mNumOutstandingSurfaces = 0;
    private int lastRendered = 0;
    private boolean flipVertical = false;

    public static native void closeAdditionalContext(long j);

    public static native void closeContext(long j);

    public static native int getTexName(long j);

    public static native long initAdditionalContext(long j);

    public static native long initContext();

    public static native boolean makeCurrent(long j);

    public static native boolean renderTexture(long j, long j2, @NonNull float[] fArr, boolean z, @NonNull float[] fArr2, int i);

    public static native void setViewPort(int i, int i2);

    public static native boolean setWindowSurface(long j, @Nullable Surface surface);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFlipVertical(boolean z) {
        this.flipVertical = z;
    }

    static {
        System.loadLibrary("liveness_opengl_renderer_jni");
        RENDERER_COUNT = new AtomicInteger(0);
        DIRECTION_UP_ROT_0 = new float[]{0.0f, -1.0f, 0.0f, 0.0f};
        DIRECTION_UP_ROT_90 = new float[]{1.0f, 0.0f, 0.0f, 0.0f};
        DIRECTION_UP_ROT_180 = new float[]{0.0f, 1.0f, 0.0f, 0.0f};
        DIRECTION_UP_ROT_270 = new float[]{-1.0f, 0.0f, 0.0f, 0.0f};
    }

    public OpenGLRenderer(Function2<String, Exception, Unit> function2, Function1<String, Unit> function1) {
        this.errorCallback = function2;
        this.onLog = function1;
    }

    public void attachInputPreview(@NonNull Preview preview) {
        preview.setSurfaceProvider(this.mExecutor, new Preview.SurfaceProvider() { // from class: com.amplifyframework.ui.liveness.camera.OpenGLRenderer$$ExternalSyntheticLambda4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.camera.core.Preview.SurfaceProvider
            public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
                this.f$0.lambda$attachInputPreview$1(surfaceRequest);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$attachInputPreview$1(SurfaceRequest surfaceRequest) {
        if (this.mIsShutdown) {
            surfaceRequest.willNotProvideSurface();
            return;
        }
        if (this.mNativeContext == 0) {
            this.mNativeContext = initContext();
        }
        if (this.mNativeContext == 0) {
            surfaceRequest.willNotProvideSurface();
            return;
        }
        Size resolution = surfaceRequest.getResolution();
        this.requestSize = resolution;
        final SurfaceTexture surfaceTextureResetPreviewTexture = resetPreviewTexture(resolution);
        final Surface surface = new Surface(surfaceTextureResetPreviewTexture);
        this.mNumOutstandingSurfaces++;
        surfaceRequest.provideSurface(surface, this.mExecutor, new Consumer() { // from class: com.amplifyframework.ui.liveness.camera.OpenGLRenderer$$ExternalSyntheticLambda13
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f$0.lambda$attachInputPreview$0(surface, surfaceTextureResetPreviewTexture, (SurfaceRequest.Result) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$attachInputPreview$0(Surface surface, SurfaceTexture surfaceTexture, SurfaceRequest.Result result) {
        surface.release();
        surfaceTexture.release();
        if (surfaceTexture == this.mPreviewTexture) {
            this.mPreviewTexture = null;
        }
        this.mNumOutstandingSurfaces--;
        doShutdownExecutorIfNeeded();
    }

    public void attachOutputSurface(@NonNull final Surface surface, @NonNull final Size size, final int i) {
        try {
            this.mExecutor.execute(new Runnable() { // from class: com.amplifyframework.ui.liveness.camera.OpenGLRenderer$$ExternalSyntheticLambda12
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$attachOutputSurface$2(surface, i, size);
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$attachOutputSurface$2(Surface surface, int i, Size size) {
        if (this.mIsShutdown) {
            return;
        }
        if (this.mNativeContext == 0) {
            this.mNativeContext = initContext();
        }
        if (this.mNativeContext == 0) {
            return;
        }
        this.mOutputTransformation = new Transformation();
        if (setWindowSurface(this.mNativeContext, surface)) {
            if (i != this.mOutputTransformation.mSurfaceRotationDegrees || !Objects.equals(size, this.mOutputTransformation.mSurfaceSize)) {
                this.mOutputTransformation.mMvpDirty = true;
            }
            this.mOutputTransformation.mSurfaceRotationDegrees = i;
            this.mOutputTransformation.mSurfaceSize = size;
            return;
        }
        this.mOutputTransformation.mSurfaceSize = null;
    }

    public void attachPreviewSurface(@NonNull final Surface surface, @NonNull final Size size, final int i) {
        try {
            this.mExecutor.execute(new Runnable() { // from class: com.amplifyframework.ui.liveness.camera.OpenGLRenderer$$ExternalSyntheticLambda5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$attachPreviewSurface$3(surface, i, size);
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$attachPreviewSurface$3(Surface surface, int i, Size size) {
        if (this.mIsShutdown) {
            return;
        }
        if (this.mAdditionalContext == 0) {
            this.mAdditionalContext = initAdditionalContext(this.mNativeContext);
        }
        if (this.mAdditionalContext == 0) {
            return;
        }
        this.mAdditionalTransformation = new Transformation();
        if (setWindowSurface(this.mAdditionalContext, surface)) {
            if (i != this.mAdditionalTransformation.mSurfaceRotationDegrees || !Objects.equals(size, this.mAdditionalTransformation.mSurfaceSize)) {
                this.mAdditionalTransformation.mMvpDirty = true;
            }
            this.mAdditionalTransformation.mSurfaceRotationDegrees = i;
            this.mAdditionalTransformation.mSurfaceSize = size;
            return;
        }
        this.mAdditionalTransformation.mSurfaceSize = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFrameUpdateListener$4(Executor executor, Consumer consumer) {
        this.mFrameUpdateListener = new Pair<>(executor, consumer);
    }

    public void setFrameUpdateListener(@NonNull final Executor executor, @NonNull final Consumer<Long> consumer) {
        try {
            this.mExecutor.execute(new Runnable() { // from class: com.amplifyframework.ui.liveness.camera.OpenGLRenderer$$ExternalSyntheticLambda10
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$setFrameUpdateListener$4(executor, consumer);
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    public void invalidateSurface(final int i) {
        try {
            this.mExecutor.execute(new Runnable() { // from class: com.amplifyframework.ui.liveness.camera.OpenGLRenderer$$ExternalSyntheticLambda3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$invalidateSurface$5(i);
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$invalidateSurface$5(int i) {
        if (i != this.mOutputTransformation.mSurfaceRotationDegrees) {
            this.mOutputTransformation.mMvpDirty = true;
        }
        this.mOutputTransformation.mSurfaceRotationDegrees = i;
        Transformation transformation = this.mAdditionalTransformation;
        if (transformation != null) {
            if (i != transformation.mSurfaceRotationDegrees) {
                this.mAdditionalTransformation.mMvpDirty = true;
            }
            this.mAdditionalTransformation.mSurfaceRotationDegrees = i;
        }
        if (this.mPreviewTexture == null || this.mIsShutdown) {
            return;
        }
        renderLatest();
    }

    public void invalidateOutputSurface(final int i) {
        try {
            this.mExecutor.execute(new Runnable() { // from class: com.amplifyframework.ui.liveness.camera.OpenGLRenderer$$ExternalSyntheticLambda8
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$invalidateOutputSurface$6(i);
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$invalidateOutputSurface$6(int i) {
        if (i != this.mOutputTransformation.mSurfaceRotationDegrees) {
            this.mOutputTransformation.mMvpDirty = true;
        }
        this.mOutputTransformation.mSurfaceRotationDegrees = i;
        if (this.mPreviewTexture == null || this.mIsShutdown) {
            return;
        }
        renderLatest();
    }

    public void invalidateAdditionalSurface(final int i) {
        if (this.mAdditionalTransformation == null) {
            return;
        }
        try {
            this.mExecutor.execute(new Runnable() { // from class: com.amplifyframework.ui.liveness.camera.OpenGLRenderer$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$invalidateAdditionalSurface$7(i);
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$invalidateAdditionalSurface$7(int i) {
        if (i != this.mAdditionalTransformation.mSurfaceRotationDegrees) {
            this.mAdditionalTransformation.mMvpDirty = true;
        }
        this.mAdditionalTransformation.mSurfaceRotationDegrees = i;
        if (this.mPreviewTexture == null || this.mIsShutdown) {
            return;
        }
        renderLatest();
    }

    public ListenableFuture<Void> detachOutputSurface() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: com.amplifyframework.ui.liveness.camera.OpenGLRenderer$$ExternalSyntheticLambda14
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.f$0.lambda$detachOutputSurface$9(completer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$detachOutputSurface$9(final CallbackToFutureAdapter.Completer completer) throws Exception {
        try {
            this.mExecutor.execute(new Runnable() { // from class: com.amplifyframework.ui.liveness.camera.OpenGLRenderer$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$detachOutputSurface$8(completer);
                }
            });
        } catch (RejectedExecutionException unused) {
            completer.set(null);
        }
        return "detachOutputSurface [" + this + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detachOutputSurface$8(CallbackToFutureAdapter.Completer completer) {
        if (!this.mIsShutdown) {
            long j = this.mNativeContext;
            if (j != 0) {
                setWindowSurface(j, null);
            }
            Transformation transformation = this.mOutputTransformation;
            if (transformation != null) {
                transformation.mSurfaceSize = null;
            }
        }
        completer.set(null);
    }

    public ListenableFuture<Void> detachPreviewSurface() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: com.amplifyframework.ui.liveness.camera.OpenGLRenderer$$ExternalSyntheticLambda6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.f$0.lambda$detachPreviewSurface$11(completer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$detachPreviewSurface$11(final CallbackToFutureAdapter.Completer completer) throws Exception {
        try {
            this.mExecutor.execute(new Runnable() { // from class: com.amplifyframework.ui.liveness.camera.OpenGLRenderer$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$detachPreviewSurface$10(completer);
                }
            });
        } catch (RejectedExecutionException unused) {
            completer.set(null);
        }
        return "detachOutputSurface [" + this + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detachPreviewSurface$10(CallbackToFutureAdapter.Completer completer) {
        if (!this.mIsShutdown) {
            long j = this.mAdditionalContext;
            if (j != 0) {
                setWindowSurface(j, null);
            }
            Transformation transformation = this.mAdditionalTransformation;
            if (transformation != null) {
                transformation.mSurfaceSize = null;
            }
        }
        completer.set(null);
    }

    public void shutdown() {
        try {
            this.mExecutor.execute(new Runnable() { // from class: com.amplifyframework.ui.liveness.camera.OpenGLRenderer$$ExternalSyntheticLambda9
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$shutdown$12();
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$shutdown$12() {
        if (!this.mIsShutdown) {
            long j = this.mNativeContext;
            if (j != 0) {
                closeContext(j);
            }
            long j2 = this.mAdditionalContext;
            if (j2 != 0) {
                closeAdditionalContext(j2);
            }
            this.mNativeContext = 0L;
            this.mAdditionalContext = 0L;
            this.mIsShutdown = true;
        }
        doShutdownExecutorIfNeeded();
    }

    private void doShutdownExecutorIfNeeded() {
        if (this.mIsShutdown && this.mNumOutstandingSurfaces == 0) {
            this.mFrameUpdateListener = null;
            this.mExecutor.shutdown();
        }
    }

    private SurfaceTexture resetPreviewTexture(@NonNull Size size) {
        Transformation transformation;
        SurfaceTexture surfaceTexture = this.mPreviewTexture;
        if (surfaceTexture != null) {
            surfaceTexture.detachFromGLContext();
        }
        SurfaceTexture surfaceTexture2 = new SurfaceTexture(getTexName(this.mNativeContext));
        this.mPreviewTexture = surfaceTexture2;
        surfaceTexture2.setDefaultBufferSize(size.getWidth(), size.getHeight());
        this.mPreviewTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.amplifyframework.ui.liveness.camera.OpenGLRenderer$$ExternalSyntheticLambda11
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                this.f$0.lambda$resetPreviewTexture$13(surfaceTexture3);
            }
        }, this.mExecutor.getHandler());
        if (!size.equals(this.mPreviewSize) && (transformation = this.mOutputTransformation) != null) {
            transformation.mMvpDirty = true;
        }
        this.mPreviewSize = size;
        return this.mPreviewTexture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetPreviewTexture$13(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != this.mPreviewTexture || this.mIsShutdown) {
            return;
        }
        makeCurrent(this.mNativeContext);
        try {
            surfaceTexture.updateTexImage();
        } catch (Exception e) {
            this.errorCallback.invoke("OpenGLRenderer updateTexImage", e);
        }
        renderLatest();
    }

    private void renderLatest() {
        boolean zRenderTexture;
        Pair<Executor, Consumer<Long>> pair;
        if (this.mOutputTransformation == null) {
            return;
        }
        try {
            final long timestamp = this.mPreviewTexture.getTimestamp();
            this.mPreviewTexture.getTransformMatrix(this.mOutputTransformation.mTextureTransform);
            Transformation transformation = this.mAdditionalTransformation;
            if (transformation != null) {
                this.mPreviewTexture.getTransformMatrix(transformation.mTextureTransform);
            }
            int textureRotationDegrees = getTextureRotationDegrees(this.mOutputTransformation);
            Transformation transformation2 = this.mOutputTransformation;
            if (textureRotationDegrees != transformation2.mTextureRotationDegrees) {
                transformation2.mMvpDirty = true;
            }
            this.mOutputTransformation.mTextureRotationDegrees = textureRotationDegrees;
            Transformation transformation3 = this.mAdditionalTransformation;
            if (transformation3 != null) {
                int textureRotationDegrees2 = getTextureRotationDegrees(transformation3);
                Transformation transformation4 = this.mAdditionalTransformation;
                if (textureRotationDegrees2 != transformation4.mTextureRotationDegrees) {
                    transformation4.mMvpDirty = true;
                }
                this.mAdditionalTransformation.mTextureRotationDegrees = textureRotationDegrees2;
            }
            if (this.mOutputTransformation.mMvpDirty) {
                updateMvpTransform(this.mOutputTransformation, false);
            }
            if (this.mOutputTransformation.mSurfaceSize != null) {
                setViewPort(this.mOutputTransformation.mSurfaceSize.getWidth(), this.mOutputTransformation.mSurfaceSize.getHeight());
                zRenderTexture = renderTexture(this.mNativeContext, timestamp, this.mOutputTransformation.mMvpTransform, this.mOutputTransformation.mMvpDirty || this.lastRendered != 1, this.mOutputTransformation.mTextureTransform, getTexName(this.mNativeContext));
                this.mOutputTransformation.mMvpDirty = false;
                this.lastRendered = 1;
            } else {
                zRenderTexture = false;
            }
            Transformation transformation5 = this.mAdditionalTransformation;
            if (transformation5 != null && transformation5.mSurfaceSize != null) {
                if (this.mAdditionalTransformation.mMvpDirty) {
                    updateMvpTransform(this.mAdditionalTransformation, true);
                }
                makeCurrent(this.mAdditionalContext);
                setViewPort(this.mAdditionalTransformation.mSurfaceSize.getWidth(), this.mAdditionalTransformation.mSurfaceSize.getHeight());
                renderTexture(this.mAdditionalContext, timestamp, this.mAdditionalTransformation.mMvpTransform, this.mAdditionalTransformation.mMvpDirty || this.lastRendered != 2, this.mAdditionalTransformation.mTextureTransform, getTexName(this.mAdditionalContext));
                this.lastRendered = 2;
                this.mAdditionalTransformation.mMvpDirty = false;
            }
            if (!zRenderTexture || (pair = this.mFrameUpdateListener) == null) {
                return;
            }
            Executor executor = pair.first;
            Objects.requireNonNull(executor);
            final Consumer<Long> consumer = this.mFrameUpdateListener.second;
            Objects.requireNonNull(consumer);
            try {
                executor.execute(new Runnable() { // from class: com.amplifyframework.ui.liveness.camera.OpenGLRenderer$$ExternalSyntheticLambda7
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        OpenGLRenderer.lambda$renderLatest$14(consumer, timestamp);
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        } catch (Exception e) {
            this.errorCallback.invoke("OpenGLRenderer renderLatest failed", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$renderLatest$14(Consumer consumer, long j) {
        consumer.accept(Long.valueOf(j));
    }

    private int getTextureRotationDegrees(Transformation transformation) {
        Matrix.multiplyMV(transformation.mTempVec, 0, transformation.mTextureTransform, 0, DIRECTION_UP_ROT_0, 0);
        float length = Matrix.length(transformation.mTempVec[0], transformation.mTempVec[1], 0.0f);
        int iRound = Math.round(transformation.mTempVec[0] / length);
        int iRound2 = Math.round(transformation.mTempVec[1] / length);
        if (iRound == 0 && iRound2 == 1) {
            return 0;
        }
        if (iRound == 1 && iRound2 == 0) {
            return 90;
        }
        if (iRound == 0 && iRound2 == -1) {
            return 180;
        }
        if (iRound == -1 && iRound2 == 0) {
            return SubsamplingScaleImageView.ORIENTATION_270;
        }
        throw new RuntimeException(String.format("Unexpected texture transform matrix. Expected test vector [0, 1] to rotate to [0,1], [1, 0], [0, -1] or [-1, 0], but instead was [%d, %d].", Integer.valueOf(iRound), Integer.valueOf(iRound2)));
    }

    private void extractPreviewCropFromPreviewSizeAndSurface(Transformation transformation) {
        if (this.mPreviewSize == null || transformation.mSurfaceSize == null) {
            return;
        }
        int viewPortRotation = getViewPortRotation(transformation);
        if (viewPortRotation == 90 || viewPortRotation == 270) {
            transformation.mCropRect = new RectF(0.0f, 0.0f, transformation.mSurfaceSize.getHeight(), transformation.mSurfaceSize.getWidth());
        } else {
            transformation.mCropRect = new RectF(0.0f, 0.0f, transformation.mSurfaceSize.getWidth(), transformation.mSurfaceSize.getHeight());
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRectToRect(transformation.mCropRect, new RectF(0.0f, 0.0f, this.mPreviewSize.getWidth(), this.mPreviewSize.getHeight()), Matrix.ScaleToFit.CENTER);
        matrix.mapRect(transformation.mCropRect);
    }

    private int getViewPortRotation(Transformation transformation) {
        return (transformation.mTextureRotationDegrees + transformation.mSurfaceRotationDegrees) % 360;
    }

    private void updateModelTransform(Transformation transformation, boolean z) {
        android.opengl.Matrix.setRotateM(transformation.mTempMatrix, 0, -transformation.mTextureRotationDegrees, 0.0f, 0.0f, 1.0f);
        android.opengl.Matrix.setIdentityM(transformation.mTempMatrix, 16);
        android.opengl.Matrix.translateM(transformation.mTempMatrix, 16, this.mPreviewSize.getWidth() / 2.0f, this.mPreviewSize.getHeight() / 2.0f, 0.0f);
        android.opengl.Matrix.scaleM(transformation.mTempMatrix, 16, this.mPreviewSize.getWidth() / 2.0f, this.mPreviewSize.getHeight() / 2.0f, 1.0f);
        if (this.flipVertical) {
            if (transformation.mSurfaceRotationDegrees == 90 || transformation.mSurfaceRotationDegrees == 270) {
                android.opengl.Matrix.scaleM(transformation.mTempMatrix, 16, -1.0f, 1.0f, 1.0f);
            } else {
                android.opengl.Matrix.scaleM(transformation.mTempMatrix, 16, 1.0f, -1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.multiplyMM(transformation.mModelTransform, 0, transformation.mTempMatrix, 16, transformation.mTempMatrix, 0);
    }

    private void updateViewTransform(Transformation transformation) {
        if (transformation.mCropRect == null) {
            this.onLog.invoke("OpenGLRenderer: mCropRect is null in updateViewTransform");
            return;
        }
        float[] fArr = DIRECTION_UP_ROT_0;
        int viewPortRotation = getViewPortRotation(transformation);
        if (viewPortRotation != 0) {
            if (viewPortRotation == 90) {
                fArr = DIRECTION_UP_ROT_90;
            } else if (viewPortRotation == 180) {
                fArr = DIRECTION_UP_ROT_180;
            } else if (viewPortRotation == 270) {
                fArr = DIRECTION_UP_ROT_270;
            }
        }
        android.opengl.Matrix.setLookAtM(transformation.mViewTransform, 0, transformation.mCropRect.centerX(), transformation.mCropRect.centerY(), 1.0f, transformation.mCropRect.centerX(), transformation.mCropRect.centerY(), 0.0f, fArr[0], fArr[1], fArr[2]);
    }

    private void updateProjectionTransform(Transformation transformation) {
        RectF rectF = transformation.mCropRect;
        if (rectF == null) {
            this.onLog.invoke("OpenGLRenderer: mCropRect is null in updateProjectionTransform");
            return;
        }
        float fWidth = rectF.width();
        float fHeight = transformation.mCropRect.height();
        if (fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        int viewPortRotation = getViewPortRotation(transformation);
        if (viewPortRotation == 90 || viewPortRotation == 270) {
            fWidth = transformation.mCropRect.height();
            fHeight = transformation.mCropRect.width();
        }
        android.opengl.Matrix.orthoM(transformation.mProjectionTransform, 0, (-fWidth) / 2.0f, fWidth / 2.0f, fHeight / 2.0f, (-fHeight) / 2.0f, 0.0f, 1.0f);
    }

    private void updateMvpTransform(Transformation transformation, boolean z) {
        try {
            extractPreviewCropFromPreviewSizeAndSurface(transformation);
            if (transformation.mCropRect == null) {
                this.onLog.invoke("OpenGLRenderer: Failed to initialize crop rect in updateMvpTransform");
                return;
            }
            updateModelTransform(transformation, z);
            updateViewTransform(transformation);
            updateProjectionTransform(transformation);
            android.opengl.Matrix.multiplyMM(transformation.mTempMatrix, 0, transformation.mViewTransform, 0, transformation.mModelTransform, 0);
            android.opengl.Matrix.multiplyMM(transformation.mMvpTransform, 0, transformation.mProjectionTransform, 0, transformation.mTempMatrix, 0);
        } catch (Exception e) {
            this.errorCallback.invoke("OpenGLRenderer updateMvpTransform failed", e);
        }
    }

    private static void printMatrix(String str, float[] fArr, int i) {
        String.format("%s:\n%.4f %.4f %.4f %.4f\n%.4f %.4f %.4f %.4f\n%.4f %.4f %.4f %.4f\n%.4f %.4f %.4f %.4f\n", str, Float.valueOf(fArr[i]), Float.valueOf(fArr[i + 4]), Float.valueOf(fArr[i + 8]), Float.valueOf(fArr[i + 12]), Float.valueOf(fArr[i + 1]), Float.valueOf(fArr[i + 5]), Float.valueOf(fArr[i + 9]), Float.valueOf(fArr[i + 13]), Float.valueOf(fArr[i + 2]), Float.valueOf(fArr[i + 6]), Float.valueOf(fArr[i + 10]), Float.valueOf(fArr[i + 14]), Float.valueOf(fArr[i + 3]), Float.valueOf(fArr[i + 7]), Float.valueOf(fArr[i + 11]), Float.valueOf(fArr[i + 15]));
    }

    public static final class SingleThreadHandlerExecutor implements Executor {
        private final Handler mHandler;
        private final HandlerThread mHandlerThread;
        private final String mThreadName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Handler getHandler() {
            return this.mHandler;
        }

        public SingleThreadHandlerExecutor(@NonNull String str, int i) {
            this.mThreadName = str;
            HandlerThread handlerThread = new HandlerThread(str, i);
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            this.mHandler = new Handler(handlerThread.getLooper());
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            if (this.mHandler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.mThreadName + " is shutting down.");
        }

        public boolean shutdown() {
            return this.mHandlerThread.quitSafely();
        }
    }

    public final class Transformation {
        RectF mCropRect;
        private final float[] mModelTransform;
        private boolean mMvpDirty;
        private final float[] mMvpTransform;
        private final float[] mProjectionTransform;
        private int mSurfaceRotationDegrees;
        private Size mSurfaceSize;
        private float[] mTempMatrix;
        private float[] mTempVec;
        int mTextureRotationDegrees;
        private final float[] mTextureTransform;
        private final float[] mViewTransform;

        private Transformation() {
            this.mTextureTransform = new float[16];
            this.mModelTransform = new float[16];
            this.mViewTransform = new float[16];
            this.mProjectionTransform = new float[16];
            this.mMvpTransform = new float[16];
            this.mMvpDirty = true;
            this.mSurfaceSize = null;
            this.mSurfaceRotationDegrees = 0;
            this.mTempVec = new float[4];
            this.mTempMatrix = new float[32];
        }
    }
}
