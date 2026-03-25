package com.okinc.liveness.lca.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import com.ibm.icu.text.DateFormat;
import com.okinc.liveness.lca.ai.FaceDetector;
import com.okinc.liveness.lca.manager.FaceCaptchaManager;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceQcConfig;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C56529yIt;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class FrameAnalyzer implements ImageAnalysis.Analyzer {
    public static final int $stable = 8;
    public final long analyzeInterval;
    public Bitmap cachedBitmap;
    public Size cachedFrameSize;
    public int diagnosticFrameCount;
    public final long diagnosticLogIntervalMs;
    public boolean enableQC;
    public FaceCaptchaManager faceCaptchaManager;
    public final FaceDetector faceDetector;
    public boolean freshness;
    public final ImageTransformer imageTransformer;
    public boolean isProcessingFrame;
    public boolean isSlowDevice;
    public long lastAnalysisTimestamp;
    public long lastDiagnosticLogTime;
    public long lastQcTimestamp;
    public long lastSkipLogTime;
    public final long normalQcInterval;
    public long qcInterval;
    public final long qcSlowThresholdMs;
    public int skippedDueToInterval;
    public int skippedDueToProcessing;
    public final long slowDeviceQcInterval;
    public int slowFrameCount;
    public long totalFramesReceived;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean shouldRunQcForFrame(long j) {
        if (!this.enableQC) {
            return false;
        }
        long j2 = this.lastQcTimestamp;
        if (j2 != 0 && j - j2 < this.qcInterval) {
            return false;
        }
        this.lastQcTimestamp = j;
        return true;
    }

    public FrameAnalyzer(@NotNull Context context, @NotNull FaceCaptchaManager faceCaptchaManager, boolean z, @NotNull LcaSdkLivenessConfig lcaSdkLivenessConfig) {
        Float faceQcDarkThreshold;
        Float faceQcBrightThreshold;
        Float faceQcBlockThreshold;
        Float faceQcBlurThreshold;
        Float faceQcOkThreshold;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(faceCaptchaManager, "");
        Intrinsics.checkNotNullParameter(lcaSdkLivenessConfig, "");
        this.faceCaptchaManager = faceCaptchaManager;
        this.enableQC = z;
        this.qcSlowThresholdMs = 80L;
        this.normalQcInterval = 80L;
        this.slowDeviceQcInterval = 500L;
        this.qcInterval = 80L;
        Float faceDetectionScoreThreshold = lcaSdkLivenessConfig.getFaceDetectionConfig().getFaceDetectionScoreThreshold();
        Intrinsics.copydefault(faceDetectionScoreThreshold);
        float fFloatValue = faceDetectionScoreThreshold.floatValue();
        Float faceQcOkThreshold2 = lcaSdkLivenessConfig.getFaceQcConfig().getFaceQcOkThreshold();
        Intrinsics.copydefault(faceQcOkThreshold2);
        float fFloatValue2 = faceQcOkThreshold2.floatValue();
        Float faceQcBlurThreshold2 = lcaSdkLivenessConfig.getFaceQcConfig().getFaceQcBlurThreshold();
        Intrinsics.copydefault(faceQcBlurThreshold2);
        float fFloatValue3 = faceQcBlurThreshold2.floatValue();
        Float faceQcBlockThreshold2 = lcaSdkLivenessConfig.getFaceQcConfig().getFaceQcBlockThreshold();
        Intrinsics.copydefault(faceQcBlockThreshold2);
        float fFloatValue4 = faceQcBlockThreshold2.floatValue();
        Float faceQcBrightThreshold2 = lcaSdkLivenessConfig.getFaceQcConfig().getFaceQcBrightThreshold();
        Intrinsics.copydefault(faceQcBrightThreshold2);
        float fFloatValue5 = faceQcBrightThreshold2.floatValue();
        Float faceQcDarkThreshold2 = lcaSdkLivenessConfig.getFaceQcConfig().getFaceQcDarkThreshold();
        Intrinsics.copydefault(faceQcDarkThreshold2);
        float fFloatValue6 = faceQcDarkThreshold2.floatValue();
        LcaSdkLivenessConfigFaceQcConfig freshnessQcConfig = lcaSdkLivenessConfig.getFreshnessQcConfig();
        float fFloatValue7 = (freshnessQcConfig == null || (faceQcOkThreshold = freshnessQcConfig.getFaceQcOkThreshold()) == null) ? 1.0E-5f : faceQcOkThreshold.floatValue();
        LcaSdkLivenessConfigFaceQcConfig freshnessQcConfig2 = lcaSdkLivenessConfig.getFreshnessQcConfig();
        float fFloatValue8 = (freshnessQcConfig2 == null || (faceQcBlurThreshold = freshnessQcConfig2.getFaceQcBlurThreshold()) == null) ? 1.0f : faceQcBlurThreshold.floatValue();
        LcaSdkLivenessConfigFaceQcConfig freshnessQcConfig3 = lcaSdkLivenessConfig.getFreshnessQcConfig();
        float fFloatValue9 = (freshnessQcConfig3 == null || (faceQcBlockThreshold = freshnessQcConfig3.getFaceQcBlockThreshold()) == null) ? 1.0f : faceQcBlockThreshold.floatValue();
        LcaSdkLivenessConfigFaceQcConfig freshnessQcConfig4 = lcaSdkLivenessConfig.getFreshnessQcConfig();
        float fFloatValue10 = (freshnessQcConfig4 == null || (faceQcBrightThreshold = freshnessQcConfig4.getFaceQcBrightThreshold()) == null) ? 1.0f : faceQcBrightThreshold.floatValue();
        LcaSdkLivenessConfigFaceQcConfig freshnessQcConfig5 = lcaSdkLivenessConfig.getFreshnessQcConfig();
        this.faceDetector = new FaceDetector(context, z, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, fFloatValue6, fFloatValue7, fFloatValue8, fFloatValue9, fFloatValue10, (freshnessQcConfig5 == null || (faceQcDarkThreshold = freshnessQcConfig5.getFaceQcDarkThreshold()) == null) ? 1.0f : faceQcDarkThreshold.floatValue());
        this.analyzeInterval = 80L;
        this.imageTransformer = new ImageTransformer();
        this.diagnosticLogIntervalMs = 5000L;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(@NotNull ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.totalFramesReceived++;
        if (this.isProcessingFrame) {
            this.skippedDueToProcessing++;
            logFrameSkipIfNeeded(jCurrentTimeMillis, "still_processing");
            imageProxy.close();
            return;
        }
        if (jCurrentTimeMillis - this.lastAnalysisTimestamp < this.analyzeInterval) {
            this.skippedDueToInterval++;
            imageProxy.close();
            return;
        }
        this.lastAnalysisTimestamp = jCurrentTimeMillis;
        this.isProcessingFrame = true;
        int i = this.diagnosticFrameCount + 1;
        this.diagnosticFrameCount = i;
        this.skippedDueToProcessing = 0;
        this.skippedDueToInterval = 0;
        if (jCurrentTimeMillis - this.lastDiagnosticLogTime >= this.diagnosticLogIntervalMs) {
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf((((double) i) * 1000.0d) / (r8 + 1))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            pUU.KWHzl("kyc_in_house", "Lca liveness - FrameAnalyzer HEARTBEAT: analyzed " + i + " frames, ~" + str + " FPS, isSlowDevice=" + this.isSlowDevice);
            this.diagnosticFrameCount = 0;
            this.lastDiagnosticLogTime = jCurrentTimeMillis;
        }
        try {
            Bitmap bitmapEnsureCachedBitmap = ensureCachedBitmap(imageProxy);
            if (this.imageTransformer.convertImageToBitmap(imageProxy, bitmapEnsureCachedBitmap)) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                processFrame(bitmapEnsureCachedBitmap, this.freshness, shouldRunQcForFrame(jCurrentTimeMillis));
                if (System.currentTimeMillis() - jCurrentTimeMillis2 > this.qcSlowThresholdMs && this.enableQC) {
                    int i2 = this.slowFrameCount + 1;
                    this.slowFrameCount = i2;
                    if (i2 >= 3 && !this.isSlowDevice) {
                        this.isSlowDevice = true;
                        long j = this.slowDeviceQcInterval;
                        this.qcInterval = j;
                        pUU.KWHzl("FrameAnalyzer", "Detected slow device, reducing QC frequency to " + j + DateFormat.MINUTE_SECOND);
                    }
                }
            }
        } finally {
            imageProxy.close();
            this.isProcessingFrame = false;
        }
    }

    public final void logFrameSkipIfNeeded(long j, String str) {
        if (j - this.lastSkipLogTime > 3000) {
            int i = this.skippedDueToProcessing;
            if (i > 10) {
                pUU.valueOf("kyc_in_house", "Lca liveness - FrameAnalyzer SKIP WARNING: reason=" + str + ", skippedDueToProcessing=" + i + ", isProcessingFrame=" + this.isProcessingFrame + ", totalReceived=" + this.totalFramesReceived + " - possible blocking in processFrame!");
            }
            this.lastSkipLogTime = j;
        }
    }

    public final Bitmap ensureCachedBitmap(ImageProxy imageProxy) {
        int rotationDegrees = imageProxy.getImageInfo().getRotationDegrees();
        boolean z = rotationDegrees == 90 || rotationDegrees == 270;
        int height = z ? imageProxy.getHeight() : imageProxy.getWidth();
        int width = z ? imageProxy.getWidth() : imageProxy.getHeight();
        Size size = new Size(height, width);
        if (this.cachedBitmap == null || !Intrinsics.EZpvd(this.cachedFrameSize, size)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Bitmap bitmap = this.cachedBitmap;
            if (bitmap != null) {
                bitmap.recycle();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(height, width, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
            this.cachedBitmap = bitmapCreateBitmap;
            this.cachedFrameSize = size;
            pUU.KWHzl("FrameAnalyzer", "Created cached bitmap: " + height + "x" + width + ", took: " + (System.currentTimeMillis() - jCurrentTimeMillis) + DateFormat.MINUTE_SECOND);
        }
        Bitmap bitmap2 = this.cachedBitmap;
        Intrinsics.copydefault(bitmap2);
        return bitmap2;
    }

    public final void processFrame(Bitmap bitmap, boolean z, boolean z2) {
        System.currentTimeMillis();
        if (!this.faceCaptchaManager.onFrameAvailable()) {
            pUU.EZpvd("FrameAnalyzer", "Frame not available, skipping processing");
            return;
        }
        List<FaceDetector.Detection> boundingBoxes = this.faceDetector.getBoundingBoxes(bitmap, z, z2);
        if (boundingBoxes == null) {
            this.faceCaptchaManager.onFaceModelLoadFiled();
            pUU.valueOf("FrameAnalyzer", "Face model load failed");
            return;
        }
        this.faceCaptchaManager.onFramePreFaceUpdate(boundingBoxes.size());
        if (boundingBoxes.size() > 1) {
            return;
        }
        System.currentTimeMillis();
        FaceDetector.Detection detection = (FaceDetector.Detection) CollectionsKt___CollectionsKt.firstOrNull(boundingBoxes);
        if (detection != null) {
            RectF location = detection.getLocation();
            PointF pointF = new PointF(detection.getLeftEye().getX(), detection.getLeftEye().getY());
            PointF pointF2 = new PointF(detection.getRightEye().getX(), detection.getRightEye().getY());
            PointF pointF3 = new PointF(detection.getNose().getX(), detection.getNose().getY());
            PointF pointF4 = new PointF(detection.getMouth().getX(), detection.getMouth().getY());
            FaceDetector.QCLabel qcLabel = detection.getQcLabel();
            float qcScore = detection.getQcScore();
            FaceCaptchaManager faceCaptchaManager = this.faceCaptchaManager;
            if (detection.getNoQcCheck() || !z2) {
                qcLabel = FaceDetector.QCLabel.NO_QC;
            }
            faceCaptchaManager.onFrameFaceUpdate(location, pointF, pointF2, pointF3, pointF4, qcLabel, (detection.getNoQcCheck() || !z2) ? 0.0f : qcScore);
        }
    }

    public final void startFreshness() {
        this.freshness = true;
        pUU.KWHzl("FrameAnalyzer", "Freshness detection enabled");
    }

    public final void stopFreshness() {
        this.freshness = false;
        resetQcOptimization();
        pUU.KWHzl("FrameAnalyzer", "Freshness detection disabled");
    }

    public final void resetQcOptimization() {
        this.isSlowDevice = false;
        this.qcInterval = this.normalQcInterval;
        this.slowFrameCount = 0;
        pUU.KWHzl("FrameAnalyzer", "QC optimization settings reset");
    }

    public final void release() {
        Bitmap bitmap = this.cachedBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.cachedBitmap = null;
    }

    public static final class ImageTransformer {
        public final Matrix transformationMatrix = new Matrix();
        public int lastRotation = -1;
        public final Paint paint = new Paint(2);

        public final boolean convertImageToBitmap(@NotNull ImageProxy imageProxy, @NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(imageProxy, "");
            Intrinsics.checkNotNullParameter(bitmap, "");
            try {
                int rotationDegrees = imageProxy.getImageInfo().getRotationDegrees();
                if (this.lastRotation != rotationDegrees) {
                    updateTransformationMatrix(rotationDegrees);
                    this.lastRotation = rotationDegrees;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(imageProxy.getWidth(), imageProxy.getHeight(), Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
                bitmapCreateBitmap.copyPixelsFromBuffer(imageProxy.getPlanes()[0].getBuffer());
                Canvas canvas = new Canvas(bitmap);
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), this.transformationMatrix, true);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "");
                canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, (Paint) null);
                bitmapCreateBitmap.recycle();
                bitmapCreateBitmap2.recycle();
                return true;
            } catch (Exception e) {
                pUU.OLrzqt("FrameAnalyzer", "Error converting image", e);
                return false;
            }
        }

        public final void updateTransformationMatrix(int i) {
            this.transformationMatrix.reset();
            if (i != 0) {
                this.transformationMatrix.postRotate(i);
            }
            this.transformationMatrix.postScale(-1.0f, 1.0f);
        }
    }
}
