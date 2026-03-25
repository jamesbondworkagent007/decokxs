package com.okinc.liveness.lca.camera;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.ibm.icu.text.DateFormat;
import com.okinc.liveness.lca.manager.LcaSdkManager;
import com.okinc.liveness.lca.utils.LcaMediaUtils;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56529yIt;
import o.pUU;
import o.yFL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class VideoEncoder {
    public static final String TAG = "LCA liveness - VideoEncoder";
    public final List<Integer> actualKeyFrameIndices;
    public int diagnosticFrameCount;
    public final long diagnosticLogIntervalMs;
    public MediaCodec encoder;
    public final Handler encoderHandler;
    public final HandlerThread encoderThread;
    public boolean encoding;
    public final MediaFormat format;
    public int frameIndexRef;
    public final int frameRate;
    public int framesSinceSyncRequest;
    public Surface inputSurface;
    public final List<Integer> insertFrameIndices;
    public final int keyframeInterval;
    public long lastDiagnosticLogTime;
    public long lastFrameTime;
    public SegmentedMuxer livenessMuxer;
    public long maxFrameGap;
    public final Function1<Long, Unit> onFrame;
    public final Function2<byte[], Long, Unit> onMuxedSegment;
    public final Function2<Long, File, Unit> onMuxerComplete;
    public final File outputFile;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 int)
  (r3v0 java.lang.String)
  (r4v0 int)
  (r5v0 int)
  (r6v0 int)
  (r7v0 java.io.File)
  (r8v0 kotlin.jvm.functions.Function1)
  (r9v0 kotlin.jvm.functions.Function2)
  (r10v0 kotlin.jvm.functions.Function2)
 A[MD:(int, int, java.lang.String, int, int, int, java.io.File, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit>, kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Long, kotlin.Unit>, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.io.File, kotlin.Unit>):void throws java.io.IOException (m)] call: com.okinc.liveness.lca.camera.VideoEncoder.<init>(int, int, java.lang.String, int, int, int, java.io.File, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ VideoEncoder(int i, int i2, String str, int i3, int i4, int i5, File file, Function1 function1, Function2 function2, Function2 function22, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, i3, i4, i5, file, function1, function2, function22);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getActualKeyFrameIndices() {
        return this.actualKeyFrameIndices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFrameIndexRef() {
        return this.frameIndexRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Surface getInputSurface() {
        return this.inputSurface;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getInsertFrameIndices() {
        return this.insertFrameIndices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputSurface(Surface surface) {
        this.inputSurface = surface;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.io.File, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Long, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public VideoEncoder(int i, int i2, String str, int i3, int i4, int i5, File file, Function1<? super Long, Unit> function1, Function2<? super byte[], ? super Long, Unit> function2, Function2<? super Long, ? super File, Unit> function22) throws IOException {
        this.frameRate = i4;
        this.keyframeInterval = i5;
        this.outputFile = file;
        this.onFrame = function1;
        this.onMuxedSegment = function2;
        this.onMuxerComplete = function22;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, i, i2);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", i3);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i4);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i5);
        Intrinsics.checkNotNullExpressionValue(mediaFormatCreateVideoFormat, "");
        this.format = mediaFormatCreateVideoFormat;
        HandlerThread handlerThread = new HandlerThread(TAG);
        handlerThread.start();
        this.encoderThread = handlerThread;
        Handler handler = new Handler(handlerThread.getLooper());
        this.encoderHandler = handler;
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
        mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        mediaCodecCreateEncoderByType.setCallback(new MediaCodec.Callback() { // from class: com.okinc.liveness.lca.camera.VideoEncoder$encoder$1$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.media.MediaCodec.Callback
            public void onInputBufferAvailable(MediaCodec mediaCodec, int i6) {
                Intrinsics.checkNotNullParameter(mediaCodec, "");
            }

            @Override // android.media.MediaCodec.Callback
            public void onOutputBufferAvailable(MediaCodec mediaCodec, int i6, MediaCodec.BufferInfo bufferInfo) {
                Intrinsics.checkNotNullParameter(mediaCodec, "");
                Intrinsics.checkNotNullParameter(bufferInfo, "");
                this.this$0.handleFrame(i6, bufferInfo);
            }

            @Override // android.media.MediaCodec.Callback
            public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
                Intrinsics.checkNotNullParameter(mediaCodec, "");
                Intrinsics.checkNotNullParameter(mediaFormat, "");
                pUU.EZpvd(VideoEncoder.TAG, "Output format changed: " + mediaFormat);
            }

            @Override // android.media.MediaCodec.Callback
            public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
                Intrinsics.checkNotNullParameter(mediaCodec, "");
                Intrinsics.checkNotNullParameter(codecException, "");
                pUU.AEQbTJ(VideoEncoder.TAG, "MediaCodec error", codecException);
            }
        }, handler);
        this.encoder = mediaCodecCreateEncoderByType;
        this.inputSurface = mediaCodecCreateEncoderByType.createInputSurface();
        this.insertFrameIndices = new ArrayList();
        this.actualKeyFrameIndices = new ArrayList();
        this.diagnosticLogIntervalMs = 5000L;
        MediaCodec mediaCodec = this.encoder;
        if (mediaCodec != null) {
            mediaCodec.start();
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.camera.VideoEncoder.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VideoEncoder create(@NotNull Context context, int i, int i2, @NotNull String str, int i3, int i4, int i5, @NotNull Function1<? super Long, Unit> function1, @NotNull Function2<? super byte[], ? super Long, Unit> function2, @NotNull Function2<? super Long, ? super File, Unit> function22) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function2, "");
            Intrinsics.checkNotNullParameter(function22, "");
            try {
                return new VideoEncoder(i, i2, str, i3, i4, i5, createTempOutputFile(context, str), function1, function2, function22, null);
            } catch (Exception unused) {
                return null;
            }
        }

        public final File createTempOutputFile(Context context, String str) throws IOException {
            String fileExtensionFromEncodeCodec = LcaMediaUtils.INSTANCE.getFileExtensionFromEncodeCodec(str);
            File file = new File(context.getExternalCacheDir(), "realTime");
            if (file.exists() && !file.isDirectory()) {
                yFL.AkhnZx(file);
            }
            if (!file.exists() && !file.mkdirs()) {
                throw new IOException("Failed to create directory: " + file.getAbsolutePath());
            }
            return new File(file, System.currentTimeMillis() + JwtUtilsKt.JWT_DELIMITER + fileExtensionFromEncodeCodec);
        }
    }

    public final void handleFrame(int i, @NotNull MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer outputBuffer;
        Intrinsics.checkNotNullParameter(bufferInfo, "");
        try {
            MediaCodec mediaCodec = this.encoder;
            if (mediaCodec != null && (outputBuffer = mediaCodec.getOutputBuffer(i)) != null && this.encoding) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.onFrame.invoke(Long.valueOf(jCurrentTimeMillis));
                int i2 = this.frameIndexRef + 1;
                this.frameIndexRef = i2;
                this.diagnosticFrameCount++;
                long j = this.lastFrameTime;
                if (j > 0) {
                    long j2 = jCurrentTimeMillis - j;
                    if (j2 > this.maxFrameGap) {
                        this.maxFrameGap = j2;
                    }
                    if (j2 > 500) {
                        pUU.valueOf("kyc_in_house", "Lca liveness - VideoEncoder STALL: " + j2 + "ms gap between encoded frames at frame " + i2);
                    }
                }
                this.lastFrameTime = jCurrentTimeMillis;
                if (jCurrentTimeMillis - this.lastDiagnosticLogTime >= this.diagnosticLogIntervalMs) {
                    int i3 = this.diagnosticFrameCount;
                    double d = (((double) i3) * 1000.0d) / (r11 + 1);
                    C56529yIt c56529yIt = C56529yIt.KWHzl;
                    String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    pUU.KWHzl("kyc_in_house", "Lca liveness - VideoEncoder HEARTBEAT: encoded " + i3 + " frames, ~" + str + " FPS, total: " + this.frameIndexRef + ", maxGap: " + this.maxFrameGap + DateFormat.MINUTE_SECOND);
                    this.diagnosticFrameCount = 0;
                    this.lastDiagnosticLogTime = jCurrentTimeMillis;
                    this.maxFrameGap = 0L;
                }
                if (LcaSdkManager.Companion.getInstance().getConfiguration().getDebugMode()) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    int i4 = this.framesSinceSyncRequest;
                    boolean z = (bufferInfo.flags & 1) != 0;
                    pUU.KWHzl(TAG, "current time: " + jCurrentTimeMillis2 + ", real frame time: " + jCurrentTimeMillis + ", frame index: " + i4 + ", isKeyFrame: " + z + ", total frame indices: " + this.frameIndexRef + ", ");
                }
                if ((bufferInfo.flags & 1) != 0) {
                    if (this.livenessMuxer == null) {
                        try {
                            File file = this.outputFile;
                            MediaCodec mediaCodec2 = this.encoder;
                            MediaFormat outputFormat = mediaCodec2 != null ? mediaCodec2.getOutputFormat() : null;
                            Intrinsics.copydefault(outputFormat);
                            this.livenessMuxer = new SegmentedMuxer(file, outputFormat, this.onMuxedSegment, this.onMuxerComplete);
                        } catch (IOException e) {
                            pUU.AEQbTJ(TAG, "Failed to create SegmentedMuxer", e);
                        }
                    }
                    this.actualKeyFrameIndices.add(Integer.valueOf(this.frameIndexRef));
                    this.framesSinceSyncRequest = 0;
                } else {
                    int i5 = this.framesSinceSyncRequest + 1;
                    this.framesSinceSyncRequest = i5;
                    if (i5 >= this.frameRate * this.keyframeInterval) {
                        this.insertFrameIndices.add(Integer.valueOf(this.frameIndexRef));
                        MediaCodec mediaCodec3 = this.encoder;
                        if (mediaCodec3 != null) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("request-sync", 0);
                            mediaCodec3.setParameters(bundle);
                        }
                        this.framesSinceSyncRequest = 0;
                    }
                }
                try {
                    SegmentedMuxer segmentedMuxer = this.livenessMuxer;
                    if (segmentedMuxer != null) {
                        segmentedMuxer.write(outputBuffer, bufferInfo);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e2) {
                    pUU.AEQbTJ(TAG, "Error writing to muxer", e2);
                    try {
                        SegmentedMuxer segmentedMuxer2 = this.livenessMuxer;
                        if (segmentedMuxer2 != null) {
                            segmentedMuxer2.stop();
                        }
                    } catch (Exception unused) {
                    }
                    this.livenessMuxer = null;
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            MediaCodec mediaCodec4 = this.encoder;
            if (mediaCodec4 != null) {
                mediaCodec4.releaseOutputBuffer(i, false);
            }
        } catch (IllegalStateException e3) {
            pUU.OLrzqt(TAG, "Failed to handle frame, encoder may be stopped", e3);
        } catch (Exception e4) {
            pUU.AEQbTJ(TAG, "Unexpected error handling frame", e4);
        }
    }

    public final void start() {
        this.encoderHandler.post(new Runnable() { // from class: com.okinc.liveness.lca.camera.VideoEncoder$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                VideoEncoder.start$lambda$6(this.f$0);
            }
        });
    }

    public static final void start$lambda$6(VideoEncoder videoEncoder) {
        if (!videoEncoder.encoding) {
            videoEncoder.encoding = true;
            if (LcaSdkManager.Companion.getInstance().getConfiguration().getDebugMode()) {
                pUU.KWHzl(TAG, "Starting to encode");
            }
            MediaCodec mediaCodec = videoEncoder.encoder;
            if (mediaCodec != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("request-sync", 0);
                mediaCodec.setParameters(bundle);
                return;
            }
            return;
        }
        pUU.KWHzl(TAG, "Encoding already started");
    }

    public final void stop() {
        if (LcaSdkManager.Companion.getInstance().getConfiguration().getDebugMode()) {
            pUU.KWHzl(TAG, "Stopping encoder");
        }
        if (!this.encoderThread.isAlive()) {
            cleanupResources();
            return;
        }
        try {
            this.encoderHandler.post(new Runnable() { // from class: com.okinc.liveness.lca.camera.VideoEncoder$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.cleanupResources();
                }
            });
        } catch (Exception e) {
            pUU.OLrzqt(TAG, "Failed to post cleanup task, cleaning up directly", e);
            cleanupResources();
        }
    }

    public final void cleanupResources() {
        try {
            try {
                SegmentedMuxer segmentedMuxer = this.livenessMuxer;
                if (segmentedMuxer != null) {
                    segmentedMuxer.stop();
                }
            } finally {
                this.livenessMuxer = null;
            }
        } catch (Exception e) {
            pUU.OLrzqt(TAG, "Error stopping muxer", e);
        }
        try {
            try {
                Surface surface = this.inputSurface;
                if (surface != null) {
                    surface.release();
                }
            } finally {
                this.inputSurface = null;
            }
        } catch (Exception e2) {
            pUU.OLrzqt(TAG, "Error releasing input surface", e2);
        }
        try {
            try {
                MediaCodec mediaCodec = this.encoder;
                if (mediaCodec != null) {
                    mediaCodec.stop();
                }
                MediaCodec mediaCodec2 = this.encoder;
                if (mediaCodec2 != null) {
                    mediaCodec2.release();
                }
            } catch (Exception e3) {
                pUU.OLrzqt(TAG, "Error stopping encoder", e3);
            }
            this.encoder = null;
            this.actualKeyFrameIndices.clear();
            this.insertFrameIndices.clear();
            this.encoding = false;
            this.frameIndexRef = 0;
            try {
                if (this.encoderThread.isAlive()) {
                    this.encoderThread.quitSafely();
                }
            } catch (Exception e4) {
                pUU.OLrzqt(TAG, "Error quitting encoder thread", e4);
            }
        } catch (Throwable th) {
            this.encoder = null;
            throw th;
        }
    }
}
