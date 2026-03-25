package com.amplifyframework.ui.liveness.camera;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.camera.video.AudioStats;
import com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder;
import com.amplifyframework.ui.liveness.common.LivenessEvent;
import com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException;
import com.amplifyframework.ui.liveness.util.ExtensionsKt;
import com.ibm.icu.text.DateFormat;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32866mlf;
import o.C32868mlh;
import o.C56529yIt;
import o.pUU;
import o.yFL;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LivenessVideoEncoder {
    private static final long ENCODER_STALL_THRESHOLD_MS = 500;
    private static final int HEARTBEAT_INTERVAL_FRAMES = 100;
    public static final boolean LOGGING_ENABLED = false;
    public static final int MAX_MUXER_CREATION_ATTEMPTS = 3;
    public static final String MIME_TYPE = "video/x-vnd.on2.vp8";
    public static final String TAG = "awsLiveness";
    private final MediaCodec encoder;
    private final Handler encoderHandler;
    private boolean encoding;
    private long encodingStartTime;
    private final MediaFormat format;
    private final int frameRate;
    private int framesSinceSyncRequest;
    private final Surface inputSurface;
    private final int keyframeInterval;
    private long lastEncodedFrameTime;
    private LivenessMuxer livenessMuxer;
    private long maxEncoderFrameGap;
    private int muxerCreationAttempts;
    private final yHO<File, MediaFormat, Function2<? super byte[], ? super Long, Unit>, LivenessMuxer> muxerFactory;
    private final Function1<MediaCodec.CodecException, Unit> onEncoderError;
    private final Function2<byte[], Long, Unit> onMuxedSegment;
    private final Function1<Exception, Unit> onMuxerError;
    private final Function2<FaceLivenessDetectionException, Boolean, Unit> onSessionError;
    private final File outputFile;
    private long totalEncodedFrames;
    private long totalKeyFrames;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 int)
  (r3v0 int)
  (r4v0 int)
  (r5v0 int)
  (r6v0 java.io.File)
  (r7v0 kotlin.jvm.functions.Function2)
  (r8v0 kotlin.jvm.functions.Function2)
  (r9v0 kotlin.jvm.functions.Function1)
  (r10v0 kotlin.jvm.functions.Function1)
  (r11v0 o.yHO)
 A[MD:(int, int, int, int, int, java.io.File, kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Long, kotlin.Unit>, kotlin.jvm.functions.Function2<? super com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException, ? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function1<? super android.media.MediaCodec$CodecException, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit>, o.yHO<? super java.io.File, ? super android.media.MediaFormat, ? super kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Long, kotlin.Unit>, com.amplifyframework.ui.liveness.camera.LivenessMuxer>):void throws java.io.IOException (m)] call: com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder.<init>(int, int, int, int, int, java.io.File, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, o.yHO):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LivenessVideoEncoder(int i, int i2, int i3, int i4, int i5, File file, Function2 function2, Function2 function22, Function1 function1, Function1 function12, yHO yho, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, file, function2, function22, function1, function12, yho);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFramesSinceSyncRequest() {
        return this.framesSinceSyncRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Surface getInputSurface() {
        return this.inputSurface;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMuxerCreationAttempts() {
        return this.muxerCreationAttempts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<FaceLivenessDetectionException, Boolean, Unit> getOnSessionError() {
        return this.onSessionError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFramesSinceSyncRequest(int i) {
        this.framesSinceSyncRequest = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMuxerCreationAttempts(int i) {
        this.muxerCreationAttempts = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: o.yHO<? super java.io.File, ? super android.media.MediaFormat, ? super kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Long, kotlin.Unit>, com.amplifyframework.ui.liveness.camera.LivenessMuxer> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Long, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function2<? super com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super android.media.MediaCodec$CodecException, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    private LivenessVideoEncoder(int i, int i2, int i3, int i4, int i5, File file, Function2<? super byte[], ? super Long, Unit> function2, Function2<? super FaceLivenessDetectionException, ? super Boolean, Unit> function22, Function1<? super MediaCodec.CodecException, Unit> function1, Function1<? super Exception, Unit> function12, yHO<? super File, ? super MediaFormat, ? super Function2<? super byte[], ? super Long, Unit>, LivenessMuxer> yho) throws IOException {
        this.frameRate = i4;
        this.keyframeInterval = i5;
        this.outputFile = file;
        this.onMuxedSegment = function2;
        this.onSessionError = function22;
        this.onEncoderError = function1;
        this.onMuxerError = function12;
        this.muxerFactory = yho;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/x-vnd.on2.vp8", i, i2);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", i3);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i4);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i5);
        Intrinsics.checkNotNullExpressionValue(mediaFormatCreateVideoFormat, "");
        this.format = mediaFormatCreateVideoFormat;
        HandlerThread handlerThread = new HandlerThread(TAG);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.encoderHandler = handler;
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/x-vnd.on2.vp8");
        mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        mediaCodecCreateEncoderByType.setCallback(new EncoderCallback(new LivenessVideoEncoder$encoder$1$1(this), function1), handler);
        Intrinsics.checkNotNullExpressionValue(mediaCodecCreateEncoderByType, "");
        this.encoder = mediaCodecCreateEncoderByType;
        Surface surfaceCreateInputSurface = mediaCodecCreateEncoderByType.createInputSurface();
        Intrinsics.checkNotNullExpressionValue(surfaceCreateInputSurface, "");
        this.inputSurface = surfaceCreateInputSurface;
        mediaCodecCreateEncoderByType.start();
        pUU.KWHzl(TAG, "Encoder initialized and started");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (r14v0 int)
  (r15v0 int)
  (r16v0 int)
  (r17v0 int)
  (r18v0 int)
  (r19v0 java.io.File)
  (r20v0 kotlin.jvm.functions.Function2)
  (r21v0 kotlin.jvm.functions.Function2)
  (r22v0 kotlin.jvm.functions.Function1)
  (r23v0 kotlin.jvm.functions.Function1)
  (wrap:o.yHO:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:46) call: com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder$$ExternalSyntheticLambda1.<init>():void type: CONSTRUCTOR) : (r24v0 o.yHO))
 A[MD:(int, int, int, int, int, java.io.File, kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Long, kotlin.Unit>, kotlin.jvm.functions.Function2<? super com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException, ? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function1<? super android.media.MediaCodec$CodecException, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit>, o.yHO<? super java.io.File, ? super android.media.MediaFormat, ? super kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Long, kotlin.Unit>, com.amplifyframework.ui.liveness.camera.LivenessMuxer>):void throws java.io.IOException (m)] (LINE:35) call: com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder.<init>(int, int, int, int, int, java.io.File, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, o.yHO):void type: THIS */
    public /* synthetic */ LivenessVideoEncoder(int i, int i2, int i3, int i4, int i5, File file, Function2 function2, Function2 function22, Function1 function1, Function1 function12, yHO yho, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, file, function2, function22, function1, function12, (i6 & 1024) != 0 ? new yHO() { // from class: com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return LivenessVideoEncoder._init_$lambda$0((File) obj, (MediaFormat) obj2, (Function2) obj3);
            }
        } : yho);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LivenessMuxer _init_$lambda$0(File file, MediaFormat mediaFormat, Function2 function2) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(mediaFormat, "");
        Intrinsics.checkNotNullParameter(function2, "");
        return new LivenessMuxer(file, mediaFormat, function2);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LivenessMuxer create$lambda$0(File file, MediaFormat mediaFormat, Function2 function2) {
            Intrinsics.checkNotNullParameter(file, "");
            Intrinsics.checkNotNullParameter(mediaFormat, "");
            Intrinsics.checkNotNullParameter(function2, "");
            return new LivenessMuxer(file, mediaFormat, function2);
        }

        public final LivenessVideoEncoder create(@NotNull File file, int i, int i2, int i3, int i4, int i5, @NotNull Function2<? super byte[], ? super Long, Unit> function2, @NotNull Function2<? super FaceLivenessDetectionException, ? super Boolean, Unit> function22, @NotNull Function1<? super MediaCodec.CodecException, Unit> function1, @NotNull Function1<? super Exception, Unit> function12, @NotNull yHO<? super File, ? super MediaFormat, ? super Function2<? super byte[], ? super Long, Unit>, LivenessMuxer> yho) {
            Intrinsics.checkNotNullParameter(file, "");
            Intrinsics.checkNotNullParameter(function2, "");
            Intrinsics.checkNotNullParameter(function22, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            Intrinsics.checkNotNullParameter(yho, "");
            try {
                return new LivenessVideoEncoder(i, i2, i3, i4, i5, createTempOutputFile(file), function2, function22, function1, function12, yho, null);
            } catch (Exception e) {
                pUU.KWHzl(LivenessVideoEncoder.TAG, "LivenessVideoEncoder create exception: " + e);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd(LivenessEvent.AWS_LIVENESS_ERROR_LOG, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder$Companion$$ExternalSyntheticLambda0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LivenessVideoEncoder.Companion.create$lambda$1(e, (EventParamsList) obj);
                    }
                });
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit create$lambda$1(Exception exc, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "msg", "LivenessVideoEncoder create exception: " + exc, false, 4, null);
            return Unit.INSTANCE;
        }

        private final File createTempOutputFile(File file) {
            File file2 = new File(file, "amplify_liveness_temp");
            if (file2.exists()) {
                yFL.AkhnZx(file2);
            }
            if (!file2.exists()) {
                file2.mkdir();
            }
            return new File(file2, String.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleFrame(int i, @NotNull MediaCodec.BufferInfo bufferInfo) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(bufferInfo, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ByteBuffer outputBuffer = this.encoder.getOutputBuffer(i);
            try {
                if (outputBuffer == null) {
                    pUU.KWHzl(TAG, "encoder.getOutputBuffer(outputBufferId) = null");
                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                    TrackChannel[] trackChannelArr = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length);
                    Function1 function1 = new Function1() { // from class: com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder$$ExternalSyntheticLambda3
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LivenessVideoEncoder.handleFrame$lambda$7$lambda$6((EventParamsList) obj);
                        }
                    };
                    str = LivenessEvent.AWS_LIVENESS_ERROR_LOG;
                    try {
                        C32866mlf.EZpvd(str, trackChannelArr, (Function1<? super EventParamsList, Unit>) function1);
                    } catch (IllegalStateException e) {
                        e = e;
                        pUU.KWHzl(TAG, "handleFrame e=" + e);
                        TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
                        C32866mlf.EZpvd(str, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder$$ExternalSyntheticLambda4
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LivenessVideoEncoder.handleFrame$lambda$8(e, (EventParamsList) obj);
                            }
                        });
                    }
                } else {
                    try {
                        if (this.encoding) {
                            this.totalEncodedFrames++;
                            if (this.encodingStartTime == 0) {
                                this.encodingStartTime = jCurrentTimeMillis;
                                pUU.KWHzl(TAG, "First encoded frame at " + jCurrentTimeMillis);
                            }
                            long j = this.lastEncodedFrameTime;
                            if (j > 0) {
                                long j2 = jCurrentTimeMillis - j;
                                if (j2 > this.maxEncoderFrameGap) {
                                    this.maxEncoderFrameGap = j2;
                                }
                                if (j2 > ENCODER_STALL_THRESHOLD_MS) {
                                    long j3 = this.totalEncodedFrames;
                                    long j4 = this.totalKeyFrames;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Encoder stall detected: ");
                                    str3 = "-";
                                    str2 = LivenessEvent.AWS_LIVENESS_ERROR_LOG;
                                    sb.append(j2);
                                    sb.append("ms since last frame (total: ");
                                    sb.append(j3);
                                    sb.append(", keyframes: ");
                                    sb.append(j4);
                                    sb.append(")");
                                    pUU.valueOf(TAG, sb.toString());
                                } else {
                                    str3 = "-";
                                    str2 = LivenessEvent.AWS_LIVENESS_ERROR_LOG;
                                }
                                this.lastEncodedFrameTime = jCurrentTimeMillis;
                                long j5 = this.totalEncodedFrames;
                                if (j5 % ((long) 100) == 0) {
                                    long j6 = jCurrentTimeMillis - this.encodingStartTime;
                                    double d = j6 > 0 ? (j5 * 1000.0d) / j6 : AudioStats.AUDIO_AMPLITUDE_NONE;
                                    long j7 = this.totalKeyFrames;
                                    C56529yIt c56529yIt = C56529yIt.KWHzl;
                                    String str4 = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                                    Intrinsics.checkNotNullExpressionValue(str4, "");
                                    pUU.KWHzl(TAG, "Encoder heartbeat: frames=" + j5 + ", keyframes=" + j7 + ", fps=" + str4 + ", maxGap=" + this.maxEncoderFrameGap + DateFormat.MINUTE_SECOND);
                                }
                                if (ExtensionsKt.isKeyFrame(bufferInfo)) {
                                    this.totalKeyFrames++;
                                    if (this.livenessMuxer == null) {
                                        createMuxer();
                                    }
                                    this.framesSinceSyncRequest = 0;
                                } else {
                                    int i2 = this.framesSinceSyncRequest + 1;
                                    this.framesSinceSyncRequest = i2;
                                    if (i2 >= this.frameRate * this.keyframeInterval) {
                                        MediaCodec mediaCodec = this.encoder;
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("request-sync", 0);
                                        mediaCodec.setParameters(bundle);
                                        this.framesSinceSyncRequest = 0;
                                    }
                                }
                                try {
                                    LivenessMuxer livenessMuxer = this.livenessMuxer;
                                    if (livenessMuxer != null) {
                                        livenessMuxer.write(outputBuffer, bufferInfo);
                                    }
                                } catch (Exception e2) {
                                    this.onSessionError.invoke(new FaceLivenessDetectionException.CrashCatchException("LivenessMuxer write", e2), Boolean.TRUE);
                                    pUU.KWHzl(TAG, "LivenessMuxer write current time: " + System.currentTimeMillis() + ", presentation time: " + bufferInfo.presentationTimeUs + ", isKeyFrame: " + ExtensionsKt.isKeyFrame(bufferInfo));
                                    int iCapacity = outputBuffer.capacity();
                                    int i3 = bufferInfo.offset;
                                    int i4 = bufferInfo.size;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("LivenessMuxer write ");
                                    sb2.append(iCapacity);
                                    String str5 = str3;
                                    sb2.append(str5);
                                    sb2.append(i3);
                                    sb2.append(str5);
                                    sb2.append(i4);
                                    pUU.KWHzl(TAG, sb2.toString());
                                }
                                str = str2;
                            }
                        } else {
                            str = LivenessEvent.AWS_LIVENESS_ERROR_LOG;
                        }
                    } catch (IllegalStateException e3) {
                        e = e3;
                        str2 = LivenessEvent.AWS_LIVENESS_ERROR_LOG;
                        str = str2;
                        pUU.KWHzl(TAG, "handleFrame e=" + e);
                        TrackChannel[] trackChannelArrCopydefault22 = C32868mlh.OLrzqt.copydefault();
                        C32866mlf.EZpvd(str, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault22, trackChannelArrCopydefault22.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder$$ExternalSyntheticLambda4
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LivenessVideoEncoder.handleFrame$lambda$8(e, (EventParamsList) obj);
                            }
                        });
                    }
                }
                this.encoder.releaseOutputBuffer(i, false);
            } catch (IllegalStateException e4) {
                e = e4;
                str = str2;
                pUU.KWHzl(TAG, "handleFrame e=" + e);
                TrackChannel[] trackChannelArrCopydefault222 = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd(str, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault222, trackChannelArrCopydefault222.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder$$ExternalSyntheticLambda4
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LivenessVideoEncoder.handleFrame$lambda$8(e, (EventParamsList) obj);
                    }
                });
            }
        } catch (IllegalStateException e5) {
            e = e5;
            str = LivenessEvent.AWS_LIVENESS_ERROR_LOG;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleFrame$lambda$7$lambda$6(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "msg", "encoder.getOutputBuffer(outputBufferId) = null", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleFrame$lambda$8(IllegalStateException illegalStateException, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "msg", "handleFrame e=" + illegalStateException, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void createMuxer() {
        this.muxerCreationAttempts++;
        try {
            yHO<File, MediaFormat, Function2<? super byte[], ? super Long, Unit>, LivenessMuxer> yho = this.muxerFactory;
            File file = this.outputFile;
            MediaFormat outputFormat = this.encoder.getOutputFormat();
            Intrinsics.checkNotNullExpressionValue(outputFormat, "");
            this.livenessMuxer = yho.invoke(file, outputFormat, (Function2<? super byte[], ? super Long, Unit>) this.onMuxedSegment);
        } catch (Exception e) {
            pUU.KWHzl(TAG, "Failed to create liveness muxer (attempt " + this.muxerCreationAttempts + "): " + e);
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd(LivenessEvent.AWS_LIVENESS_ERROR_LOG, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder$$ExternalSyntheticLambda5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LivenessVideoEncoder.createMuxer$lambda$9(this.f$0, e, (EventParamsList) obj);
                }
            });
            if (this.muxerCreationAttempts >= 3) {
                this.onMuxerError.invoke(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createMuxer$lambda$9(LivenessVideoEncoder livenessVideoEncoder, Exception exc, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "msg", "Failed to create liveness muxer (attempt " + livenessVideoEncoder.muxerCreationAttempts + "): " + exc, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void start() {
        this.encoderHandler.post(new Runnable() { // from class: com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                LivenessVideoEncoder.start$lambda$11(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$11(LivenessVideoEncoder livenessVideoEncoder) {
        if (livenessVideoEncoder.encoding) {
            return;
        }
        pUU.KWHzl(TAG, "Starting encoding");
        livenessVideoEncoder.encoding = true;
        livenessVideoEncoder.encodingStartTime = 0L;
        try {
            MediaCodec mediaCodec = livenessVideoEncoder.encoder;
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            mediaCodec.setParameters(bundle);
        } catch (Exception e) {
            pUU.KWHzl(TAG, "setParameters e=" + e);
        }
    }

    public final void stop(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.encoderHandler.post(new Runnable() { // from class: com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                LivenessVideoEncoder.stop$lambda$12(this.f$0, function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$12(LivenessVideoEncoder livenessVideoEncoder, Function0 function0) throws IOException {
        long jCurrentTimeMillis = livenessVideoEncoder.encodingStartTime > 0 ? System.currentTimeMillis() - livenessVideoEncoder.encodingStartTime : 0L;
        double d = jCurrentTimeMillis > 0 ? (livenessVideoEncoder.totalEncodedFrames * 1000.0d) / jCurrentTimeMillis : AudioStats.AUDIO_AMPLITUDE_NONE;
        long j = livenessVideoEncoder.totalEncodedFrames;
        long j2 = livenessVideoEncoder.totalKeyFrames;
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        pUU.KWHzl(TAG, "Stopping encoder: totalFrames=" + j + ", keyframes=" + j2 + ", duration=" + jCurrentTimeMillis + "ms, avgFps=" + str + ", maxGap=" + livenessVideoEncoder.maxEncoderFrameGap + DateFormat.MINUTE_SECOND);
        livenessVideoEncoder.encoding = false;
        LivenessMuxer livenessMuxer = livenessVideoEncoder.livenessMuxer;
        if (livenessMuxer != null) {
            livenessMuxer.stop();
        }
        livenessVideoEncoder.livenessMuxer = null;
        function0.invoke();
    }

    public final void destroy() {
        this.encoderHandler.post(new Runnable() { // from class: com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder$$ExternalSyntheticLambda6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                LivenessVideoEncoder.destroy$lambda$13(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroy$lambda$13(LivenessVideoEncoder livenessVideoEncoder) {
        pUU.KWHzl(TAG, "Destroying encoder");
        try {
            LivenessMuxer livenessMuxer = livenessVideoEncoder.livenessMuxer;
            if (livenessMuxer != null) {
                livenessMuxer.stop();
            }
            livenessVideoEncoder.livenessMuxer = null;
        } catch (Exception unused) {
        }
        try {
            livenessVideoEncoder.encoder.stop();
        } catch (Exception unused2) {
        }
        livenessVideoEncoder.encoder.release();
        pUU.KWHzl(TAG, "Encoder destroyed");
    }
}
