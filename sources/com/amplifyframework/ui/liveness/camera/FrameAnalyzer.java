package com.amplifyframework.ui.liveness.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import androidx.camera.video.AudioStats;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.amplifyframework.ui.liveness.ml.FaceOval;
import com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException;
import com.amplifyframework.ui.liveness.state.LivenessState;
import com.ibm.icu.text.DateFormat;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56424yEw;
import o.C56505yHw;
import o.C56529yIt;
import o.pUU;
import org.jetbrains.annotations.NotNull;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.support.common.TensorOperator;
import org.tensorflow.lite.support.common.ops.NormalizeOp;
import org.tensorflow.lite.support.image.ImageOperator;
import org.tensorflow.lite.support.image.ImageProcessor;
import org.tensorflow.lite.support.image.TensorImage;
import org.tensorflow.lite.support.image.ops.ResizeOp;
import org.tensorflow.lite.support.image.ops.Rot90Op;

/* JADX INFO: loaded from: classes2.dex */
public final class FrameAnalyzer implements ImageAnalysis.Analyzer {
    private static final long FRAME_STALL_THRESHOLD_MS = 500;
    private static final int HEARTBEAT_INTERVAL_FRAMES = 100;
    private static final String TAG = "awsLiveness";
    private Bitmap cachedBitmap;
    private FaceDetector faceDetector;
    private long lastFrameTimestamp;
    private final LivenessState livenessState;
    private long maxFrameGap;
    private long startTime;
    private final TensorImage tfImageBuffer;
    private ImageProcessor tfImageProcessor;
    private final Interpreter tfLite;
    private long totalFramesProcessed;
    private long totalFramesReceived;
    private long totalFramesSkipped;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public FrameAnalyzer(@NotNull Context context, @NotNull LivenessState livenessState) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(livenessState, "");
        this.livenessState = livenessState;
        this.tfLite = FaceDetector.Companion.loadModel(context);
        this.tfImageBuffer = new TensorImage(DataType.UINT8);
        this.faceDetector = new FaceDetector(livenessState);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.ui.liveness.camera.FrameAnalyzer.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(@NotNull ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.totalFramesReceived++;
        if (this.startTime == 0) {
            this.startTime = jCurrentTimeMillis;
            pUU.KWHzl("awsLiveness", "First frame received at " + jCurrentTimeMillis);
        }
        long j = this.lastFrameTimestamp;
        if (j > 0) {
            long j2 = jCurrentTimeMillis - j;
            if (j2 > this.maxFrameGap) {
                this.maxFrameGap = j2;
            }
            if (j2 > FRAME_STALL_THRESHOLD_MS) {
                pUU.valueOf("awsLiveness", "Frame stall detected: " + j2 + "ms since last frame (total received: " + this.totalFramesReceived + ")");
            }
        }
        this.lastFrameTimestamp = jCurrentTimeMillis;
        long j3 = this.totalFramesReceived;
        if (j3 % ((long) 100) == 0) {
            long j4 = jCurrentTimeMillis - this.startTime;
            double d = j4 > 0 ? (j3 * 1000.0d) / j4 : AudioStats.AUDIO_AMPLITUDE_NONE;
            long j5 = this.totalFramesProcessed;
            long j6 = this.totalFramesSkipped;
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            pUU.KWHzl("awsLiveness", "Heartbeat: frames=" + j3 + ", processed=" + j5 + ", skipped=" + j6 + ", fps=" + str + ", maxGap=" + this.maxFrameGap + DateFormat.MINUTE_SECOND);
        }
        if (this.cachedBitmap == null) {
            this.cachedBitmap = Bitmap.createBitmap(imageProxy.getWidth(), imageProxy.getHeight(), Bitmap.Config.ARGB_8888);
        }
        try {
            Bitmap bitmap = this.cachedBitmap;
            if (bitmap != null) {
                try {
                    bitmap.copyPixelsFromBuffer(imageProxy.getPlanes()[0].getBuffer());
                } catch (Exception e) {
                    this.livenessState.getOnSessionError().invoke(new FaceLivenessDetectionException.CrashCatchException("FrameAnalyzer copyPixelsFromBuffer", e), Boolean.TRUE);
                }
                if (this.livenessState.onFrameAvailable()) {
                    this.totalFramesProcessed++;
                    float[][][] fArr = new float[1][][];
                    float[][] fArr2 = new float[FaceDetector.NUM_BOXES][];
                    for (int i = 0; i < 896; i++) {
                        fArr2[i] = new float[16];
                    }
                    fArr[0] = fArr2;
                    int i2 = 1;
                    float[][][] fArr3 = new float[1][][];
                    float[][] fArr4 = new float[FaceDetector.NUM_BOXES][];
                    int i3 = 0;
                    while (i3 < 896) {
                        fArr4[i3] = new float[i2];
                        i3++;
                        i2 = 1;
                    }
                    fArr3[0] = fArr4;
                    Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(0, fArr), C56390yDp.OLrzqt(1, fArr3));
                    TensorImage tensorImage = this.tfImageBuffer;
                    tensorImage.load(this.cachedBitmap);
                    this.tfLite.runForMultipleInputsOutputs(new ByteBuffer[]{getImageProcessor(imageProxy.getImageInfo().getRotationDegrees()).process(tensorImage).getBuffer()}, mapGEmmrt);
                    List<FaceDetector.Detection> boundingBoxes = this.faceDetector.getBoundingBoxes(fArr, fArr3);
                    this.livenessState.onFrameFaceCountUpdate(boundingBoxes.size());
                    if (boundingBoxes.size() > 1) {
                        C56505yHw.KWHzl(imageProxy, null);
                        return;
                    }
                    FaceDetector.Detection detection = (FaceDetector.Detection) CollectionsKt___CollectionsKt.firstOrNull(boundingBoxes);
                    if (detection != null) {
                        FaceOval faceOval = FaceOval.INSTANCE;
                        this.livenessState.onFrameFaceUpdate(faceOval.convertMirroredRectangle(detection.getLocation(), LivenessCoordinator.TARGET_WIDTH), faceOval.convertMirroredLandmark(detection.getLeftEye(), LivenessCoordinator.TARGET_WIDTH), faceOval.convertMirroredLandmark(detection.getRightEye(), LivenessCoordinator.TARGET_WIDTH), faceOval.convertMirroredLandmark(detection.getMouth(), LivenessCoordinator.TARGET_WIDTH));
                    }
                } else {
                    this.totalFramesSkipped++;
                }
            }
            C56505yHw.KWHzl(imageProxy, null);
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, org.tensorflow.lite.support.image.ImageProcessor] */
    private final ImageProcessor getImageProcessor(int i) {
        ImageProcessor imageProcessor = this.tfImageProcessor;
        if (imageProcessor != null) {
            return imageProcessor;
        }
        int[] iArrShape = this.tfLite.getInputTensor(0).shape();
        Size size = new Size(iArrShape[2], iArrShape[1]);
        ?? Build = new ImageProcessor.Builder().add((ImageOperator) new ResizeOp(size.getHeight(), size.getWidth(), ResizeOp.ResizeMethod.NEAREST_NEIGHBOR)).add((ImageOperator) new Rot90Op((-i) / 90)).add((TensorOperator) new NormalizeOp(0.0f, 255.0f)).build();
        this.tfImageProcessor = Build;
        Intrinsics.copydefault((Object) Build);
        return Build;
    }
}
