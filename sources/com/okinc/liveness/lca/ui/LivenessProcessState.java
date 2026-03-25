package com.okinc.liveness.lca.ui;

import com.okinc.liveness.lca.data.FaceCheckState;
import com.okinc.liveness.lca.debugtool.data.ColorEvent;
import com.okinc.liveness.lca.debugtool.data.LivenessResponse;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public abstract class LivenessProcessState {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.ui.LivenessProcessState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LivenessProcessState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class VideoRecordingStarted extends LivenessProcessState {
        public static final int $stable = 0;
        public static final VideoRecordingStarted INSTANCE = new VideoRecordingStarted();

        private VideoRecordingStarted() {
            super(null);
        }
    }

    private LivenessProcessState() {
    }

    public static final class FaceDistanceCheckStarted extends LivenessProcessState {
        public static final int $stable = 0;
        public final long timestamp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FaceDistanceCheckStarted copy$default(FaceDistanceCheckStarted faceDistanceCheckStarted, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = faceDistanceCheckStarted.timestamp;
            }
            return faceDistanceCheckStarted.copy(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FaceDistanceCheckStarted copy(long j) {
            return new FaceDistanceCheckStarted(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FaceDistanceCheckStarted) && this.timestamp == ((FaceDistanceCheckStarted) obj).timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FaceDistanceCheckStarted(timestamp=" + this.timestamp + ")";
        }

        public FaceDistanceCheckStarted(long j) {
            super(null);
            this.timestamp = j;
        }
    }

    public static final class FaceDistanceCheckEnded extends LivenessProcessState {
        public static final int $stable = 0;
        public final long timestamp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FaceDistanceCheckEnded copy$default(FaceDistanceCheckEnded faceDistanceCheckEnded, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = faceDistanceCheckEnded.timestamp;
            }
            return faceDistanceCheckEnded.copy(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FaceDistanceCheckEnded copy(long j) {
            return new FaceDistanceCheckEnded(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FaceDistanceCheckEnded) && this.timestamp == ((FaceDistanceCheckEnded) obj).timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FaceDistanceCheckEnded(timestamp=" + this.timestamp + ")";
        }

        public FaceDistanceCheckEnded(long j) {
            super(null);
            this.timestamp = j;
        }
    }

    public static final class FaceStateChanged extends LivenessProcessState {
        public static final int $stable = 0;
        public final Float distancePercentage;

        /* JADX INFO: renamed from: face, reason: collision with root package name */
        public final FaceCheckState f1040face;
        public final String qcLabel;
        public final Float qcScore;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FaceStateChanged copy$default(FaceStateChanged faceStateChanged, FaceCheckState faceCheckState, String str, Float f, Float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                faceCheckState = faceStateChanged.f1040face;
            }
            if ((i & 2) != 0) {
                str = faceStateChanged.qcLabel;
            }
            if ((i & 4) != 0) {
                f = faceStateChanged.qcScore;
            }
            if ((i & 8) != 0) {
                f2 = faceStateChanged.distancePercentage;
            }
            return faceStateChanged.copy(faceCheckState, str, f, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FaceCheckState component1() {
            return this.f1040face;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.qcLabel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Float component3() {
            return this.qcScore;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Float component4() {
            return this.distancePercentage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FaceStateChanged copy(@NotNull FaceCheckState faceCheckState, String str, Float f, Float f2) {
            Intrinsics.checkNotNullParameter(faceCheckState, "");
            return new FaceStateChanged(faceCheckState, str, f, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FaceStateChanged)) {
                return false;
            }
            FaceStateChanged faceStateChanged = (FaceStateChanged) obj;
            return Intrinsics.EZpvd(this.f1040face, faceStateChanged.f1040face) && Intrinsics.EZpvd((Object) this.qcLabel, (Object) faceStateChanged.qcLabel) && Intrinsics.EZpvd(this.qcScore, faceStateChanged.qcScore) && Intrinsics.EZpvd(this.distancePercentage, faceStateChanged.distancePercentage);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Float getDistancePercentage() {
            return this.distancePercentage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FaceCheckState getFace() {
            return this.f1040face;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getQcLabel() {
            return this.qcLabel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Float getQcScore() {
            return this.qcScore;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.f1040face.hashCode();
            String str = this.qcLabel;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            Float f = this.qcScore;
            int iHashCode3 = f == null ? 0 : f.hashCode();
            Float f2 = this.distancePercentage;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (f2 != null ? f2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FaceStateChanged(face=" + this.f1040face + ", qcLabel=" + this.qcLabel + ", qcScore=" + this.qcScore + ", distancePercentage=" + this.distancePercentage + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceStateChanged(@NotNull FaceCheckState faceCheckState, String str, Float f, Float f2) {
            super(null);
            Intrinsics.checkNotNullParameter(faceCheckState, "");
            this.f1040face = faceCheckState;
            this.qcLabel = str;
            this.qcScore = f;
            this.distancePercentage = f2;
        }
    }

    public static final class FarFaceOvalMatched extends LivenessProcessState {
        public static final int $stable = 0;
        public static final FarFaceOvalMatched INSTANCE = new FarFaceOvalMatched();

        private FarFaceOvalMatched() {
            super(null);
        }
    }

    public static final class FarFaceOvalAborted extends LivenessProcessState {
        public static final int $stable = 0;
        public static final FarFaceOvalAborted INSTANCE = new FarFaceOvalAborted();

        private FarFaceOvalAborted() {
            super(null);
        }
    }

    public static final class CloseFaceOvalMatched extends LivenessProcessState {
        public static final int $stable = 0;
        public static final CloseFaceOvalMatched INSTANCE = new CloseFaceOvalMatched();

        private CloseFaceOvalMatched() {
            super(null);
        }
    }

    public static final class FreshnessFirstTriggered extends LivenessProcessState {
        public static final int $stable = 0;
        public static final FreshnessFirstTriggered INSTANCE = new FreshnessFirstTriggered();

        private FreshnessFirstTriggered() {
            super(null);
        }
    }

    public static final class CloseFaceOvalAborted extends LivenessProcessState {
        public static final int $stable = 0;
        public static final CloseFaceOvalAborted INSTANCE = new CloseFaceOvalAborted();

        private CloseFaceOvalAborted() {
            super(null);
        }
    }

    public static final class FaceOvalInitialized extends LivenessProcessState {
        public static final int $stable = 0;
        public static final FaceOvalInitialized INSTANCE = new FaceOvalInitialized();

        private FaceOvalInitialized() {
            super(null);
        }
    }

    public static final class ColorChallengeStart extends LivenessProcessState {
        public static final int $stable = 0;
        public static final ColorChallengeStart INSTANCE = new ColorChallengeStart();

        private ColorChallengeStart() {
            super(null);
        }
    }

    public static final class ConfigurationReady extends LivenessProcessState {
        public static final int $stable = 0;
        public static final ConfigurationReady INSTANCE = new ConfigurationReady();

        private ConfigurationReady() {
            super(null);
        }
    }

    public static final class SocketConnected extends LivenessProcessState {
        public static final int $stable = 0;
        public final long duration;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SocketConnected copy$default(SocketConnected socketConnected, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = socketConnected.duration;
            }
            return socketConnected.copy(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.duration;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SocketConnected copy(long j) {
            return new SocketConnected(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SocketConnected) && this.duration == ((SocketConnected) obj).duration;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getDuration() {
            return this.duration;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Long.hashCode(this.duration);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SocketConnected(duration=" + this.duration + ")";
        }

        public SocketConnected(long j) {
            super(null);
            this.duration = j;
        }
    }

    public static final class ColorChanged extends LivenessProcessState {
        public static final int $stable = 0;
        public final long timestamp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ColorChanged copy$default(ColorChanged colorChanged, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colorChanged.timestamp;
            }
            return colorChanged.copy(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ColorChanged copy(long j) {
            return new ColorChanged(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ColorChanged) && this.timestamp == ((ColorChanged) obj).timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ColorChanged(timestamp=" + this.timestamp + ")";
        }

        public ColorChanged(long j) {
            super(null);
            this.timestamp = j;
        }
    }

    public static final class ColorChallengeComplete extends LivenessProcessState {
        public static final int $stable = 0;
        public final long endTimestamp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ColorChallengeComplete copy$default(ColorChallengeComplete colorChallengeComplete, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colorChallengeComplete.endTimestamp;
            }
            return colorChallengeComplete.copy(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.endTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ColorChallengeComplete copy(long j) {
            return new ColorChallengeComplete(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ColorChallengeComplete) && this.endTimestamp == ((ColorChallengeComplete) obj).endTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getEndTimestamp() {
            return this.endTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Long.hashCode(this.endTimestamp);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ColorChallengeComplete(endTimestamp=" + this.endTimestamp + ")";
        }

        public ColorChallengeComplete(long j) {
            super(null);
            this.endTimestamp = j;
        }
    }

    public static final class ColorChallengeCancelled extends LivenessProcessState {
        public static final int $stable = 0;
        public static final ColorChallengeCancelled INSTANCE = new ColorChallengeCancelled();

        private ColorChallengeCancelled() {
            super(null);
        }
    }

    public static final class ColorFreshnessStarted extends LivenessProcessState {
        public static final int $stable = 0;
        public static final ColorFreshnessStarted INSTANCE = new ColorFreshnessStarted();

        private ColorFreshnessStarted() {
            super(null);
        }
    }

    public static final class ColorFreshnessCompleted extends LivenessProcessState {
        public static final int $stable = 0;
        public static final ColorFreshnessCompleted INSTANCE = new ColorFreshnessCompleted();

        private ColorFreshnessCompleted() {
            super(null);
        }
    }

    public static final class Success extends LivenessProcessState {
        public static final int $stable = 8;
        public final LivenessResponse response;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Success copy$default(Success success, LivenessResponse livenessResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                livenessResponse = success.response;
            }
            return success.copy(livenessResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LivenessResponse component1() {
            return this.response;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Success copy(LivenessResponse livenessResponse) {
            return new Success(livenessResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.EZpvd(this.response, ((Success) obj).response);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LivenessResponse getResponse() {
            return this.response;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            LivenessResponse livenessResponse = this.response;
            if (livenessResponse == null) {
                return 0;
            }
            return livenessResponse.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Success(response=" + this.response + ")";
        }

        public Success(LivenessResponse livenessResponse) {
            super(null);
            this.response = livenessResponse;
        }
    }

    public static final class VideoSegmentReady extends LivenessProcessState {
        public static final int $stable = 8;
        public final byte[] bytes;
        public final long timestamp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ VideoSegmentReady copy$default(VideoSegmentReady videoSegmentReady, byte[] bArr, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                bArr = videoSegmentReady.bytes;
            }
            if ((i & 2) != 0) {
                j = videoSegmentReady.timestamp;
            }
            return videoSegmentReady.copy(bArr, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final byte[] component1() {
            return this.bytes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component2() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VideoSegmentReady copy(@NotNull byte[] bArr, long j) {
            Intrinsics.checkNotNullParameter(bArr, "");
            return new VideoSegmentReady(bArr, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final byte[] getBytes() {
            return this.bytes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "VideoSegmentReady(bytes=" + Arrays.toString(this.bytes) + ", timestamp=" + this.timestamp + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VideoSegmentReady(@NotNull byte[] bArr, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(bArr, "");
            this.bytes = bArr;
            this.timestamp = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.EZpvd(VideoSegmentReady.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.copydefault(obj, "");
            VideoSegmentReady videoSegmentReady = (VideoSegmentReady) obj;
            return Arrays.equals(this.bytes, videoSegmentReady.bytes) && this.timestamp == videoSegmentReady.timestamp;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.bytes) * 31) + Long.hashCode(this.timestamp);
        }
    }

    public static final class DescriptiveDataReady extends LivenessProcessState {
        public static final int $stable = 8;
        public final List<ColorEvent> colorDisplayList;
        public final String deviceToken;
        public final Map<String, Object> extras;
        public final long faceDistanceCheckDuration;
        public final int faceDistanceCheckEndIndex;
        public final int faceDistanceCheckStartIndex;
        public final long faceDistanceCheckStartTime;
        public final long videoEndTimestamp;
        public final long videoStartTimestamp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.videoStartTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component2() {
            return this.videoEndTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component3() {
            return this.faceDistanceCheckStartTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component4() {
            return this.faceDistanceCheckStartIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component5() {
            return this.faceDistanceCheckEndIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component6() {
            return this.faceDistanceCheckDuration;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<ColorEvent> component7() {
            return this.colorDisplayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.deviceToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Object> component9() {
            return this.extras;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DescriptiveDataReady copy(long j, long j2, long j3, int i, int i2, long j4, @NotNull List<ColorEvent> list, @NotNull String str, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new DescriptiveDataReady(j, j2, j3, i, i2, j4, list, str, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DescriptiveDataReady)) {
                return false;
            }
            DescriptiveDataReady descriptiveDataReady = (DescriptiveDataReady) obj;
            return this.videoStartTimestamp == descriptiveDataReady.videoStartTimestamp && this.videoEndTimestamp == descriptiveDataReady.videoEndTimestamp && this.faceDistanceCheckStartTime == descriptiveDataReady.faceDistanceCheckStartTime && this.faceDistanceCheckStartIndex == descriptiveDataReady.faceDistanceCheckStartIndex && this.faceDistanceCheckEndIndex == descriptiveDataReady.faceDistanceCheckEndIndex && this.faceDistanceCheckDuration == descriptiveDataReady.faceDistanceCheckDuration && Intrinsics.EZpvd(this.colorDisplayList, descriptiveDataReady.colorDisplayList) && Intrinsics.EZpvd((Object) this.deviceToken, (Object) descriptiveDataReady.deviceToken) && Intrinsics.EZpvd(this.extras, descriptiveDataReady.extras);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<ColorEvent> getColorDisplayList() {
            return this.colorDisplayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDeviceToken() {
            return this.deviceToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Object> getExtras() {
            return this.extras;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getFaceDistanceCheckDuration() {
            return this.faceDistanceCheckDuration;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getFaceDistanceCheckEndIndex() {
            return this.faceDistanceCheckEndIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getFaceDistanceCheckStartIndex() {
            return this.faceDistanceCheckStartIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getFaceDistanceCheckStartTime() {
            return this.faceDistanceCheckStartTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getVideoEndTimestamp() {
            return this.videoEndTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getVideoStartTimestamp() {
            return this.videoStartTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.videoStartTimestamp);
            int iHashCode2 = Long.hashCode(this.videoEndTimestamp);
            int iHashCode3 = Long.hashCode(this.faceDistanceCheckStartTime);
            int iHashCode4 = Integer.hashCode(this.faceDistanceCheckStartIndex);
            int iHashCode5 = Integer.hashCode(this.faceDistanceCheckEndIndex);
            int iHashCode6 = Long.hashCode(this.faceDistanceCheckDuration);
            int iHashCode7 = this.colorDisplayList.hashCode();
            int iHashCode8 = this.deviceToken.hashCode();
            Map<String, Object> map = this.extras;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (map == null ? 0 : map.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DescriptiveDataReady(videoStartTimestamp=" + this.videoStartTimestamp + ", videoEndTimestamp=" + this.videoEndTimestamp + ", faceDistanceCheckStartTime=" + this.faceDistanceCheckStartTime + ", faceDistanceCheckStartIndex=" + this.faceDistanceCheckStartIndex + ", faceDistanceCheckEndIndex=" + this.faceDistanceCheckEndIndex + ", faceDistanceCheckDuration=" + this.faceDistanceCheckDuration + ", colorDisplayList=" + this.colorDisplayList + ", deviceToken=" + this.deviceToken + ", extras=" + this.extras + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (r16v0 long)
  (r18v0 long)
  (r20v0 long)
  (r22v0 int)
  (r23v0 int)
  (r24v0 long)
  (r26v0 java.util.List)
  (r27v0 java.lang.String)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r28v0 java.util.Map))
 A[MD:(long, long, long, int, int, long, java.util.List<com.okinc.liveness.lca.debugtool.data.ColorEvent>, java.lang.String, java.util.Map<java.lang.String, ? extends java.lang.Object>):void (m)] (LINE:68) call: com.okinc.liveness.lca.ui.LivenessProcessState.DescriptiveDataReady.<init>(long, long, long, int, int, long, java.util.List, java.lang.String, java.util.Map):void type: THIS */
        public /* synthetic */ DescriptiveDataReady(long j, long j2, long j3, int i, int i2, long j4, List list, String str, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, i, i2, j4, list, str, (i3 & 256) != 0 ? null : map);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DescriptiveDataReady(long j, long j2, long j3, int i, int i2, long j4, @NotNull List<ColorEvent> list, @NotNull String str, Map<String, ? extends Object> map) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.videoStartTimestamp = j;
            this.videoEndTimestamp = j2;
            this.faceDistanceCheckStartTime = j3;
            this.faceDistanceCheckStartIndex = i;
            this.faceDistanceCheckEndIndex = i2;
            this.faceDistanceCheckDuration = j4;
            this.colorDisplayList = list;
            this.deviceToken = str;
            this.extras = map;
        }
    }
}
