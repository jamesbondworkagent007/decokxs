package com.okinc.liveness.lca.camera;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.okinc.liveness.lca.debugtool.utils.LcaDebugChunkFileManager;
import com.okinc.liveness.lca.utils.LcaMediaUtils;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.pUU;
import o.yFI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SegmentedMuxer {
    public static final long SEGMENT_DURATION_MS = 800;
    public static final String TAG = "LCA liveness - SegmentedMuxer";
    public final MediaMuxer completeMuxer;
    public final int completeVideoTrack;
    public long lastKeyFrameTime;
    public final Function2<byte[], Long, Unit> onMuxedSegment;
    public final Function2<Long, File, Unit> onMuxerComplete;
    public final MediaFormat outputFormat;
    public File segmentFile;
    public MediaMuxer segmentMuxer;
    public long segmentStartTime;
    public int segmentVideoTrack;
    public final File tempOutputFile;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Long, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.io.File, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public SegmentedMuxer(@NotNull File file, @NotNull MediaFormat mediaFormat, @NotNull Function2<? super byte[], ? super Long, Unit> function2, @NotNull Function2<? super Long, ? super File, Unit> function22) throws IOException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(mediaFormat, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        this.tempOutputFile = file;
        this.outputFormat = mediaFormat;
        this.onMuxedSegment = function2;
        this.onMuxerComplete = function22;
        this.segmentVideoTrack = -1;
        File parentFile = file.getParentFile();
        if (!ensureDirectoryExists(parentFile)) {
            throw new IOException("Failed to create or access parent directory: " + (parentFile != null ? parentFile.getAbsolutePath() : null));
        }
        try {
            MediaMuxer mediaMuxer = new MediaMuxer(file.toString(), LcaMediaUtils.INSTANCE.getBestOutputFormatByEncodeCodec(mediaFormat.getString("mime")));
            this.completeMuxer = mediaMuxer;
            this.completeVideoTrack = mediaMuxer.addTrack(mediaFormat);
            mediaMuxer.start();
            createNewSegment();
        } catch (IOException e) {
            pUU.AEQbTJ(TAG, "Failed to initialize SegmentedMuxer", e);
            throw e;
        }
    }

    public final boolean ensureDirectoryExists(File file) {
        if (file == null) {
            pUU.copydefault(TAG, "Directory is null");
            return false;
        }
        if (file.exists()) {
            if (file.isDirectory()) {
                return true;
            }
            pUU.copydefault(TAG, "Path exists but is not a directory: " + file.getAbsolutePath());
            return false;
        }
        boolean zMkdirs = file.mkdirs();
        if (!zMkdirs) {
            pUU.copydefault(TAG, "Failed to create directory: " + file.getAbsolutePath());
        }
        return zMkdirs;
    }

    public final void createNewSegment() {
        try {
            File parentFile = this.tempOutputFile.getParentFile();
            if (!ensureDirectoryExists(parentFile)) {
                throw new IOException("Failed to create or access parent directory: " + (parentFile != null ? parentFile.getAbsolutePath() : null));
            }
            File file = new File(parentFile, LcaDebugChunkFileManager.CHUNK_PREFIX + System.currentTimeMillis() + ".mp4");
            this.segmentFile = file;
            pUU.EZpvd(TAG, "Creating new segment: " + file.getAbsolutePath());
            File file2 = this.segmentFile;
            Intrinsics.copydefault(file2);
            MediaMuxer mediaMuxer = new MediaMuxer(file2.getAbsolutePath(), LcaMediaUtils.INSTANCE.getBestOutputFormatByEncodeCodec(this.outputFormat.getString("mime")));
            this.segmentVideoTrack = mediaMuxer.addTrack(this.outputFormat);
            mediaMuxer.start();
            this.segmentMuxer = mediaMuxer;
            this.segmentStartTime = System.currentTimeMillis();
        } catch (IOException e) {
            pUU.AEQbTJ(TAG, "Error creating segment file or MediaMuxer", e);
            this.segmentMuxer = null;
            this.segmentFile = null;
        }
    }

    public final void endSegment() {
        StringBuilder sb;
        try {
            try {
                MediaMuxer mediaMuxer = this.segmentMuxer;
                if (mediaMuxer != null) {
                    mediaMuxer.stop();
                    mediaMuxer.release();
                }
                File file = this.segmentFile;
                if (file != null) {
                    if (file.exists() && file.length() > 0) {
                        try {
                            try {
                                this.onMuxedSegment.invoke(yFI.AhwBna(file), Long.valueOf(this.segmentStartTime));
                            } catch (Throwable th) {
                                if (!file.delete()) {
                                    pUU.valueOf(TAG, "Failed to delete segment file: " + file.getAbsolutePath());
                                }
                                throw th;
                            }
                        } catch (Exception e) {
                            pUU.AEQbTJ(TAG, "Error reading segment file", e);
                            if (!file.delete()) {
                                String absolutePath = file.getAbsolutePath();
                                sb = new StringBuilder();
                                sb.append("Failed to delete segment file: ");
                                sb.append(absolutePath);
                            }
                        }
                        if (!file.delete()) {
                            String absolutePath2 = file.getAbsolutePath();
                            sb = new StringBuilder();
                            sb.append("Failed to delete segment file: ");
                            sb.append(absolutePath2);
                            pUU.valueOf(TAG, sb.toString());
                        }
                    } else {
                        pUU.valueOf(TAG, "Segment file doesn't exist or is empty: " + file.getAbsolutePath());
                    }
                }
            } catch (Exception e2) {
                pUU.AEQbTJ(TAG, "Error ending segment", e2);
            }
        } finally {
            this.segmentMuxer = null;
            this.segmentFile = null;
        }
    }

    public final void write(@NotNull ByteBuffer byteBuffer, @NotNull MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        Intrinsics.checkNotNullParameter(bufferInfo, "");
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        try {
            this.completeMuxer.writeSampleData(this.completeVideoTrack, byteBuffer, bufferInfo);
            boolean z = true;
            if ((bufferInfo.flags & 1) == 0) {
                z = false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z) {
                pUU.KWHzl(TAG, "Keyframe detected at time " + jCurrentTimeMillis + ", last keyframe was at " + this.lastKeyFrameTime);
                this.lastKeyFrameTime = jCurrentTimeMillis;
                long j = jCurrentTimeMillis - this.segmentStartTime;
                if (j >= 800 && this.segmentMuxer != null) {
                    pUU.KWHzl(TAG, "Segment duration (" + j + " ms) exceeded limit (800 ms), creating new segment");
                    endSegment();
                    createNewSegment();
                } else if (this.segmentMuxer == null) {
                    createNewSegment();
                }
            }
            MediaMuxer mediaMuxer = this.segmentMuxer;
            if (mediaMuxer != null) {
                try {
                    mediaMuxer.writeSampleData(this.segmentVideoTrack, byteBufferDuplicate, bufferInfo);
                } catch (Exception e) {
                    pUU.OLrzqt(TAG, "Failed to write to segment muxer", e);
                    this.segmentMuxer = null;
                    this.segmentFile = null;
                }
            }
        } catch (Exception e2) {
            pUU.OLrzqt(TAG, "Error writing sample data", e2);
        }
    }

    public final void stop() {
        try {
            endSegment();
            try {
                MediaMuxer mediaMuxer = this.completeMuxer;
                mediaMuxer.stop();
                mediaMuxer.release();
                if (this.tempOutputFile.exists() && this.tempOutputFile.length() > 0) {
                    this.onMuxerComplete.invoke(Long.valueOf(System.currentTimeMillis()), this.tempOutputFile);
                } else {
                    pUU.valueOf(TAG, "Output file doesn't exist or is empty: " + this.tempOutputFile.getAbsolutePath());
                }
            } catch (Exception e) {
                pUU.AEQbTJ(TAG, "Error stopping complete muxer", e);
            }
        } catch (Exception e2) {
            pUU.AEQbTJ(TAG, "Failed to stop muxer", e2);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.camera.SegmentedMuxer.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
