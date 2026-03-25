package com.amplifyframework.ui.liveness.camera;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import androidx.camera.video.AudioStats;
import androidx.work.WorkRequest;
import com.amplifyframework.ui.liveness.common.LivenessEvent;
import com.ibm.icu.text.DateFormat;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32866mlf;
import o.C32868mlh;
import o.C56529yIt;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LivenessMuxer {
    private static final int HEARTBEAT_INTERVAL_FRAMES = 100;
    public static final long MIN_CHUNK_DELAY_MILLIS = 100;
    private static final long MUXER_STALL_THRESHOLD_MS = 500;
    private static final String TAG = "awsLiveness";
    private long currentBytePosition;
    private long currentVideoStartTime;
    private long lastChunkNotificationTimestamp;
    private long lastMuxedFrameTime;
    private long maxMuxerFrameGap;
    private final MediaMuxer muxer;
    private final RandomAccessFile muxerRandomAccessFile;
    private long muxerStartTime;
    private final Function2<byte[], Long, Unit> onMuxedSegment;
    private final File tempOutputFile;
    private long totalChunksSent;
    private long totalMuxedFrames;
    private final int videoTrack;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Long, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public LivenessMuxer(@NotNull File file, @NotNull MediaFormat mediaFormat, @NotNull Function2<? super byte[], ? super Long, Unit> function2) throws IOException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(mediaFormat, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.tempOutputFile = file;
        this.onMuxedSegment = function2;
        file.createNewFile();
        this.muxerRandomAccessFile = new RandomAccessFile(file, "r");
        MediaMuxer mediaMuxer = new MediaMuxer(file.toString(), 1);
        this.videoTrack = mediaMuxer.addTrack(mediaFormat);
        mediaMuxer.start();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.currentVideoStartTime = jCurrentTimeMillis;
        this.muxerStartTime = jCurrentTimeMillis;
        pUU.KWHzl("awsLiveness", "Muxer initialized: outputFile=" + file.getAbsolutePath());
        this.muxer = mediaMuxer;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.ui.liveness.camera.LivenessMuxer.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void write(@NotNull ByteBuffer byteBuffer, @NotNull MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        Intrinsics.checkNotNullParameter(bufferInfo, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.totalMuxedFrames + 1;
        this.totalMuxedFrames = j;
        long j2 = this.lastMuxedFrameTime;
        if (j2 > 0) {
            long j3 = jCurrentTimeMillis - j2;
            if (j3 > this.maxMuxerFrameGap) {
                this.maxMuxerFrameGap = j3;
            }
            if (j3 > MUXER_STALL_THRESHOLD_MS) {
                pUU.valueOf("awsLiveness", "Muxer stall detected: " + j3 + "ms since last frame (total: " + j + ", chunks: " + this.totalChunksSent + ")");
            }
        }
        this.lastMuxedFrameTime = jCurrentTimeMillis;
        long j4 = this.totalMuxedFrames;
        if (j4 % ((long) 100) == 0) {
            long j5 = jCurrentTimeMillis - this.muxerStartTime;
            double d = j5 > 0 ? (j4 * 1000.0d) / j5 : AudioStats.AUDIO_AMPLITUDE_NONE;
            long j6 = this.totalChunksSent;
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            pUU.KWHzl("awsLiveness", "Muxer heartbeat: frames=" + j4 + ", chunks=" + j6 + ", fps=" + str + ", maxGap=" + this.maxMuxerFrameGap + "ms, fileSize=" + this.tempOutputFile.length());
        }
        if (System.currentTimeMillis() - this.lastChunkNotificationTimestamp >= 100 && notifyChunk()) {
            this.totalChunksSent++;
            this.lastChunkNotificationTimestamp = System.currentTimeMillis();
            this.currentVideoStartTime = System.currentTimeMillis();
        }
        if (bufferInfo.offset < 0 || bufferInfo.size == 0 || bufferInfo.presentationTimeUs < 0) {
            return;
        }
        this.muxer.writeSampleData(this.videoTrack, byteBuffer, bufferInfo);
    }

    public final void stop() throws IOException {
        long jCurrentTimeMillis = this.muxerStartTime > 0 ? System.currentTimeMillis() - this.muxerStartTime : 0L;
        double d = jCurrentTimeMillis > 0 ? (this.totalMuxedFrames * 1000.0d) / jCurrentTimeMillis : AudioStats.AUDIO_AMPLITUDE_NONE;
        long j = this.totalMuxedFrames;
        long j2 = this.totalChunksSent;
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        pUU.KWHzl("awsLiveness", "Stopping muxer: totalFrames=" + j + ", chunks=" + j2 + ", duration=" + jCurrentTimeMillis + "ms, avgFps=" + str + ", maxGap=" + this.maxMuxerFrameGap + DateFormat.MINUTE_SECOND);
        try {
            this.muxer.stop();
            this.muxer.release();
        } catch (Exception e) {
            pUU.valueOf("awsLiveness", "Muxer stop error: " + e);
        }
        pUU.KWHzl("awsLiveness", "LivenessMuxer stop length=" + this.tempOutputFile.length() + " path=" + this.tempOutputFile.getAbsolutePath());
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(LivenessEvent.AWS_LIVENESS_UI_LOG, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.amplifyframework.ui.liveness.camera.LivenessMuxer$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LivenessMuxer.stop$lambda$2(this.f$0, (EventParamsList) obj);
            }
        });
        if (notifyChunk()) {
            this.totalChunksSent++;
        }
        this.muxerRandomAccessFile.close();
        this.tempOutputFile.delete();
        pUU.KWHzl("awsLiveness", "Muxer stopped: totalChunksSent=" + this.totalChunksSent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit stop$lambda$2(LivenessMuxer livenessMuxer, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "msg", "LivenessMuxer stop length=" + livenessMuxer.tempOutputFile.length() + " path=" + livenessMuxer.tempOutputFile.getAbsolutePath(), false, 4, null);
        return Unit.INSTANCE;
    }

    private final boolean notifyChunk() {
        try {
            RandomAccessFile randomAccessFile = this.muxerRandomAccessFile;
            try {
                long length = randomAccessFile.length();
                long j = this.currentBytePosition;
                long j2 = length - j;
                if (j2 > 0 && (j != 0 || j2 >= WorkRequest.MIN_BACKOFF_MILLIS)) {
                    byte[] bArr = new byte[(int) j2];
                    randomAccessFile.seek(j);
                    randomAccessFile.read(bArr);
                    this.currentBytePosition += j2;
                    this.onMuxedSegment.invoke(bArr, Long.valueOf(this.currentVideoStartTime));
                    return true;
                }
                return false;
            } catch (Exception e) {
                pUU.KWHzl("awsLiveness", "notifyChunk error1=" + e);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd(LivenessEvent.AWS_LIVENESS_ERROR_LOG, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.amplifyframework.ui.liveness.camera.LivenessMuxer$$ExternalSyntheticLambda0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LivenessMuxer.notifyChunk$lambda$4$lambda$3(e, (EventParamsList) obj);
                    }
                });
                return false;
            }
        } catch (Exception e2) {
            pUU.KWHzl("awsLiveness", "notifyChunk error2=" + e2);
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd(LivenessEvent.AWS_LIVENESS_ERROR_LOG, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.amplifyframework.ui.liveness.camera.LivenessMuxer$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LivenessMuxer.notifyChunk$lambda$5(e2, (EventParamsList) obj);
                }
            });
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit notifyChunk$lambda$4$lambda$3(Exception exc, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "msg", "notifyChunk error1=" + exc, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit notifyChunk$lambda$5(Exception exc, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "msg", "notifyChunk error2=" + exc, false, 4, null);
        return Unit.INSTANCE;
    }
}
